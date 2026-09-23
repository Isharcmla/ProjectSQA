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

public class HtmlTreeBuilder_lastFormattingElement_1625168298241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450122;
     Object term450185;

    public HtmlTreeBuilder_lastFormattingElement_1625168298241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term450174 = new ArrayList();
        term450122 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term450122, term450122.getClass(), "formattingElements", term450174);
        ArrayList term450186 = new ArrayList();
        term450185 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term450185, term450185.getClass(), "state", null);
        setField(term450185, term450185.getClass(), "originalState", null);
        setBooleanField(term450185, term450185.getClass(), "baseUriSetFromDoc", false);
        setField(term450185, term450185.getClass(), "headElement", null);
        setField(term450185, term450185.getClass(), "formElement", null);
        setField(term450185, term450185.getClass(), "contextElement", null);
        setField(term450185, term450185.getClass(), "formattingElements", term450186);
        setField(term450185, term450185.getClass(), "pendingTableCharacters", null);
        setField(term450185, term450185.getClass(), "emptyEnd", null);
        setBooleanField(term450185, term450185.getClass(), "framesetOk", false);
        setBooleanField(term450185, term450185.getClass(), "fosterInserts", false);
        setBooleanField(term450185, term450185.getClass(), "fragmentParsing", false);
        setField(term450185, term450185.getClass(), "specificScopeTarget", null);
        setField(term450185, term450185.getClass(), "parser", null);
        setField(term450185, term450185.getClass(), "reader", null);
        setField(term450185, term450185.getClass(), "tokeniser", null);
        setField(term450185, term450185.getClass(), "doc", null);
        setField(term450185, term450185.getClass(), "stack", null);
        setField(term450185, term450185.getClass(), "baseUri", null);
        setField(term450185, term450185.getClass(), "currentToken", null);
        setField(term450185, term450185.getClass(), "settings", null);
        setField(term450185, term450185.getClass(), "start", null);
        setField(term450185, term450185.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "lastFormattingElement", argTypes, term450122, args);
        assertTrue(recursiveEquals(term450122, term450185));
        assertTrue(recursiveEquals(retValue, null));
    }

};


