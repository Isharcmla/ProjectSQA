package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class LeafNodeTest {

    // Concrete subclass used purely to allow instantiation of the abstract LeafNode class.
    // Node's remaining abstract contract (nodeName / outerHtmlHead / outerHtmlTail) is
    // implemented minimally since full Node source was not provided.
    static class TestLeaf extends LeafNode {
        private final String name;

        TestLeaf(String name) {
            this.name = name;
        }

        TestLeaf() {
            this("leaf");
        }

        @Override
        public String nodeName() {
            return name;
        }

        @Override
        protected void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
            accum.append("<").append(nodeName()).append(">");
        }

        @Override
        protected void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
            accum.append("</").append(nodeName()).append(">");
        }
    }

    private TestLeaf leaf;

    @Before
    public void setUp() {
        leaf = new TestLeaf("leaf");
    }

    // ---------- hasAttributes / attributes ----------

    @Test
    public void testHasAttributes_initiallyFalse() {
        assertFalse(leaf.hasAttributes());
    }

    @Test
    public void testAttributes_createsAttributesObjectWhenNoneExists() {
        Attributes attrs = leaf.attributes();
        assertNotNull(attrs);
        assertTrue(leaf.hasAttributes());
    }

    @Test
    public void testAttributes_withExistingStringValue_migratesToAttributes() {
        leaf.coreValue("hello");
        assertFalse(leaf.hasAttributes()); // still stored as raw string
        Attributes attrs = leaf.attributes();
        assertTrue(leaf.hasAttributes());
        assertEquals("hello", attrs.get(leaf.nodeName()));
    }

    @Test
    public void testAttributes_calledTwice_returnsSameInstance() {
        Attributes first = leaf.attributes();
        Attributes second = leaf.attributes();
        assertSame(first, second);
    }

    // ---------- coreValue ----------

    @Test
    public void testCoreValue_setAndGet() {
        leaf.coreValue("testValue");
        assertEquals("testValue", leaf.coreValue());
    }

    @Test
    public void testCoreValue_defaultWhenNotSet_returnsNull() {
        // value field starts null; attr(nodeName()) with no attributes casts null value to String
        assertNull(leaf.coreValue());
    }

    @Test
    public void testCoreValue_setEmptyString() {
        leaf.coreValue("");
        assertEquals("", leaf.coreValue());
    }

    // ---------- attr(String key) getter ----------

    @Test
    public void testAttr_getKeyEqualsNodeName_noAttributes_returnsStoredValue() {
        leaf.coreValue("value1");
        assertEquals("value1", leaf.attr(leaf.nodeName()));
    }

    @Test
    public void testAttr_getKeyNotEqualsNodeName_noAttributes_returnsEmptyString() {
        assertEquals("", leaf.attr("someOtherKey"));
    }

    @Test
    public void testAttr_getAfterAttributesCreated_delegatesToSuper() {
        leaf.attr("customKey", "customValue");
        assertEquals("customValue", leaf.attr("customKey"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_getNullKey_throwsException() {
        leaf.attr((String) null);
    }

    // ---------- attr(String key, String value) setter ----------

    @Test
    public void testAttr_setKeyEqualsNodeName_storesAsStringValue() {
        Node result = leaf.attr(leaf.nodeName(), "myValue");
        assertNotNull(result);
        assertFalse(leaf.hasAttributes());
        assertEquals("myValue", leaf.attr(leaf.nodeName()));
    }

    @Test
    public void testAttr_setKeyDifferentFromNodeName_createsAttributes() {
        leaf.attr("customKey", "customValue");
        assertTrue(leaf.hasAttributes());
        assertEquals("customValue", leaf.attr("customKey"));
    }

    @Test
    public void testAttr_setMultipleAttributes_usesAttributesMap() {
        leaf.attr("key1", "value1");
        leaf.attr("key2", "value2");
        assertTrue(leaf.hasAttributes());
        assertEquals("value1", leaf.attr("key1"));
        assertEquals("value2", leaf.attr("key2"));
    }

    @Test
    public void testAttr_setEmptyValue_storesEmptyString() {
        leaf.attr(leaf.nodeName(), "");
        assertEquals("", leaf.attr(leaf.nodeName()));
    }

    // ---------- hasAttr ----------

    @Test
    public void testHasAttr_existingKey_returnsTrue() {
        leaf.attr("key1", "value1");
        assertTrue(leaf.hasAttr("key1"));
    }

    @Test
    public void testHasAttr_nonExistingKey_returnsFalse() {
        assertFalse(leaf.hasAttr("nonexistent"));
    }

    // ---------- removeAttr ----------

    @Test
    public void testRemoveAttr_existingKey_removesSuccessfully() {
        leaf.attr("key1", "value1");
        leaf.removeAttr("key1");
        assertFalse(leaf.hasAttr("key1"));
    }

    @Test
    public void testRemoveAttr_nonExistingKey_noExceptionThrown() {
        Node result = leaf.removeAttr("nonexistent");
        assertNotNull(result);
    }

    @Test
    public void testRemoveAttr_returnsSelf() {
        leaf.attr("key1", "value1");
        Node result = leaf.removeAttr("key1");
        assertSame(leaf, result);
    }

    // ---------- absUrl ----------

    @Test
    public void testAbsUrl_withNoKeySet_returnsEmptyString() {
        String result = leaf.absUrl("href");
        assertEquals("", result);
    }

    @Test
    public void testAbsUrl_withRelativeValueAndNoBaseUri_doesNotThrow() {
        leaf.attr("href", "test.html");
        String result = leaf.absUrl("href");
        assertNotNull(result);
    }

    // ---------- baseUri ----------

    @Test
    public void testBaseUri_noParent_returnsEmptyString() {
        assertEquals("", leaf.baseUri());
    }

    // ---------- doSetBaseUri ----------

    @Test
    public void testDoSetBaseUri_noop_doesNotThrowAndHasNoEffect() {
        leaf.doSetBaseUri("http://example.com/");
        assertEquals("", leaf.baseUri());
    }

    // ---------- childNodeSize ----------

    @Test
    public void testChildNodeSize_alwaysZero() {
        assertEquals(0, leaf.childNodeSize());
    }

    // ---------- ensureChildNodes ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testEnsureChildNodes_throwsUnsupportedOperationException() {
        leaf.ensureChildNodes();
    }

    // ---------- additional edge cases ----------

    @Test
    public void testHasAttributes_afterAttrSetWithDifferentNodeName_true() {
        TestLeaf anotherLeaf = new TestLeaf("different");
        anotherLeaf.attr("notNodeName", "val");
        assertTrue(anotherLeaf.hasAttributes());
    }

    @Test
    public void testAttr_getterOnDifferentNodeNameInstance_returnsEmptyStringForUnmatchedKey() {
        TestLeaf anotherLeaf = new TestLeaf("other");
        assertEquals("", anotherLeaf.attr("random"));
    }
}
