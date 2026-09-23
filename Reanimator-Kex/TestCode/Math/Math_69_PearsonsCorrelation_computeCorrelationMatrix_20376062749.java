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
import java.lang.Object;

public class PearsonsCorrelation_computeCorrelationMatrix_20376062749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term57;

    public PearsonsCorrelation_computeCorrelationMatrix_20376062749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setField(term55, term55.getClass(), "correlationMatrix", null);
        setIntField(term55, term55.getClass(), "nObs", -1955890973);
        term57 = (Object[]) newArray("[D", 2);
        double[] term58 = (double[]) newDoubleArray(6);
        double[] term65 = (double[]) newDoubleArray(7);
        setDoubleElement(term58, 0, 0.6436713023569729);
        setDoubleElement(term58, 1, 0.7332741045694002);
        setDoubleElement(term58, 2, 0.4569171842750229);
        setDoubleElement(term58, 3, 0.8598297828918529);
        setDoubleElement(term58, 4, 0.43692187681405226);
        setDoubleElement(term58, 5, 0.7633268466829064);
        setElement(term57, 0, term58);
        setDoubleElement(term65, 0, 0.13481025392611334);
        setDoubleElement(term65, 1, 0.3800088629986428);
        setDoubleElement(term65, 2, 0.5840714198152577);
        setDoubleElement(term65, 3, 0.7559240768573477);
        setDoubleElement(term65, 4, 0.10667076642995188);
        setDoubleElement(term65, 5, 0.11493000848982304);
        setDoubleElement(term65, 6, 0.37161417339133307);
        setElement(term57, 1, term65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term57;
        callMethod(klass, "computeCorrelationMatrix", argTypes, term55, args);
    }

};


