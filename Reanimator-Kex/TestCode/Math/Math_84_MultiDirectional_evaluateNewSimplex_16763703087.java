package org.apache.commons.math.optimization.direct;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class MultiDirectional_evaluateNewSimplex_16763703087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term133;
     Object term154;

    public MultiDirectional_evaluateNewSimplex_16763703087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term99 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 1);
        Object term100 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term101 = (double[]) newDoubleArray(6);
        Object term109 = newInstance(Class.forName("org.apache.commons.math.optimization.SimpleScalarValueChecker"));
        Object[] term116 = (Object[]) newArray("[D", 5);
        double[] term117 = (double[]) newDoubleArray(5);
        double[] term123 = (double[]) newDoubleArray(2);
        double[] term126 = (double[]) newDoubleArray(3);
        double[] term130 = (double[]) newDoubleArray(1);
        double[] term132 = (double[]) newDoubleArray(0);
        setDoubleField(term96, term96.getClass(), "khi", 2.0);
        setDoubleField(term96, term96.getClass(), "gamma", 0.5);
        setDoubleElement(term101, 0, 0.5279279537140873);
        setDoubleElement(term101, 1, 0.3202192021706908);
        setDoubleElement(term101, 2, 0.22651340641904605);
        setDoubleElement(term101, 3, 0.8878841294187743);
        setDoubleElement(term101, 4, 0.6588948704887806);
        setDoubleElement(term101, 5, 0.6397214730945112);
        setField(term100, term100.getClass(), "point", term101);
        setDoubleField(term100, term100.getClass(), "value", 0.25937345430928016);
        setElement(term99, 0, term100);
        setField(term96, term96.getClass(), "simplex", term99);
        setField(term96, term96.getClass(), "f", null);
        setDoubleField(term109, term109.getClass(), "relativeThreshold", 1.1102230246251565E-14);
        setDoubleField(term109, term109.getClass(), "absoluteThreshold", 2.2250738585072014E-306);
        setField(term96, term96.getClass(), "checker", term109);
        setIntField(term96, term96.getClass(), "maxIterations", 2147483647);
        setIntField(term96, term96.getClass(), "iterations", 1484323161);
        setIntField(term96, term96.getClass(), "maxEvaluations", 2147483647);
        setIntField(term96, term96.getClass(), "evaluations", 391863371);
        setDoubleElement(term117, 0, 0.5873228247510078);
        setDoubleElement(term117, 1, 0.8823181080774973);
        setDoubleElement(term117, 2, 0.2192450926212024);
        setDoubleElement(term117, 3, 0.7591353014991907);
        setDoubleElement(term117, 4, 0.791695029600875);
        setElement(term116, 0, term117);
        setDoubleElement(term123, 0, 0.6862221294683138);
        setDoubleElement(term123, 1, 0.15917839663695388);
        setElement(term116, 1, term123);
        setDoubleElement(term126, 0, 0.9374115574082594);
        setDoubleElement(term126, 1, 0.8454723071922143);
        setDoubleElement(term126, 2, 0.8566567697571895);
        setElement(term116, 2, term126);
        setDoubleElement(term130, 0, 0.9203805380592256);
        setElement(term116, 3, term130);
        setElement(term116, 4, term132);
        setField(term96, term96.getClass(), "startConfiguration", term116);
        term133 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 2);
        Object term134 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term135 = (double[]) newDoubleArray(8);
        Object term145 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term146 = (double[]) newDoubleArray(6);
        setDoubleElement(term135, 0, 0.5804948995371725);
        setDoubleElement(term135, 1, 0.20737514139742264);
        setDoubleElement(term135, 2, 0.7919370314903882);
        setDoubleElement(term135, 3, 0.2109867221632754);
        setDoubleElement(term135, 4, 0.3227335400819148);
        setDoubleElement(term135, 5, 0.43337207054070237);
        setDoubleElement(term135, 6, 0.13246999699526574);
        setDoubleElement(term135, 7, 0.9126850255993704);
        setField(term134, term134.getClass(), "point", term135);
        setDoubleField(term134, term134.getClass(), "value", 0.11179067076100713);
        setElement(term133, 0, term134);
        setDoubleElement(term146, 0, 0.5306473989087822);
        setDoubleElement(term146, 1, 0.022483645678509023);
        setDoubleElement(term146, 2, 0.025133051616627267);
        setDoubleElement(term146, 3, 0.016575281023182953);
        setDoubleElement(term146, 4, 0.5308350402051779);
        setDoubleElement(term146, 5, 0.7154795600170818);
        setField(term145, term145.getClass(), "point", term146);
        setDoubleField(term145, term145.getClass(), "value", 0.6355029654528058);
        setElement(term133, 1, term145);
        term154 = new Double(0.0022646783892913414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term133;
        args[1] = term154;
        args[2] = null;
        try {
            callMethod(klass, "evaluateNewSimplex", argTypes, term96, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


