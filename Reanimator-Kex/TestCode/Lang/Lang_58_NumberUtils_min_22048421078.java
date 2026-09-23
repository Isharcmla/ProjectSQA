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

public class NumberUtils_min_22048421078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519;
     Object term5798;

    public NumberUtils_min_22048421078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519 = (long[]) newLongArray(5);
        setLongElement(term519, 0, 6967924379644551255L);
        setLongElement(term519, 1, -2813493605142626659L);
        setLongElement(term519, 2, -8885298608300233488L);
        setLongElement(term519, 3, -4325723315152823407L);
        setLongElement(term519, 4, 2535595959091595249L);
        term5798 = (long[]) newLongArray(5);
        setLongElement(term5798, 0, 6967924379644551255L);
        setLongElement(term5798, 1, -2813493605142626659L);
        setLongElement(term5798, 2, -8885298608300233488L);
        setLongElement(term5798, 3, -4325723315152823407L);
        setLongElement(term5798, 4, 2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term519;
        callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term519, term5798));
    }

};


