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

public class HtmlTreeBuilder_insertOnStackAfter_2138821476145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56138;

    public HtmlTreeBuilder_insertOnStackAfter_2138821476145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56138 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term56138, term56138.getClass(), "state", null);
        setField(term56138, term56138.getClass(), "originalState", null);
        setBooleanField(term56138, term56138.getClass(), "baseUriSetFromDoc", false);
        setField(term56138, term56138.getClass(), "headElement", null);
        setField(term56138, term56138.getClass(), "formElement", null);
        setField(term56138, term56138.getClass(), "contextElement", null);
        setField(term56138, term56138.getClass(), "formattingElements", null);
        setField(term56138, term56138.getClass(), "pendingTableCharacters", null);
        setField(term56138, term56138.getClass(), "emptyEnd", null);
        setBooleanField(term56138, term56138.getClass(), "framesetOk", false);
        setBooleanField(term56138, term56138.getClass(), "fosterInserts", false);
        setBooleanField(term56138, term56138.getClass(), "fragmentParsing", false);
        setField(term56138, term56138.getClass(), "specificScopeTarget", null);
        setField(term56138, term56138.getClass(), "parser", null);
        setField(term56138, term56138.getClass(), "reader", null);
        setField(term56138, term56138.getClass(), "tokeniser", null);
        setField(term56138, term56138.getClass(), "doc", null);
        setField(term56138, term56138.getClass(), "stack", null);
        setField(term56138, term56138.getClass(), "baseUri", null);
        setField(term56138, term56138.getClass(), "currentToken", null);
        setField(term56138, term56138.getClass(), "settings", null);
        setField(term56138, term56138.getClass(), "start", null);
        setField(term56138, term56138.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "insertOnStackAfter", argTypes, term56138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


