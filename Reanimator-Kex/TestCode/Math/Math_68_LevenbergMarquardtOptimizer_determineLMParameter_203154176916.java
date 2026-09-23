package org.apache.commons.math.optimization.general;

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
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class LevenbergMarquardtOptimizer_determineLMParameter_203154176916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term913;
     Object term1010;
     Object term1015;
     Object term1017;
     Object term1019;
     Object term1020;
     Object term1022;

    public LevenbergMarquardtOptimizer_determineLMParameter_203154176916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term913 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term915 = (double[]) newDoubleArray(8);
        double[] term924 = (double[]) newDoubleArray(6);
        double[] term931 = (double[]) newDoubleArray(2);
        int[] term934 = (int[]) newIntArray(1);
        double[] term938 = (double[]) newDoubleArray(5);
        Object term948 = newInstance(Class.forName("org.apache.commons.math.optimization.SimpleVectorialValueChecker"));
        Object[] term951 = (Object[]) newArray("[D", 3);
        double[] term952 = (double[]) newDoubleArray(9);
        double[] term962 = (double[]) newDoubleArray(7);
        double[] term970 = (double[]) newDoubleArray(6);
        double[] term979 = (double[]) newDoubleArray(5);
        double[] term985 = (double[]) newDoubleArray(3);
        double[] term989 = (double[]) newDoubleArray(4);
        double[] term994 = (double[]) newDoubleArray(8);
        double[] term1003 = (double[]) newDoubleArray(0);
        setIntField(term913, term913.getClass(), "solvedCols", 579005622);
        setDoubleElement(term915, 0, 0.20230843747579808);
        setDoubleElement(term915, 1, 0.4995447078885714);
        setDoubleElement(term915, 2, 0.19855958465701706);
        setDoubleElement(term915, 3, 0.6202418999768349);
        setDoubleElement(term915, 4, 0.9848907582209794);
        setDoubleElement(term915, 5, 0.9658751931880928);
        setDoubleElement(term915, 6, 0.6990187833274262);
        setDoubleElement(term915, 7, 0.6970994777067232);
        setField(term913, term913.getClass(), "diagR", term915);
        setDoubleElement(term924, 0, 0.4309992370378436);
        setDoubleElement(term924, 1, 0.4228091725302011);
        setDoubleElement(term924, 2, 0.9148340457558121);
        setDoubleElement(term924, 3, 0.5671889474210299);
        setDoubleElement(term924, 4, 0.12331301462770328);
        setDoubleElement(term924, 5, 0.07338333983034873);
        setField(term913, term913.getClass(), "jacNorm", term924);
        setDoubleElement(term931, 0, 0.9205377491648612);
        setDoubleElement(term931, 1, 0.5496976557562384);
        setField(term913, term913.getClass(), "beta", term931);
        setIntElement(term934, 0, -14890619);
        setField(term913, term913.getClass(), "permutation", term934);
        setIntField(term913, term913.getClass(), "rank", 1632125673);
        setDoubleField(term913, term913.getClass(), "lmPar", 0.528799251950027);
        setDoubleElement(term938, 0, 0.8870518852812378);
        setDoubleElement(term938, 1, 0.8540665765438992);
        setDoubleElement(term938, 2, 0.7936653683273087);
        setDoubleElement(term938, 3, 0.6999892183282963);
        setDoubleElement(term938, 4, 0.4376587023760947);
        setField(term913, term913.getClass(), "lmDir", term938);
        setDoubleField(term913, term913.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term913, term913.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term913, term913.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term913, term913.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term948, term948.getClass(), "relativeThreshold", 1.1102230246251565E-14);
        setDoubleField(term948, term948.getClass(), "absoluteThreshold", 2.2250738585072014E-306);
        setField(term913, term913.getClass(), "checker", term948);
        setDoubleElement(term952, 0, 0.5498407122477659);
        setDoubleElement(term952, 1, 0.3715546102192131);
        setDoubleElement(term952, 2, 0.07818003953962671);
        setDoubleElement(term952, 3, 0.3737994354904751);
        setDoubleElement(term952, 4, 0.4912523542152032);
        setDoubleElement(term952, 5, 0.5987936532910646);
        setDoubleElement(term952, 6, 0.5124845253152773);
        setDoubleElement(term952, 7, 0.12402111287123307);
        setDoubleElement(term952, 8, 0.6051772835079735);
        setElement(term951, 0, term952);
        setDoubleElement(term962, 0, 0.3443365004594303);
        setDoubleElement(term962, 1, 0.3400963645349382);
        setDoubleElement(term962, 2, 0.7410646003910566);
        setDoubleElement(term962, 3, 0.6056930022403243);
        setDoubleElement(term962, 4, 0.977168525811686);
        setDoubleElement(term962, 5, 0.2608334566667111);
        setDoubleElement(term962, 6, 0.4973631574706634);
        setElement(term951, 1, term962);
        setDoubleElement(term970, 0, 0.4350078021366608);
        setDoubleElement(term970, 1, 0.3798178439996389);
        setDoubleElement(term970, 2, 0.7829673903208142);
        setDoubleElement(term970, 3, 0.9582677413519696);
        setDoubleElement(term970, 4, 0.8466752101793942);
        setDoubleElement(term970, 5, 0.1523167696274942);
        setElement(term951, 2, term970);
        setField(term913, term913.getClass(), "jacobian", term951);
        setIntField(term913, term913.getClass(), "cols", 454281060);
        setIntField(term913, term913.getClass(), "rows", -1786399638);
        setDoubleElement(term979, 0, 0.21754273979933092);
        setDoubleElement(term979, 1, 0.7799781775636547);
        setDoubleElement(term979, 2, 0.3294886032690195);
        setDoubleElement(term979, 3, 0.7286890609225415);
        setDoubleElement(term979, 4, 0.5548341997020813);
        setField(term913, term913.getClass(), "targetValues", term979);
        setDoubleElement(term985, 0, 0.4059165385720548);
        setDoubleElement(term985, 1, 0.3800208987762318);
        setDoubleElement(term985, 2, 0.6329228631168875);
        setField(term913, term913.getClass(), "residualsWeights", term985);
        setDoubleElement(term989, 0, 0.06928634128023836);
        setDoubleElement(term989, 1, 0.16828712051665362);
        setDoubleElement(term989, 2, 0.5975949169840026);
        setDoubleElement(term989, 3, 0.5125207579363754);
        setField(term913, term913.getClass(), "point", term989);
        setDoubleElement(term994, 0, 0.1682247220070444);
        setDoubleElement(term994, 1, 0.040825355718595024);
        setDoubleElement(term994, 2, 0.19754021671358302);
        setDoubleElement(term994, 3, 0.905102212387978);
        setDoubleElement(term994, 4, 0.8248232334502307);
        setDoubleElement(term994, 5, 0.4342455781017177);
        setDoubleElement(term994, 6, 0.3169119418035211);
        setDoubleElement(term994, 7, 0.9171660240493722);
        setField(term913, term913.getClass(), "objective", term994);
        setField(term913, term913.getClass(), "residuals", term1003);
        setDoubleField(term913, term913.getClass(), "cost", 0.9172575643210912);
        setIntField(term913, term913.getClass(), "maxIterations", 1000);
        setIntField(term913, term913.getClass(), "iterations", 2055867847);
        setIntField(term913, term913.getClass(), "maxEvaluations", 2147483647);
        setIntField(term913, term913.getClass(), "objectiveEvaluations", -1048298087);
        setIntField(term913, term913.getClass(), "jacobianEvaluations", 292681826);
        setField(term913, term913.getClass(), "function", null);
        setField(term913, term913.getClass(), "jF", null);
        term1010 = (double[]) newDoubleArray(4);
        setDoubleElement(term1010, 0, 0.9776553509238997);
        setDoubleElement(term1010, 1, 0.9214187038380094);
        setDoubleElement(term1010, 2, 0.1240028694334625);
        setDoubleElement(term1010, 3, 0.9336699309532178);
        term1015 = new Double(0.18721227989825073);
        term1017 = (double[]) newDoubleArray(1);
        setDoubleElement(term1017, 0, 0.2131256081762306);
        term1019 = (double[]) newDoubleArray(0);
        term1020 = (double[]) newDoubleArray(1);
        setDoubleElement(term1020, 0, 0.03588195391803095);
        term1022 = (double[]) newDoubleArray(5);
        setDoubleElement(term1022, 0, 0.7965158013308613);
        setDoubleElement(term1022, 1, 0.2875565287844002);
        setDoubleElement(term1022, 2, 0.18556961666156768);
        setDoubleElement(term1022, 3, 0.41801713209224123);
        setDoubleElement(term1022, 4, 0.010058361776520197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[6];
        args[0] = term1010;
        args[1] = term1015;
        args[2] = term1017;
        args[3] = term1019;
        args[4] = term1020;
        args[5] = term1022;
        try {
            callMethod(klass, "determineLMParameter", argTypes, term913, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


