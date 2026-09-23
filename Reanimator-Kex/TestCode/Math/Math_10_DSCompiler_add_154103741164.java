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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DSCompiler_add_154103741164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9707;
     Object term9779;
     Object term9788;
     Object term9790;
     Object term9791;
     Object term9793;
     Object term9795;

    public DSCompiler_add_154103741164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9707 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term9710 = (Object[]) newArray("[I", 2);
        int[] term9711 = (int[]) newIntArray(6);
        int[] term9718 = (int[]) newIntArray(6);
        Object[] term9725 = (Object[]) newArray("[I", 6);
        int[] term9726 = (int[]) newIntArray(0);
        int[] term9727 = (int[]) newIntArray(1);
        int[] term9729 = (int[]) newIntArray(4);
        int[] term9734 = (int[]) newIntArray(2);
        int[] term9737 = (int[]) newIntArray(7);
        int[] term9745 = (int[]) newIntArray(3);
        int[] term9749 = (int[]) newIntArray(6);
        Object[] term9756 = (Object[]) newArray("[[I", 1);
        Object[] term9757 = (Object[]) newArray("[I", 3);
        int[] term9758 = (int[]) newIntArray(2);
        int[] term9761 = (int[]) newIntArray(5);
        int[] term9767 = (int[]) newIntArray(4);
        Object[] term9772 = (Object[]) newArray("[[I", 1);
        Object[] term9773 = (Object[]) newArray("[I", 1);
        int[] term9774 = (int[]) newIntArray(4);
        setIntField(term9707, term9707.getClass(), "parameters", -1903805864);
        setIntField(term9707, term9707.getClass(), "order", 751123733);
        setIntElement(term9711, 0, -2099677081);
        setIntElement(term9711, 1, -1911852008);
        setIntElement(term9711, 2, -126937505);
        setIntElement(term9711, 3, 1600311664);
        setIntElement(term9711, 4, 1505616296);
        setIntElement(term9711, 5, 453453842);
        setElement(term9710, 0, term9711);
        setIntElement(term9718, 0, 591356101);
        setIntElement(term9718, 1, 1387849981);
        setIntElement(term9718, 2, 518095920);
        setIntElement(term9718, 3, 1333750018);
        setIntElement(term9718, 4, 1824319777);
        setIntElement(term9718, 5, -942865663);
        setElement(term9710, 1, term9718);
        setField(term9707, term9707.getClass(), "sizes", term9710);
        setElement(term9725, 0, term9726);
        setIntElement(term9727, 0, 612230460);
        setElement(term9725, 1, term9727);
        setIntElement(term9729, 0, -87837417);
        setIntElement(term9729, 1, -1864680068);
        setIntElement(term9729, 2, 1979269463);
        setIntElement(term9729, 3, -1690818607);
        setElement(term9725, 2, term9729);
        setIntElement(term9734, 0, 252440319);
        setIntElement(term9734, 1, -1798089143);
        setElement(term9725, 3, term9734);
        setIntElement(term9737, 0, -2056399026);
        setIntElement(term9737, 1, -150070327);
        setIntElement(term9737, 2, -731659931);
        setIntElement(term9737, 3, 645238162);
        setIntElement(term9737, 4, -987757870);
        setIntElement(term9737, 5, 2132585005);
        setIntElement(term9737, 6, 451557051);
        setElement(term9725, 4, term9737);
        setIntElement(term9745, 0, 71783796);
        setIntElement(term9745, 1, 2085417929);
        setIntElement(term9745, 2, 644887242);
        setElement(term9725, 5, term9745);
        setField(term9707, term9707.getClass(), "derivativesIndirection", term9725);
        setIntElement(term9749, 0, 1544325432);
        setIntElement(term9749, 1, 908157389);
        setIntElement(term9749, 2, 691619263);
        setIntElement(term9749, 3, 637841150);
        setIntElement(term9749, 4, 1599041316);
        setIntElement(term9749, 5, 1478113587);
        setField(term9707, term9707.getClass(), "lowerIndirection", term9749);
        setIntElement(term9758, 0, 1580986308);
        setIntElement(term9758, 1, -870011438);
        setElement(term9757, 0, term9758);
        setIntElement(term9761, 0, -1767217325);
        setIntElement(term9761, 1, -170630873);
        setIntElement(term9761, 2, -1246900588);
        setIntElement(term9761, 3, 548633933);
        setIntElement(term9761, 4, -1532179986);
        setElement(term9757, 1, term9761);
        setIntElement(term9767, 0, 1644599689);
        setIntElement(term9767, 1, 1665477880);
        setIntElement(term9767, 2, 2044728583);
        setIntElement(term9767, 3, 64790905);
        setElement(term9757, 2, term9767);
        setElement(term9756, 0, term9757);
        setField(term9707, term9707.getClass(), "multIndirection", term9756);
        setIntElement(term9774, 0, -1199056049);
        setIntElement(term9774, 1, -1074336148);
        setIntElement(term9774, 2, -561801733);
        setIntElement(term9774, 3, 2134609936);
        setElement(term9773, 0, term9774);
        setElement(term9772, 0, term9773);
        setField(term9707, term9707.getClass(), "compIndirection", term9772);
        term9779 = (double[]) newDoubleArray(8);
        setDoubleElement(term9779, 0, 0.11179067076100713);
        setDoubleElement(term9779, 1, 0.5306473989087822);
        setDoubleElement(term9779, 2, 0.022483645678509023);
        setDoubleElement(term9779, 3, 0.025133051616627267);
        setDoubleElement(term9779, 4, 0.016575281023182953);
        setDoubleElement(term9779, 5, 0.5308350402051779);
        setDoubleElement(term9779, 6, 0.7154795600170818);
        setDoubleElement(term9779, 7, 0.6355029654528058);
        term9788 = new Integer(-409989519);
        term9790 = (double[]) newDoubleArray(0);
        term9791 = new Integer(-1293074430);
        term9793 = (double[]) newDoubleArray(1);
        setDoubleElement(term9793, 0, 0.0022646783892913414);
        term9795 = new Integer(608662433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term9779;
        args[1] = term9788;
        args[2] = term9790;
        args[3] = term9791;
        args[4] = term9793;
        args[5] = term9795;
        try {
            callMethod(klass, "add", argTypes, term9707, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


