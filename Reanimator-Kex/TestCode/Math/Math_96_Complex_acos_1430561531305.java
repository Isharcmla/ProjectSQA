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

public class Complex_acos_1430561531305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62895;
     Object term63327;
     Object term63324;

    public Complex_acos_1430561531305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62895 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term62895, term62895.getClass(), "real", -8.0704503948089754E18);
        setDoubleField(term62895, term62895.getClass(), "imaginary", 4.6116860205748716E18);
        term63327 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term63327, term63327.getClass(), "imaginary", 4.6116860205748716E18);
        setDoubleField(term63327, term63327.getClass(), "real", -8.0704503948089754E18);
        term63324 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term63324, term63324.getClass(), "imaginary", -44.36917163638118);
        setDoubleField(term63324, term63324.getClass(), "real", 2.6224465318067214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term62895, args);
        assertTrue(recursiveEquals(term62895, term63327));
        assertTrue(recursiveEquals(retValue, term63324));
    }

};


