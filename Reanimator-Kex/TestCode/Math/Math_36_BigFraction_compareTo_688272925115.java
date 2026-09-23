package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigFraction_compareTo_688272925115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11804;
     Object term11944;

    public BigFraction_compareTo_688272925115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11804 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term11850 = newInstance(Class.forName("java.math.BigInteger"));
        setField(term11804, term11804.getClass(), "numerator", term11850);
        setField(term11804, term11804.getClass(), "denominator", term11850);
        term11944 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term11990 = newInstance(Class.forName("java.math.BigInteger"));
        Object term12036 = newInstance(Class.forName("java.math.BigInteger"));
        setField(term11944, term11944.getClass(), "denominator", term11990);
        setField(term11944, term11944.getClass(), "numerator", term12036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Object[] args = new Object[1];
        args[0] = term11944;
        callMethod(klass, "compareTo", argTypes, term11804, args);
    }

};


