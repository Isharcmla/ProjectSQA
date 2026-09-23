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

public class Selector_select_917508786423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735583;
     Object term758296;
     Object term758281;

    public Selector_select_917508786423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term735583 = newInstance(Class.forName("java.util.Collections$CopiesList"));
        term758296 = newInstance(Class.forName("java.util.Collections$CopiesList"));
        setIntField(term758296, term758296.getClass(), "n", 0);
        setField(term758296, term758296.getClass(), "element", null);
        setIntField(term758296, term758296.getClass(), "modCount", 0);
        ArrayList term758282 = new ArrayList();
        term758281 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term758281, term758281.getClass(), "contents", term758282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term735583;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term735583, term758296));
        assertTrue(recursiveEquals(retValue, term758281));
    }

};


