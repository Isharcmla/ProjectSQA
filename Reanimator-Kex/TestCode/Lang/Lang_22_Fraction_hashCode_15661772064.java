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

public class Fraction_hashCode_15661772064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1196;
     Object term6881;

    public Fraction_hashCode_15661772064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1196 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term1196, term1196.getClass(), "numerator", -505439934);
        setIntField(term1196, term1196.getClass(), "denominator", -344842608);
        setField(term1196, term1196.getClass(), "toString", "jDtqGUpnZN");
        setField(term1196, term1196.getClass(), "toProperString", "nGKItKLYNC");
        term6881 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term6881, term6881.getClass(), "numerator", -505439934);
        setIntField(term6881, term6881.getClass(), "denominator", -344842608);
        setField(term6881, term6881.getClass(), "toString", "jDtqGUpnZN");
        setField(term6881, term6881.getClass(), "toProperString", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term1196, args);
        assertTrue(recursiveEquals(term1196, term6881));
        assertTrue(recursiveEquals(retValue, -1866227709));
    }

};


