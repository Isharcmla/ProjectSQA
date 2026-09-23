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

public class Complex_multiply_1787255358431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107156;
     Object term107240;
     Object term108034;
     Object term108035;
     Object term108031;

    public Complex_multiply_1787255358431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107156 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term107156, term107156.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term107156, term107156.getClass(), "imaginary", -9.2166166374137201E18);
        term107240 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term107240, term107240.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term107240, term107240.getClass(), "imaginary", 9.2188684372274053E18);
        term108034 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108034, term108034.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term108034, term108034.getClass(), "real", -9.2188684372274053E18);
        term108035 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108035, term108035.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term108035, term108035.getClass(), "real", -9.2166166374137201E18);
        term108031 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108031, term108031.getClass(), "imaginary", -4.1513021856274056E34);
        setDoubleField(term108031, term108031.getClass(), "real", 1.6993355243335665E38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term107240;
        Object retValue = callMethod(klass, "multiply", argTypes, term107156, args);
        assertTrue(recursiveEquals(term107156, term108034));
        assertTrue(recursiveEquals(term107240, term108035));
        assertTrue(recursiveEquals(retValue, term108031));
    }

};


