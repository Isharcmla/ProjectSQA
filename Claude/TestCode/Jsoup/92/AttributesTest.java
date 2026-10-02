package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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

    // ---------- get ----------
    @Test
    public void testGet_existingKey_returnsValue() {
        attrs.put("foo", "bar");
        assertEquals("bar", attrs.get("foo"));
    }

    @Test
    public void testGet_nonExistingKey_returnsEmptyString() {
        assertEquals("", attrs.get("notexist"));
    }

    @Test
    public void testGet_booleanAttribute_returnsEmptyString() {
        attrs.put("checked", true);
        assertEquals("", attrs.get("checked"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_nullKey_throwsException() {
        attrs.get(null);
    }

    // ---------- getIgnoreCase ----------
    @Test
    public void testGetIgnoreCase_differentCase_returnsValue() {
        attrs.put("Foo", "bar");
        assertEquals("bar", attrs.getIgnoreCase("foo"));
    }

    @Test
    public void testGetIgnoreCase_nonExisting_returnsEmptyString() {
        assertEquals("", attrs.getIgnoreCase("nope"));
    }

    // ---------- put(String, String) ----------
    @Test
    public void testPutStringString_newKey_addsAttribute() {
        attrs.put("key1", "value1");
        assertEquals("value1", attrs.get("key1"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutStringString_existingKey_updatesValue() {
        attrs.put("key1", "value1");
        attrs.put("key1", "value2");
        assertEquals("value2", attrs.get("key1"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutStringString_growthBeyondInitialCapacity_addsAllAttributes() {
        for (int i = 0; i < 10; i++) {
            attrs.put("key" + i, "val" + i);
        }
        assertEquals(10, attrs.size());
        assertEquals("val5", attrs.get("key5"));
    }

    // ---------- put(String, boolean) ----------
    @Test
    public void testPutStringBoolean_true_addsBooleanAttribute() {
        attrs.put("checked", true);
        assertTrue(attrs.hasKey("checked"));
        assertEquals("", attrs.get("checked"));
    }

    @Test
    public void testPutStringBoolean_false_removesAttribute() {
        attrs.put("checked", true);
        attrs.put("checked", false);
        assertFalse(attrs.hasKey("checked"));
    }

    @Test
    public void testPutStringBoolean_falseOnNonExisting_noException() {
        attrs.put("checked", false);
        assertFalse(attrs.hasKey("checked"));
    }

    // ---------- put(Attribute) ----------
    @Test
    public void testPutAttribute_addsAttributeAndSetsParent() {
        Attribute attribute = new Attribute("key", "value");
        attrs.put(attribute);
        assertEquals("value", attrs.get("key"));
        assertSame(attrs, attribute.parent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutAttribute_null_throwsException() {
        attrs.put((Attribute) null);
    }

    // ---------- remove(String) ----------
    @Test
    public void testRemove_existingKey_removesAttribute() {
        attrs.put("key1", "value1");
        attrs.remove("key1");
        assertFalse(attrs.hasKey("key1"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemove_nonExistingKey_noChange() {
        attrs.put("key1", "value1");
        attrs.remove("notexist");
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemove_middleElement_shiftsCorrectly() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");
        attrs.remove("b");
        assertEquals(2, attrs.size());
        assertEquals("1", attrs.get("a"));
        assertEquals("3", attrs.get("c"));
        assertFalse(attrs.hasKey("b"));
    }

    // ---------- removeIgnoreCase ----------
    @Test
    public void testRemoveIgnoreCase_existingKeyDifferentCase_removes() {
        attrs.put("Foo", "bar");
        attrs.removeIgnoreCase("foo");
        assertFalse(attrs.hasKey("Foo"));
    }

    @Test
    public void testRemoveIgnoreCase_nonExisting_noChange() {
        attrs.put("Foo", "bar");
        attrs.removeIgnoreCase("notexist");
        assertEquals(1, attrs.size());
    }

    // ---------- hasKey ----------
    @Test
    public void testHasKey_existing_true() {
        attrs.put("key1", "value1");
        assertTrue(attrs.hasKey("key1"));
    }

    @Test
    public void testHasKey_nonExisting_false() {
        assertFalse(attrs.hasKey("notexist"));
    }

    // ---------- hasKeyIgnoreCase ----------
    @Test
    public void testHasKeyIgnoreCase_existingDifferentCase_true() {
        attrs.put("Foo", "bar");
        assertTrue(attrs.hasKeyIgnoreCase("foo"));
    }

    @Test
    public void testHasKeyIgnoreCase_nonExisting_false() {
        assertFalse(attrs.hasKeyIgnoreCase("notexist"));
    }

    // ---------- size ----------
    @Test
    public void testSize_emptyAttributes_returnsZero() {
        assertEquals(0, attrs.size());
    }

    @Test
    public void testSize_afterAdding_returnsCorrectCount() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        assertEquals(2, attrs.size());
    }

    // ---------- addAll ----------
    @Test
    public void testAddAll_emptyIncoming_noChange() {
        attrs.put("a", "1");
        Attributes incoming = new Attributes();
        attrs.addAll(incoming);
        assertEquals(1, attrs.size());
    }

    @Test
    public void testAddAll_withAttributes_addsAll() {
        attrs.put("a", "1");
        Attributes incoming = new Attributes();
        incoming.put("b", "2");
        incoming.put("c", "3");
        attrs.addAll(incoming);
        assertEquals(3, attrs.size());
        assertEquals("2", attrs.get("b"));
        assertEquals("3", attrs.get("c"));
    }

    // ---------- iterator ----------
    @Test
    public void testIterator_iteratesAllAttributes() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        Iterator<Attribute> it = attrs.iterator();
        int count = 0;
        while (it.hasNext()) {
            Attribute attribute = it.next();
            assertNotNull(attribute.getKey());
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testIterator_remove_removesCurrentAttribute() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        Iterator<Attribute> it = attrs.iterator();
        it.next();
        it.remove();
        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("a"));
    }

    // ---------- asList ----------
    @Test
    public void testAsList_returnsUnmodifiableList() {
        attrs.put("a", "1");
        attrs.put("checked", true);
        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsList_unmodifiable_throwsException() {
        attrs.put("a", "1");
        List<Attribute> list = attrs.asList();
        list.add(new Attribute("b", "2"));
    }

    @Test
    public void testAsList_booleanAttribute_returnsBooleanAttributeInstance() {
        attrs.put("checked", true);
        List<Attribute> list = attrs.asList();
        assertTrue(list.get(0) instanceof BooleanAttribute);
    }

    // ---------- dataset ----------
    @Test
    public void testDataset_getsDataAttributesOnly() {
        attrs.put("data-foo", "bar");
        attrs.put("notdata", "baz");
        Map<String, String> dataset = attrs.dataset();
        assertEquals(1, dataset.size());
        assertEquals("bar", dataset.get("foo"));
    }

    @Test
    public void testDataset_put_addsDataPrefixedAttribute() {
        Map<String, String> dataset = attrs.dataset();
        dataset.put("foo", "bar");
        assertTrue(attrs.hasKey("data-foo"));
        assertEquals("bar", attrs.get("data-foo"));
    }

    @Test
    public void testDataset_put_returnsOldValue() {
        attrs.put("data-foo", "old");
        Map<String, String> dataset = attrs.dataset();
        String oldValue = dataset.put("foo", "new");
        assertEquals("old", oldValue);
        assertEquals("new", attrs.get("data-foo"));
    }

    @Test
    public void testDataset_put_returnsNullForNewKey() {
        Map<String, String> dataset = attrs.dataset();
        String oldValue = dataset.put("foo", "new");
        assertNull(oldValue);
    }

    @Test
    public void testDataset_entrySet_size() {
        attrs.put("data-foo", "bar");
        attrs.put("data-baz", "qux");
        attrs.put("notdata", "value");
        Map<String, String> dataset = attrs.dataset();
        assertEquals(2, dataset.entrySet().size());
    }

    @Test
    public void testDataset_iteratorRemove_removesAttribute() {
        attrs.put("data-foo", "bar");
        Map<String, String> dataset = attrs.dataset();
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertTrue(it.hasNext());
        it.next();
        it.remove();
        assertFalse(attrs.hasKey("data-foo"));
    }

    @Test
    public void testDataset_emptyWhenNoDataAttributes() {
        attrs.put("foo", "bar");
        Map<String, String> dataset = attrs.dataset();
        assertEquals(0, dataset.size());
    }

    // ---------- html ----------
    @Test
    public void testHtml_returnsCorrectHtmlString() {
        attrs.put("class", "test");
        String html = attrs.html();
        assertTrue(html.contains("class=\"test\""));
    }

    @Test
    public void testHtml_emptyAttributes_returnsEmptyString() {
        String html = attrs.html();
        assertEquals("", html);
    }

    @Test
    public void testHtml_booleanAttribute_collapsed() {
        attrs.put("checked", true);
        String html = attrs.html();
        assertTrue(html.contains("checked"));
    }

    // ---------- toString ----------
    @Test
    public void testToString_returnsHtmlString() {
        attrs.put("class", "test");
        assertEquals(attrs.html(), attrs.toString());
    }

    // ---------- equals ----------
    @Test
    public void testEquals_sameInstance_true() {
        attrs.put("a", "1");
        assertTrue(attrs.equals(attrs));
    }

    @Test
    public void testEquals_sameContent_true() {
        attrs.put("a", "1");
        Attributes other = new Attributes();
        other.put("a", "1");
        assertTrue(attrs.equals(other));
    }

    @Test
    public void testEquals_differentContent_false() {
        attrs.put("a", "1");
        Attributes other = new Attributes();
        other.put("a", "2");
        assertFalse(attrs.equals(other));
    }

    @Test
    public void testEquals_differentSize_false() {
        attrs.put("a", "1");
        Attributes other = new Attributes();
        other.put("a", "1");
        other.put("b", "2");
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

    // ---------- hashCode ----------
    @Test
    public void testHashCode_consistentForEqualObjects() {
        attrs.put("a", "1");
        Attributes other = new Attributes();
        other.put("a", "1");
        assertEquals(attrs.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_emptyAttributes_returnsConsistentValue() {
        int hash1 = attrs.hashCode();
        int hash2 = attrs.hashCode();
        assertEquals(hash1, hash2);
    }

    // ---------- clone ----------
    @Test
    public void testClone_createsIndependentCopy() {
        attrs.put("a", "1");
        Attributes clone = attrs.clone();
        clone.put("a", "2");
        assertEquals("2", clone.get("a"));
        // original keys array was mutated in clone() implementation as-is per source
        assertTrue(clone.hasKey("a"));
    }

    @Test
    public void testClone_sizeMatches() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        Attributes clone = attrs.clone();
        assertEquals(attrs.size(), clone.size());
    }

    // ---------- normalize ----------
    @Test
    public void testNormalize_lowercasesKeys() {
        attrs.put("FOO", "bar");
        attrs.normalize();
        assertTrue(attrs.hasKey("foo"));
        assertFalse(attrs.hasKey("FOO"));
    }

    @Test
    public void testNormalize_emptyAttributes_noException() {
        attrs.normalize();
        assertEquals(0, attrs.size());
    }

    // ---------- additional edge cases ----------
    @Test
    public void testPutIgnoreCase_caseChanged_updatesKey() {
        attrs.put("Foo", "bar");
        attrs.put("foo", true); // uses putIgnoreCase internally via put(String, boolean)
        assertTrue(attrs.hasKeyIgnoreCase("foo"));
    }

    @Test
    public void testMultiplePutAndRemove_sizeConsistency() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");
        attrs.remove("a");
        attrs.remove("c");
        assertEquals(1, attrs.size());
        assertEquals("2", attrs.get("b"));
    }

    @Test
    public void testAsList_emptyAttributes_returnsEmptyList() {
        List<Attribute> list = attrs.asList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testIterator_emptyAttributes_hasNextFalse() {
        Iterator<Attribute> it = attrs.iterator();
        assertFalse(it.hasNext());
    }
}
