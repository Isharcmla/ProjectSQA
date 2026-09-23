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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilder_initialiseParse_1909525337109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1600;

    public HtmlTreeBuilder_initialiseParse_1909525337109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1600 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term1600, term1600.getClass(), "state", null);
        setField(term1600, term1600.getClass(), "originalState", null);
        setBooleanField(term1600, term1600.getClass(), "baseUriSetFromDoc", false);
        setField(term1600, term1600.getClass(), "headElement", null);
        setField(term1600, term1600.getClass(), "formElement", null);
        setField(term1600, term1600.getClass(), "contextElement", null);
        setField(term1600, term1600.getClass(), "formattingElements", null);
        setField(term1600, term1600.getClass(), "pendingTableCharacters", null);
        setField(term1600, term1600.getClass(), "emptyEnd", null);
        setBooleanField(term1600, term1600.getClass(), "framesetOk", false);
        setBooleanField(term1600, term1600.getClass(), "fosterInserts", false);
        setBooleanField(term1600, term1600.getClass(), "fragmentParsing", false);
        setField(term1600, term1600.getClass(), "specificScopeTarget", null);
        setField(term1600, term1600.getClass(), "reader", null);
        setField(term1600, term1600.getClass(), "tokeniser", null);
        setField(term1600, term1600.getClass(), "doc", null);
        setField(term1600, term1600.getClass(), "stack", null);
        setField(term1600, term1600.getClass(), "baseUri", null);
        setField(term1600, term1600.getClass(), "currentToken", null);
        setField(term1600, term1600.getClass(), "errors", null);
        setField(term1600, term1600.getClass(), "settings", null);
        setField(term1600, term1600.getClass(), "start", null);
        setField(term1600, term1600.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.parser.ParseErrorList");
        argTypes[3] = Class.forName("org.jsoup.parser.ParseSettings");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "initialiseParse", argTypes, term1600, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


