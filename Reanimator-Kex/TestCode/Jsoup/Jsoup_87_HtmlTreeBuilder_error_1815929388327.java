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
import java.lang.Object;

public class HtmlTreeBuilder_error_1815929388327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499359;
     Object term499502;

    public HtmlTreeBuilder_error_1815929388327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term499359 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term499411 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term499479 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term499411, term499411.getClass(), "errors", term499479);
        setField(term499359, term499359.getClass(), "parser", term499411);
        term499502 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term499503 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term499504 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term499502, term499502.getClass(), "state", null);
        setField(term499502, term499502.getClass(), "originalState", null);
        setBooleanField(term499502, term499502.getClass(), "baseUriSetFromDoc", false);
        setField(term499502, term499502.getClass(), "headElement", null);
        setField(term499502, term499502.getClass(), "formElement", null);
        setField(term499502, term499502.getClass(), "contextElement", null);
        setField(term499502, term499502.getClass(), "formattingElements", null);
        setField(term499502, term499502.getClass(), "pendingTableCharacters", null);
        setField(term499502, term499502.getClass(), "emptyEnd", null);
        setBooleanField(term499502, term499502.getClass(), "framesetOk", false);
        setBooleanField(term499502, term499502.getClass(), "fosterInserts", false);
        setBooleanField(term499502, term499502.getClass(), "fragmentParsing", false);
        setField(term499502, term499502.getClass(), "specificScopeTarget", null);
        setField(term499503, term499503.getClass(), "treeBuilder", null);
        setIntField(term499504, term499504.getClass(), "maxSize", 0);
        setField(term499504, term499504.getClass(), "elementData", null);
        setIntField(term499504, term499504.getClass(), "size", 0);
        setIntField(term499504, term499504.getClass(), "modCount", 0);
        setField(term499503, term499503.getClass(), "errors", term499504);
        setField(term499503, term499503.getClass(), "settings", null);
        setField(term499502, term499502.getClass(), "parser", term499503);
        setField(term499502, term499502.getClass(), "reader", null);
        setField(term499502, term499502.getClass(), "tokeniser", null);
        setField(term499502, term499502.getClass(), "doc", null);
        setField(term499502, term499502.getClass(), "stack", null);
        setField(term499502, term499502.getClass(), "baseUri", null);
        setField(term499502, term499502.getClass(), "currentToken", null);
        setField(term499502, term499502.getClass(), "settings", null);
        setField(term499502, term499502.getClass(), "start", null);
        setField(term499502, term499502.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "error", argTypes, term499359, args);
        assertTrue(recursiveEquals(term499359, term499502));
    }

};


