package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AttributesTest {

    private Attributes attrs;

    @Before
    public void setUp() {
        attrs = new Attributes();
    }

    // ---------- get() ----------

    @Test
    public void testGet_existingKey_returnsValue() {
        attrs.put("class", "foo");
        assertEquals("foo", attrs.get("class"));
    }

    @Test
    public void testGet_nonExistingKey_returnsEmptyString() {
        assertEquals("", attrs.get("missing"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_nullKey_throwsException() {
        attrs.get(null);
    }

    @Test
    public void testGet_booleanAttribute_returnsEmptyString() {
        attrs.put("checked", true);
        assertEquals("", attrs.get("checked"));
    }

    // ---------- getIgnoreCase() ----------

    @Test
    public void testGetIgnoreCase_existingKeyDifferentCase_returnsValue() {
        attrs.put("Class", "foo");
        assertEquals("foo", attrs.getIgnoreCase("class"));
    }

    @Test
    public void testGetIgnoreCase_nonExisting_returnsEmptyString() {
        assertEquals("", attrs.getIgnoreCase("missing"));
    }

    // ---------- put(String, String) ----------

    @Test
    public void testPutStringValue_newKey_addsAttribute() {
        attrs.put("id", "main");
        assertEquals("main", attrs.get("id"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutStringValue_existingKey_updatesValue() {
        attrs.put("id", "main");
        attrs.put("id", "other");
        assertEquals("other", attrs.get("id"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutStringValue_returnsSameInstanceForChaining() {
        Attributes result = attrs.put("id", "main");
        assertSame(attrs, result);
    }

    // ---------- put(String, boolean) ----------

    @Test
    public void testPutBooleanTrue_addsBooleanAttribute() {
        attrs.put("checked", true);
        assertTrue(attrs.hasKey("checked"));
        assertEquals("", attrs.get("checked"));
    }

    @Test
    public void testPutBooleanFalse_removesAttribute() {
        attrs.put("checked", true);
        attrs.put("checked", false);
        assertFalse(attrs.hasKey("checked"));
    }

    @Test
    public void testPutBoolean_caseInsensitive() {
        attrs.put("Checked", true);
        assertTrue(attrs.hasKeyIgnoreCase("checked"));
    }

    // ---------- put(Attribute) ----------

    @Test
    public void testPutAttribute_addsAttributeAndSetsParent() {
        Attribute attribute = new Attribute("name", "value");
        attrs.put(attribute);
        assertEquals("value", attrs.get("name"));
        assertSame(attrs, attribute.parent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutAttribute_nullAttribute_throwsException() {
        attrs.put((Attribute) null);
    }

    // ---------- remove(String) ----------

    @Test
    public void testRemove_existingKey_removesIt() {
        attrs.put("a", "1");
        attrs.remove("a");
        assertFalse(attrs.hasKey("a"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemove_nonExistingKey_noChange() {
        attrs.put("a", "1");
        attrs.remove("b");
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemove_shiftsRemainingElements() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");
        attrs.remove("a");
        assertEquals(2, attrs.size());
        assertEquals("2", attrs.get("b"));
        assertEquals("3", attrs.get("c"));
    }

    // ---------- removeIgnoreCase(String) ----------

    @Test
    public void testRemoveIgnoreCase_existingKeyDifferentCase_removesIt() {
        attrs.put("Class", "foo");
        attrs.removeIgnoreCase("class");
        assertFalse(attrs.hasKey("Class"));
    }

    @Test
    public void testRemoveIgnoreCase_nonExistingKey_noChange() {
        attrs.put("Class", "foo");
        attrs.removeIgnoreCase("missing");
        assertEquals(1, attrs.size());
    }

    // ---------- hasKey() ----------

    @Test
    public void testHasKey_existingKey_true() {
        attrs.put("a", "1");
        assertTrue(attrs.hasKey("a"));
    }

    @Test
    public void testHasKey_nonExistingKey_false() {
        assertFalse(attrs.hasKey("a"));
    }

    // ---------- hasKeyIgnoreCase() ----------

    @Test
    public void testHasKeyIgnoreCase_differentCase_true() {
        attrs.put("A", "1");
        assertTrue(attrs.hasKeyIgnoreCase("a"));
    }

    @Test
    public void testHasKeyIgnoreCase_nonExisting_false() {
        assertFalse(attrs.hasKeyIgnoreCase("a"));
    }

    // ---------- size() ----------

    @Test
    public void testSize_emptyAttributes_returnsZero() {
        assertEquals(0, attrs.size());
    }

    @Test
    public void testSize_afterAddingAttributes_returnsCorrectSize() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        assertEquals(2, attrs.size());
    }

    // ---------- addAll() ----------

    @Test
    public void testAddAll_mergesAttributes() {
        attrs.put("a", "1");
        Attributes incoming = new Attributes();
        incoming.put("b", "2");
        incoming.put("c", "3");
        attrs.addAll(incoming);
        assertEquals(3, attrs.size());
        assertEquals("2", attrs.get("b"));
        assertEquals("3", attrs.get("c"));
    }

    @Test
    public void testAddAll_emptyIncoming_noChange() {
        attrs.put("a", "1");
        Attributes incoming = new Attributes();
        attrs.addAll(incoming);
        assertEquals(1, attrs.size());
    }

    @Test
    public void testAddAll_overwritesExistingKey() {
        attrs.put("a", "1");
        Attributes incoming = new Attributes();
        incoming.put("a", "2");
        attrs.addAll(incoming);
        assertEquals(1, attrs.size());
        assertEquals("2", attrs.get("a"));
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_iteratesAllAttributes() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        Iterator<Attribute> it = attrs.iterator();
        int count = 0;
        while (it.hasNext()) {
            Attribute attr = it.next();
            assertNotNull(attr.getKey());
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testIterator_removeViaIterator() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        Iterator<Attribute> it = attrs.iterator();
        it.next();
        it.remove();
        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("a"));
        assertTrue(attrs.hasKey("b"));
    }

    @Test
    public void testIterator_emptyAttributes_hasNextFalse() {
        Iterator<Attribute> it = attrs.iterator();
        assertFalse(it.hasNext());
    }

    // ---------- asList() ----------

    @Test
    public void testAsList_returnsCorrectAttributes() {
        attrs.put("a", "1");
        attrs.put("checked", true);
        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertEquals("a", list.get(0).getKey());
        assertEquals("1", list.get(0).getValue());
        assertEquals("checked", list.get(1).getKey());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsList_unmodifiable_throwsException() {
        attrs.put("a", "1");
        List<Attribute> list = attrs.asList();
        list.add(new Attribute("b", "2"));
    }

    @Test
    public void testAsList_emptyAttributes_returnsEmptyList() {
        List<Attribute> list = attrs.asList();
        assertTrue(list.isEmpty());
    }

    // ---------- dataset() ----------

    @Test
    public void testDataset_putAndGet() {
        Map<String, String> dataset = attrs.dataset();
        dataset.put("foo", "bar");
        assertEquals("bar", attrs.get("data-foo"));
        assertEquals("bar", dataset.get("foo"));
    }

    @Test
    public void testDataset_entrySetIteration() {
        attrs.put("data-foo", "bar");
        attrs.put("data-baz", "qux");
        attrs.put("notdata", "value");
        Map<String, String> dataset = attrs.dataset();
        int count = 0;
        for (Map.Entry<String, String> entry : dataset.entrySet()) {
            assertTrue(entry.getKey().equals("foo") || entry.getKey().equals("baz"));
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testDataset_entrySetSize() {
        attrs.put("data-foo", "bar");
        attrs.put("notdata", "value");
        Map<String, String> dataset = attrs.dataset();
        assertEquals(1, dataset.entrySet().size());
    }

    @Test
    public void testDataset_removeViaIterator() {
        attrs.put("data-foo", "bar");
        Map<String, String> dataset = attrs.dataset();
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertTrue(it.hasNext());
        it.next();
        it.remove();
        assertFalse(attrs.hasKey("data-foo"));
    }

    @Test
    public void testDataset_emptyAttributes_noEntries() {
        Map<String, String> dataset = attrs.dataset();
        assertEquals(0, dataset.entrySet().size());
    }

    // ---------- html() ----------

    @Test
    public void testHtml_rendersSimpleAttribute() {
        attrs.put("class", "foo");
        assertEquals(" class=\"foo\"", attrs.html());
    }

    @Test
    public void testHtml_rendersBooleanAttribute() {
        attrs.put("checked", true);
        assertEquals(" checked", attrs.html());
    }

    @Test
    public void testHtml_emptyAttributes_returnsEmptyString() {
        assertEquals("", attrs.html());
    }

    @Test
    public void testHtml_multipleAttributes() {
        attrs.put("id", "main");
        attrs.put("class", "foo");
        String html = attrs.html();
        assertTrue(html.contains("id=\"main\""));
        assertTrue(html.contains("class=\"foo\""));
    }

    // ---------- toString() ----------

    @Test
    public void testToString_sameAsHtml() {
        attrs.put("class", "foo");
        assertEquals(attrs.html(), attrs.toString());
    }

    // ---------- equals() ----------

    @Test
    public void testEquals_sameInstance_true() {
        attrs.put("a", "1");
        assertTrue(attrs.equals(attrs));
    }

    @Test
    public void testEquals_sameContent_true() {
        Attributes other = new Attributes();
        attrs.put("a", "1");
        other.put("a", "1");
        assertTrue(attrs.equals(other));
    }

    @Test
    public void testEquals_differentContent_false() {
        Attributes other = new Attributes();
        attrs.put("a", "1");
        other.put("a", "2");
        assertFalse(attrs.equals(other));
    }

    @Test
    public void testEquals_null_false() {
        attrs.put("a", "1");
        assertFalse(attrs.equals(null));
    }

    @Test
    public void testEquals_differentClass_false() {
        attrs.put("a", "1");
        assertFalse(attrs.equals("not attributes"));
    }

    @Test
    public void testEquals_differentSize_false() {
        Attributes other = new Attributes();
        attrs.put("a", "1");
        other.put("a", "1");
        other.put("b", "2");
        assertFalse(attrs.equals(other));
    }

    // ---------- hashCode() ----------

    @Test
    public void testHashCode_consistency() {
        attrs.put("a", "1");
        int hash1 = attrs.hashCode();
        int hash2 = attrs.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHashCode_equalObjectsHaveSameHash() {
        Attributes other = new Attributes();
        attrs.put("a", "1");
        other.put("a", "1");
        assertEquals(attrs.hashCode(), other.hashCode());
    }

    // ---------- clone() ----------

    @Test
    public void testClone_createsIndependentCopy() {
        attrs.put("a", "1");
        attrs.put("b", "2");

        Attributes clone = attrs.clone();

        assertEquals(2, clone.size());
        assertEquals("1", clone.get("a"));
        assertEquals("2", clone.get("b"));

        clone.put("c", "3");
        assertEquals(3, clone.size());
        assertEquals(2, attrs.size());
        assertFalse(attrs.hasKey("c"));
    }

    @Test
    public void testClone_emptyAttributes() {
        Attributes clone = attrs.clone();
        assertEquals(0, clone.size());
    }

    // ---------- normalize() ----------

    @Test
    public void testNormalize_lowercasesKeys() {
        attrs.put("Class", "foo");
        attrs.normalize();
        assertTrue(attrs.hasKey("class"));
        assertFalse(attrs.hasKey("Class"));
    }

    @Test
    public void testNormalize_multipleKeys() {
        attrs.put("ID", "main");
        attrs.put("DATA-FOO", "bar");
        attrs.normalize();
        assertTrue(attrs.hasKey("id"));
        assertTrue(attrs.hasKey("data-foo"));
    }

    @Test
    public void testNormalize_emptyAttributes_noException() {
        attrs.normalize();
        assertEquals(0, attrs.size());
    }

    // ---------- capacity growth ----------

    @Test
    public void testCheckCapacity_growsArrayWhenNeeded() {
        for (int i = 0; i < 20; i++) {
            attrs.put("key" + i, "value" + i);
        }
        assertEquals(20, attrs.size());
        for (int i = 0; i < 20; i++) {
            assertEquals("value" + i, attrs.get("key" + i));
        }
    }
}
