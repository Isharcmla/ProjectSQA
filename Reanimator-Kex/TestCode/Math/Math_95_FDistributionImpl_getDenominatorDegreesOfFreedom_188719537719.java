package org.apache.commons.math.distribution;

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
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.distribution.EqualityUtils.*;

public class FDistributionImpl_getDenominatorDegreesOfFreedom_188719537719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term1015;

    public FDistributionImpl_getDenominatorDegreesOfFreedom_188719537719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term43, term43.getClass(), "numeratorDegreesOfFreedom", 0.3800088629986428);
        setDoubleField(term43, term43.getClass(), "denominatorDegreesOfFreedom", 0.5840714198152577);
        term1015 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term1015, term1015.getClass(), "numeratorDegreesOfFreedom", 0.3800088629986428);
        setDoubleField(term1015, term1015.getClass(), "denominatorDegreesOfFreedom", 0.5840714198152577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.FDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominatorDegreesOfFreedom", argTypes, term43, args);
        assertTrue(recursiveEquals(term43, term1015));
        assertTrue(recursiveEquals(retValue, 0.5840714198152577));
    }

};


