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

public class Fraction_toString_3541419701369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446945;
     Object term447357;

    public Fraction_toString_3541419701369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term446945 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setField(term446945, term446945.getClass(), "toString", null);
        term447357 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term447357, term447357.getClass(), "numerator", 0);
        setIntField(term447357, term447357.getClass(), "denominator", 0);
        setField(term447357, term447357.getClass(), "toString", "0/0");
        setField(term447357, term447357.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term446945, args);
        assertTrue(recursiveEquals(term446945, term447357));
        assertTrue(recursiveEquals(retValue, "0/0"));
    }

};


