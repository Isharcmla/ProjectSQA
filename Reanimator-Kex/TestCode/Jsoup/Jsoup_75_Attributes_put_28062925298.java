package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_put_28062925298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1840488;
     Object term2320131;
     Object term2298761;

    public Attributes_put_28062925298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1840488 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1839785 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term1840488, term1840488.getClass(), "size", 11);
        setField(term1840488, term1840488.getClass(), "keys", term1839785);
        term2320131 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2320132 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term2320131, term2320131.getClass(), "size", 11);
        setField(term2320131, term2320131.getClass(), "keys", term2320132);
        setField(term2320131, term2320131.getClass(), "vals", null);
        term2298761 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2298831 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term2298761, term2298761.getClass(), "size", 11);
        setField(term2298761, term2298761.getClass(), "keys", term2298831);
        setField(term2298761, term2298761.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term1840488, args);
        assertTrue(recursiveEquals(term1840488, term2320131));
        assertTrue(recursiveEquals(retValue, term2298761));
    }

};


