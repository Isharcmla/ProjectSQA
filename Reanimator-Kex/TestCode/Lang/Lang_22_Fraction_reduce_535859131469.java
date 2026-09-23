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

public class Fraction_reduce_535859131469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140808;
     Object term141645;
     Object term141642;

    public Fraction_reduce_535859131469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140808 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term140808, term140808.getClass(), "numerator", -2077869994);
        setIntField(term140808, term140808.getClass(), "denominator", 1307239341);
        term141645 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term141645, term141645.getClass(), "numerator", -2077869994);
        setIntField(term141645, term141645.getClass(), "denominator", 1307239341);
        setField(term141645, term141645.getClass(), "toString", null);
        setField(term141645, term141645.getClass(), "toProperString", null);
        term141642 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term141642, term141642.getClass(), "numerator", -2077869994);
        setIntField(term141642, term141642.getClass(), "denominator", 1307239341);
        setField(term141642, term141642.getClass(), "toString", null);
        setField(term141642, term141642.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term140808, args);
        assertTrue(recursiveEquals(term140808, term141645));
        assertTrue(recursiveEquals(retValue, term141642));
    }

};


