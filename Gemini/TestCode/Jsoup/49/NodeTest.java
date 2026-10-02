package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    private static class TestNode extends Node {
        private String name;

        TestNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
            this.name = "test";
        }

        TestNode(String baseUri) {
            super(baseUri);
            this.name = "test";
        }

        TestNode() {
            super();
            this.name = "test";
        }

        TestNode(String name, String baseUri) {
            super(baseUri);
            this.name = name;
        }

        @Override
        public String nodeName() {
            return name != null ? name : "test";
        }

        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            indent(accum, depth, out);
            accum.append("<").append(nodeName()).append(">");
        }

        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</").append(nodeName()).append(">");
        }
    }

    @Test
    public void testConstructors_validInputs_success() {
        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        TestNode node1 = new TestNode("  http://example.com/  ", attrs);
        assertEquals("http://example.com/", node1.baseUri());
        assertEquals("val", node1.attr("key"));

        TestNode node2 = new TestNode("http://example.com/");
        assertEquals("http://example.com/", node2.baseUri());
        assertNotNull(node2.attributes());

        TestNode node3 = new TestNode();
        assertNull(node3.baseUri());
        assertNull(node3.attributes());
        assertEquals(0, node3.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullBaseUri_throwsException() {
        new TestNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullAttributes_throwsException() {
        new TestNode("http://example.com", null);
    }

    @Test
    public void testAttr_and_hasAttr_and_removeAttr() {
        TestNode node = new TestNode("http://example.com/");
        node.attr("href", "/path/file.html");
        node.attr("title", "Test Title");

        assertTrue(node.hasAttr("href"));
        assertEquals("/path/file.html", node.attr("href"));
        assertEquals("Test Title", node.attr("title"));
        assertEquals("", node.attr("nonexistent"));
        assertFalse(node.hasAttr("nonexistent"));

        // abs: prefix tests
        assertEquals("http://example.com/path/file.html", node.attr("abs:href"));
        assertTrue(node.hasAttr("abs:href"));
        assertEquals("", node.attr("abs:title")); // title is not a URL, resolve returns "" or title, check absUrl

        node.attr("abs:custom", "customVal");
        assertTrue(node.hasAttr("abs:custom"));

        // Remove attribute
        Node returnedNode = node.removeAttr("title");
        assertSame(node, returnedNode);
        assertFalse(node.hasAttr("title"));
        assertEquals("", node.attr("title"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_nullKey_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.attr(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_nullKey_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.hasAttr(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_nullKey_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.removeAttr(null);
    }

    @Test
    public void testAbsUrl_variousScenarios() {
        TestNode node = new TestNode("http://example.com/sub/");
        node.attr("rel", "test.html");
        node.attr("abs", "http://other.com/index.html");

        assertEquals("http://example.com/sub/test.html", node.absUrl("rel"));
        assertEquals("http://other.com/index.html", node.absUrl("abs"));
        assertEquals("", node.absUrl("notfound"));

        TestNode emptyBase = new TestNode("");
        emptyBase.attr("href", "relative.html");
        assertEquals("", emptyBase.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.absUrl("");
    }

    @Test
    public void testSetBaseUri_descendantsUpdated() {
        TestNode parent = new TestNode("http://old.com");
        TestNode child = new TestNode("http://old.com");
        parent.addChildren(child);

        parent.setBaseUri("http://new.com");
        assertEquals("http://new.com", parent.baseUri());
        assertEquals("http://new.com", child.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_nullBaseUri_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.setBaseUri(null);
    }

    @Test
    public void testChildNodes_and_childNodeSize_and_childNode() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child1 = new TestNode("http://example.com");
        TestNode child2 = new TestNode("http://example.com");

        assertEquals(0, parent.childNodeSize());
        assertEquals(0, parent.childNodes().size());
        assertEquals(0, parent.childNodesAsArray().length);

        parent.addChildren(child1, child2);
        assertEquals(2, parent.childNodeSize());
        assertSame(child1, parent.childNode(0));
        assertSame(child2, parent.childNode(1));
        assertEquals(2, parent.childNodes().size());
        assertEquals(2, parent.childNodesAsArray().length);

        List<Node> copy = parent.childNodesCopy();
        assertEquals(2, copy.size());
        assertNotSame(child1, copy.get(0));
        assertEquals(child1, copy.get(0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodes_unmodifiable() {
        TestNode parent = new TestNode("http://example.com");
        parent.addChildren(new TestNode("http://example.com"));
        parent.childNodes().add(new TestNode("http://example.com"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNode_outOfBounds_throwsException() {
        TestNode parent = new TestNode("http://example.com");
        parent.childNode(0);
    }

    @Test
    public void testParent_and_ownerDocument() {
        Document doc = new Document("http://example.com");
        Element body = doc.body();
        TestNode node = new TestNode("http://example.com");

        assertNull(node.parent());
        assertNull(node.parentNode());
        assertNull(node.ownerDocument());
        assertSame(doc, doc.ownerDocument());

        body.appendChild(node);
        assertSame(body, node.parent());
        assertSame(body, node.parentNode());
        assertSame(doc, node.ownerDocument());
    }

    @Test
    public void testRemove_withParent_success() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child = new TestNode("http://example.com");
        parent.addChildren(child);

        assertSame(parent, child.parent());
        assertEquals(1, parent.childNodeSize());

        child.remove();
        assertNull(child.parent());
        assertEquals(0, parent.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_noParent_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.remove();
    }

    @Test
    public void testSiblings_navigation() {
        TestNode isolated = new TestNode("http://example.com");
        assertTrue(isolated.siblingNodes().isEmpty());
        assertNull(isolated.previousSibling());
        assertNull(isolated.nextSibling());

        TestNode parent = new TestNode("http://example.com");
        TestNode c1 = new TestNode("http://example.com");
        TestNode c2 = new TestNode("http://example.com");
        TestNode c3 = new TestNode("http://example.com");
        parent.addChildren(c1, c2, c3);

        assertEquals(0, c1.siblingIndex());
        assertEquals(1, c2.siblingIndex());
        assertEquals(2, c3.siblingIndex());

        assertEquals(2, c1.siblingNodes().size());
        assertTrue(c1.siblingNodes().contains(c2));
        assertTrue(c1.siblingNodes().contains(c3));
        assertFalse(c1.siblingNodes().contains(c1));

        assertNull(c1.previousSibling());
        assertSame(c2, c1.nextSibling());

        assertSame(c1, c2.previousSibling());
        assertSame(c3, c2.nextSibling());

        assertSame(c2, c3.previousSibling());
        assertNull(c3.nextSibling());
    }

    @Test
    public void testBefore_and_after_withNode() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child);

        Element prev = new Element(Tag.valueOf("p"), "http://example.com");
        Element next = new Element(Tag.valueOf("b"), "http://example.com");

        child.before(prev);
        child.after(next);

        assertEquals(3, parent.childNodeSize());
        assertSame(prev, parent.childNode(0));
        assertSame(child, parent.childNode(1));
        assertSame(next, parent.childNode(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBefore_node_noParent_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.before(new TestNode("http://example.com"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBefore_nullNode_throwsException() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child = new TestNode("http://example.com");
        parent.addChildren(child);
        child.before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfter_node_noParent_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.after(new TestNode("http://example.com"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfter_nullNode_throwsException() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child = new TestNode("http://example.com");
        parent.addChildren(child);
        child.after((Node) null);
    }

    @Test
    public void testBefore_and_after_withHtml() {
        Document doc = Jsoup.parse("<div><span>target</span></div>");
        Element span = doc.select("span").first();

        span.before("<p>before</p>");
        span.after("<b>after</b>");

        assertEquals("<div><p>before</p><span>target</span><b>after</b></div>", doc.body().html());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBefore_html_null_throwsException() {
        Document doc = Jsoup.parse("<div><span>target</span></div>");
        Element span = doc.select("span").first();
        span.before((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfter_html_null_throwsException() {
        Document doc = Jsoup.parse("<div><span>target</span></div>");
        Element span = doc.select("span").first();
        span.after((String) null);
    }

    @Test
    public void testWrap_and_unwrap() {
        Document doc = Jsoup.parse("<div><span>Two</span></div>");
        Element span = doc.select("span").first();

        span.wrap("<div class='outer'><div class='inner'></div></div>");
        assertEquals("<div><div class=\"outer\"><div class=\"inner\"><span>Two</span></div></div></div>", doc.body().html());

        // wrap with remainder elements
        span.wrap("<p class='a'></p><p class='b'></p>");
        assertEquals("<div><div class=\"outer\"><div class=\"inner\"><p class=\"a\"><span>Two</span><p class=\"b\"></p></p></div></div></div>", doc.body().html());

        // unwrap
        Document doc2 = Jsoup.parse("<div>One <span>Two <b>Three</b></span></div>");
        Element span2 = doc2.select("span").first();
        Node firstChild = span2.unwrap();
        assertNotNull(firstChild);
        assertEquals("Two ", ((TextNode) firstChild).text());
        assertEquals("<div>One Two <b>Three</b></div>", doc2.body().html());
    }

    @Test
    public void testWrap_noElementInHtml_returnsNull() {
        Document doc = Jsoup.parse("<div><span>Two</span></div>");
        Element span = doc.select("span").first();
        Node result = span.wrap("plain text");
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrap_emptyHtml_throwsException() {
        Document doc = Jsoup.parse("<div><span>Two</span></div>");
        Element span = doc.select("span").first();
        span.wrap("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnwrap_noParent_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.unwrap();
    }

    @Test
    public void testUnwrap_noChildren_returnsNull() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child);

        Node result = child.unwrap();
        assertNull(result);
        assertEquals(0, parent.childNodeSize());
    }

    @Test
    public void testReplaceWith() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);

        child1.replaceWith(child2);
        assertEquals(1, parent.childNodeSize());
        assertSame(child2, parent.childNode(0));
        assertNull(child1.parent());
        assertSame(parent, child2.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_nullNode_throwsException() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child = new TestNode("http://example.com");
        parent.addChildren(child);
        child.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_noParent_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.replaceWith(new TestNode("http://example.com"));
    }

    @Test
    public void testSetParentNode_reparentsExistingParent() {
        TestNode p1 = new TestNode("http://example.com");
        TestNode p2 = new TestNode("http://example.com");
        TestNode child = new TestNode("http://example.com");

        p1.addChildren(child);
        assertEquals(1, p1.childNodeSize());

        child.setParentNode(p2);
        assertEquals(0, p1.childNodeSize());
        assertSame(p2, child.parent());
    }

    @Test
    public void testReplaceChild_and_removeChild_internalValidation() {
        TestNode parent = new TestNode("http://example.com");
        TestNode child1 = new TestNode("http://example.com");
        TestNode child2 = new TestNode("http://example.com");
        TestNode outsider = new TestNode("http://example.com");

        parent.addChildren(child1);
        parent.replaceChild(child1, child2);
        assertSame(child2, parent.childNode(0));
        assertNull(child1.parent());

        try {
            parent.replaceChild(outsider, child1);
            fail("Expected exception for replacing child with different parent");
        } catch (IllegalArgumentException expected) {
        }

        try {
            parent.removeChild(outsider);
            fail("Expected exception for removing child with different parent");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testAddChildren_withIndex() {
        TestNode parent = new TestNode("http://example.com");
        TestNode c1 = new TestNode("http://example.com");
        TestNode c2 = new TestNode("http://example.com");
        TestNode c3 = new TestNode("http://example.com");

        parent.addChildren(c1, c3);
        parent.addChildren(1, c2);

        assertEquals(3, parent.childNodeSize());
        assertSame(c1, parent.childNode(0));
        assertSame(c2, parent.childNode(1));
        assertSame(c3, parent.childNode(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddChildren_nullElements_throwsException() {
        TestNode parent = new TestNode("http://example.com");
        parent.addChildren(0, new Node[]{null});
    }

    @Test
    public void testTraverse() {
        TestNode root = new TestNode("root", "http://example.com");
        TestNode child = new TestNode("child", "http://example.com");
        root.addChildren(child);

        final int[] count = {0};
        root.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {
                count[0]++;
            }

            public void tail(Node node, int depth) {
                count[0]++;
            }
        });

        assertEquals(4, count[0]); // 2 nodes * 2 (head + tail)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTraverse_nullVisitor_throwsException() {
        TestNode node = new TestNode("http://example.com");
        node.traverse(null);
    }

    @Test
    public void testOuterHtml_and_toString() {
        TestNode node = new TestNode("custom", "http://example.com");
        assertEquals("<custom></custom>", node.outerHtml());
        assertEquals("<custom></custom>", node.toString());

        // Test with #text node to cover OuterHtmlVisitor tail branch
        TextNode text = new TextNode("sample", "http://example.com");
        assertEquals("sample", text.outerHtml());
    }

    @Test
    public void testEquals_and_hashCode() {
        TestNode n1 = new TestNode("http://example.com");
        n1.attr("k", "v");
        TestNode n2 = new TestNode("http://example.com");
        n2.attr("k", "v");

        assertTrue(n1.equals(n1));
        assertTrue(n1.equals(n2));
        assertEquals(n1.hashCode(), n2.hashCode());

        assertFalse(n1.equals(null));
        assertFalse(n1.equals("a string"));

        TestNode n3 = new TestNode("http://example.com");
        n3.attr("k", "different");
        assertFalse(n1.equals(n3));

        TestNode n4 = new TestNode("http://example.com");
        n4.attr("k", "v");
        n4.addChildren(new TestNode("http://example.com"));
        assertFalse(n1.equals(n4));

        TestNode empty1 = new TestNode();
        TestNode empty2 = new TestNode();
        assertTrue(empty1.equals(empty2));
        assertEquals(empty1.hashCode(), empty2.hashCode());
    }

    @Test
    public void testClone_deepCopy() {
        TestNode root = new TestNode("root", "http://example.com");
        root.attr("rootAttr", "rootVal");
        TestNode child = new TestNode("child", "http://example.com");
        child.attr("childAttr", "childVal");
        root.addChildren(child);

        Node clonedRoot = root.clone();
        assertNotSame(root, clonedRoot);
        assertEquals(root, clonedRoot);
        assertNull(clonedRoot.parent());
        assertEquals(0, clonedRoot.siblingIndex());

        assertEquals(1, clonedRoot.childNodeSize());
        Node clonedChild = clonedRoot.childNode(0);
        assertNotSame(child, clonedChild);
        assertEquals(child, clonedChild);
        assertSame(clonedRoot, clonedChild.parent());

        // Modifying clone does not affect original
        clonedChild.attr("childAttr", "newVal");
        assertNotEquals(child.attr("childAttr"), clonedChild.attr("childAttr"));
    }
}
