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

public class HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195480;
     Object term195810;

    public HtmlTreeBuilder_clearFormattingElementsToLastMarker_1336759180192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term195532 = new ArrayList();
        term195480 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term195480, term195480.getClass(), "formattingElements", term195532);
        ArrayList term195811 = new ArrayList();
        term195810 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term195810, term195810.getClass(), "state", null);
        setField(term195810, term195810.getClass(), "originalState", null);
        setBooleanField(term195810, term195810.getClass(), "baseUriSetFromDoc", false);
        setField(term195810, term195810.getClass(), "headElement", null);
        setField(term195810, term195810.getClass(), "formElement", null);
        setField(term195810, term195810.getClass(), "contextElement", null);
        setField(term195810, term195810.getClass(), "formattingElements", term195811);
        setField(term195810, term195810.getClass(), "pendingTableCharacters", null);
        setField(term195810, term195810.getClass(), "emptyEnd", null);
        setBooleanField(term195810, term195810.getClass(), "framesetOk", false);
        setBooleanField(term195810, term195810.getClass(), "fosterInserts", false);
        setBooleanField(term195810, term195810.getClass(), "fragmentParsing", false);
        setField(term195810, term195810.getClass(), "specificScopeTarget", null);
        setField(term195810, term195810.getClass(), "reader", null);
        setField(term195810, term195810.getClass(), "tokeniser", null);
        setField(term195810, term195810.getClass(), "doc", null);
        setField(term195810, term195810.getClass(), "stack", null);
        setField(term195810, term195810.getClass(), "baseUri", null);
        setField(term195810, term195810.getClass(), "currentToken", null);
        setField(term195810, term195810.getClass(), "errors", null);
        setField(term195810, term195810.getClass(), "settings", null);
        setField(term195810, term195810.getClass(), "start", null);
        setField(term195810, term195810.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearFormattingElementsToLastMarker", argTypes, term195480, args);
        assertTrue(recursiveEquals(term195480, term195810));
    }

};


