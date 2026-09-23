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

public class Fraction_reduce_335503525372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99285;
     Object term99849;
     Object term99843;

    public Fraction_reduce_335503525372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99285 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term99285, term99285.getClass(), "numerator", -1695670110);
        setIntField(term99285, term99285.getClass(), "denominator", 395473135);
        term99849 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term99849, term99849.getClass(), "numerator", -1695670110);
        setIntField(term99849, term99849.getClass(), "denominator", 395473135);
        setField(term99849, term99849.getClass(), "toString", null);
        setField(term99849, term99849.getClass(), "toProperString", null);
        term99843 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term99843, term99843.getClass(), "numerator", -339134022);
        setIntField(term99843, term99843.getClass(), "denominator", 79094627);
        setField(term99843, term99843.getClass(), "toString", null);
        setField(term99843, term99843.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term99285, args);
        assertTrue(recursiveEquals(term99285, term99849));
        assertTrue(recursiveEquals(retValue, term99843));
    }

};


