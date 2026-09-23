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

public class Complex_acos_1430561531124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15235;
     Object term15812;
     Object term15809;

    public Complex_acos_1430561531124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15235 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term15235, term15235.getClass(), "real", 1.44115188080050176E17);
        setDoubleField(term15235, term15235.getClass(), "imaginary", 4.504699138998272E15);
        term15812 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term15812, term15812.getClass(), "imaginary", 4.504699138998272E15);
        setDoubleField(term15812, term15812.getClass(), "real", 1.44115188080050176E17);
        term15809 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term15809, term15809.getClass(), "imaginary", -40.203024753707425);
        setDoubleField(term15809, term15809.getClass(), "real", 0.03124745537876337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term15235, args);
        assertTrue(recursiveEquals(term15235, term15812));
        assertTrue(recursiveEquals(retValue, term15809));
    }

};


