package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class HtmlTreeBuilder_isSameFormattingElement_651705163197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300213;
     Object term300265;
     Object term300401;
     Object term300575;
     Object term300576;
     Object term300583;

    public HtmlTreeBuilder_isSameFormattingElement_651705163197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300213 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term300265 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term300311 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term300311, term300311.getClass(), "normalName", "");
        setField(term300265, term300265.getClass(), "tag", term300311);
        term300401 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term300447 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term300447, term300447.getClass(), "normalName", "");
        setField(term300401, term300401.getClass(), "tag", term300447);
        term300575 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term300575, term300575.getClass(), "state", null);
        setField(term300575, term300575.getClass(), "originalState", null);
        setBooleanField(term300575, term300575.getClass(), "baseUriSetFromDoc", false);
        setField(term300575, term300575.getClass(), "headElement", null);
        setField(term300575, term300575.getClass(), "formElement", null);
        setField(term300575, term300575.getClass(), "contextElement", null);
        setField(term300575, term300575.getClass(), "formattingElements", null);
        setField(term300575, term300575.getClass(), "pendingTableCharacters", null);
        setField(term300575, term300575.getClass(), "emptyEnd", null);
        setBooleanField(term300575, term300575.getClass(), "framesetOk", false);
        setBooleanField(term300575, term300575.getClass(), "fosterInserts", false);
        setBooleanField(term300575, term300575.getClass(), "fragmentParsing", false);
        setField(term300575, term300575.getClass(), "specificScopeTarget", null);
        setField(term300575, term300575.getClass(), "parser", null);
        setField(term300575, term300575.getClass(), "reader", null);
        setField(term300575, term300575.getClass(), "tokeniser", null);
        setField(term300575, term300575.getClass(), "doc", null);
        setField(term300575, term300575.getClass(), "stack", null);
        setField(term300575, term300575.getClass(), "baseUri", null);
        setField(term300575, term300575.getClass(), "currentToken", null);
        setField(term300575, term300575.getClass(), "settings", null);
        setField(term300575, term300575.getClass(), "start", null);
        setField(term300575, term300575.getClass(), "end", null);
        term300576 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term300577 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term300580 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term300581 = (Object[]) newArray("java.lang.String", 0);
        Object[] term300582 = (Object[]) newArray("java.lang.String", 0);
        setField(term300577, term300577.getClass(), "tagName", null);
        setField(term300577, term300577.getClass(), "normalName", "");
        setBooleanField(term300577, term300577.getClass(), "isBlock", false);
        setBooleanField(term300577, term300577.getClass(), "formatAsBlock", false);
        setBooleanField(term300577, term300577.getClass(), "canContainInline", false);
        setBooleanField(term300577, term300577.getClass(), "empty", false);
        setBooleanField(term300577, term300577.getClass(), "selfClosing", false);
        setBooleanField(term300577, term300577.getClass(), "preserveWhitespace", false);
        setBooleanField(term300577, term300577.getClass(), "formList", false);
        setBooleanField(term300577, term300577.getClass(), "formSubmit", false);
        setField(term300576, term300576.getClass(), "tag", term300577);
        setField(term300576, term300576.getClass(), "shadowChildrenRef", null);
        setField(term300576, term300576.getClass(), "childNodes", null);
        setIntField(term300580, term300580.getClass(), "size", 0);
        setField(term300580, term300580.getClass(), "keys", term300581);
        setField(term300580, term300580.getClass(), "vals", term300582);
        setField(term300576, term300576.getClass(), "attributes", term300580);
        setField(term300576, term300576.getClass(), "baseUri", null);
        setField(term300576, term300576.getClass(), "parentNode", null);
        setIntField(term300576, term300576.getClass(), "siblingIndex", 0);
        term300583 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term300584 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term300587 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term300588 = (Object[]) newArray("java.lang.String", 0);
        Object[] term300589 = (Object[]) newArray("java.lang.String", 0);
        setField(term300584, term300584.getClass(), "tagName", null);
        setField(term300584, term300584.getClass(), "normalName", "");
        setBooleanField(term300584, term300584.getClass(), "isBlock", false);
        setBooleanField(term300584, term300584.getClass(), "formatAsBlock", false);
        setBooleanField(term300584, term300584.getClass(), "canContainInline", false);
        setBooleanField(term300584, term300584.getClass(), "empty", false);
        setBooleanField(term300584, term300584.getClass(), "selfClosing", false);
        setBooleanField(term300584, term300584.getClass(), "preserveWhitespace", false);
        setBooleanField(term300584, term300584.getClass(), "formList", false);
        setBooleanField(term300584, term300584.getClass(), "formSubmit", false);
        setField(term300583, term300583.getClass(), "tag", term300584);
        setField(term300583, term300583.getClass(), "shadowChildrenRef", null);
        setField(term300583, term300583.getClass(), "childNodes", null);
        setIntField(term300587, term300587.getClass(), "size", 0);
        setField(term300587, term300587.getClass(), "keys", term300588);
        setField(term300587, term300587.getClass(), "vals", term300589);
        setField(term300583, term300583.getClass(), "attributes", term300587);
        setField(term300583, term300583.getClass(), "baseUri", null);
        setField(term300583, term300583.getClass(), "parentNode", null);
        setIntField(term300583, term300583.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term300265;
        args[1] = term300401;
        Object retValue = callMethod(klass, "isSameFormattingElement", argTypes, term300213, args);
        assertTrue(recursiveEquals(term300213, term300575));
        assertTrue(recursiveEquals(term300265, term300576));
        assertTrue(recursiveEquals(term300401, term300583));
        assertTrue(recursiveEquals(retValue, true));
    }

};


