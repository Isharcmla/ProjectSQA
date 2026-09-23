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

public class Complex_multiply_1787255358432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107754;
     Object term107838;
     Object term108062;
     Object term108063;
     Object term108059;

    public Complex_multiply_1787255358432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107754 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term107754, term107754.getClass(), "real", -9.2188684372274043E18);
        setDoubleField(term107754, term107754.getClass(), "imaginary", -9.2166166374137201E18);
        term107838 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term107838, term107838.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term107838, term107838.getClass(), "imaginary", -9.2166166374137201E18);
        term108062 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108062, term108062.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term108062, term108062.getClass(), "real", -9.2188684372274043E18);
        term108063 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108063, term108063.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term108063, term108063.getClass(), "real", 9.2188684372274053E18);
        term108059 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108059, term108059.getClass(), "imaginary", -9.44473296573929E21);
        setDoubleField(term108059, term108059.getClass(), "real", -1.6993355750395905E38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term107838;
        Object retValue = callMethod(klass, "multiply", argTypes, term107754, args);
        assertTrue(recursiveEquals(term107754, term108062));
        assertTrue(recursiveEquals(term107838, term108063));
        assertTrue(recursiveEquals(retValue, term108059));
    }

};


