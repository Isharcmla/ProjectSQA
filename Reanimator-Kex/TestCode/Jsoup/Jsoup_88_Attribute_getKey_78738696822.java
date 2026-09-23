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

public class Attribute_getKey_78738696822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term53424;

    public Attribute_getKey_78738696822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term118 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term120 = (Object[]) newArray("java.lang.String", 0);
        Object[] term121 = (Object[]) newArray("java.lang.String", 0);
        setField(term93, term93.getClass(), "key", "jJCZpVmanW");
        setField(term93, term93.getClass(), "val", "EGtDIRbSSb");
        setIntField(term118, term118.getClass(), "size", 1162663216);
        setField(term118, term118.getClass(), "keys", term120);
        setField(term118, term118.getClass(), "vals", term121);
        setField(term93, term93.getClass(), "parent", term118);
        term53424 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term53429 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term53430 = (Object[]) newArray("java.lang.String", 0);
        Object[] term53431 = (Object[]) newArray("java.lang.String", 0);
        setField(term53424, term53424.getClass(), "key", "jJCZpVmanW");
        setField(term53424, term53424.getClass(), "val", "EGtDIRbSSb");
        setIntField(term53429, term53429.getClass(), "size", 1162663216);
        setField(term53429, term53429.getClass(), "keys", term53430);
        setField(term53429, term53429.getClass(), "vals", term53431);
        setField(term53424, term53424.getClass(), "parent", term53429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKey", argTypes, term93, args);
        assertTrue(recursiveEquals(term93, term53424));
        assertTrue(recursiveEquals(retValue, "jJCZpVmanW"));
    }

};


