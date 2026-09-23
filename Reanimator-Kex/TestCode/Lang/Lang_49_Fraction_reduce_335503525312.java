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

public class Fraction_reduce_335503525312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81529;
     Object term82260;
     Object term82254;

    public Fraction_reduce_335503525312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81529 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term81529, term81529.getClass(), "numerator", -2113830462);
        setIntField(term81529, term81529.getClass(), "denominator", 70261095);
        term82260 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term82260, term82260.getClass(), "numerator", -2113830462);
        setIntField(term82260, term82260.getClass(), "denominator", 70261095);
        setField(term82260, term82260.getClass(), "toString", null);
        setField(term82260, term82260.getClass(), "toProperString", null);
        term82254 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term82254, term82254.getClass(), "numerator", -704610154);
        setIntField(term82254, term82254.getClass(), "denominator", 23420365);
        setField(term82254, term82254.getClass(), "toString", null);
        setField(term82254, term82254.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term81529, args);
        assertTrue(recursiveEquals(term81529, term82260));
        assertTrue(recursiveEquals(retValue, term82254));
    }

};


