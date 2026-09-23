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

public class HtmlTreeBuilder_error_1815929388121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23131;

    public HtmlTreeBuilder_error_1815929388121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23131 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term23131, term23131.getClass(), "state", null);
        setField(term23131, term23131.getClass(), "originalState", null);
        setBooleanField(term23131, term23131.getClass(), "baseUriSetFromDoc", false);
        setField(term23131, term23131.getClass(), "headElement", null);
        setField(term23131, term23131.getClass(), "formElement", null);
        setField(term23131, term23131.getClass(), "contextElement", null);
        setField(term23131, term23131.getClass(), "formattingElements", null);
        setField(term23131, term23131.getClass(), "pendingTableCharacters", null);
        setField(term23131, term23131.getClass(), "emptyEnd", null);
        setBooleanField(term23131, term23131.getClass(), "framesetOk", false);
        setBooleanField(term23131, term23131.getClass(), "fosterInserts", false);
        setBooleanField(term23131, term23131.getClass(), "fragmentParsing", false);
        setField(term23131, term23131.getClass(), "specificScopeTarget", null);
        setField(term23131, term23131.getClass(), "parser", null);
        setField(term23131, term23131.getClass(), "reader", null);
        setField(term23131, term23131.getClass(), "tokeniser", null);
        setField(term23131, term23131.getClass(), "doc", null);
        setField(term23131, term23131.getClass(), "stack", null);
        setField(term23131, term23131.getClass(), "baseUri", null);
        setField(term23131, term23131.getClass(), "currentToken", null);
        setField(term23131, term23131.getClass(), "settings", null);
        setField(term23131, term23131.getClass(), "start", null);
        setField(term23131, term23131.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term23131, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


