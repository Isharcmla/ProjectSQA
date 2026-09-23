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

public class MultiKey_init_28472473256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6297;
     Object term5986;
     Object term6359;
     Object term11770;
     Object term11775;
     Object term11776;
     Object term11777;
     Object term11778;

    public MultiKey_init_28472473256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6141 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term5989 = (Object[]) newArray("java.lang.Object", 0);
        setField(term6141, term6141.getClass(), "keys", term5989);
        term6297 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        term5986 = (Object[]) newArray("java.lang.Object", 0);
        term6359 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        term11770 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term11771 = (Object[]) newArray("java.lang.Object", 5);
        Object term11772 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term11773 = (Object[]) newArray("java.lang.Object", 0);
        Object term11774 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        setField(term11772, term11772.getClass(), "keys", null);
        setElement(term11771, 0, term11772);
        setElement(term11771, 1, term11773);
        setElement(term11771, 2, term11772);
        setField(term11774, term11774.getClass(), "buf", null);
        setIntField(term11774, term11774.getClass(), "count", 0);
        setField(term11774, term11774.getClass(), "out", null);
        setBooleanField(term11774, term11774.getClass(), "closed", false);
        setField(term11774, term11774.getClass(), "closeLock", null);
        setElement(term11771, 3, term11774);
        setField(term11770, term11770.getClass(), "keys", term11771);
        term11775 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term11775, term11775.getClass(), "keys", null);
        term11776 = (Object[]) newArray("java.lang.Object", 0);
        term11777 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term11777, term11777.getClass(), "keys", null);
        term11778 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        setField(term11778, term11778.getClass(), "buf", null);
        setIntField(term11778, term11778.getClass(), "count", 0);
        setField(term11778, term11778.getClass(), "out", null);
        setBooleanField(term11778, term11778.getClass(), "closed", false);
        setField(term11778, term11778.getClass(), "closeLock", null);
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
        args[0] = term6297;
        args[1] = term5986;
        args[2] = term6297;
        args[3] = term6359;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11770));
        assertTrue(recursiveEquals(term6297, term11775));
        assertTrue(recursiveEquals(term5986, term11776));
        assertTrue(recursiveEquals(term6297, term11777));
        assertTrue(recursiveEquals(term6359, term11778));
    }

};


