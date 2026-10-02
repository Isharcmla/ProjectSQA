package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AttributesTest {

    @Test
    public void testGet_existingKey_returnsValue() {
        Attributes attrs = new Attributes();
        attrs.put("href", "https://example.com");
        assertEquals("https://example.com", attrs.get("href"));
    }

    @Test
    public void testGet_caseSensitivity_returnsEmptyWhenCaseDiffers() {
        Attributes attrs = new Attributes();
        attrs.put("href", "https://example.com");
        assertEquals("", attrs.get("HREF"));
    }

    @Test
    public void testGet_nonExistentKey_returnsEmpty() {
        Attributes attrs = new Attributes();
        attrs.put("href", "https://example.com");
        assertEquals("", attrs.get("class"));
    }

    @Test
    public void testGet_uninitializedAttributes_returnsEmpty() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.get("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_nullKey_throwsException() {
        Attributes attrs = new Attributes();
        attrs.get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_emptyKey_throwsException() {
        Attributes attrs = new Attributes();
        attrs.get("");
    }

    @Test
    public void testGetIgnoreCase_existingKeyDifferentCase_returnsValue() {
        Attributes attrs = new Attributes();
        attrs.put("HREF", "https://example.com");
        assertEquals("https://example.com", attrs.getIgnoreCase("href"));
        assertEquals("https://example.com", attrs.getIgnoreCase("HREF"));
    }

    @Test
    public void testGetIgnoreCase_nonExistentKey_returnsEmpty() {
        Attributes attrs = new Attributes();
        attrs.put("href", "https://example.com");
        assertEquals("", attrs.getIgnoreCase("class"));
    }

    @Test
    public void testGetIgnoreCase_uninitializedAttributes_returnsEmpty() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.getIgnoreCase("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIgnoreCase_nullKey_throwsException() {
        Attributes attrs = new Attributes();
        attrs.getIgnoreCase(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIgnoreCase_emptyKey_throwsException() {
        Attributes attrs = new Attributes();
        attrs.getIgnoreCase("");
    }

    @Test
    public void testPut_stringKeyAndValue_addsOrUpdatesAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "val1");
        assertEquals("val1", attrs.get("key1"));

        attrs.put("key1", "val2");
        assertEquals("val2", attrs.get("key1"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPut_booleanTrue_addsBooleanAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("disabled", true);
        assertTrue(attrs.hasKey("disabled"));
        assertEquals("", attrs.get("disabled"));
    }

    @Test
    public void testPut_booleanFalse_removesAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("disabled", true);
        assertTrue(attrs.hasKey("disabled"));

        attrs.put("disabled", false);
        assertFalse(attrs.hasKey("disabled"));

        // Put false on non-existent key
        attrs.put("missing", false);
        assertFalse(attrs.hasKey("missing"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPut_nullAttribute_throwsException() {
        Attributes attrs = new Attributes();
        attrs.put(null);
    }

    @Test
    public void testRemove_existingKey_removesAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        attrs.remove("key");
        assertFalse(attrs.hasKey("key"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemove_uninitializedAttributes_doesNothing() {
        Attributes attrs = new Attributes();
        attrs.remove("key");
        assertEquals(0, attrs.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_nullKey_throwsException() {
        Attributes attrs = new Attributes();
        attrs.remove(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_emptyKey_throwsException() {
        Attributes attrs = new Attributes();
        attrs.remove("");
    }

    @Test
    public void testRemoveIgnoreCase_existingKeyDifferentCase_removesAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("HeAdEr", "val");
        attrs.removeIgnoreCase("header");
        assertFalse(attrs.hasKeyIgnoreCase("header"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemoveIgnoreCase_uninitializedAttributes_doesNothing() {
        Attributes attrs = new Attributes();
        attrs.removeIgnoreCase("header");
        assertEquals(0, attrs.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveIgnoreCase_nullKey_throwsException() {
        Attributes attrs = new Attributes();
        attrs.removeIgnoreCase(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveIgnoreCase_emptyKey_throwsException() {
        Attributes attrs = new Attributes();
        attrs.removeIgnoreCase("");
    }

    @Test
    public void testHasKey_variousCases() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.hasKey("key"));

        attrs.put("key", "value");
        assertTrue(attrs.hasKey("key"));
        assertFalse(attrs.hasKey("KEY"));
    }

    @Test
    public void testHasKeyIgnoreCase_variousCases() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.hasKeyIgnoreCase("key"));

        attrs.put("kEy", "value");
        assertTrue(attrs.hasKeyIgnoreCase("key"));
        assertTrue(attrs.hasKeyIgnoreCase("KEY"));
        assertTrue(attrs.hasKeyIgnoreCase("kEy"));
        assertFalse(attrs.hasKeyIgnoreCase("other"));
    }

    @Test
    public void testSize_tracksNumberOfAttributes() {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());

        attrs.put("a", "1");
        attrs.put("b", "2");
        assertEquals(2, attrs.size());

        attrs.remove("a");
        assertEquals(1, attrs.size());
    }

    @Test
    public void testAddAll_fromEmptyAndNonEmpty() {
        Attributes target = new Attributes();
        Attributes empty = new Attributes();
        target.addAll(empty);
        assertEquals(0, target.size());

        Attributes source = new Attributes();
        source.put("src1", "val1");
        source.put("src2", "val2");

        target.addAll(source);
        assertEquals(2, target.size());
        assertEquals("val1", target.get("src1"));
        assertEquals("val2", target.get("src2"));

        Attributes target2 = new Attributes();
        target2.put("targetOnly", "val3");
        target2.addAll(source);
        assertEquals(3, target2.size());
    }

    @Test
    public void testIterator_uninitializedAndPopulated() {
        Attributes attrs = new Attributes();
        Iterator<Attribute> it = attrs.iterator();
        assertFalse(it.hasNext());

        attrs.put("k1", "v1");
        attrs.put("k2", "v2");

        Iterator<Attribute> populatedIt = attrs.iterator();
        assertTrue(populatedIt.hasNext());
        assertEquals("k1", populatedIt.next().getKey());
        assertTrue(populatedIt.hasNext());
        assertEquals("k2", populatedIt.next().getKey());
        assertFalse(populatedIt.hasNext());
    }

    @Test
    public void testAsList_uninitializedAndPopulated() {
        Attributes attrs = new Attributes();
        List<Attribute> emptyList = attrs.asList();
        assertTrue(emptyList.isEmpty());

        attrs.put("k1", "v1");
        attrs.put("k2", "v2");

        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertEquals("k1", list.get(0).getKey());
        assertEquals("k2", list.get(1).getKey());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsList_isUnmodifiable() {
        Attributes attrs = new Attributes();
        attrs.put("k", "v");
        List<Attribute> list = attrs.asList();
        list.add(new Attribute("k2", "v2"));
    }

    @Test
    public void testDataset_operationsAndFiltering() {
        Attributes attrs = new Attributes();
        Map<String, String> dataset = attrs.dataset();

        assertEquals(0, dataset.size());
        assertNull(dataset.put("user-name", "John"));
        assertEquals("John", dataset.put("user-name", "Jane"));
        dataset.put("id", "123");

        assertEquals("Jane", attrs.get("data-user-name"));
        assertEquals("123", attrs.get("data-id"));

        attrs.put("class", "main"); // Non-data attribute

        assertEquals(2, dataset.size());

        Iterator<Map.Entry<String, String>> iter = dataset.entrySet().iterator();
        assertTrue(iter.hasNext());
        Map.Entry<String, String> entry1 = iter.next();
        assertEquals("user-name", entry1.getKey());
        assertEquals("Jane", entry1.getValue());

        assertTrue(iter.hasNext());
        Map.Entry<String, String> entry2 = iter.next();
        assertEquals("id", entry2.getKey());
        assertEquals("123", entry2.getValue());

        assertFalse(iter.hasNext());

        // Test iterator remove
        iter.remove(); // removes "data-id"
        assertFalse(attrs.hasKey("data-id"));
        assertEquals(1, dataset.size());
    }

    @Test
    public void testHtml_andToString() throws IOException {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.html());
        assertEquals("", attrs.toString());

        StringBuilder sb = new StringBuilder();
        attrs.html(sb, new Document("").outputSettings());
        assertEquals("", sb.toString());

        attrs.put("class", "primary");
        attrs.put("disabled", true);
        assertEquals(" class=\"primary\" disabled", attrs.html());
        assertEquals(" class=\"primary\" disabled", attrs.toString());

        sb = new StringBuilder();
        attrs.html(sb, new Document("").outputSettings());
        assertEquals(" class=\"primary\" disabled", sb.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Attributes a1 = new Attributes();
        Attributes a2 = new Attributes();

        // Same object
        assertTrue(a1.equals(a1));

        // Both uninitialized
        assertTrue(a1.equals(a2));
        assertEquals(a1.hashCode(), a2.hashCode());

        // Incompatible type
        assertFalse(a1.equals("string"));
        assertFalse(a1.equals(null));

        // One initialized/populated, other empty
        a1.put("k", "v");
        assertFalse(a1.equals(a2));
        assertFalse(a2.equals(a1));

        // Both populated identically
        a2.put("k", "v");
        assertTrue(a1.equals(a2));
        assertEquals(a1.hashCode(), a2.hashCode());

        // Different contents
        a2.put("k2", "v2");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testClone_uninitialized() {
        Attributes attrs = new Attributes();
        Attributes cloned = attrs.clone();
        assertNotSame(attrs, cloned);
        assertEquals(0, cloned.size());
    }

    @Test
    public void testClone_populated() {
        Attributes attrs = new Attributes();
        attrs.put("key", "val");

        Attributes cloned = attrs.clone();
        assertNotSame(attrs, cloned);
        assertEquals(attrs, cloned);

        cloned.put("key2", "val2");
        assertFalse(attrs.hasKey("key2"));
        assertTrue(cloned.hasKey("key2"));
    }
}
