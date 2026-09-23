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

public class RealMatrixImpl_multiply_168286026259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916;

    public RealMatrixImpl_multiply_168286026259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term916 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term917 = (Object[]) newArray("[D", 5);
        double[] term918 = (double[]) newDoubleArray(3);
        double[] term922 = (double[]) newDoubleArray(2);
        double[] term925 = (double[]) newDoubleArray(2);
        double[] term928 = (double[]) newDoubleArray(5);
        double[] term934 = (double[]) newDoubleArray(4);
        Object[] term939 = (Object[]) newArray("[D", 8);
        double[] term940 = (double[]) newDoubleArray(0);
        double[] term941 = (double[]) newDoubleArray(5);
        double[] term947 = (double[]) newDoubleArray(4);
        double[] term952 = (double[]) newDoubleArray(1);
        double[] term954 = (double[]) newDoubleArray(0);
        double[] term955 = (double[]) newDoubleArray(6);
        double[] term962 = (double[]) newDoubleArray(3);
        double[] term966 = (double[]) newDoubleArray(4);
        int[] term971 = (int[]) newIntArray(5);
        setDoubleElement(term918, 0, 0.33340230026214834);
        setDoubleElement(term918, 1, 0.7912735654922212);
        setDoubleElement(term918, 2, 0.7177162541558186);
        setElement(term917, 0, term918);
        setDoubleElement(term922, 0, 0.4751993224281752);
        setDoubleElement(term922, 1, 0.246784352391756);
        setElement(term917, 1, term922);
        setDoubleElement(term925, 0, 0.6746769370801629);
        setDoubleElement(term925, 1, 0.09436531082165778);
        setElement(term917, 2, term925);
        setDoubleElement(term928, 0, 0.1882701721081318);
        setDoubleElement(term928, 1, 0.20230843747579808);
        setDoubleElement(term928, 2, 0.4995447078885714);
        setDoubleElement(term928, 3, 0.19855958465701706);
        setDoubleElement(term928, 4, 0.6202418999768349);
        setElement(term917, 3, term928);
        setDoubleElement(term934, 0, 0.9848907582209794);
        setDoubleElement(term934, 1, 0.9658751931880928);
        setDoubleElement(term934, 2, 0.6990187833274262);
        setDoubleElement(term934, 3, 0.6970994777067232);
        setElement(term917, 4, term934);
        setField(term916, term916.getClass(), "data", term917);
        setElement(term939, 0, term940);
        setDoubleElement(term941, 0, 0.4309992370378436);
        setDoubleElement(term941, 1, 0.4228091725302011);
        setDoubleElement(term941, 2, 0.9148340457558121);
        setDoubleElement(term941, 3, 0.5671889474210299);
        setDoubleElement(term941, 4, 0.12331301462770328);
        setElement(term939, 1, term941);
        setDoubleElement(term947, 0, 0.07338333983034873);
        setDoubleElement(term947, 1, 0.9205377491648612);
        setDoubleElement(term947, 2, 0.5496976557562384);
        setDoubleElement(term947, 3, 0.528799251950027);
        setElement(term939, 2, term947);
        setDoubleElement(term952, 0, 0.8870518852812378);
        setElement(term939, 3, term952);
        setElement(term939, 4, term954);
        setDoubleElement(term955, 0, 0.8540665765438992);
        setDoubleElement(term955, 1, 0.7936653683273087);
        setDoubleElement(term955, 2, 0.6999892183282963);
        setDoubleElement(term955, 3, 0.4376587023760947);
        setDoubleElement(term955, 4, 0.5498407122477659);
        setDoubleElement(term955, 5, 0.3715546102192131);
        setElement(term939, 5, term955);
        setDoubleElement(term962, 0, 0.07818003953962671);
        setDoubleElement(term962, 1, 0.3737994354904751);
        setDoubleElement(term962, 2, 0.4912523542152032);
        setElement(term939, 6, term962);
        setDoubleElement(term966, 0, 0.5987936532910646);
        setDoubleElement(term966, 1, 0.5124845253152773);
        setDoubleElement(term966, 2, 0.12402111287123307);
        setDoubleElement(term966, 3, 0.6051772835079735);
        setElement(term939, 7, term966);
        setField(term916, term916.getClass(), "lu", term939);
        setIntElement(term971, 0, 767834723);
        setIntElement(term971, 1, -602026508);
        setIntElement(term971, 2, -157887805);
        setIntElement(term971, 3, 1876565163);
        setIntElement(term971, 4, -817164822);
        setField(term916, term916.getClass(), "permutation", term971);
        setIntField(term916, term916.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "multiply", argTypes, term916, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


