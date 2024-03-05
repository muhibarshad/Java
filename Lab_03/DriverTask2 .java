// Interface Media
interface Media {
    void display();
}

class PrintMedia implements Media {
    protected String title;

    public PrintMedia(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Title: " + title);
    }
}

class SocialMedia implements Media {
    protected String title;

    public SocialMedia(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Title: " + title);
    }
}

class Book extends PrintMedia {
    private String name;
    private String ISBN;

    public Book(String name, String ISBN, String title) {
        super(title);
        this.name = name;
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void display() {
        super.display();
        System.out.println("Name: " + name);
        System.out.println("ISBN: " + ISBN);
    }
}

class Magazine extends PrintMedia {
    private String month;
    private int year;

    public Magazine(String month, int year, String title) {
        super(title);
        this.month = month;
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void display() {
        super.display();
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}

class Facebook extends SocialMedia {
    private String name;
    private String likes;

    public Facebook(String name, String likes, String title) {
        super(title);
        this.name = name;
        this.likes = likes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public String getLikes() {
        return likes;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Name: " + name);
        System.out.println("Likes: " + likes);
    }
}

class DriverTask2 {
    public static void main(String[] args) {
        Media[] mediaArray = new Media[10];

        mediaArray[0] = new Book("Java Programming", "978-0134670942", "Learning Java");
        mediaArray[1] = new Magazine("January", 2024, "Tech Monthly");
        mediaArray[2] = new Facebook("Facebook", "1000", "Facebook");

        for (Media media : mediaArray) {
            if (media != null) {
                media.display();
                System.out.println("------------------");
            }
        }
    }
}
