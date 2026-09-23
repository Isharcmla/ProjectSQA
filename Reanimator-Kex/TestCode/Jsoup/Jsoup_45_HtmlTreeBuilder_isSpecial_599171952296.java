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

public class HtmlTreeBuilder_isSpecial_599171952296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664286;
     Object term664338;
     Object term665304;
     Object term665305;

    public HtmlTreeBuilder_isSpecial_599171952296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664286 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term664338 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term664384 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term664384, term664384.getClass(), "tagName", "");
        setField(term664338, term664338.getClass(), "tag", term664384);
        term665304 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term665304, term665304.getClass(), "state", null);
        setField(term665304, term665304.getClass(), "originalState", null);
        setBooleanField(term665304, term665304.getClass(), "baseUriSetFromDoc", false);
        setField(term665304, term665304.getClass(), "headElement", null);
        setField(term665304, term665304.getClass(), "formElement", null);
        setField(term665304, term665304.getClass(), "contextElement", null);
        setField(term665304, term665304.getClass(), "formattingElements", null);
        setField(term665304, term665304.getClass(), "pendingTableCharacters", null);
        setField(term665304, term665304.getClass(), "emptyEnd", null);
        setBooleanField(term665304, term665304.getClass(), "framesetOk", false);
        setBooleanField(term665304, term665304.getClass(), "fosterInserts", false);
        setBooleanField(term665304, term665304.getClass(), "fragmentParsing", false);
        setField(term665304, term665304.getClass(), "specificScopeTarget", null);
        setField(term665304, term665304.getClass(), "reader", null);
        setField(term665304, term665304.getClass(), "tokeniser", null);
        setField(term665304, term665304.getClass(), "doc", null);
        setField(term665304, term665304.getClass(), "stack", null);
        setField(term665304, term665304.getClass(), "baseUri", null);
        setField(term665304, term665304.getClass(), "currentToken", null);
        setField(term665304, term665304.getClass(), "errors", null);
        setField(term665304, term665304.getClass(), "start", null);
        setField(term665304, term665304.getClass(), "end", null);
        term665305 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term665306 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term665306, term665306.getClass(), "tagName", "");
        setBooleanField(term665306, term665306.getClass(), "isBlock", false);
        setBooleanField(term665306, term665306.getClass(), "formatAsBlock", false);
        setBooleanField(term665306, term665306.getClass(), "canContainBlock", false);
        setBooleanField(term665306, term665306.getClass(), "canContainInline", false);
        setBooleanField(term665306, term665306.getClass(), "empty", false);
        setBooleanField(term665306, term665306.getClass(), "selfClosing", false);
        setBooleanField(term665306, term665306.getClass(), "preserveWhitespace", false);
        setBooleanField(term665306, term665306.getClass(), "formList", false);
        setBooleanField(term665306, term665306.getClass(), "formSubmit", false);
        setField(term665305, term665305.getClass(), "tag", term665306);
        setField(term665305, term665305.getClass(), "parentNode", null);
        setField(term665305, term665305.getClass(), "childNodes", null);
        setField(term665305, term665305.getClass(), "attributes", null);
        setField(term665305, term665305.getClass(), "baseUri", null);
        setIntField(term665305, term665305.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term664338;
        callMethod(klass, "isSpecial", argTypes, term664286, args);
        assertTrue(recursiveEquals(term664286, term665304));
        assertTrue(recursiveEquals(term664338, term665305));
    }

};


