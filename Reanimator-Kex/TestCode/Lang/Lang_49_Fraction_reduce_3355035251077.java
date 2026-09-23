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

public class Fraction_reduce_3355035251077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311194;
     Object term311389;
     Object term311383;

    public Fraction_reduce_3355035251077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311194 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term311194, term311194.getClass(), "numerator", 405156178);
        setIntField(term311194, term311194.getClass(), "denominator", 197842849);
        term311389 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term311389, term311389.getClass(), "numerator", 405156178);
        setIntField(term311389, term311389.getClass(), "denominator", 197842849);
        setField(term311389, term311389.getClass(), "toString", null);
        setField(term311389, term311389.getClass(), "toProperString", null);
        term311383 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term311383, term311383.getClass(), "numerator", 17615486);
        setIntField(term311383, term311383.getClass(), "denominator", 8601863);
        setField(term311383, term311383.getClass(), "toString", null);
        setField(term311383, term311383.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term311194, args);
        assertTrue(recursiveEquals(term311194, term311389));
        assertTrue(recursiveEquals(retValue, term311383));
    }

};


