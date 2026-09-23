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

public class Fraction_reduce_5358591311364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445546;
     Object term445963;
     Object term445957;

    public Fraction_reduce_5358591311364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445546 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term445546, term445546.getClass(), "numerator", -1211460922);
        setIntField(term445546, term445546.getClass(), "denominator", 1131808629);
        term445963 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term445963, term445963.getClass(), "numerator", -1211460922);
        setIntField(term445963, term445963.getClass(), "denominator", 1131808629);
        setField(term445963, term445963.getClass(), "toString", null);
        setField(term445963, term445963.getClass(), "toProperString", null);
        term445957 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term445957, term445957.getClass(), "numerator", -173065846);
        setIntField(term445957, term445957.getClass(), "denominator", 161686947);
        setField(term445957, term445957.getClass(), "toString", null);
        setField(term445957, term445957.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term445546, args);
        assertTrue(recursiveEquals(term445546, term445963));
        assertTrue(recursiveEquals(retValue, term445957));
    }

};


