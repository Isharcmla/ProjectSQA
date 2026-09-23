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

public class Fraction_reduce_5358591312258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736592;
     Object term737409;
     Object term737406;

    public Fraction_reduce_5358591312258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term736592 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term736592, term736592.getClass(), "numerator", 11602634);
        setIntField(term736592, term736592.getClass(), "denominator", 875709053);
        term737409 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term737409, term737409.getClass(), "numerator", 11602634);
        setIntField(term737409, term737409.getClass(), "denominator", 875709053);
        setField(term737409, term737409.getClass(), "toString", null);
        setField(term737409, term737409.getClass(), "toProperString", null);
        term737406 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term737406, term737406.getClass(), "numerator", 11602634);
        setIntField(term737406, term737406.getClass(), "denominator", 875709053);
        setField(term737406, term737406.getClass(), "toString", null);
        setField(term737406, term737406.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term736592, args);
        assertTrue(recursiveEquals(term736592, term737409));
        assertTrue(recursiveEquals(retValue, term737406));
    }

};


