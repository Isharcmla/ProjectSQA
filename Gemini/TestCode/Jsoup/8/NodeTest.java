package org.jsoup.nodes;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    private static class ConcreteNode extends Node {
        private String name;

        ConcreteNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
            this.name = "concrete";
        }

        ConcreteNode(String baseUri) {
            super(baseUri);
            this.name = "concrete";
        }

        ConcreteNode() {
            super();
            this.name = "concrete";
        }

        ConcreteNode(String name, String baseUri) {
            super(baseUri);
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
    }

    @Test
    public void testConstructor_withBaseUriAndAttributes_initializesCorrectly() {
        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        ConcreteNode node = new ConcreteNode("http://example.com/ ", attrs);

        assertEquals("http://example.com/", node.baseUri());
        assertEquals("val", node.attr("key"));
        assertEquals(0, node.childNodes().size());
    }

    @Test
    public void testConstructor_withBaseUriOnly_initializesCorrectly() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        assertEquals("http://example.com/", node.baseUri());
        assertNotNull(node.attributes());
        assertEquals(0, node.childNodes().size());
    }

    @Test
    public void testDefaultConstructor_initializesCorrectly() {
        ConcreteNode node = new ConcreteNode();
        assertNull(node.baseUri());
        assertNull(node.attributes());
        assertEquals(0, node.childNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullBaseUri_throwsException() {
        new ConcreteNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullAttributes_throwsException() {
        new ConcreteNode("http://example.com/", null);
    }

    @Test
    public void testAttr_getAndSetAttribute() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.attr("href", "/index.html");

        assertEquals("/index.html", node.attr("href"));
        assertTrue(node.hasAttr("href"));
        assertFalse(node.hasAttr("nonexistent"));
        assertEquals("", node.attr("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.attr(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.hasAttr(null);
    }

    @Test
    public void testAttr_absPrefix_returnsAbsoluteUrl() {
        ConcreteNode node = new ConcreteNode("http://example.com/path/");
        node.attr("href", "index.html");

        assertEquals("http://example.com/path/index.html", node.attr("abs:href"));
        assertEquals("", node.attr("abs:missing"));

        node.attr("abs:custom", "directValue");
        assertEquals("directValue", node.attr("abs:custom"));
    }

    @Test
    public void testRemoveAttr_removesExistingAttribute() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.attr("title", "test title");
        assertTrue(node.hasAttr("title"));

        Node result = node.removeAttr("title");
        assertSame(node, result);
        assertFalse(node.hasAttr("title"));
        assertEquals("", node.attr("title"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.removeAttr(null);
    }

    @Test
    public void testSetBaseUri_validUri() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.setBaseUri("http://example.org/new");
        assertEquals("http://example.org/new", node.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_nullUri_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.setBaseUri(null);
    }

    @Test
    public void testAbsUrl_variousScenarios() {
        ConcreteNode node = new ConcreteNode("http://example.com/dir/file.html");
        node.attr("href", "page.html");
        assertEquals("http://example.com/dir/page.html", node.absUrl("href"));

        node.attr("absLink", "http://other.com/path");
        assertEquals("http://other.com/path", node.absUrl("absLink"));

        assertEquals("", node.absUrl("notfound"));

        ConcreteNode invalidBaseNode = new ConcreteNode("not a valid url");
        invalidBaseNode.attr("absLink", "http://valid.com/");
        invalidBaseNode.attr("relLink", "page.html");
        assertEquals("http://valid.com/", invalidBaseNode.absUrl("absLink"));
        assertEquals("", invalidBaseNode.absUrl("relLink"));

        ConcreteNode malformedAttrNode = new ConcreteNode("http://example.com/");
        malformedAttrNode.attr("badLink", "http://[invalid-host");
        assertEquals("", malformedAttrNode.absUrl("badLink"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.absUrl("");
    }

    @Test
    public void testAddChildren_andChildRetrieval() {
        ConcreteNode parent = new ConcreteNode("http://example.com/");
        ConcreteNode child1 = new ConcreteNode("http://example.com/");
        ConcreteNode child2 = new ConcreteNode("http://example.com/");

        parent.addChildren(child1, child2);

        assertEquals(2, parent.childNodes().size());
        assertSame(child1, parent.childNode(0));
        assertSame(child2, parent.childNode(1));
        assertSame(parent, child1.parent());
        assertSame(parent, child2.parent());
        assertEquals(0, child1.siblingIndex().intValue());
        assertEquals(1, child2.siblingIndex().intValue());

        Node[] childArray = parent.childNodesAsArray();
        assertEquals(2, childArray.length);
        assertSame(child1, childArray[0]);
        assertSame(child2, childArray[1]);
    }

    @Test
    public void testAddChildrenAtIndex() {
        ConcreteNode parent = new ConcreteNode("http://example.com/");
        ConcreteNode child1 = new ConcreteNode("http://example.com/");
        ConcreteNode child2 = new ConcreteNode("http://example.com/");
        ConcreteNode insert1 = new ConcreteNode("http://example.com/");
        ConcreteNode insert2 = new ConcreteNode("http://example.com/");

        parent.addChildren(child1, child2);
        parent.addChildren(1, insert1, insert2);

        assertEquals(4, parent.childNodes().size());
        assertSame(child1, parent.childNode(0));
        assertSame(insert1, parent.childNode(1));
        assertSame(insert2, parent.childNode(2));
        assertSame(child2, parent.childNode(3));

        for (int i = 0; i < parent.childNodes().size(); i++) {
            assertEquals(i, parent.childNode(i).siblingIndex().intValue());
        }
    }

    @Test
    public void testReparentChild_movesChildFromOldParentToNewParent() {
        ConcreteNode oldParent = new ConcreteNode("http://example.com/");
        ConcreteNode newParent = new ConcreteNode("http://example.com/");
        ConcreteNode child = new ConcreteNode("http://example.com/");

        oldParent.addChildren(child);
        assertEquals(1, oldParent.childNodes().size());
        assertSame(oldParent, child.parent());

        newParent.addChildren(child);
        assertEquals(0, oldParent.childNodes().size());
        assertEquals(1, newParent.childNodes().size());
        assertSame(newParent, child.parent());
    }

    @Test
    public void testSetParentNode_replacesExistingParent() {
        ConcreteNode parent1 = new ConcreteNode("http://example.com/");
        ConcreteNode parent2 = new ConcreteNode("http://example.com/");
        ConcreteNode child = new ConcreteNode("http://example.com/");

        parent1.addChildren(child);
        child.setParentNode(parent2);

        assertEquals(0, parent1.childNodes().size());
        assertSame(parent2, child.parent());
    }

    @Test
    public void testReplaceChild() {
        ConcreteNode parent = new ConcreteNode("http://example.com/");
        ConcreteNode child1 = new ConcreteNode("http://example.com/");
        ConcreteNode child2 = new ConcreteNode("http://example.com/");
        ConcreteNode replacement = new ConcreteNode("http://example.com/");

        parent.addChildren(child1, child2);

        ConcreteNode otherParent = new ConcreteNode("http://example.com/");
        otherParent.addChildren(replacement);

        parent.replaceChild(child1, replacement);

        assertEquals(2, parent.childNodes().size());
        assertSame(replacement, parent.childNode(0));
        assertSame(parent, replacement.parent());
        assertEquals(0, replacement.siblingIndex().intValue());
        assertNull(child1.parent());
        assertEquals(0, otherParent.childNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChild_notDirectChild_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com/");
        ConcreteNode foreignNode = new ConcreteNode("http://example.com/");
        ConcreteNode replacement = new ConcreteNode("http://example.com/");

        parent.replaceChild(foreignNode, replacement);
    }

    @Test
    public void testRemoveChild() {
        ConcreteNode parent = new ConcreteNode("http://example.com/");
        ConcreteNode child1 = new ConcreteNode("http://example.com/");
        ConcreteNode child2 = new ConcreteNode("http://example.com/");
        ConcreteNode child3 = new ConcreteNode("http://example.com/");

        parent.addChildren(child1, child2, child3);
        parent.removeChild(child2);

        assertEquals(2, parent.childNodes().size());
        assertSame(child1, parent.childNode(0));
        assertSame(child3, parent.childNode(1));
        assertNull(child2.parent());
        assertEquals(0, child1.siblingIndex().intValue());
        assertEquals(1, child3.siblingIndex().intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveChild_notDirectChild_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com/");
        ConcreteNode foreignNode = new ConcreteNode("http://example.com/");
        parent.removeChild(foreignNode);
    }

    @Test
    public void testRemove_nodeWithParent() {
        ConcreteNode parent = new ConcreteNode("http://example.com/");
        ConcreteNode child = new ConcreteNode("http://example.com/");

        parent.addChildren(child);
        child.remove();

        assertEquals(0, parent.childNodes().size());
        assertNull(child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_nodeWithoutParent_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        node.remove();
    }

    @Test
    public void testReplaceWith() {
        ConcreteNode parent = new ConcreteNode("http://example.com/");
        ConcreteNode child1 = new ConcreteNode("http://example.com/");
        ConcreteNode child2 = new ConcreteNode("http://example.com/");

        parent.addChildren(child1);
        child1.replaceWith(child2);

        assertEquals(1, parent.childNodes().size());
        assertSame(child2, parent.childNode(0));
        assertSame(parent, child2.parent());
        assertNull(child1.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_nullNode_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com/");
        ConcreteNode child = new ConcreteNode("http://example.com/");
        parent.addChildren(child);

        child.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_noParent_throwsException() {
        ConcreteNode node1 = new ConcreteNode("http://example.com/");
        ConcreteNode node2 = new ConcreteNode("http://example.com/");

        node1.replaceWith(node2);
    }

    @Test
    public void testSiblingsNavigation() {
        ConcreteNode root = new ConcreteNode("http://example.com/");
        ConcreteNode child1 = new ConcreteNode("http://example.com/");
        ConcreteNode child2 = new ConcreteNode("http://example.com/");
        ConcreteNode child3 = new ConcreteNode("http://example.com/");

        root.addChildren(child1, child2, child3);

        List<Node> siblings = child1.siblingNodes();
        assertEquals(3, siblings.size());
        assertSame(child1, siblings.get(0));

        assertNull(child1.previousSibling());
        assertSame(child2, child1.nextSibling());

        assertSame(child1, child2.previousSibling());
        assertSame(child3, child2.nextSibling());

        assertSame(child2, child3.previousSibling());
        assertNull(child3.nextSibling());

        assertNull(root.nextSibling());
        assertNull(root.previousSibling());
    }

    @Test
    public void testOwnerDocument() {
        Document doc = new Document("http://example.com/");
        ConcreteNode parent = new ConcreteNode("http://example.com/");
        ConcreteNode child = new ConcreteNode("http://example.com/");

        assertSame(doc, doc.ownerDocument());
        assertNull(parent.ownerDocument());

        doc.addChildren(parent);
        parent.addChildren(child);

        assertSame(doc, parent.ownerDocument());
        assertSame(doc, child.ownerDocument());
    }

    @Test
    public void testOuterHtmlAndToString() {
        Document doc = new Document("http://example.com/");
        ConcreteNode node = new ConcreteNode("custom", "http://example.com/");
        TextNode text = new TextNode("hello", "http://example.com/");

        doc.addChildren(node);
        node.addChildren(text);

        String html = node.outerHtml();
        assertEquals("<custom>hello</custom>", html);
        assertEquals("<custom>hello</custom>", node.toString());
    }

    @Test
    public void testIndent() {
        ConcreteNode node = new ConcreteNode("http://example.com/");
        StringBuilder sb = new StringBuilder("content");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(2);

        node.indent(sb, 2, settings);
        assertEquals("content\n    ", sb.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        ConcreteNode node1 = new ConcreteNode("http://example.com/");
        ConcreteNode node2 = new ConcreteNode("http://example.com/");

        assertTrue(node1.equals(node1));
        assertFalse(node1.equals(node2));
        assertFalse(node1.equals(null));
        assertFalse(node1.equals("string"));

        ConcreteNode noAttrNode = new ConcreteNode();
        int hash1 = noAttrNode.hashCode();
        assertEquals(0, hash1);

        node1.attr("k", "v");
        assertTrue(node1.hashCode() != 0);

        ConcreteNode parent = new ConcreteNode("http://example.com/");
        parent.addChildren(node1);
        assertTrue(node1.hashCode() != 0);
    }
}
