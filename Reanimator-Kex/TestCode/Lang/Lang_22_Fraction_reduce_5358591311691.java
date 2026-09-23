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

public class Fraction_reduce_5358591311691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548700;
     Object term549197;
     Object term549194;

    public Fraction_reduce_5358591311691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548700 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term548700, term548700.getClass(), "numerator", -1811938990);
        setIntField(term548700, term548700.getClass(), "denominator", 1133903887);
        term549197 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term549197, term549197.getClass(), "numerator", -1811938990);
        setIntField(term549197, term549197.getClass(), "denominator", 1133903887);
        setField(term549197, term549197.getClass(), "toString", null);
        setField(term549197, term549197.getClass(), "toProperString", null);
        term549194 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term549194, term549194.getClass(), "numerator", -1811938990);
        setIntField(term549194, term549194.getClass(), "denominator", 1133903887);
        setField(term549194, term549194.getClass(), "toString", null);
        setField(term549194, term549194.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term548700, args);
        assertTrue(recursiveEquals(term548700, term549197));
        assertTrue(recursiveEquals(retValue, term549194));
    }

};


