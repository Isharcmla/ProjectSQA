package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class NumberUtils_min_127732030969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464;
     Object term6747;

    public NumberUtils_min_127732030969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464 = (int[]) newIntArray(4);
        setIntElement(term464, 0, 1162663216);
        setIntElement(term464, 1, 1484323161);
        setIntElement(term464, 2, 391863371);
        setIntElement(term464, 3, -1922583790);
        term6747 = (int[]) newIntArray(4);
        setIntElement(term6747, 0, 1162663216);
        setIntElement(term6747, 1, 1484323161);
        setIntElement(term6747, 2, 391863371);
        setIntElement(term6747, 3, -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term464;
        callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term464, term6747));
    }

};


