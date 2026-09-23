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

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101311;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101311 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term101311, term101311.getClass(), "state", null);
        setField(term101311, term101311.getClass(), "originalState", null);
        setBooleanField(term101311, term101311.getClass(), "baseUriSetFromDoc", false);
        setField(term101311, term101311.getClass(), "headElement", null);
        setField(term101311, term101311.getClass(), "formElement", null);
        setField(term101311, term101311.getClass(), "contextElement", null);
        setField(term101311, term101311.getClass(), "formattingElements", null);
        setField(term101311, term101311.getClass(), "pendingTableCharacters", null);
        setField(term101311, term101311.getClass(), "emptyEnd", null);
        setBooleanField(term101311, term101311.getClass(), "framesetOk", false);
        setBooleanField(term101311, term101311.getClass(), "fosterInserts", false);
        setBooleanField(term101311, term101311.getClass(), "fragmentParsing", false);
        setField(term101311, term101311.getClass(), "specificScopeTarget", null);
        setField(term101311, term101311.getClass(), "parser", null);
        setField(term101311, term101311.getClass(), "reader", null);
        setField(term101311, term101311.getClass(), "tokeniser", null);
        setField(term101311, term101311.getClass(), "doc", null);
        setField(term101311, term101311.getClass(), "stack", null);
        setField(term101311, term101311.getClass(), "baseUri", null);
        setField(term101311, term101311.getClass(), "currentToken", null);
        setField(term101311, term101311.getClass(), "settings", null);
        setField(term101311, term101311.getClass(), "start", null);
        setField(term101311, term101311.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeFromActiveFormattingElements", argTypes, term101311, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


