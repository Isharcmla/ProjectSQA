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

public class ArrayUtils_isSameLength_1946753418198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219;
     Object term226;
     Object term11566;
     Object term11567;

    public ArrayUtils_isSameLength_1946753418198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219 = (long[]) newLongArray(6);
        setLongElement(term219, 0, 7411271909051562686L);
        setLongElement(term219, 1, 4872422362414183754L);
        setLongElement(term219, 2, 6811161968424632369L);
        setLongElement(term219, 3, -7237588299778557629L);
        setLongElement(term219, 4, 6967924379644551255L);
        setLongElement(term219, 5, -2813493605142626659L);
        term226 = (long[]) newLongArray(2);
        setLongElement(term226, 0, -8885298608300233488L);
        setLongElement(term226, 1, -4325723315152823407L);
        term11566 = (long[]) newLongArray(6);
        setLongElement(term11566, 0, 7411271909051562686L);
        setLongElement(term11566, 1, 4872422362414183754L);
        setLongElement(term11566, 2, 6811161968424632369L);
        setLongElement(term11566, 3, -7237588299778557629L);
        setLongElement(term11566, 4, 6967924379644551255L);
        setLongElement(term11566, 5, -2813493605142626659L);
        term11567 = (long[]) newLongArray(2);
        setLongElement(term11567, 0, -8885298608300233488L);
        setLongElement(term11567, 1, -4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term219;
        args[1] = term226;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term219, term11566));
        assertTrue(recursiveEquals(term226, term11567));
        assertTrue(recursiveEquals(retValue, false));
    }

};


