package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AttributesTest {

    private Attributes attributes;

    @Before
    public void setUp() {
        attributes = new Attributes();
    }

    // ---------- get() ----------

    @Test
    public void testGet_existingKey_returnsValue() {
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void testGet_nonExistingKey_returnsEmptyString() {
        assertEquals("", attributes.get("nokey"));
    }

    @Test
    public void testGet_emptyAttributes_returnsEmptyString() {
        assertEquals("", attributes.get("anykey"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_nullKey_throwsException() {
        attributes.get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_emptyKey_throwsException() {
        attributes.get("");
    }

    // ---------- getIgnoreCase() ----------

    @Test
    public void testGetIgnoreCase_matchingCaseInsensitiveKey_returnsValue() {
        attributes.put("Key", "value");
        assertEquals("value", attributes.getIgnoreCase("key"));
    }

    @Test
    public void testGetIgnoreCase_nonExistingKey_returnsEmptyString() {
        attributes.put("key", "value");
        assertEquals("", attributes.getIgnoreCase("nomatch"));
    }

    @Test
    public void testGetIgnoreCase_emptyAttributes_returnsEmptyString() {
        assertEquals("", attributes.getIgnoreCase("key"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIgnoreCase_nullKey_throwsException() {
        attributes.getIgnoreCase(null);
    }

    // ---------- put(String, String) ----------

    @Test
    public void testPutStringValue_newKey_addsAttribute() {
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testPutStringValue_existingKey_replacesValue() {
        attributes.put("key", "value1");
        attributes.put("key", "value2");
        assertEquals("value2", attributes.get("key"));
        assertEquals(1, attributes.size());
    }

    // ---------- put(String, boolean) ----------

    @Test
    public void testPutBoolean_true_addsBooleanAttribute() {
        attributes.put("disabled", true);
        assertTrue(attributes.hasKey("disabled"));
    }

    @Test
    public void testPutBoolean_false_removesAttributeIfExists() {
        attributes.put("disabled", true);
        assertTrue(attributes.hasKey("disabled"));
        attributes.put("disabled", false);
        assertFalse(attributes.hasKey("disabled"));
    }

    @Test
    public void testPutBoolean_falseOnNonExisting_doesNothing() {
        attributes.put("disabled", false);
        assertFalse(attributes.hasKey("disabled"));
        assertEquals(0, attributes.size());
    }

    // ---------- put(Attribute) ----------

    @Test
    public void testPutAttribute_validAttribute_addsToSet() {
        Attribute attr = new Attribute("key", "value");
        attributes.put(attr);
        assertEquals("value", attributes.get("key"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutAttribute_nullAttribute_throwsException() {
        attributes.put((Attribute) null);
    }

    // ---------- remove() ----------

    @Test
    public void testRemove_existingKey_removesAttribute() {
        attributes.put("key", "value");
        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void testRemove_nonExistingKey_doesNothing() {
        attributes.remove("nokey");
        assertEquals(0, attributes.size());
    }

    @Test
    public void testRemove_emptyAttributes_doesNothing() {
        attributes.remove("anykey");
        assertEquals(0, attributes.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_nullKey_throwsException() {
        attributes.remove(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_emptyKey_throwsException() {
        attributes.remove("");
    }

    // ---------- removeIgnoreCase() ----------

    @Test
    public void testRemoveIgnoreCase_matchingCaseInsensitiveKey_removesAttribute() {
        attributes.put("Key", "value");
        attributes.removeIgnoreCase("key");
        assertFalse(attributes.hasKey("Key"));
    }

    @Test
    public void testRemoveIgnoreCase_emptyAttributes_doesNothing() {
        attributes.removeIgnoreCase("key");
        assertEquals(0, attributes.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveIgnoreCase_nullKey_throwsException() {
        attributes.removeIgnoreCase(null);
    }

    // ---------- hasKey() ----------

    @Test
    public void testHasKey_existingKey_returnsTrue() {
        attributes.put("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void testHasKey_nonExistingKey_returnsFalse() {
        assertFalse(attributes.hasKey("nokey"));
    }

    @Test
    public void testHasKey_emptyAttributes_returnsFalse() {
        assertFalse(attributes.hasKey("anykey"));
    }

    // ---------- hasKeyIgnoreCase() ----------

    @Test
    public void testHasKeyIgnoreCase_matchingCaseInsensitiveKey_returnsTrue() {
        attributes.put("Key", "value");
        assertTrue(attributes.hasKeyIgnoreCase("key"));
    }

    @Test
    public void testHasKeyIgnoreCase_nonExistingKey_returnsFalse() {
        attributes.put("key", "value");
        assertFalse(attributes.hasKeyIgnoreCase("nomatch"));
    }

    @Test
    public void testHasKeyIgnoreCase_emptyAttributes_returnsFalse() {
        assertFalse(attributes.hasKeyIgnoreCase("key"));
    }

    // ---------- size() ----------

    @Test
    public void testSize_emptyAttributes_returnsZero() {
        assertEquals(0, attributes.size());
    }

    @Test
    public void testSize_afterAddingAttributes_returnsCorrectCount() {
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        assertEquals(2, attributes.size());
    }

    // ---------- addAll() ----------

    @Test
    public void testAddAll_incomingHasAttributes_addsAllToTarget() {
        Attributes incoming = new Attributes();
        incoming.put("key1", "value1");
        incoming.put("key2", "value2");

        attributes.addAll(incoming);
        assertEquals(2, attributes.size());
        assertEquals("value1", attributes.get("key1"));
        assertEquals("value2", attributes.get("key2"));
    }

    @Test
    public void testAddAll_incomingEmpty_doesNothing() {
        Attributes incoming = new Attributes();
        attributes.put("key", "value");
        attributes.addAll(incoming);
        assertEquals(1, attributes.size());
    }

    @Test
    public void testAddAll_targetEmpty_initializesAndAdds() {
        Attributes incoming = new Attributes();
        incoming.put("key", "value");
        attributes.addAll(incoming);
        assertEquals(1, attributes.size());
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_emptyAttributes_returnsEmptyIterator() {
        Iterator<Attribute> it = attributes.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_withAttributes_iteratesOverAll() {
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");

        Iterator<Attribute> it = attributes.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    // ---------- asList() ----------

    @Test
    public void testAsList_emptyAttributes_returnsEmptyList() {
        List<Attribute> list = attributes.asList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAsList_withAttributes_returnsListOfAttributes() {
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        List<Attribute> list = attributes.asList();
        assertEquals(2, list.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsList_modifyReturnedList_throwsException() {
        attributes.put("key", "value");
        List<Attribute> list = attributes.asList();
        list.add(new Attribute("key2", "value2"));
    }

    // ---------- dataset() ----------

    @Test
    public void testDataset_putValue_addsWithDataPrefix() {
        Map<String, String> dataset = attributes.dataset();
        dataset.put("foo", "bar");
        assertTrue(attributes.hasKey("data-foo"));
        assertEquals("bar", attributes.get("data-foo"));
    }

    @Test
    public void testDataset_getEntrySet_onlyReturnsDataAttributes() {
        attributes.put("data-foo", "bar");
        attributes.put("nonData", "value");

        Map<String, String> dataset = attributes.dataset();
        assertEquals(1, dataset.size());
        assertTrue(dataset.containsKey("foo"));
    }

    @Test
    public void testDataset_emptyAttributes_returnsEmptyDataset() {
        Map<String, String> dataset = attributes.dataset();
        assertEquals(0, dataset.size());
    }

    @Test
    public void testDataset_iteratorEntries_returnsCorrectKeyValue() {
        attributes.put("data-foo", "bar");
        Map<String, String> dataset = attributes.dataset();
        for (Map.Entry<String, String> entry : dataset.entrySet()) {
            assertEquals("foo", entry.getKey());
            assertEquals("bar", entry.getValue());
        }
    }

    @Test
    public void testDataset_iteratorRemove_removesUnderlyingAttribute() {
        attributes.put("data-foo", "bar");
        Map<String, String> dataset = attributes.dataset();
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        assertFalse(attributes.hasKey("data-foo"));
    }

    @Test
    public void testDataset_putOverwriteExistingKey_returnsOldValue() {
        attributes.put("data-foo", "old");
        Map<String, String> dataset = attributes.dataset();
        String oldValue = dataset.put("foo", "new");
        assertEquals("old", oldValue);
        assertEquals("new", attributes.get("data-foo"));
    }

    // ---------- html() ----------

    @Test
    public void testHtml_emptyAttributes_returnsEmptyString() {
        assertEquals("", attributes.html());
    }

    @Test
    public void testHtml_withAttributes_returnsHtmlString() {
        attributes.put("key", "value");
        String html = attributes.html();
        assertTrue(html.contains("key"));
        assertTrue(html.contains("value"));
    }

    // ---------- toString() ----------

    @Test
    public void testToString_returnsHtmlRepresentation() {
        attributes.put("key", "value");
        assertEquals(attributes.html(), attributes.toString());
    }

    // ---------- equals() ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(attributes.equals(attributes));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(attributes.equals("not attributes"));
    }

    @Test
    public void testEquals_equalContents_returnsTrue() {
        Attributes other = new Attributes();
        attributes.put("key", "value");
        other.put("key", "value");
        assertTrue(attributes.equals(other));
    }

    @Test
    public void testEquals_differentContents_returnsFalse() {
        Attributes other = new Attributes();
        attributes.put("key", "value1");
        other.put("key", "value2");
        assertFalse(attributes.equals(other));
    }

    @Test
    public void testEquals_bothEmpty_returnsTrue() {
        Attributes other = new Attributes();
        assertTrue(attributes.equals(other));
    }

    @Test
    public void testEquals_oneNullAttributesField_returnsFalse() {
        Attributes other = new Attributes();
        other.put("key", "value");
        assertFalse(attributes.equals(other));
    }

    // ---------- hashCode() ----------

    @Test
    public void testHashCode_emptyAttributes_returnsZero() {
        assertEquals(0, attributes.hashCode());
    }

    @Test
    public void testHashCode_withAttributes_returnsConsistentValue() {
        attributes.put("key", "value");
        int hash1 = attributes.hashCode();
        int hash2 = attributes.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHashCode_equalAttributes_haveSameHashCode() {
        Attributes other = new Attributes();
        attributes.put("key", "value");
        other.put("key", "value");
        assertEquals(attributes.hashCode(), other.hashCode());
    }

    // ---------- clone() ----------

    @Test
    public void testClone_emptyAttributes_returnsNewEmptyInstance() {
        Attributes clone = attributes.clone();
        assertNotNull(clone);
        assertEquals(0, clone.size());
        assertNotSame(attributes, clone);
    }

    @Test
    public void testClone_withAttributes_returnsIndependentCopy() {
        attributes.put("key", "value");
        Attributes clone = attributes.clone();

        assertEquals("value", clone.get("key"));
        clone.put("key", "changed");
        assertEquals("value", attributes.get("key"));
        assertEquals("changed", clone.get("key"));
    }

    @Test
    public void testClone_equalsOriginal_contentEquality() {
        attributes.put("key", "value");
        Attributes clone = attributes.clone();
        assertTrue(attributes.equals(clone));
    }
}
