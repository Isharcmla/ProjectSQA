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

public class HtmlTreeBuilder_inSelectScope_1800117556157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73233;

    public HtmlTreeBuilder_inSelectScope_1800117556157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73233 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term73233, term73233.getClass(), "state", null);
        setField(term73233, term73233.getClass(), "originalState", null);
        setBooleanField(term73233, term73233.getClass(), "baseUriSetFromDoc", false);
        setField(term73233, term73233.getClass(), "headElement", null);
        setField(term73233, term73233.getClass(), "formElement", null);
        setField(term73233, term73233.getClass(), "contextElement", null);
        setField(term73233, term73233.getClass(), "formattingElements", null);
        setField(term73233, term73233.getClass(), "pendingTableCharacters", null);
        setField(term73233, term73233.getClass(), "emptyEnd", null);
        setBooleanField(term73233, term73233.getClass(), "framesetOk", false);
        setBooleanField(term73233, term73233.getClass(), "fosterInserts", false);
        setBooleanField(term73233, term73233.getClass(), "fragmentParsing", false);
        setField(term73233, term73233.getClass(), "specificScopeTarget", null);
        setField(term73233, term73233.getClass(), "parser", null);
        setField(term73233, term73233.getClass(), "reader", null);
        setField(term73233, term73233.getClass(), "tokeniser", null);
        setField(term73233, term73233.getClass(), "doc", null);
        setField(term73233, term73233.getClass(), "stack", null);
        setField(term73233, term73233.getClass(), "baseUri", null);
        setField(term73233, term73233.getClass(), "currentToken", null);
        setField(term73233, term73233.getClass(), "settings", null);
        setField(term73233, term73233.getClass(), "start", null);
        setField(term73233, term73233.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inSelectScope", argTypes, term73233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


