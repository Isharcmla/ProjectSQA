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

public class Complex_acos_1430561531383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91458;
     Object term91674;
     Object term91671;

    public Complex_acos_1430561531383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91458 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term91458, term91458.getClass(), "real", 1.80143993684754432E17);
        setDoubleField(term91458, term91458.getClass(), "imaginary", 1.4636698788954112E17);
        term91674 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term91674, term91674.getClass(), "imaginary", 1.4636698788954112E17);
        setDoubleField(term91674, term91674.getClass(), "real", 1.80143993684754432E17);
        term91671 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term91671, term91671.getClass(), "imaginary", -40.679135914735895);
        setDoubleField(term91671, term91671.getClass(), "real", 0.6823165315377773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term91458, args);
        assertTrue(recursiveEquals(term91458, term91674));
        assertTrue(recursiveEquals(retValue, term91671));
    }

};


