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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class RealMatrixImpl_getPermutation_86182657690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4649;
     Object term24543;
     Object term24484;

    public RealMatrixImpl_getPermutation_86182657690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4649 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term4650 = (Object[]) newArray("[D", 2);
        double[] term4651 = (double[]) newDoubleArray(6);
        double[] term4658 = (double[]) newDoubleArray(8);
        Object[] term4667 = (Object[]) newArray("[D", 4);
        double[] term4668 = (double[]) newDoubleArray(0);
        double[] term4669 = (double[]) newDoubleArray(7);
        double[] term4677 = (double[]) newDoubleArray(3);
        double[] term4681 = (double[]) newDoubleArray(5);
        int[] term4687 = (int[]) newIntArray(9);
        setDoubleElement(term4651, 0, 0.27737512725954117);
        setDoubleElement(term4651, 1, 0.425566549289661);
        setDoubleElement(term4651, 2, 0.9909842947367329);
        setDoubleElement(term4651, 3, 0.09410007323903957);
        setDoubleElement(term4651, 4, 0.11707925397642116);
        setDoubleElement(term4651, 5, 0.9194364465405396);
        setElement(term4650, 0, term4651);
        setDoubleElement(term4658, 0, 0.2918460514910114);
        setDoubleElement(term4658, 1, 0.15069406866938573);
        setDoubleElement(term4658, 2, 0.6599209406744684);
        setDoubleElement(term4658, 3, 0.6953021816793507);
        setDoubleElement(term4658, 4, 0.4995650264719439);
        setDoubleElement(term4658, 5, 0.9574403478989912);
        setDoubleElement(term4658, 6, 0.20875173844846828);
        setDoubleElement(term4658, 7, 0.9780380255747271);
        setElement(term4650, 1, term4658);
        setField(term4649, term4649.getClass(), "data", term4650);
        setElement(term4667, 0, term4668);
        setDoubleElement(term4669, 0, 0.16772094099748935);
        setDoubleElement(term4669, 1, 0.3269789444716278);
        setDoubleElement(term4669, 2, 0.9462090166123803);
        setDoubleElement(term4669, 3, 0.025841507651104934);
        setDoubleElement(term4669, 4, 0.10758051417101444);
        setDoubleElement(term4669, 5, 0.18122798538594065);
        setDoubleElement(term4669, 6, 0.45109413827851297);
        setElement(term4667, 1, term4669);
        setDoubleElement(term4677, 0, 0.7159384496399914);
        setDoubleElement(term4677, 1, 0.22929607774606342);
        setDoubleElement(term4677, 2, 0.7824997546823239);
        setElement(term4667, 2, term4677);
        setDoubleElement(term4681, 0, 0.559924713229934);
        setDoubleElement(term4681, 1, 0.018560091730935646);
        setDoubleElement(term4681, 2, 0.6287445113589258);
        setDoubleElement(term4681, 3, 0.5972278507965504);
        setDoubleElement(term4681, 4, 0.1375338215620644);
        setElement(term4667, 3, term4681);
        setField(term4649, term4649.getClass(), "lu", term4667);
        setIntElement(term4687, 0, 318591690);
        setIntElement(term4687, 1, -165587447);
        setIntElement(term4687, 2, -1347358701);
        setIntElement(term4687, 3, 806595993);
        setIntElement(term4687, 4, 548228925);
        setIntElement(term4687, 5, -749861210);
        setIntElement(term4687, 6, 1694224101);
        setIntElement(term4687, 7, 937859191);
        setIntElement(term4687, 8, -916584829);
        setField(term4649, term4649.getClass(), "permutation", term4687);
        setIntField(term4649, term4649.getClass(), "parity", 1);
        term24543 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term24544 = (Object[]) newArray("[D", 2);
        double[] term24545 = (double[]) newDoubleArray(6);
        double[] term24546 = (double[]) newDoubleArray(8);
        Object[] term24547 = (Object[]) newArray("[D", 4);
        double[] term24548 = (double[]) newDoubleArray(0);
        double[] term24549 = (double[]) newDoubleArray(7);
        double[] term24550 = (double[]) newDoubleArray(3);
        double[] term24551 = (double[]) newDoubleArray(5);
        int[] term24552 = (int[]) newIntArray(9);
        setDoubleElement(term24545, 0, 0.27737512725954117);
        setDoubleElement(term24545, 1, 0.425566549289661);
        setDoubleElement(term24545, 2, 0.9909842947367329);
        setDoubleElement(term24545, 3, 0.09410007323903957);
        setDoubleElement(term24545, 4, 0.11707925397642116);
        setDoubleElement(term24545, 5, 0.9194364465405396);
        setElement(term24544, 0, term24545);
        setDoubleElement(term24546, 0, 0.2918460514910114);
        setDoubleElement(term24546, 1, 0.15069406866938573);
        setDoubleElement(term24546, 2, 0.6599209406744684);
        setDoubleElement(term24546, 3, 0.6953021816793507);
        setDoubleElement(term24546, 4, 0.4995650264719439);
        setDoubleElement(term24546, 5, 0.9574403478989912);
        setDoubleElement(term24546, 6, 0.20875173844846828);
        setDoubleElement(term24546, 7, 0.9780380255747271);
        setElement(term24544, 1, term24546);
        setField(term24543, term24543.getClass(), "data", term24544);
        setElement(term24547, 0, term24548);
        setDoubleElement(term24549, 0, 0.16772094099748935);
        setDoubleElement(term24549, 1, 0.3269789444716278);
        setDoubleElement(term24549, 2, 0.9462090166123803);
        setDoubleElement(term24549, 3, 0.025841507651104934);
        setDoubleElement(term24549, 4, 0.10758051417101444);
        setDoubleElement(term24549, 5, 0.18122798538594065);
        setDoubleElement(term24549, 6, 0.45109413827851297);
        setElement(term24547, 1, term24549);
        setDoubleElement(term24550, 0, 0.7159384496399914);
        setDoubleElement(term24550, 1, 0.22929607774606342);
        setDoubleElement(term24550, 2, 0.7824997546823239);
        setElement(term24547, 2, term24550);
        setDoubleElement(term24551, 0, 0.559924713229934);
        setDoubleElement(term24551, 1, 0.018560091730935646);
        setDoubleElement(term24551, 2, 0.6287445113589258);
        setDoubleElement(term24551, 3, 0.5972278507965504);
        setDoubleElement(term24551, 4, 0.1375338215620644);
        setElement(term24547, 3, term24551);
        setField(term24543, term24543.getClass(), "lu", term24547);
        setIntElement(term24552, 0, 318591690);
        setIntElement(term24552, 1, -165587447);
        setIntElement(term24552, 2, -1347358701);
        setIntElement(term24552, 3, 806595993);
        setIntElement(term24552, 4, 548228925);
        setIntElement(term24552, 5, -749861210);
        setIntElement(term24552, 6, 1694224101);
        setIntElement(term24552, 7, 937859191);
        setIntElement(term24552, 8, -916584829);
        setField(term24543, term24543.getClass(), "permutation", term24552);
        setIntField(term24543, term24543.getClass(), "parity", 1);
        term24484 = (int[]) newIntArray(9);
        setIntElement(term24484, 0, 318591690);
        setIntElement(term24484, 1, -165587447);
        setIntElement(term24484, 2, -1347358701);
        setIntElement(term24484, 3, 806595993);
        setIntElement(term24484, 4, 548228925);
        setIntElement(term24484, 5, -749861210);
        setIntElement(term24484, 6, 1694224101);
        setIntElement(term24484, 7, 937859191);
        setIntElement(term24484, 8, -916584829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPermutation", argTypes, term4649, args);
        assertTrue(recursiveEquals(term4649, term24543));
        assertTrue(recursiveEquals(retValue, term24484));
    }

};


