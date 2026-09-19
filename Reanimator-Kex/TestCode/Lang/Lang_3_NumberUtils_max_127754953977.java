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

public class NumberUtils_max_127754953977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523;
     Object term6945;

    public NumberUtils_max_127754953977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term523 = (short[]) newShortArray(7);
        setShortElement(term523, 0, (short) -19694);
        setShortElement(term523, 1, (short) 31942);
        setShortElement(term523, 2, (short) 30947);
        setShortElement(term523, 3, (short) 27594);
        setShortElement(term523, 4, (short) 7670);
        setShortElement(term523, 5, (short) -26033);
        setShortElement(term523, 6, (short) 8329);
        term6945 = (short[]) newShortArray(7);
        setShortElement(term6945, 0, (short) -19694);
        setShortElement(term6945, 1, (short) 31942);
        setShortElement(term6945, 2, (short) 30947);
        setShortElement(term6945, 3, (short) 27594);
        setShortElement(term6945, 4, (short) 7670);
        setShortElement(term6945, 5, (short) -26033);
        setShortElement(term6945, 6, (short) 8329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term523;
        callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term523, term6945));
    }

};


