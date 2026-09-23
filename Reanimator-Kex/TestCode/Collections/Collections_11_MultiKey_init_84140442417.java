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

public class MultiKey_init_84140442417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term218;
     Object term225;

    public MultiKey_init_84140442417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = (Object[]) newArray("java.lang.Object", 5);
        Object term16 = newInstance(Class.forName("java.lang.Object"));
        Object term17 = newInstance(Class.forName("java.lang.Object"));
        Object term18 = newInstance(Class.forName("java.lang.Object"));
        Object term19 = newInstance(Class.forName("java.lang.Object"));
        Object term20 = newInstance(Class.forName("java.lang.Object"));
        setElement(term15, 0, term16);
        setElement(term15, 1, term17);
        setElement(term15, 2, term18);
        setElement(term15, 3, term19);
        setElement(term15, 4, term20);
        term218 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term219 = (Object[]) newArray("java.lang.Object", 5);
        Object term220 = newInstance(Class.forName("java.lang.Object"));
        Object term221 = newInstance(Class.forName("java.lang.Object"));
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term223 = newInstance(Class.forName("java.lang.Object"));
        Object term224 = newInstance(Class.forName("java.lang.Object"));
        setElement(term219, 0, term220);
        setElement(term219, 1, term221);
        setElement(term219, 2, term222);
        setElement(term219, 3, term223);
        setElement(term219, 4, term224);
        setField(term218, term218.getClass(), "keys", term219);
        term225 = (Object[]) newArray("java.lang.Object", 5);
        Object term226 = newInstance(Class.forName("java.lang.Object"));
        Object term227 = newInstance(Class.forName("java.lang.Object"));
        Object term228 = newInstance(Class.forName("java.lang.Object"));
        Object term229 = newInstance(Class.forName("java.lang.Object"));
        Object term230 = newInstance(Class.forName("java.lang.Object"));
        setElement(term225, 0, term226);
        setElement(term225, 1, term227);
        setElement(term225, 2, term228);
        setElement(term225, 3, term229);
        setElement(term225, 4, term230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term218));
        assertTrue(recursiveEquals(term15, term225));
    }

};


