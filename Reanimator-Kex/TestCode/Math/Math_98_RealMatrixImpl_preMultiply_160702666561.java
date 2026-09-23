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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RealMatrixImpl_preMultiply_160702666561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1257;

    public RealMatrixImpl_preMultiply_160702666561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1257 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term1258 = (Object[]) newArray("[D", 2);
        double[] term1259 = (double[]) newDoubleArray(6);
        double[] term1266 = (double[]) newDoubleArray(1);
        Object[] term1268 = (Object[]) newArray("[D", 6);
        double[] term1269 = (double[]) newDoubleArray(8);
        double[] term1278 = (double[]) newDoubleArray(5);
        double[] term1284 = (double[]) newDoubleArray(2);
        double[] term1287 = (double[]) newDoubleArray(6);
        double[] term1294 = (double[]) newDoubleArray(1);
        double[] term1296 = (double[]) newDoubleArray(2);
        int[] term1299 = (int[]) newIntArray(7);
        setDoubleElement(term1259, 0, 0.7752202944026838);
        setDoubleElement(term1259, 1, 0.6814473488244137);
        setDoubleElement(term1259, 2, 0.7526628774283542);
        setDoubleElement(term1259, 3, 0.6609555690482892);
        setDoubleElement(term1259, 4, 0.20773286305836303);
        setDoubleElement(term1259, 5, 0.6902120717646517);
        setElement(term1258, 0, term1259);
        setDoubleElement(term1266, 0, 0.483452767365532);
        setElement(term1258, 1, term1266);
        setField(term1257, term1257.getClass(), "data", term1258);
        setDoubleElement(term1269, 0, 0.33984612849066775);
        setDoubleElement(term1269, 1, 0.992214897936456);
        setDoubleElement(term1269, 2, 0.10940058061451474);
        setDoubleElement(term1269, 3, 0.5280493395446559);
        setDoubleElement(term1269, 4, 0.5885698341309811);
        setDoubleElement(term1269, 5, 0.47963743635149814);
        setDoubleElement(term1269, 6, 0.07322031754051816);
        setDoubleElement(term1269, 7, 0.7572808992551947);
        setElement(term1268, 0, term1269);
        setDoubleElement(term1278, 0, 0.34277768712445844);
        setDoubleElement(term1278, 1, 0.9807605245238011);
        setDoubleElement(term1278, 2, 0.6765249801226639);
        setDoubleElement(term1278, 3, 0.08404543279803334);
        setDoubleElement(term1278, 4, 0.2456100607115369);
        setElement(term1268, 1, term1278);
        setDoubleElement(term1284, 0, 0.40390514476233974);
        setDoubleElement(term1284, 1, 0.07467808093133665);
        setElement(term1268, 2, term1284);
        setDoubleElement(term1287, 0, 0.5375131002500685);
        setDoubleElement(term1287, 1, 0.8347207486220592);
        setDoubleElement(term1287, 2, 0.6121208871391735);
        setDoubleElement(term1287, 3, 0.7727907711525114);
        setDoubleElement(term1287, 4, 0.01895872020734357);
        setDoubleElement(term1287, 5, 0.2736100778332827);
        setElement(term1268, 3, term1287);
        setDoubleElement(term1294, 0, 0.3629389093951403);
        setElement(term1268, 4, term1294);
        setDoubleElement(term1296, 0, 0.5048764503874877);
        setDoubleElement(term1296, 1, 0.18688693015118896);
        setElement(term1268, 5, term1296);
        setField(term1257, term1257.getClass(), "lu", term1268);
        setIntElement(term1299, 0, -1048298087);
        setIntElement(term1299, 1, 292681826);
        setIntElement(term1299, 2, 458147407);
        setIntElement(term1299, 3, -184153539);
        setIntElement(term1299, 4, 493620644);
        setIntElement(term1299, 5, 1328271830);
        setIntElement(term1299, 6, 1596070772);
        setField(term1257, term1257.getClass(), "permutation", term1299);
        setIntField(term1257, term1257.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "preMultiply", argTypes, term1257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


