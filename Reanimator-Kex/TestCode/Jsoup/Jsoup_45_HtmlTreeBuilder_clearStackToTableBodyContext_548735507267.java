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

public class HtmlTreeBuilder_clearStackToTableBodyContext_548735507267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620253;
     Object term620338;

    public HtmlTreeBuilder_clearStackToTableBodyContext_548735507267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term620305 = new ArrayList();
        term620253 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term620253, term620253.getClass(), "stack", term620305);
        ArrayList term620339 = new ArrayList();
        term620338 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term620338, term620338.getClass(), "state", null);
        setField(term620338, term620338.getClass(), "originalState", null);
        setBooleanField(term620338, term620338.getClass(), "baseUriSetFromDoc", false);
        setField(term620338, term620338.getClass(), "headElement", null);
        setField(term620338, term620338.getClass(), "formElement", null);
        setField(term620338, term620338.getClass(), "contextElement", null);
        setField(term620338, term620338.getClass(), "formattingElements", null);
        setField(term620338, term620338.getClass(), "pendingTableCharacters", null);
        setField(term620338, term620338.getClass(), "emptyEnd", null);
        setBooleanField(term620338, term620338.getClass(), "framesetOk", false);
        setBooleanField(term620338, term620338.getClass(), "fosterInserts", false);
        setBooleanField(term620338, term620338.getClass(), "fragmentParsing", false);
        setField(term620338, term620338.getClass(), "specificScopeTarget", null);
        setField(term620338, term620338.getClass(), "reader", null);
        setField(term620338, term620338.getClass(), "tokeniser", null);
        setField(term620338, term620338.getClass(), "doc", null);
        setField(term620338, term620338.getClass(), "stack", term620339);
        setField(term620338, term620338.getClass(), "baseUri", null);
        setField(term620338, term620338.getClass(), "currentToken", null);
        setField(term620338, term620338.getClass(), "errors", null);
        setField(term620338, term620338.getClass(), "start", null);
        setField(term620338, term620338.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableBodyContext", argTypes, term620253, args);
        assertTrue(recursiveEquals(term620253, term620338));
    }

};


