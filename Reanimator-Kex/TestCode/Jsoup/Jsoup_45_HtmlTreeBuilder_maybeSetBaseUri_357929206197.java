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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602548;
     Object term602856;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term602548 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term602548, term602548.getClass(), "baseUriSetFromDoc", true);
        term602856 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term602856, term602856.getClass(), "state", null);
        setField(term602856, term602856.getClass(), "originalState", null);
        setBooleanField(term602856, term602856.getClass(), "baseUriSetFromDoc", true);
        setField(term602856, term602856.getClass(), "headElement", null);
        setField(term602856, term602856.getClass(), "formElement", null);
        setField(term602856, term602856.getClass(), "contextElement", null);
        setField(term602856, term602856.getClass(), "formattingElements", null);
        setField(term602856, term602856.getClass(), "pendingTableCharacters", null);
        setField(term602856, term602856.getClass(), "emptyEnd", null);
        setBooleanField(term602856, term602856.getClass(), "framesetOk", false);
        setBooleanField(term602856, term602856.getClass(), "fosterInserts", false);
        setBooleanField(term602856, term602856.getClass(), "fragmentParsing", false);
        setField(term602856, term602856.getClass(), "specificScopeTarget", null);
        setField(term602856, term602856.getClass(), "reader", null);
        setField(term602856, term602856.getClass(), "tokeniser", null);
        setField(term602856, term602856.getClass(), "doc", null);
        setField(term602856, term602856.getClass(), "stack", null);
        setField(term602856, term602856.getClass(), "baseUri", null);
        setField(term602856, term602856.getClass(), "currentToken", null);
        setField(term602856, term602856.getClass(), "errors", null);
        setField(term602856, term602856.getClass(), "start", null);
        setField(term602856, term602856.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maybeSetBaseUri", argTypes, term602548, args);
        assertTrue(recursiveEquals(term602548, term602856));
    }

};


