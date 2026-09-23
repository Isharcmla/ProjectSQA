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

public class Fraction_reduce_3355035251683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494856;
     Object term494962;
     Object term494959;

    public Fraction_reduce_3355035251683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494856 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term494856, term494856.getClass(), "numerator", 743319298);
        setIntField(term494856, term494856.getClass(), "denominator", 1167395033);
        term494962 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term494962, term494962.getClass(), "numerator", 743319298);
        setIntField(term494962, term494962.getClass(), "denominator", 1167395033);
        setField(term494962, term494962.getClass(), "toString", null);
        setField(term494962, term494962.getClass(), "toProperString", null);
        term494959 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term494959, term494959.getClass(), "numerator", 743319298);
        setIntField(term494959, term494959.getClass(), "denominator", 1167395033);
        setField(term494959, term494959.getClass(), "toString", null);
        setField(term494959, term494959.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term494856, args);
        assertTrue(recursiveEquals(term494856, term494962));
        assertTrue(recursiveEquals(retValue, term494959));
    }

};


