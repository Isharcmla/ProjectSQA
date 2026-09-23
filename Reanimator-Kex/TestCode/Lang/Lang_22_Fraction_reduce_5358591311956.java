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

public class Fraction_reduce_5358591311956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638392;
     Object term638863;
     Object term638860;

    public Fraction_reduce_5358591311956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638392 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term638392, term638392.getClass(), "numerator", -503185394);
        setIntField(term638392, term638392.getClass(), "denominator", 1971346609);
        term638863 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term638863, term638863.getClass(), "numerator", -503185394);
        setIntField(term638863, term638863.getClass(), "denominator", 1971346609);
        setField(term638863, term638863.getClass(), "toString", null);
        setField(term638863, term638863.getClass(), "toProperString", null);
        term638860 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term638860, term638860.getClass(), "numerator", -503185394);
        setIntField(term638860, term638860.getClass(), "denominator", 1971346609);
        setField(term638860, term638860.getClass(), "toString", null);
        setField(term638860, term638860.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term638392, args);
        assertTrue(recursiveEquals(term638392, term638863));
        assertTrue(recursiveEquals(retValue, term638860));
    }

};


