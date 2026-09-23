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

public class ArrayUtils_indexOf_1338747799224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523;
     Object term531;
     Object term12585;

    public ArrayUtils_indexOf_1338747799224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term523 = (long[]) newLongArray(7);
        setLongElement(term523, 0, -6573104506744284592L);
        setLongElement(term523, 1, -4920224193275732920L);
        setLongElement(term523, 2, 8428634514691209827L);
        setLongElement(term523, 3, -2585684163342970173L);
        setLongElement(term523, 4, 8059786003080744426L);
        setLongElement(term523, 5, -4365849114644724155L);
        setLongElement(term523, 6, 2486810210675247493L);
        term531 = new Long(7009926388951271268L);
        term12585 = (long[]) newLongArray(7);
        setLongElement(term12585, 0, -6573104506744284592L);
        setLongElement(term12585, 1, -4920224193275732920L);
        setLongElement(term12585, 2, 8428634514691209827L);
        setLongElement(term12585, 3, -2585684163342970173L);
        setLongElement(term12585, 4, 8059786003080744426L);
        setLongElement(term12585, 5, -4365849114644724155L);
        setLongElement(term12585, 6, 2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term523;
        args[1] = term531;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term523, term12585));
        assertTrue(recursiveEquals(term531, 7009926388951271268L));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


