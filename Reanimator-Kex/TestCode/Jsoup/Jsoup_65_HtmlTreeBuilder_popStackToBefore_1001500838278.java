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

public class HtmlTreeBuilder_popStackToBefore_1001500838278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225875;
     Object term225983;

    public HtmlTreeBuilder_popStackToBefore_1001500838278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term225927 = new ArrayList();
        term225875 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term225875, term225875.getClass(), "stack", term225927);
        ArrayList term225984 = new ArrayList();
        term225983 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term225983, term225983.getClass(), "state", null);
        setField(term225983, term225983.getClass(), "originalState", null);
        setBooleanField(term225983, term225983.getClass(), "baseUriSetFromDoc", false);
        setField(term225983, term225983.getClass(), "headElement", null);
        setField(term225983, term225983.getClass(), "formElement", null);
        setField(term225983, term225983.getClass(), "contextElement", null);
        setField(term225983, term225983.getClass(), "formattingElements", null);
        setField(term225983, term225983.getClass(), "pendingTableCharacters", null);
        setField(term225983, term225983.getClass(), "emptyEnd", null);
        setBooleanField(term225983, term225983.getClass(), "framesetOk", false);
        setBooleanField(term225983, term225983.getClass(), "fosterInserts", false);
        setBooleanField(term225983, term225983.getClass(), "fragmentParsing", false);
        setField(term225983, term225983.getClass(), "specificScopeTarget", null);
        setField(term225983, term225983.getClass(), "reader", null);
        setField(term225983, term225983.getClass(), "tokeniser", null);
        setField(term225983, term225983.getClass(), "doc", null);
        setField(term225983, term225983.getClass(), "stack", term225984);
        setField(term225983, term225983.getClass(), "baseUri", null);
        setField(term225983, term225983.getClass(), "currentToken", null);
        setField(term225983, term225983.getClass(), "errors", null);
        setField(term225983, term225983.getClass(), "settings", null);
        setField(term225983, term225983.getClass(), "start", null);
        setField(term225983, term225983.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToBefore", argTypes, term225875, args);
        assertTrue(recursiveEquals(term225875, term225983));
    }

};


