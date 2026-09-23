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

public class HtmlTreeBuilder_popStackToBefore_1001500838226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251354;
     Object term251417;

    public HtmlTreeBuilder_popStackToBefore_1001500838226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term251406 = new ArrayList();
        term251354 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term251354, term251354.getClass(), "stack", term251406);
        ArrayList term251418 = new ArrayList();
        term251417 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term251417, term251417.getClass(), "state", null);
        setField(term251417, term251417.getClass(), "originalState", null);
        setBooleanField(term251417, term251417.getClass(), "baseUriSetFromDoc", false);
        setField(term251417, term251417.getClass(), "headElement", null);
        setField(term251417, term251417.getClass(), "formElement", null);
        setField(term251417, term251417.getClass(), "contextElement", null);
        setField(term251417, term251417.getClass(), "formattingElements", null);
        setField(term251417, term251417.getClass(), "pendingTableCharacters", null);
        setField(term251417, term251417.getClass(), "emptyEnd", null);
        setBooleanField(term251417, term251417.getClass(), "framesetOk", false);
        setBooleanField(term251417, term251417.getClass(), "fosterInserts", false);
        setBooleanField(term251417, term251417.getClass(), "fragmentParsing", false);
        setField(term251417, term251417.getClass(), "specificScopeTarget", null);
        setField(term251417, term251417.getClass(), "reader", null);
        setField(term251417, term251417.getClass(), "tokeniser", null);
        setField(term251417, term251417.getClass(), "doc", null);
        setField(term251417, term251417.getClass(), "stack", term251418);
        setField(term251417, term251417.getClass(), "baseUri", null);
        setField(term251417, term251417.getClass(), "currentToken", null);
        setField(term251417, term251417.getClass(), "errors", null);
        setField(term251417, term251417.getClass(), "settings", null);
        setField(term251417, term251417.getClass(), "start", null);
        setField(term251417, term251417.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToBefore", argTypes, term251354, args);
        assertTrue(recursiveEquals(term251354, term251417));
    }

};


