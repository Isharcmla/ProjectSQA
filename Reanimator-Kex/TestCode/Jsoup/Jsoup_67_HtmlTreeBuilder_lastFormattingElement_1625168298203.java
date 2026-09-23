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

public class HtmlTreeBuilder_lastFormattingElement_1625168298203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196682;
     Object term196895;

    public HtmlTreeBuilder_lastFormattingElement_1625168298203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term196734 = new ArrayList();
        term196682 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term196682, term196682.getClass(), "formattingElements", term196734);
        ArrayList term196896 = new ArrayList();
        term196895 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term196895, term196895.getClass(), "state", null);
        setField(term196895, term196895.getClass(), "originalState", null);
        setBooleanField(term196895, term196895.getClass(), "baseUriSetFromDoc", false);
        setField(term196895, term196895.getClass(), "headElement", null);
        setField(term196895, term196895.getClass(), "formElement", null);
        setField(term196895, term196895.getClass(), "contextElement", null);
        setField(term196895, term196895.getClass(), "formattingElements", term196896);
        setField(term196895, term196895.getClass(), "pendingTableCharacters", null);
        setField(term196895, term196895.getClass(), "emptyEnd", null);
        setBooleanField(term196895, term196895.getClass(), "framesetOk", false);
        setBooleanField(term196895, term196895.getClass(), "fosterInserts", false);
        setBooleanField(term196895, term196895.getClass(), "fragmentParsing", false);
        setField(term196895, term196895.getClass(), "specificScopeTarget", null);
        setField(term196895, term196895.getClass(), "reader", null);
        setField(term196895, term196895.getClass(), "tokeniser", null);
        setField(term196895, term196895.getClass(), "doc", null);
        setField(term196895, term196895.getClass(), "stack", null);
        setField(term196895, term196895.getClass(), "baseUri", null);
        setField(term196895, term196895.getClass(), "currentToken", null);
        setField(term196895, term196895.getClass(), "errors", null);
        setField(term196895, term196895.getClass(), "settings", null);
        setField(term196895, term196895.getClass(), "start", null);
        setField(term196895, term196895.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "lastFormattingElement", argTypes, term196682, args);
        assertTrue(recursiveEquals(term196682, term196895));
        assertTrue(recursiveEquals(retValue, null));
    }

};


