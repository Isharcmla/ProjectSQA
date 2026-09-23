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

public class Fraction_negate_202212025750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513;
     Object term3368;
     Object term3321;

    public Fraction_negate_202212025750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term513 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term513, term513.getClass(), "numerator", 679763016);
        setIntField(term513, term513.getClass(), "denominator", 1962444399);
        setField(term513, term513.getClass(), "toString", "RkybSrpybU");
        setField(term513, term513.getClass(), "toProperString", "xOEqzGAmDU");
        term3368 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term3368, term3368.getClass(), "numerator", 679763016);
        setIntField(term3368, term3368.getClass(), "denominator", 1962444399);
        setField(term3368, term3368.getClass(), "toString", "RkybSrpybU");
        setField(term3368, term3368.getClass(), "toProperString", "xOEqzGAmDU");
        term3321 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term3321, term3321.getClass(), "numerator", -679763016);
        setIntField(term3321, term3321.getClass(), "denominator", 1962444399);
        setField(term3321, term3321.getClass(), "toString", null);
        setField(term3321, term3321.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term513, args);
        assertTrue(recursiveEquals(term513, term3368));
        assertTrue(recursiveEquals(retValue, term3321));
    }

};


