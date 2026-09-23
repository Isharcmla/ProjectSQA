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

public class Fraction_intValue_204951801244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;
     Object term2787;

    public Fraction_intValue_204951801244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term231, term231.getClass(), "numerator", -6029667);
        setIntField(term231, term231.getClass(), "denominator", -2068769794);
        setField(term231, term231.getClass(), "toString", "RMFIsYGgne");
        setField(term231, term231.getClass(), "toProperString", "NRdvgJlhkX");
        term2787 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term2787, term2787.getClass(), "numerator", -6029667);
        setIntField(term2787, term2787.getClass(), "denominator", -2068769794);
        setField(term2787, term2787.getClass(), "toString", "RMFIsYGgne");
        setField(term2787, term2787.getClass(), "toProperString", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "intValue", argTypes, term231, args);
        assertTrue(recursiveEquals(term231, term2787));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


