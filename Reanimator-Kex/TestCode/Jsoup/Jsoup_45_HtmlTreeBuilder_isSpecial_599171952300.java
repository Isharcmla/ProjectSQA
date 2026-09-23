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

public class HtmlTreeBuilder_isSpecial_599171952300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673061;
     Object term673113;
     Object term674493;
     Object term674494;

    public HtmlTreeBuilder_isSpecial_599171952300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673061 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term673113 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term673159 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term673159, term673159.getClass(), "tagName", "");
        setField(term673113, term673113.getClass(), "tag", term673159);
        term674493 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term674493, term674493.getClass(), "state", null);
        setField(term674493, term674493.getClass(), "originalState", null);
        setBooleanField(term674493, term674493.getClass(), "baseUriSetFromDoc", false);
        setField(term674493, term674493.getClass(), "headElement", null);
        setField(term674493, term674493.getClass(), "formElement", null);
        setField(term674493, term674493.getClass(), "contextElement", null);
        setField(term674493, term674493.getClass(), "formattingElements", null);
        setField(term674493, term674493.getClass(), "pendingTableCharacters", null);
        setField(term674493, term674493.getClass(), "emptyEnd", null);
        setBooleanField(term674493, term674493.getClass(), "framesetOk", false);
        setBooleanField(term674493, term674493.getClass(), "fosterInserts", false);
        setBooleanField(term674493, term674493.getClass(), "fragmentParsing", false);
        setField(term674493, term674493.getClass(), "specificScopeTarget", null);
        setField(term674493, term674493.getClass(), "reader", null);
        setField(term674493, term674493.getClass(), "tokeniser", null);
        setField(term674493, term674493.getClass(), "doc", null);
        setField(term674493, term674493.getClass(), "stack", null);
        setField(term674493, term674493.getClass(), "baseUri", null);
        setField(term674493, term674493.getClass(), "currentToken", null);
        setField(term674493, term674493.getClass(), "errors", null);
        setField(term674493, term674493.getClass(), "start", null);
        setField(term674493, term674493.getClass(), "end", null);
        term674494 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term674495 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term674495, term674495.getClass(), "tagName", "");
        setBooleanField(term674495, term674495.getClass(), "isBlock", false);
        setBooleanField(term674495, term674495.getClass(), "formatAsBlock", false);
        setBooleanField(term674495, term674495.getClass(), "canContainBlock", false);
        setBooleanField(term674495, term674495.getClass(), "canContainInline", false);
        setBooleanField(term674495, term674495.getClass(), "empty", false);
        setBooleanField(term674495, term674495.getClass(), "selfClosing", false);
        setBooleanField(term674495, term674495.getClass(), "preserveWhitespace", false);
        setBooleanField(term674495, term674495.getClass(), "formList", false);
        setBooleanField(term674495, term674495.getClass(), "formSubmit", false);
        setField(term674494, term674494.getClass(), "tag", term674495);
        setField(term674494, term674494.getClass(), "parentNode", null);
        setField(term674494, term674494.getClass(), "childNodes", null);
        setField(term674494, term674494.getClass(), "attributes", null);
        setField(term674494, term674494.getClass(), "baseUri", null);
        setIntField(term674494, term674494.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term673113;
        callMethod(klass, "isSpecial", argTypes, term673061, args);
        assertTrue(recursiveEquals(term673061, term674493));
        assertTrue(recursiveEquals(term673113, term674494));
    }

};


