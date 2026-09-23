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
import java.lang.Integer;

public class Parser_setTrackErrors_74869549918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term75;
     Object term664;
     Object term657;

    public Parser_setTrackErrors_74869549918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term71 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term69, term69.getClass(), "treeBuilder", null);
        setIntField(term69, term69.getClass(), "maxErrors", -1339778481);
        setIntField(term71, term71.getClass(), "maxSize", 0);
        setField(term71, term71.getClass(), "elementData", null);
        setIntField(term71, term71.getClass(), "size", 0);
        setIntField(term71, term71.getClass(), "modCount", 0);
        setField(term69, term69.getClass(), "errors", term71);
        term75 = new Integer(1725571209);
        term664 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term665 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term664, term664.getClass(), "treeBuilder", null);
        setIntField(term664, term664.getClass(), "maxErrors", 1725571209);
        setIntField(term665, term665.getClass(), "maxSize", 0);
        setField(term665, term665.getClass(), "elementData", null);
        setIntField(term665, term665.getClass(), "size", 0);
        setIntField(term665, term665.getClass(), "modCount", 0);
        setField(term664, term664.getClass(), "errors", term665);
        term657 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term659 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term657, term657.getClass(), "treeBuilder", null);
        setIntField(term657, term657.getClass(), "maxErrors", 1725571209);
        setIntField(term659, term659.getClass(), "maxSize", 0);
        setField(term659, term659.getClass(), "elementData", null);
        setIntField(term659, term659.getClass(), "size", 0);
        setIntField(term659, term659.getClass(), "modCount", 0);
        setField(term657, term657.getClass(), "errors", term659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75;
        Object retValue = callMethod(klass, "setTrackErrors", argTypes, term69, args);
        assertTrue(recursiveEquals(term69, term664));
        assertTrue(recursiveEquals(term75, 1725571209));
        assertTrue(recursiveEquals(retValue, term657));
    }

};


