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

public class Fraction_reduce_3355035251913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561809;
     Object term561994;
     Object term561991;

    public Fraction_reduce_3355035251913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561809 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term561809, term561809.getClass(), "numerator", 1073742322);
        setIntField(term561809, term561809.getClass(), "denominator", 536870641);
        term561994 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term561994, term561994.getClass(), "numerator", 1073742322);
        setIntField(term561994, term561994.getClass(), "denominator", 536870641);
        setField(term561994, term561994.getClass(), "toString", null);
        setField(term561994, term561994.getClass(), "toProperString", null);
        term561991 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term561991, term561991.getClass(), "numerator", 1073742322);
        setIntField(term561991, term561991.getClass(), "denominator", 536870641);
        setField(term561991, term561991.getClass(), "toString", null);
        setField(term561991, term561991.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term561809, args);
        assertTrue(recursiveEquals(term561809, term561994));
        assertTrue(recursiveEquals(retValue, term561991));
    }

};


