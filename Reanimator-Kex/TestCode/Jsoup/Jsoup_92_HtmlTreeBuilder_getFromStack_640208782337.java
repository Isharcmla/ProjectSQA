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

public class HtmlTreeBuilder_getFromStack_640208782337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344014;
     Object term344077;

    public HtmlTreeBuilder_getFromStack_640208782337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term344066 = new ArrayList();
        term344014 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term344014, term344014.getClass(), "stack", term344066);
        ArrayList term344078 = new ArrayList();
        term344077 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term344077, term344077.getClass(), "state", null);
        setField(term344077, term344077.getClass(), "originalState", null);
        setBooleanField(term344077, term344077.getClass(), "baseUriSetFromDoc", false);
        setField(term344077, term344077.getClass(), "headElement", null);
        setField(term344077, term344077.getClass(), "formElement", null);
        setField(term344077, term344077.getClass(), "contextElement", null);
        setField(term344077, term344077.getClass(), "formattingElements", null);
        setField(term344077, term344077.getClass(), "pendingTableCharacters", null);
        setField(term344077, term344077.getClass(), "emptyEnd", null);
        setBooleanField(term344077, term344077.getClass(), "framesetOk", false);
        setBooleanField(term344077, term344077.getClass(), "fosterInserts", false);
        setBooleanField(term344077, term344077.getClass(), "fragmentParsing", false);
        setField(term344077, term344077.getClass(), "specificScopeTarget", null);
        setField(term344077, term344077.getClass(), "parser", null);
        setField(term344077, term344077.getClass(), "reader", null);
        setField(term344077, term344077.getClass(), "tokeniser", null);
        setField(term344077, term344077.getClass(), "doc", null);
        setField(term344077, term344077.getClass(), "stack", term344078);
        setField(term344077, term344077.getClass(), "baseUri", null);
        setField(term344077, term344077.getClass(), "currentToken", null);
        setField(term344077, term344077.getClass(), "settings", null);
        setField(term344077, term344077.getClass(), "start", null);
        setField(term344077, term344077.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFromStack", argTypes, term344014, args);
        assertTrue(recursiveEquals(term344014, term344077));
        assertTrue(recursiveEquals(retValue, null));
    }

};


