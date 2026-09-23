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

public class HtmlTreeBuilder_removeLastFormattingElement_307668102320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282639;
     Object term282702;

    public HtmlTreeBuilder_removeLastFormattingElement_307668102320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term282691 = new ArrayList();
        term282639 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term282639, term282639.getClass(), "formattingElements", term282691);
        ArrayList term282703 = new ArrayList();
        term282702 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term282702, term282702.getClass(), "state", null);
        setField(term282702, term282702.getClass(), "originalState", null);
        setBooleanField(term282702, term282702.getClass(), "baseUriSetFromDoc", false);
        setField(term282702, term282702.getClass(), "headElement", null);
        setField(term282702, term282702.getClass(), "formElement", null);
        setField(term282702, term282702.getClass(), "contextElement", null);
        setField(term282702, term282702.getClass(), "formattingElements", term282703);
        setField(term282702, term282702.getClass(), "pendingTableCharacters", null);
        setField(term282702, term282702.getClass(), "emptyEnd", null);
        setBooleanField(term282702, term282702.getClass(), "framesetOk", false);
        setBooleanField(term282702, term282702.getClass(), "fosterInserts", false);
        setBooleanField(term282702, term282702.getClass(), "fragmentParsing", false);
        setField(term282702, term282702.getClass(), "specificScopeTarget", null);
        setField(term282702, term282702.getClass(), "reader", null);
        setField(term282702, term282702.getClass(), "tokeniser", null);
        setField(term282702, term282702.getClass(), "doc", null);
        setField(term282702, term282702.getClass(), "stack", null);
        setField(term282702, term282702.getClass(), "baseUri", null);
        setField(term282702, term282702.getClass(), "currentToken", null);
        setField(term282702, term282702.getClass(), "errors", null);
        setField(term282702, term282702.getClass(), "settings", null);
        setField(term282702, term282702.getClass(), "start", null);
        setField(term282702, term282702.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "removeLastFormattingElement", argTypes, term282639, args);
        assertTrue(recursiveEquals(term282639, term282702));
        assertTrue(recursiveEquals(retValue, null));
    }

};


