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

public class HtmlTreeBuilder_resetInsertionMode_1494228251148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60408;

    public HtmlTreeBuilder_resetInsertionMode_1494228251148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60408 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term60408, term60408.getClass(), "state", null);
        setField(term60408, term60408.getClass(), "originalState", null);
        setBooleanField(term60408, term60408.getClass(), "baseUriSetFromDoc", false);
        setField(term60408, term60408.getClass(), "headElement", null);
        setField(term60408, term60408.getClass(), "formElement", null);
        setField(term60408, term60408.getClass(), "contextElement", null);
        setField(term60408, term60408.getClass(), "formattingElements", null);
        setField(term60408, term60408.getClass(), "pendingTableCharacters", null);
        setField(term60408, term60408.getClass(), "emptyEnd", null);
        setBooleanField(term60408, term60408.getClass(), "framesetOk", false);
        setBooleanField(term60408, term60408.getClass(), "fosterInserts", false);
        setBooleanField(term60408, term60408.getClass(), "fragmentParsing", false);
        setField(term60408, term60408.getClass(), "specificScopeTarget", null);
        setField(term60408, term60408.getClass(), "parser", null);
        setField(term60408, term60408.getClass(), "reader", null);
        setField(term60408, term60408.getClass(), "tokeniser", null);
        setField(term60408, term60408.getClass(), "doc", null);
        setField(term60408, term60408.getClass(), "stack", null);
        setField(term60408, term60408.getClass(), "baseUri", null);
        setField(term60408, term60408.getClass(), "currentToken", null);
        setField(term60408, term60408.getClass(), "settings", null);
        setField(term60408, term60408.getClass(), "start", null);
        setField(term60408, term60408.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetInsertionMode", argTypes, term60408, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


