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

public class Fraction_reduce_5358591312632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term860794;
     Object term861532;
     Object term861529;

    public Fraction_reduce_5358591312632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term860794 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term860794, term860794.getClass(), "numerator", -922680422);
        setIntField(term860794, term860794.getClass(), "denominator", 763373227);
        term861532 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term861532, term861532.getClass(), "numerator", -922680422);
        setIntField(term861532, term861532.getClass(), "denominator", 763373227);
        setField(term861532, term861532.getClass(), "toString", null);
        setField(term861532, term861532.getClass(), "toProperString", null);
        term861529 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term861529, term861529.getClass(), "numerator", -922680422);
        setIntField(term861529, term861529.getClass(), "denominator", 763373227);
        setField(term861529, term861529.getClass(), "toString", null);
        setField(term861529, term861529.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term860794, args);
        assertTrue(recursiveEquals(term860794, term861532));
        assertTrue(recursiveEquals(retValue, term861529));
    }

};


