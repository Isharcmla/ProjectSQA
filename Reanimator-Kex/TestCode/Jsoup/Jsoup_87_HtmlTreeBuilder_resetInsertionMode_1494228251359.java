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

public class HtmlTreeBuilder_resetInsertionMode_1494228251359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term514073;
     Object term514136;

    public HtmlTreeBuilder_resetInsertionMode_1494228251359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term514125 = new ArrayList();
        term514073 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term514073, term514073.getClass(), "stack", term514125);
        ArrayList term514137 = new ArrayList();
        term514136 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term514136, term514136.getClass(), "state", null);
        setField(term514136, term514136.getClass(), "originalState", null);
        setBooleanField(term514136, term514136.getClass(), "baseUriSetFromDoc", false);
        setField(term514136, term514136.getClass(), "headElement", null);
        setField(term514136, term514136.getClass(), "formElement", null);
        setField(term514136, term514136.getClass(), "contextElement", null);
        setField(term514136, term514136.getClass(), "formattingElements", null);
        setField(term514136, term514136.getClass(), "pendingTableCharacters", null);
        setField(term514136, term514136.getClass(), "emptyEnd", null);
        setBooleanField(term514136, term514136.getClass(), "framesetOk", false);
        setBooleanField(term514136, term514136.getClass(), "fosterInserts", false);
        setBooleanField(term514136, term514136.getClass(), "fragmentParsing", false);
        setField(term514136, term514136.getClass(), "specificScopeTarget", null);
        setField(term514136, term514136.getClass(), "parser", null);
        setField(term514136, term514136.getClass(), "reader", null);
        setField(term514136, term514136.getClass(), "tokeniser", null);
        setField(term514136, term514136.getClass(), "doc", null);
        setField(term514136, term514136.getClass(), "stack", term514137);
        setField(term514136, term514136.getClass(), "baseUri", null);
        setField(term514136, term514136.getClass(), "currentToken", null);
        setField(term514136, term514136.getClass(), "settings", null);
        setField(term514136, term514136.getClass(), "start", null);
        setField(term514136, term514136.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetInsertionMode", argTypes, term514073, args);
        assertTrue(recursiveEquals(term514073, term514136));
    }

};


