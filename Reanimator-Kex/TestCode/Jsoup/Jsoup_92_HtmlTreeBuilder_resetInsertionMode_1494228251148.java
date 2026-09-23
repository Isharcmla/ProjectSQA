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
     Object term62619;

    public HtmlTreeBuilder_resetInsertionMode_1494228251148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62619 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term62619, term62619.getClass(), "state", null);
        setField(term62619, term62619.getClass(), "originalState", null);
        setBooleanField(term62619, term62619.getClass(), "baseUriSetFromDoc", false);
        setField(term62619, term62619.getClass(), "headElement", null);
        setField(term62619, term62619.getClass(), "formElement", null);
        setField(term62619, term62619.getClass(), "contextElement", null);
        setField(term62619, term62619.getClass(), "formattingElements", null);
        setField(term62619, term62619.getClass(), "pendingTableCharacters", null);
        setField(term62619, term62619.getClass(), "emptyEnd", null);
        setBooleanField(term62619, term62619.getClass(), "framesetOk", false);
        setBooleanField(term62619, term62619.getClass(), "fosterInserts", false);
        setBooleanField(term62619, term62619.getClass(), "fragmentParsing", false);
        setField(term62619, term62619.getClass(), "specificScopeTarget", null);
        setField(term62619, term62619.getClass(), "parser", null);
        setField(term62619, term62619.getClass(), "reader", null);
        setField(term62619, term62619.getClass(), "tokeniser", null);
        setField(term62619, term62619.getClass(), "doc", null);
        setField(term62619, term62619.getClass(), "stack", null);
        setField(term62619, term62619.getClass(), "baseUri", null);
        setField(term62619, term62619.getClass(), "currentToken", null);
        setField(term62619, term62619.getClass(), "settings", null);
        setField(term62619, term62619.getClass(), "start", null);
        setField(term62619, term62619.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetInsertionMode", argTypes, term62619, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


