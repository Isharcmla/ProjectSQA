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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.ArrayList;

public class HtmlTreeBuilder_clearStackToContext_518032978217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311692;
     Object term311755;

    public HtmlTreeBuilder_clearStackToContext_518032978217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term311744 = new ArrayList();
        term311692 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term311692, term311692.getClass(), "stack", term311744);
        ArrayList term311756 = new ArrayList();
        term311755 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term311755, term311755.getClass(), "state", null);
        setField(term311755, term311755.getClass(), "originalState", null);
        setBooleanField(term311755, term311755.getClass(), "baseUriSetFromDoc", false);
        setField(term311755, term311755.getClass(), "headElement", null);
        setField(term311755, term311755.getClass(), "formElement", null);
        setField(term311755, term311755.getClass(), "contextElement", null);
        setField(term311755, term311755.getClass(), "formattingElements", null);
        setField(term311755, term311755.getClass(), "pendingTableCharacters", null);
        setField(term311755, term311755.getClass(), "emptyEnd", null);
        setBooleanField(term311755, term311755.getClass(), "framesetOk", false);
        setBooleanField(term311755, term311755.getClass(), "fosterInserts", false);
        setBooleanField(term311755, term311755.getClass(), "fragmentParsing", false);
        setField(term311755, term311755.getClass(), "specificScopeTarget", null);
        setField(term311755, term311755.getClass(), "parser", null);
        setField(term311755, term311755.getClass(), "reader", null);
        setField(term311755, term311755.getClass(), "tokeniser", null);
        setField(term311755, term311755.getClass(), "doc", null);
        setField(term311755, term311755.getClass(), "stack", term311756);
        setField(term311755, term311755.getClass(), "baseUri", null);
        setField(term311755, term311755.getClass(), "currentToken", null);
        setField(term311755, term311755.getClass(), "settings", null);
        setField(term311755, term311755.getClass(), "start", null);
        setField(term311755, term311755.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "clearStackToContext", argTypes, term311692, args);
        assertTrue(recursiveEquals(term311692, term311755));
    }

};


