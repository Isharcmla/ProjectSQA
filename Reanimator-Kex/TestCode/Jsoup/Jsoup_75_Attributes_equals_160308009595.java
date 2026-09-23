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

public class Attributes_equals_160308009595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64289;
     Object term64413;
     Object term64678;
     Object term64679;

    public Attributes_equals_160308009595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64289 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term64413 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator$ConstantPool$IndirectEntry"));
        term64678 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term64678, term64678.getClass(), "size", 0);
        setField(term64678, term64678.getClass(), "keys", null);
        setField(term64678, term64678.getClass(), "vals", null);
        term64679 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator$ConstantPool$IndirectEntry"));
        setIntField(term64679, term64679.getClass(), "tag", 0);
        setShortField(term64679, term64679.getClass(), "index0", (short) 0);
        setShortField(term64679, term64679.getClass(), "index1", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term64413;
        Object retValue = callMethod(klass, "equals", argTypes, term64289, args);
        assertTrue(recursiveEquals(term64289, term64678));
        assertTrue(recursiveEquals(term64413, term64679));
        assertTrue(recursiveEquals(retValue, false));
    }

};


