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

public class Fraction_reduce_33550352596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15596;
     Object term15783;
     Object term15780;

    public Fraction_reduce_33550352596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15596 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term15596, term15596.getClass(), "numerator", -2147483648);
        setIntField(term15596, term15596.getClass(), "denominator", 0);
        term15783 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term15783, term15783.getClass(), "numerator", -2147483648);
        setIntField(term15783, term15783.getClass(), "denominator", 0);
        setField(term15783, term15783.getClass(), "toString", null);
        setField(term15783, term15783.getClass(), "toProperString", null);
        term15780 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term15780, term15780.getClass(), "numerator", -2147483648);
        setIntField(term15780, term15780.getClass(), "denominator", 0);
        setField(term15780, term15780.getClass(), "toString", null);
        setField(term15780, term15780.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term15596, args);
        assertTrue(recursiveEquals(term15596, term15783));
        assertTrue(recursiveEquals(retValue, term15780));
    }

};


