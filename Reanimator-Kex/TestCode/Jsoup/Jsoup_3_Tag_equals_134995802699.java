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

public class Tag_equals_134995802699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21218;
     Object term21308;
     Object term21321;
     Object term21322;

    public Tag_equals_134995802699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21218 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        term21308 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJLong"));
        term21321 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21321, term21321.getClass(), "tagName", null);
        setBooleanField(term21321, term21321.getClass(), "isBlock", false);
        setBooleanField(term21321, term21321.getClass(), "canContainBlock", false);
        setBooleanField(term21321, term21321.getClass(), "canContainInline", false);
        setBooleanField(term21321, term21321.getClass(), "optionalClosing", false);
        setBooleanField(term21321, term21321.getClass(), "empty", false);
        setBooleanField(term21321, term21321.getClass(), "preserveWhitespace", false);
        setField(term21321, term21321.getClass(), "ancestors", null);
        term21322 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJLong"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21308;
        Object retValue = callMethod(klass, "equals", argTypes, term21218, args);
        assertTrue(recursiveEquals(term21218, term21321));
        assertTrue(recursiveEquals(term21308, term21322));
        assertTrue(recursiveEquals(retValue, false));
    }

};


