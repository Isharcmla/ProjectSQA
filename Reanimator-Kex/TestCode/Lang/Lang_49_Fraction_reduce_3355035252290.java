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

public class Fraction_reduce_3355035252290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677322;
     Object term678053;
     Object term678047;

    public Fraction_reduce_3355035252290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677322 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term677322, term677322.getClass(), "numerator", 12916914);
        setIntField(term677322, term677322.getClass(), "denominator", 2120387025);
        term678053 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term678053, term678053.getClass(), "numerator", 12916914);
        setIntField(term678053, term678053.getClass(), "denominator", 2120387025);
        setField(term678053, term678053.getClass(), "toString", null);
        setField(term678053, term678053.getClass(), "toProperString", null);
        term678047 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term678047, term678047.getClass(), "numerator", 4305638);
        setIntField(term678047, term678047.getClass(), "denominator", 706795675);
        setField(term678047, term678047.getClass(), "toString", null);
        setField(term678047, term678047.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term677322, args);
        assertTrue(recursiveEquals(term677322, term678053));
        assertTrue(recursiveEquals(retValue, term678047));
    }

};


