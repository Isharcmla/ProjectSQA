package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class LeafNodeTest {

    private static class ConcreteLeafNode extends LeafNode {
        private final String nodeName;

        ConcreteLeafNode(String nodeName) {
            this.nodeName = nodeName;
        }

        ConcreteLeafNode(String nodeName, String value) {
            this.nodeName = nodeName;
            this.value = value;
        }

        @Override
        public String nodeName() {
            return nodeName;
        }

        @Override
        void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        }

        @Override
        void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        }
    }

    @Test
    public void testHasAttributes_initiallyFalse_returnsFalse() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        assertFalse(node.hasAttributes());
    }

    @Test
    public void testAttributes_whenValueIsNull_initializesEmptyAttributes() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        Attributes attrs = node.attributes();

        assertNotNull(attrs);
        assertTrue(node.hasAttributes());
        assertEquals(0, attrs.size());
    }

    @Test
    public void testAttributes_whenValueIsString_initializesAttributesWithCoreValue() {
        ConcreteLeafNode node = new ConcreteLeafNode("text", "hello world");
        Attributes attrs = node.attributes();

        assertNotNull(attrs);
        assertTrue(node.hasAttributes());
        assertEquals(1, attrs.size());
        assertEquals("hello world", attrs.get("text"));
    }

    @Test
    public void testAttributes_whenAlreadyHasAttributes_returnsSameAttributes() {
        ConcreteLeafNode node = new ConcreteLeafNode("text", "initial");
        Attributes first = node.attributes();
        Attributes second = node.attributes();

        assertTrue(node.hasAttributes());
        assertEquals(first, second);
    }

    @Test
    public void testCoreValue_getAndSet_success() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        node.coreValue("sample");

        assertEquals("sample", node.coreValue());
        assertFalse(node.hasAttributes());

        node.coreValue("updated");
        assertEquals("updated", node.coreValue());
        assertFalse(node.hasAttributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_nullKey_throwsIllegalArgumentException() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        node.attr(null);
    }

    @Test
    public void testAttr_whenNoAttributesAndKeyMatchesNodeName_returnsValue() {
        ConcreteLeafNode node = new ConcreteLeafNode("text", "my value");
        assertEquals("my value", node.attr("text"));
        assertFalse(node.hasAttributes());
    }

    @Test
    public void testAttr_whenNoAttributesAndKeyDoesNotMatchNodeName_returnsEmptyString() {
        ConcreteLeafNode node = new ConcreteLeafNode("text", "my value");
        assertEquals("", node.attr("otherKey"));
        assertFalse(node.hasAttributes());
    }

    @Test
    public void testAttr_whenHasAttributes_delegatesToSuper() {
        ConcreteLeafNode node = new ConcreteLeafNode("text", "my value");
        node.attr("customKey", "customValue");

        assertTrue(node.hasAttributes());
        assertEquals("my value", node.attr("text"));
        assertEquals("customValue", node.attr("customKey"));
        assertEquals("", node.attr("nonExistentKey"));
    }

    @Test
    public void testAttr_set_whenNoAttributesAndKeyMatchesNodeName_updatesValueDirectly() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        Node returnedNode = node.attr("text", "updated value");

        assertEquals(node, returnedNode);
        assertFalse(node.hasAttributes());
        assertEquals("updated value", node.attr("text"));
    }

    @Test
    public void testAttr_set_whenNoAttributesAndKeyDoesNotMatch_createsAttributesAndSetsValue() {
        ConcreteLeafNode node = new ConcreteLeafNode("text", "core value");
        Node returnedNode = node.attr("class", "my-class");

        assertEquals(node, returnedNode);
        assertTrue(node.hasAttributes());
        assertEquals("core value", node.attr("text"));
        assertEquals("my-class", node.attr("class"));
    }

    @Test
    public void testAttr_set_whenAlreadyHasAttributes_updatesSuperAttributes() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        node.attr("first", "1");
        assertTrue(node.hasAttributes());

        node.attr("second", "2");
        node.attr("first", "1-updated");

        assertEquals("1-updated", node.attr("first"));
        assertEquals("2", node.attr("second"));
    }

    @Test
    public void testHasAttr_keyPresentAndAbsent_returnsCorrectBoolean() {
        ConcreteLeafNode node = new ConcreteLeafNode("text", "some text");

        assertFalse(node.hasAttributes());
        assertTrue(node.hasAttr("text"));
        assertFalse(node.hasAttr("nonExistent"));

        node.attr("customKey", "customVal");
        assertTrue(node.hasAttr("customKey"));
        assertFalse(node.hasAttr("anotherNonExistent"));
    }

    @Test
    public void testRemoveAttr_removesAttributeSuccessfully() {
        ConcreteLeafNode node = new ConcreteLeafNode("text", "initial value");
        node.attr("extra", "value");
        assertTrue(node.hasAttr("extra"));

        Node returnedNode = node.removeAttr("extra");
        assertEquals(node, returnedNode);
        assertFalse(node.hasAttr("extra"));

        node.removeAttr("text");
        assertFalse(node.hasAttr("text"));
    }

    @Test
    public void testAbsUrl_returnsAbsoluteUrl() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        Element parent = new Element("div");
        parent.setBaseUri("https://example.com/dir/");
        parent.appendChild(node);

        node.attr("href", "sub/page.html");
        assertEquals("https://example.com/dir/sub/page.html", node.absUrl("href"));

        assertEquals("", node.absUrl("nonExistent"));
    }

    @Test
    public void testBaseUri_withoutParent_returnsEmptyString() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        assertEquals("", node.baseUri());
    }

    @Test
    public void testBaseUri_withParent_returnsParentBaseUri() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        Element parent = new Element("div");
        parent.setBaseUri("https://example.com/");
        parent.appendChild(node);

        assertEquals("https://example.com/", node.baseUri());
    }

    @Test
    public void testDoSetBaseUri_isNoop() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        node.doSetBaseUri("https://example.com/");
        assertEquals("", node.baseUri());
    }

    @Test
    public void testChildNodeSize_alwaysReturnsZero() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        assertEquals(0, node.childNodeSize());
    }

    @Test
    public void testEnsureChildNodes_throwsUnsupportedOperationException() {
        ConcreteLeafNode node = new ConcreteLeafNode("text");
        try {
            node.ensureChildNodes();
            fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException e) {
            assertEquals("Leaf Nodes do not have child nodes.", e.getMessage());
        }
    }
}
