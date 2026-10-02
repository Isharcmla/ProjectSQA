package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ElementsTest {

    @Test
    public void testConstructors() {
        Elements emptyElements = new Elements();
        Assert.assertEquals(0, emptyElements.size());

        Element el1 = new Element(Tag.valueOf("p"), "");
        Element el2 = new Element(Tag.valueOf("div"), "");
        List<Element> list = new ArrayList<Element>(Arrays.asList(el1, el2));

        Elements fromCollection = new Elements((Collection<Element>) list);
        Assert.assertEquals(2, fromCollection.size());

        Elements fromList = new Elements(list);
        Assert.assertEquals(2, fromList.size());

        Elements fromVarargs = new Elements(el1, el2);
        Assert.assertEquals(2, fromVarargs.size());

        Elements fromEmptyVarargs = new Elements(new Element[0]);
        Assert.assertEquals(0, fromEmptyVarargs.size());
    }

    @Test
    public void testClone() {
        Document doc = Jsoup.parse("<div><p class='foo'>Text</p></div>");
        Elements els = doc.select("p");
        Elements cloned = els.clone();

        Assert.assertEquals(els.size(), cloned.size());
        Assert.assertEquals(els.first().text(), cloned.first().text());
        Assert.assertNotSame(els.first(), cloned.first());

        Elements emptyCloned = new Elements().clone();
        Assert.assertEquals(0, emptyCloned.size());
    }

    @Test
    public void testAttr_getAndSetAndRemove() {
        Document doc = Jsoup.parse("<p title='first'>One</p><p title='second'>Two</p><p>Three</p>");
        Elements ps = doc.select("p");

        Assert.assertEquals("first", ps.attr("title"));
        Assert.assertTrue(ps.hasAttr("title"));

        Elements empty = new Elements();
        Assert.assertEquals("", empty.attr("title"));
        Assert.assertFalse(empty.hasAttr("title"));
        Assert.assertFalse(ps.hasAttr("nonexistent"));

        ps.attr("class", "custom");
        Assert.assertEquals("custom", ps.get(0).attr("class"));
        Assert.assertEquals("custom", ps.get(1).attr("class"));
        Assert.assertEquals("custom", ps.get(2).attr("class"));

        ps.removeAttr("title");
        Assert.assertFalse(ps.hasAttr("title"));
        Assert.assertEquals("", ps.attr("title"));
    }

    @Test
    public void testClassMethods() {
        Document doc = Jsoup.parse("<div class='one'></div><div class='two'></div><div></div>");
        Elements divs = doc.select("div");

        Assert.assertTrue(divs.hasClass("one"));
        Assert.assertTrue(divs.hasClass("two"));
        Assert.assertFalse(divs.hasClass("three"));

        Elements empty = new Elements();
        Assert.assertFalse(empty.hasClass("one"));

        divs.addClass("added");
        for (Element div : divs) {
            Assert.assertTrue(div.hasClass("added"));
        }

        divs.removeClass("added");
        for (Element div : divs) {
            Assert.assertFalse(div.hasClass("added"));
        }

        divs.toggleClass("toggle");
        for (Element div : divs) {
            Assert.assertTrue(div.hasClass("toggle"));
        }

        divs.toggleClass("toggle");
        for (Element div : divs) {
            Assert.assertFalse(div.hasClass("toggle"));
        }
    }

    @Test
    public void testVal() {
        Document doc = Jsoup.parse("<input value='first' /><input value='second' />");
        Elements inputs = doc.select("input");

        Assert.assertEquals("first", inputs.val());

        Elements empty = new Elements();
        Assert.assertEquals("", empty.val());

        inputs.val("updated");
        Assert.assertEquals("updated", inputs.get(0).val());
        Assert.assertEquals("updated", inputs.get(1).val());
    }

    @Test
    public void testTextAndHasText() {
        Document doc = Jsoup.parse("<p>Hello</p><p>World</p><p></p>");
        Elements ps = doc.select("p");

        Assert.assertEquals("Hello World", ps.text());
        Assert.assertTrue(ps.hasText());

        Elements emptyP = doc.select("p:empty");
        Assert.assertEquals("", emptyP.text());
        Assert.assertFalse(emptyP.hasText());

        Elements emptyEls = new Elements();
        Assert.assertEquals("", emptyEls.text());
        Assert.assertFalse(emptyEls.hasText());
    }

    @Test
    public void testHtmlOuterHtmlAndToString() {
        Document doc = Jsoup.parse("<p><span>One</span></p><p><span>Two</span></p>");
        Elements ps = doc.select("p");

        Assert.assertEquals("<span>One</span>\n<span>Two</span>", ps.html());
        Assert.assertEquals("<p><span>One</span></p>\n<p><span>Two</span></p>", ps.outerHtml());
        Assert.assertEquals(ps.outerHtml(), ps.toString());

        Elements empty = new Elements();
        Assert.assertEquals("", empty.html());
        Assert.assertEquals("", empty.outerHtml());
        Assert.assertEquals("", empty.toString());
    }

    @Test
    public void testDomMutationMethods() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        Elements ps = doc.select("p");

        ps.tagName("span");
        Assert.assertEquals(2, doc.select("span").size());
        Assert.assertEquals(0, doc.select("p").size());

        Elements spans = doc.select("span");
        spans.html("<em>New</em>");
        Assert.assertEquals("<em>New</em>", spans.first().html());

        spans.prepend("<b>Pre</b>");
        Assert.assertTrue(spans.first().html().startsWith("<b>Pre</b>"));

        spans.append("<small>App</small>");
        Assert.assertTrue(spans.first().html().endsWith("<small>App</small>"));

        spans.before("<!--before-->");
        Assert.assertTrue(doc.html().contains("<!--before-->"));

        spans.after("<!--after-->");
        Assert.assertTrue(doc.html().contains("<!--after-->"));
    }

    @Test
    public void testWrapAndUnwrap() {
        Document doc = Jsoup.parse("<div><b>One</b><b>Two</b></div>");
        Elements bs = doc.select("b");

        bs.wrap("<i></i>");
        Assert.assertEquals(2, doc.select("i > b").size());

        bs.unwrap();
        Assert.assertEquals(0, doc.select("b").size());
        Assert.assertEquals(2, doc.select("i").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrap_emptyHtml_throwsException() {
        Document doc = Jsoup.parse("<p>Text</p>");
        Elements ps = doc.select("p");
        ps.wrap("");
    }

    @Test
    public void testEmptyAndRemove() {
        Document doc = Jsoup.parse("<div><p><span>Text</span></p><p><span>Text2</span></p></div>");
        Elements ps = doc.select("p");

        ps.empty();
        Assert.assertEquals(0, doc.select("p span").size());
        Assert.assertEquals(2, doc.select("p").size());

        ps.remove();
        Assert.assertEquals(0, doc.select("p").size());
    }

    @Test
    public void testSelectAndNotAndIs() {
        Document doc = Jsoup.parse("<div class='box high'>1</div><div class='box low'>2</div><span class='box'>3</span>");
        Elements allBox = doc.select(".box");

        Elements high = allBox.select(".high");
        Assert.assertEquals(1, high.size());
        Assert.assertEquals("1", high.first().text());

        Elements notHigh = allBox.not(".high");
        Assert.assertEquals(2, notHigh.size());
        Assert.assertFalse(notHigh.hasClass("high"));

        Assert.assertTrue(allBox.is(".high"));
        Assert.assertTrue(allBox.is(".low"));
        Assert.assertFalse(allBox.is(".missing"));

        Elements empty = new Elements();
        Assert.assertFalse(empty.is(".high"));
    }

    @Test
    public void testEq() {
        Document doc = Jsoup.parse("<p>0</p><p>1</p><p>2</p>");
        Elements ps = doc.select("p");

        Assert.assertEquals("0", ps.eq(0).first().text());
        Assert.assertEquals("1", ps.eq(1).first().text());
        Assert.assertEquals("2", ps.eq(2).first().text());
        Assert.assertEquals(0, ps.eq(3).size());
        Assert.assertEquals(0, ps.eq(-1).size());
    }

    @Test
    public void testParents() {
        Document doc = Jsoup.parse("<div id='grand'><div id='parent'><p><span>Item</span></p></div></div>");
        Elements spans = doc.select("span");
        Elements parents = spans.parents();

        Assert.assertTrue(parents.size() >= 3);
        Assert.assertTrue(parents.is("#parent"));
        Assert.assertTrue(parents.is("#grand"));
        Assert.assertTrue(parents.is("p"));

        Elements empty = new Elements();
        Assert.assertEquals(0, empty.parents().size());
    }

    @Test
    public void testFirstAndLast() {
        Document doc = Jsoup.parse("<p>First</p><p>Middle</p><p>Last</p>");
        Elements ps = doc.select("p");

        Assert.assertEquals("First", ps.first().text());
        Assert.assertEquals("Last", ps.last().text());

        Elements empty = new Elements();
        Assert.assertNull(empty.first());
        Assert.assertNull(empty.last());
    }

    @Test
    public void testTraverse() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Elements divs = doc.select("div");
        final List<String> visitedNodes = new ArrayList<String>();

        divs.traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {
                visitedNodes.add("head:" + node.nodeName());
            }

            @Override
            public void tail(Node node, int depth) {
                visitedNodes.add("tail:" + node.nodeName());
            }
        });

        Assert.assertTrue(visitedNodes.contains("head:div"));
        Assert.assertTrue(visitedNodes.contains("head:p"));
        Assert.assertTrue(visitedNodes.contains("head:#text"));
        Assert.assertTrue(visitedNodes.contains("tail:div"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTraverse_nullVisitor_throwsException() {
        Document doc = Jsoup.parse("<div></div>");
        Elements divs = doc.select("div");
        divs.traverse(null);
    }

    @Test
    public void testListDelegates() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("p"), "");
        Element el3 = new Element(Tag.valueOf("span"), "");
        Element el4 = new Element(Tag.valueOf("a"), "");

        Elements elements = new Elements();
        Assert.assertTrue(elements.isEmpty());
        Assert.assertEquals(0, elements.size());

        elements.add(el1);
        elements.add(el2);
        Assert.assertFalse(elements.isEmpty());
        Assert.assertEquals(2, elements.size());
        Assert.assertTrue(elements.contains(el1));
        Assert.assertFalse(elements.contains(el3));

        Object[] arrayObj = elements.toArray();
        Assert.assertEquals(2, arrayObj.length);
        Assert.assertEquals(el1, arrayObj[0]);

        Element[] arrayTyped = elements.toArray(new Element[0]);
        Assert.assertEquals(2, arrayTyped.length);
        Assert.assertEquals(el1, arrayTyped[0]);

        elements.add(1, el3);
        Assert.assertEquals(el3, elements.get(1));
        Assert.assertEquals(3, elements.size());

        Element old = elements.set(1, el4);
        Assert.assertEquals(el3, old);
        Assert.assertEquals(el4, elements.get(1));

        Assert.assertEquals(1, elements.indexOf(el4));
        Assert.assertEquals(1, elements.lastIndexOf(el4));
        Assert.assertEquals(-1, elements.indexOf(el3));
        Assert.assertEquals(-1, elements.lastIndexOf(el3));

        List<Element> sub = elements.subList(0, 2);
        Assert.assertEquals(2, sub.size());
        Assert.assertEquals(el1, sub.get(0));
        Assert.assertEquals(el4, sub.get(1));

        Assert.assertTrue(elements.containsAll(Arrays.asList(el1, el4)));

        List<Element> toAdd = Arrays.asList(new Element(Tag.valueOf("b"), ""), new Element(Tag.valueOf("i"), ""));
        elements.addAll(toAdd);
        Assert.assertEquals(5, elements.size());

        List<Element> toAddIndex = Collections.singletonList(new Element(Tag.valueOf("u"), ""));
        elements.addAll(0, toAddIndex);
        Assert.assertEquals(6, elements.size());
        Assert.assertEquals("u", elements.get(0).tagName());

        elements.remove(0);
        Assert.assertEquals(5, elements.size());
        Assert.assertNotEquals("u", elements.get(0).tagName());

        elements.remove(el4);
        Assert.assertFalse(elements.contains(el4));

        elements.removeAll(toAdd);
        Assert.assertEquals(2, elements.size());

        elements.retainAll(Collections.singletonList(el1));
        Assert.assertEquals(1, elements.size());
        Assert.assertEquals(el1, elements.get(0));

        Iterator<Element> it = elements.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals(el1, it.next());
        Assert.assertFalse(it.hasNext());

        ListIterator<Element> lit = elements.listIterator();
        Assert.assertTrue(lit.hasNext());
        Assert.assertEquals(el1, lit.next());

        ListIterator<Element> litIndex = elements.listIterator(1);
        Assert.assertTrue(litIndex.hasPrevious());
        Assert.assertEquals(el1, litIndex.previous());

        Elements copy = new Elements(el1);
        Assert.assertTrue(elements.equals(copy));
        Assert.assertEquals(elements.hashCode(), copy.hashCode());
        Assert.assertFalse(elements.equals(new Elements(el2)));
        Assert.assertFalse(elements.equals(null));
        Assert.assertFalse(elements.equals("string"));

        elements.clear();
        Assert.assertEquals(0, elements.size());
        Assert.assertTrue(elements.isEmpty());
    }
}
