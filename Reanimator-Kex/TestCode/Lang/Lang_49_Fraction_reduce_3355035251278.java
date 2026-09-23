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

public class Fraction_reduce_3355035251278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373951;
     Object term374395;
     Object term374392;

    public Fraction_reduce_3355035251278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373951 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term373951, term373951.getClass(), "numerator", 663490);
        setIntField(term373951, term373951.getClass(), "denominator", 2146722073);
        term374395 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term374395, term374395.getClass(), "numerator", 663490);
        setIntField(term374395, term374395.getClass(), "denominator", 2146722073);
        setField(term374395, term374395.getClass(), "toString", null);
        setField(term374395, term374395.getClass(), "toProperString", null);
        term374392 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term374392, term374392.getClass(), "numerator", 663490);
        setIntField(term374392, term374392.getClass(), "denominator", 2146722073);
        setField(term374392, term374392.getClass(), "toString", null);
        setField(term374392, term374392.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term373951, args);
        assertTrue(recursiveEquals(term373951, term374395));
        assertTrue(recursiveEquals(retValue, term374392));
    }

};


