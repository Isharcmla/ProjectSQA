package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;

public class ArrayUtils_reverse_67275835210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391;
     Object term12191;

    public ArrayUtils_reverse_67275835210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391 = (Object[]) newArray("java.lang.Object", 5);
        Object term392 = newInstance(Class.forName("java.lang.Object"));
        Object term393 = newInstance(Class.forName("java.lang.Object"));
        Object term394 = newInstance(Class.forName("java.lang.Object"));
        Object term395 = newInstance(Class.forName("java.lang.Object"));
        Object term396 = newInstance(Class.forName("java.lang.Object"));
        setElement(term391, 0, term392);
        setElement(term391, 1, term393);
        setElement(term391, 2, term394);
        setElement(term391, 3, term395);
        setElement(term391, 4, term396);
        term12191 = (Object[]) newArray("java.lang.Object", 5);
        Object term12192 = newInstance(Class.forName("java.lang.Object"));
        Object term12193 = newInstance(Class.forName("java.lang.Object"));
        Object term12194 = newInstance(Class.forName("java.lang.Object"));
        Object term12195 = newInstance(Class.forName("java.lang.Object"));
        Object term12196 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12191, 0, term12192);
        setElement(term12191, 1, term12193);
        setElement(term12191, 2, term12194);
        setElement(term12191, 3, term12195);
        setElement(term12191, 4, term12196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term391;
        callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term391, term12191));
    }

};


