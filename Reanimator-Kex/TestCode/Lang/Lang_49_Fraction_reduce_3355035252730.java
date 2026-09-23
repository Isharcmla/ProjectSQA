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

public class Fraction_reduce_3355035252730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813431;
     Object term814223;
     Object term814217;

    public Fraction_reduce_3355035252730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term813431 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term813431, term813431.getClass(), "numerator", -17563650);
        setIntField(term813431, term813431.getClass(), "denominator", 8257533);
        term814223 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term814223, term814223.getClass(), "numerator", -17563650);
        setIntField(term814223, term814223.getClass(), "denominator", 8257533);
        setField(term814223, term814223.getClass(), "toString", null);
        setField(term814223, term814223.getClass(), "toProperString", null);
        term814217 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term814217, term814217.getClass(), "numerator", -5854550);
        setIntField(term814217, term814217.getClass(), "denominator", 2752511);
        setField(term814217, term814217.getClass(), "toString", null);
        setField(term814217, term814217.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term813431, args);
        assertTrue(recursiveEquals(term813431, term814223));
        assertTrue(recursiveEquals(retValue, term814217));
    }

};


