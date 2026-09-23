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

public class Complex_acos_1430561531421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105337;
     Object term105756;
     Object term105753;

    public Complex_acos_1430561531421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105337 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term105337, term105337.getClass(), "real", 5.066549580791808E15);
        setDoubleField(term105337, term105337.getClass(), "imaginary", 4.0);
        term105756 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term105756, term105756.getClass(), "imaginary", 4.0);
        setDoubleField(term105756, term105756.getClass(), "real", 5.066549580791808E15);
        term105753 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term105753, term105753.getClass(), "imaginary", -36.85458360533349);
        setDoubleField(term105753, term105753.getClass(), "real", 7.894919286223335E-16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term105337, args);
        assertTrue(recursiveEquals(term105337, term105756));
        assertTrue(recursiveEquals(retValue, term105753));
    }

};


