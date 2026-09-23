package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CholeskyDecompositionImpl_getLT_3666798253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;

    public CholeskyDecompositionImpl_getLT_3666798253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term49 = (Object[]) newArray("[D", 2);
        double[] term50 = (double[]) newDoubleArray(6);
        double[] term57 = (double[]) newDoubleArray(7);
        setDoubleElement(term50, 0, 0.4569171842750229);
        setDoubleElement(term50, 1, 0.8598297828918529);
        setDoubleElement(term50, 2, 0.43692187681405226);
        setDoubleElement(term50, 3, 0.7633268466829064);
        setDoubleElement(term50, 4, 0.13481025392611334);
        setDoubleElement(term50, 5, 0.3800088629986428);
        setElement(term49, 0, term50);
        setDoubleElement(term57, 0, 0.5840714198152577);
        setDoubleElement(term57, 1, 0.7559240768573477);
        setDoubleElement(term57, 2, 0.10667076642995188);
        setDoubleElement(term57, 3, 0.11493000848982304);
        setDoubleElement(term57, 4, 0.37161417339133307);
        setDoubleElement(term57, 5, 0.6805867182029153);
        setDoubleElement(term57, 6, 0.2852810965221698);
        setElement(term49, 1, term57);
        setField(term48, term48.getClass(), "lTData", term49);
        setField(term48, term48.getClass(), "cachedL", null);
        setField(term48, term48.getClass(), "cachedLT", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLT", argTypes, term48, args);
    }

};


