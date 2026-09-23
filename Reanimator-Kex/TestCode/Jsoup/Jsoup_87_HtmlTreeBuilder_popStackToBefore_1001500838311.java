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

public class HtmlTreeBuilder_popStackToBefore_1001500838311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490739;
     Object term490815;

    public HtmlTreeBuilder_popStackToBefore_1001500838311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term490791 = new ArrayList();
        term490739 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term490739, term490739.getClass(), "stack", term490791);
        ArrayList term490816 = new ArrayList();
        term490815 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term490815, term490815.getClass(), "state", null);
        setField(term490815, term490815.getClass(), "originalState", null);
        setBooleanField(term490815, term490815.getClass(), "baseUriSetFromDoc", false);
        setField(term490815, term490815.getClass(), "headElement", null);
        setField(term490815, term490815.getClass(), "formElement", null);
        setField(term490815, term490815.getClass(), "contextElement", null);
        setField(term490815, term490815.getClass(), "formattingElements", null);
        setField(term490815, term490815.getClass(), "pendingTableCharacters", null);
        setField(term490815, term490815.getClass(), "emptyEnd", null);
        setBooleanField(term490815, term490815.getClass(), "framesetOk", false);
        setBooleanField(term490815, term490815.getClass(), "fosterInserts", false);
        setBooleanField(term490815, term490815.getClass(), "fragmentParsing", false);
        setField(term490815, term490815.getClass(), "specificScopeTarget", null);
        setField(term490815, term490815.getClass(), "parser", null);
        setField(term490815, term490815.getClass(), "reader", null);
        setField(term490815, term490815.getClass(), "tokeniser", null);
        setField(term490815, term490815.getClass(), "doc", null);
        setField(term490815, term490815.getClass(), "stack", term490816);
        setField(term490815, term490815.getClass(), "baseUri", null);
        setField(term490815, term490815.getClass(), "currentToken", null);
        setField(term490815, term490815.getClass(), "settings", null);
        setField(term490815, term490815.getClass(), "start", null);
        setField(term490815, term490815.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToBefore", argTypes, term490739, args);
        assertTrue(recursiveEquals(term490739, term490815));
    }

};


