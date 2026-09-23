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

public class Fraction_negate_115075760150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513;
     Object term3400;
     Object term3368;

    public Fraction_negate_115075760150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term513 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term513, term513.getClass(), "numerator", 679763016);
        setIntField(term513, term513.getClass(), "denominator", 1962444399);
        setField(term513, term513.getClass(), "toString", "RkybSrpybU");
        setField(term513, term513.getClass(), "toProperString", "xOEqzGAmDU");
        term3400 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term3400, term3400.getClass(), "numerator", 679763016);
        setIntField(term3400, term3400.getClass(), "denominator", 1962444399);
        setField(term3400, term3400.getClass(), "toString", "RkybSrpybU");
        setField(term3400, term3400.getClass(), "toProperString", "xOEqzGAmDU");
        term3368 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term3368, term3368.getClass(), "numerator", -679763016);
        setIntField(term3368, term3368.getClass(), "denominator", 1962444399);
        setField(term3368, term3368.getClass(), "toString", null);
        setField(term3368, term3368.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term513, args);
        assertTrue(recursiveEquals(term513, term3400));
        assertTrue(recursiveEquals(retValue, term3368));
    }

};


