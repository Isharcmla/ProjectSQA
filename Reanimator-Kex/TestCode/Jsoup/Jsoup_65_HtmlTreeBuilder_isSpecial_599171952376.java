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

public class HtmlTreeBuilder_isSpecial_599171952376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470224;
     Object term470276;
     Object term472191;
     Object term472192;

    public HtmlTreeBuilder_isSpecial_599171952376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470224 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term470276 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term470322 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term470322, term470322.getClass(), "tagName", "");
        setField(term470276, term470276.getClass(), "tag", term470322);
        term472191 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term472191, term472191.getClass(), "state", null);
        setField(term472191, term472191.getClass(), "originalState", null);
        setBooleanField(term472191, term472191.getClass(), "baseUriSetFromDoc", false);
        setField(term472191, term472191.getClass(), "headElement", null);
        setField(term472191, term472191.getClass(), "formElement", null);
        setField(term472191, term472191.getClass(), "contextElement", null);
        setField(term472191, term472191.getClass(), "formattingElements", null);
        setField(term472191, term472191.getClass(), "pendingTableCharacters", null);
        setField(term472191, term472191.getClass(), "emptyEnd", null);
        setBooleanField(term472191, term472191.getClass(), "framesetOk", false);
        setBooleanField(term472191, term472191.getClass(), "fosterInserts", false);
        setBooleanField(term472191, term472191.getClass(), "fragmentParsing", false);
        setField(term472191, term472191.getClass(), "specificScopeTarget", null);
        setField(term472191, term472191.getClass(), "reader", null);
        setField(term472191, term472191.getClass(), "tokeniser", null);
        setField(term472191, term472191.getClass(), "doc", null);
        setField(term472191, term472191.getClass(), "stack", null);
        setField(term472191, term472191.getClass(), "baseUri", null);
        setField(term472191, term472191.getClass(), "currentToken", null);
        setField(term472191, term472191.getClass(), "errors", null);
        setField(term472191, term472191.getClass(), "settings", null);
        setField(term472191, term472191.getClass(), "start", null);
        setField(term472191, term472191.getClass(), "end", null);
        term472192 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term472193 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term472193, term472193.getClass(), "tagName", "");
        setBooleanField(term472193, term472193.getClass(), "isBlock", false);
        setBooleanField(term472193, term472193.getClass(), "formatAsBlock", false);
        setBooleanField(term472193, term472193.getClass(), "canContainInline", false);
        setBooleanField(term472193, term472193.getClass(), "empty", false);
        setBooleanField(term472193, term472193.getClass(), "selfClosing", false);
        setBooleanField(term472193, term472193.getClass(), "preserveWhitespace", false);
        setBooleanField(term472193, term472193.getClass(), "formList", false);
        setBooleanField(term472193, term472193.getClass(), "formSubmit", false);
        setField(term472192, term472192.getClass(), "tag", term472193);
        setField(term472192, term472192.getClass(), "shadowChildrenRef", null);
        setField(term472192, term472192.getClass(), "childNodes", null);
        setField(term472192, term472192.getClass(), "attributes", null);
        setField(term472192, term472192.getClass(), "baseUri", null);
        setField(term472192, term472192.getClass(), "parentNode", null);
        setIntField(term472192, term472192.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term470276;
        callMethod(klass, "isSpecial", argTypes, term470224, args);
        assertTrue(recursiveEquals(term470224, term472191));
        assertTrue(recursiveEquals(term470276, term472192));
    }

};


