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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilder_popStackToBefore_1001500838145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45218;

    public HtmlTreeBuilder_popStackToBefore_1001500838145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45218 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term45218, term45218.getClass(), "state", null);
        setField(term45218, term45218.getClass(), "originalState", null);
        setBooleanField(term45218, term45218.getClass(), "baseUriSetFromDoc", false);
        setField(term45218, term45218.getClass(), "headElement", null);
        setField(term45218, term45218.getClass(), "formElement", null);
        setField(term45218, term45218.getClass(), "contextElement", null);
        setField(term45218, term45218.getClass(), "formattingElements", null);
        setField(term45218, term45218.getClass(), "pendingTableCharacters", null);
        setField(term45218, term45218.getClass(), "emptyEnd", null);
        setBooleanField(term45218, term45218.getClass(), "framesetOk", false);
        setBooleanField(term45218, term45218.getClass(), "fosterInserts", false);
        setBooleanField(term45218, term45218.getClass(), "fragmentParsing", false);
        setField(term45218, term45218.getClass(), "specificScopeTarget", null);
        setField(term45218, term45218.getClass(), "reader", null);
        setField(term45218, term45218.getClass(), "tokeniser", null);
        setField(term45218, term45218.getClass(), "doc", null);
        setField(term45218, term45218.getClass(), "stack", null);
        setField(term45218, term45218.getClass(), "baseUri", null);
        setField(term45218, term45218.getClass(), "currentToken", null);
        setField(term45218, term45218.getClass(), "errors", null);
        setField(term45218, term45218.getClass(), "settings", null);
        setField(term45218, term45218.getClass(), "start", null);
        setField(term45218, term45218.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "popStackToBefore", argTypes, term45218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


