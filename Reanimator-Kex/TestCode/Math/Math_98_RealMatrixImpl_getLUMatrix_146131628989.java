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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RealMatrixImpl_getLUMatrix_146131628989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4570;

    public RealMatrixImpl_getLUMatrix_146131628989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4570 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term4571 = (Object[]) newArray("[D", 8);
        double[] term4572 = (double[]) newDoubleArray(4);
        double[] term4577 = (double[]) newDoubleArray(0);
        double[] term4578 = (double[]) newDoubleArray(6);
        double[] term4585 = (double[]) newDoubleArray(2);
        double[] term4588 = (double[]) newDoubleArray(0);
        double[] term4589 = (double[]) newDoubleArray(7);
        double[] term4597 = (double[]) newDoubleArray(4);
        double[] term4602 = (double[]) newDoubleArray(7);
        Object[] term4610 = (Object[]) newArray("[D", 0);
        int[] term4611 = (int[]) newIntArray(3);
        setDoubleElement(term4572, 0, 0.7855714534403968);
        setDoubleElement(term4572, 1, 0.5670716603510538);
        setDoubleElement(term4572, 2, 0.36438526312425923);
        setDoubleElement(term4572, 3, 0.5439091451647288);
        setElement(term4571, 0, term4572);
        setElement(term4571, 1, term4577);
        setDoubleElement(term4578, 0, 0.7522977618486756);
        setDoubleElement(term4578, 1, 0.7817162133058004);
        setDoubleElement(term4578, 2, 0.1878658491508698);
        setDoubleElement(term4578, 3, 0.2851657656957063);
        setDoubleElement(term4578, 4, 0.980543751621402);
        setDoubleElement(term4578, 5, 0.668392288510234);
        setElement(term4571, 2, term4578);
        setDoubleElement(term4585, 0, 0.4665094559404003);
        setDoubleElement(term4585, 1, 0.1486853030262536);
        setElement(term4571, 3, term4585);
        setElement(term4571, 4, term4588);
        setDoubleElement(term4589, 0, 0.46499223139707646);
        setDoubleElement(term4589, 1, 0.3453468493141325);
        setDoubleElement(term4589, 2, 0.21618975850029776);
        setDoubleElement(term4589, 3, 0.9830283554079381);
        setDoubleElement(term4589, 4, 0.9750579395058171);
        setDoubleElement(term4589, 5, 0.46445076312727607);
        setDoubleElement(term4589, 6, 0.2303194999747199);
        setElement(term4571, 5, term4589);
        setDoubleElement(term4597, 0, 0.12035700708914543);
        setDoubleElement(term4597, 1, 0.966726469721044);
        setDoubleElement(term4597, 2, 0.6994177008832577);
        setDoubleElement(term4597, 3, 0.12080795593692062);
        setElement(term4571, 6, term4597);
        setDoubleElement(term4602, 0, 0.9653030709105326);
        setDoubleElement(term4602, 1, 0.8540476296203835);
        setDoubleElement(term4602, 2, 0.7130699064213868);
        setDoubleElement(term4602, 3, 0.01879777575163344);
        setDoubleElement(term4602, 4, 0.8963335539756794);
        setDoubleElement(term4602, 5, 0.08550409147763638);
        setDoubleElement(term4602, 6, 0.11747519423867014);
        setElement(term4571, 7, term4602);
        setField(term4570, term4570.getClass(), "data", term4571);
        setField(term4570, term4570.getClass(), "lu", term4610);
        setIntElement(term4611, 0, -1310015129);
        setIntElement(term4611, 1, -2104981311);
        setIntElement(term4611, 2, -571169753);
        setField(term4570, term4570.getClass(), "permutation", term4611);
        setIntField(term4570, term4570.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLUMatrix", argTypes, term4570, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


