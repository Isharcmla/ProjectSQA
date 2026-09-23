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

public class RealMatrixImpl_getEntry_105977959772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2539;
     Object term2562;
     Object term2564;

    public RealMatrixImpl_getEntry_105977959772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2539 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2540 = (Object[]) newArray("[D", 2);
        double[] term2541 = (double[]) newDoubleArray(7);
        double[] term2549 = (double[]) newDoubleArray(4);
        Object[] term2554 = (Object[]) newArray("[D", 2);
        double[] term2555 = (double[]) newDoubleArray(1);
        double[] term2557 = (double[]) newDoubleArray(0);
        int[] term2558 = (int[]) newIntArray(2);
        setDoubleElement(term2541, 0, 0.043843045689821336);
        setDoubleElement(term2541, 1, 0.3166434459249081);
        setDoubleElement(term2541, 2, 0.3001038134239822);
        setDoubleElement(term2541, 3, 0.07007378007322307);
        setDoubleElement(term2541, 4, 0.15701878581568673);
        setDoubleElement(term2541, 5, 0.002952762503631967);
        setDoubleElement(term2541, 6, 0.3176774647268311);
        setElement(term2540, 0, term2541);
        setDoubleElement(term2549, 0, 0.18514821141841376);
        setDoubleElement(term2549, 1, 0.20888628884386784);
        setDoubleElement(term2549, 2, 0.493613742285562);
        setDoubleElement(term2549, 3, 0.4797764207198135);
        setElement(term2540, 1, term2549);
        setField(term2539, term2539.getClass(), "data", term2540);
        setDoubleElement(term2555, 0, 0.056284870993027813);
        setElement(term2554, 0, term2555);
        setElement(term2554, 1, term2557);
        setField(term2539, term2539.getClass(), "lu", term2554);
        setIntElement(term2558, 0, 1141317871);
        setIntElement(term2558, 1, 890669485);
        setField(term2539, term2539.getClass(), "permutation", term2558);
        setIntField(term2539, term2539.getClass(), "parity", 1);
        term2562 = new Integer(691577392);
        term2564 = new Integer(-893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2562;
        args[1] = term2564;
        try {
            callMethod(klass, "getEntry", argTypes, term2539, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


