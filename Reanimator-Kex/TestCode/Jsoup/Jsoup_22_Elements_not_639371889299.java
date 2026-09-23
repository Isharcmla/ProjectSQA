package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.select.EqualityUtils.*;
import java.util.ArrayList;

public class Elements_not_639371889299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53089;
     Object term54214;
     Object term54209;

    public Elements_not_639371889299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term53141 = new ArrayList();
        term53089 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term53089, term53089.getClass(), "contents", term53141);
        ArrayList term54215 = new ArrayList();
        term54214 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term54214, term54214.getClass(), "contents", term54215);
        ArrayList term54210 = new ArrayList();
        term54209 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term54209, term54209.getClass(), "contents", term54210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        Object retValue = callMethod(klass, "not", argTypes, term53089, args);
        assertTrue(recursiveEquals(term53089, term54214));
        assertTrue(recursiveEquals(retValue, term54209));
    }

};


