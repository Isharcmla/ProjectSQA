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

public class Fraction_add_14549770212317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685865;
     Object term685945;
     Object term686668;
     Object term686669;
     Object term686665;

    public Fraction_add_14549770212317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term685865 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term685865, term685865.getClass(), "numerator", 262144);
        setIntField(term685865, term685865.getClass(), "denominator", 452380);
        term685945 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term685945, term685945.getClass(), "numerator", 32768);
        setIntField(term685945, term685945.getClass(), "denominator", -532610);
        term686668 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term686668, term686668.getClass(), "numerator", 262144);
        setIntField(term686668, term686668.getClass(), "denominator", 452380);
        setField(term686668, term686668.getClass(), "toString", null);
        setField(term686668, term686668.getClass(), "toProperString", null);
        term686669 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term686669, term686669.getClass(), "numerator", 32768);
        setIntField(term686669, term686669.getClass(), "denominator", -532610);
        setField(term686669, term686669.getClass(), "toString", null);
        setField(term686669, term686669.getClass(), "toProperString", null);
        term686665 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term686665, term686665.getClass(), "numerator", -1247969280);
        setIntField(term686665, term686665.getClass(), "denominator", 1885546178);
        setField(term686665, term686665.getClass(), "toString", null);
        setField(term686665, term686665.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term685945;
        Object retValue = callMethod(klass, "add", argTypes, term685865, args);
        assertTrue(recursiveEquals(term685865, term686668));
        assertTrue(recursiveEquals(term685945, term686669));
        assertTrue(recursiveEquals(retValue, term686665));
    }

};


