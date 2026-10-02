import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;

import java.util.regex.Pattern;

public class EvaluatorTest {

    private Document doc;
    private Element div;      // parent container with multiple children
    private Element p1, p2, s1, p3, d1;
    private Element singleContainer, e1;
    private Element commentContainer;
    private Element scriptEl;

    @Before
    public void setUp() {
        String html = "<html><head></head><body>"
                + "<div id='parent'>"
                + "<p class='a' id='p1'>Hello World</p>"
                + "<p class='b' id='p2'>Second Text</p>"
                + "<span id='s1' data-foo='bar'>Span</span>"
                + "<p id='p3'>Third</p>"
                + "<div id='d1'></div>"
                + "</div>"
                + "<div id='single'><em id='e1'>Only</em></div>"
                + "<div id='c1'><!-- comment --></div>"
                + "<script id='sc1'>var x = 1;</script>"
                + "</body></html>";

        doc = Jsoup.parse(html);
        div = doc.getElementById("parent");
        p1 = doc.getElementById("p1");
        p2 = doc.getElementById("p2");
        s1 = doc.getElementById("s1");
        p3 = doc.getElementById("p3");
        d1 = doc.getElementById("d1");
        singleContainer = doc.getElementById("single");
        e1 = doc.getElementById("e1");
        commentContainer = doc.getElementById("c1");
        scriptEl = doc.getElementById("sc1");
    }

    // ---------- Tag ----------
    @Test
    public void testTag_matches_true() {
        Evaluator.Tag tag = new Evaluator.Tag("p");
        assertTrue(tag.matches(doc, p1));
    }

    @Test
    public void testTag_matches_false() {
        Evaluator.Tag tag = new Evaluator.Tag("div");
        assertFalse(tag.matches(doc, p1));
    }

    @Test
    public void testTag_toString_returnsTagName() {
        Evaluator.Tag tag = new Evaluator.Tag("p");
        assertEquals("p", tag.toString());
    }

    // ---------- TagEndsWith ----------
    @Test
    public void testTagEndsWith_matches_true() {
        Evaluator.TagEndsWith tag = new Evaluator.TagEndsWith("p");
        assertTrue(tag.matches(doc, p1));
    }

    @Test
    public void testTagEndsWith_matches_false() {
        Evaluator.TagEndsWith tag = new Evaluator.TagEndsWith("xyz");
        assertFalse(tag.matches(doc, p1));
    }

    @Test
    public void testTagEndsWith_toString() {
        Evaluator.TagEndsWith tag = new Evaluator.TagEndsWith("p");
        assertEquals("p", tag.toString());
    }

    // ---------- Id ----------
    @Test
    public void testId_matches_true() {
        Evaluator.Id id = new Evaluator.Id("p1");
        assertTrue(id.matches(doc, p1));
    }

    @Test
    public void testId_matches_false() {
        Evaluator.Id id = new Evaluator.Id("p1");
        assertFalse(id.matches(doc, p2));
    }

    @Test
    public void testId_toString() {
        Evaluator.Id id = new Evaluator.Id("p1");
        assertEquals("#p1", id.toString());
    }

    // ---------- Class ----------
    @Test
    public void testClass_matches_true() {
        Evaluator.Class cls = new Evaluator.Class("a");
        assertTrue(cls.matches(doc, p1));
    }

    @Test
    public void testClass_matches_false() {
        Evaluator.Class cls = new Evaluator.Class("a");
        assertFalse(cls.matches(doc, p2));
    }

    @Test
    public void testClass_toString() {
        Evaluator.Class cls = new Evaluator.Class("a");
        assertEquals(".a", cls.toString());
    }

    // ---------- Attribute ----------
    @Test
    public void testAttribute_matches_true() {
        Evaluator.Attribute attr = new Evaluator.Attribute("data-foo");
        assertTrue(attr.matches(doc, s1));
    }

    @Test
    public void testAttribute_matches_false() {
        Evaluator.Attribute attr = new Evaluator.Attribute("class");
        assertFalse(attr.matches(doc, s1));
    }

    @Test
    public void testAttribute_toString() {
        Evaluator.Attribute attr = new Evaluator.Attribute("id");
        assertEquals("[id]", attr.toString());
    }

