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

public class NumberUtils_equals_25711420175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459;
     Object term462;
     Object term5680;
     Object term5681;

    public NumberUtils_equals_25711420175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459 = (long[]) newLongArray(2);
        setLongElement(term459, 0, 6375119433582206027L);
        setLongElement(term459, 1, -8257434502486459194L);
        term462 = (long[]) newLongArray(6);
        setLongElement(term462, 0, -8400487765614892086L);
        setLongElement(term462, 1, 5270370404989704783L);
        setLongElement(term462, 2, 7411271909051562686L);
        setLongElement(term462, 3, 4872422362414183754L);
        setLongElement(term462, 4, 6811161968424632369L);
        setLongElement(term462, 5, -7237588299778557629L);
        term5680 = (long[]) newLongArray(2);
        setLongElement(term5680, 0, 6375119433582206027L);
        setLongElement(term5680, 1, -8257434502486459194L);
        term5681 = (long[]) newLongArray(6);
        setLongElement(term5681, 0, -8400487765614892086L);
        setLongElement(term5681, 1, 5270370404989704783L);
        setLongElement(term5681, 2, 7411271909051562686L);
        setLongElement(term5681, 3, 4872422362414183754L);
        setLongElement(term5681, 4, 6811161968424632369L);
        setLongElement(term5681, 5, -7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term459;
        args[1] = term462;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term459, term5680));
        assertTrue(recursiveEquals(term462, term5681));
        assertTrue(recursiveEquals(retValue, false));
    }

};


