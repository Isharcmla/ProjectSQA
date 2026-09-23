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

public class HtmlTreeBuilder_popStackToBefore_1001500838223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199476;
     Object term201874;

    public HtmlTreeBuilder_popStackToBefore_1001500838223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term199528 = new ArrayList();
        term199476 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term199476, term199476.getClass(), "stack", term199528);
        ArrayList term201875 = new ArrayList();
        term201874 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term201874, term201874.getClass(), "state", null);
        setField(term201874, term201874.getClass(), "originalState", null);
        setBooleanField(term201874, term201874.getClass(), "baseUriSetFromDoc", false);
        setField(term201874, term201874.getClass(), "headElement", null);
        setField(term201874, term201874.getClass(), "formElement", null);
        setField(term201874, term201874.getClass(), "contextElement", null);
        setField(term201874, term201874.getClass(), "formattingElements", null);
        setField(term201874, term201874.getClass(), "pendingTableCharacters", null);
        setField(term201874, term201874.getClass(), "emptyEnd", null);
        setBooleanField(term201874, term201874.getClass(), "framesetOk", false);
        setBooleanField(term201874, term201874.getClass(), "fosterInserts", false);
        setBooleanField(term201874, term201874.getClass(), "fragmentParsing", false);
        setField(term201874, term201874.getClass(), "specificScopeTarget", null);
        setField(term201874, term201874.getClass(), "reader", null);
        setField(term201874, term201874.getClass(), "tokeniser", null);
        setField(term201874, term201874.getClass(), "doc", null);
        setField(term201874, term201874.getClass(), "stack", term201875);
        setField(term201874, term201874.getClass(), "baseUri", null);
        setField(term201874, term201874.getClass(), "currentToken", null);
        setField(term201874, term201874.getClass(), "errors", null);
        setField(term201874, term201874.getClass(), "settings", null);
        setField(term201874, term201874.getClass(), "start", null);
        setField(term201874, term201874.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToBefore", argTypes, term199476, args);
        assertTrue(recursiveEquals(term199476, term201874));
    }

};


