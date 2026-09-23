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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301737;
     Object term301808;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term301789 = new ArrayList();
        term301737 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term301737, term301737.getClass(), "stack", term301789);
        ArrayList term301809 = new ArrayList();
        term301808 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term301808, term301808.getClass(), "state", null);
        setField(term301808, term301808.getClass(), "originalState", null);
        setBooleanField(term301808, term301808.getClass(), "baseUriSetFromDoc", false);
        setField(term301808, term301808.getClass(), "headElement", null);
        setField(term301808, term301808.getClass(), "formElement", null);
        setField(term301808, term301808.getClass(), "contextElement", null);
        setField(term301808, term301808.getClass(), "formattingElements", null);
        setField(term301808, term301808.getClass(), "pendingTableCharacters", null);
        setField(term301808, term301808.getClass(), "emptyEnd", null);
        setBooleanField(term301808, term301808.getClass(), "framesetOk", false);
        setBooleanField(term301808, term301808.getClass(), "fosterInserts", false);
        setBooleanField(term301808, term301808.getClass(), "fragmentParsing", false);
        setField(term301808, term301808.getClass(), "specificScopeTarget", null);
        setField(term301808, term301808.getClass(), "parser", null);
        setField(term301808, term301808.getClass(), "reader", null);
        setField(term301808, term301808.getClass(), "tokeniser", null);
        setField(term301808, term301808.getClass(), "doc", null);
        setField(term301808, term301808.getClass(), "stack", term301809);
        setField(term301808, term301808.getClass(), "baseUri", null);
        setField(term301808, term301808.getClass(), "currentToken", null);
        setField(term301808, term301808.getClass(), "settings", null);
        setField(term301808, term301808.getClass(), "start", null);
        setField(term301808, term301808.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term301737, args);
        assertTrue(recursiveEquals(term301737, term301808));
    }

};


