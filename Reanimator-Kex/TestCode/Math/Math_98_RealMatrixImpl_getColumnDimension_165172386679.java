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

public class RealMatrixImpl_getColumnDimension_165172386679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3278;
     Object term19929;

    public RealMatrixImpl_getColumnDimension_165172386679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3278 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term3279 = (Object[]) newArray("[D", 8);
        double[] term3280 = (double[]) newDoubleArray(8);
        double[] term3289 = (double[]) newDoubleArray(1);
        double[] term3291 = (double[]) newDoubleArray(1);
        double[] term3293 = (double[]) newDoubleArray(9);
        double[] term3303 = (double[]) newDoubleArray(1);
        double[] term3305 = (double[]) newDoubleArray(4);
        double[] term3310 = (double[]) newDoubleArray(0);
        double[] term3311 = (double[]) newDoubleArray(2);
        Object[] term3314 = (Object[]) newArray("[D", 1);
        double[] term3315 = (double[]) newDoubleArray(1);
        int[] term3317 = (int[]) newIntArray(8);
        setDoubleElement(term3280, 0, 0.6506349057119887);
        setDoubleElement(term3280, 1, 0.13005892834452748);
        setDoubleElement(term3280, 2, 0.24685644348529212);
        setDoubleElement(term3280, 3, 0.08742954462482633);
        setDoubleElement(term3280, 4, 0.8032994398981518);
        setDoubleElement(term3280, 5, 0.1358203057417402);
        setDoubleElement(term3280, 6, 0.7714520264828358);
        setDoubleElement(term3280, 7, 0.11223044807975435);
        setElement(term3279, 0, term3280);
        setDoubleElement(term3289, 0, 0.7861285218058128);
        setElement(term3279, 1, term3289);
        setDoubleElement(term3291, 0, 0.6842542833308128);
        setElement(term3279, 2, term3291);
        setDoubleElement(term3293, 0, 0.18591063651254836);
        setDoubleElement(term3293, 1, 0.37104341307048727);
        setDoubleElement(term3293, 2, 0.5941630025842942);
        setDoubleElement(term3293, 3, 0.21339098072821405);
        setDoubleElement(term3293, 4, 0.3791266695959429);
        setDoubleElement(term3293, 5, 0.9050806149824263);
        setDoubleElement(term3293, 6, 0.8531473832220273);
        setDoubleElement(term3293, 7, 0.937712942560723);
        setDoubleElement(term3293, 8, 0.35856029184904714);
        setElement(term3279, 3, term3293);
        setDoubleElement(term3303, 0, 0.4031608999936618);
        setElement(term3279, 4, term3303);
        setDoubleElement(term3305, 0, 0.40257209919252257);
        setDoubleElement(term3305, 1, 0.5933679520580496);
        setDoubleElement(term3305, 2, 0.6802287136909007);
        setDoubleElement(term3305, 3, 0.06627571986412484);
        setElement(term3279, 5, term3305);
        setElement(term3279, 6, term3310);
        setDoubleElement(term3311, 0, 0.8009236950717997);
        setDoubleElement(term3311, 1, 0.867255255836157);
        setElement(term3279, 7, term3311);
        setField(term3278, term3278.getClass(), "data", term3279);
        setDoubleElement(term3315, 0, 0.4007133474762271);
        setElement(term3314, 0, term3315);
        setField(term3278, term3278.getClass(), "lu", term3314);
        setIntElement(term3317, 0, -1697741339);
        setIntElement(term3317, 1, 98922530);
        setIntElement(term3317, 2, -1388471422);
        setIntElement(term3317, 3, -1498296052);
        setIntElement(term3317, 4, 2098647989);
        setIntElement(term3317, 5, 1598895173);
        setIntElement(term3317, 6, 1830648570);
        setIntElement(term3317, 7, -227365013);
        setField(term3278, term3278.getClass(), "permutation", term3317);
        setIntField(term3278, term3278.getClass(), "parity", 1);
        term19929 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term19930 = (Object[]) newArray("[D", 8);
        double[] term19931 = (double[]) newDoubleArray(8);
        double[] term19932 = (double[]) newDoubleArray(1);
        double[] term19933 = (double[]) newDoubleArray(1);
        double[] term19934 = (double[]) newDoubleArray(9);
        double[] term19935 = (double[]) newDoubleArray(1);
        double[] term19936 = (double[]) newDoubleArray(4);
        double[] term19937 = (double[]) newDoubleArray(0);
        double[] term19938 = (double[]) newDoubleArray(2);
        Object[] term19939 = (Object[]) newArray("[D", 1);
        double[] term19940 = (double[]) newDoubleArray(1);
        int[] term19941 = (int[]) newIntArray(8);
        setDoubleElement(term19931, 0, 0.6506349057119887);
        setDoubleElement(term19931, 1, 0.13005892834452748);
        setDoubleElement(term19931, 2, 0.24685644348529212);
        setDoubleElement(term19931, 3, 0.08742954462482633);
        setDoubleElement(term19931, 4, 0.8032994398981518);
        setDoubleElement(term19931, 5, 0.1358203057417402);
        setDoubleElement(term19931, 6, 0.7714520264828358);
        setDoubleElement(term19931, 7, 0.11223044807975435);
        setElement(term19930, 0, term19931);
        setDoubleElement(term19932, 0, 0.7861285218058128);
        setElement(term19930, 1, term19932);
        setDoubleElement(term19933, 0, 0.6842542833308128);
        setElement(term19930, 2, term19933);
        setDoubleElement(term19934, 0, 0.18591063651254836);
        setDoubleElement(term19934, 1, 0.37104341307048727);
        setDoubleElement(term19934, 2, 0.5941630025842942);
        setDoubleElement(term19934, 3, 0.21339098072821405);
        setDoubleElement(term19934, 4, 0.3791266695959429);
        setDoubleElement(term19934, 5, 0.9050806149824263);
        setDoubleElement(term19934, 6, 0.8531473832220273);
        setDoubleElement(term19934, 7, 0.937712942560723);
        setDoubleElement(term19934, 8, 0.35856029184904714);
        setElement(term19930, 3, term19934);
        setDoubleElement(term19935, 0, 0.4031608999936618);
        setElement(term19930, 4, term19935);
        setDoubleElement(term19936, 0, 0.40257209919252257);
        setDoubleElement(term19936, 1, 0.5933679520580496);
        setDoubleElement(term19936, 2, 0.6802287136909007);
        setDoubleElement(term19936, 3, 0.06627571986412484);
        setElement(term19930, 5, term19936);
        setElement(term19930, 6, term19937);
        setDoubleElement(term19938, 0, 0.8009236950717997);
        setDoubleElement(term19938, 1, 0.867255255836157);
        setElement(term19930, 7, term19938);
        setField(term19929, term19929.getClass(), "data", term19930);
        setDoubleElement(term19940, 0, 0.4007133474762271);
        setElement(term19939, 0, term19940);
        setField(term19929, term19929.getClass(), "lu", term19939);
        setIntElement(term19941, 0, -1697741339);
        setIntElement(term19941, 1, 98922530);
        setIntElement(term19941, 2, -1388471422);
        setIntElement(term19941, 3, -1498296052);
        setIntElement(term19941, 4, 2098647989);
        setIntElement(term19941, 5, 1598895173);
        setIntElement(term19941, 6, 1830648570);
        setIntElement(term19941, 7, -227365013);
        setField(term19929, term19929.getClass(), "permutation", term19941);
        setIntField(term19929, term19929.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnDimension", argTypes, term3278, args);
        assertTrue(recursiveEquals(term3278, term19929));
        assertTrue(recursiveEquals(retValue, 8));
    }

};


