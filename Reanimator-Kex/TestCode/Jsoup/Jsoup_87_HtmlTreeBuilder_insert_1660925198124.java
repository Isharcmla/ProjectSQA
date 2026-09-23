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

public class HtmlTreeBuilder_insert_1660925198124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26503;

    public HtmlTreeBuilder_insert_1660925198124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26503 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term26503, term26503.getClass(), "state", null);
        setField(term26503, term26503.getClass(), "originalState", null);
        setBooleanField(term26503, term26503.getClass(), "baseUriSetFromDoc", false);
        setField(term26503, term26503.getClass(), "headElement", null);
        setField(term26503, term26503.getClass(), "formElement", null);
        setField(term26503, term26503.getClass(), "contextElement", null);
        setField(term26503, term26503.getClass(), "formattingElements", null);
        setField(term26503, term26503.getClass(), "pendingTableCharacters", null);
        setField(term26503, term26503.getClass(), "emptyEnd", null);
        setBooleanField(term26503, term26503.getClass(), "framesetOk", false);
        setBooleanField(term26503, term26503.getClass(), "fosterInserts", false);
        setBooleanField(term26503, term26503.getClass(), "fragmentParsing", false);
        setField(term26503, term26503.getClass(), "specificScopeTarget", null);
        setField(term26503, term26503.getClass(), "parser", null);
        setField(term26503, term26503.getClass(), "reader", null);
        setField(term26503, term26503.getClass(), "tokeniser", null);
        setField(term26503, term26503.getClass(), "doc", null);
        setField(term26503, term26503.getClass(), "stack", null);
        setField(term26503, term26503.getClass(), "baseUri", null);
        setField(term26503, term26503.getClass(), "currentToken", null);
        setField(term26503, term26503.getClass(), "settings", null);
        setField(term26503, term26503.getClass(), "start", null);
        setField(term26503, term26503.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insert", argTypes, term26503, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


