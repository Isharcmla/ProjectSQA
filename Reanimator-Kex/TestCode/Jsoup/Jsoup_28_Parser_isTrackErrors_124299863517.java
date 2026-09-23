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

public class Parser_isTrackErrors_124299863517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term654;

    public Parser_isTrackErrors_124299863517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term65 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term63, term63.getClass(), "treeBuilder", null);
        setIntField(term63, term63.getClass(), "maxErrors", -2038273078);
        setIntField(term65, term65.getClass(), "maxSize", 0);
        setField(term65, term65.getClass(), "elementData", null);
        setIntField(term65, term65.getClass(), "size", 0);
        setIntField(term65, term65.getClass(), "modCount", 0);
        setField(term63, term63.getClass(), "errors", term65);
        term654 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term655 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term654, term654.getClass(), "treeBuilder", null);
        setIntField(term654, term654.getClass(), "maxErrors", -2038273078);
        setIntField(term655, term655.getClass(), "maxSize", 0);
        setField(term655, term655.getClass(), "elementData", null);
        setIntField(term655, term655.getClass(), "size", 0);
        setIntField(term655, term655.getClass(), "modCount", 0);
        setField(term654, term654.getClass(), "errors", term655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isTrackErrors", argTypes, term63, args);
        assertTrue(recursiveEquals(term63, term654));
        assertTrue(recursiveEquals(retValue, false));
    }

};


