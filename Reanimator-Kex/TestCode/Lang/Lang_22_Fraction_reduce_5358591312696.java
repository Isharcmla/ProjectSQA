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

public class Fraction_reduce_5358591312696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term883457;
     Object term884288;
     Object term884285;

    public Fraction_reduce_5358591312696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term883457 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term883457, term883457.getClass(), "numerator", 170967682);
        setIntField(term883457, term883457.getClass(), "denominator", 1052776649);
        term884288 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term884288, term884288.getClass(), "numerator", 170967682);
        setIntField(term884288, term884288.getClass(), "denominator", 1052776649);
        setField(term884288, term884288.getClass(), "toString", null);
        setField(term884288, term884288.getClass(), "toProperString", null);
        term884285 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term884285, term884285.getClass(), "numerator", 170967682);
        setIntField(term884285, term884285.getClass(), "denominator", 1052776649);
        setField(term884285, term884285.getClass(), "toString", null);
        setField(term884285, term884285.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term883457, args);
        assertTrue(recursiveEquals(term883457, term884288));
        assertTrue(recursiveEquals(retValue, term884285));
    }

};


