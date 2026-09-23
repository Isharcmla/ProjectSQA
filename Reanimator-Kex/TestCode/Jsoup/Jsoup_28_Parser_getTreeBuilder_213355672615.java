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

public class Parser_getTreeBuilder_213355672615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term636;

    public Parser_getTreeBuilder_213355672615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term53 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term51, term51.getClass(), "treeBuilder", null);
        setIntField(term51, term51.getClass(), "maxErrors", 391863371);
        setIntField(term53, term53.getClass(), "maxSize", 0);
        setField(term53, term53.getClass(), "elementData", null);
        setIntField(term53, term53.getClass(), "size", 0);
        setIntField(term53, term53.getClass(), "modCount", 0);
        setField(term51, term51.getClass(), "errors", term53);
        term636 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term637 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term636, term636.getClass(), "treeBuilder", null);
        setIntField(term636, term636.getClass(), "maxErrors", 391863371);
        setIntField(term637, term637.getClass(), "maxSize", 0);
        setField(term637, term637.getClass(), "elementData", null);
        setIntField(term637, term637.getClass(), "size", 0);
        setIntField(term637, term637.getClass(), "modCount", 0);
        setField(term636, term636.getClass(), "errors", term637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTreeBuilder", argTypes, term51, args);
        assertTrue(recursiveEquals(term51, term636));
        assertTrue(recursiveEquals(retValue, null));
    }

};


