package org.apache.commons.math.stat.correlation;

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
import static org.apache.commons.math.stat.correlation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PearsonsCorrelation_correlation_211608497110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86;
     Object term88;
     Object term90;

    public PearsonsCorrelation_correlation_211608497110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setField(term86, term86.getClass(), "correlationMatrix", null);
        setIntField(term86, term86.getClass(), "nObs", -2038273078);
        term88 = (double[]) newDoubleArray(1);
        setDoubleElement(term88, 0, 0.6805867182029153);
        term90 = (double[]) newDoubleArray(6);
        setDoubleElement(term90, 0, 0.2852810965221698);
        setDoubleElement(term90, 1, 0.6300849762307866);
        setDoubleElement(term90, 2, 0.9737083944266686);
        setDoubleElement(term90, 3, 0.0668892744806211);
        setDoubleElement(term90, 4, 0.3587267442738795);
        setDoubleElement(term90, 5, 0.07802449704920456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term88;
        args[1] = term90;
        callMethod(klass, "correlation", argTypes, term86, args);
    }

};


