// ModernDatabaseAdapter.java
public class ModernDatabaseAdapter {
    private LegacyDatabase legacyDatabase;

    public ModernDatabaseAdapter(LegacyDatabase legacyDatabase) {
        this.legacyDatabase = legacyDatabase;
    }

    public void connectAndFetch() {
        legacyDatabase.connect();
        legacyDatabase.fetchData();
    }
}
