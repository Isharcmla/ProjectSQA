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

public class Tag_equals_134995802653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7359;
     Object term7382;
     Object term7408;
     Object term7409;

    public Tag_equals_134995802653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7359 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        term7382 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        term7408 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7408, term7408.getClass(), "tagName", null);
        setBooleanField(term7408, term7408.getClass(), "isBlock", false);
        setBooleanField(term7408, term7408.getClass(), "canContainBlock", false);
        setBooleanField(term7408, term7408.getClass(), "canContainInline", false);
        setBooleanField(term7408, term7408.getClass(), "optionalClosing", false);
        setBooleanField(term7408, term7408.getClass(), "empty", false);
        setBooleanField(term7408, term7408.getClass(), "preserveWhitespace", false);
        setField(term7408, term7408.getClass(), "ancestors", null);
        term7409 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7409, term7409.getClass(), "tagName", null);
        setBooleanField(term7409, term7409.getClass(), "isBlock", false);
        setBooleanField(term7409, term7409.getClass(), "canContainBlock", false);
        setBooleanField(term7409, term7409.getClass(), "canContainInline", false);
        setBooleanField(term7409, term7409.getClass(), "optionalClosing", false);
        setBooleanField(term7409, term7409.getClass(), "empty", false);
        setBooleanField(term7409, term7409.getClass(), "preserveWhitespace", false);
        setField(term7409, term7409.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7382;
        Object retValue = callMethod(klass, "equals", argTypes, term7359, args);
        assertTrue(recursiveEquals(term7359, term7408));
        assertTrue(recursiveEquals(term7382, term7409));
        assertTrue(recursiveEquals(retValue, true));
    }

};


