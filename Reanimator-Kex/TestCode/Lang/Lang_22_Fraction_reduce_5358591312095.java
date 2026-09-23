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

public class Fraction_reduce_5358591312095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682703;
     Object term682802;
     Object term682799;

    public Fraction_reduce_5358591312095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term682703 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term682703, term682703.getClass(), "numerator", -400578606);
        setIntField(term682703, term682703.getClass(), "denominator", 1783551791);
        term682802 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term682802, term682802.getClass(), "numerator", -400578606);
        setIntField(term682802, term682802.getClass(), "denominator", 1783551791);
        setField(term682802, term682802.getClass(), "toString", null);
        setField(term682802, term682802.getClass(), "toProperString", null);
        term682799 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term682799, term682799.getClass(), "numerator", -400578606);
        setIntField(term682799, term682799.getClass(), "denominator", 1783551791);
        setField(term682799, term682799.getClass(), "toString", null);
        setField(term682799, term682799.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term682703, args);
        assertTrue(recursiveEquals(term682703, term682802));
        assertTrue(recursiveEquals(retValue, term682799));
    }

};


