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

public class Parser_getErrors_122121616819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term672;
     Object term666;

    public Parser_getErrors_122121616819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term79 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term77, term77.getClass(), "treeBuilder", null);
        setIntField(term77, term77.getClass(), "maxErrors", 1134449235);
        setIntField(term79, term79.getClass(), "maxSize", 0);
        setField(term79, term79.getClass(), "elementData", null);
        setIntField(term79, term79.getClass(), "size", 0);
        setIntField(term79, term79.getClass(), "modCount", 0);
        setField(term77, term77.getClass(), "errors", term79);
        term672 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term673 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term672, term672.getClass(), "treeBuilder", null);
        setIntField(term672, term672.getClass(), "maxErrors", 1134449235);
        setIntField(term673, term673.getClass(), "maxSize", 0);
        setField(term673, term673.getClass(), "elementData", null);
        setIntField(term673, term673.getClass(), "size", 0);
        setIntField(term673, term673.getClass(), "modCount", 0);
        setField(term672, term672.getClass(), "errors", term673);
        term666 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setIntField(term666, term666.getClass(), "maxSize", 0);
        setField(term666, term666.getClass(), "elementData", null);
        setIntField(term666, term666.getClass(), "size", 0);
        setIntField(term666, term666.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getErrors", argTypes, term77, args);
        assertTrue(recursiveEquals(term77, term672));
        assertTrue(recursiveEquals(retValue, term666));
    }

};


