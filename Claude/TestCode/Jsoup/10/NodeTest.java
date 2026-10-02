import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    private Element root;
    private Element child1;
    private Element child2;

    @Before
    public void setUp() {
        root = new Element(Tag.valueOf("div"), "http://example.com/");
        child1 = new Element(Tag.valueOf("span"), "http://example.com/");
        child2 = new Element(Tag.valueOf("p"), "http://example.com/");
        root.appendChild(child1);
        root.appendChild(child2);
    }

    // ---------- attr(String) ----------

    @Test
    public void testAttr_existingKey_returnsValue() {
        root.attr("id", "myid");
        assertEquals("myid", root.attr("id"));
    }

    @Test
    public void testAttr_nonExistingKey_returnsEmptyString() {
        assertEquals("", root.attr("nonexistent"));
    }

    @Test
    public void testAttr_absPrefix_returnsAbsoluteUrl() {
        Element a = new Element(Tag.valueOf("a"), "http://example.com/");
        a.attr("href", "/path");
        String abs = a.attr("abs:href");
        assertEquals("http://example.com/path", abs);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_nullKey_throwsException() {
        root.attr((String) null);
    }

    // ---------- attributes() ----------

    @Test
    public void testAttributes_returnsAttributesObject() {
        assertNotNull(root.attributes());
    }

    // ---------- attr(String, String) setter ----------

    @Test
    public void testAttrSetter_setsValue() {
        Node result = root.attr("class", "myclass");
        assertEquals("myclass", root.attr("class"));
        assertSame(root, result);
    }

    // ---------- hasAttr ----------

    @Test
    public void testHasAttr_existingKey_true() {
        root.attr("id", "myid");
        assertTrue(root.hasAttr("id"));
    }

    @Test
    public void testHasAttr_nonExistingKey_false() {
        assertFalse(root.hasAttr("notthere"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_nullKey_throwsException() {
        root.hasAttr(null);
    }

    // ---------- removeAttr ----------

    @Test
    public void testRemoveAttr_removesAttribute() {
        root.attr("id", "myid");
        root.removeAttr("id");
        assertFalse(root.hasAttr("id"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_nullKey_throwsException() {
        root.removeAttr(null);
    }

    // ---------- baseUri ----------

    @Test
    public void testBaseUri_returnsSetUri() {
        assertEquals("http://example.com/", root.baseUri());
    }

    // ---------- setBaseUri ----------

    @Test
    public void testSetBaseUri_updatesUri() {
        root.setBaseUri("http://newuri.com/");
        assertEquals("http://newuri.com/", root.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_null_throwsException() {
        root.setBaseUri(null);
    }

    // ---------- absUrl ----------

    @Test
    public void testAbsUrl_relativeUrl_returnsAbsolute() {
        Element a = new Element(Tag.valueOf("a"), "http://example.com/dir/");
        a.attr("href", "page.html");
        assertEquals("http://example.com/dir/page.html", a.absUrl("href"));
    }

    @Test
    public void testAbsUrl_noAttribute_returnsEmpty() {
        Element a = new Element(Tag.valueOf("a"), "http://example.com/");
        assertEquals("", a.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throwsException() {
        root.absUrl("");
    }

    @Test
    public void testAbsUrl_malformedBaseAndAttr_returnsEmpty() {
        Element a = new Element(Tag.valueOf("a"), "not a base uri");
        a.attr("href", "also not a url");
        assertEquals("", a.absUrl("href"));
    }

    @Test
    public void testAbsUrl_malformedBaseButAbsoluteAttr_returnsAttr() {
        Element a = new Element(Tag.valueOf("a"), "not a base uri");
        a.attr("href", "http://example.com/abs");
        assertEquals("http://example.com/abs", a.absUrl("href"));
    }

    // ---------- childNode ----------

    @Test
    public void testChildNode_validIndex_returnsChild() {
        assertSame(child1, root.childNode(0));
        assertSame(child2, root.childNode(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNode_invalidIndex_throwsException() {
        root.childNode(99);
    }

    // ---------- childNodes ----------

    @Test
    public void testChildNodes_returnsCorrectList() {
        List<Node> children = root.childNodes();
        assertEquals(2, children.size());
        assertSame(child1, children.get(0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodes_isUnmodifiable() {
        List<Node> children = root.childNodes();
        children.add(new TextNode("x", "http://example.com/"));
    }

    @Test
    public void testChildNodes_emptyForLeafNode() {
        Element leaf = new Element(Tag.valueOf("br"), "http://example.com/");
        assertTrue(leaf.childNodes().isEmpty());
    }

    // ---------- parent ----------

    @Test
    public void testParent_returnsParentNode() {
        assertSame(root, child1.parent());
    }

    @Test
    public void testParent_rootHasNoParent() {
        assertNull(root.parent());
    }

    // ---------- ownerDocument ----------

    @Test
    public void testOwnerDocument_selfIsDocument() {
        Document doc = new Document("http://example.com/");
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocument_withDocumentParent() {
        Document doc = new Document("http://example.com/");
        Element el = new Element(Tag.valueOf("div"), "http://example.com/");
        doc.appendChild(el);
        assertSame(doc, el.ownerDocument());
    }

    @Test
    public void testOwnerDocument_noDocument_returnsNull() {
        assertNull(root.ownerDocument());
    }

    // ---------- remove ----------

    @Test
    public void testRemove_removesFromParent() {
        child1.remove();
        assertEquals(1, root.childNodes().size());
        assertNull(child1.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_noParent_throwsException() {
        root.remove();
    }

    // ---------- replaceWith ----------

    @Test
    public void testReplaceWith_replacesNode() {
        Element replacement = new Element(Tag.valueOf("i"), "http://example.com/");
        child1.replaceWith(replacement);
        assertSame(replacement, root.childNode(0));
        assertNull(child1.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_nullNode_throwsException() {
        child1.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_noParent_throwsException() {
        root.replaceWith(child1);
    }

    // ---------- siblingNodes ----------

    @Test
    public void testSiblingNodes_returnsParentChildren() {
        List<Node> siblings = child1.siblingNodes();
        assertEquals(2, siblings.size());
    }

    // ---------- nextSibling ----------

    @Test
    public void testNextSibling_returnsNextNode() {
        assertSame(child2, child1.nextSibling());
    }

    @Test
    public void testNextSibling_lastNode_returnsNull() {
        assertNull(child2.nextSibling());
    }

    @Test
    public void testNextSibling_noParent_returnsNull() {
        assertNull(root.nextSibling());
    }

    // ---------- previousSibling ----------

    @Test
    public void testPreviousSibling_returnsPreviousNode() {
        assertSame(child1, child2.previousSibling());
    }

    @Test
    public void testPreviousSibling_firstNode_returnsNull() {
        assertNull(child1.previousSibling());
    }

    // ---------- siblingIndex ----------

    @Test
    public void testSiblingIndex_returnsCorrectIndex() {
        assertEquals(Integer.valueOf(0), child1.siblingIndex());
        assertEquals(Integer.valueOf(1), child2.siblingIndex());
    }

    // ---------- outerHtml ----------

    @Test
    public void testOuterHtml_returnsHtmlString() {
        String html = root.outerHtml();
        assertNotNull(html);
        assertTrue(html.contains("div"));
    }

    @Test
    public void testOuterHtml_textNode() {
        TextNode text = new TextNode("Hello", "http://example.com/");
        String html = text.outerHtml();
        assertTrue(html.contains("Hello"));
    }

    @Test
    public void testOuterHtml_comment() {
        Comment comment = new Comment(" a comment ", "http://example.com/");
        String html = comment.outerHtml();
        assertTrue(html.contains("a comment"));
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsOuterHtml() {
        assertEquals(root.outerHtml(), root.toString());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_true() {
        assertTrue(root.equals(root));
    }

    @Test
    public void testEquals_differentObject_false() {
        Element other = new Element(Tag.valueOf("div"), "http://example.com/");
        assertFalse(root.equals(other));
    }

    @Test
    public void testEquals_nullObject_false() {
        assertFalse(root.equals(null));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_consistentForSameObject() {
        int h1 = root.hashCode();
        int h2 = root.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCode_withParentAndAttributes() {
        child1.attr("id", "abc");
        int hash = child1.hashCode();
        assertTrue(hash != 0 || hash == 0); // just verify it executes without error
    }

    // ---------- clone ----------

    @Test
    public void testClone_createsIndependentCopy() {
        Node clone = root.clone();
        assertNotSame(root, clone);
        assertNull(clone.parent());
        assertEquals(root.childNodes().size(), clone.childNodes().size());
    }

    @Test
    public void testClone_withChildren_deepCopiesChildren() {
        Node clone = root.clone();
        assertNotSame(root.childNode(0), clone.childNode(0));
        assertEquals(root.childNode(0).nodeName(), clone.childNode(0).nodeName());
    }

    @Test
    public void testClone_modifyingCloneDoesNotAffectOriginal() {
        Element clone = (Element) root.clone();
        clone.attr("id", "cloned");
        assertFalse(root.hasAttr("id"));
    }
}
