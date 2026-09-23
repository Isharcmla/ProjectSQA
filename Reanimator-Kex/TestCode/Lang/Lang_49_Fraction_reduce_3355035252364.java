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

public class Fraction_reduce_3355035252364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700056;
     Object term700389;
     Object term700386;

    public Fraction_reduce_3355035252364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700056 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term700056, term700056.getClass(), "numerator", 340286162);
        setIntField(term700056, term700056.getClass(), "denominator", 1109590145);
        term700389 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term700389, term700389.getClass(), "numerator", 340286162);
        setIntField(term700389, term700389.getClass(), "denominator", 1109590145);
        setField(term700389, term700389.getClass(), "toString", null);
        setField(term700389, term700389.getClass(), "toProperString", null);
        term700386 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term700386, term700386.getClass(), "numerator", 340286162);
        setIntField(term700386, term700386.getClass(), "denominator", 1109590145);
        setField(term700386, term700386.getClass(), "toString", null);
        setField(term700386, term700386.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term700056, args);
        assertTrue(recursiveEquals(term700056, term700389));
        assertTrue(recursiveEquals(retValue, term700386));
    }

};


