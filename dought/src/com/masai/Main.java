package com.masai;

public class Main {
//	public static void main(String[] args) {
//		Item[] itr= Item.values();
//		for(Item item:itr){
//			System.out.println(item);
//			item.info();
//			
//		}
//	}

	
	enum Day{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		}
	
	public static void main(String args[]){
		Day day=Day.MONDAY;
		switch(day){
			case SUNDAY:
			System.out.println("sunday");
			break;
			case MONDAY:
			System.out.println("monday");
			break;
			default:
			System.out.println("other day");
		}
	}
}


