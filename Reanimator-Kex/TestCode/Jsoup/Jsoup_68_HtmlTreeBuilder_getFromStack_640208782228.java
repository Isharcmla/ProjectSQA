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

public class HtmlTreeBuilder_getFromStack_640208782228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251500;
     Object term251563;

    public HtmlTreeBuilder_getFromStack_640208782228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term251552 = new ArrayList();
        term251500 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term251500, term251500.getClass(), "stack", term251552);
        ArrayList term251564 = new ArrayList();
        term251563 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term251563, term251563.getClass(), "state", null);
        setField(term251563, term251563.getClass(), "originalState", null);
        setBooleanField(term251563, term251563.getClass(), "baseUriSetFromDoc", false);
        setField(term251563, term251563.getClass(), "headElement", null);
        setField(term251563, term251563.getClass(), "formElement", null);
        setField(term251563, term251563.getClass(), "contextElement", null);
        setField(term251563, term251563.getClass(), "formattingElements", null);
        setField(term251563, term251563.getClass(), "pendingTableCharacters", null);
        setField(term251563, term251563.getClass(), "emptyEnd", null);
        setBooleanField(term251563, term251563.getClass(), "framesetOk", false);
        setBooleanField(term251563, term251563.getClass(), "fosterInserts", false);
        setBooleanField(term251563, term251563.getClass(), "fragmentParsing", false);
        setField(term251563, term251563.getClass(), "specificScopeTarget", null);
        setField(term251563, term251563.getClass(), "reader", null);
        setField(term251563, term251563.getClass(), "tokeniser", null);
        setField(term251563, term251563.getClass(), "doc", null);
        setField(term251563, term251563.getClass(), "stack", term251564);
        setField(term251563, term251563.getClass(), "baseUri", null);
        setField(term251563, term251563.getClass(), "currentToken", null);
        setField(term251563, term251563.getClass(), "errors", null);
        setField(term251563, term251563.getClass(), "settings", null);
        setField(term251563, term251563.getClass(), "start", null);
        setField(term251563, term251563.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFromStack", argTypes, term251500, args);
        assertTrue(recursiveEquals(term251500, term251563));
        assertTrue(recursiveEquals(retValue, null));
    }

};


