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

public class HtmlTreeBuilder_inScope_28471792355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513187;
     Object term513309;

    public HtmlTreeBuilder_inScope_28471792355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term513239 = new ArrayList();
        term513187 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term513187, term513187.getClass(), "stack", term513239);
        ArrayList term513310 = new ArrayList();
        term513309 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term513309, term513309.getClass(), "state", null);
        setField(term513309, term513309.getClass(), "originalState", null);
        setBooleanField(term513309, term513309.getClass(), "baseUriSetFromDoc", false);
        setField(term513309, term513309.getClass(), "headElement", null);
        setField(term513309, term513309.getClass(), "formElement", null);
        setField(term513309, term513309.getClass(), "contextElement", null);
        setField(term513309, term513309.getClass(), "formattingElements", null);
        setField(term513309, term513309.getClass(), "pendingTableCharacters", null);
        setField(term513309, term513309.getClass(), "emptyEnd", null);
        setBooleanField(term513309, term513309.getClass(), "framesetOk", false);
        setBooleanField(term513309, term513309.getClass(), "fosterInserts", false);
        setBooleanField(term513309, term513309.getClass(), "fragmentParsing", false);
        setField(term513309, term513309.getClass(), "specificScopeTarget", null);
        setField(term513309, term513309.getClass(), "parser", null);
        setField(term513309, term513309.getClass(), "reader", null);
        setField(term513309, term513309.getClass(), "tokeniser", null);
        setField(term513309, term513309.getClass(), "doc", null);
        setField(term513309, term513309.getClass(), "stack", term513310);
        setField(term513309, term513309.getClass(), "baseUri", null);
        setField(term513309, term513309.getClass(), "currentToken", null);
        setField(term513309, term513309.getClass(), "settings", null);
        setField(term513309, term513309.getClass(), "start", null);
        setField(term513309, term513309.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inScope", argTypes, term513187, args);
        assertTrue(recursiveEquals(term513187, term513309));
    }

};


