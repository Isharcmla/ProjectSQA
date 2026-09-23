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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246081;
     Object term246198;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term246133 = new ArrayList();
        term246081 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term246081, term246081.getClass(), "stack", term246133);
        ArrayList term246199 = new ArrayList();
        term246198 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term246198, term246198.getClass(), "state", null);
        setField(term246198, term246198.getClass(), "originalState", null);
        setBooleanField(term246198, term246198.getClass(), "baseUriSetFromDoc", false);
        setField(term246198, term246198.getClass(), "headElement", null);
        setField(term246198, term246198.getClass(), "formElement", null);
        setField(term246198, term246198.getClass(), "contextElement", null);
        setField(term246198, term246198.getClass(), "formattingElements", null);
        setField(term246198, term246198.getClass(), "pendingTableCharacters", null);
        setField(term246198, term246198.getClass(), "emptyEnd", null);
        setBooleanField(term246198, term246198.getClass(), "framesetOk", false);
        setBooleanField(term246198, term246198.getClass(), "fosterInserts", false);
        setBooleanField(term246198, term246198.getClass(), "fragmentParsing", false);
        setField(term246198, term246198.getClass(), "specificScopeTarget", null);
        setField(term246198, term246198.getClass(), "reader", null);
        setField(term246198, term246198.getClass(), "tokeniser", null);
        setField(term246198, term246198.getClass(), "doc", null);
        setField(term246198, term246198.getClass(), "stack", term246199);
        setField(term246198, term246198.getClass(), "baseUri", null);
        setField(term246198, term246198.getClass(), "currentToken", null);
        setField(term246198, term246198.getClass(), "errors", null);
        setField(term246198, term246198.getClass(), "settings", null);
        setField(term246198, term246198.getClass(), "start", null);
        setField(term246198, term246198.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term246081, args);
        assertTrue(recursiveEquals(term246081, term246198));
    }

};


