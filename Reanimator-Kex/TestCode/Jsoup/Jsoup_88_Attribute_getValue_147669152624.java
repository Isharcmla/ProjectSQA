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

public class Attribute_getValue_147669152624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term53893;

    public Attribute_getValue_147669152624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term238 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term240 = (Object[]) newArray("java.lang.String", 0);
        Object[] term241 = (Object[]) newArray("java.lang.String", 0);
        setField(term213, term213.getClass(), "key", "RMFIsYGgne");
        setField(term213, term213.getClass(), "val", "NRdvgJlhkX");
        setIntField(term238, term238.getClass(), "size", 391863371);
        setField(term238, term238.getClass(), "keys", term240);
        setField(term238, term238.getClass(), "vals", term241);
        setField(term213, term213.getClass(), "parent", term238);
        term53893 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term53898 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term53899 = (Object[]) newArray("java.lang.String", 0);
        Object[] term53900 = (Object[]) newArray("java.lang.String", 0);
        setField(term53893, term53893.getClass(), "key", "RMFIsYGgne");
        setField(term53893, term53893.getClass(), "val", "NRdvgJlhkX");
        setIntField(term53898, term53898.getClass(), "size", 391863371);
        setField(term53898, term53898.getClass(), "keys", term53899);
        setField(term53898, term53898.getClass(), "vals", term53900);
        setField(term53893, term53893.getClass(), "parent", term53898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term213, args);
        assertTrue(recursiveEquals(term213, term53893));
        assertTrue(recursiveEquals(retValue, "NRdvgJlhkX"));
    }

};


