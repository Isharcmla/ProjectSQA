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

public class MathArrays_distance1_4848423707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term100;

    public MathArrays_distance1_4848423707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = (double[]) newDoubleArray(6);
        setDoubleElement(term93, 0, 0.8878841294187743);
        setDoubleElement(term93, 1, 0.6588948704887806);
        setDoubleElement(term93, 2, 0.6397214730945112);
        setDoubleElement(term93, 3, 0.25937345430928016);
        setDoubleElement(term93, 4, 0.5873228247510078);
        setDoubleElement(term93, 5, 0.8823181080774973);
        term100 = (double[]) newDoubleArray(5);
        setDoubleElement(term100, 0, 0.2192450926212024);
        setDoubleElement(term100, 1, 0.7591353014991907);
        setDoubleElement(term100, 2, 0.791695029600875);
        setDoubleElement(term100, 3, 0.6862221294683138);
        setDoubleElement(term100, 4, 0.15917839663695388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term93;
        args[1] = term100;
        callMethod(klass, "distance1", argTypes, null, args);
    }

};


