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

public class Fraction_reduce_535859131230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59102;
     Object term59653;
     Object term59650;

    public Fraction_reduce_535859131230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59102 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term59102, term59102.getClass(), "numerator", -162511362);
        setIntField(term59102, term59102.getClass(), "denominator", 711289081);
        term59653 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term59653, term59653.getClass(), "numerator", -162511362);
        setIntField(term59653, term59653.getClass(), "denominator", 711289081);
        setField(term59653, term59653.getClass(), "toString", null);
        setField(term59653, term59653.getClass(), "toProperString", null);
        term59650 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term59650, term59650.getClass(), "numerator", -162511362);
        setIntField(term59650, term59650.getClass(), "denominator", 711289081);
        setField(term59650, term59650.getClass(), "toString", null);
        setField(term59650, term59650.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term59102, args);
        assertTrue(recursiveEquals(term59102, term59653));
        assertTrue(recursiveEquals(retValue, term59650));
    }

};


