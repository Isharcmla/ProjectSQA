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
import java.lang.Boolean;

public class HtmlTreeBuilder_insertForm_605839044126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29378;
     Object term29383;

    public HtmlTreeBuilder_insertForm_605839044126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29378 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term29378, term29378.getClass(), "state", null);
        setField(term29378, term29378.getClass(), "originalState", null);
        setBooleanField(term29378, term29378.getClass(), "baseUriSetFromDoc", false);
        setField(term29378, term29378.getClass(), "headElement", null);
        setField(term29378, term29378.getClass(), "formElement", null);
        setField(term29378, term29378.getClass(), "contextElement", null);
        setField(term29378, term29378.getClass(), "formattingElements", null);
        setField(term29378, term29378.getClass(), "pendingTableCharacters", null);
        setField(term29378, term29378.getClass(), "emptyEnd", null);
        setBooleanField(term29378, term29378.getClass(), "framesetOk", false);
        setBooleanField(term29378, term29378.getClass(), "fosterInserts", false);
        setBooleanField(term29378, term29378.getClass(), "fragmentParsing", false);
        setField(term29378, term29378.getClass(), "specificScopeTarget", null);
        setField(term29378, term29378.getClass(), "parser", null);
        setField(term29378, term29378.getClass(), "reader", null);
        setField(term29378, term29378.getClass(), "tokeniser", null);
        setField(term29378, term29378.getClass(), "doc", null);
        setField(term29378, term29378.getClass(), "stack", null);
        setField(term29378, term29378.getClass(), "baseUri", null);
        setField(term29378, term29378.getClass(), "currentToken", null);
        setField(term29378, term29378.getClass(), "settings", null);
        setField(term29378, term29378.getClass(), "start", null);
        setField(term29378, term29378.getClass(), "end", null);
        term29383 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29383;
        try {
            callMethod(klass, "insertForm", argTypes, term29378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


