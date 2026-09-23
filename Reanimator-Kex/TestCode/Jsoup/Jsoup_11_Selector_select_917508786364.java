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

public class Selector_select_917508786364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698057;
     Object term699060;
     Object term699045;

    public Selector_select_917508786364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term698057 = newInstance(Class.forName("java.util.Collections$CopiesList"));
        term699060 = newInstance(Class.forName("java.util.Collections$CopiesList"));
        setIntField(term699060, term699060.getClass(), "n", 0);
        setField(term699060, term699060.getClass(), "element", null);
        setIntField(term699060, term699060.getClass(), "modCount", 0);
        ArrayList term699046 = new ArrayList();
        term699045 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term699045, term699045.getClass(), "contents", term699046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term698057;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term698057, term699060));
        assertTrue(recursiveEquals(retValue, term699045));
    }

};


