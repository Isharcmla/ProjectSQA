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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RealMatrixImpl_getSubMatrix_173137141465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1719;
     Object term1788;
     Object term1790;
     Object term1792;
     Object term1794;

    public RealMatrixImpl_getSubMatrix_173137141465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1719 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term1720 = (Object[]) newArray("[D", 5);
        double[] term1721 = (double[]) newDoubleArray(5);
        double[] term1727 = (double[]) newDoubleArray(2);
        double[] term1730 = (double[]) newDoubleArray(9);
        double[] term1740 = (double[]) newDoubleArray(8);
        double[] term1749 = (double[]) newDoubleArray(0);
        Object[] term1750 = (Object[]) newArray("[D", 7);
        double[] term1751 = (double[]) newDoubleArray(9);
        double[] term1761 = (double[]) newDoubleArray(7);
        double[] term1769 = (double[]) newDoubleArray(1);
        double[] term1771 = (double[]) newDoubleArray(5);
        double[] term1777 = (double[]) newDoubleArray(2);
        double[] term1780 = (double[]) newDoubleArray(3);
        double[] term1784 = (double[]) newDoubleArray(1);
        int[] term1786 = (int[]) newIntArray(0);
        setDoubleElement(term1721, 0, 0.6520642215589585);
        setDoubleElement(term1721, 1, 0.6959468578206445);
        setDoubleElement(term1721, 2, 0.6603256350245514);
        setDoubleElement(term1721, 3, 0.45582395344416426);
        setDoubleElement(term1721, 4, 0.720385557578407);
        setElement(term1720, 0, term1721);
        setDoubleElement(term1727, 0, 0.3056807318906033);
        setDoubleElement(term1727, 1, 0.6900630482766184);
        setElement(term1720, 1, term1727);
        setDoubleElement(term1730, 0, 0.46055414536796613);
        setDoubleElement(term1730, 1, 0.7658890382866111);
        setDoubleElement(term1730, 2, 0.5749950495796489);
        setDoubleElement(term1730, 3, 0.7319834414419222);
        setDoubleElement(term1730, 4, 0.6391065297971349);
        setDoubleElement(term1730, 5, 0.9628659979498808);
        setDoubleElement(term1730, 6, 0.8270741986815247);
        setDoubleElement(term1730, 7, 0.2857569007031385);
        setDoubleElement(term1730, 8, 0.10432254828003162);
        setElement(term1720, 2, term1730);
        setDoubleElement(term1740, 0, 0.550709113162105);
        setDoubleElement(term1740, 1, 0.9252082867478522);
        setDoubleElement(term1740, 2, 0.9497134088791012);
        setDoubleElement(term1740, 3, 0.16146812433558666);
        setDoubleElement(term1740, 4, 0.26579782661001083);
        setDoubleElement(term1740, 5, 0.18486152840004733);
        setDoubleElement(term1740, 6, 0.5203027258462796);
        setDoubleElement(term1740, 7, 0.3060932006026843);
        setElement(term1720, 3, term1740);
        setElement(term1720, 4, term1749);
        setField(term1719, term1719.getClass(), "data", term1720);
        setDoubleElement(term1751, 0, 0.07426901108168338);
        setDoubleElement(term1751, 1, 0.14479972505921546);
        setDoubleElement(term1751, 2, 0.4846786969921817);
        setDoubleElement(term1751, 3, 0.8988977247873451);
        setDoubleElement(term1751, 4, 0.12770018571966624);
        setDoubleElement(term1751, 5, 0.4007990803440893);
        setDoubleElement(term1751, 6, 0.291814792946269);
        setDoubleElement(term1751, 7, 0.6259114447412901);
        setDoubleElement(term1751, 8, 0.5795537811016872);
        setElement(term1750, 0, term1751);
        setDoubleElement(term1761, 0, 0.36659032749875975);
        setDoubleElement(term1761, 1, 0.70650233569157);
        setDoubleElement(term1761, 2, 0.8415518857467591);
        setDoubleElement(term1761, 3, 0.2722999517593325);
        setDoubleElement(term1761, 4, 0.3940760506335459);
        setDoubleElement(term1761, 5, 0.6257789340937572);
        setDoubleElement(term1761, 6, 0.2876331964157256);
        setElement(term1750, 1, term1761);
        setDoubleElement(term1769, 0, 0.3334570821940357);
        setElement(term1750, 2, term1769);
        setDoubleElement(term1771, 0, 0.15849110617799977);
        setDoubleElement(term1771, 1, 0.9687791556617598);
        setDoubleElement(term1771, 2, 0.48315612207780667);
        setDoubleElement(term1771, 3, 0.40335832912344194);
        setDoubleElement(term1771, 4, 0.5940588918649367);
        setElement(term1750, 3, term1771);
        setDoubleElement(term1777, 0, 0.638695515317724);
        setDoubleElement(term1777, 1, 0.2877172243103391);
        setElement(term1750, 4, term1777);
        setDoubleElement(term1780, 0, 0.558273893048355);
        setDoubleElement(term1780, 1, 0.9518298975908273);
        setDoubleElement(term1780, 2, 0.0994826944883106);
        setElement(term1750, 5, term1780);
        setDoubleElement(term1784, 0, 0.7556333590365407);
        setElement(term1750, 6, term1784);
        setField(term1719, term1719.getClass(), "lu", term1750);
        setField(term1719, term1719.getClass(), "permutation", term1786);
        setIntField(term1719, term1719.getClass(), "parity", 1);
        term1788 = new Integer(287287233);
        term1790 = new Integer(962840079);
        term1792 = new Integer(1540719661);
        term1794 = new Integer(1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term1788;
        args[1] = term1790;
        args[2] = term1792;
        args[3] = term1794;
        try {
            callMethod(klass, "getSubMatrix", argTypes, term1719, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


