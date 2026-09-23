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

public class HtmlTreeBuilder_error_1815929388121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22383;

    public HtmlTreeBuilder_error_1815929388121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22383 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term22383, term22383.getClass(), "state", null);
        setField(term22383, term22383.getClass(), "originalState", null);
        setBooleanField(term22383, term22383.getClass(), "baseUriSetFromDoc", false);
        setField(term22383, term22383.getClass(), "headElement", null);
        setField(term22383, term22383.getClass(), "formElement", null);
        setField(term22383, term22383.getClass(), "contextElement", null);
        setField(term22383, term22383.getClass(), "formattingElements", null);
        setField(term22383, term22383.getClass(), "pendingTableCharacters", null);
        setField(term22383, term22383.getClass(), "emptyEnd", null);
        setBooleanField(term22383, term22383.getClass(), "framesetOk", false);
        setBooleanField(term22383, term22383.getClass(), "fosterInserts", false);
        setBooleanField(term22383, term22383.getClass(), "fragmentParsing", false);
        setField(term22383, term22383.getClass(), "specificScopeTarget", null);
        setField(term22383, term22383.getClass(), "parser", null);
        setField(term22383, term22383.getClass(), "reader", null);
        setField(term22383, term22383.getClass(), "tokeniser", null);
        setField(term22383, term22383.getClass(), "doc", null);
        setField(term22383, term22383.getClass(), "stack", null);
        setField(term22383, term22383.getClass(), "baseUri", null);
        setField(term22383, term22383.getClass(), "currentToken", null);
        setField(term22383, term22383.getClass(), "settings", null);
        setField(term22383, term22383.getClass(), "start", null);
        setField(term22383, term22383.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term22383, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


