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

public class Fraction_reduce_3355035252716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809589;
     Object term810448;
     Object term810442;

    public Fraction_reduce_3355035252716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809589 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term809589, term809589.getClass(), "numerator", -2114137598);
        setIntField(term809589, term809589.getClass(), "denominator", 1073741824);
        term810448 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term810448, term810448.getClass(), "numerator", -2114137598);
        setIntField(term810448, term810448.getClass(), "denominator", 1073741824);
        setField(term810448, term810448.getClass(), "toString", null);
        setField(term810448, term810448.getClass(), "toProperString", null);
        term810442 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term810442, term810442.getClass(), "numerator", -1057068799);
        setIntField(term810442, term810442.getClass(), "denominator", 536870912);
        setField(term810442, term810442.getClass(), "toString", null);
        setField(term810442, term810442.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term809589, args);
        assertTrue(recursiveEquals(term809589, term810448));
        assertTrue(recursiveEquals(retValue, term810442));
    }

};


