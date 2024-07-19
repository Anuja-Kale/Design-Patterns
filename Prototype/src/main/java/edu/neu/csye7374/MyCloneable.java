package edu.neu.csye7374;

import java.util.HashMap;

import java.text.DecimalFormat;

public class MyCloneable implements Cloneable {
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static class MyCloneableItem extends MyCloneable {
	    private String name;
	    private double price;

	    private MyCloneableItem(Builder builder) {
	        this.name = builder.name;
	        this.price = builder.price;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public static class Builder {
	        private String name;
	        private double price;

	        public Builder setName(String name) {
	            this.name = name;
	            return this;
	        }

	        public Builder setPrice(double price) {
	            this.price = price;
	            return this;
	        }

	        public MyCloneableItem build() {
	            return new MyCloneableItem(this);
	        }
	    }
	}


	public static abstract class MyCloneableAbstractFactoryAPI {
		public abstract void load(int id, MyCloneable prototype);
		public abstract void load(HashMap<Integer, MyCloneable> prototypeList);
		public abstract MyCloneable getObject(int id);
	}

	public static class MyCloneableAbstractFactory extends MyCloneableAbstractFactoryAPI {
		private HashMap<Integer, MyCloneable> prototypes = new HashMap<>();
		@Override
		public void load(int id, MyCloneable prototype) {
			prototypes.put(id, prototype);
		}

		@Override
		public void load(HashMap<Integer, MyCloneable> prototypeList) {
			prototypes.putAll(prototypeList);
		}

		@Override
		public MyCloneable getObject(int id) {
			MyCloneable prototype = prototypes.get(id);
			if (prototype != null) {
				try {
					return (MyCloneable) prototype.clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
			return null;
		}
	}

	public static class MyCloneableAbstractFactorySingleton {
		private static MyCloneableAbstractFactory factory;
		public static MyCloneableAbstractFactory getFactory() {
			if (factory == null) {
				factory = new MyCloneableAbstractFactory();
			}
			return factory;
		}
	}

	public static void demo() {
        DecimalFormat df = new DecimalFormat("#.##");
        MyCloneableAbstractFactory factory = MyCloneableAbstractFactorySingleton.getFactory();

        for (int id = 1; id <= 26; id++) {
            char letter = (char) ('A' + id - 1);
            double price = 0.99 + id;
            MyCloneableItem item = new MyCloneableItem.Builder()
                                    .setName(String.valueOf(letter))
                                    .setPrice(price)
                                    .build();
            factory.load(id, item);
            String formattedPrice = df.format(price);
            System.out.println("ItemID: " + letter + ", Price: " + formattedPrice);
        }
        System.out.println("\n");

        for (int id = 1; id <= 26; id++) {
            MyCloneable clonedItem = factory.getObject(id);
            if (clonedItem instanceof MyCloneableItem) {
                MyCloneableItem item = (MyCloneableItem) clonedItem;
                System.out.println("Item ID: " + id + ", Name: " + item.getName() + ", Price: $" + item.getPrice());
            }
        }
    }
}
