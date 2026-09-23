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

public class ArrayUtils_isSameLength_1946753418200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230;
     Object term237;
     Object term11612;
     Object term11613;

    public ArrayUtils_isSameLength_1946753418200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230 = (long[]) newLongArray(6);
        setLongElement(term230, 0, 7411271909051562686L);
        setLongElement(term230, 1, 4872422362414183754L);
        setLongElement(term230, 2, 6811161968424632369L);
        setLongElement(term230, 3, -7237588299778557629L);
        setLongElement(term230, 4, 6967924379644551255L);
        setLongElement(term230, 5, -2813493605142626659L);
        term237 = (long[]) newLongArray(2);
        setLongElement(term237, 0, -8885298608300233488L);
        setLongElement(term237, 1, -4325723315152823407L);
        term11612 = (long[]) newLongArray(6);
        setLongElement(term11612, 0, 7411271909051562686L);
        setLongElement(term11612, 1, 4872422362414183754L);
        setLongElement(term11612, 2, 6811161968424632369L);
        setLongElement(term11612, 3, -7237588299778557629L);
        setLongElement(term11612, 4, 6967924379644551255L);
        setLongElement(term11612, 5, -2813493605142626659L);
        term11613 = (long[]) newLongArray(2);
        setLongElement(term11613, 0, -8885298608300233488L);
        setLongElement(term11613, 1, -4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term230;
        args[1] = term237;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term230, term11612));
        assertTrue(recursiveEquals(term237, term11613));
        assertTrue(recursiveEquals(retValue, false));
    }

};


