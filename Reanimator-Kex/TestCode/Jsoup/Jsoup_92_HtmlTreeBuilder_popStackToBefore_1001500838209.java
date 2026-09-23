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

public class HtmlTreeBuilder_popStackToBefore_1001500838209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302285;
     Object term302348;

    public HtmlTreeBuilder_popStackToBefore_1001500838209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term302337 = new ArrayList();
        term302285 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term302285, term302285.getClass(), "stack", term302337);
        ArrayList term302349 = new ArrayList();
        term302348 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term302348, term302348.getClass(), "state", null);
        setField(term302348, term302348.getClass(), "originalState", null);
        setBooleanField(term302348, term302348.getClass(), "baseUriSetFromDoc", false);
        setField(term302348, term302348.getClass(), "headElement", null);
        setField(term302348, term302348.getClass(), "formElement", null);
        setField(term302348, term302348.getClass(), "contextElement", null);
        setField(term302348, term302348.getClass(), "formattingElements", null);
        setField(term302348, term302348.getClass(), "pendingTableCharacters", null);
        setField(term302348, term302348.getClass(), "emptyEnd", null);
        setBooleanField(term302348, term302348.getClass(), "framesetOk", false);
        setBooleanField(term302348, term302348.getClass(), "fosterInserts", false);
        setBooleanField(term302348, term302348.getClass(), "fragmentParsing", false);
        setField(term302348, term302348.getClass(), "specificScopeTarget", null);
        setField(term302348, term302348.getClass(), "parser", null);
        setField(term302348, term302348.getClass(), "reader", null);
        setField(term302348, term302348.getClass(), "tokeniser", null);
        setField(term302348, term302348.getClass(), "doc", null);
        setField(term302348, term302348.getClass(), "stack", term302349);
        setField(term302348, term302348.getClass(), "baseUri", null);
        setField(term302348, term302348.getClass(), "currentToken", null);
        setField(term302348, term302348.getClass(), "settings", null);
        setField(term302348, term302348.getClass(), "start", null);
        setField(term302348, term302348.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToBefore", argTypes, term302285, args);
        assertTrue(recursiveEquals(term302285, term302348));
    }

};


