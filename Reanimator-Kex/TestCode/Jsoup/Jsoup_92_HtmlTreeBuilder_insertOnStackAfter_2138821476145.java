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
     Object term58127;

    public HtmlTreeBuilder_insertOnStackAfter_2138821476145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58127 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term58127, term58127.getClass(), "state", null);
        setField(term58127, term58127.getClass(), "originalState", null);
        setBooleanField(term58127, term58127.getClass(), "baseUriSetFromDoc", false);
        setField(term58127, term58127.getClass(), "headElement", null);
        setField(term58127, term58127.getClass(), "formElement", null);
        setField(term58127, term58127.getClass(), "contextElement", null);
        setField(term58127, term58127.getClass(), "formattingElements", null);
        setField(term58127, term58127.getClass(), "pendingTableCharacters", null);
        setField(term58127, term58127.getClass(), "emptyEnd", null);
        setBooleanField(term58127, term58127.getClass(), "framesetOk", false);
        setBooleanField(term58127, term58127.getClass(), "fosterInserts", false);
        setBooleanField(term58127, term58127.getClass(), "fragmentParsing", false);
        setField(term58127, term58127.getClass(), "specificScopeTarget", null);
        setField(term58127, term58127.getClass(), "parser", null);
        setField(term58127, term58127.getClass(), "reader", null);
        setField(term58127, term58127.getClass(), "tokeniser", null);
        setField(term58127, term58127.getClass(), "doc", null);
        setField(term58127, term58127.getClass(), "stack", null);
        setField(term58127, term58127.getClass(), "baseUri", null);
        setField(term58127, term58127.getClass(), "currentToken", null);
        setField(term58127, term58127.getClass(), "settings", null);
        setField(term58127, term58127.getClass(), "start", null);
        setField(term58127, term58127.getClass(), "end", null);
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
            callMethod(klass, "insertOnStackAfter", argTypes, term58127, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


