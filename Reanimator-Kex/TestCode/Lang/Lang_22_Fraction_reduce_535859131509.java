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

public class Fraction_reduce_535859131509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155255;
     Object term155863;
     Object term155860;

    public Fraction_reduce_535859131509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155255 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term155255, term155255.getClass(), "numerator", 17564290);
        setIntField(term155255, term155255.getClass(), "denominator", 1830265913);
        term155863 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term155863, term155863.getClass(), "numerator", 17564290);
        setIntField(term155863, term155863.getClass(), "denominator", 1830265913);
        setField(term155863, term155863.getClass(), "toString", null);
        setField(term155863, term155863.getClass(), "toProperString", null);
        term155860 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term155860, term155860.getClass(), "numerator", 17564290);
        setIntField(term155860, term155860.getClass(), "denominator", 1830265913);
        setField(term155860, term155860.getClass(), "toString", null);
        setField(term155860, term155860.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term155255, args);
        assertTrue(recursiveEquals(term155255, term155863));
        assertTrue(recursiveEquals(retValue, term155860));
    }

};


