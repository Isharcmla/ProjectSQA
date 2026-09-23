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

public class MultiKey_init_28472473217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;
     Object term11;
     Object term12;
     Object term13;
     Object term14;
     Object term199;
     Object term206;
     Object term207;
     Object term208;
     Object term209;
     Object term210;

    public MultiKey_init_28472473217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = newInstance(Class.forName("java.lang.Object"));
        term11 = newInstance(Class.forName("java.lang.Object"));
        term12 = newInstance(Class.forName("java.lang.Object"));
        term13 = newInstance(Class.forName("java.lang.Object"));
        term14 = newInstance(Class.forName("java.lang.Object"));
        term199 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term200 = (Object[]) newArray("java.lang.Object", 5);
        Object term201 = newInstance(Class.forName("java.lang.Object"));
        Object term202 = newInstance(Class.forName("java.lang.Object"));
        Object term203 = newInstance(Class.forName("java.lang.Object"));
        Object term204 = newInstance(Class.forName("java.lang.Object"));
        Object term205 = newInstance(Class.forName("java.lang.Object"));
        setElement(term200, 0, term201);
        setElement(term200, 1, term202);
        setElement(term200, 2, term203);
        setElement(term200, 3, term204);
        setElement(term200, 4, term205);
        setField(term199, term199.getClass(), "keys", term200);
        term206 = newInstance(Class.forName("java.lang.Object"));
        term207 = newInstance(Class.forName("java.lang.Object"));
        term208 = newInstance(Class.forName("java.lang.Object"));
        term209 = newInstance(Class.forName("java.lang.Object"));
        term210 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("java.lang.Object");
        Object[] args = new Object[5];
        args[0] = term10;
        args[1] = term11;
        args[2] = term12;
        args[3] = term13;
        args[4] = term14;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term199));
        assertTrue(recursiveEquals(term10, term206));
        assertTrue(recursiveEquals(term11, term207));
        assertTrue(recursiveEquals(term12, term208));
        assertTrue(recursiveEquals(term13, term209));
        assertTrue(recursiveEquals(term14, term210));
    }

};


