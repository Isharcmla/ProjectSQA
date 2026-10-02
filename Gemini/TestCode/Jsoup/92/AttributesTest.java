package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AttributesTest {

    @Test
    public void testPutAndGet_normalInput_success() {
        Attributes attributes = new Attributes();
        attributes.put("class", "container");
        attributes.put("id", "main");

        assertEquals("container", attributes.get("class"));
        assertEquals("main", attributes.get("id"));
        assertEquals(2, attributes.size());
    }

    @Test
    public void testGet_notFoundKey_returnsEmptyString() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.get("nonexistent"));
    }

    @Test
    public void testGet_caseSensitive_returnsEmptyStringWhenCaseDiffers() {
        Attributes attributes = new Attributes();
        attributes.put("Class", "box");

        assertEquals("box", attributes.get("Class"));
        assertEquals("", attributes.get("class"));
    }

    @Test
    public void testGetIgnoreCase_caseInsensitive_returnsValue() {
        Attributes attributes = new Attributes();
        attributes.put("TITLE", "Header Title");

        assertEquals("Header Title", attributes.getIgnoreCase("title"));
        assertEquals("Header Title", attributes.getIgnoreCase("TITLE"));
        assertEquals("Header Title", attributes.getIgnoreCase("Title"));
        assertEquals("", attributes.getIgnoreCase("notfound"));
    }

    @Test
    public void testPut_duplicateKey_updatesValue() {
        Attributes attributes = new Attributes();
        attributes.put("href", "http://example.com");
        assertEquals(1, attributes.size());
        assertEquals("http://example.com", attributes.get("href"));

        attributes.put("href", "http://example.org");
        assertEquals(1, attributes.size());
        assertEquals("http://example.org", attributes.get("href"));
    }

    @Test
    public void testPutIgnoreCase_updatesCaseAndValue() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("KEY", "val1");
        assertEquals("val1", attributes.get("KEY"));

        attributes.putIgnoreCase("key", "val2");
        assertEquals("val2", attributes.get("key"));
        assertEquals("", attributes.get("KEY"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testPutBoolean_trueSetsAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("disabled", true);

        assertTrue(attributes.hasKey("disabled"));
        assertEquals("", attributes.get("disabled"));
    }

    @Test
    public void testPutBoolean_falseRemovesAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("checked", "true");
        assertTrue(attributes.hasKey("checked"));

        attributes.put("checked", false);
        assertFalse(attributes.hasKey("checked"));
        assertEquals(0, attributes.size());
    }

    @Test
    public void testPutAttribute_objectInput_success() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("target", "_blank");
        attributes.put(attribute);

        assertEquals("_blank", attributes.get("target"));
        assertSame(attributes, attribute.parent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutAttribute_nullAttribute_throwsException() {
        Attributes attributes = new Attributes();
        attributes.put((Attribute) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexOfKey_nullKey_throwsException() {
        Attributes attributes = new Attributes();
        attributes.get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexOfKeyIgnoreCase_nullKey_throwsException() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase(null);
    }

    @Test
    public void testRemove_caseSensitive() {
        Attributes attributes = new Attributes();
        attributes.put("name", "foo");
        attributes.put("Name", "bar");

        attributes.remove("name");
        assertFalse(attributes.hasKey("name"));
        assertTrue(attributes.hasKey("Name"));
        assertEquals(1, attributes.size());

        attributes.remove("nonexistent");
        assertEquals(1, attributes.size());
    }

    @Test
    public void testRemoveIgnoreCase_caseInsensitive() {
        Attributes attributes = new Attributes();
        attributes.put("ALT", "Sample Image");

        attributes.removeIgnoreCase("alt");
        assertFalse(attributes.hasKeyIgnoreCase("ALT"));
        assertEquals(0, attributes.size());

        attributes.removeIgnoreCase("nonexistent");
        assertEquals(0, attributes.size());
    }

    @Test
    public void testHasKey_normalAndNotFound() {
        Attributes attributes = new Attributes();
        attributes.put("rel", "nofollow");

        assertTrue(attributes.hasKey("rel"));
        assertFalse(attributes.hasKey("REL"));
        assertFalse(attributes.hasKey("href"));
    }

    @Test
    public void testHasKeyIgnoreCase_normalAndNotFound() {
        Attributes attributes = new Attributes();
        attributes.put("REL", "nofollow");

        assertTrue(attributes.hasKeyIgnoreCase("rel"));
        assertTrue(attributes.hasKeyIgnoreCase("REL"));
        assertFalse(attributes.hasKeyIgnoreCase("href"));
    }

    @Test
    public void testCapacityExpansion_moreThanInitialCapacity() {
        Attributes attributes = new Attributes();
        for (int i = 0; i < 10; i++) {
            attributes.put("key" + i, "val" + i);
        }

        assertEquals(10, attributes.size());
        for (int i = 0; i < 10; i++) {
            assertEquals("val" + i, attributes.get("key" + i));
        }
    }

    @Test
    public void testAddAll_normalAndEmpty() {
        Attributes source = new Attributes();
        source.put("k1", "v1");
        source.put("k2", "v2");

        Attributes target = new Attributes();
        target.put("k0", "v0");
        target.addAll(source);

        assertEquals(3, target.size());
        assertEquals("v0", target.get("k0"));
        assertEquals("v1", target.get("k1"));
        assertEquals("v2", target.get("k2"));

        Attributes empty = new Attributes();
        target.addAll(empty);
        assertEquals(3, target.size());
    }

    @Test
    public void testIterator_traversalAndRemove() {
        Attributes attributes = new Attributes();
        attributes.put("a", "1");
        attributes.put("b", "2");
        attributes.put("c", "3");

        Iterator<Attribute> it = attributes.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next().getKey());

        assertTrue(it.hasNext());
        assertEquals("b", it.next().getKey());
        it.remove();

        assertEquals(2, attributes.size());
        assertFalse(attributes.hasKey("b"));

        assertTrue(it.hasNext());
        assertEquals("c", it.next().getKey());
        assertFalse(it.hasNext());
    }

    @Test
    public void testAsList_returnsUnmodifiableListWithBothAttributeTypes() {
        Attributes attributes = new Attributes();
        attributes.put("src", "image.png");
        attributes.put("checked", (String) null);

        List<Attribute> list = attributes.asList();
        assertEquals(2, list.size());
        assertEquals("src", list.get(0).getKey());
        assertEquals("image.png", list.get(0).getValue());
        assertEquals("checked", list.get(1).getKey());
        assertTrue(list.get(1) instanceof BooleanAttribute);

        try {
            list.add(new Attribute("newKey", "newVal"));
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected unmodifiable list
        }
    }

    @Test
    public void testDataset_operations() {
        Attributes attributes = new Attributes();
        attributes.put("data-id", "123");
        attributes.put("data-name", "John");
        attributes.put("class", "user-card");

        Map<String, String> dataset = attributes.dataset();
        assertEquals(2, dataset.size());
        assertEquals("123", dataset.get("id"));
        assertEquals("John", dataset.get("name"));
        assertNull(dataset.get("class"));

        String oldVal = dataset.put("name", "Jane");
        assertEquals("John", oldVal);
        assertEquals("Jane", attributes.get("data-name"));

        String oldValNewKey = dataset.put("age", "30");
        assertNull(oldValNewKey);
        assertEquals("30", attributes.get("data-age"));
        assertEquals(3, dataset.size());

        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertTrue(it.hasNext());
        Map.Entry<String, String> entry = it.next();
        assertEquals("id", entry.getKey());
        assertEquals("123", entry.getValue());
        it.remove();

        assertFalse(attributes.hasKey("data-id"));
        assertEquals(2, dataset.size());
    }

    @Test
    public void testHtmlAndToString_formatting() {
        Attributes attributes = new Attributes();
        attributes.put("class", "btn btn-primary");
        attributes.put("disabled", (String) null);

        String html = attributes.html();
        assertEquals(" class=\"btn btn-primary\" disabled", html);
        assertEquals(html, attributes.toString());
    }

    @Test
    public void testHtml_withSpecialCharactersEscaped() {
        Attributes attributes = new Attributes();
        attributes.put("title", "Tom & Jerry \"Show\"");

        String html = attributes.html();
        assertEquals(" title=\"Tom &amp; Jerry &quot;Show&quot;\"", html);
    }

    @Test
    public void testHtml_withAppendableAndSettings() throws IOException {
        Attributes attributes = new Attributes();
        attributes.put("id", "test");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();

        attributes.html(sb, settings);
        assertEquals(" id=\"test\"", sb.toString());
    }

    @Test
    public void testNormalize_convertsKeysToLowercase() {
        Attributes attributes = new Attributes();
        attributes.put("HREF", "http://example.com");
        attributes.put("Title", "Home");

        attributes.normalize();
        assertTrue(attributes.hasKey("href"));
        assertTrue(attributes.hasKey("title"));
        assertFalse(attributes.hasKey("HREF"));
        assertFalse(attributes.hasKey("Title"));
    }

    @Test
    public void testEqualsAndHashCode() {
        Attributes a1 = new Attributes();
        Attributes a2 = new Attributes();
        Attributes a3 = new Attributes();

        assertEquals(a1, a1);
        assertNotEquals(a1, null);
        assertNotEquals(a1, "some string");

        assertEquals(a1, a2);
        assertEquals(a1.hashCode(), a2.hashCode());

        a1.put("k", "v");
        assertNotEquals(a1, a2);

        a2.put("k", "v");
        assertEquals(a1, a2);
        assertEquals(a1.hashCode(), a2.hashCode());

        a3.put("k", "different");
        assertNotEquals(a1, a3);
    }

    @Test
    public void testClone_createsIndependentCopy() {
        Attributes original = new Attributes();
        original.put("k1", "v1");
        original.put("k2", "v2");

        Attributes clone = original.clone();
        assertEquals(original, clone);
        assertEquals(original.hashCode(), clone.hashCode());

        clone.put("k3", "v3");
        assertNotEquals(original.size(), clone.size());
        assertFalse(original.hasKey("k3"));
        assertTrue(clone.hasKey("k3"));

        clone.put("k1", "modified");
        assertEquals("v1", original.get("k1"));
        assertEquals("modified", clone.get("k1"));
    }

    @Test
    public void testCheckNotNull_helperMethod() {
        assertEquals("", Attributes.checkNotNull(null));
        assertEquals("test", Attributes.checkNotNull("test"));
    }
}
