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

public class HtmlTreeBuilder_removeLastFormattingElement_307668102170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93966;

    public HtmlTreeBuilder_removeLastFormattingElement_307668102170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93966 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term93966, term93966.getClass(), "state", null);
        setField(term93966, term93966.getClass(), "originalState", null);
        setBooleanField(term93966, term93966.getClass(), "baseUriSetFromDoc", false);
        setField(term93966, term93966.getClass(), "headElement", null);
        setField(term93966, term93966.getClass(), "formElement", null);
        setField(term93966, term93966.getClass(), "contextElement", null);
        setField(term93966, term93966.getClass(), "formattingElements", null);
        setField(term93966, term93966.getClass(), "pendingTableCharacters", null);
        setField(term93966, term93966.getClass(), "emptyEnd", null);
        setBooleanField(term93966, term93966.getClass(), "framesetOk", false);
        setBooleanField(term93966, term93966.getClass(), "fosterInserts", false);
        setBooleanField(term93966, term93966.getClass(), "fragmentParsing", false);
        setField(term93966, term93966.getClass(), "specificScopeTarget", null);
        setField(term93966, term93966.getClass(), "parser", null);
        setField(term93966, term93966.getClass(), "reader", null);
        setField(term93966, term93966.getClass(), "tokeniser", null);
        setField(term93966, term93966.getClass(), "doc", null);
        setField(term93966, term93966.getClass(), "stack", null);
        setField(term93966, term93966.getClass(), "baseUri", null);
        setField(term93966, term93966.getClass(), "currentToken", null);
        setField(term93966, term93966.getClass(), "settings", null);
        setField(term93966, term93966.getClass(), "start", null);
        setField(term93966, term93966.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "removeLastFormattingElement", argTypes, term93966, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


