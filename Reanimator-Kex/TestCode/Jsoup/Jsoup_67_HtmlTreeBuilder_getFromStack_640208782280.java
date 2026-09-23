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

public class HtmlTreeBuilder_getFromStack_640208782280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220088;
     Object term220151;

    public HtmlTreeBuilder_getFromStack_640208782280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term220140 = new ArrayList();
        term220088 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term220088, term220088.getClass(), "stack", term220140);
        ArrayList term220152 = new ArrayList();
        term220151 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term220151, term220151.getClass(), "state", null);
        setField(term220151, term220151.getClass(), "originalState", null);
        setBooleanField(term220151, term220151.getClass(), "baseUriSetFromDoc", false);
        setField(term220151, term220151.getClass(), "headElement", null);
        setField(term220151, term220151.getClass(), "formElement", null);
        setField(term220151, term220151.getClass(), "contextElement", null);
        setField(term220151, term220151.getClass(), "formattingElements", null);
        setField(term220151, term220151.getClass(), "pendingTableCharacters", null);
        setField(term220151, term220151.getClass(), "emptyEnd", null);
        setBooleanField(term220151, term220151.getClass(), "framesetOk", false);
        setBooleanField(term220151, term220151.getClass(), "fosterInserts", false);
        setBooleanField(term220151, term220151.getClass(), "fragmentParsing", false);
        setField(term220151, term220151.getClass(), "specificScopeTarget", null);
        setField(term220151, term220151.getClass(), "reader", null);
        setField(term220151, term220151.getClass(), "tokeniser", null);
        setField(term220151, term220151.getClass(), "doc", null);
        setField(term220151, term220151.getClass(), "stack", term220152);
        setField(term220151, term220151.getClass(), "baseUri", null);
        setField(term220151, term220151.getClass(), "currentToken", null);
        setField(term220151, term220151.getClass(), "errors", null);
        setField(term220151, term220151.getClass(), "settings", null);
        setField(term220151, term220151.getClass(), "start", null);
        setField(term220151, term220151.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFromStack", argTypes, term220088, args);
        assertTrue(recursiveEquals(term220088, term220151));
        assertTrue(recursiveEquals(retValue, null));
    }

};


