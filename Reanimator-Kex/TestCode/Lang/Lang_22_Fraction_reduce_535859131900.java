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

public class Fraction_reduce_535859131900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287035;
     Object term287543;
     Object term287540;

    public Fraction_reduce_535859131900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287035 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term287035, term287035.getClass(), "numerator", -31657926);
        setIntField(term287035, term287035.getClass(), "denominator", 780382267);
        term287543 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term287543, term287543.getClass(), "numerator", -31657926);
        setIntField(term287543, term287543.getClass(), "denominator", 780382267);
        setField(term287543, term287543.getClass(), "toString", null);
        setField(term287543, term287543.getClass(), "toProperString", null);
        term287540 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term287540, term287540.getClass(), "numerator", -31657926);
        setIntField(term287540, term287540.getClass(), "denominator", 780382267);
        setField(term287540, term287540.getClass(), "toString", null);
        setField(term287540, term287540.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term287035, args);
        assertTrue(recursiveEquals(term287035, term287543));
        assertTrue(recursiveEquals(retValue, term287540));
    }

};


