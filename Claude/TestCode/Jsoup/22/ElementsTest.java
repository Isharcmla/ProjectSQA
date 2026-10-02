package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class ElementsTest {

    private Document doc;
    private Elements paragraphs;

    @Before
    public void setUp() {
        String html = "<div id='main'><p class='a' id='p1'>One</p><p class='b' id='p2'>Two</p><p id='p3'>Three</p></div>";
        doc = Jsoup.parse(html);
        paragraphs = doc.select("p");
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_emptyList_sizeZero() {
        Elements elements = new Elements();
        assertEquals(0, elements.size());
        assertTrue(elements.isEmpty());
    }

    @Test
    public void testCollectionConstructor_fromCollection_sizeMatches() {
        Collection<Element> col = new ArrayList<Element>(paragraphs);
        Elements elements = new Elements(col);
        assertEquals(3, elements.size());
    }

    @Test
    public void testListConstructor_fromList_sizeMatches() {
        List<Element> list = new ArrayList<Element>(paragraphs);
        Elements elements = new Elements(list);
        assertEquals(3, elements.size());
    }

    @Test
    public void testVarargsConstructor_fromArray_sizeMatches() {
        Element e1 = paragraphs.get(0);
        Element e2 = paragraphs.get(1);
        Elements elements = new Elements(e1, e2);
        assertEquals(2, elements.size());
    }

    @Test
    public void testVarargsConstructor_empty_sizeZero() {
        Elements elements = new Elements();
        assertEquals(0, elements.size());
    }

    // ---------- clone ----------

    @Test
    public void testClone_returnsIndependentCopy() {
        Elements cloned = paragraphs.clone();
        assertEquals(paragraphs.size(), cloned.size());
        assertNotSame(paragraphs.get(0), cloned.get(0));
        assertEquals(paragraphs.get(0).text(), cloned.get(0).text());
    }

    @Test
    public void testClone_emptyElements_returnsEmpty() {
        Elements empty = new Elements();
        Elements cloned = empty.clone();
        assertTrue(cloned.isEmpty());
    }

    // ---------- attr get/set ----------

    @Test
    public void testAttr_existingAttribute_returnsValue() {
        String value = paragraphs.attr("id");
        assertEquals("p1", value);
    }

    @Test
    public void testAttr_noElementHasAttribute_returnsEmptyString() {
        Elements empty = new Elements();
        assertEquals("", empty.attr("id"));
    }

    @Test
    public void testAttrSet_setsAttributeOnAllElements() {
        Elements result = paragraphs.attr("data-test", "value");
        assertSame(paragraphs, result);
        for (Element e : paragraphs) {
            assertEquals("value", e.attr("data-test"));
        }
    }

    @Test
    public void testHasAttr_someElementHasAttr_returnsTrue() {
        assertTrue(paragraphs.hasAttr("id"));
    }

    @Test
    public void testHasAttr_noElementHasAttr_returnsFalse() {
        assertFalse(paragraphs.hasAttr("nonexistent"));
    }

    @Test
    public void testRemoveAttr_removesFromAll() {
        paragraphs.removeAttr("id");
        for (Element e : paragraphs) {
            assertFalse(e.hasAttr("id"));
        }
    }

    // ---------- class methods ----------

    @Test
    public void testAddClass_addsClassToAll() {
        paragraphs.addClass("newclass");
        for (Element e : paragraphs) {
            assertTrue(e.hasClass("newclass"));
        }
    }

    @Test
    public void testRemoveClass_removesClassFromAll() {
        paragraphs.addClass("temp");
        paragraphs.removeClass("temp");
        for (Element e : paragraphs) {
            assertFalse(e.hasClass("temp"));
        }
    }

    @Test
    public void testToggleClass_togglesOnAndOff() {
        paragraphs.toggleClass("toggled");
        for (Element e : paragraphs) {
            assertTrue(e.hasClass("toggled"));
        }
        paragraphs.toggleClass("toggled");
        for (Element e : paragraphs) {
            assertFalse(e.hasClass("toggled"));
        }
    }

    @Test
    public void testHasClass_someElementHasClass_returnsTrue() {
        assertTrue(paragraphs.hasClass("a"));
    }

    @Test
    public void testHasClass_noElementHasClass_returnsFalse() {
        assertFalse(paragraphs.hasClass("nonexistent-class"));
    }

    // ---------- val ----------

    @Test
    public void testVal_nonEmptyList_returnsFirstVal() {
        Document formDoc = Jsoup.parse("<input value='hello'/>");
        Elements inputs = formDoc.select("input");
        assertEquals("hello", inputs.val());
    }

    @Test
    public void testVal_emptyList_returnsEmptyString() {
        Elements empty = new Elements();
        assertEquals("", empty.val());
    }

    @Test
    public void testValSet_setsValueOnAll() {
        Document formDoc = Jsoup.parse("<input/><input/>");
        Elements inputs = formDoc.select("input");
        inputs.val("newval");
        for (Element e : inputs) {
            assertEquals("newval", e.val());
        }
    }

    // ---------- text ----------

    @Test
    public void testText_combinesAllText() {
        String text = paragraphs.text();
        assertTrue(text.contains("One"));
        assertTrue(text.contains("Two"));
        assertTrue(text.contains("Three"));
    }

    @Test
    public void testText_emptyElements_returnsEmptyString() {
        Elements empty = new Elements();
        assertEquals("", empty.text());
    }

    @Test
    public void testHasText_someElementHasText_returnsTrue() {
        assertTrue(paragraphs.hasText());
    }

    @Test
    public void testHasText_emptyElements_returnsFalse() {
        Elements empty = new Elements();
        assertFalse(empty.hasText());
    }

    // ---------- html/outerHtml/toString ----------

    @Test
    public void testHtml_returnsInnerHtmlCombined() {
        String html = paragraphs.html();
        assertTrue(html.contains("One"));
    }

    @Test
    public void testHtml_emptyElements_returnsEmptyString() {
        Elements empty = new Elements();
        assertEquals("", empty.html());
    }

    @Test
    public void testOuterHtml_returnsOuterHtmlCombined() {
        String html = paragraphs.outerHtml();
        assertTrue(html.contains("<p"));
    }

    @Test
    public void testOuterHtml_emptyElements_returnsEmptyString() {
        Elements empty = new Elements();
        assertEquals("", empty.outerHtml());
    }

    @Test
    public void testToString_equalsOuterHtml() {
        assertEquals(paragraphs.outerHtml(), paragraphs.toString());
    }

    // ---------- tagName ----------

    @Test
    public void testTagName_changesTagOnAll() {
        paragraphs.tagName("span");
        for (Element e : paragraphs) {
            assertEquals("span", e.tagName());
        }
    }

    // ---------- html(String) set ----------

    @Test
    public void testHtmlSet_setsInnerHtmlOnAll() {
        paragraphs.html("<b>bold</b>");
        for (Element e : paragraphs) {
            assertTrue(e.html().contains("bold"));
        }
    }

    // ---------- prepend/append ----------

    @Test
    public void testPrepend_addsHtmlAtStart() {
        paragraphs.prepend("<span>pre</span>");
        assertTrue(paragraphs.get(0).html().startsWith("<span>pre</span>"));
    }

    @Test
    public void testAppend_addsHtmlAtEnd() {
        paragraphs.append("<span>post</span>");
        assertTrue(paragraphs.get(0).html().endsWith("<span>post</span>"));
    }

    // ---------- before/after ----------

    @Test
    public void testBefore_insertsHtmlBeforeElement() {
        paragraphs.before("<hr/>");
        Element parent = doc.select("#main").first();
        assertTrue(parent.html().contains("<hr>"));
    }

    @Test
    public void testAfter_insertsHtmlAfterElement() {
        paragraphs.after("<hr/>");
        Element parent = doc.select("#main").first();
        assertTrue(parent.html().contains("<hr>"));
    }

    // ---------- wrap ----------

    @Test
    public void testWrap_wrapsEachElement() {
        paragraphs.wrap("<div class='wrapper'></div>");
        for (Element e : paragraphs) {
            assertEquals("wrapper", e.parent().className());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrap_emptyHtml_throwsException() {
        paragraphs.wrap("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrap_nullHtml_throwsException() {
        paragraphs.wrap(null);
    }

    // ---------- unwrap ----------

    @Test
    public void testUnwrap_removesElementKeepsChildren() {
        Document d = Jsoup.parse("<div><font>One</font> <font><a href='/'>Two</a></font></div>");
        d.select("font").unwrap();
        assertFalse(d.html().contains("font"));
        assertTrue(d.html().contains("Two"));
    }

    // ---------- empty ----------

    @Test
    public void testEmpty_removesChildNodes() {
        paragraphs.empty();
        for (Element e : paragraphs) {
            assertEquals("", e.html());
        }
    }

    // ---------- remove ----------

    @Test
    public void testRemove_removesElementsFromDom() {
        paragraphs.remove();
        Elements remaining = doc.select("p");
        assertEquals(0, remaining.size());
    }

    // ---------- select ----------

    @Test
    public void testSelect_findsMatchingSubset() {
        Elements result = paragraphs.select(".a");
        assertEquals(1, result.size());
        assertEquals("p1", result.first().id());
    }

    @Test
    public void testSelect_noMatch_returnsEmpty() {
        Elements result = paragraphs.select(".nonexistent");
        assertTrue(result.isEmpty());
    }

    // ---------- not ----------

    @Test
    public void testNot_excludesMatchingElements() {
        Elements result = paragraphs.not("#p1");
        assertEquals(2, result.size());
    }

    // ---------- eq ----------

    @Test
    public void testEq_validIndex_returnsSingleElement() {
        Elements result = paragraphs.eq(1);
        assertEquals(1, result.size());
        assertEquals("p2", result.first().id());
    }

    @Test
    public void testEq_indexOutOfBounds_returnsEmpty() {
        Elements result = paragraphs.eq(100);
        assertTrue(result.isEmpty());
    }

    // ---------- is ----------

    @Test
    public void testIs_matchingQuery_returnsTrue() {
        assertTrue(paragraphs.is(".a"));
    }

    @Test
    public void testIs_nonMatchingQuery_returnsFalse() {
        assertFalse(paragraphs.is(".nonexistent"));
    }

    // ---------- parents ----------

    @Test
    public void testParents_returnsAncestors() {
        Elements parents = paragraphs.parents();
        assertFalse(parents.isEmpty());
    }

    @Test
    public void testParents_emptyElements_returnsEmpty() {
        Elements empty = new Elements();
        Elements parents = empty.parents();
        assertTrue(parents.isEmpty());
    }

    // ---------- first/last ----------

    @Test
    public void testFirst_nonEmpty_returnsFirstElement() {
        assertEquals("p1", paragraphs.first().id());
    }

    @Test
    public void testFirst_empty_returnsNull() {
        Elements empty = new Elements();
        assertNull(empty.first());
    }

    @Test
    public void testLast_nonEmpty_returnsLastElement() {
        assertEquals("p3", paragraphs.last().id());
    }

    @Test
    public void testLast_empty_returnsNull() {
        Elements empty = new Elements();
        assertNull(empty.last());
    }

    // ---------- traverse ----------

    @Test
    public void testTraverse_visitsAllNodes() {
        final int[] count = {0};
        NodeVisitor visitor = new NodeVisitor() {
            public void head(Node node, int depth) {
                count[0]++;
            }
            public void tail(Node node, int depth) {
            }
        };
        Elements result = paragraphs.traverse(visitor);
        assertSame(paragraphs, result);
        assertTrue(count[0] > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTraverse_nullVisitor_throwsException() {
        paragraphs.traverse(null);
    }

    // ---------- List delegate methods ----------

    @Test
    public void testSize_returnsCorrectSize() {
        assertEquals(3, paragraphs.size());
    }

    @Test
    public void testIsEmpty_nonEmptyList_returnsFalse() {
        assertFalse(paragraphs.isEmpty());
    }

    @Test
    public void testIsEmpty_emptyList_returnsTrue() {
        Elements empty = new Elements();
        assertTrue(empty.isEmpty());
    }

    @Test
    public void testContains_existingElement_returnsTrue() {
        Element e = paragraphs.get(0);
        assertTrue(paragraphs.contains(e));
    }

    @Test
    public void testContains_nonExistingElement_returnsFalse() {
        Element other = new Element("div");
        assertFalse(paragraphs.contains(other));
    }

    @Test
    public void testIterator_iteratesAllElements() {
        Iterator<Element> it = paragraphs.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testToArray_returnsArrayOfCorrectSize() {
        Object[] arr = paragraphs.toArray();
        assertEquals(3, arr.length);
    }

    @Test
    public void testToArrayTyped_returnsTypedArray() {
        Element[] arr = paragraphs.toArray(new Element[0]);
        assertEquals(3, arr.length);
    }

    @Test
    public void testAdd_addsElementToList() {
        Element newElement = new Element("div");
        boolean result = paragraphs.add(newElement);
        assertTrue(result);
        assertEquals(4, paragraphs.size());
    }

    @Test
    public void testRemoveObject_removesElement_returnsTrue() {
        Element e = paragraphs.get(0);
        boolean result = paragraphs.remove(e);
        assertTrue(result);
        assertEquals(2, paragraphs.size());
    }

    @Test
    public void testRemoveObject_nonExisting_returnsFalse() {
        Element other = new Element("div");
        boolean result = paragraphs.remove(other);
        assertFalse(result);
    }

    @Test
    public void testContainsAll_allPresent_returnsTrue() {
        List<Element> subset = new ArrayList<Element>(paragraphs.subList(0, 2));
        assertTrue(paragraphs.containsAll(subset));
    }

    @Test
    public void testAddAll_addsCollection() {
        List<Element> more = new ArrayList<Element>();
        more.add(new Element("div"));
        boolean result = paragraphs.addAll(more);
        assertTrue(result);
        assertEquals(4, paragraphs.size());
    }

    @Test
    public void testAddAllAtIndex_addsCollectionAtIndex() {
        List<Element> more = new ArrayList<Element>();
        more.add(new Element("div"));
        boolean result = paragraphs.addAll(1, more);
        assertTrue(result);
        assertEquals("div", paragraphs.get(1).tagName());
    }

    @Test
    public void testRemoveAll_removesMatchingElements() {
        List<Element> toRemove = new ArrayList<Element>();
        toRemove.add(paragraphs.get(0));
        boolean result = paragraphs.removeAll(toRemove);
        assertTrue(result);
        assertEquals(2, paragraphs.size());
    }

    @Test
    public void testRetainAll_retainsOnlySpecified() {
        List<Element> toRetain = new ArrayList<Element>();
        toRetain.add(paragraphs.get(0));
        paragraphs.retainAll(toRetain);
        assertEquals(1, paragraphs.size());
    }

    @Test
    public void testClear_removesAllElements() {
        paragraphs.clear();
        assertTrue(paragraphs.isEmpty());
    }

    @Test
    public void testEquals_sameContents_returnsTrue() {
        Elements copy = new Elements(new ArrayList<Element>(paragraphs));
        assertTrue(paragraphs.equals(copy));
    }

    @Test
    public void testEquals_differentContents_returnsFalse() {
        Elements other = new Elements();
        assertFalse(paragraphs.equals(other));
    }

    @Test
    public void testHashCode_consistentWithEquals() {
        Elements copy = new Elements(new ArrayList<Element>(paragraphs));
        assertEquals(paragraphs.hashCode(), copy.hashCode());
    }

    @Test
    public void testGet_validIndex_returnsElement() {
        Element e = paragraphs.get(0);
        assertEquals("p1", e.id());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_invalidIndex_throwsException() {
        paragraphs.get(100);
    }

    @Test
    public void testSet_replacesElementAtIndex() {
        Element newElement = new Element("div");
        Element old = paragraphs.set(0, newElement);
        assertEquals("p1", old.id());
        assertEquals("div", paragraphs.get(0).tagName());
    }

    @Test
    public void testAddAtIndex_insertsElement() {
        Element newElement = new Element("div");
        paragraphs.add(0, newElement);
        assertEquals("div", paragraphs.get(0).tagName());
        assertEquals(4, paragraphs.size());
    }

    @Test
    public void testRemoveAtIndex_removesAndReturnsElement() {
        Element removed = paragraphs.remove(0);
        assertEquals("p1", removed.id());
        assertEquals(2, paragraphs.size());
    }

    @Test
    public void testIndexOf_existingElement_returnsCorrectIndex() {
        Element e = paragraphs.get(1);
        assertEquals(1, paragraphs.indexOf(e));
    }

    @Test
    public void testIndexOf_nonExistingElement_returnsMinusOne() {
        Element other = new Element("div");
        assertEquals(-1, paragraphs.indexOf(other));
    }

    @Test
    public void testLastIndexOf_existingElement_returnsCorrectIndex() {
        Element e = paragraphs.get(2);
        assertEquals(2, paragraphs.lastIndexOf(e));
    }

    @Test
    public void testLastIndexOf_nonExistingElement_returnsMinusOne() {
        Element other = new Element("div");
        assertEquals(-1, paragraphs.lastIndexOf(other));
    }

    @Test
    public void testListIterator_iteratesAllElements() {
        ListIterator<Element> it = paragraphs.listIterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testListIteratorWithIndex_startsAtGivenIndex() {
        ListIterator<Element> it = paragraphs.listIterator(1);
        assertEquals("p2", it.next().id());
    }

    @Test
    public void testSubList_returnsCorrectSublist() {
        List<Element> sub = paragraphs.subList(0, 2);
        assertEquals(2, sub.size());
        assertEquals("p1", sub.get(0).id());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubList_invalidRange_throwsException() {
        paragraphs.subList(0, 100);
    }
}
