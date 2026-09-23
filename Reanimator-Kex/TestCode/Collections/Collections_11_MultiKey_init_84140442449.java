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

public class MultiKey_init_84140442449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3057;
     Object term7937;
     Object term7940;

    public MultiKey_init_84140442449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3197 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term3197, term3197.getClass(), "keys", null);
        term3057 = (Object[]) newArray("java.lang.Object", 491);
        Object term3299 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setElement(term3057, 0, term3299);
        setElement(term3057, 1, term3299);
        term7937 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term7938 = (Object[]) newArray("java.lang.Object", 491);
        Object term7939 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term7939, term7939.getClass(), "keys", null);
        setElement(term7938, 0, term7939);
        setElement(term7938, 1, term7939);
        setField(term7937, term7937.getClass(), "keys", term7938);
        term7940 = (Object[]) newArray("java.lang.Object", 491);
        Object term7941 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term7941, term7941.getClass(), "keys", null);
        setElement(term7940, 0, term7941);
        setElement(term7940, 1, term7941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3057;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7937));
        assertTrue(recursiveEquals(term3057, term7940));
    }

};


