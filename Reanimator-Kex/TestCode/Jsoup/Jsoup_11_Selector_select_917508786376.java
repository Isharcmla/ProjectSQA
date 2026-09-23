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

public class Selector_select_917508786376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708700;
     Object term709703;
     Object term709688;

    public Selector_select_917508786376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term708700 = newInstance(Class.forName("java.util.Collections$CopiesList"));
        term709703 = newInstance(Class.forName("java.util.Collections$CopiesList"));
        setIntField(term709703, term709703.getClass(), "n", 0);
        setField(term709703, term709703.getClass(), "element", null);
        setIntField(term709703, term709703.getClass(), "modCount", 0);
        ArrayList term709689 = new ArrayList();
        term709688 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term709688, term709688.getClass(), "contents", term709689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term708700;
        Object retValue = callMethod(klass, "select", argTypes, null, args);
        assertTrue(recursiveEquals(term708700, term709703));
        assertTrue(recursiveEquals(retValue, term709688));
    }

};


