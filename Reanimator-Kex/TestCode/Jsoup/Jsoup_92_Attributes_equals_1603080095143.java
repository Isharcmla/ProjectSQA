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

public class Attributes_equals_1603080095143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91442;
     Object term91520;
     Object term91528;
     Object term91529;

    public Attributes_equals_1603080095143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91442 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term91520 = newInstance(Class.forName("java.lang.invoke.MethodHandleProxies"));
        term91528 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term91528, term91528.getClass(), "size", 0);
        setField(term91528, term91528.getClass(), "keys", null);
        setField(term91528, term91528.getClass(), "vals", null);
        term91529 = newInstance(Class.forName("java.lang.invoke.MethodHandleProxies"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term91520;
        Object retValue = callMethod(klass, "equals", argTypes, term91442, args);
        assertTrue(recursiveEquals(term91442, term91528));
        assertTrue(recursiveEquals(term91520, term91529));
        assertTrue(recursiveEquals(retValue, false));
    }

};


