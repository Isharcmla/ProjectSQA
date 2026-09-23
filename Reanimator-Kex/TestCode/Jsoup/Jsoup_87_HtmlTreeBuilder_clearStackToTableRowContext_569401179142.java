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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52015;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52015 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term52015, term52015.getClass(), "state", null);
        setField(term52015, term52015.getClass(), "originalState", null);
        setBooleanField(term52015, term52015.getClass(), "baseUriSetFromDoc", false);
        setField(term52015, term52015.getClass(), "headElement", null);
        setField(term52015, term52015.getClass(), "formElement", null);
        setField(term52015, term52015.getClass(), "contextElement", null);
        setField(term52015, term52015.getClass(), "formattingElements", null);
        setField(term52015, term52015.getClass(), "pendingTableCharacters", null);
        setField(term52015, term52015.getClass(), "emptyEnd", null);
        setBooleanField(term52015, term52015.getClass(), "framesetOk", false);
        setBooleanField(term52015, term52015.getClass(), "fosterInserts", false);
        setBooleanField(term52015, term52015.getClass(), "fragmentParsing", false);
        setField(term52015, term52015.getClass(), "specificScopeTarget", null);
        setField(term52015, term52015.getClass(), "parser", null);
        setField(term52015, term52015.getClass(), "reader", null);
        setField(term52015, term52015.getClass(), "tokeniser", null);
        setField(term52015, term52015.getClass(), "doc", null);
        setField(term52015, term52015.getClass(), "stack", null);
        setField(term52015, term52015.getClass(), "baseUri", null);
        setField(term52015, term52015.getClass(), "currentToken", null);
        setField(term52015, term52015.getClass(), "settings", null);
        setField(term52015, term52015.getClass(), "start", null);
        setField(term52015, term52015.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableRowContext", argTypes, term52015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


