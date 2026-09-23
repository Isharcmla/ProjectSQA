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

public class Complex_asin_1415968746281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54753;
     Object term54964;
     Object term54961;

    public Complex_asin_1415968746281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54753 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term54753, term54753.getClass(), "real", 3.6028797086072832E16);
        setDoubleField(term54753, term54753.getClass(), "imaginary", -8.0704505322479288E18);
        term54964 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term54964, term54964.getClass(), "imaginary", -8.0704505322479288E18);
        setDoubleField(term54964, term54964.getClass(), "real", 3.6028797086072832E16);
        term54961 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term54961, term54961.getClass(), "imaginary", -44.22789812803619);
        setDoubleField(term54961, term54961.getClass(), "real", 0.00446425606544524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term54753, args);
        assertTrue(recursiveEquals(term54753, term54964));
        assertTrue(recursiveEquals(retValue, term54961));
    }

};