    // ---------- AttributeStarting ----------
    @Test
    public void testAttributeStarting_matches_true() {
        Evaluator.AttributeStarting attr = new Evaluator.AttributeStarting("data-");
        assertTrue(attr.matches(doc, s1));
    }

    @Test
    public void testAttributeStarting_matches_false() {
        Evaluator.AttributeStarting attr = new Evaluator.AttributeStarting("nomatch-");
        assertFalse(attr.matches(doc, s1));
    }

    @Test
    public void testAttributeStarting_toString() {
        Evaluator.AttributeStarting attr = new Evaluator.AttributeStarting("data-");
        assertEquals("[^data-]", attr.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeStarting_emptyPrefix_throwsException() {
        new Evaluator.AttributeStarting("");
    }

    // ---------- AttributeWithValue ----------
    @Test
    public void testAttributeWithValue_matches_true() {
        Evaluator.AttributeWithValue attr = new Evaluator.AttributeWithValue("id", "p1");
        assertTrue(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValue_matches_false() {
        Evaluator.AttributeWithValue attr = new Evaluator.AttributeWithValue("id", "p1");
        assertFalse(attr.matches(doc, p2));
    }

    @Test
    public void testAttributeWithValue_quotedValue_stripped() {
        Evaluator.AttributeWithValue attr = new Evaluator.AttributeWithValue("id", "\"p1\"");
        assertTrue(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValue_toString() {
        Evaluator.AttributeWithValue attr = new Evaluator.AttributeWithValue("id", "p1");
        assertEquals("[id=p1]", attr.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeWithValue_emptyKey_throwsException() {
        new Evaluator.AttributeWithValue("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeWithValue_emptyValue_throwsException() {
        new Evaluator.AttributeWithValue("key", "");
    }

    // ---------- AttributeWithValueNot ----------
    @Test
    public void testAttributeWithValueNot_matches_true() {
        Evaluator.AttributeWithValueNot attr = new Evaluator.AttributeWithValueNot("id", "p1");
        assertTrue(attr.matches(doc, p2));
    }

    @Test
    public void testAttributeWithValueNot_matches_false() {
        Evaluator.AttributeWithValueNot attr = new Evaluator.AttributeWithValueNot("id", "p1");
        assertFalse(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValueNot_toString() {
        Evaluator.AttributeWithValueNot attr = new Evaluator.AttributeWithValueNot("id", "p1");
        assertEquals("[id!=p1]", attr.toString());
    }

    // ---------- AttributeWithValueStarting ----------
    @Test
    public void testAttributeWithValueStarting_matches_true() {
        Evaluator.AttributeWithValueStarting attr = new Evaluator.AttributeWithValueStarting("id", "p");
        assertTrue(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValueStarting_matches_false() {
        Evaluator.AttributeWithValueStarting attr = new Evaluator.AttributeWithValueStarting("id", "x");
        assertFalse(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValueStarting_toString() {
        Evaluator.AttributeWithValueStarting attr = new Evaluator.AttributeWithValueStarting("id", "p");
        assertEquals("[id^=p]", attr.toString());
    }

    // ---------- AttributeWithValueEnding ----------
    @Test
    public void testAttributeWithValueEnding_matches_true() {
        Evaluator.AttributeWithValueEnding attr = new Evaluator.AttributeWithValueEnding("id", "1");
        assertTrue(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValueEnding_matches_false() {
        Evaluator.AttributeWithValueEnding attr = new Evaluator.AttributeWithValueEnding("id", "9");
        assertFalse(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValueEnding_toString() {
        Evaluator.AttributeWithValueEnding attr = new Evaluator.AttributeWithValueEnding("id", "1");
        assertEquals("[id$=1]", attr.toString());
    }

    // ---------- AttributeWithValueContaining ----------
    @Test
    public void testAttributeWithValueContaining_matches_true() {
        Evaluator.AttributeWithValueContaining attr = new Evaluator.AttributeWithValueContaining("id", "p");
        assertTrue(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValueContaining_matches_false() {
        Evaluator.AttributeWithValueContaining attr = new Evaluator.AttributeWithValueContaining("id", "z");
        assertFalse(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValueContaining_toString() {
        Evaluator.AttributeWithValueContaining attr = new Evaluator.AttributeWithValueContaining("id", "p");
        assertEquals("[id*=p]", attr.toString());
    }

    // ---------- AttributeWithValueMatching ----------
    @Test
    public void testAttributeWithValueMatching_matches_true() {
        Evaluator.AttributeWithValueMatching attr = new Evaluator.AttributeWithValueMatching("id", Pattern.compile("p\\d"));
        assertTrue(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValueMatching_matches_false() {
        Evaluator.AttributeWithValueMatching attr = new Evaluator.AttributeWithValueMatching("id", Pattern.compile("z\\d"));
        assertFalse(attr.matches(doc, p1));
    }

    @Test
    public void testAttributeWithValueMatching_toString() {
        Pattern pattern = Pattern.compile("p\\d");
        Evaluator.AttributeWithValueMatching attr = new Evaluator.AttributeWithValueMatching("id", pattern);
        assertTrue(attr.toString().contains("id"));
    }

    // ---------- AllElements ----------
    @Test
    public void testAllElements_matches_alwaysTrue() {
        Evaluator.AllElements all = new Evaluator.AllElements();
        assertTrue(all.matches(doc, p1));
        assertTrue(all.matches(doc, d1));
    }

    @Test
    public void testAllElements_toString() {
        Evaluator.AllElements all = new Evaluator.AllElements();
        assertEquals("*", all.toString());
    }

    // ---------- IndexLessThan ----------
    @Test
    public void testIndexLessThan_matches_true() {
        Evaluator.IndexLessThan lt = new Evaluator.IndexLessThan(2);
        assertTrue(lt.matches(div, p1));
    }

    @Test
    public void testIndexLessThan_matches_false_whenRootEqualsElement() {
        Evaluator.IndexLessThan lt = new Evaluator.IndexLessThan(2);
        assertFalse(lt.matches(p1, p1));
    }

    @Test
    public void testIndexLessThan_matches_false_whenIndexNotLess() {
        Evaluator.IndexLessThan lt = new Evaluator.IndexLessThan(1);
        assertFalse(lt.matches(div, p3));
    }

    @Test
    public void testIndexLessThan_toString() {
        Evaluator.IndexLessThan lt = new Evaluator.IndexLessThan(2);
        assertEquals(":lt(2)", lt.toString());
    }

    // ---------- IndexGreaterThan ----------
    @Test
    public void testIndexGreaterThan_matches_true() {
        Evaluator.IndexGreaterThan gt = new Evaluator.IndexGreaterThan(0);
        assertTrue(gt.matches(div, p2));
    }

    @Test
    public void testIndexGreaterThan_matches_false() {
        Evaluator.IndexGreaterThan gt = new Evaluator.IndexGreaterThan(10);
        assertFalse(gt.matches(div, p2));
    }

    @Test
    public void testIndexGreaterThan_toString() {
        Evaluator.IndexGreaterThan gt = new Evaluator.IndexGreaterThan(0);
        assertEquals(":gt(0)", gt.toString());
    }

    // ---------- IndexEquals ----------
    @Test
    public void testIndexEquals_matches_true() {
        Evaluator.IndexEquals eq = new Evaluator.IndexEquals(1);
        assertTrue(eq.matches(div, p2));
    }

    @Test
    public void testIndexEquals_matches_false() {
        Evaluator.IndexEquals eq = new Evaluator.IndexEquals(1);
        assertFalse(eq.matches(div, p1));
    }

    @Test
    public void testIndexEquals_toString() {
        Evaluator.IndexEquals eq = new Evaluator.IndexEquals(1);
        assertEquals(":eq(1)", eq.toString());
    }

    // ---------- IsLastChild ----------
    @Test
    public void testIsLastChild_matches_true() {
        Evaluator.IsLastChild last = new Evaluator.IsLastChild();
        assertTrue(last.matches(doc, d1));
    }

    @Test
    public void testIsLastChild_matches_false() {
        Evaluator.IsLastChild last = new Evaluator.IsLastChild();
        assertFalse(last.matches(doc, p1));
    }

    @Test
    public void testIsLastChild_matches_false_whenParentNull() {
        Evaluator.IsLastChild last = new Evaluator.IsLastChild();
        Element orphan = new Element(Tag.valueOf("div"), "");
        assertFalse(last.matches(doc, orphan));
    }

    @Test
    public void testIsLastChild_toString() {
        Evaluator.IsLastChild last = new Evaluator.IsLastChild();
        assertEquals(":last-child", last.toString());
    }

    // ---------- IsFirstOfType ----------
    @Test
    public void testIsFirstOfType_matches_true() {
        Evaluator.IsFirstOfType first = new Evaluator.IsFirstOfType();
        assertTrue(first.matches(doc, p1));
    }

    @Test
    public void testIsFirstOfType_matches_false() {
        Evaluator.IsFirstOfType first = new Evaluator.IsFirstOfType();
        assertFalse(first.matches(doc, p2));
    }

    @Test
    public void testIsFirstOfType_toString() {
        Evaluator.IsFirstOfType first = new Evaluator.IsFirstOfType();
        assertEquals(":first-of-type", first.toString());
    }

    // ---------- IsLastOfType ----------
    @Test
    public void testIsLastOfType_matches_true() {
        Evaluator.IsLastOfType last = new Evaluator.IsLastOfType();
        assertTrue(last.matches(doc, p3));
    }

    @Test
    public void testIsLastOfType_matches_false() {
        Evaluator.IsLastOfType last = new Evaluator.IsLastOfType();
        assertFalse(last.matches(doc, p1));
    }

    @Test
    public void testIsLastOfType_toString() {
        Evaluator.IsLastOfType last = new Evaluator.IsLastOfType();
        assertEquals(":last-of-type", last.toString());
    }

    // ---------- CssNthEvaluator via IsNthChild ----------
    @Test
    public void testIsNthChild_matches_withEvenModulo_true() {
        Evaluator.IsNthChild nth = new Evaluator.IsNthChild(2, 0);
        assertTrue(nth.matches(doc, p2)); // index1 -> pos2, even
    }

    @Test
    public void testIsNthChild_matches_withEvenModulo_false() {
        Evaluator.IsNthChild nth = new Evaluator.IsNthChild(2, 0);
        assertFalse(nth.matches(doc, p1)); // index0 -> pos1, odd
    }

    @Test
    public void testIsNthChild_matches_aZero_exactMatch() {
        Evaluator.IsNthChild nth = new Evaluator.IsNthChild(0, 3);
        assertTrue(nth.matches(doc, s1)); // index2 -> pos3
    }

    @Test
    public void testIsNthChild_matches_falseWhenParentNull() {
        Evaluator.IsNthChild nth = new Evaluator.IsNthChild(0, 1);
        Element orphan = new Element(Tag.valueOf("div"), "");
        assertFalse(nth.matches(doc, orphan));
    }

    @Test
    public void testIsNthChild_toString_aZero() {
        Evaluator.IsNthChild nth = new Evaluator.IsNthChild(0, 5);
        assertEquals(":nth-child(5)", nth.toString());
    }

    @Test
    public void testIsNthChild_toString_bZero() {
        Evaluator.IsNthChild nth = new Evaluator.IsNthChild(5, 0);
        assertEquals(":nth-child(5n)", nth.toString());
    }

    @Test
    public void testIsNthChild_toString_aAndBNonZero() {
        Evaluator.IsNthChild nth = new Evaluator.IsNthChild(5, 3);
        assertEquals(":nth-child(5n+3)", nth.toString());
    }

    // ---------- IsNthLastChild ----------
    @Test
    public void testIsNthLastChild_matches_true() {
        Evaluator.IsNthLastChild nth = new Evaluator.IsNthLastChild(0, 1);
        assertTrue(nth.matches(doc, d1)); // last child -> pos1
    }

    @Test
    public void testIsNthLastChild_matches_false() {
        Evaluator.IsNthLastChild nth = new Evaluator.IsNthLastChild(0, 1);
        assertFalse(nth.matches(doc, p1));
    }

    @Test
    public void testIsNthLastChild_toString() {
        Evaluator.IsNthLastChild nth = new Evaluator.IsNthLastChild(0, 1);
        assertEquals(":nth-last-child(1)", nth.toString());
    }

    // ---------- IsNthOfType ----------
    @Test
    public void testIsNthOfType_matches_true() {
        Evaluator.IsNthOfType nth = new Evaluator.IsNthOfType(0, 2);
        assertTrue(nth.matches(doc, p2)); // 2nd p -> pos2
    }

    @Test
    public void testIsNthOfType_matches_false() {
        Evaluator.IsNthOfType nth = new Evaluator.IsNthOfType(0, 2);
        assertFalse(nth.matches(doc, p1));
    }

    @Test
    public void testIsNthOfType_toString() {
        Evaluator.IsNthOfType nth = new Evaluator.IsNthOfType(0, 2);
        assertEquals(":nth-of-type(2)", nth.toString());
    }

    // ---------- IsNthLastOfType ----------
    @Test
    public void testIsNthLastOfType_matches_true() {
        Evaluator.IsNthLastOfType nth = new Evaluator.IsNthLastOfType(0, 1);
        assertTrue(nth.matches(doc, p3)); // last p
    }

    @Test
    public void testIsNthLastOfType_matches_false() {
        Evaluator.IsNthLastOfType nth = new Evaluator.IsNthLastOfType(0, 1);
        assertFalse(nth.matches(doc, p1));
    }

    @Test
    public void testIsNthLastOfType_toString() {
        Evaluator.IsNthLastOfType nth = new Evaluator.IsNthLastOfType(0, 1);
        assertEquals(":nth-last-of-type(1)", nth.toString());
    }

    // ---------- IsFirstChild ----------
    @Test
    public void testIsFirstChild_matches_true() {
        Evaluator.IsFirstChild first = new Evaluator.IsFirstChild();
        assertTrue(first.matches(doc, p1));
    }

    @Test
    public void testIsFirstChild_matches_false() {
        Evaluator.IsFirstChild first = new Evaluator.IsFirstChild();
        assertFalse(first.matches(doc, p2));
    }

    @Test
    public void testIsFirstChild_matches_false_whenParentNull() {
        Evaluator.IsFirstChild first = new Evaluator.IsFirstChild();
        Element orphan = new Element(Tag.valueOf("div"), "");
        assertFalse(first.matches(doc, orphan));
    }

    @Test
    public void testIsFirstChild_toString() {
        Evaluator.IsFirstChild first = new Evaluator.IsFirstChild();
        assertEquals(":first-child", first.toString());
    }

    // ---------- IsRoot ----------
    @Test
    public void testIsRoot_matches_true_withDocumentRoot() {
        Evaluator.IsRoot root = new Evaluator.IsRoot();
        Element htmlEl = doc.child(0);
        assertTrue(root.matches(doc, htmlEl));
    }

    @Test
    public void testIsRoot_matches_true_withElementRoot() {
        Evaluator.IsRoot root = new Evaluator.IsRoot();
        assertTrue(root.matches(div, div));
    }

    @Test
    public void testIsRoot_matches_false() {
        Evaluator.IsRoot root = new Evaluator.IsRoot();
        assertFalse(root.matches(doc, p1));
    }

    @Test
    public void testIsRoot_toString() {
        Evaluator.IsRoot root = new Evaluator.IsRoot();
        assertEquals(":root", root.toString());
    }

    // ---------- IsOnlyChild ----------
    @Test
    public void testIsOnlyChild_matches_true() {
        Evaluator.IsOnlyChild only = new Evaluator.IsOnlyChild();
        assertTrue(only.matches(doc, e1));
    }

    @Test
    public void testIsOnlyChild_matches_false() {
        Evaluator.IsOnlyChild only = new Evaluator.IsOnlyChild();
        assertFalse(only.matches(doc, p1));
    }

    @Test
    public void testIsOnlyChild_toString() {
        Evaluator.IsOnlyChild only = new Evaluator.IsOnlyChild();
        assertEquals(":only-child", only.toString());
    }

    // ---------- IsOnlyOfType ----------
    @Test
    public void testIsOnlyOfType_matches_true() {
        Evaluator.IsOnlyOfType only = new Evaluator.IsOnlyOfType();
        assertTrue(only.matches(doc, s1));
    }

    @Test
    public void testIsOnlyOfType_matches_false() {
        Evaluator.IsOnlyOfType only = new Evaluator.IsOnlyOfType();
        assertFalse(only.matches(doc, p1));
    }

    @Test
    public void testIsOnlyOfType_matches_false_whenParentNull() {
        Evaluator.IsOnlyOfType only = new Evaluator.IsOnlyOfType();
        Element orphan = new Element(Tag.valueOf("div"), "");
        assertFalse(only.matches(doc, orphan));
    }

    @Test
    public void testIsOnlyOfType_toString() {
        Evaluator.IsOnlyOfType only = new Evaluator.IsOnlyOfType();
        assertEquals(":only-of-type", only.toString());
    }

    // ---------- IsEmpty ----------
    @Test
    public void testIsEmpty_matches_true_whenNoChildren() {
        Evaluator.IsEmpty empty = new Evaluator.IsEmpty();
        assertTrue(empty.matches(doc, d1));
    }

    @Test
    public void testIsEmpty_matches_true_whenOnlyComment() {
        Evaluator.IsEmpty empty = new Evaluator.IsEmpty();
        assertTrue(empty.matches(doc, commentContainer));
    }

    @Test
    public void testIsEmpty_matches_false_whenHasText() {
        Evaluator.IsEmpty empty = new Evaluator.IsEmpty();
        assertFalse(empty.matches(doc, p1));
    }

    @Test
    public void testIsEmpty_toString() {
        Evaluator.IsEmpty empty = new Evaluator.IsEmpty();
        assertEquals(":empty", empty.toString());
    }

    // ---------- ContainsText ----------
    @Test
    public void testContainsText_matches_true() {
        Evaluator.ContainsText ct = new Evaluator.ContainsText("hello");
        assertTrue(ct.matches(doc, p1));
    }

    @Test
    public void testContainsText_matches_false() {
        Evaluator.ContainsText ct = new Evaluator.ContainsText("nomatch");
        assertFalse(ct.matches(doc, p1));
    }

    @Test
    public void testContainsText_toString() {
        Evaluator.ContainsText ct = new Evaluator.ContainsText("Hello");
        assertEquals(":contains(hello)", ct.toString());
    }

    // ---------- ContainsData ----------
    @Test
    public void testContainsData_matches_true() {
        Evaluator.ContainsData cd = new Evaluator.ContainsData("var x");
        assertTrue(cd.matches(doc, scriptEl));
    }

    @Test
    public void testContainsData_matches_false() {
        Evaluator.ContainsData cd = new Evaluator.ContainsData("nomatch");
        assertFalse(cd.matches(doc, scriptEl));
    }

    @Test
    public void testContainsData_toString() {
        Evaluator.ContainsData cd = new Evaluator.ContainsData("Var X");
        assertEquals(":containsData(var x)", cd.toString());
    }

    // ---------- ContainsOwnText ----------
    @Test
    public void testContainsOwnText_matches_true() {
        Evaluator.ContainsOwnText cot = new Evaluator.ContainsOwnText("hello");
        assertTrue(cot.matches(doc, p1));
    }

    @Test
    public void testContainsOwnText_matches_false() {
        Evaluator.ContainsOwnText cot = new Evaluator.ContainsOwnText("nomatch");
        assertFalse(cot.matches(doc, p1));
    }

    @Test
    public void testContainsOwnText_toString() {
        Evaluator.ContainsOwnText cot = new Evaluator.ContainsOwnText("Hello");
        assertEquals(":containsOwn(hello)", cot.toString());
    }

    // ---------- Matches ----------
    @Test
    public void testMatches_matches_true() {
        Evaluator.Matches m = new Evaluator.Matches(Pattern.compile("Hello"));
        assertTrue(m.matches(doc, p1));
    }

    @Test
    public void testMatches_matches_false() {
        Evaluator.Matches m = new Evaluator.Matches(Pattern.compile("NoMatchXYZ"));
        assertFalse(m.matches(doc, p1));
    }

    @Test
    public void testMatches_toString() {
        Pattern pattern = Pattern.compile("Hello");
        Evaluator.Matches m = new Evaluator.Matches(pattern);
        assertTrue(m.toString().contains("Hello"));
    }

    // ---------- MatchesOwn ----------
    @Test
    public void testMatchesOwn_matches_true() {
        Evaluator.MatchesOwn mo = new Evaluator.MatchesOwn(Pattern.compile("Hello"));
        assertTrue(mo.matches(doc, p1));
    }

    @Test
    public void testMatchesOwn_matches_false() {
        Evaluator.MatchesOwn mo = new Evaluator.MatchesOwn(Pattern.compile("NoMatchXYZ"));
        assertFalse(mo.matches(doc, p1));
    }

    @Test
    public void testMatchesOwn_toString() {
        Pattern pattern = Pattern.compile("Hello");
        Evaluator.MatchesOwn mo = new Evaluator.MatchesOwn(pattern);
        assertTrue(mo.toString().contains("Hello"));
    }
}
