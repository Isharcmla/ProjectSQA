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

public class HtmlTreeBuilder_removeLastFormattingElement_307668102274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225382;
     Object term225445;

    public HtmlTreeBuilder_removeLastFormattingElement_307668102274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term225434 = new ArrayList();
        term225382 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term225382, term225382.getClass(), "formattingElements", term225434);
        ArrayList term225446 = new ArrayList();
        term225445 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term225445, term225445.getClass(), "state", null);
        setField(term225445, term225445.getClass(), "originalState", null);
        setBooleanField(term225445, term225445.getClass(), "baseUriSetFromDoc", false);
        setField(term225445, term225445.getClass(), "headElement", null);
        setField(term225445, term225445.getClass(), "formElement", null);
        setField(term225445, term225445.getClass(), "contextElement", null);
        setField(term225445, term225445.getClass(), "formattingElements", term225446);
        setField(term225445, term225445.getClass(), "pendingTableCharacters", null);
        setField(term225445, term225445.getClass(), "emptyEnd", null);
        setBooleanField(term225445, term225445.getClass(), "framesetOk", false);
        setBooleanField(term225445, term225445.getClass(), "fosterInserts", false);
        setBooleanField(term225445, term225445.getClass(), "fragmentParsing", false);
        setField(term225445, term225445.getClass(), "specificScopeTarget", null);
        setField(term225445, term225445.getClass(), "reader", null);
        setField(term225445, term225445.getClass(), "tokeniser", null);
        setField(term225445, term225445.getClass(), "doc", null);
        setField(term225445, term225445.getClass(), "stack", null);
        setField(term225445, term225445.getClass(), "baseUri", null);
        setField(term225445, term225445.getClass(), "currentToken", null);
        setField(term225445, term225445.getClass(), "errors", null);
        setField(term225445, term225445.getClass(), "settings", null);
        setField(term225445, term225445.getClass(), "start", null);
        setField(term225445, term225445.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "removeLastFormattingElement", argTypes, term225382, args);
        assertTrue(recursiveEquals(term225382, term225445));
        assertTrue(recursiveEquals(retValue, null));
    }

};


