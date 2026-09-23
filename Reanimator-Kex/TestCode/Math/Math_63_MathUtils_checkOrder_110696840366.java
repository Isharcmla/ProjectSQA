package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class MathUtils_checkOrder_110696840366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399;
     Object enum0;
     Object term422;

    public MathUtils_checkOrder_110696840366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399 = (double[]) newDoubleArray(8);
        setDoubleElement(term399, 0, 0.426231085465289);
        setDoubleElement(term399, 1, 0.0027299293098262956);
        setDoubleElement(term399, 2, 0.29874017652881824);
        setDoubleElement(term399, 3, 0.32554480512985284);
        setDoubleElement(term399, 4, 0.8924855581421237);
        setDoubleElement(term399, 5, 0.32237559209193944);
        setDoubleElement(term399, 6, 0.53094494792755);
        setDoubleElement(term399, 7, 0.146431486357265);
        Class<? extends Object> term461 = Class.forName((String) "org.apache.commons.math.util.MathUtils$OrderDirection");
        Field term460 = ((Class) term461).getDeclaredField((String) "INCREASING");
        ((Field) term460).setAccessible(true);
        enum0 = ((Field) term460).get((Object) null);
        term422 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math.util.MathUtils$OrderDirection");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term399;
        args[1] = enum0;
        args[2] = term422;
        callMethod(klass, "checkOrder", argTypes, null, args);
    }

};


