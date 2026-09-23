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

public class MultiKey_toString_163827017625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term825;

    public MultiKey_toString_163827017625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term64 = (Object[]) newArray("java.lang.Object", 6);
        Object term65 = newInstance(Class.forName("java.lang.Object"));
        Object term66 = newInstance(Class.forName("java.lang.Object"));
        Object term67 = newInstance(Class.forName("java.lang.Object"));
        Object term68 = newInstance(Class.forName("java.lang.Object"));
        Object term69 = newInstance(Class.forName("java.lang.Object"));
        Object term70 = newInstance(Class.forName("java.lang.Object"));
        setElement(term64, 0, term65);
        setElement(term64, 1, term66);
        setElement(term64, 2, term67);
        setElement(term64, 3, term68);
        setElement(term64, 4, term69);
        setElement(term64, 5, term70);
        setField(term63, term63.getClass(), "keys", term64);
        term825 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term826 = (Object[]) newArray("java.lang.Object", 6);
        Object term827 = newInstance(Class.forName("java.lang.Object"));
        Object term828 = newInstance(Class.forName("java.lang.Object"));
        Object term829 = newInstance(Class.forName("java.lang.Object"));
        Object term830 = newInstance(Class.forName("java.lang.Object"));
        Object term831 = newInstance(Class.forName("java.lang.Object"));
        Object term832 = newInstance(Class.forName("java.lang.Object"));
        setElement(term826, 0, term827);
        setElement(term826, 1, term828);
        setElement(term826, 2, term829);
        setElement(term826, 3, term830);
        setElement(term826, 4, term831);
        setElement(term826, 5, term832);
        setField(term825, term825.getClass(), "keys", term826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term63, args);
        assertTrue(recursiveEquals(term63, term825));
        assertTrue(recursiveEquals(retValue, "MultiKey[java.lang.Object@3fb9c88d, java.lang.Object@4ad07f48, java.lang.Object@4f57368c, java.lang.Object@1b30bbb0, java.lang.Object@6a3cf5fb, java.lang.Object@23dfedcb]"));
    }

};


