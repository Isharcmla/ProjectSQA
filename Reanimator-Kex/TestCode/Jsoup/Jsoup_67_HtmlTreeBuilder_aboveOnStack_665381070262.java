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

public class HtmlTreeBuilder_aboveOnStack_665381070262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216067;
     Object term216380;

    public HtmlTreeBuilder_aboveOnStack_665381070262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term216119 = new ArrayList();
        term216067 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term216067, term216067.getClass(), "stack", term216119);
        ArrayList term216381 = new ArrayList();
        term216380 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term216380, term216380.getClass(), "state", null);
        setField(term216380, term216380.getClass(), "originalState", null);
        setBooleanField(term216380, term216380.getClass(), "baseUriSetFromDoc", false);
        setField(term216380, term216380.getClass(), "headElement", null);
        setField(term216380, term216380.getClass(), "formElement", null);
        setField(term216380, term216380.getClass(), "contextElement", null);
        setField(term216380, term216380.getClass(), "formattingElements", null);
        setField(term216380, term216380.getClass(), "pendingTableCharacters", null);
        setField(term216380, term216380.getClass(), "emptyEnd", null);
        setBooleanField(term216380, term216380.getClass(), "framesetOk", false);
        setBooleanField(term216380, term216380.getClass(), "fosterInserts", false);
        setBooleanField(term216380, term216380.getClass(), "fragmentParsing", false);
        setField(term216380, term216380.getClass(), "specificScopeTarget", null);
        setField(term216380, term216380.getClass(), "reader", null);
        setField(term216380, term216380.getClass(), "tokeniser", null);
        setField(term216380, term216380.getClass(), "doc", null);
        setField(term216380, term216380.getClass(), "stack", term216381);
        setField(term216380, term216380.getClass(), "baseUri", null);
        setField(term216380, term216380.getClass(), "currentToken", null);
        setField(term216380, term216380.getClass(), "errors", null);
        setField(term216380, term216380.getClass(), "settings", null);
        setField(term216380, term216380.getClass(), "start", null);
        setField(term216380, term216380.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term216067, args);
        assertTrue(recursiveEquals(term216067, term216380));
        assertTrue(recursiveEquals(retValue, null));
    }

};


