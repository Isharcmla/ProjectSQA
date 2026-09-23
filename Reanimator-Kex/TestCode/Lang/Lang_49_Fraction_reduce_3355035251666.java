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

public class Fraction_reduce_3355035251666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490181;
     Object term490736;
     Object term490730;

    public Fraction_reduce_3355035251666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490181 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term490181, term490181.getClass(), "numerator", -1608416146);
        setIntField(term490181, term490181.getClass(), "denominator", 64);
        term490736 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term490736, term490736.getClass(), "numerator", -1608416146);
        setIntField(term490736, term490736.getClass(), "denominator", 64);
        setField(term490736, term490736.getClass(), "toString", null);
        setField(term490736, term490736.getClass(), "toProperString", null);
        term490730 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term490730, term490730.getClass(), "numerator", -804208073);
        setIntField(term490730, term490730.getClass(), "denominator", 32);
        setField(term490730, term490730.getClass(), "toString", null);
        setField(term490730, term490730.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term490181, args);
        assertTrue(recursiveEquals(term490181, term490736));
        assertTrue(recursiveEquals(retValue, term490730));
    }

};


