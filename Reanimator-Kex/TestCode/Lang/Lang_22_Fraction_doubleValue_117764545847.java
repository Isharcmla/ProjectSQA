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

public class Fraction_doubleValue_117764545847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372;
     Object term3052;

    public Fraction_doubleValue_117764545847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term372 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term372, term372.getClass(), "numerator", -203030934);
        setIntField(term372, term372.getClass(), "denominator", -1179120542);
        setField(term372, term372.getClass(), "toString", "aJlieCFVtF");
        setField(term372, term372.getClass(), "toProperString", "ZiaGIbnzTs");
        term3052 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term3052, term3052.getClass(), "numerator", -203030934);
        setIntField(term3052, term3052.getClass(), "denominator", -1179120542);
        setField(term3052, term3052.getClass(), "toString", "aJlieCFVtF");
        setField(term3052, term3052.getClass(), "toProperString", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "doubleValue", argTypes, term372, args);
        assertTrue(recursiveEquals(term372, term3052));
        assertTrue(recursiveEquals(retValue, 0.17218844619195856));
    }

};


