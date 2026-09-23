package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class NumberUtils_max_22071292884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551;
     Object term6174;

    public NumberUtils_max_22071292884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551 = (long[]) newLongArray(8);
        setLongElement(term551, 0, -5476826692763582090L);
        setLongElement(term551, 1, -872011222785455006L);
        setLongElement(term551, 2, -316468845751588286L);
        setLongElement(term551, 3, 5127676408959197577L);
        setLongElement(term551, 4, -6573104506744284592L);
        setLongElement(term551, 5, -4920224193275732920L);
        setLongElement(term551, 6, 8428634514691209827L);
        setLongElement(term551, 7, -2585684163342970173L);
        term6174 = (long[]) newLongArray(8);
        setLongElement(term6174, 0, -5476826692763582090L);
        setLongElement(term6174, 1, -872011222785455006L);
        setLongElement(term6174, 2, -316468845751588286L);
        setLongElement(term6174, 3, 5127676408959197577L);
        setLongElement(term6174, 4, -6573104506744284592L);
        setLongElement(term6174, 5, -4920224193275732920L);
        setLongElement(term6174, 6, 8428634514691209827L);
        setLongElement(term6174, 7, -2585684163342970173L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term551;
        callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term551, term6174));
    }

};


