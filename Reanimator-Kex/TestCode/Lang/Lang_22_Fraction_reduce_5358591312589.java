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

public class Fraction_reduce_5358591312589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848799;
     Object term849004;
     Object term849001;

    public Fraction_reduce_5358591312589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term848799 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term848799, term848799.getClass(), "numerator", 554720594);
        setIntField(term848799, term848799.getClass(), "denominator", 1879221889);
        term849004 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term849004, term849004.getClass(), "numerator", 554720594);
        setIntField(term849004, term849004.getClass(), "denominator", 1879221889);
        setField(term849004, term849004.getClass(), "toString", null);
        setField(term849004, term849004.getClass(), "toProperString", null);
        term849001 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term849001, term849001.getClass(), "numerator", 554720594);
        setIntField(term849001, term849001.getClass(), "denominator", 1879221889);
        setField(term849001, term849001.getClass(), "toString", null);
        setField(term849001, term849001.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term848799, args);
        assertTrue(recursiveEquals(term848799, term849004));
        assertTrue(recursiveEquals(retValue, term849001));
    }

};


