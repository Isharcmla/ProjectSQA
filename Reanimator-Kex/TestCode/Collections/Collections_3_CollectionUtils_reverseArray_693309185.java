package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.lang.Object;

public class CollectionUtils_reverseArray_693309185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42;
     Object term5875;

    public CollectionUtils_reverseArray_693309185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42 = (Object[]) newArray("java.lang.Object", 5);
        Object term43 = newInstance(Class.forName("java.lang.Object"));
        Object term44 = newInstance(Class.forName("java.lang.Object"));
        Object term45 = newInstance(Class.forName("java.lang.Object"));
        Object term46 = newInstance(Class.forName("java.lang.Object"));
        Object term47 = newInstance(Class.forName("java.lang.Object"));
        setElement(term42, 0, term43);
        setElement(term42, 1, term44);
        setElement(term42, 2, term45);
        setElement(term42, 3, term46);
        setElement(term42, 4, term47);
        term5875 = (Object[]) newArray("java.lang.Object", 5);
        Object term5876 = newInstance(Class.forName("java.lang.Object"));
        Object term5877 = newInstance(Class.forName("java.lang.Object"));
        Object term5878 = newInstance(Class.forName("java.lang.Object"));
        Object term5879 = newInstance(Class.forName("java.lang.Object"));
        Object term5880 = newInstance(Class.forName("java.lang.Object"));
        setElement(term5875, 0, term5876);
        setElement(term5875, 1, term5877);
        setElement(term5875, 2, term5878);
        setElement(term5875, 3, term5879);
        setElement(term5875, 4, term5880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term42;
        callMethod(klass, "reverseArray", argTypes, null, args);
        assertTrue(recursiveEquals(term42, term5875));
    }

};


