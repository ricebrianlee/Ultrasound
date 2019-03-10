package com.example.ultrasound.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    private static final List<DummyItem> ITEMS0 = new ArrayList<>();
    private static final List<DummyItem> ITEMS1 = new ArrayList<>();
    private static final List<DummyItem> ITEMS2 = new ArrayList<>();
    private static final List<DummyItem> INVALID_ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<>();

    private static final int[] COUNTS = {5, 10, 25};
    private static final int NUM_LISTS = 3;

    static {
        // Add some sample items.
        for (int j = 0; j <  NUM_LISTS; j++) {
            for (int i = 1; i <= COUNTS[j]; i++) {
                addItem(createDummyItem(i), j);
            }
        }
    }

    public static List<DummyItem> getList(int which) {
        switch(which) {
            case 0:
                return ITEMS0;
            case 1:
                return ITEMS1;
            case 2:
                return ITEMS2;
        }
        return INVALID_ITEMS;
    }

    private static void addItem(DummyItem item, int which) {
        getList(which).add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
