package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_142030084014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term4;
     Object term5;
     Object term116;
     Object term121;
     Object term122;
     Object term123;

    public MultiKey_init_142030084014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("java.lang.Object"));
        term4 = newInstance(Class.forName("java.lang.Object"));
        term5 = newInstance(Class.forName("java.lang.Object"));
        term116 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term117 = (Object[]) newArray("java.lang.Object", 3);
        Object term118 = newInstance(Class.forName("java.lang.Object"));
        Object term119 = newInstance(Class.forName("java.lang.Object"));
        Object term120 = newInstance(Class.forName("java.lang.Object"));
        setElement(term117, 0, term118);
        setElement(term117, 1, term119);
        setElement(term117, 2, term120);
        setField(term116, term116.getClass(), "keys", term117);
        term121 = newInstance(Class.forName("java.lang.Object"));
        term122 = newInstance(Class.forName("java.lang.Object"));
        term123 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term3;
        args[1] = term4;
        args[2] = term5;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term116));
        assertTrue(recursiveEquals(term3, term121));
        assertTrue(recursiveEquals(term4, term122));
        assertTrue(recursiveEquals(term5, term123));
    }

};


