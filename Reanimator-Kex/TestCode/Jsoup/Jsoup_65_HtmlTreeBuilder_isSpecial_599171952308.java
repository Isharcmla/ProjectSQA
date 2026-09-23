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

public class HtmlTreeBuilder_isSpecial_599171952308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242139;
     Object term242191;
     Object term242968;
     Object term242969;

    public HtmlTreeBuilder_isSpecial_599171952308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242139 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term242191 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term242237 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term242237, term242237.getClass(), "tagName", null);
        setField(term242191, term242191.getClass(), "tag", term242237);
        term242968 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term242968, term242968.getClass(), "state", null);
        setField(term242968, term242968.getClass(), "originalState", null);
        setBooleanField(term242968, term242968.getClass(), "baseUriSetFromDoc", false);
        setField(term242968, term242968.getClass(), "headElement", null);
        setField(term242968, term242968.getClass(), "formElement", null);
        setField(term242968, term242968.getClass(), "contextElement", null);
        setField(term242968, term242968.getClass(), "formattingElements", null);
        setField(term242968, term242968.getClass(), "pendingTableCharacters", null);
        setField(term242968, term242968.getClass(), "emptyEnd", null);
        setBooleanField(term242968, term242968.getClass(), "framesetOk", false);
        setBooleanField(term242968, term242968.getClass(), "fosterInserts", false);
        setBooleanField(term242968, term242968.getClass(), "fragmentParsing", false);
        setField(term242968, term242968.getClass(), "specificScopeTarget", null);
        setField(term242968, term242968.getClass(), "reader", null);
        setField(term242968, term242968.getClass(), "tokeniser", null);
        setField(term242968, term242968.getClass(), "doc", null);
        setField(term242968, term242968.getClass(), "stack", null);
        setField(term242968, term242968.getClass(), "baseUri", null);
        setField(term242968, term242968.getClass(), "currentToken", null);
        setField(term242968, term242968.getClass(), "errors", null);
        setField(term242968, term242968.getClass(), "settings", null);
        setField(term242968, term242968.getClass(), "start", null);
        setField(term242968, term242968.getClass(), "end", null);
        term242969 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term242970 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term242970, term242970.getClass(), "tagName", null);
        setBooleanField(term242970, term242970.getClass(), "isBlock", false);
        setBooleanField(term242970, term242970.getClass(), "formatAsBlock", false);
        setBooleanField(term242970, term242970.getClass(), "canContainInline", false);
        setBooleanField(term242970, term242970.getClass(), "empty", false);
        setBooleanField(term242970, term242970.getClass(), "selfClosing", false);
        setBooleanField(term242970, term242970.getClass(), "preserveWhitespace", false);
        setBooleanField(term242970, term242970.getClass(), "formList", false);
        setBooleanField(term242970, term242970.getClass(), "formSubmit", false);
        setField(term242969, term242969.getClass(), "tag", term242970);
        setField(term242969, term242969.getClass(), "shadowChildrenRef", null);
        setField(term242969, term242969.getClass(), "childNodes", null);
        setField(term242969, term242969.getClass(), "attributes", null);
        setField(term242969, term242969.getClass(), "baseUri", null);
        setField(term242969, term242969.getClass(), "parentNode", null);
        setIntField(term242969, term242969.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term242191;
        callMethod(klass, "isSpecial", argTypes, term242139, args);
        assertTrue(recursiveEquals(term242139, term242968));
        assertTrue(recursiveEquals(term242191, term242969));
    }

};


