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

public class Fraction_reduce_3355035251942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570070;
     Object term570672;
     Object term570669;

    public Fraction_reduce_3355035251942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570070 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term570070, term570070.getClass(), "numerator", -143936990);
        setIntField(term570070, term570070.getClass(), "denominator", 845749559);
        term570672 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term570672, term570672.getClass(), "numerator", -143936990);
        setIntField(term570672, term570672.getClass(), "denominator", 845749559);
        setField(term570672, term570672.getClass(), "toString", null);
        setField(term570672, term570672.getClass(), "toProperString", null);
        term570669 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term570669, term570669.getClass(), "numerator", -143936990);
        setIntField(term570669, term570669.getClass(), "denominator", 845749559);
        setField(term570669, term570669.getClass(), "toString", null);
        setField(term570669, term570669.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term570070, args);
        assertTrue(recursiveEquals(term570070, term570672));
        assertTrue(recursiveEquals(retValue, term570669));
    }

};


