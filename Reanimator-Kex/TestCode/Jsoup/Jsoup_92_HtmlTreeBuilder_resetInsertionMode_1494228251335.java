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

public class HtmlTreeBuilder_resetInsertionMode_1494228251335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343855;
     Object term343918;

    public HtmlTreeBuilder_resetInsertionMode_1494228251335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term343907 = new ArrayList();
        term343855 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term343855, term343855.getClass(), "stack", term343907);
        ArrayList term343919 = new ArrayList();
        term343918 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term343918, term343918.getClass(), "state", null);
        setField(term343918, term343918.getClass(), "originalState", null);
        setBooleanField(term343918, term343918.getClass(), "baseUriSetFromDoc", false);
        setField(term343918, term343918.getClass(), "headElement", null);
        setField(term343918, term343918.getClass(), "formElement", null);
        setField(term343918, term343918.getClass(), "contextElement", null);
        setField(term343918, term343918.getClass(), "formattingElements", null);
        setField(term343918, term343918.getClass(), "pendingTableCharacters", null);
        setField(term343918, term343918.getClass(), "emptyEnd", null);
        setBooleanField(term343918, term343918.getClass(), "framesetOk", false);
        setBooleanField(term343918, term343918.getClass(), "fosterInserts", false);
        setBooleanField(term343918, term343918.getClass(), "fragmentParsing", false);
        setField(term343918, term343918.getClass(), "specificScopeTarget", null);
        setField(term343918, term343918.getClass(), "parser", null);
        setField(term343918, term343918.getClass(), "reader", null);
        setField(term343918, term343918.getClass(), "tokeniser", null);
        setField(term343918, term343918.getClass(), "doc", null);
        setField(term343918, term343918.getClass(), "stack", term343919);
        setField(term343918, term343918.getClass(), "baseUri", null);
        setField(term343918, term343918.getClass(), "currentToken", null);
        setField(term343918, term343918.getClass(), "settings", null);
        setField(term343918, term343918.getClass(), "start", null);
        setField(term343918, term343918.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetInsertionMode", argTypes, term343855, args);
        assertTrue(recursiveEquals(term343855, term343918));
    }

};


