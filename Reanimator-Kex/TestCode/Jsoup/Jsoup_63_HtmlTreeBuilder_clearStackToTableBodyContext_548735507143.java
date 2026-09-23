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

public class HtmlTreeBuilder_clearStackToTableBodyContext_548735507143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47021;

    public HtmlTreeBuilder_clearStackToTableBodyContext_548735507143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47021 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term47021, term47021.getClass(), "state", null);
        setField(term47021, term47021.getClass(), "originalState", null);
        setBooleanField(term47021, term47021.getClass(), "baseUriSetFromDoc", false);
        setField(term47021, term47021.getClass(), "headElement", null);
        setField(term47021, term47021.getClass(), "formElement", null);
        setField(term47021, term47021.getClass(), "contextElement", null);
        setField(term47021, term47021.getClass(), "formattingElements", null);
        setField(term47021, term47021.getClass(), "pendingTableCharacters", null);
        setField(term47021, term47021.getClass(), "emptyEnd", null);
        setBooleanField(term47021, term47021.getClass(), "framesetOk", false);
        setBooleanField(term47021, term47021.getClass(), "fosterInserts", false);
        setBooleanField(term47021, term47021.getClass(), "fragmentParsing", false);
        setField(term47021, term47021.getClass(), "specificScopeTarget", null);
        setField(term47021, term47021.getClass(), "reader", null);
        setField(term47021, term47021.getClass(), "tokeniser", null);
        setField(term47021, term47021.getClass(), "doc", null);
        setField(term47021, term47021.getClass(), "stack", null);
        setField(term47021, term47021.getClass(), "baseUri", null);
        setField(term47021, term47021.getClass(), "currentToken", null);
        setField(term47021, term47021.getClass(), "errors", null);
        setField(term47021, term47021.getClass(), "settings", null);
        setField(term47021, term47021.getClass(), "start", null);
        setField(term47021, term47021.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableBodyContext", argTypes, term47021, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


