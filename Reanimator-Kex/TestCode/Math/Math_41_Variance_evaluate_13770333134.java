package org.apache.commons.math.stat.descriptive.moment;

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
import org.apache.commons.math.exception.NotPositiveException;
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;

public class Variance_evaluate_13770333134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;
     Object term259;
     Object term268;
     Object term270;
     Object term272;

    public Variance_evaluate_13770333134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term248 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term256 = (double[]) newDoubleArray(2);
        setDoubleField(term248, term248.getClass(), "m2", Double.NaN);
        setLongField(term248, term248.getClass(), "n", 0L);
        setDoubleField(term248, term248.getClass(), "m1", Double.NaN);
        setDoubleField(term248, term248.getClass(), "dev", Double.NaN);
        setDoubleField(term248, term248.getClass(), "nDev", Double.NaN);
        setField(term248, term248.getClass(), "storedData", null);
        setField(term247, term247.getClass(), "moment", term248);
        setBooleanField(term247, term247.getClass(), "incMoment", true);
        setBooleanField(term247, term247.getClass(), "isBiasCorrected", true);
        setDoubleElement(term256, 0, 0.13246999699526574);
        setDoubleElement(term256, 1, 0.9126850255993704);
        setField(term247, term247.getClass(), "storedData", term256);
        term259 = (double[]) newDoubleArray(8);
        setDoubleElement(term259, 0, 0.11179067076100713);
        setDoubleElement(term259, 1, 0.5306473989087822);
        setDoubleElement(term259, 2, 0.022483645678509023);
        setDoubleElement(term259, 3, 0.025133051616627267);
        setDoubleElement(term259, 4, 0.016575281023182953);
        setDoubleElement(term259, 5, 0.5308350402051779);
        setDoubleElement(term259, 6, 0.7154795600170818);
        setDoubleElement(term259, 7, 0.6355029654528058);
        term268 = new Double(0.0022646783892913414);
        term270 = new Integer(-1922583790);
        term272 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term259;
        args[1] = term268;
        args[2] = term270;
        args[3] = term272;
        try {
            callMethod(klass, "evaluate", argTypes, term247, args);
            assertTrue(false);
        }
        catch (NotPositiveException e) {
        }

    }

};


