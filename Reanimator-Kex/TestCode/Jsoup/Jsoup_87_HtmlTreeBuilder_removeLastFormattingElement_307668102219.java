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

public class HtmlTreeBuilder_removeLastFormattingElement_307668102219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443157;
     Object term443486;

    public HtmlTreeBuilder_removeLastFormattingElement_307668102219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term443209 = new ArrayList();
        term443157 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term443157, term443157.getClass(), "formattingElements", term443209);
        ArrayList term443487 = new ArrayList();
        term443486 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term443486, term443486.getClass(), "state", null);
        setField(term443486, term443486.getClass(), "originalState", null);
        setBooleanField(term443486, term443486.getClass(), "baseUriSetFromDoc", false);
        setField(term443486, term443486.getClass(), "headElement", null);
        setField(term443486, term443486.getClass(), "formElement", null);
        setField(term443486, term443486.getClass(), "contextElement", null);
        setField(term443486, term443486.getClass(), "formattingElements", term443487);
        setField(term443486, term443486.getClass(), "pendingTableCharacters", null);
        setField(term443486, term443486.getClass(), "emptyEnd", null);
        setBooleanField(term443486, term443486.getClass(), "framesetOk", false);
        setBooleanField(term443486, term443486.getClass(), "fosterInserts", false);
        setBooleanField(term443486, term443486.getClass(), "fragmentParsing", false);
        setField(term443486, term443486.getClass(), "specificScopeTarget", null);
        setField(term443486, term443486.getClass(), "parser", null);
        setField(term443486, term443486.getClass(), "reader", null);
        setField(term443486, term443486.getClass(), "tokeniser", null);
        setField(term443486, term443486.getClass(), "doc", null);
        setField(term443486, term443486.getClass(), "stack", null);
        setField(term443486, term443486.getClass(), "baseUri", null);
        setField(term443486, term443486.getClass(), "currentToken", null);
        setField(term443486, term443486.getClass(), "settings", null);
        setField(term443486, term443486.getClass(), "start", null);
        setField(term443486, term443486.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "removeLastFormattingElement", argTypes, term443157, args);
        assertTrue(recursiveEquals(term443157, term443486));
        assertTrue(recursiveEquals(retValue, null));
    }

};


