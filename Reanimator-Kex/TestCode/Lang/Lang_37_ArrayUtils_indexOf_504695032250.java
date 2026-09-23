package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Double;
import java.lang.Integer;

public class ArrayUtils_indexOf_504695032250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term858;
     Object term865;
     Object term867;
     Object term869;
     Object term13391;

    public ArrayUtils_indexOf_504695032250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term858 = (double[]) newDoubleArray(6);
        setDoubleElement(term858, 0, 0.6805867182029153);
        setDoubleElement(term858, 1, 0.2852810965221698);
        setDoubleElement(term858, 2, 0.6300849762307866);
        setDoubleElement(term858, 3, 0.9737083944266686);
        setDoubleElement(term858, 4, 0.0668892744806211);
        setDoubleElement(term858, 5, 0.3587267442738795);
        term865 = new Double(0.07802449704920456);
        term867 = new Integer(-2027534003);
        term869 = new Double(0.5279279537140873);
        term13391 = (double[]) newDoubleArray(6);
        setDoubleElement(term13391, 0, 0.6805867182029153);
        setDoubleElement(term13391, 1, 0.2852810965221698);
        setDoubleElement(term13391, 2, 0.6300849762307866);
        setDoubleElement(term13391, 3, 0.9737083944266686);
        setDoubleElement(term13391, 4, 0.0668892744806211);
        setDoubleElement(term13391, 5, 0.3587267442738795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term858;
        args[1] = term865;
        args[2] = term867;
        args[3] = term869;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term858, term13391));
        assertTrue(recursiveEquals(term865, 0.07802449704920456));
        assertTrue(recursiveEquals(term867, -2027534003));
        assertTrue(recursiveEquals(term869, 0.5279279537140873));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


