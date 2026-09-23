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

public class Fraction_toProperString_609435397197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46767;
     Object term46779;

    public Fraction_toProperString_609435397197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46767 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setField(term46767, term46767.getClass(), "toProperString", null);
        term46779 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term46779, term46779.getClass(), "numerator", 0);
        setIntField(term46779, term46779.getClass(), "denominator", 0);
        setField(term46779, term46779.getClass(), "toString", null);
        setField(term46779, term46779.getClass(), "toProperString", "0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toProperString", argTypes, term46767, args);
        assertTrue(recursiveEquals(term46767, term46779));
        assertTrue(recursiveEquals(retValue, "0"));
    }

};


