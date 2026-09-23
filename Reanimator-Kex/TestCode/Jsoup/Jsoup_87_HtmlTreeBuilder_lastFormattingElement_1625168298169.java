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

public class HtmlTreeBuilder_lastFormattingElement_1625168298169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89540;

    public HtmlTreeBuilder_lastFormattingElement_1625168298169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89540 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term89540, term89540.getClass(), "state", null);
        setField(term89540, term89540.getClass(), "originalState", null);
        setBooleanField(term89540, term89540.getClass(), "baseUriSetFromDoc", false);
        setField(term89540, term89540.getClass(), "headElement", null);
        setField(term89540, term89540.getClass(), "formElement", null);
        setField(term89540, term89540.getClass(), "contextElement", null);
        setField(term89540, term89540.getClass(), "formattingElements", null);
        setField(term89540, term89540.getClass(), "pendingTableCharacters", null);
        setField(term89540, term89540.getClass(), "emptyEnd", null);
        setBooleanField(term89540, term89540.getClass(), "framesetOk", false);
        setBooleanField(term89540, term89540.getClass(), "fosterInserts", false);
        setBooleanField(term89540, term89540.getClass(), "fragmentParsing", false);
        setField(term89540, term89540.getClass(), "specificScopeTarget", null);
        setField(term89540, term89540.getClass(), "parser", null);
        setField(term89540, term89540.getClass(), "reader", null);
        setField(term89540, term89540.getClass(), "tokeniser", null);
        setField(term89540, term89540.getClass(), "doc", null);
        setField(term89540, term89540.getClass(), "stack", null);
        setField(term89540, term89540.getClass(), "baseUri", null);
        setField(term89540, term89540.getClass(), "currentToken", null);
        setField(term89540, term89540.getClass(), "settings", null);
        setField(term89540, term89540.getClass(), "start", null);
        setField(term89540, term89540.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lastFormattingElement", argTypes, term89540, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


