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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48234;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48234 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term48234, term48234.getClass(), "state", null);
        setField(term48234, term48234.getClass(), "originalState", null);
        setBooleanField(term48234, term48234.getClass(), "baseUriSetFromDoc", false);
        setField(term48234, term48234.getClass(), "headElement", null);
        setField(term48234, term48234.getClass(), "formElement", null);
        setField(term48234, term48234.getClass(), "contextElement", null);
        setField(term48234, term48234.getClass(), "formattingElements", null);
        setField(term48234, term48234.getClass(), "pendingTableCharacters", null);
        setField(term48234, term48234.getClass(), "emptyEnd", null);
        setBooleanField(term48234, term48234.getClass(), "framesetOk", false);
        setBooleanField(term48234, term48234.getClass(), "fosterInserts", false);
        setBooleanField(term48234, term48234.getClass(), "fragmentParsing", false);
        setField(term48234, term48234.getClass(), "specificScopeTarget", null);
        setField(term48234, term48234.getClass(), "reader", null);
        setField(term48234, term48234.getClass(), "tokeniser", null);
        setField(term48234, term48234.getClass(), "doc", null);
        setField(term48234, term48234.getClass(), "stack", null);
        setField(term48234, term48234.getClass(), "baseUri", null);
        setField(term48234, term48234.getClass(), "currentToken", null);
        setField(term48234, term48234.getClass(), "errors", null);
        setField(term48234, term48234.getClass(), "settings", null);
        setField(term48234, term48234.getClass(), "start", null);
        setField(term48234, term48234.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableRowContext", argTypes, term48234, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


