package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class NodeTest {

    private static class TestNode extends Node {
        public TestNode() {
            super();
        }

        public TestNode(String baseUri) {
            super(baseUri);
        }

        public TestNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
        }

        @Override
        public String nodeName() {
            return "testNode";
        }

        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            indent(accum, depth, out);
            accum.append("<testNode>");
        }

        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</testNode>");
        }
    }

    @Test
    public void testConstructors_validInputs_initializedCorrectly() {
        Node node1 = new TestNode();
        assertNull(node1.baseUri());
        assertNull(node1.attributes());
        assertTrue(node1.childNodes().isEmpty());

        Node node2 = new TestNode("  http://example.com/  ");
        assertEquals("http://example.com/", node2.baseUri());
        assertNotNull(node2.attributes());

        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        Node node3 = new TestNode("http://example.com", attrs);
        assertEquals("http://example.com", node3.baseUri());
        assertEquals("val", node3.attr("key"));
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
    public void testAttrAndAttributes_manipulation_expectedValues() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "/path/file.html");
        el.attr("target", "_blank");

        assertEquals("/path/file.html", el.attr("href"));
        assertEquals("/path/file.html", el.attr("HREF"));
        assertEquals("http://example.com/path/file.html", el.attr("abs:href"));
        assertEquals("http://example.com/path/file.html", el.attr("ABS:HREF"));
        assertEquals("", el.attr("nonexistent"));
        assertEquals("", el.attr("abs:nonexistent"));

        assertTrue(el.hasAttr("href"));
        assertTrue(el.hasAttr("abs:href"));
        assertFalse(el.hasAttr("nonexistent"));
        assertFalse(el.hasAttr("abs:nonexistent"));

        Attributes attrs = el.attributes();
        assertEquals(2, attrs.size());

        el.removeAttr("target");
        assertFalse(el.hasAttr("target"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_nullKey_throwsException() {
        Node node = new TestNode("http://example.com");
        node.attr(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_nullKey_throwsException() {
        Node node = new TestNode("http://example.com");
        node.hasAttr(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_nullKey_throwsException() {
        Node node = new TestNode("http://example.com");
        node.removeAttr(null);
    }

    @Test
    public void testBaseUriAndSetBaseUri_descendantsUpdated() {
        Document doc = Jsoup.parse("<div><p><a href='/link'>Link</a></p></div>", "http://old.com/");
        Element div = doc.select("div").first();
        Element a = doc.select("a").first();

        assertEquals("http://old.com/", div.baseUri());
        assertEquals("http://old.com/", a.baseUri());

        div.setBaseUri("http://new.com/");
        assertEquals("http://new.com/", div.baseUri());
        assertEquals("http://new.com/", a.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_null_throwsException() {
        Node node = new TestNode("http://example.com");
        node.setBaseUri(null);
    }

    @Test
    public void testAbsUrl_variousScenarios_expectedResolutions() {
        Document doc = Jsoup.parse("<a href='/foo'>1</a><a href='?bar'>2</a><a href='http://other.com/baz'>3</a><a href='javascript:void(0)'>4</a>", "http://example.com/dir/file.html");
        List<Element> links = doc.select("a");

        assertEquals("http://example.com/foo", links.get(0).absUrl("href"));
        assertEquals("http://example.com/dir/file.html?bar", links.get(1).absUrl("href"));
        assertEquals("http://other.com/baz", links.get(2).absUrl("href"));
        assertEquals("", links.get(3).absUrl("href"));
        assertEquals("", links.get(0).absUrl("nonexistent"));

        Element badBase = new Element(Tag.valueOf("a"), "not a valid url");
        badBase.attr("href", "http://valid.com/");
        assertEquals("http://valid.com/", badBase.absUrl("href"));

        badBase.attr("href", "/relative");
        assertEquals("", badBase.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throwsException() {
        Node node = new TestNode("http://example.com");
        node.absUrl("");
    }

    @Test
    public void testChildNodesAndAccess_validIndex_returnsCorrectNode() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element div = doc.select("div").first();

        assertEquals(2, div.childNodes().size());
        assertEquals("1", ((Element) div.childNode(0)).text());
        assertEquals("2", ((Element) div.childNode(1)).text());
        assertEquals(2, div.childNodesAsArray().length);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodes_isUnmodifiable() {
        Document doc = Jsoup.parse("<div><p>1</p></div>");
        doc.select("div").first().childNodes().add(new Element(Tag.valueOf("span"), ""));
    }

    @Test
    public void testParentAndOwnerDocument() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Element div = doc.select("div").first();
        Element p = doc.select("p").first();

        assertSame(doc, doc.ownerDocument());
        assertSame(doc, div.ownerDocument());
        assertSame(doc, p.ownerDocument());
        assertSame(div, p.parent());

        Node orphan = new TestNode("http://example.com");
        assertNull(orphan.parent());
        assertNull(orphan.ownerDocument());
    }

    @Test
    public void testRemove_nodeRemovedFromParent() {
        Document doc = Jsoup.parse("<div><p>1</p><p id='two'>2</p><p>3</p></div>");
        Element p2 = doc.select("#two").first();
        p2.remove();

        assertEquals(2, doc.select("p").size());
        assertNull(p2.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_orphanNode_throwsException() {
        Node orphan = new TestNode("http://example.com");
        orphan.remove();
    }

    @Test
    public void testBeforeAndAfter_stringAndNode() {
        Document doc = Jsoup.parse("<div><p id='target'>Middle</p></div>");
        Element target = doc.select("#target").first();

        target.before("<p id='before1'>Before1</p>");
        target.before(new Element(Tag.valueOf("p"), "").attr("id", "before2").text("Before2"));
        target.after("<p id='after1'>After1</p>");
        target.after(new Element(Tag.valueOf("p"), "").attr("id", "after2").text("After2"));

        List<Element> ps = doc.select("div > p");
        assertEquals(5, ps.size());
        assertEquals("before1", ps.get(0).id());
        assertEquals("before2", ps.get(1).id());
        assertEquals("target", ps.get(2).id());
        assertEquals("after2", ps.get(3).id());
        assertEquals("after1", ps.get(4).id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBefore_orphanNode_throwsException() {
        Node orphan = new TestNode("http://example.com");
        orphan.before("<p>test</p>");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfter_orphanNode_throwsException() {
        Node orphan = new TestNode("http://example.com");
        orphan.after("<p>test</p>");
    }

    @Test
    public void testWrap_singleAndMultipleWrappers() {
        Document doc = Jsoup.parse("<div><p>Hello</p></div>");
        Element p = doc.select("p").first();

        Node wrapped = p.wrap("<div class='outer'><div class='inner'></div></div>");
        assertSame(p, wrapped);
        assertEquals("<div class=\"outer\">\n <div class=\"inner\">\n  <p>Hello</p>\n </div>\n</div>", doc.select(".outer").first().outerHtml());

        Document doc2 = Jsoup.parse("<div><span>Text</span></div>");
        Element span = doc2.select("span").first();
        span.wrap("<b></b><i></i>");
        assertEquals("<div>\n <b><span>Text</span><i></i></b>\n</div>", doc2.select("div").first().outerHtml());

        Document doc3 = Jsoup.parse("<div><span>Text</span></div>");
        Element span3 = doc3.select("span").first();
        assertNull(span3.wrap("just text"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrap_emptyString_throwsException() {
        Document doc = Jsoup.parse("<p>Hello</p>");
        doc.select("p").first().wrap("");
    }

    @Test
    public void testUnwrap_withAndWithoutChildren() {
        Document doc = Jsoup.parse("<div>One <span>Two <b>Three</b></span></div>");
        Element span = doc.select("span").first();
        Node firstChild = span.unwrap();

        assertNotNull(firstChild);
        assertTrue(firstChild instanceof TextNode);
        assertEquals("Two ", ((TextNode) firstChild).text());
        assertEquals("<div>\n One Two \n <b>Three</b>\n</div>", doc.select("div").first().outerHtml());

        Document doc2 = Jsoup.parse("<div><span id='empty'></span></div>");
        Element emptySpan = doc2.select("#empty").first();
        Node emptyChild = emptySpan.unwrap();
        assertNull(emptyChild);
        assertEquals(0, doc2.select("div").first().children().size());
    }

    @Test
    public void testReplaceWith() {
        Document doc = Jsoup.parse("<div><p>Old</p></div>");
        Element p = doc.select("p").first();
        Element replacement = new Element(Tag.valueOf("span"), "").text("New");

        p.replaceWith(replacement);

        assertEquals(0, doc.select("p").size());
        assertEquals(1, doc.select("span").size());
        assertEquals("New", doc.select("span").first().text());
        assertNull(p.parent());
        assertSame(doc.select("div").first(), replacement.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_orphanNode_throwsException() {
        Node orphan = new TestNode("http://example.com");
        orphan.replaceWith(new TestNode("http://example.com"));
    }

    @Test
    public void testSiblingNavigation() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Element p1 = doc.select("p").get(0);
        Element p2 = doc.select("p").get(1);
        Element p3 = doc.select("p").get(2);

        assertEquals(3, p2.siblingNodes().size());
        assertEquals(0, p1.siblingIndex());
        assertEquals(1, p2.siblingIndex());
        assertEquals(2, p3.siblingIndex());

        assertNull(p1.previousSibling());
        assertSame(p2, p1.nextSibling());
        assertSame(p1, p2.previousSibling());
        assertSame(p3, p2.nextSibling());
        assertSame(p2, p3.previousSibling());
        assertNull(p3.nextSibling());

        Node orphan = new TestNode("http://example.com");
        assertNull(orphan.nextSibling());
    }

    @Test
    public void testTraverse() {
        Document doc = Jsoup.parse("<div><p>A</p></div>");
        final StringBuilder visited = new StringBuilder();

        doc.body().traverse(new NodeVisitor() {
            public void head(Node node, int depth) {
                visited.append("H:").append(node.nodeName()).append(";");
            }

            public void tail(Node node, int depth) {
                visited.append("T:").append(node.nodeName()).append(";");
            }
        });

        assertTrue(visited.toString().contains("H:body;"));
        assertTrue(visited.toString().contains("H:div;"));
        assertTrue(visited.toString().contains("H:p;"));
        assertTrue(visited.toString().contains("H:#text;"));
        assertTrue(visited.toString().contains("T:p;"));
        assertTrue(visited.toString().contains("T:div;"));
        assertTrue(visited.toString().contains("T:body;"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTraverse_nullVisitor_throwsException() {
        Node node = new TestNode("http://example.com");
        node.traverse(null);
    }

    @Test
    public void testOuterHtmlAndToString() {
        TestNode node = new TestNode("http://example.com");
        assertEquals("<testNode></testNode>", node.outerHtml());
        assertEquals("<testNode></testNode>", node.toString());

        Element el = new Element(Tag.valueOf("p"), "");
        el.text("Hello");
        assertEquals("<p>Hello</p>", el.outerHtml());
    }

    @Test
    public void testEqualsAndHashCode() {
        Node n1 = new TestNode("http://example.com");
        Node n2 = new TestNode("http://example.com");

        assertEquals(n1, n1);
        assertNotEquals(n1, n2);
        assertNotEquals(n1, "other object");
        assertNotEquals(n1, null);

        int hash1 = n1.hashCode();
        n1.attr("k", "v");
        int hash2 = n1.hashCode();
        assertNotEquals(hash1, hash2);

        Document doc = new Document("http://example.com");
        doc.appendChild(n1);
        int hash3 = n1.hashCode();
        assertNotEquals(hash2, hash3);
    }

    @Test
    public void testClone_deepCopyCreated() {
        Document doc = Jsoup.parse("<div><p class='text'>Hello</p></div>", "http://example.com/");
        Element div = doc.select("div").first();
        Node clone = div.clone();

        assertNull(clone.parent());
        assertEquals(0, clone.siblingIndex());
        assertEquals(div.baseUri(), clone.baseUri());
        assertEquals(1, clone.childNodes().size());

        Element pClone = (Element) clone.childNode(0);
        assertSame(clone, pClone.parent());
        assertEquals("text", pClone.attr("class"));
        assertEquals("Hello", pClone.text());

        pClone.text("World");
        assertEquals("Hello", doc.select("p").first().text());
        assertEquals("World", pClone.text());
    }
}
