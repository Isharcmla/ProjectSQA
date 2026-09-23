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
import java.lang.Long;

public class ArrayUtils_indexOf_1338747799222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512;
     Object term520;
     Object term12539;

    public ArrayUtils_indexOf_1338747799222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term512 = (long[]) newLongArray(7);
        setLongElement(term512, 0, -6573104506744284592L);
        setLongElement(term512, 1, -4920224193275732920L);
        setLongElement(term512, 2, 8428634514691209827L);
        setLongElement(term512, 3, -2585684163342970173L);
        setLongElement(term512, 4, 8059786003080744426L);
        setLongElement(term512, 5, -4365849114644724155L);
        setLongElement(term512, 6, 2486810210675247493L);
        term520 = new Long(7009926388951271268L);
        term12539 = (long[]) newLongArray(7);
        setLongElement(term12539, 0, -6573104506744284592L);
        setLongElement(term12539, 1, -4920224193275732920L);
        setLongElement(term12539, 2, 8428634514691209827L);
        setLongElement(term12539, 3, -2585684163342970173L);
        setLongElement(term12539, 4, 8059786003080744426L);
        setLongElement(term12539, 5, -4365849114644724155L);
        setLongElement(term12539, 6, 2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term512;
        args[1] = term520;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term512, term12539));
        assertTrue(recursiveEquals(term520, 7009926388951271268L));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


