package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MathArrays_isMonotonic_120394919697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29368;
     Object enum15;

    public MathArrays_isMonotonic_120394919697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30200 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term30199 = ((Class) term30200).getDeclaredField((String) "INCREASING");
        ((Field) term30199).setAccessible(true);
        Object enum14 = ((Field) term30199).get((Object) null);
        term29368 = (Object[]) newArray("java.lang.Comparable", 2);
        setElement(term29368, 0, enum14);
        Class<? extends Object> term30512 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term30511 = ((Class) term30512).getDeclaredField((String) "DECREASING");
        ((Field) term30511).setAccessible(true);
        enum15 = ((Field) term30511).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math3.util.MathArrays$OrderDirection");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term29368;
        args[1] = enum15;
        args[2] = false;
        callMethod(klass, "isMonotonic", argTypes, null, args);
    }

};


