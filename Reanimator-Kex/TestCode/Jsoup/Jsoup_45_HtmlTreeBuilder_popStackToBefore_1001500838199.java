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
import java.util.ArrayList;

public class HtmlTreeBuilder_popStackToBefore_1001500838199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602947;
     Object term603013;

    public HtmlTreeBuilder_popStackToBefore_1001500838199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term602999 = new ArrayList();
        term602947 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term602947, term602947.getClass(), "stack", term602999);
        ArrayList term603014 = new ArrayList();
        term603013 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term603013, term603013.getClass(), "state", null);
        setField(term603013, term603013.getClass(), "originalState", null);
        setBooleanField(term603013, term603013.getClass(), "baseUriSetFromDoc", false);
        setField(term603013, term603013.getClass(), "headElement", null);
        setField(term603013, term603013.getClass(), "formElement", null);
        setField(term603013, term603013.getClass(), "contextElement", null);
        setField(term603013, term603013.getClass(), "formattingElements", null);
        setField(term603013, term603013.getClass(), "pendingTableCharacters", null);
        setField(term603013, term603013.getClass(), "emptyEnd", null);
        setBooleanField(term603013, term603013.getClass(), "framesetOk", false);
        setBooleanField(term603013, term603013.getClass(), "fosterInserts", false);
        setBooleanField(term603013, term603013.getClass(), "fragmentParsing", false);
        setField(term603013, term603013.getClass(), "specificScopeTarget", null);
        setField(term603013, term603013.getClass(), "reader", null);
        setField(term603013, term603013.getClass(), "tokeniser", null);
        setField(term603013, term603013.getClass(), "doc", null);
        setField(term603013, term603013.getClass(), "stack", term603014);
        setField(term603013, term603013.getClass(), "baseUri", null);
        setField(term603013, term603013.getClass(), "currentToken", null);
        setField(term603013, term603013.getClass(), "errors", null);
        setField(term603013, term603013.getClass(), "start", null);
        setField(term603013, term603013.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToBefore", argTypes, term602947, args);
        assertTrue(recursiveEquals(term602947, term603013));
    }

};


