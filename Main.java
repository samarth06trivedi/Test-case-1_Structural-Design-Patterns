public class Main{
    public static void main(String[] args) {
        LegacyDatabase legacyDb = new LegacyDatabase();
        ModernDatabaseAdapter adapter = new ModernDatabaseAdapter(legacyDb);

        adapter.connectAndFetch();
    }
}
