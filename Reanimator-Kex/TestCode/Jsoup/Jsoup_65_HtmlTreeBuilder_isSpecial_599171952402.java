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

public class HtmlTreeBuilder_isSpecial_599171952402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488004;
     Object term488056;
     Object term488881;
     Object term488882;

    public HtmlTreeBuilder_isSpecial_599171952402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488004 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term488056 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term488102 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term488102, term488102.getClass(), "tagName", "");
        setField(term488056, term488056.getClass(), "tag", term488102);
        term488881 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term488881, term488881.getClass(), "state", null);
        setField(term488881, term488881.getClass(), "originalState", null);
        setBooleanField(term488881, term488881.getClass(), "baseUriSetFromDoc", false);
        setField(term488881, term488881.getClass(), "headElement", null);
        setField(term488881, term488881.getClass(), "formElement", null);
        setField(term488881, term488881.getClass(), "contextElement", null);
        setField(term488881, term488881.getClass(), "formattingElements", null);
        setField(term488881, term488881.getClass(), "pendingTableCharacters", null);
        setField(term488881, term488881.getClass(), "emptyEnd", null);
        setBooleanField(term488881, term488881.getClass(), "framesetOk", false);
        setBooleanField(term488881, term488881.getClass(), "fosterInserts", false);
        setBooleanField(term488881, term488881.getClass(), "fragmentParsing", false);
        setField(term488881, term488881.getClass(), "specificScopeTarget", null);
        setField(term488881, term488881.getClass(), "reader", null);
        setField(term488881, term488881.getClass(), "tokeniser", null);
        setField(term488881, term488881.getClass(), "doc", null);
        setField(term488881, term488881.getClass(), "stack", null);
        setField(term488881, term488881.getClass(), "baseUri", null);
        setField(term488881, term488881.getClass(), "currentToken", null);
        setField(term488881, term488881.getClass(), "errors", null);
        setField(term488881, term488881.getClass(), "settings", null);
        setField(term488881, term488881.getClass(), "start", null);
        setField(term488881, term488881.getClass(), "end", null);
        term488882 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term488883 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term488883, term488883.getClass(), "tagName", "");
        setBooleanField(term488883, term488883.getClass(), "isBlock", false);
        setBooleanField(term488883, term488883.getClass(), "formatAsBlock", false);
        setBooleanField(term488883, term488883.getClass(), "canContainInline", false);
        setBooleanField(term488883, term488883.getClass(), "empty", false);
        setBooleanField(term488883, term488883.getClass(), "selfClosing", false);
        setBooleanField(term488883, term488883.getClass(), "preserveWhitespace", false);
        setBooleanField(term488883, term488883.getClass(), "formList", false);
        setBooleanField(term488883, term488883.getClass(), "formSubmit", false);
        setField(term488882, term488882.getClass(), "tag", term488883);
        setField(term488882, term488882.getClass(), "shadowChildrenRef", null);
        setField(term488882, term488882.getClass(), "childNodes", null);
        setField(term488882, term488882.getClass(), "attributes", null);
        setField(term488882, term488882.getClass(), "baseUri", null);
        setField(term488882, term488882.getClass(), "parentNode", null);
        setIntField(term488882, term488882.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term488056;
        callMethod(klass, "isSpecial", argTypes, term488004, args);
        assertTrue(recursiveEquals(term488004, term488881));
        assertTrue(recursiveEquals(term488056, term488882));
    }

};


