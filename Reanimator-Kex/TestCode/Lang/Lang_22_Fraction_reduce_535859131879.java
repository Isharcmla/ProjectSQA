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

public class Fraction_reduce_535859131879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280469;
     Object term280690;
     Object term280687;

    public Fraction_reduce_535859131879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280469 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term280469, term280469.getClass(), "numerator", 1340046206);
        setIntField(term280469, term280469.getClass(), "denominator", 1845452647);
        term280690 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term280690, term280690.getClass(), "numerator", 1340046206);
        setIntField(term280690, term280690.getClass(), "denominator", 1845452647);
        setField(term280690, term280690.getClass(), "toString", null);
        setField(term280690, term280690.getClass(), "toProperString", null);
        term280687 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term280687, term280687.getClass(), "numerator", 1340046206);
        setIntField(term280687, term280687.getClass(), "denominator", 1845452647);
        setField(term280687, term280687.getClass(), "toString", null);
        setField(term280687, term280687.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term280469, args);
        assertTrue(recursiveEquals(term280469, term280690));
        assertTrue(recursiveEquals(retValue, term280687));
    }

};


