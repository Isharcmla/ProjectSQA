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

public class Parser_xmlParser_197888626125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2909;

    public Parser_xmlParser_197888626125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2909 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term2910 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term2910, term2910.getClass(), "reader", null);
        setField(term2910, term2910.getClass(), "tokeniser", null);
        setField(term2910, term2910.getClass(), "doc", null);
        setField(term2910, term2910.getClass(), "stack", null);
        setField(term2910, term2910.getClass(), "baseUri", null);
        setField(term2910, term2910.getClass(), "currentToken", null);
        setField(term2910, term2910.getClass(), "errors", null);
        setField(term2909, term2909.getClass(), "treeBuilder", term2910);
        setIntField(term2909, term2909.getClass(), "maxErrors", 0);
        setField(term2909, term2909.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "xmlParser", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term2909));
    }

};


