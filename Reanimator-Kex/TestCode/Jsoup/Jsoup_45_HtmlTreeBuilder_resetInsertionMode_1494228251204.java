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

public class HtmlTreeBuilder_resetInsertionMode_1494228251204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603456;
     Object term603775;

    public HtmlTreeBuilder_resetInsertionMode_1494228251204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term603508 = new ArrayList();
        term603456 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term603456, term603456.getClass(), "stack", term603508);
        ArrayList term603776 = new ArrayList();
        term603775 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term603775, term603775.getClass(), "state", null);
        setField(term603775, term603775.getClass(), "originalState", null);
        setBooleanField(term603775, term603775.getClass(), "baseUriSetFromDoc", false);
        setField(term603775, term603775.getClass(), "headElement", null);
        setField(term603775, term603775.getClass(), "formElement", null);
        setField(term603775, term603775.getClass(), "contextElement", null);
        setField(term603775, term603775.getClass(), "formattingElements", null);
        setField(term603775, term603775.getClass(), "pendingTableCharacters", null);
        setField(term603775, term603775.getClass(), "emptyEnd", null);
        setBooleanField(term603775, term603775.getClass(), "framesetOk", false);
        setBooleanField(term603775, term603775.getClass(), "fosterInserts", false);
        setBooleanField(term603775, term603775.getClass(), "fragmentParsing", false);
        setField(term603775, term603775.getClass(), "specificScopeTarget", null);
        setField(term603775, term603775.getClass(), "reader", null);
        setField(term603775, term603775.getClass(), "tokeniser", null);
        setField(term603775, term603775.getClass(), "doc", null);
        setField(term603775, term603775.getClass(), "stack", term603776);
        setField(term603775, term603775.getClass(), "baseUri", null);
        setField(term603775, term603775.getClass(), "currentToken", null);
        setField(term603775, term603775.getClass(), "errors", null);
        setField(term603775, term603775.getClass(), "start", null);
        setField(term603775, term603775.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetInsertionMode", argTypes, term603456, args);
        assertTrue(recursiveEquals(term603456, term603775));
    }

};


