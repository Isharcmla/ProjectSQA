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

public class MathUtils_distance1_87002239455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;
     Object term295;

    public MathUtils_distance1_87002239455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293 = (double[]) newDoubleArray(1);
        setDoubleElement(term293, 0, 0.6397214730945112);
        term295 = (double[]) newDoubleArray(6);
        setDoubleElement(term295, 0, 0.25937345430928016);
        setDoubleElement(term295, 1, 0.5873228247510078);
        setDoubleElement(term295, 2, 0.8823181080774973);
        setDoubleElement(term295, 3, 0.2192450926212024);
        setDoubleElement(term295, 4, 0.7591353014991907);
        setDoubleElement(term295, 5, 0.791695029600875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term293;
        args[1] = term295;
        callMethod(klass, "distance1", argTypes, null, args);
    }

};


