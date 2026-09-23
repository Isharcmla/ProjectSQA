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
     Object term27405;

    public HtmlTreeBuilder_insert_1660925198124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27405 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term27405, term27405.getClass(), "state", null);
        setField(term27405, term27405.getClass(), "originalState", null);
        setBooleanField(term27405, term27405.getClass(), "baseUriSetFromDoc", false);
        setField(term27405, term27405.getClass(), "headElement", null);
        setField(term27405, term27405.getClass(), "formElement", null);
        setField(term27405, term27405.getClass(), "contextElement", null);
        setField(term27405, term27405.getClass(), "formattingElements", null);
        setField(term27405, term27405.getClass(), "pendingTableCharacters", null);
        setField(term27405, term27405.getClass(), "emptyEnd", null);
        setBooleanField(term27405, term27405.getClass(), "framesetOk", false);
        setBooleanField(term27405, term27405.getClass(), "fosterInserts", false);
        setBooleanField(term27405, term27405.getClass(), "fragmentParsing", false);
        setField(term27405, term27405.getClass(), "specificScopeTarget", null);
        setField(term27405, term27405.getClass(), "parser", null);
        setField(term27405, term27405.getClass(), "reader", null);
        setField(term27405, term27405.getClass(), "tokeniser", null);
        setField(term27405, term27405.getClass(), "doc", null);
        setField(term27405, term27405.getClass(), "stack", null);
        setField(term27405, term27405.getClass(), "baseUri", null);
        setField(term27405, term27405.getClass(), "currentToken", null);
        setField(term27405, term27405.getClass(), "settings", null);
        setField(term27405, term27405.getClass(), "start", null);
        setField(term27405, term27405.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insert", argTypes, term27405, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


