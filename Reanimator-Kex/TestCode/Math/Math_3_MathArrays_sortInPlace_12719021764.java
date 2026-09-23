package org.apache.commons.math3.util;

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
import org.apache.commons.math3.exception.DimensionMismatchException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MathArrays_sortInPlace_12719021764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1677;
     Object term1687;

    public MathArrays_sortInPlace_12719021764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1677 = (double[]) newDoubleArray(9);
        setDoubleElement(term1677, 0, 0.39286935532362843);
        setDoubleElement(term1677, 1, 0.11577948268926874);
        setDoubleElement(term1677, 2, 0.5617009352394552);
        setDoubleElement(term1677, 3, 0.09067063848644474);
        setDoubleElement(term1677, 4, 0.268304014379393);
        setDoubleElement(term1677, 5, 0.7171972879282721);
        setDoubleElement(term1677, 6, 0.9006361024877096);
        setDoubleElement(term1677, 7, 0.5644914462415626);
        setDoubleElement(term1677, 8, 0.509895859167191);
        term1687 = (Object[]) newArray("[D", 4);
        double[] term1688 = (double[]) newDoubleArray(8);
        double[] term1697 = (double[]) newDoubleArray(6);
        double[] term1704 = (double[]) newDoubleArray(2);
        double[] term1707 = (double[]) newDoubleArray(8);
        setDoubleElement(term1688, 0, 0.07417792024383196);
        setDoubleElement(term1688, 1, 0.686293604788188);
        setDoubleElement(term1688, 2, 0.12764449157430724);
        setDoubleElement(term1688, 3, 0.39446728256884744);
        setDoubleElement(term1688, 4, 0.7865909711092062);
        setDoubleElement(term1688, 5, 0.06587158449170749);
        setDoubleElement(term1688, 6, 0.0865998004187658);
        setDoubleElement(term1688, 7, 0.9628647861255637);
        setElement(term1687, 0, term1688);
        setDoubleElement(term1697, 0, 0.623231822150205);
        setDoubleElement(term1697, 1, 0.09037487793444521);
        setDoubleElement(term1697, 2, 0.6561919196821765);
        setDoubleElement(term1697, 3, 0.7330178886612495);
        setDoubleElement(term1697, 4, 0.7618164754425794);
        setDoubleElement(term1697, 5, 0.7385589312559342);
        setElement(term1687, 1, term1697);
        setDoubleElement(term1704, 0, 0.7080134263823477);
        setDoubleElement(term1704, 1, 0.6059734092898602);
        setElement(term1687, 2, term1704);
        setDoubleElement(term1707, 0, 0.3074693824288357);
        setDoubleElement(term1707, 1, 0.1245258965512791);
        setDoubleElement(term1707, 2, 0.9511861072660375);
        setDoubleElement(term1707, 3, 0.05880719443135807);
        setDoubleElement(term1707, 4, 0.34010089048558567);
        setDoubleElement(term1707, 5, 0.19625398866403143);
        setDoubleElement(term1707, 6, 0.45069204793711093);
        setDoubleElement(term1707, 7, 0.9341364461850963);
        setElement(term1687, 3, term1707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1677;
        args[1] = term1687;
        try {
            callMethod(klass, "sortInPlace", argTypes, null, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


