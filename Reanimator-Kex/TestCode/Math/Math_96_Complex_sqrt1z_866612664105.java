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

public class Complex_sqrt1z_866612664105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11326;
     Object term11423;
     Object term11420;

    public Complex_sqrt1z_866612664105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11326 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11326, term11326.getClass(), "real", 5.7646075243764122E17);
        setDoubleField(term11326, term11326.getClass(), "imaginary", 5.7646075230343168E17);
        term11423 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11423, term11423.getClass(), "imaginary", 5.7646075230343168E17);
        setDoubleField(term11423, term11423.getClass(), "real", 5.7646075243764122E17);
        term11420 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11420, term11420.getClass(), "imaginary", -5.7646075243764122E17);
        setDoubleField(term11420, term11420.getClass(), "real", 5.7646075230343168E17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term11326, args);
        assertTrue(recursiveEquals(term11326, term11423));
        assertTrue(recursiveEquals(retValue, term11420));
    }

};


