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

public class Fraction_reduce_5358591312524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term827192;
     Object term827726;
     Object term827723;

    public Fraction_reduce_5358591312524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term827192 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term827192, term827192.getClass(), "numerator", -1252496094);
        setIntField(term827192, term827192.getClass(), "denominator", 1301824711);
        term827726 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term827726, term827726.getClass(), "numerator", -1252496094);
        setIntField(term827726, term827726.getClass(), "denominator", 1301824711);
        setField(term827726, term827726.getClass(), "toString", null);
        setField(term827726, term827726.getClass(), "toProperString", null);
        term827723 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term827723, term827723.getClass(), "numerator", -1252496094);
        setIntField(term827723, term827723.getClass(), "denominator", 1301824711);
        setField(term827723, term827723.getClass(), "toString", null);
        setField(term827723, term827723.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term827192, args);
        assertTrue(recursiveEquals(term827192, term827726));
        assertTrue(recursiveEquals(retValue, term827723));
    }

};


