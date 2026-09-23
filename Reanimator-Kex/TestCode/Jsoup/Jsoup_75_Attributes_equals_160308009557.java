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

public class Attributes_equals_160308009557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45557;
     Object term45561;
     Object term58782;
     Object term58785;

    public Attributes_equals_160308009557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45557 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term45559 = (Object[]) newArray("java.lang.String", 0);
        Object[] term45560 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term45557, term45557.getClass(), "size", -1275173084);
        setField(term45557, term45557.getClass(), "keys", term45559);
        setField(term45557, term45557.getClass(), "vals", term45560);
        term45561 = newInstance(Class.forName("java.lang.Object"));
        term58782 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term58783 = (Object[]) newArray("java.lang.String", 0);
        Object[] term58784 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term58782, term58782.getClass(), "size", -1275173084);
        setField(term58782, term58782.getClass(), "keys", term58783);
        setField(term58782, term58782.getClass(), "vals", term58784);
        term58785 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term45561;
        Object retValue = callMethod(klass, "equals", argTypes, term45557, args);
        assertTrue(recursiveEquals(term45557, term58782));
        assertTrue(recursiveEquals(term45561, term58785));
        assertTrue(recursiveEquals(retValue, false));
    }

};


