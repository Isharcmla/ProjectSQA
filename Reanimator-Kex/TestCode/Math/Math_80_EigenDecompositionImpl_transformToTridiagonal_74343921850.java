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

public class EigenDecompositionImpl_transformToTridiagonal_74343921850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1749;

    public EigenDecompositionImpl_transformToTridiagonal_74343921850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1749 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term1751 = (double[]) newDoubleArray(2);
        double[] term1754 = (double[]) newDoubleArray(0);
        double[] term1755 = (double[]) newDoubleArray(6);
        Object term1762 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term1763 = (Object[]) newArray("[D", 1);
        double[] term1764 = (double[]) newDoubleArray(2);
        double[] term1767 = (double[]) newDoubleArray(4);
        double[] term1772 = (double[]) newDoubleArray(4);
        double[] term1783 = (double[]) newDoubleArray(8);
        double[] term1803 = (double[]) newDoubleArray(7);
        double[] term1811 = (double[]) newDoubleArray(5);
        Object[] term1817 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 5);
        Object term1818 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1819 = (double[]) newDoubleArray(0);
        Object term1820 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1821 = (double[]) newDoubleArray(0);
        Object term1822 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1823 = (double[]) newDoubleArray(0);
        Object term1824 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1825 = (double[]) newDoubleArray(0);
        Object term1826 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1827 = (double[]) newDoubleArray(0);
        setDoubleField(term1749, term1749.getClass(), "splitTolerance", 0.7794021169202232);
        setDoubleElement(term1751, 0, 0.17528851201626494);
        setDoubleElement(term1751, 1, 0.9832782789384902);
        setField(term1749, term1749.getClass(), "main", term1751);
        setField(term1749, term1749.getClass(), "secondary", term1754);
        setDoubleElement(term1755, 0, 0.6571101155689184);
        setDoubleElement(term1755, 1, 0.5070134415466635);
        setDoubleElement(term1755, 2, 0.9330567218798436);
        setDoubleElement(term1755, 3, 0.1452204834065195);
        setDoubleElement(term1755, 4, 0.04732617365922176);
        setDoubleElement(term1755, 5, 0.007179961925217526);
        setField(term1749, term1749.getClass(), "squaredSecondary", term1755);
        setDoubleElement(term1764, 0, 0.2368712300344461);
        setDoubleElement(term1764, 1, 0.9377667036664316);
        setElement(term1763, 0, term1764);
        setField(term1762, term1762.getClass(), "householderVectors", term1763);
        setDoubleElement(term1767, 0, 0.8863099799682007);
        setDoubleElement(term1767, 1, 0.8361530707429777);
        setDoubleElement(term1767, 2, 0.5264336188208859);
        setDoubleElement(term1767, 3, 0.3803734512496052);
        setField(term1762, term1762.getClass(), "main", term1767);
        setDoubleElement(term1772, 0, 0.4215991359766782);
        setDoubleElement(term1772, 1, 0.8485928043846015);
        setDoubleElement(term1772, 2, 0.3422470250555786);
        setDoubleElement(term1772, 3, 0.5174310198002574);
        setField(term1762, term1762.getClass(), "secondary", term1772);
        setField(term1762, term1762.getClass(), "cachedQ", null);
        setField(term1762, term1762.getClass(), "cachedQt", null);
        setField(term1762, term1762.getClass(), "cachedT", null);
        setField(term1749, term1749.getClass(), "transformer", term1762);
        setDoubleField(term1749, term1749.getClass(), "lowerSpectra", 0.15978842530590698);
        setDoubleField(term1749, term1749.getClass(), "upperSpectra", 0.3938367676460294);
        setDoubleField(term1749, term1749.getClass(), "minPivot", 0.8198571367447252);
        setDoubleField(term1749, term1749.getClass(), "sigma", 0.5077880926168821);
        setDoubleField(term1749, term1749.getClass(), "sigmaLow", 0.8872393368594799);
        setDoubleField(term1749, term1749.getClass(), "tau", 0.4446537162968065);
        setDoubleElement(term1783, 0, 0.25562338666414663);
        setDoubleElement(term1783, 1, 0.3426382336318774);
        setDoubleElement(term1783, 2, 0.27472560177149286);
        setDoubleElement(term1783, 3, 0.9147378755448754);
        setDoubleElement(term1783, 4, 0.6665364546645218);
        setDoubleElement(term1783, 5, 0.6965590169168311);
        setDoubleElement(term1783, 6, 0.33472159894348086);
        setDoubleElement(term1783, 7, 0.2698328402687743);
        setField(term1749, term1749.getClass(), "work", term1783);
        setIntField(term1749, term1749.getClass(), "pingPong", 865208305);
        setDoubleField(term1749, term1749.getClass(), "qMax", 0.873043035203148);
        setDoubleField(term1749, term1749.getClass(), "eMin", 0.5932535509159211);
        setIntField(term1749, term1749.getClass(), "tType", -1275173084);
        setDoubleField(term1749, term1749.getClass(), "dMin", 0.059611302990266846);
        setDoubleField(term1749, term1749.getClass(), "dMin1", 0.29225699525915894);
        setDoubleField(term1749, term1749.getClass(), "dMin2", 0.39653472969283077);
        setDoubleField(term1749, term1749.getClass(), "dN", 0.15055062571842626);
        setDoubleField(term1749, term1749.getClass(), "dN1", 0.2849157687292415);
        setDoubleField(term1749, term1749.getClass(), "dN2", 0.5197346036604176);
        setDoubleField(term1749, term1749.getClass(), "g", 0.3821023664998483);
        setDoubleElement(term1803, 0, 0.6584787211782301);
        setDoubleElement(term1803, 1, 0.1937075341828559);
        setDoubleElement(term1803, 2, 0.44682046821312316);
        setDoubleElement(term1803, 3, 0.8323532236646399);
        setDoubleElement(term1803, 4, 0.6397358922018691);
        setDoubleElement(term1803, 5, 0.9066998853505908);
        setDoubleElement(term1803, 6, 0.05083782629282396);
        setField(term1749, term1749.getClass(), "realEigenvalues", term1803);
        setDoubleElement(term1811, 0, 0.6695336994403062);
        setDoubleElement(term1811, 1, 0.34363635678920734);
        setDoubleElement(term1811, 2, 0.28707058137195374);
        setDoubleElement(term1811, 3, 0.584132621410495);
        setDoubleElement(term1811, 4, 0.5308945693939473);
        setField(term1749, term1749.getClass(), "imagEigenvalues", term1811);
        setField(term1818, term1818.getClass(), "data", term1819);
        setElement(term1817, 0, term1818);
        setField(term1820, term1820.getClass(), "data", term1821);
        setElement(term1817, 1, term1820);
        setField(term1822, term1822.getClass(), "data", term1823);
        setElement(term1817, 2, term1822);
        setField(term1824, term1824.getClass(), "data", term1825);
        setElement(term1817, 3, term1824);
        setField(term1826, term1826.getClass(), "data", term1827);
        setElement(term1817, 4, term1826);
        setField(term1749, term1749.getClass(), "eigenvectors", term1817);
        setField(term1749, term1749.getClass(), "cachedV", null);
        setField(term1749, term1749.getClass(), "cachedD", null);
        setField(term1749, term1749.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transformToTridiagonal", argTypes, term1749, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


