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

public class HtmlTreeBuilder_getActiveFormattingElement_851320383208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441455;
     Object term441871;

    public HtmlTreeBuilder_getActiveFormattingElement_851320383208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term441507 = new ArrayList();
        term441455 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term441455, term441455.getClass(), "formattingElements", term441507);
        ArrayList term441872 = new ArrayList();
        term441871 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term441871, term441871.getClass(), "state", null);
        setField(term441871, term441871.getClass(), "originalState", null);
        setBooleanField(term441871, term441871.getClass(), "baseUriSetFromDoc", false);
        setField(term441871, term441871.getClass(), "headElement", null);
        setField(term441871, term441871.getClass(), "formElement", null);
        setField(term441871, term441871.getClass(), "contextElement", null);
        setField(term441871, term441871.getClass(), "formattingElements", term441872);
        setField(term441871, term441871.getClass(), "pendingTableCharacters", null);
        setField(term441871, term441871.getClass(), "emptyEnd", null);
        setBooleanField(term441871, term441871.getClass(), "framesetOk", false);
        setBooleanField(term441871, term441871.getClass(), "fosterInserts", false);
        setBooleanField(term441871, term441871.getClass(), "fragmentParsing", false);
        setField(term441871, term441871.getClass(), "specificScopeTarget", null);
        setField(term441871, term441871.getClass(), "parser", null);
        setField(term441871, term441871.getClass(), "reader", null);
        setField(term441871, term441871.getClass(), "tokeniser", null);
        setField(term441871, term441871.getClass(), "doc", null);
        setField(term441871, term441871.getClass(), "stack", null);
        setField(term441871, term441871.getClass(), "baseUri", null);
        setField(term441871, term441871.getClass(), "currentToken", null);
        setField(term441871, term441871.getClass(), "settings", null);
        setField(term441871, term441871.getClass(), "start", null);
        setField(term441871, term441871.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getActiveFormattingElement", argTypes, term441455, args);
        assertTrue(recursiveEquals(term441455, term441871));
        assertTrue(recursiveEquals(retValue, null));
    }

};


