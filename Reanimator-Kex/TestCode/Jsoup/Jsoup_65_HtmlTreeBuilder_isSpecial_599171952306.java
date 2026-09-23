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

public class HtmlTreeBuilder_isSpecial_599171952306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240361;
     Object term240413;
     Object term241238;
     Object term241239;

    public HtmlTreeBuilder_isSpecial_599171952306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240361 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term240413 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term240459 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term240459, term240459.getClass(), "tagName", "");
        setField(term240413, term240413.getClass(), "tag", term240459);
        term241238 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term241238, term241238.getClass(), "state", null);
        setField(term241238, term241238.getClass(), "originalState", null);
        setBooleanField(term241238, term241238.getClass(), "baseUriSetFromDoc", false);
        setField(term241238, term241238.getClass(), "headElement", null);
        setField(term241238, term241238.getClass(), "formElement", null);
        setField(term241238, term241238.getClass(), "contextElement", null);
        setField(term241238, term241238.getClass(), "formattingElements", null);
        setField(term241238, term241238.getClass(), "pendingTableCharacters", null);
        setField(term241238, term241238.getClass(), "emptyEnd", null);
        setBooleanField(term241238, term241238.getClass(), "framesetOk", false);
        setBooleanField(term241238, term241238.getClass(), "fosterInserts", false);
        setBooleanField(term241238, term241238.getClass(), "fragmentParsing", false);
        setField(term241238, term241238.getClass(), "specificScopeTarget", null);
        setField(term241238, term241238.getClass(), "reader", null);
        setField(term241238, term241238.getClass(), "tokeniser", null);
        setField(term241238, term241238.getClass(), "doc", null);
        setField(term241238, term241238.getClass(), "stack", null);
        setField(term241238, term241238.getClass(), "baseUri", null);
        setField(term241238, term241238.getClass(), "currentToken", null);
        setField(term241238, term241238.getClass(), "errors", null);
        setField(term241238, term241238.getClass(), "settings", null);
        setField(term241238, term241238.getClass(), "start", null);
        setField(term241238, term241238.getClass(), "end", null);
        term241239 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term241240 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term241240, term241240.getClass(), "tagName", "");
        setBooleanField(term241240, term241240.getClass(), "isBlock", false);
        setBooleanField(term241240, term241240.getClass(), "formatAsBlock", false);
        setBooleanField(term241240, term241240.getClass(), "canContainInline", false);
        setBooleanField(term241240, term241240.getClass(), "empty", false);
        setBooleanField(term241240, term241240.getClass(), "selfClosing", false);
        setBooleanField(term241240, term241240.getClass(), "preserveWhitespace", false);
        setBooleanField(term241240, term241240.getClass(), "formList", false);
        setBooleanField(term241240, term241240.getClass(), "formSubmit", false);
        setField(term241239, term241239.getClass(), "tag", term241240);
        setField(term241239, term241239.getClass(), "shadowChildrenRef", null);
        setField(term241239, term241239.getClass(), "childNodes", null);
        setField(term241239, term241239.getClass(), "attributes", null);
        setField(term241239, term241239.getClass(), "baseUri", null);
        setField(term241239, term241239.getClass(), "parentNode", null);
        setIntField(term241239, term241239.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term240413;
        callMethod(klass, "isSpecial", argTypes, term240361, args);
        assertTrue(recursiveEquals(term240361, term241238));
        assertTrue(recursiveEquals(term240413, term241239));
    }

};


