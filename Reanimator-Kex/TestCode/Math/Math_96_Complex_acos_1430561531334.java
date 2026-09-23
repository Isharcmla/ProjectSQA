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

public class Complex_acos_1430561531334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72956;
     Object term73778;
     Object term73775;

    public Complex_acos_1430561531334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72956 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term72956, term72956.getClass(), "real", -6.9175288902021284E18);
        setDoubleField(term72956, term72956.getClass(), "imaginary", 5.7646075230342349E17);
        term73778 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term73778, term73778.getClass(), "imaginary", 5.7646075230342349E17);
        setDoubleField(term73778, term73778.getClass(), "real", -6.9175288902021284E18);
        term73775 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term73775, term73775.getClass(), "imaginary", -44.07719768507581);
        setDoubleField(term73775, term73775.getClass(), "real", 3.058451420057086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term72956, args);
        assertTrue(recursiveEquals(term72956, term73778));
        assertTrue(recursiveEquals(retValue, term73775));
    }

};


