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

public class HtmlTreeBuilder_getFromStack_640208782315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491068;
     Object term491131;

    public HtmlTreeBuilder_getFromStack_640208782315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term491120 = new ArrayList();
        term491068 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term491068, term491068.getClass(), "stack", term491120);
        ArrayList term491132 = new ArrayList();
        term491131 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term491131, term491131.getClass(), "state", null);
        setField(term491131, term491131.getClass(), "originalState", null);
        setBooleanField(term491131, term491131.getClass(), "baseUriSetFromDoc", false);
        setField(term491131, term491131.getClass(), "headElement", null);
        setField(term491131, term491131.getClass(), "formElement", null);
        setField(term491131, term491131.getClass(), "contextElement", null);
        setField(term491131, term491131.getClass(), "formattingElements", null);
        setField(term491131, term491131.getClass(), "pendingTableCharacters", null);
        setField(term491131, term491131.getClass(), "emptyEnd", null);
        setBooleanField(term491131, term491131.getClass(), "framesetOk", false);
        setBooleanField(term491131, term491131.getClass(), "fosterInserts", false);
        setBooleanField(term491131, term491131.getClass(), "fragmentParsing", false);
        setField(term491131, term491131.getClass(), "specificScopeTarget", null);
        setField(term491131, term491131.getClass(), "parser", null);
        setField(term491131, term491131.getClass(), "reader", null);
        setField(term491131, term491131.getClass(), "tokeniser", null);
        setField(term491131, term491131.getClass(), "doc", null);
        setField(term491131, term491131.getClass(), "stack", term491132);
        setField(term491131, term491131.getClass(), "baseUri", null);
        setField(term491131, term491131.getClass(), "currentToken", null);
        setField(term491131, term491131.getClass(), "settings", null);
        setField(term491131, term491131.getClass(), "start", null);
        setField(term491131, term491131.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFromStack", argTypes, term491068, args);
        assertTrue(recursiveEquals(term491068, term491131));
        assertTrue(recursiveEquals(retValue, null));
    }

};


