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

public class RealMatrixImpl_add_51043126753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;

    public RealMatrixImpl_add_51043126753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term159 = (Object[]) newArray("[D", 1);
        double[] term160 = (double[]) newDoubleArray(9);
        Object[] term170 = (Object[]) newArray("[D", 3);
        double[] term171 = (double[]) newDoubleArray(5);
        double[] term177 = (double[]) newDoubleArray(6);
        double[] term184 = (double[]) newDoubleArray(5);
        int[] term190 = (int[]) newIntArray(3);
        setDoubleElement(term160, 0, 0.13246999699526574);
        setDoubleElement(term160, 1, 0.9126850255993704);
        setDoubleElement(term160, 2, 0.11179067076100713);
        setDoubleElement(term160, 3, 0.5306473989087822);
        setDoubleElement(term160, 4, 0.022483645678509023);
        setDoubleElement(term160, 5, 0.025133051616627267);
        setDoubleElement(term160, 6, 0.016575281023182953);
        setDoubleElement(term160, 7, 0.5308350402051779);
        setDoubleElement(term160, 8, 0.7154795600170818);
        setElement(term159, 0, term160);
        setField(term158, term158.getClass(), "data", term159);
        setDoubleElement(term171, 0, 0.6355029654528058);
        setDoubleElement(term171, 1, 0.0022646783892913414);
        setDoubleElement(term171, 2, 0.36226058076369927);
        setDoubleElement(term171, 3, 0.03699061125289671);
        setDoubleElement(term171, 4, 0.6047137830113202);
        setElement(term170, 0, term171);
        setDoubleElement(term177, 0, 0.6767213143579776);
        setDoubleElement(term177, 1, 0.48862955528902696);
        setDoubleElement(term177, 2, 0.426231085465289);
        setDoubleElement(term177, 3, 0.0027299293098262956);
        setDoubleElement(term177, 4, 0.29874017652881824);
        setDoubleElement(term177, 5, 0.32554480512985284);
        setElement(term170, 1, term177);
        setDoubleElement(term184, 0, 0.8924855581421237);
        setDoubleElement(term184, 1, 0.32237559209193944);
        setDoubleElement(term184, 2, 0.53094494792755);
        setDoubleElement(term184, 3, 0.146431486357265);
        setDoubleElement(term184, 4, 0.24259014218848696);
        setElement(term170, 2, term184);
        setField(term158, term158.getClass(), "lu", term170);
        setIntElement(term190, 0, -1922583790);
        setIntElement(term190, 1, -616727354);
        setIntElement(term190, 2, -1955890973);
        setField(term158, term158.getClass(), "permutation", term190);
        setIntField(term158, term158.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "add", argTypes, term158, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


