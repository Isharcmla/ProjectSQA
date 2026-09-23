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

public class Fraction_reduce_5358591312315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term756212;
     Object term756712;
     Object term756709;

    public Fraction_reduce_5358591312315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term756212 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term756212, term756212.getClass(), "numerator", -790396738);
        setIntField(term756212, term756212.getClass(), "denominator", 706938953);
        term756712 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term756712, term756712.getClass(), "numerator", -790396738);
        setIntField(term756712, term756712.getClass(), "denominator", 706938953);
        setField(term756712, term756712.getClass(), "toString", null);
        setField(term756712, term756712.getClass(), "toProperString", null);
        term756709 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term756709, term756709.getClass(), "numerator", -790396738);
        setIntField(term756709, term756709.getClass(), "denominator", 706938953);
        setField(term756709, term756709.getClass(), "toString", null);
        setField(term756709, term756709.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term756212, args);
        assertTrue(recursiveEquals(term756212, term756712));
        assertTrue(recursiveEquals(retValue, term756709));
    }

};


