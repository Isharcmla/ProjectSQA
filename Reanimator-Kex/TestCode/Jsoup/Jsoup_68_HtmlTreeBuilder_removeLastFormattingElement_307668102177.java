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

public class HtmlTreeBuilder_removeLastFormattingElement_307668102177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89390;

    public HtmlTreeBuilder_removeLastFormattingElement_307668102177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89390 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term89390, term89390.getClass(), "state", null);
        setField(term89390, term89390.getClass(), "originalState", null);
        setBooleanField(term89390, term89390.getClass(), "baseUriSetFromDoc", false);
        setField(term89390, term89390.getClass(), "headElement", null);
        setField(term89390, term89390.getClass(), "formElement", null);
        setField(term89390, term89390.getClass(), "contextElement", null);
        setField(term89390, term89390.getClass(), "formattingElements", null);
        setField(term89390, term89390.getClass(), "pendingTableCharacters", null);
        setField(term89390, term89390.getClass(), "emptyEnd", null);
        setBooleanField(term89390, term89390.getClass(), "framesetOk", false);
        setBooleanField(term89390, term89390.getClass(), "fosterInserts", false);
        setBooleanField(term89390, term89390.getClass(), "fragmentParsing", false);
        setField(term89390, term89390.getClass(), "specificScopeTarget", null);
        setField(term89390, term89390.getClass(), "reader", null);
        setField(term89390, term89390.getClass(), "tokeniser", null);
        setField(term89390, term89390.getClass(), "doc", null);
        setField(term89390, term89390.getClass(), "stack", null);
        setField(term89390, term89390.getClass(), "baseUri", null);
        setField(term89390, term89390.getClass(), "currentToken", null);
        setField(term89390, term89390.getClass(), "errors", null);
        setField(term89390, term89390.getClass(), "settings", null);
        setField(term89390, term89390.getClass(), "start", null);
        setField(term89390, term89390.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "removeLastFormattingElement", argTypes, term89390, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


