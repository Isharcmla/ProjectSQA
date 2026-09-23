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

public class Complex_acos_1430561531511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129858;
     Object term130074;
     Object term130071;

    public Complex_acos_1430561531511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129858 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term129858, term129858.getClass(), "real", -4.6116860184273879E18);
        setDoubleField(term129858, term129858.getClass(), "imaginary", 2.8823147566333952E17);
        term130074 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term130074, term130074.getClass(), "imaginary", 2.8823147566333952E17);
        setDoubleField(term130074, term130074.getClass(), "real", -4.6116860184273879E18);
        term130071 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term130071, term130071.getClass(), "imaginary", -43.67022171032759);
        setDoubleField(term130071, term130071.getClass(), "real", 3.079173606102959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term129858, args);
        assertTrue(recursiveEquals(term129858, term130074));
        assertTrue(recursiveEquals(retValue, term130071));
    }

};


