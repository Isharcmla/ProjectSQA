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

public class HtmlTreeBuilder_inSpecificScope_852106786152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59445;

    public HtmlTreeBuilder_inSpecificScope_852106786152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59445 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term59445, term59445.getClass(), "state", null);
        setField(term59445, term59445.getClass(), "originalState", null);
        setBooleanField(term59445, term59445.getClass(), "baseUriSetFromDoc", false);
        setField(term59445, term59445.getClass(), "headElement", null);
        setField(term59445, term59445.getClass(), "formElement", null);
        setField(term59445, term59445.getClass(), "contextElement", null);
        setField(term59445, term59445.getClass(), "formattingElements", null);
        setField(term59445, term59445.getClass(), "pendingTableCharacters", null);
        setField(term59445, term59445.getClass(), "emptyEnd", null);
        setBooleanField(term59445, term59445.getClass(), "framesetOk", false);
        setBooleanField(term59445, term59445.getClass(), "fosterInserts", false);
        setBooleanField(term59445, term59445.getClass(), "fragmentParsing", false);
        setField(term59445, term59445.getClass(), "specificScopeTarget", null);
        setField(term59445, term59445.getClass(), "reader", null);
        setField(term59445, term59445.getClass(), "tokeniser", null);
        setField(term59445, term59445.getClass(), "doc", null);
        setField(term59445, term59445.getClass(), "stack", null);
        setField(term59445, term59445.getClass(), "baseUri", null);
        setField(term59445, term59445.getClass(), "currentToken", null);
        setField(term59445, term59445.getClass(), "errors", null);
        setField(term59445, term59445.getClass(), "settings", null);
        setField(term59445, term59445.getClass(), "start", null);
        setField(term59445, term59445.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "inSpecificScope", argTypes, term59445, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


