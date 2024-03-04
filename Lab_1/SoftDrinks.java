public class SoftDrinks {
        public static void main(String[] args) {
                int totalCust = 12467;
                float perWeekCustomers = totalCust * (14f / 100);
                float citrusFruitLovedCustomers = totalCust * (64f / 100);
                System.out.println(
                                "The approximate number of customers in the survey who purchase one or more energy drinks per week = "
                                                + perWeekCustomers);
                System.out.println(
                                "The approximate number of customers in the survey who prefer citrus flavored energy drinks = "
                                                + citrusFruitLovedCustomers);
        }
}