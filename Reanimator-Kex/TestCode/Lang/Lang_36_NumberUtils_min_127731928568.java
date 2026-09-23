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

public class NumberUtils_min_127731928568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453;
     Object term6721;

    public NumberUtils_min_127731928568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453 = (long[]) newLongArray(5);
        setLongElement(term453, 0, 6375119433582206027L);
        setLongElement(term453, 1, -8257434502486459194L);
        setLongElement(term453, 2, -8400487765614892086L);
        setLongElement(term453, 3, 5270370404989704783L);
        setLongElement(term453, 4, 7411271909051562686L);
        term6721 = (long[]) newLongArray(5);
        setLongElement(term6721, 0, 6375119433582206027L);
        setLongElement(term6721, 1, -8257434502486459194L);
        setLongElement(term6721, 2, -8400487765614892086L);
        setLongElement(term6721, 3, 5270370404989704783L);
        setLongElement(term6721, 4, 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term453;
        callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term453, term6721));
    }

};


