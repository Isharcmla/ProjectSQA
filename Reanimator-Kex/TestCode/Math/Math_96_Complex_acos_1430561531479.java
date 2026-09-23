package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_acos_1430561531479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120347;
     Object term120563;
     Object term120560;

    public Complex_acos_1430561531479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120347 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term120347, term120347.getClass(), "real", -9.2143648376000328E18);
        setDoubleField(term120347, term120347.getClass(), "imaginary", 5.7646075230342349E17);
        term120563 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term120563, term120563.getClass(), "imaginary", 5.7646075230342349E17);
        setDoubleField(term120563, term120563.getClass(), "real", -9.2143648376000328E18);
        term120560 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term120560, term120560.getClass(), "imaginary", -44.362395641809556);
        setDoubleField(term120560, term120560.getClass(), "real", 3.079112986729257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term120347, args);
        assertTrue(recursiveEquals(term120347, term120563));
        assertTrue(recursiveEquals(retValue, term120560));
    }

};


