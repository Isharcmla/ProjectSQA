package org.apache.commons.collections4.keyvalue;

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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_174156797215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term4;
     Object term5;
     Object term131;
     Object term136;
     Object term137;
     Object term138;

    public MultiKey_init_174156797215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("java.lang.Object"));
        term4 = newInstance(Class.forName("java.lang.Object"));
        term5 = newInstance(Class.forName("java.lang.Object"));
        term131 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term132 = (Object[]) newArray("java.lang.Object", 3);
        Object term133 = newInstance(Class.forName("java.lang.Object"));
        Object term134 = newInstance(Class.forName("java.lang.Object"));
        Object term135 = newInstance(Class.forName("java.lang.Object"));
        setElement(term132, 0, term133);
        setElement(term132, 1, term134);
        setElement(term132, 2, term135);
        setField(term131, term131.getClass(), "keys", term132);
        term136 = newInstance(Class.forName("java.lang.Object"));
        term137 = newInstance(Class.forName("java.lang.Object"));
        term138 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term3;
        args[1] = term4;
        args[2] = term5;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term131));
        assertTrue(recursiveEquals(term3, term136));
        assertTrue(recursiveEquals(term4, term137));
        assertTrue(recursiveEquals(term5, term138));
    }

};


