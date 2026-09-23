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

public class Fraction_reduce_5358591311000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320424;
     Object term321232;
     Object term321229;

    public Fraction_reduce_5358591311000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320424 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term320424, term320424.getClass(), "numerator", -1070580790);
        setIntField(term320424, term320424.getClass(), "denominator", 1666235539);
        term321232 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term321232, term321232.getClass(), "numerator", -1070580790);
        setIntField(term321232, term321232.getClass(), "denominator", 1666235539);
        setField(term321232, term321232.getClass(), "toString", null);
        setField(term321232, term321232.getClass(), "toProperString", null);
        term321229 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term321229, term321229.getClass(), "numerator", -1070580790);
        setIntField(term321229, term321229.getClass(), "denominator", 1666235539);
        setField(term321229, term321229.getClass(), "toString", null);
        setField(term321229, term321229.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term320424, args);
        assertTrue(recursiveEquals(term320424, term321232));
        assertTrue(recursiveEquals(retValue, term321229));
    }

};


