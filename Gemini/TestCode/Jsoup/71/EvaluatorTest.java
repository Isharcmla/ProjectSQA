package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvaluatorTest {

    @Test
    public void testTag_matchesAndToString() {
        Evaluator.Tag eval = new Evaluator.Tag("DIV");
        Document doc = Jsoup.parse("<div><p>text</p></div>");
        Element div = doc.selectFirst("div");
        Element p = doc.selectFirst("p");

        assertTrue(eval.matches(doc, div));
        assertFalse(eval.matches(doc, p));
        assertEquals("DIV", eval.toString());
    }

    @Test
    public void testTagEndsWith_matchesAndToString() {
        Evaluator.TagEndsWith eval = new Evaluator.TagEndsWith("iv");
        Document doc = Jsoup.parse("<div><p>text</p></div>");
        Element div = doc.selectFirst("div");
        Element p = doc.selectFirst("p");

        assertTrue(eval.matches(doc, div));
        assertFalse(eval.matches(doc, p));
        assertEquals("iv", eval.toString());
    }

    @Test
    public void testId_matchesAndToString() {
        Evaluator.Id eval = new Evaluator.Id("main");
        Document doc = Jsoup.parse("<div id='main'></div><div id='other'></div><div></div>");
        Element mainDiv = doc.getElementById("main");
        Element otherDiv = doc.getElementById("other");

        assertTrue(eval.matches(doc, mainDiv));
        assertFalse(eval.matches(doc, otherDiv));
        assertEquals("#main", eval.toString());
    }

    @Test
    public void testClass_matchesAndToString() {
        Evaluator.Class eval = new Evaluator.Class("highlight");
        Document doc = Jsoup.parse("<div class='highlight content'></div><div class='other'></div>");
        Element div1 = doc.getElementsByClass("highlight").first();
        Element div2 = doc.getElementsByClass("other").first();

        assertTrue(eval.matches(doc, div1));
        assertFalse(eval.matches(doc, div2));
        assertEquals(".highlight", eval.toString());
    }

    @Test
    public void testAttribute_matchesAndToString() {
        Evaluator.Attribute eval = new Evaluator.Attribute("disabled");
        Document doc = Jsoup.parse("<button disabled>OK</button><button>Cancel</button>");
        Element btn1 = doc.select("button").get(0);
        Element btn2 = doc.select("button").get(1);

        assertTrue(eval.matches(doc, btn1));
        assertFalse(eval.matches(doc, btn2));
        assertEquals("[disabled]", eval.toString());
    }

    @Test
    public void testAttributeStarting_matchesAndToString() {
        Evaluator.AttributeStarting eval = new Evaluator.AttributeStarting("data-");
        Document doc = Jsoup.parse("<div data-name='test' id='one'></div><div id='two'></div>");
        Element div1 = doc.getElementById("one");
        Element div2 = doc.getElementById("two");

        assertTrue(eval.matches(doc, div1));
        assertFalse(eval.matches(doc, div2));
        assertEquals("[^data-]", eval.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeStarting_emptyPrefix_throwsException() {
        new Evaluator.AttributeStarting("");
    }

    @Test
    public void testAttributeWithValue_matchesAndToString() {
        Evaluator.AttributeWithValue eval = new Evaluator.AttributeWithValue("type", "'text'");
        Document doc = Jsoup.parse("<input type='TEXT'><input type='password'><input>");
        Element input1 = doc.select("input").get(0);
        Element input2 = doc.select("input").get(1);
        Element input3 = doc.select("input").get(2);

        assertTrue(eval.matches(doc, input1));
        assertFalse(eval.matches(doc, input2));
        assertFalse(eval.matches(doc, input3));
        assertEquals("[type=text]", eval.toString());

        // Test with double quotes
        Evaluator.AttributeWithValue evalQuotes = new Evaluator.AttributeWithValue("type", "\"text\"");
        assertTrue(evalQuotes.matches(doc, input1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeKeyPair_emptyKey_throwsException() {
        new Evaluator.AttributeWithValue("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeKeyPair_emptyValue_throwsException() {
        new Evaluator.AttributeWithValue("key", "");
    }

    @Test
    public void testAttributeWithValueNot_matchesAndToString() {
        Evaluator.AttributeWithValueNot eval = new Evaluator.AttributeWithValueNot("type", "text");
        Document doc = Jsoup.parse("<input type='text'><input type='password'><input>");
        Element input1 = doc.select("input").get(0);
        Element input2 = doc.select("input").get(1);
        Element input3 = doc.select("input").get(2);

        assertFalse(eval.matches(doc, input1));
        assertTrue(eval.matches(doc, input2));
        assertTrue(eval.matches(doc, input3));
        assertEquals("[type!=text]", eval.toString());
    }

    @Test
    public void testAttributeWithValueStarting_matchesAndToString() {
        Evaluator.AttributeWithValueStarting eval = new Evaluator.AttributeWithValueStarting("href", "http://");
        Document doc = Jsoup.parse("<a href='http://example.com'>1</a><a href='https://example.com'>2</a><a>3</a>");
        Element a1 = doc.select("a").get(0);
        Element a2 = doc.select("a").get(1);
        Element a3 = doc.select("a").get(2);

        assertTrue(eval.matches(doc, a1));
        assertFalse(eval.matches(doc, a2));
        assertFalse(eval.matches(doc, a3));
        assertEquals("[href^=http://]", eval.toString());
    }

    @Test
    public void testAttributeWithValueEnding_matchesAndToString() {
        Evaluator.AttributeWithValueEnding eval = new Evaluator.AttributeWithValueEnding("src", ".png");
        Document doc = Jsoup.parse("<img src='logo.PNG'><img src='logo.jpg'><img>");
        Element img1 = doc.select("img").get(0);
        Element img2 = doc.select("img").get(1);
        Element img3 = doc.select("img").get(2);

        assertTrue(eval.matches(doc, img1));
        assertFalse(eval.matches(doc, img2));
        assertFalse(eval.matches(doc, img3));
        assertEquals("[src$=.png]", eval.toString());
    }

    @Test
    public void testAttributeWithValueContaining_matchesAndToString() {
        Evaluator.AttributeWithValueContaining eval = new Evaluator.AttributeWithValueContaining("class", "mid");
        Document doc = Jsoup.parse("<p class='start_mid_end'>1</p><p class='start_end'>2</p><p>3</p>");
        Element p1 = doc.select("p").get(0);
        Element p2 = doc.select("p").get(1);
        Element p3 = doc.select("p").get(2);

        assertTrue(eval.matches(doc, p1));
        assertFalse(eval.matches(doc, p2));
        assertFalse(eval.matches(doc, p3));
        assertEquals("[class*=mid]", eval.toString());
    }

    @Test
    public void testAttributeWithValueMatching_matchesAndToString() {
        Pattern pattern = Pattern.compile("^test_\\d+$");
        Evaluator.AttributeWithValueMatching eval = new Evaluator.AttributeWithValueMatching("id", pattern);
        Document doc = Jsoup.parse("<div id='test_123'></div><div id='test_abc'></div><div></div>");
        Element div1 = doc.select("div").get(0);
        Element div2 = doc.select("div").get(1);
        Element div3 = doc.select("div").get(2);

        assertTrue(eval.matches(doc, div1));
        assertFalse(eval.matches(doc, div2));
        assertFalse(eval.matches(doc, div3));
        assertEquals("[id~=^test_\\d+$]", eval.toString());
    }

    @Test
    public void testAllElements_matchesAndToString() {
        Evaluator.AllElements eval = new Evaluator.AllElements();
        Document doc = Jsoup.parse("<div><p></p></div>");
        Element div = doc.selectFirst("div");
        Element p = doc.selectFirst("p");

        assertTrue(eval.matches(doc, div));
        assertTrue(eval.matches(doc, p));
        assertEquals("*", eval.toString());
    }

    @Test
    public void testIndexLessThan_matchesAndToString() {
        Evaluator.IndexLessThan eval = new Evaluator.IndexLessThan(2);
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li><li>2</li><li>3</li></ul>");
        Element ul = doc.selectFirst("ul");
        Element li0 = ul.child(0);
        Element li1 = ul.child(1);
        Element li2 = ul.child(2);

        assertFalse(eval.matches(ul, ul)); // root == element branch
        assertTrue(eval.matches(ul, li0));
        assertTrue(eval.matches(ul, li1));
        assertFalse(eval.matches(ul, li2));
        assertEquals(":lt(2)", eval.toString());
    }

    @Test
    public void testIndexGreaterThan_matchesAndToString() {
        Evaluator.IndexGreaterThan eval = new Evaluator.IndexGreaterThan(1);
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li><li>2</li></ul>");
        Element ul = doc.selectFirst("ul");
        Element li0 = ul.child(0);
        Element li1 = ul.child(1);
        Element li2 = ul.child(2);

        assertFalse(eval.matches(ul, li0));
        assertFalse(eval.matches(ul, li1));
        assertTrue(eval.matches(ul, li2));
        assertEquals(":gt(1)", eval.toString());
    }

    @Test
    public void testIndexEquals_matchesAndToString() {
        Evaluator.IndexEquals eval = new Evaluator.IndexEquals(1);
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li><li>2</li></ul>");
        Element ul = doc.selectFirst("ul");
        Element li0 = ul.child(0);
        Element li1 = ul.child(1);

        assertFalse(eval.matches(ul, li0));
        assertTrue(eval.matches(ul, li1));
        assertEquals(":eq(1)", eval.toString());
    }

    @Test
    public void testIsLastChild_matchesAndToString() {
        Evaluator.IsLastChild eval = new Evaluator.IsLastChild();
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li></ul>");
        Element ul = doc.selectFirst("ul");
        Element li0 = ul.child(0);
        Element li1 = ul.child(1);
        Element detached = new Element("div");

        assertFalse(eval.matches(doc, detached)); // parent == null
        assertFalse(eval.matches(doc, doc.child(0))); // parent instanceof Document
        assertFalse(eval.matches(ul, li0));
        assertTrue(eval.matches(ul, li1));
        assertEquals(":last-child", eval.toString());
    }

    @Test
    public void testIsFirstChild_matchesAndToString() {
        Evaluator.IsFirstChild eval = new Evaluator.IsFirstChild();
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li></ul>");
        Element ul = doc.selectFirst("ul");
        Element li0 = ul.child(0);
        Element li1 = ul.child(1);
        Element detached = new Element("div");

        assertFalse(eval.matches(doc, detached)); // parent == null
        assertFalse(eval.matches(doc, doc.child(0))); // parent instanceof Document
        assertTrue(eval.matches(ul, li0));
        assertFalse(eval.matches(ul, li1));
        assertEquals(":first-child", eval.toString());
    }

    @Test
    public void testIsFirstOfType_andIsLastOfType() {
        Evaluator.IsFirstOfType firstEval = new Evaluator.IsFirstOfType();
        Evaluator.IsLastOfType lastEval = new Evaluator.IsLastOfType();
        Document doc = Jsoup.parse("<div><span>1</span><p>1</p><span>2</span><p>2</p></div>");
        Element span1 = doc.select("span").get(0);
        Element span2 = doc.select("span").get(1);
        Element p1 = doc.select("p").get(0);
        Element p2 = doc.select("p").get(1);

        assertTrue(firstEval.matches(doc, span1));
        assertFalse(firstEval.matches(doc, span2));
        assertTrue(firstEval.matches(doc, p1));
        assertFalse(firstEval.matches(doc, p2));
        assertEquals(":first-of-type", firstEval.toString());

        assertFalse(lastEval.matches(doc, span1));
        assertTrue(lastEval.matches(doc, span2));
        assertFalse(lastEval.matches(doc, p1));
        assertTrue(lastEval.matches(doc, p2));
        assertEquals(":last-of-type", lastEval.toString());
    }

    @Test
    public void testCssNthEvaluator_variationsAndToString() {
        Evaluator.IsNthChild nthChildA0 = new Evaluator.IsNthChild(0, 2);
        assertEquals(":nth-child(2)", nthChildA0.toString());

        Evaluator.IsNthChild nthChildB0 = new Evaluator.IsNthChild(2, 0);
        assertEquals(":nth-child(2n)", nthChildB0.toString());

        Evaluator.IsNthChild nthChildPos = new Evaluator.IsNthChild(2, 1);
        assertEquals(":nth-child(2n+1)", nthChildPos.toString());

        Evaluator.IsNthChild nthChildNeg = new Evaluator.IsNthChild(2, -1);
        assertEquals(":nth-child(2n-1)", nthChildNeg.toString());

        Evaluator.CssNthEvaluator customSingleB = new Evaluator.CssNthEvaluator(3) {
            @Override
            protected String getPseudoClass() {
                return "custom";
            }
            @Override
            protected int calculatePosition(Element root, Element element) {
                return 3;
            }
        };
        assertEquals(":custom(3)", customSingleB.toString());
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertTrue(customSingleB.matches(parent, child));

        // Parent is null or Document check
        Element detached = new Element("div");
        assertFalse(nthChildA0.matches(detached, detached));
        Document doc = Jsoup.parse("<html><body><div></div></body></html>");
        assertFalse(nthChildA0.matches(doc, doc.child(0)));

        // Branch coverage: (pos-b)*a >= 0 and (pos-b)%a == 0
        Evaluator.IsNthChild nthStep = new Evaluator.IsNthChild(2, 1); // 1, 3, 5...
        Document listDoc = Jsoup.parse("<ul><li>1</li><li>2</li><li>3</li><li>4</li></ul>");
        Element ul = listDoc.selectFirst("ul");
        assertTrue(nthStep.matches(ul, ul.child(0))); // pos 1
        assertFalse(nthStep.matches(ul, ul.child(1))); // pos 2 ((2-1)%2 != 0)

        // Negative direction check ((pos-b)*a < 0)
        Evaluator.IsNthChild nthNegDir = new Evaluator.IsNthChild(-1, 2); // pos <= 2
        assertTrue(nthNegDir.matches(ul, ul.child(0))); // pos 1: (1-2)*(-1) = 1 >= 0
        assertTrue(nthNegDir.matches(ul, ul.child(1))); // pos 2: (2-2)*(-1) = 0 >= 0
        assertFalse(nthNegDir.matches(ul, ul.child(2))); // pos 3: (3-2)*(-1) = -1 < 0
    }

    @Test
    public void testIsNthLastChild() {
        Evaluator.IsNthLastChild eval = new Evaluator.IsNthLastChild(0, 1);
        Document doc = Jsoup.parse("<ul><li>1</li><li>2</li><li>3</li></ul>");
        Element ul = doc.selectFirst("ul");
        assertFalse(eval.matches(ul, ul.child(0)));
        assertTrue(eval.matches(ul, ul.child(2)));
        assertEquals(":nth-last-child(1)", eval.toString());
    }

    @Test
    public void testIsNthOfType_andIsNthLastOfType() {
        Evaluator.IsNthOfType nthOfType = new Evaluator.IsNthOfType(0, 2);
        Evaluator.IsNthLastOfType nthLastOfType = new Evaluator.IsNthLastOfType(0, 1);

        Document doc = Jsoup.parse("<div><p>p1</p><span>s1</span><p>p2</p><span>s2</span></div>");
        Element div = doc.selectFirst("div");
        Element p1 = div.child(0);
        Element s1 = div.child(1);
        Element p2 = div.child(2);
        Element s2 = div.child(3);

        assertFalse(nthOfType.matches(div, p1));
        assertTrue(nthOfType.matches(div, p2));
        assertTrue(nthOfType.matches(div, s2));
        assertEquals(":nth-of-type(2)", nthOfType.toString());

        assertFalse(nthLastOfType.matches(div, p1));
        assertTrue(nthLastOfType.matches(div, p2));
        assertTrue(nthLastOfType.matches(div, s2));
        assertEquals(":nth-last-of-type(1)", nthLastOfType.toString());
    }

    @Test
    public void testIsRoot() {
        Evaluator.IsRoot eval = new Evaluator.IsRoot();
        Document doc = Jsoup.parse("<html><head></head><body><div></div></body></html>");
        Element html = doc.child(0);
        Element div = doc.selectFirst("div");

        assertTrue(eval.matches(doc, html));
        assertFalse(eval.matches(doc, div));

        Element standaloneRoot = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        standaloneRoot.appendChild(child);

        assertTrue(eval.matches(standaloneRoot, standaloneRoot));
        assertFalse(eval.matches(standaloneRoot, child));
        assertEquals(":root", eval.toString());
    }

    @Test
    public void testIsOnlyChild() {
        Evaluator.IsOnlyChild eval = new Evaluator.IsOnlyChild();
        Document doc = Jsoup.parse("<div><p id='only'>1</p></div><div><span id='s1'>1</span><span id='s2'>2</span></div>");
        Element only = doc.getElementById("only");
        Element s1 = doc.getElementById("s1");
        Element detached = new Element("p");

        assertTrue(eval.matches(doc, only));
        assertFalse(eval.matches(doc, s1));
        assertFalse(eval.matches(doc, detached)); // parent == null
        assertFalse(eval.matches(doc, doc.child(0))); // parent instanceof Document
        assertEquals(":only-child", eval.toString());
    }

    @Test
    public void testIsOnlyOfType() {
        Evaluator.IsOnlyOfType eval = new Evaluator.IsOnlyOfType();
        Document doc = Jsoup.parse("<div><p id='onlyP'>1</p><span id='s1'>1</span><span id='s2'>2</span></div>");
        Element onlyP = doc.getElementById("onlyP");
        Element s1 = doc.getElementById("s1");
        Element detached = new Element("p");

        assertTrue(eval.matches(doc, onlyP));
        assertFalse(eval.matches(doc, s1));
        assertFalse(eval.matches(doc, detached)); // parent == null
        assertFalse(eval.matches(doc, doc.child(0))); // parent instanceof Document
        assertEquals(":only-of-type", eval.toString());
    }

    @Test
    public void testIsEmpty() {
        Evaluator.IsEmpty eval = new Evaluator.IsEmpty();
        Element empty = new Element(Tag.valueOf("div"), "");
        Element withComment = new Element(Tag.valueOf("div"), "");
        withComment.appendChild(new Comment("comment"));
        withComment.appendChild(new XmlDeclaration("xml", false));
        withComment.appendChild(new DocumentType("html", "", ""));

        Element withText = new Element(Tag.valueOf("div"), "");
        withText.appendText("text");

        Element withChild = new Element(Tag.valueOf("div"), "");
        withChild.appendChild(new Element(Tag.valueOf("span"), ""));

        assertTrue(eval.matches(empty, empty));
        assertTrue(eval.matches(withComment, withComment));
        assertFalse(eval.matches(withText, withText));
        assertFalse(eval.matches(withChild, withChild));
        assertEquals(":empty", eval.toString());
    }

    @Test
    public void testContainsText() {
        Evaluator.ContainsText eval = new Evaluator.ContainsText("TARGET");
        Document doc = Jsoup.parse("<div>Hello <span>Target</span> World</div><p>Other</p>");
        Element div = doc.selectFirst("div");
        Element p = doc.selectFirst("p");

        assertTrue(eval.matches(doc, div));
        assertFalse(eval.matches(doc, p));
        assertEquals(":contains(target)", eval.toString());
    }

    @Test
    public void testContainsData() {
        Evaluator.ContainsData eval = new Evaluator.ContainsData("var x = 1;");
        Document doc = Jsoup.parse("<script>var x = 1;</script><script>var y = 2;</script>");
        Element s1 = doc.select("script").get(0);
        Element s2 = doc.select("script").get(1);

        assertTrue(eval.matches(doc, s1));
        assertFalse(eval.matches(doc, s2));
        assertEquals(":containsData(var x = 1;)", eval.toString());
    }

    @Test
    public void testContainsOwnText() {
        Evaluator.ContainsOwnText eval = new Evaluator.ContainsOwnText("parent");
        Document doc = Jsoup.parse("<div>parent <span>child</span></div><p><span>parent</span></p>");
        Element div = doc.selectFirst("div");
        Element p = doc.selectFirst("p");

        assertTrue(eval.matches(doc, div));
        assertFalse(eval.matches(doc, p)); // 'parent' is inside child span, not p's own text
        assertEquals(":containsOwn(parent)", eval.toString());
    }

    @Test
    public void testMatches() {
        Pattern pattern = Pattern.compile("\\b\\d{3}\\b");
        Evaluator.Matches eval = new Evaluator.Matches(pattern);
        Document doc = Jsoup.parse("<div>abc <span>123</span> def</div><p>abc def</p>");
        Element div = doc.selectFirst("div");
        Element p = doc.selectFirst("p");

        assertTrue(eval.matches(doc, div));
        assertFalse(eval.matches(doc, p));
        assertEquals(":matches(\\b\\d{3}\\b)", eval.toString());
    }

    @Test
    public void testMatchesOwn() {
        Pattern pattern = Pattern.compile("^own_text$");
        Evaluator.MatchesOwn eval = new Evaluator.MatchesOwn(pattern);
        Document doc = Jsoup.parse("<div>own_text<span>child</span></div><div><span>own_text</span></div>");
        Element div1 = doc.select("div").get(0);
        Element div2 = doc.select("div").get(1);

        assertTrue(eval.matches(doc, div1));
        assertFalse(eval.matches(doc, div2));
        assertEquals(":matchesOwn(^own_text$)", eval.toString());
    }
}
