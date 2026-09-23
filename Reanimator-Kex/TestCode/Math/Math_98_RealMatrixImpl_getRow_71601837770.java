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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RealMatrixImpl_getRow_71601837770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2445;
     Object term2481;

    public RealMatrixImpl_getRow_71601837770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2445 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2446 = (Object[]) newArray("[D", 1);
        double[] term2447 = (double[]) newDoubleArray(0);
        Object[] term2448 = (Object[]) newArray("[D", 5);
        double[] term2449 = (double[]) newDoubleArray(3);
        double[] term2453 = (double[]) newDoubleArray(8);
        double[] term2462 = (double[]) newDoubleArray(6);
        double[] term2469 = (double[]) newDoubleArray(3);
        double[] term2473 = (double[]) newDoubleArray(2);
        int[] term2476 = (int[]) newIntArray(3);
        setElement(term2446, 0, term2447);
        setField(term2445, term2445.getClass(), "data", term2446);
        setDoubleElement(term2449, 0, 0.7236447174335996);
        setDoubleElement(term2449, 1, 0.5469686485515324);
        setDoubleElement(term2449, 2, 0.8799789079622452);
        setElement(term2448, 0, term2449);
        setDoubleElement(term2453, 0, 0.012279473391326401);
        setDoubleElement(term2453, 1, 0.7259655674926332);
        setDoubleElement(term2453, 2, 0.8047272850336552);
        setDoubleElement(term2453, 3, 0.10724311312171908);
        setDoubleElement(term2453, 4, 0.16031470934932757);
        setDoubleElement(term2453, 5, 0.7481505476231854);
        setDoubleElement(term2453, 6, 0.04322436701994625);
        setDoubleElement(term2453, 7, 0.22448074339260415);
        setElement(term2448, 1, term2453);
        setDoubleElement(term2462, 0, 0.6720311177231261);
        setDoubleElement(term2462, 1, 0.8797924363074923);
        setDoubleElement(term2462, 2, 0.3484618877271397);
        setDoubleElement(term2462, 3, 0.4996378383760146);
        setDoubleElement(term2462, 4, 0.3502208680062405);
        setDoubleElement(term2462, 5, 0.6885447064290993);
        setElement(term2448, 2, term2462);
        setDoubleElement(term2469, 0, 0.3831812963915012);
        setDoubleElement(term2469, 1, 0.4282106854555081);
        setDoubleElement(term2469, 2, 0.1826861672590545);
        setElement(term2448, 3, term2469);
        setDoubleElement(term2473, 0, 0.9791936141175877);
        setDoubleElement(term2473, 1, 0.25117946251535295);
        setElement(term2448, 4, term2473);
        setField(term2445, term2445.getClass(), "lu", term2448);
        setIntElement(term2476, 0, 683666002);
        setIntElement(term2476, 1, 1596213415);
        setIntElement(term2476, 2, -268815336);
        setField(term2445, term2445.getClass(), "permutation", term2476);
        setIntField(term2445, term2445.getClass(), "parity", 1);
        term2481 = new Integer(-1210583429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2481;
        try {
            callMethod(klass, "getRow", argTypes, term2445, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


