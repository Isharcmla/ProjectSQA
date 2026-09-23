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

public class Complex_pow_629025138529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135694;
     Object term135778;
     Object term135856;
     Object term135857;
     Object term135853;

    public Complex_pow_629025138529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135694 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135694, term135694.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term135694, term135694.getClass(), "imaginary", -9.2233720368546447E18);
        term135778 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135778, term135778.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term135778, term135778.getClass(), "imaginary", 9.2188684372274053E18);
        term135856 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135856, term135856.getClass(), "imaginary", -9.2233720368546447E18);
        setDoubleField(term135856, term135856.getClass(), "real", -9.2188684372274053E18);
        term135857 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135857, term135857.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term135857, term135857.getClass(), "real", -9.2166166374137201E18);
        term135853 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135853, term135853.getClass(), "imaginary", -0.0);
        setDoubleField(term135853, term135853.getClass(), "real", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term135778;
        Object retValue = callMethod(klass, "pow", argTypes, term135694, args);
        assertTrue(recursiveEquals(term135694, term135856));
        assertTrue(recursiveEquals(term135778, term135857));
        assertTrue(recursiveEquals(retValue, term135853));
    }

};


