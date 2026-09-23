package org.apache.commons.math3.analysis.differentiation;

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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DSCompiler_acos_48241425100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17039;
     Object term17115;
     Object term17116;
     Object term17118;
     Object term17126;

    public DSCompiler_acos_48241425100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17039 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term17042 = (Object[]) newArray("[I", 1);
        int[] term17043 = (int[]) newIntArray(4);
        Object[] term17048 = (Object[]) newArray("[I", 9);
        int[] term17049 = (int[]) newIntArray(1);
        int[] term17051 = (int[]) newIntArray(5);
        int[] term17057 = (int[]) newIntArray(3);
        int[] term17061 = (int[]) newIntArray(4);
        int[] term17066 = (int[]) newIntArray(7);
        int[] term17074 = (int[]) newIntArray(8);
        int[] term17083 = (int[]) newIntArray(6);
        int[] term17090 = (int[]) newIntArray(2);
        int[] term17093 = (int[]) newIntArray(9);
        int[] term17103 = (int[]) newIntArray(9);
        Object[] term17113 = (Object[]) newArray("[[I", 0);
        Object[] term17114 = (Object[]) newArray("[[I", 0);
        setIntField(term17039, term17039.getClass(), "parameters", -2020163854);
        setIntField(term17039, term17039.getClass(), "order", -806823193);
        setIntElement(term17043, 0, 128449587);
        setIntElement(term17043, 1, 1470799236);
        setIntElement(term17043, 2, -2013078692);
        setIntElement(term17043, 3, -911027260);
        setElement(term17042, 0, term17043);
        setField(term17039, term17039.getClass(), "sizes", term17042);
        setIntElement(term17049, 0, 1971287649);
        setElement(term17048, 0, term17049);
        setIntElement(term17051, 0, -1688662880);
        setIntElement(term17051, 1, 635942792);
        setIntElement(term17051, 2, -126969868);
        setIntElement(term17051, 3, 1605804678);
        setIntElement(term17051, 4, -1830340335);
        setElement(term17048, 1, term17051);
        setIntElement(term17057, 0, 439648027);
        setIntElement(term17057, 1, 702556555);
        setIntElement(term17057, 2, 1868194288);
        setElement(term17048, 2, term17057);
        setIntElement(term17061, 0, 517487974);
        setIntElement(term17061, 1, -1609952826);
        setIntElement(term17061, 2, -2135129588);
        setIntElement(term17061, 3, -1453667786);
        setElement(term17048, 3, term17061);
        setIntElement(term17066, 0, 390534071);
        setIntElement(term17066, 1, 134001300);
        setIntElement(term17066, 2, -1533628114);
        setIntElement(term17066, 3, 886396590);
        setIntElement(term17066, 4, -1864639476);
        setIntElement(term17066, 5, 233887874);
        setIntElement(term17066, 6, 1421452259);
        setElement(term17048, 4, term17066);
        setIntElement(term17074, 0, 2051816737);
        setIntElement(term17074, 1, 191145214);
        setIntElement(term17074, 2, 597423188);
        setIntElement(term17074, 3, 170448789);
        setIntElement(term17074, 4, -105784895);
        setIntElement(term17074, 5, -190866786);
        setIntElement(term17074, 6, -1192542298);
        setIntElement(term17074, 7, 1742896562);
        setElement(term17048, 5, term17074);
        setIntElement(term17083, 0, -1205180837);
        setIntElement(term17083, 1, 1782497174);
        setIntElement(term17083, 2, 354412864);
        setIntElement(term17083, 3, -1323183254);
        setIntElement(term17083, 4, 366309576);
        setIntElement(term17083, 5, 202085518);
        setElement(term17048, 6, term17083);
        setIntElement(term17090, 0, -527355218);
        setIntElement(term17090, 1, 1946726839);
        setElement(term17048, 7, term17090);
        setIntElement(term17093, 0, 185844905);
        setIntElement(term17093, 1, 1821594065);
        setIntElement(term17093, 2, 888820496);
        setIntElement(term17093, 3, 1745066397);
        setIntElement(term17093, 4, 47561810);
        setIntElement(term17093, 5, -1708484817);
        setIntElement(term17093, 6, 574829358);
        setIntElement(term17093, 7, 179028147);
        setIntElement(term17093, 8, -1077334778);
        setElement(term17048, 8, term17093);
        setField(term17039, term17039.getClass(), "derivativesIndirection", term17048);
        setIntElement(term17103, 0, -845040092);
        setIntElement(term17103, 1, -1659873585);
        setIntElement(term17103, 2, 1881072097);
        setIntElement(term17103, 3, 1677550181);
        setIntElement(term17103, 4, 1710291513);
        setIntElement(term17103, 5, -464025782);
        setIntElement(term17103, 6, -1392716182);
        setIntElement(term17103, 7, -251208414);
        setIntElement(term17103, 8, 2058785706);
        setField(term17039, term17039.getClass(), "lowerIndirection", term17103);
        setField(term17039, term17039.getClass(), "multIndirection", term17113);
        setField(term17039, term17039.getClass(), "compIndirection", term17114);
        term17115 = (double[]) newDoubleArray(0);
        term17116 = new Integer(-1996745891);
        term17118 = (double[]) newDoubleArray(7);
        setDoubleElement(term17118, 0, 0.4395312828193261);
        setDoubleElement(term17118, 1, 0.5715204226647931);
        setDoubleElement(term17118, 2, 0.6420798930164424);
        setDoubleElement(term17118, 3, 0.0011409626665044303);
        setDoubleElement(term17118, 4, 0.5195852993308188);
        setDoubleElement(term17118, 5, 0.6533293939565151);
        setDoubleElement(term17118, 6, 0.7361083671494018);
        term17126 = new Integer(615988012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term17115;
        args[1] = term17116;
        args[2] = term17118;
        args[3] = term17126;
        try {
            callMethod(klass, "acos", argTypes, term17039, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


