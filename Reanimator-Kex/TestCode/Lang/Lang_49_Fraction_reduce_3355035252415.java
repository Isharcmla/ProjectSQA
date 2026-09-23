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

public class Fraction_reduce_3355035252415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717554;
     Object term718423;
     Object term718420;

    public Fraction_reduce_3355035252415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717554 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term717554, term717554.getClass(), "numerator", 839621634);
        setIntField(term717554, term717554.getClass(), "denominator", 543707897);
        term718423 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term718423, term718423.getClass(), "numerator", 839621634);
        setIntField(term718423, term718423.getClass(), "denominator", 543707897);
        setField(term718423, term718423.getClass(), "toString", null);
        setField(term718423, term718423.getClass(), "toProperString", null);
        term718420 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term718420, term718420.getClass(), "numerator", 839621634);
        setIntField(term718420, term718420.getClass(), "denominator", 543707897);
        setField(term718420, term718420.getClass(), "toString", null);
        setField(term718420, term718420.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term717554, args);
        assertTrue(recursiveEquals(term717554, term718423));
        assertTrue(recursiveEquals(retValue, term718420));
    }

};


