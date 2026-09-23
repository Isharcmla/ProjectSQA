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

public class Fraction_reduce_5358591312016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656315;
     Object term656783;
     Object term656780;

    public Fraction_reduce_5358591312016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term656315 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term656315, term656315.getClass(), "numerator", 2047033554);
        setIntField(term656315, term656315.getClass(), "denominator", 1157502097);
        term656783 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term656783, term656783.getClass(), "numerator", 2047033554);
        setIntField(term656783, term656783.getClass(), "denominator", 1157502097);
        setField(term656783, term656783.getClass(), "toString", null);
        setField(term656783, term656783.getClass(), "toProperString", null);
        term656780 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term656780, term656780.getClass(), "numerator", 2047033554);
        setIntField(term656780, term656780.getClass(), "denominator", 1157502097);
        setField(term656780, term656780.getClass(), "toString", null);
        setField(term656780, term656780.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term656315, args);
        assertTrue(recursiveEquals(term656315, term656783));
        assertTrue(recursiveEquals(retValue, term656780));
    }

};


