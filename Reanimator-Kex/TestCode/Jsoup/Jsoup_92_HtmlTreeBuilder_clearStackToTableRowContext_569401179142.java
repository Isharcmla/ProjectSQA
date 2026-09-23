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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53806;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53806 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term53806, term53806.getClass(), "state", null);
        setField(term53806, term53806.getClass(), "originalState", null);
        setBooleanField(term53806, term53806.getClass(), "baseUriSetFromDoc", false);
        setField(term53806, term53806.getClass(), "headElement", null);
        setField(term53806, term53806.getClass(), "formElement", null);
        setField(term53806, term53806.getClass(), "contextElement", null);
        setField(term53806, term53806.getClass(), "formattingElements", null);
        setField(term53806, term53806.getClass(), "pendingTableCharacters", null);
        setField(term53806, term53806.getClass(), "emptyEnd", null);
        setBooleanField(term53806, term53806.getClass(), "framesetOk", false);
        setBooleanField(term53806, term53806.getClass(), "fosterInserts", false);
        setBooleanField(term53806, term53806.getClass(), "fragmentParsing", false);
        setField(term53806, term53806.getClass(), "specificScopeTarget", null);
        setField(term53806, term53806.getClass(), "parser", null);
        setField(term53806, term53806.getClass(), "reader", null);
        setField(term53806, term53806.getClass(), "tokeniser", null);
        setField(term53806, term53806.getClass(), "doc", null);
        setField(term53806, term53806.getClass(), "stack", null);
        setField(term53806, term53806.getClass(), "baseUri", null);
        setField(term53806, term53806.getClass(), "currentToken", null);
        setField(term53806, term53806.getClass(), "settings", null);
        setField(term53806, term53806.getClass(), "start", null);
        setField(term53806, term53806.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableRowContext", argTypes, term53806, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


