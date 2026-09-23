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

public class NumberUtils_max_127754902775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510;
     Object term6889;

    public NumberUtils_max_127754902775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term510 = (int[]) newIntArray(6);
        setIntElement(term510, 0, -616727354);
        setIntElement(term510, 1, -1955890973);
        setIntElement(term510, 2, -2038273078);
        setIntElement(term510, 3, 1227103734);
        setIntElement(term510, 4, -1339778481);
        setIntElement(term510, 5, 1725571209);
        term6889 = (int[]) newIntArray(6);
        setIntElement(term6889, 0, -616727354);
        setIntElement(term6889, 1, -1955890973);
        setIntElement(term6889, 2, -2038273078);
        setIntElement(term6889, 3, 1227103734);
        setIntElement(term6889, 4, -1339778481);
        setIntElement(term6889, 5, 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term510;
        callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term510, term6889));
    }

};


