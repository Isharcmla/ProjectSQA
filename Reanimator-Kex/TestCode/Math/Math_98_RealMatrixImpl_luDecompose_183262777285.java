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
import org.apache.commons.math.linear.InvalidMatrixException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RealMatrixImpl_luDecompose_183262777285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4073;

    public RealMatrixImpl_luDecompose_183262777285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4073 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term4074 = (Object[]) newArray("[D", 6);
        double[] term4075 = (double[]) newDoubleArray(4);
        double[] term4080 = (double[]) newDoubleArray(5);
        double[] term4086 = (double[]) newDoubleArray(4);
        double[] term4091 = (double[]) newDoubleArray(4);
        double[] term4096 = (double[]) newDoubleArray(1);
        double[] term4098 = (double[]) newDoubleArray(6);
        Object[] term4105 = (Object[]) newArray("[D", 0);
        int[] term4106 = (int[]) newIntArray(7);
        setDoubleElement(term4075, 0, 0.9100944689992451);
        setDoubleElement(term4075, 1, 0.5362140838151028);
        setDoubleElement(term4075, 2, 0.4598790063336152);
        setDoubleElement(term4075, 3, 0.855781321665093);
        setElement(term4074, 0, term4075);
        setDoubleElement(term4080, 0, 0.00432978885476254);
        setDoubleElement(term4080, 1, 0.7226219442738863);
        setDoubleElement(term4080, 2, 0.09289352321391486);
        setDoubleElement(term4080, 3, 0.955766757538822);
        setDoubleElement(term4080, 4, 0.06064863889909755);
        setElement(term4074, 1, term4080);
        setDoubleElement(term4086, 0, 0.43823947470678104);
        setDoubleElement(term4086, 1, 0.7826054601213082);
        setDoubleElement(term4086, 2, 0.04352020326712169);
        setDoubleElement(term4086, 3, 0.9627559723596711);
        setElement(term4074, 2, term4086);
        setDoubleElement(term4091, 0, 0.639031578052806);
        setDoubleElement(term4091, 1, 0.406857009623232);
        setDoubleElement(term4091, 2, 0.20749056897406915);
        setDoubleElement(term4091, 3, 0.6262035493360271);
        setElement(term4074, 3, term4091);
        setDoubleElement(term4096, 0, 0.025761524745151254);
        setElement(term4074, 4, term4096);
        setDoubleElement(term4098, 0, 0.4010401390004734);
        setDoubleElement(term4098, 1, 0.7482443498063351);
        setDoubleElement(term4098, 2, 0.14852535454334959);
        setDoubleElement(term4098, 3, 0.5924057883972601);
        setDoubleElement(term4098, 4, 0.22118847311780854);
        setDoubleElement(term4098, 5, 0.755508343095086);
        setElement(term4074, 5, term4098);
        setField(term4073, term4073.getClass(), "data", term4074);
        setField(term4073, term4073.getClass(), "lu", term4105);
        setIntElement(term4106, 0, -1239406390);
        setIntElement(term4106, 1, 1557431527);
        setIntElement(term4106, 2, -1504890659);
        setIntElement(term4106, 3, 1358829571);
        setIntElement(term4106, 4, 991356662);
        setIntElement(term4106, 5, -506958186);
        setIntElement(term4106, 6, -507387516);
        setField(term4073, term4073.getClass(), "permutation", term4106);
        setIntField(term4073, term4073.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "luDecompose", argTypes, term4073, args);
            assertTrue(false);
        }
        catch (InvalidMatrixException e) {
        }

    }

};


