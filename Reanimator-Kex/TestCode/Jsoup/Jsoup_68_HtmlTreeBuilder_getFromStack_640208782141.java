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

public class HtmlTreeBuilder_getFromStack_640208782141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39790;

    public HtmlTreeBuilder_getFromStack_640208782141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39790 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term39790, term39790.getClass(), "state", null);
        setField(term39790, term39790.getClass(), "originalState", null);
        setBooleanField(term39790, term39790.getClass(), "baseUriSetFromDoc", false);
        setField(term39790, term39790.getClass(), "headElement", null);
        setField(term39790, term39790.getClass(), "formElement", null);
        setField(term39790, term39790.getClass(), "contextElement", null);
        setField(term39790, term39790.getClass(), "formattingElements", null);
        setField(term39790, term39790.getClass(), "pendingTableCharacters", null);
        setField(term39790, term39790.getClass(), "emptyEnd", null);
        setBooleanField(term39790, term39790.getClass(), "framesetOk", false);
        setBooleanField(term39790, term39790.getClass(), "fosterInserts", false);
        setBooleanField(term39790, term39790.getClass(), "fragmentParsing", false);
        setField(term39790, term39790.getClass(), "specificScopeTarget", null);
        setField(term39790, term39790.getClass(), "reader", null);
        setField(term39790, term39790.getClass(), "tokeniser", null);
        setField(term39790, term39790.getClass(), "doc", null);
        setField(term39790, term39790.getClass(), "stack", null);
        setField(term39790, term39790.getClass(), "baseUri", null);
        setField(term39790, term39790.getClass(), "currentToken", null);
        setField(term39790, term39790.getClass(), "errors", null);
        setField(term39790, term39790.getClass(), "settings", null);
        setField(term39790, term39790.getClass(), "start", null);
        setField(term39790, term39790.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getFromStack", argTypes, term39790, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


