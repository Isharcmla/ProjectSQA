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

public class HtmlTreeBuilder_lastFormattingElement_1625168298176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88098;

    public HtmlTreeBuilder_lastFormattingElement_1625168298176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88098 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term88098, term88098.getClass(), "state", null);
        setField(term88098, term88098.getClass(), "originalState", null);
        setBooleanField(term88098, term88098.getClass(), "baseUriSetFromDoc", false);
        setField(term88098, term88098.getClass(), "headElement", null);
        setField(term88098, term88098.getClass(), "formElement", null);
        setField(term88098, term88098.getClass(), "contextElement", null);
        setField(term88098, term88098.getClass(), "formattingElements", null);
        setField(term88098, term88098.getClass(), "pendingTableCharacters", null);
        setField(term88098, term88098.getClass(), "emptyEnd", null);
        setBooleanField(term88098, term88098.getClass(), "framesetOk", false);
        setBooleanField(term88098, term88098.getClass(), "fosterInserts", false);
        setBooleanField(term88098, term88098.getClass(), "fragmentParsing", false);
        setField(term88098, term88098.getClass(), "specificScopeTarget", null);
        setField(term88098, term88098.getClass(), "reader", null);
        setField(term88098, term88098.getClass(), "tokeniser", null);
        setField(term88098, term88098.getClass(), "doc", null);
        setField(term88098, term88098.getClass(), "stack", null);
        setField(term88098, term88098.getClass(), "baseUri", null);
        setField(term88098, term88098.getClass(), "currentToken", null);
        setField(term88098, term88098.getClass(), "errors", null);
        setField(term88098, term88098.getClass(), "settings", null);
        setField(term88098, term88098.getClass(), "start", null);
        setField(term88098, term88098.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lastFormattingElement", argTypes, term88098, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


