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

public class Fraction_reduce_535859131997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319740;
     Object term320241;
     Object term320235;

    public Fraction_reduce_535859131997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319740 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term319740, term319740.getClass(), "numerator", 9404466);
        setIntField(term319740, term319740.getClass(), "denominator", 2136494193);
        term320241 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term320241, term320241.getClass(), "numerator", 9404466);
        setIntField(term320241, term320241.getClass(), "denominator", 2136494193);
        setField(term320241, term320241.getClass(), "toString", null);
        setField(term320241, term320241.getClass(), "toProperString", null);
        term320235 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term320235, term320235.getClass(), "numerator", 3134822);
        setIntField(term320235, term320235.getClass(), "denominator", 712164731);
        setField(term320235, term320235.getClass(), "toString", null);
        setField(term320235, term320235.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term319740, args);
        assertTrue(recursiveEquals(term319740, term320241));
        assertTrue(recursiveEquals(retValue, term320235));
    }

};


