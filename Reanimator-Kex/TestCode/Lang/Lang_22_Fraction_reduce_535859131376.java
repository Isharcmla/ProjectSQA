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

public class Fraction_reduce_535859131376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107859;
     Object term108290;
     Object term108287;

    public Fraction_reduce_535859131376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107859 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term107859, term107859.getClass(), "numerator", -469336190);
        setIntField(term107859, term107859.getClass(), "denominator", 1092506599);
        term108290 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term108290, term108290.getClass(), "numerator", -469336190);
        setIntField(term108290, term108290.getClass(), "denominator", 1092506599);
        setField(term108290, term108290.getClass(), "toString", null);
        setField(term108290, term108290.getClass(), "toProperString", null);
        term108287 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term108287, term108287.getClass(), "numerator", -469336190);
        setIntField(term108287, term108287.getClass(), "denominator", 1092506599);
        setField(term108287, term108287.getClass(), "toString", null);
        setField(term108287, term108287.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term107859, args);
        assertTrue(recursiveEquals(term107859, term108290));
        assertTrue(recursiveEquals(retValue, term108287));
    }

};


