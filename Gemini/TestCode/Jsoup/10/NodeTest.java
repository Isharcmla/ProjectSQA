package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NodeTest {

    private static class ConcreteNode extends Node {
        private String name;

        public ConcreteNode() {
            super();
            this.name = "concrete";
        }

        public ConcreteNode(String baseUri) {
            super(baseUri);
            this.name = "concrete";
        }

        public ConcreteNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
            this.name = "concrete";
        }

        public ConcreteNode(String name, String baseUri, Attributes attributes) {
            super(baseUri, attributes);
            this.name = name;
        }

        @Override
        public String nodeName() {
            return name;
        }

        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("<").append(nodeName()).append(">");
        }

        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</").append(nodeName()).append(">");
        }

        // Expose protected methods for testing
        @Override
        public Node[] childNodesAsArray() {
            return super.childNodesAsArray();
        }

        @Override
        public void setParentNode(Node parentNode) {
            super.setParentNode(parentNode);
        }

        @Override
        public void replaceChild(Node out, Node in) {
            super.replaceChild(out, in);
        }

        @Override
        public void removeChild(Node out) {
            super.removeChild(out);
        }

        @Override
        public void addChildren(Node... children) {
            super.addChildren(children);
        }

        @Override
        public void addChildren(int index, Node... children) {
            super.addChildren(index, children);
        }

        @Override
        public void setSiblingIndex(int siblingIndex) {
            super.setSiblingIndex(siblingIndex);
        }

        @Override
        public void outerHtml(StringBuilder accum) {
            super.outerHtml(accum);
        }

        @Override
        public void indent(StringBuilder accum, int depth, Document.OutputSettings out) {
            super.indent(accum, depth, out);
        }

        @Override
        public Node doClone(Node parent) {
            return super.doClone(parent);
        }
    }

    @Test
    public void testDefaultConstructor_noArgs_initializesEmpty() {
        ConcreteNode node = new ConcreteNode();
        Assert.assertNull(node.baseUri());
        Assert.assertNull(node.attributes());
        Assert.assertNull(node.parent());
        Assert.assertTrue(node.childNodes().isEmpty());
    }

    @Test
    public void testConstructor_baseUriOnly_initializesCorrectly() {
        ConcreteNode node = new ConcreteNode("http://example.com/ ");
        Assert.assertEquals("http://example.com/", node.baseUri());
        Assert.assertNotNull(node.attributes());
        Assert.assertTrue(node.childNodes().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullBaseUri_throwsException() {
        new ConcreteNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullAttributes_throwsException() {
        new ConcreteNode("http://example.com", null);
    }

    @Test
    public void testAttr_existingAttribute_returnsValue() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("key", "value");
        Assert.assertEquals("value", node.attr("key"));
    }

    @Test
    public void testAttr_nonExistingAttribute_returnsEmptyString() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        Assert.assertEquals("", node.attr("nonExistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr(null);
    }

    @Test
    public void testAttr_absPrefixExistingAttr_returnsAbsoluteUrl() {
        ConcreteNode node = new ConcreteNode("http://example.com/path/");
        node.attr("href", "sub/page.html");
        Assert.assertEquals("http://example.com/path/sub/page.html", node.attr("abs:href"));
        Assert.assertEquals("http://example.com/path/sub/page.html", node.attr("ABS:href"));
    }

    @Test
    public void testAttr_absPrefixNonExistingAttr_returnsEmptyString() {
        ConcreteNode node = new ConcreteNode("http://example.com/path/");
        Assert.assertEquals("", node.attr("abs:nonexistent"));
    }

    @Test
    public void testHasAttr_existingAndNonExisting() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("testKey", "testVal");
        Assert.assertTrue(node.hasAttr("testKey"));
        Assert.assertFalse(node.hasAttr("otherKey"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.hasAttr(null);
    }

    @Test
    public void testRemoveAttr_existingKey_removesAttribute() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("testKey", "testVal");
        Node returned = node.removeAttr("testKey");
        Assert.assertSame(node, returned);
        Assert.assertFalse(node.hasAttr("testKey"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.removeAttr(null);
    }

    @Test
    public void testBaseUri_setAndGet() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.setBaseUri("http://example.org/dir");
        Assert.assertEquals("http://example.org/dir", node.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_nullValue_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.setBaseUri(null);
    }

    @Test
    public void testAbsUrl_validRelativeUrl_returnsAbsoluteUrl() {
        ConcreteNode node = new ConcreteNode("http://example.com/foo/bar.html");
        node.attr("href", "../baz.html");
        Assert.assertEquals("http://example.com/baz.html", node.absUrl("href"));
    }

    @Test
    public void testAbsUrl_attributeNotFound_returnsEmptyString() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        Assert.assertEquals("", node.absUrl("href"));
    }

    @Test
    public void testAbsUrl_invalidBaseUriWithAbsoluteAttr_returnsAttributeUrl() {
        ConcreteNode node = new ConcreteNode("invalid-uri");
        node.attr("href", "http://example.com/test");
        Assert.assertEquals("http://example.com/test", node.absUrl("href"));
    }

    @Test
    public void testAbsUrl_invalidBaseUriWithRelativeAttr_returnsEmptyString() {
        ConcreteNode node = new ConcreteNode("invalid-uri");
        node.attr("href", "relative.html");
        Assert.assertEquals("", node.absUrl("href"));
    }

    @Test
    public void testAbsUrl_validBaseUriWithInvalidRelativeUrl_returnsEmptyString() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.attr("href", "http://");
        Assert.assertEquals("", node.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.absUrl("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.absUrl(null);
    }

    @Test
    public void testChildNode_validIndex_returnsNode() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child = new ConcreteNode("http://example.com");
        parent.addChildren(child);

        Assert.assertSame(child, parent.childNode(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNode_invalidIndex_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        parent.childNode(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodes_returnsUnmodifiableList() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        parent.childNodes().add(new ConcreteNode());
    }

    @Test
    public void testChildNodesAsArray_returnsCorrectArray() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("http://example.com");
        ConcreteNode child2 = new ConcreteNode("http://example.com");
        parent.addChildren(child1, child2);

        Node[] array = parent.childNodesAsArray();
        Assert.assertEquals(2, array.length);
        Assert.assertSame(child1, array(0, array));
        Assert.assertSame(child2, array(1, array));
    }

    private Node array(int idx, Node[] arr) {
        return arr[idx];
    }

    @Test
    public void testOwnerDocument_onDocumentInstance_returnsSelf() {
        Document doc = new Document("http://example.com");
        Assert.assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocument_detachedNode_returnsNull() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        Assert.assertNull(node.ownerDocument());
    }

    @Test
    public void testOwnerDocument_attachedToDocument_returnsDocument() {
        Document doc = new Document("http://example.com");
        Element body = doc.body();
        ConcreteNode node = new ConcreteNode("http://example.com");
        body.appendChild(node);

        Assert.assertSame(doc, node.ownerDocument());
    }

    @Test
    public void testRemove_attachedNode_removesFromParent() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child = new ConcreteNode("http://example.com");
        parent.addChildren(child);

        Assert.assertEquals(1, parent.childNodes().size());
        child.remove();
        Assert.assertEquals(0, parent.childNodes().size());
        Assert.assertNull(child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_nodeWithoutParent_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.remove();
    }

    @Test
    public void testReplaceWith_attachedNode_replacesCorrectly() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("http://example.com");
        ConcreteNode child2 = new ConcreteNode("http://example.com");
        ConcreteNode replacement = new ConcreteNode("http://example.com");

        parent.addChildren(child1, child2);
        child1.replaceWith(replacement);

        Assert.assertEquals(2, parent.childNodes().size());
        Assert.assertSame(replacement, parent.childNode(0));
        Assert.assertSame(parent, replacement.parent());
        Assert.assertEquals(Integer.valueOf(0), replacement.siblingIndex());
        Assert.assertNull(child1.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_nullReplacement_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child = new ConcreteNode("http://example.com");
        parent.addChildren(child);
        child.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_nodeWithoutParent_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        ConcreteNode replacement = new ConcreteNode("http://example.com");
        node.replaceWith(replacement);
    }

    @Test
    public void testSetParentNode_reparentsCorrectly() {
        ConcreteNode parent1 = new ConcreteNode("http://example.com");
        ConcreteNode parent2 = new ConcreteNode("http://example.com");
        ConcreteNode child = new ConcreteNode("http://example.com");

        parent1.addChildren(child);
        Assert.assertSame(parent1, child.parent());

        child.setParentNode(parent2);
        Assert.assertSame(parent2, child.parent());
        Assert.assertEquals(0, parent1.childNodes().size());
    }

    @Test
    public void testReplaceChild_inHasParent_reparentsIn() {
        ConcreteNode parent1 = new ConcreteNode("http://example.com");
        ConcreteNode parent2 = new ConcreteNode("http://example.com");
        ConcreteNode outNode = new ConcreteNode("http://example.com");
        ConcreteNode inNode = new ConcreteNode("http://example.com");

        parent1.addChildren(outNode);
        parent2.addChildren(inNode);

        parent1.replaceChild(outNode, inNode);

        Assert.assertSame(inNode, parent1.childNode(0));
        Assert.assertSame(parent1, inNode.parent());
        Assert.assertEquals(0, parent2.childNodes().size());
        Assert.assertNull(outNode.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChild_outNotChildOfThis_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode notAChild = new ConcreteNode("http://example.com");
        ConcreteNode inNode = new ConcreteNode("http://example.com");
        parent.replaceChild(notAChild, inNode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChild_inNull_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child = new ConcreteNode("http://example.com");
        parent.addChildren(child);
        parent.replaceChild(child, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveChild_notChildOfThis_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode notAChild = new ConcreteNode("http://example.com");
        parent.removeChild(notAChild);
    }

    @Test
    public void testAddChildrenWithIndex_insertsCorrectly() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child0 = new ConcreteNode("http://example.com");
        ConcreteNode child3 = new ConcreteNode("http://example.com");
        parent.addChildren(child0, child3);

        ConcreteNode child1 = new ConcreteNode("http://example.com");
        ConcreteNode child2 = new ConcreteNode("http://example.com");

        parent.addChildren(1, child1, child2);

        Assert.assertEquals(4, parent.childNodes().size());
        Assert.assertSame(child0, parent.childNode(0));
        Assert.assertSame(child1, parent.childNode(1));
        Assert.assertSame(child2, parent.childNode(2));
        Assert.assertSame(child3, parent.childNode(3));

        Assert.assertEquals(Integer.valueOf(0), child0.siblingIndex());
        Assert.assertEquals(Integer.valueOf(1), child1.siblingIndex());
        Assert.assertEquals(Integer.valueOf(2), child2.siblingIndex());
        Assert.assertEquals(Integer.valueOf(3), child3.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddChildrenWithIndex_nullElement_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        parent.addChildren(0, (Node) null);
    }

    @Test
    public void testSiblings_navigationAndEdgeCases() {
        ConcreteNode root = new ConcreteNode("http://example.com");
        ConcreteNode c0 = new ConcreteNode("http://example.com");
        ConcreteNode c1 = new ConcreteNode("http://example.com");
        ConcreteNode c2 = new ConcreteNode("http://example.com");

        // root has no parent
        Assert.assertNull(root.nextSibling());
        Assert.assertNull(root.previousSibling());

        root.addChildren(c0, c1, c2);

        List<Node> siblings = c0.siblingNodes();
        Assert.assertEquals(3, siblings.size());

        Assert.assertNull(c0.previousSibling());
        Assert.assertSame(c1, c0.nextSibling());

        Assert.assertSame(c0, c1.previousSibling());
        Assert.assertSame(c2, c1.nextSibling());

        Assert.assertSame(c1, c2.previousSibling());
        Assert.assertNull(c2.nextSibling());
    }

    @Test
    public void testOuterHtml_and_toString() {
        ConcreteNode parent = new ConcreteNode("parent", "http://example.com", new Attributes());
        ConcreteNode child = new ConcreteNode("child", "http://example.com", new Attributes());
        parent.addChildren(child);

        String expectedHtml = "<parent><child></child></parent>";
        Assert.assertEquals(expectedHtml, parent.outerHtml());
        Assert.assertEquals(expectedHtml, parent.toString());
    }

    @Test
    public void testOuterHtml_withTextNode_skipsTail() {
        ConcreteNode parent = new ConcreteNode("div", "http://example.com", new Attributes());
        TextNode text = new TextNode("Hello World", "http://example.com");
        parent.addChildren(text);

        String html = parent.outerHtml();
        Assert.assertTrue(html.contains("Hello World"));
    }

    @Test
    public void testIndent() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.indentAmount(2);

        node.indent(accum, 2, out);
        Assert.assertEquals("\n    ", accum.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        ConcreteNode node1 = new ConcreteNode("http://example.com");
        ConcreteNode node2 = new ConcreteNode("http://example.com");

        Assert.assertTrue(node1.equals(node1));
        Assert.assertFalse(node1.equals(node2));
        Assert.assertFalse(node1.equals(null));
        Assert.assertFalse(node1.equals("string"));

        ConcreteNode parent = new ConcreteNode("http://example.com");
        parent.addChildren(node1);

        int hash1 = node1.hashCode();
        Assert.assertNotEquals(0, hash1);

        ConcreteNode defaultNode = new ConcreteNode();
        Assert.assertEquals(0, defaultNode.hashCode());
    }

    @Test
    public void testClone_createsDeepCopyAndOrphan() {
        ConcreteNode parent = new ConcreteNode("parent", "http://example.com", new Attributes());
        parent.attr("k1", "v1");
        ConcreteNode child = new ConcreteNode("child", "http://example.com", new Attributes());
        child.attr("k2", "v2");
        parent.addChildren(child);

        Node clone = parent.clone();

        Assert.assertNotSame(parent, clone);
        Assert.assertNull(clone.parent());
        Assert.assertEquals(Integer.valueOf(0), clone.siblingIndex());
        Assert.assertEquals("http://example.com", clone.baseUri());
        Assert.assertEquals("v1", clone.attr("k1"));

        Assert.assertEquals(1, clone.childNodes().size());
        Node childClone = clone.childNode(0);
        Assert.assertNotSame(child, childClone);
        Assert.assertSame(clone, childClone.parent());
        Assert.assertEquals("v2", childClone.attr("k2"));

        // Modifying clone does not modify original
        clone.attr("k1", "modified");
        Assert.assertEquals("v1", parent.attr("k1"));
    }

    @Test
    public void testDoClone_withNullAttributes() {
        ConcreteNode node = new ConcreteNode();
        Node clone = node.clone();
        Assert.assertNull(clone.attributes());
        Assert.assertNull(clone.baseUri());
    }
}
