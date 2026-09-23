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

public class HtmlTreeBuilder_resetInsertionMode_1494228251207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414172;
     Object term414280;

    public HtmlTreeBuilder_resetInsertionMode_1494228251207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term414172 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term414254 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term414172, term414172.getClass(), "stack", term414254);
        term414280 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term414281 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term414280, term414280.getClass(), "state", null);
        setField(term414280, term414280.getClass(), "originalState", null);
        setBooleanField(term414280, term414280.getClass(), "baseUriSetFromDoc", false);
        setField(term414280, term414280.getClass(), "headElement", null);
        setField(term414280, term414280.getClass(), "formElement", null);
        setField(term414280, term414280.getClass(), "contextElement", null);
        setField(term414280, term414280.getClass(), "formattingElements", null);
        setField(term414280, term414280.getClass(), "pendingTableCharacters", null);
        setBooleanField(term414280, term414280.getClass(), "framesetOk", false);
        setBooleanField(term414280, term414280.getClass(), "fosterInserts", false);
        setBooleanField(term414280, term414280.getClass(), "fragmentParsing", false);
        setField(term414280, term414280.getClass(), "reader", null);
        setField(term414280, term414280.getClass(), "tokeniser", null);
        setField(term414280, term414280.getClass(), "doc", null);
        setIntField(term414281, term414281.getClass(), "size", 0);
        setField(term414281, term414281.getClass(), "first", null);
        setField(term414281, term414281.getClass(), "last", null);
        setIntField(term414281, term414281.getClass(), "modCount", 0);
        setField(term414280, term414280.getClass(), "stack", term414281);
        setField(term414280, term414280.getClass(), "baseUri", null);
        setField(term414280, term414280.getClass(), "currentToken", null);
        setField(term414280, term414280.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetInsertionMode", argTypes, term414172, args);
        assertTrue(recursiveEquals(term414172, term414280));
    }

};


