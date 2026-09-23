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

public class HtmlTreeBuilder_error_1815929388268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225010;
     Object term225421;

    public HtmlTreeBuilder_error_1815929388268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225010 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term225078 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term225010, term225010.getClass(), "errors", term225078);
        term225421 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term225422 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term225421, term225421.getClass(), "state", null);
        setField(term225421, term225421.getClass(), "originalState", null);
        setBooleanField(term225421, term225421.getClass(), "baseUriSetFromDoc", false);
        setField(term225421, term225421.getClass(), "headElement", null);
        setField(term225421, term225421.getClass(), "formElement", null);
        setField(term225421, term225421.getClass(), "contextElement", null);
        setField(term225421, term225421.getClass(), "formattingElements", null);
        setField(term225421, term225421.getClass(), "pendingTableCharacters", null);
        setField(term225421, term225421.getClass(), "emptyEnd", null);
        setBooleanField(term225421, term225421.getClass(), "framesetOk", false);
        setBooleanField(term225421, term225421.getClass(), "fosterInserts", false);
        setBooleanField(term225421, term225421.getClass(), "fragmentParsing", false);
        setField(term225421, term225421.getClass(), "specificScopeTarget", null);
        setField(term225421, term225421.getClass(), "reader", null);
        setField(term225421, term225421.getClass(), "tokeniser", null);
        setField(term225421, term225421.getClass(), "doc", null);
        setField(term225421, term225421.getClass(), "stack", null);
        setField(term225421, term225421.getClass(), "baseUri", null);
        setField(term225421, term225421.getClass(), "currentToken", null);
        setIntField(term225422, term225422.getClass(), "maxSize", 0);
        setField(term225422, term225422.getClass(), "elementData", null);
        setIntField(term225422, term225422.getClass(), "size", 0);
        setIntField(term225422, term225422.getClass(), "modCount", 0);
        setField(term225421, term225421.getClass(), "errors", term225422);
        setField(term225421, term225421.getClass(), "settings", null);
        setField(term225421, term225421.getClass(), "start", null);
        setField(term225421, term225421.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "error", argTypes, term225010, args);
        assertTrue(recursiveEquals(term225010, term225421));
    }

};


