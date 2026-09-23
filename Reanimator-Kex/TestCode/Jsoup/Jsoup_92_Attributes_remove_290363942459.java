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

public class Attributes_remove_290363942459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10136360;
     Object term10872476;

    public Attributes_remove_290363942459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10136360 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10134375 = (Object[]) newArray("java.lang.String", 239);
        setIntField(term10136360, term10136360.getClass(), "size", 9);
        setField(term10136360, term10136360.getClass(), "keys", term10134375);
        term10872476 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10872477 = (Object[]) newArray("java.lang.String", 239);
        setIntField(term10872476, term10872476.getClass(), "size", 9);
        setField(term10872476, term10872476.getClass(), "keys", term10872477);
        setField(term10872476, term10872476.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term10136360, args);
        assertTrue(recursiveEquals(term10136360, term10872476));
    }

};


