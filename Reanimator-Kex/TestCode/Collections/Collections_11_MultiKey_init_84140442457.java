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

public class MultiKey_init_84140442457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8721;
     Object term8938;
     Object term8943;

    public MultiKey_init_84140442457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8879 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term8879, term8879.getClass(), "keys", null);
        term8721 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term8722 = (Object[]) newArray("java.lang.Object", 0);
        Object term8917 = newInstance(Class.forName("java.lang.Object"));
        Object[] term8724 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term8721, 0, term8722);
        setElement(term8721, 1, term8917);
        setElement(term8721, 2, term8724);
        setElement(term8721, 3, term8917);
        term8938 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term8939 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term8940 = (Object[]) newArray("java.lang.Object", 0);
        Object term8941 = newInstance(Class.forName("java.lang.Object"));
        Object[] term8942 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term8939, 0, term8940);
        setElement(term8939, 1, term8941);
        setElement(term8939, 2, term8942);
        setElement(term8939, 3, term8941);
        setField(term8938, term8938.getClass(), "keys", term8939);
        term8943 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term8944 = (Object[]) newArray("java.lang.Object", 0);
        Object term8945 = newInstance(Class.forName("java.lang.Object"));
        Object[] term8946 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term8943, 0, term8944);
        setElement(term8943, 1, term8945);
        setElement(term8943, 2, term8946);
        setElement(term8943, 3, term8945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8721;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8938));
        assertTrue(recursiveEquals(term8721, term8943));
    }

};


