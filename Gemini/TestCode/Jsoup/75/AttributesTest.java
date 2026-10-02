package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AttributesTest {

    @Test
    public void testGetAndPut_normalKeyValue_returnsValue() {
        Attributes attrs = new Attributes();
        attrs.put("href", "https://example.com");
        assertEquals("https://example.com", attrs.get("href"));
        assertEquals("https://example.com", attrs.getIgnoreCase("HREF"));
        assertTrue(attrs.hasKey("href"));
        assertFalse(attrs.hasKey("HREF"));
        assertTrue(attrs.hasKeyIgnoreCase("HREF"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testGet_notFoundKey_returnsEmptyString() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.get("nonexistent"));
        assertEquals("", attrs.getIgnoreCase("nonexistent"));
        assertFalse(attrs.hasKey("nonexistent"));
        assertFalse(attrs.hasKeyIgnoreCase("nonexistent"));
    }

    @Test
    public void testPut_duplicateKey_updatesValue() {
        Attributes attrs = new Attributes();
        attrs.put("class", "one");
        attrs.put("class", "two");
        assertEquals("two", attrs.get("class"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutIgnoreCase_updatesCaseAndValue() {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "val1");
        attrs.putIgnoreCase("key", "val2");
        assertEquals(1, attrs.size());
        assertEquals("val2", attrs.get("key"));
        assertEquals("", attrs.get("KEY"));
    }

    @Test
    public void testPutIgnoreCase_newKey_addsSuccessfully() {
        Attributes attrs = new Attributes();
        attrs.putIgnoreCase("src", "image.png");
        assertEquals(1, attrs.size());
        assertEquals("image.png", attrs.get("src"));
    }

    @Test
    public void testPut_booleanAttribute_handlesTrueAndFalse() {
        Attributes attrs = new Attributes();
        attrs.put("disabled", true);
        assertTrue(attrs.hasKeyIgnoreCase("disabled"));
        assertEquals("", attrs.get("disabled"));

        attrs.put("disabled", false);
        assertFalse(attrs.hasKeyIgnoreCase("disabled"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testPut_attributeObject_setsParentAndValue() {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("id", "main");
        attrs.put(attr);

        assertEquals("main", attrs.get("id"));
        assertEquals(1, attrs.size());
        assertSame(attrs, attr.parent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPut_nullAttribute_throwsException() {
        Attributes attrs = new Attributes();
        attrs.put((Attribute) null);
    }

    @Test
    public void testRemove_caseSensitive() {
        Attributes attrs = new Attributes();
        attrs.put("Key", "value");
        attrs.remove("key");
        assertEquals(1, attrs.size());
        attrs.remove("Key");
        assertEquals(0, attrs.size());
        assertFalse(attrs.hasKey("Key"));
    }

    @Test
    public void testRemove_middleElement_shiftsCorrectly() {
        Attributes attrs = new Attributes();
        attrs.put("k1", "v1");
        attrs.put("k2", "v2");
        attrs.put("k3", "v3");

        attrs.remove("k2");
        assertEquals(2, attrs.size());
        assertTrue(attrs.hasKey("k1"));
        assertFalse(attrs.hasKey("k2"));
        assertTrue(attrs.hasKey("k3"));
    }

    @Test
    public void testRemoveIgnoreCase_removesAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("myAttr", "value");
        attrs.removeIgnoreCase("MYATTR");
        assertEquals(0, attrs.size());
        assertFalse(attrs.hasKeyIgnoreCase("myattr"));
    }

    @Test
    public void testRemove_nonExistentKey_doesNothing() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.remove("b");
        attrs.removeIgnoreCase("b");
        assertEquals(1, attrs.size());
    }

    @Test
    public void testAddAll_addsAllAttributes() {
        Attributes src = new Attributes();
        src.put("a", "1");
        src.put("b", "2");

        Attributes dst = new Attributes();
        dst.put("c", "3");
        dst.addAll(src);

        assertEquals(3, dst.size());
        assertEquals("1", dst.get("a"));
        assertEquals("2", dst.get("b"));
        assertEquals("3", dst.get("c"));
    }

    @Test
    public void testAddAll_emptySource_doesNothing() {
        Attributes src = new Attributes();
        Attributes dst = new Attributes();
        dst.put("k", "v");
        dst.addAll(src);
        assertEquals(1, dst.size());
    }

    @Test
    public void testCapacityExpansion_moreThanInitialCapacity() {
        Attributes attrs = new Attributes();
        for (int i = 0; i < 10; i++) {
            attrs.put("key" + i, "val" + i);
        }
        assertEquals(10, attrs.size());
        for (int i = 0; i < 10; i++) {
            assertEquals("val" + i, attrs.get("key" + i));
        }
    }

    @Test
    public void testIterator_traversalAndRemoval() {
        Attributes attrs = new Attributes();
        attrs.put("k1", "v1");
        attrs.put("k2", "v2");

        Iterator<Attribute> it = attrs.iterator();
        assertTrue(it.hasNext());
        Attribute first = it.next();
        assertEquals("k1", first.getKey());
        assertEquals("v1", first.getValue());

        it.remove();
        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("k1"));
        assertTrue(attrs.hasNext());

        Attribute second = it.next();
        assertEquals("k2", second.getKey());
        assertFalse(it.hasNext());
    }

    @Test
    public void testAsList_returnsCorrectListWithBooleanAndNormalAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "val1");
        attrs.put("checked", null);

        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertEquals("key1", list.get(0).getKey());
        assertEquals("val1", list.get(0).getValue());
        assertEquals("checked", list.get(1).getKey());
        assertTrue(list.get(1) instanceof BooleanAttribute);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsList_unmodifiable() {
        Attributes attrs = new Attributes();
        attrs.put("k", "v");
        attrs.asList().add(new Attribute("new", "val"));
    }

    @Test
    public void testDataset_operations() {
        Attributes attrs = new Attributes();
        attrs.put("data-name", "jsoup");
        attrs.put("data-version", "1.0");
        attrs.put("class", "button");

        Map<String, String> dataset = attrs.dataset();
        assertEquals(2, dataset.size());
        assertEquals("jsoup", dataset.get("name"));
        assertEquals("1.0", dataset.get("version"));
        assertNull(dataset.get("class"));

        String oldVal = dataset.put("name", "jsoup-updated");
        assertEquals("jsoup", oldVal);
        assertEquals("jsoup-updated", attrs.get("data-name"));

        String oldNewVal = dataset.put("author", "jonathan");
        assertNull(oldNewVal);
        assertEquals("jonathan", attrs.get("data-author"));

        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertTrue(it.hasNext());
        Map.Entry<String, String> entry = it.next();
        assertEquals("name", entry.getKey());
        assertEquals("jsoup-updated", entry.getValue());
        it.remove();

        assertFalse(attrs.hasKey("data-name"));
    }

    @Test
    public void testHtmlAndToString_htmlSyntax() {
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        attrs.put("required", null);
        attrs.put("checked", "checked");
        attrs.put("data-custom", "a&b<c>\"");

        String html = attrs.html();
        assertEquals(" id=\"main\" required checked data-custom=\"a&amp;b&lt;c&gt;&quot;\"", html);
        assertEquals(html, attrs.toString());
    }

    @Test
    public void testHtml_xmlSyntax() throws IOException {
        Attributes attrs = new Attributes();
        attrs.put("disabled", null);
        attrs.put("id", "1");

        Document.OutputSettings out = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder sb = new StringBuilder();
        attrs.html(sb, out);

        assertEquals(" disabled=\"\" id=\"1\"", sb.toString());
    }

    @Test
    public void testHtml_throwsSerializationException() {
        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        Appendable throwingAppendable = new Appendable() {
            @Override
            public Appendable append(CharSequence csq) throws IOException {
                throw new IOException("Simulated IO exception");
            }

            @Override
            public Appendable append(CharSequence csq, int start, int end) throws IOException {
                throw new IOException("Simulated IO exception");
            }

            @Override
            public Appendable append(char c) throws IOException {
                throw new IOException("Simulated IO exception");
            }
        };

        try {
            attrs.html(throwingAppendable, new Document.OutputSettings());
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Simulated IO exception", e.getMessage());
        }
    }

    @Test
    public void testEqualsAndHashCode() {
        Attributes a1 = new Attributes();
        a1.put("k1", "v1");
        a1.put("k2", "v2");

        Attributes a2 = new Attributes();
        a2.put("k1", "v1");
        a2.put("k2", "v2");

        Attributes a3 = new Attributes();
        a3.put("k1", "v1");

        Attributes a4 = new Attributes();
        a4.put("k1", "diff");
        a4.put("k2", "v2");

        assertEquals(a1, a1);
        assertEquals(a1, a2);
        assertEquals(a1.hashCode(), a2.hashCode());

        assertNotEquals(a1, null);
        assertNotEquals(a1, "some-string");
        assertNotEquals(a1, a3);
        assertNotEquals(a1, a4);
    }

    @Test
    public void testClone() {
        Attributes original = new Attributes();
        original.put("k1", "v1");
        original.put("k2", "v2");

        Attributes clone = original.clone();
        assertEquals(original, clone);
        assertNotSame(original, clone);

        clone.put("k3", "v3");
        assertEquals(2, original.size());
        assertEquals(3, clone.size());
        assertFalse(original.hasKey("k3"));
    }

    @Test
    public void testNormalize() {
        Attributes attrs = new Attributes();
        attrs.put("HEaDeR", "value1");
        attrs.put("SRC", "value2");

        attrs.normalize();
        assertTrue(attrs.hasKey("header"));
        assertTrue(attrs.hasKey("src"));
        assertFalse(attrs.hasKey("HEaDeR"));
        assertFalse(attrs.hasKey("SRC"));
        assertEquals("value1", attrs.get("header"));
        assertEquals("value2", attrs.get("src"));
    }

    @Test
    public void testCheckNotNull() {
        assertEquals("", Attributes.checkNotNull(null));
        assertEquals("val", Attributes.checkNotNull("val"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexOfKey_nullKey_throwsException() {
        Attributes attrs = new Attributes();
        attrs.indexOfKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexOfKeyIgnoreCase_nullKey_throwsException() {
        Attributes attrs = new Attributes();
        attrs.hasKeyIgnoreCase(null);
    }
}
