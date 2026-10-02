import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeVisitor;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    private Document doc;
    private Element parentDiv;
    private Element p1;
    private Element p2;

    @Before
    public void setUp() {
        doc = Jsoup.parse("<html><head></head><body>" +
                "<div id=\"parent\"><p id=\"one\">One</p><p id=\"two\">Two</p></div>" +
                "</body></html>");
        parentDiv = doc.getElementById("parent");
        p1 = doc.getElementById("one");
        p2 = doc.getElementById("two");
    }

    // ---------- attr(String) ----------

    @Test
    public void testAttr_existingAttribute_returnsValue() {
        assertEquals("one", p1.attr("id"));
    }

    @Test
    public void testAttr_missingAttribute_returnsEmptyString() {
        assertEquals("", p1.attr("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_nullKey_throwsException() {
        p1.attr((String) null);
    }

    @Test
    public void testAttr_absPrefixMissingAttribute_returnsEmptyString() {
        assertEquals("", p1.attr("abs:href"));
    }

    // ---------- attributes() ----------

    @Test
    public void testAttributes_returnsNotNull() {
        assertNotNull(p1.attributes());
    }

    // ---------- attr(String, String) ----------

    @Test
    public void testAttrSet_newAttribute_setsAndReturnsThis() {
        Node result = p1.attr("data-test", "value");
        assertSame(p1, result);
        assertEquals("value", p1.attr("data-test"));
    }

    // ---------- hasAttr ----------

    @Test
    public void testHasAttr_existingAttribute_returnsTrue() {
        assertTrue(p1.hasAttr("id"));
    }

    @Test
    public void testHasAttr_missingAttribute_returnsFalse() {
        assertFalse(p1.hasAttr("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_nullKey_throwsException() {
        p1.hasAttr(null);
    }

    @Test
    public void testHasAttr_absPrefixWithEmptyResolved_returnsFalse() {
        p1.attr("href", "");
        assertFalse(p1.hasAttr("abs:href"));
    }

    // ---------- removeAttr ----------

    @Test
    public void testRemoveAttr_existingAttribute_removesIt() {
        p1.attr("temp", "val");
        assertTrue(p1.hasAttr("temp"));
        Node result = p1.removeAttr("temp");
        assertSame(p1, result);
        assertFalse(p1.hasAttr("temp"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_nullKey_throwsException() {
        p1.removeAttr(null);
    }

    // ---------- baseUri / setBaseUri ----------

    @Test
    public void testBaseUri_returnsBaseUri() {
        assertNotNull(doc.baseUri());
    }

    @Test
    public void testSetBaseUri_updatesBaseUriRecursively() {
        doc.setBaseUri("http://example.com/");
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals("http://example.com/", p1.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_null_throwsException() {
        doc.setBaseUri(null);
    }

    // ---------- absUrl ----------

    @Test
    public void testAbsUrl_relativeHref_returnsAbsoluteUrl() {
        doc.setBaseUri("http://example.com/");
        Element a = doc.body().appendElement("a");
        a.attr("href", "page.html");
        assertEquals("http://example.com/page.html", a.absUrl("href"));
    }

    @Test
    public void testAbsUrl_missingAttribute_returnsEmptyString() {
        assertEquals("", p1.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throwsException() {
        p1.absUrl("");
    }

    // ---------- childNode ----------

    @Test
    public void testChildNode_validIndex_returnsCorrectNode() {
        assertEquals(p1, parentDiv.childNode(0));
        assertEquals(p2, parentDiv.childNode(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNode_invalidIndex_throwsException() {
        parentDiv.childNode(10);
    }

    // ---------- childNodes ----------

    @Test
    public void testChildNodes_returnsListOfChildren() {
        List<Node> children = parentDiv.childNodes();
        assertEquals(2, children.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodes_isUnmodifiable_throwsException() {
        List<Node> children = parentDiv.childNodes();
        children.add(new TextNode("test", ""));
    }

    // ---------- childNodesCopy ----------

    @Test
    public void testChildNodesCopy_returnsDeepCopy() {
        List<Node> copy = parentDiv.childNodesCopy();
        assertEquals(2, copy.size());
        assertNotSame(p1, copy.get(0));
        assertEquals(p1.outerHtml(), copy.get(0).outerHtml());
    }

    // ---------- childNodeSize ----------

    @Test
    public void testChildNodeSize_returnsCorrectSize() {
        assertEquals(2, parentDiv.childNodeSize());
    }

    @Test
    public void testChildNodeSize_noChildren_returnsZero() {
        Element empty = new Element("span");
        assertEquals(0, empty.childNodeSize());
    }

    // ---------- parent / parentNode ----------

    @Test
    public void testParent_returnsParentNode() {
        assertEquals(parentDiv, p1.parent());
    }

    @Test
    public void testParent_rootNode_returnsNull() {
        Document standalone = new Document("");
        assertNull(standalone.parent());
    }

    @Test
    public void testParentNode_returnsSameAsParent() {
        assertEquals(p1.parent(), p1.parentNode());
    }

    // ---------- ownerDocument ----------

    @Test
    public void testOwnerDocument_documentItself_returnsSelf() {
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocument_elementInDocument_returnsDocument() {
        assertSame(doc, p1.ownerDocument());
    }

    @Test
    public void testOwnerDocument_noParent_returnsNull() {
        Element standalone = new Element("div");
        assertNull(standalone.ownerDocument());
    }

    // ---------- remove ----------

    @Test
    public void testRemove_nodeWithParent_removesFromParent() {
        p1.remove();
        assertEquals(1, parentDiv.childNodeSize());
        assertNull(p1.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_noParent_throwsException() {
        Element standalone = new Element("div");
        standalone.remove();
    }

    // ---------- before(String) ----------

    @Test
    public void testBeforeString_insertsHtmlBeforeNode() {
        p1.before("<span id=\"inserted\">Inserted</span>");
        assertEquals(3, parentDiv.childNodeSize());
        assertEquals("inserted", parentDiv.childNode(0).attr("id"));
    }

    // ---------- before(Node) ----------

    @Test
    public void testBeforeNode_insertsNodeBeforeThis() {
        TextNode newNode = new TextNode("hello", doc.baseUri());
        p1.before(newNode);
        assertEquals(3, parentDiv.childNodeSize());
        assertSame(newNode, parentDiv.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNode_nullNode_throwsException() {
        p1.before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNode_noParent_throwsException() {
        Element standalone = new Element("div");
        TextNode newNode = new TextNode("x", "");
        standalone.before(newNode);
    }

    // ---------- after(String) ----------

    @Test
    public void testAfterString_insertsHtmlAfterNode() {
        p1.after("<span id=\"inserted\">Inserted</span>");
        assertEquals(3, parentDiv.childNodeSize());
        assertEquals("inserted", parentDiv.childNode(1).attr("id"));
    }

    // ---------- after(Node) ----------

    @Test
    public void testAfterNode_insertsNodeAfterThis() {
        TextNode newNode = new TextNode("hello", doc.baseUri());
        p1.after(newNode);
        assertEquals(3, parentDiv.childNodeSize());
        assertSame(newNode, parentDiv.childNode(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfterNode_nullNode_throwsException() {
        p1.after((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfterNode_noParent_throwsException() {
        Element standalone = new Element("div");
        TextNode newNode = new TextNode("x", "");
        standalone.after(newNode);
    }

    // ---------- wrap ----------

    @Test
    public void testWrap_withElementHtml_wrapsNodeSuccessfully() {
        p1.wrap("<div class=\"wrapper\"></div>");
        Element wrapper = p1.parent() instanceof Element ? (Element) p1.parent() : null;
        assertNotNull(wrapper);
        assertEquals("wrapper", wrapper.attr("class"));
    }

    @Test
    public void testWrap_withPlainTextHtml_returnsNull() {
        Node result = p1.wrap("Just text no tags");
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrap_emptyHtml_throwsException() {
        p1.wrap("");
    }

    // ---------- unwrap ----------

    @Test
    public void testUnwrap_nodeWithChildren_returnsFirstChildAndUnwraps() {
        Node firstChild = p1.unwrap();
        assertNotNull(firstChild);
        assertEquals("One", firstChild.toString());
        assertNull(p1.parent());
    }

    @Test
    public void testUnwrap_nodeWithNoChildren_returnsNull() {
        Element empty = new Element("span");
        parentDiv.appendChild(empty);
        Node result = empty.unwrap();
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnwrap_noParent_throwsException() {
        Element standalone = new Element("div");
        standalone.unwrap();
    }

    // ---------- replaceWith ----------

    @Test
    public void testReplaceWith_replacesNodeInParent() {
        TextNode replacement = new TextNode("Replaced", doc.baseUri());
        p1.replaceWith(replacement);
        assertSame(replacement, parentDiv.childNode(0));
        assertNull(p1.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_nullNode_throwsException() {
        p1.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_noParent_throwsException() {
        Element standalone = new Element("div");
        TextNode replacement = new TextNode("x", "");
        standalone.replaceWith(replacement);
    }

    // ---------- siblingNodes ----------

    @Test
    public void testSiblingNodes_withSiblings_returnsOtherSiblings() {
        List<Node> siblings = p1.siblingNodes();
        assertEquals(1, siblings.size());
        assertSame(p2, siblings.get(0));
    }

    @Test
    public void testSiblingNodes_noParent_returnsEmptyList() {
        Element standalone = new Element("div");
        List<Node> siblings = standalone.siblingNodes();
        assertTrue(siblings.isEmpty());
    }

    // ---------- nextSibling ----------

    @Test
    public void testNextSibling_hasNextSibling_returnsNextNode() {
        assertSame(p2, p1.nextSibling());
    }

    @Test
    public void testNextSibling_lastSibling_returnsNull() {
        assertNull(p2.nextSibling());
    }

    @Test
    public void testNextSibling_noParent_returnsNull() {
        Element standalone = new Element("div");
        assertNull(standalone.nextSibling());
    }

    // ---------- previousSibling ----------

    @Test
    public void testPreviousSibling_hasPreviousSibling_returnsPreviousNode() {
        assertSame(p1, p2.previousSibling());
    }

    @Test
    public void testPreviousSibling_firstSibling_returnsNull() {
        assertNull(p1.previousSibling());
    }

    @Test
    public void testPreviousSibling_noParent_returnsNull() {
        Element standalone = new Element("div");
        assertNull(standalone.previousSibling());
    }

    // ---------- siblingIndex ----------

    @Test
    public void testSiblingIndex_returnsCorrectIndex() {
        assertEquals(0, p1.siblingIndex());
        assertEquals(1, p2.siblingIndex());
    }

    // ---------- traverse ----------

    @Test
    public void testTraverse_visitsAllNodes() {
        final int[] count = {0};
        Node result = parentDiv.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {
                count[0]++;
            }

            public void tail(Node node, int depth) {
            }
        });
        assertSame(parentDiv, result);
        assertTrue(count[0] > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTraverse_nullVisitor_throwsException() {
        parentDiv.traverse(null);
    }

    // ---------- outerHtml ----------

    @Test
    public void testOuterHtml_returnsHtmlString() {
        String html = p1.outerHtml();
        assertTrue(html.contains("One"));
        assertTrue(html.contains("id=\"one\""));
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsOuterHtml() {
        assertEquals(p1.outerHtml(), p1.toString());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(p1.equals(p1));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(p1.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        Comment comment = new Comment("comment", doc.baseUri());
        assertFalse(p1.equals(comment));
    }

    @Test
    public void testEquals_equivalentContent_returnsTrue() {
        Element clone = p1.clone();
        assertTrue(p1.equals(clone));
    }

    @Test
    public void testEquals_differentContent_returnsFalse() {
        assertFalse(p1.equals(p2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equivalentContent_returnsSameHashCode() {
        Element clone = p1.clone();
        assertEquals(p1.hashCode(), clone.hashCode());
    }

    @Test
    public void testHashCode_differentContent_returnsDifferentHashCode() {
        assertNotEquals(p1.hashCode(), p2.hashCode());
    }

    // ---------- clone ----------

    @Test
    public void testClone_createsIndependentDeepCopy() {
        Element clone = p1.clone();
        assertNotSame(p1, clone);
        assertNull(clone.parent());
        assertEquals(p1.outerHtml(), clone.outerHtml());

        clone.attr("id", "changed");
        assertEquals("one", p1.attr("id"));
        assertEquals("changed", clone.attr("id"));
    }

    @Test
    public void testClone_parentTree_clonesChildrenDeeply() {
        Element clonedParent = parentDiv.clone();
        assertEquals(parentDiv.childNodeSize(), clonedParent.childNodeSize());
        assertNotSame(parentDiv.childNode(0), clonedParent.childNode(0));
        assertEquals(parentDiv.outerHtml(), clonedParent.outerHtml());
    }
}
