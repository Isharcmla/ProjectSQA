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

public class EigenDecompositionImpl_isSymmetric_175222663838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public EigenDecompositionImpl_isSymmetric_175222663838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term27 = (double[]) newDoubleArray(3);
        double[] term31 = (double[]) newDoubleArray(4);
        double[] term36 = (double[]) newDoubleArray(1);
        Object term38 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term39 = (Object[]) newArray("[D", 6);
        double[] term40 = (double[]) newDoubleArray(2);
        double[] term43 = (double[]) newDoubleArray(6);
        double[] term50 = (double[]) newDoubleArray(7);
        double[] term58 = (double[]) newDoubleArray(1);
        double[] term60 = (double[]) newDoubleArray(6);
        double[] term67 = (double[]) newDoubleArray(5);
        double[] term73 = (double[]) newDoubleArray(5);
        double[] term79 = (double[]) newDoubleArray(2);
        double[] term88 = (double[]) newDoubleArray(3);
        double[] term103 = (double[]) newDoubleArray(1);
        double[] term105 = (double[]) newDoubleArray(0);
        Object[] term106 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 2);
        Object term107 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term108 = (double[]) newDoubleArray(0);
        Object term109 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term110 = (double[]) newDoubleArray(0);
        setDoubleField(term25, term25.getClass(), "splitTolerance", 0.5183269973490326);
        setDoubleElement(term27, 0, 0.7655020693602768);
        setDoubleElement(term27, 1, 0.1374549299694151);
        setDoubleElement(term27, 2, 0.7031006357544823);
        setField(term25, term25.getClass(), "main", term27);
        setDoubleElement(term31, 0, 0.9527281779865117);
        setDoubleElement(term31, 1, 0.9828442029246764);
        setDoubleElement(term31, 2, 0.2779719046761513);
        setDoubleElement(term31, 3, 0.6436713023569729);
        setField(term25, term25.getClass(), "secondary", term31);
        setDoubleElement(term36, 0, 0.7332741045694002);
        setField(term25, term25.getClass(), "squaredSecondary", term36);
        setDoubleElement(term40, 0, 0.4569171842750229);
        setDoubleElement(term40, 1, 0.8598297828918529);
        setElement(term39, 0, term40);
        setDoubleElement(term43, 0, 0.43692187681405226);
        setDoubleElement(term43, 1, 0.7633268466829064);
        setDoubleElement(term43, 2, 0.13481025392611334);
        setDoubleElement(term43, 3, 0.3800088629986428);
        setDoubleElement(term43, 4, 0.5840714198152577);
        setDoubleElement(term43, 5, 0.7559240768573477);
        setElement(term39, 1, term43);
        setDoubleElement(term50, 0, 0.10667076642995188);
        setDoubleElement(term50, 1, 0.11493000848982304);
        setDoubleElement(term50, 2, 0.37161417339133307);
        setDoubleElement(term50, 3, 0.6805867182029153);
        setDoubleElement(term50, 4, 0.2852810965221698);
        setDoubleElement(term50, 5, 0.6300849762307866);
        setDoubleElement(term50, 6, 0.9737083944266686);
        setElement(term39, 2, term50);
        setDoubleElement(term58, 0, 0.0668892744806211);
        setElement(term39, 3, term58);
        setDoubleElement(term60, 0, 0.3587267442738795);
        setDoubleElement(term60, 1, 0.07802449704920456);
        setDoubleElement(term60, 2, 0.5279279537140873);
        setDoubleElement(term60, 3, 0.3202192021706908);
        setDoubleElement(term60, 4, 0.22651340641904605);
        setDoubleElement(term60, 5, 0.8878841294187743);
        setElement(term39, 4, term60);
        setDoubleElement(term67, 0, 0.6588948704887806);
        setDoubleElement(term67, 1, 0.6397214730945112);
        setDoubleElement(term67, 2, 0.25937345430928016);
        setDoubleElement(term67, 3, 0.5873228247510078);
        setDoubleElement(term67, 4, 0.8823181080774973);
        setElement(term39, 5, term67);
        setField(term38, term38.getClass(), "householderVectors", term39);
        setDoubleElement(term73, 0, 0.2192450926212024);
        setDoubleElement(term73, 1, 0.7591353014991907);
        setDoubleElement(term73, 2, 0.791695029600875);
        setDoubleElement(term73, 3, 0.6862221294683138);
        setDoubleElement(term73, 4, 0.15917839663695388);
        setField(term38, term38.getClass(), "main", term73);
        setDoubleElement(term79, 0, 0.9374115574082594);
        setDoubleElement(term79, 1, 0.8454723071922143);
        setField(term38, term38.getClass(), "secondary", term79);
        setField(term38, term38.getClass(), "cachedQ", null);
        setField(term38, term38.getClass(), "cachedQt", null);
        setField(term38, term38.getClass(), "cachedT", null);
        setField(term25, term25.getClass(), "transformer", term38);
        setDoubleField(term25, term25.getClass(), "lowerSpectra", 0.8566567697571895);
        setDoubleField(term25, term25.getClass(), "upperSpectra", 0.9203805380592256);
        setDoubleField(term25, term25.getClass(), "minPivot", 0.5804948995371725);
        setDoubleField(term25, term25.getClass(), "sigma", 0.20737514139742264);
        setDoubleField(term25, term25.getClass(), "sigmaLow", 0.7919370314903882);
        setDoubleField(term25, term25.getClass(), "tau", 0.2109867221632754);
        setDoubleElement(term88, 0, 0.3227335400819148);
        setDoubleElement(term88, 1, 0.43337207054070237);
        setDoubleElement(term88, 2, 0.13246999699526574);
        setField(term25, term25.getClass(), "work", term88);
        setIntField(term25, term25.getClass(), "pingPong", 568599855);
        setDoubleField(term25, term25.getClass(), "qMax", 0.9126850255993704);
        setDoubleField(term25, term25.getClass(), "eMin", 0.11179067076100713);
        setIntField(term25, term25.getClass(), "tType", 1162663216);
        setDoubleField(term25, term25.getClass(), "dMin", 0.5306473989087822);
        setDoubleField(term25, term25.getClass(), "dMin1", 0.022483645678509023);
        setDoubleField(term25, term25.getClass(), "dMin2", 0.025133051616627267);
        setDoubleField(term25, term25.getClass(), "dN", 0.016575281023182953);
        setDoubleField(term25, term25.getClass(), "dN1", 0.5308350402051779);
        setDoubleField(term25, term25.getClass(), "dN2", 0.7154795600170818);
        setDoubleField(term25, term25.getClass(), "g", 0.6355029654528058);
        setDoubleElement(term103, 0, 0.0022646783892913414);
        setField(term25, term25.getClass(), "realEigenvalues", term103);
        setField(term25, term25.getClass(), "imagEigenvalues", term105);
        setField(term107, term107.getClass(), "data", term108);
        setElement(term106, 0, term107);
        setField(term109, term109.getClass(), "data", term110);
        setElement(term106, 1, term109);
        setField(term25, term25.getClass(), "eigenvectors", term106);
        setField(term25, term25.getClass(), "cachedV", null);
        setField(term25, term25.getClass(), "cachedD", null);
        setField(term25, term25.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSymmetric", argTypes, term25, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


