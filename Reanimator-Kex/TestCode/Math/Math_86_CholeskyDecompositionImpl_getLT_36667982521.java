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
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class CholeskyDecompositionImpl_getLT_36667982521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8024;
     Object term11647;
     Object term10650;

    public CholeskyDecompositionImpl_getLT_36667982521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8024 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term5906 = (Object[]) newArray("[D", 1);
        double[] term5907 = (double[]) newDoubleArray(489);
        setField(term8024, term8024.getClass(), "cachedLT", null);
        setDoubleElement(term5907, 0, 1.0);
        setDoubleElement(term5907, 1, 1.0);
        setElement(term5906, 0, term5907);
        setField(term8024, term8024.getClass(), "lTData", term5906);
        term11647 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term11648 = (Object[]) newArray("[D", 1);
        double[] term11649 = (double[]) newDoubleArray(489);
        Object term11650 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        Object[] term11651 = (Object[]) newArray("[D", 10);
        double[] term11652 = (double[]) newDoubleArray(52);
        double[] term11653 = (double[]) newDoubleArray(52);
        double[] term11654 = (double[]) newDoubleArray(52);
        double[] term11655 = (double[]) newDoubleArray(52);
        double[] term11656 = (double[]) newDoubleArray(52);
        double[] term11657 = (double[]) newDoubleArray(52);
        double[] term11658 = (double[]) newDoubleArray(52);
        double[] term11659 = (double[]) newDoubleArray(52);
        double[] term11660 = (double[]) newDoubleArray(52);
        double[] term11661 = (double[]) newDoubleArray(21);
        setDoubleElement(term11649, 0, 1.0);
        setDoubleElement(term11649, 1, 1.0);
        setElement(term11648, 0, term11649);
        setField(term11647, term11647.getClass(), "lTData", term11648);
        setField(term11647, term11647.getClass(), "cachedL", null);
        setDoubleElement(term11652, 0, 1.0);
        setDoubleElement(term11652, 1, 1.0);
        setElement(term11651, 0, term11652);
        setElement(term11651, 1, term11653);
        setElement(term11651, 2, term11654);
        setElement(term11651, 3, term11655);
        setElement(term11651, 4, term11656);
        setElement(term11651, 5, term11657);
        setElement(term11651, 6, term11658);
        setElement(term11651, 7, term11659);
        setElement(term11651, 8, term11660);
        setElement(term11651, 9, term11661);
        setField(term11650, term11650.getClass(), "blocks", term11651);
        setIntField(term11650, term11650.getClass(), "rows", 1);
        setIntField(term11650, term11650.getClass(), "columns", 489);
        setIntField(term11650, term11650.getClass(), "blockRows", 1);
        setIntField(term11650, term11650.getClass(), "blockColumns", 10);
        setField(term11650, term11650.getClass(), "lu", null);
        setField(term11647, term11647.getClass(), "cachedLT", term11650);
        term10650 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        Object[] term10651 = (Object[]) newArray("[D", 10);
        double[] term10652 = (double[]) newDoubleArray(52);
        double[] term10705 = (double[]) newDoubleArray(52);
        double[] term10758 = (double[]) newDoubleArray(52);
        double[] term10811 = (double[]) newDoubleArray(52);
        double[] term10864 = (double[]) newDoubleArray(52);
        double[] term10917 = (double[]) newDoubleArray(52);
        double[] term10970 = (double[]) newDoubleArray(52);
        double[] term11023 = (double[]) newDoubleArray(52);
        double[] term11076 = (double[]) newDoubleArray(52);
        double[] term11129 = (double[]) newDoubleArray(21);
        setDoubleElement(term10652, 0, 1.0);
        setDoubleElement(term10652, 1, 1.0);
        setElement(term10651, 0, term10652);
        setElement(term10651, 1, term10705);
        setElement(term10651, 2, term10758);
        setElement(term10651, 3, term10811);
        setElement(term10651, 4, term10864);
        setElement(term10651, 5, term10917);
        setElement(term10651, 6, term10970);
        setElement(term10651, 7, term11023);
        setElement(term10651, 8, term11076);
        setElement(term10651, 9, term11129);
        setField(term10650, term10650.getClass(), "blocks", term10651);
        setIntField(term10650, term10650.getClass(), "rows", 1);
        setIntField(term10650, term10650.getClass(), "columns", 489);
        setIntField(term10650, term10650.getClass(), "blockRows", 1);
        setIntField(term10650, term10650.getClass(), "blockColumns", 10);
        setField(term10650, term10650.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLT", argTypes, term8024, args);
        assertTrue(recursiveEquals(term8024, term11647));
        assertTrue(recursiveEquals(retValue, term10650));
    }

};


