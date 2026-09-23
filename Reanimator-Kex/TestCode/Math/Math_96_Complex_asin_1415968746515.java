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

public class Complex_asin_1415968746515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131254;
     Object term131681;
     Object term131678;

    public Complex_asin_1415968746515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131254 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term131254, term131254.getClass(), "real", -9.2143645627221279E18);
        setDoubleField(term131254, term131254.getClass(), "imaginary", -6.917493843268993E18);
        term131681 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term131681, term131681.getClass(), "imaginary", -6.917493843268993E18);
        setDoubleField(term131681, term131681.getClass(), "real", -9.2143645627221279E18);
        term131678 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term131678, term131678.getClass(), "imaginary", -44.583936169334805);
        setDoubleField(term131678, term131678.getClass(), "real", -0.9268286026386915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term131254, args);
        assertTrue(recursiveEquals(term131254, term131681));
        assertTrue(recursiveEquals(retValue, term131678));
    }

};


