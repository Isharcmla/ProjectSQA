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

public class HtmlTreeBuilder_isSpecial_599171952314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700305;
     Object term700357;
     Object term704258;
     Object term704259;

    public HtmlTreeBuilder_isSpecial_599171952314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700305 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term700357 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term700403 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term700403, term700403.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term700357, term700357.getClass(), "tag", term700403);
        term704258 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term704258, term704258.getClass(), "state", null);
        setField(term704258, term704258.getClass(), "originalState", null);
        setBooleanField(term704258, term704258.getClass(), "baseUriSetFromDoc", false);
        setField(term704258, term704258.getClass(), "headElement", null);
        setField(term704258, term704258.getClass(), "formElement", null);
        setField(term704258, term704258.getClass(), "contextElement", null);
        setField(term704258, term704258.getClass(), "formattingElements", null);
        setField(term704258, term704258.getClass(), "pendingTableCharacters", null);
        setField(term704258, term704258.getClass(), "emptyEnd", null);
        setBooleanField(term704258, term704258.getClass(), "framesetOk", false);
        setBooleanField(term704258, term704258.getClass(), "fosterInserts", false);
        setBooleanField(term704258, term704258.getClass(), "fragmentParsing", false);
        setField(term704258, term704258.getClass(), "specificScopeTarget", null);
        setField(term704258, term704258.getClass(), "reader", null);
        setField(term704258, term704258.getClass(), "tokeniser", null);
        setField(term704258, term704258.getClass(), "doc", null);
        setField(term704258, term704258.getClass(), "stack", null);
        setField(term704258, term704258.getClass(), "baseUri", null);
        setField(term704258, term704258.getClass(), "currentToken", null);
        setField(term704258, term704258.getClass(), "errors", null);
        setField(term704258, term704258.getClass(), "start", null);
        setField(term704258, term704258.getClass(), "end", null);
        term704259 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term704260 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term704260, term704260.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setBooleanField(term704260, term704260.getClass(), "isBlock", false);
        setBooleanField(term704260, term704260.getClass(), "formatAsBlock", false);
        setBooleanField(term704260, term704260.getClass(), "canContainBlock", false);
        setBooleanField(term704260, term704260.getClass(), "canContainInline", false);
        setBooleanField(term704260, term704260.getClass(), "empty", false);
        setBooleanField(term704260, term704260.getClass(), "selfClosing", false);
        setBooleanField(term704260, term704260.getClass(), "preserveWhitespace", false);
        setBooleanField(term704260, term704260.getClass(), "formList", false);
        setBooleanField(term704260, term704260.getClass(), "formSubmit", false);
        setField(term704259, term704259.getClass(), "tag", term704260);
        setField(term704259, term704259.getClass(), "parentNode", null);
        setField(term704259, term704259.getClass(), "childNodes", null);
        setField(term704259, term704259.getClass(), "attributes", null);
        setField(term704259, term704259.getClass(), "baseUri", null);
        setIntField(term704259, term704259.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term700357;
        callMethod(klass, "isSpecial", argTypes, term700305, args);
        assertTrue(recursiveEquals(term700305, term704258));
        assertTrue(recursiveEquals(term700357, term704259));
    }

};


