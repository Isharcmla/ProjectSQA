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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_doOptimize_91367690617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term905;

    public LevenbergMarquardtOptimizer_doOptimize_91367690617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term905 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term907 = (double[]) newDoubleArray(8);
        double[] term916 = (double[]) newDoubleArray(6);
        double[] term923 = (double[]) newDoubleArray(2);
        int[] term926 = (int[]) newIntArray(1);
        double[] term930 = (double[]) newDoubleArray(5);
        Object[] term941 = (Object[]) newArray("[D", 3);
        double[] term942 = (double[]) newDoubleArray(9);
        double[] term952 = (double[]) newDoubleArray(7);
        double[] term960 = (double[]) newDoubleArray(6);
        double[] term969 = (double[]) newDoubleArray(5);
        double[] term975 = (double[]) newDoubleArray(3);
        double[] term979 = (double[]) newDoubleArray(4);
        double[] term984 = (double[]) newDoubleArray(8);
        double[] term993 = (double[]) newDoubleArray(0);
        setIntField(term905, term905.getClass(), "solvedCols", 579005622);
        setDoubleElement(term907, 0, 0.4995447078885714);
        setDoubleElement(term907, 1, 0.19855958465701706);
        setDoubleElement(term907, 2, 0.6202418999768349);
        setDoubleElement(term907, 3, 0.9848907582209794);
        setDoubleElement(term907, 4, 0.9658751931880928);
        setDoubleElement(term907, 5, 0.6990187833274262);
        setDoubleElement(term907, 6, 0.6970994777067232);
        setDoubleElement(term907, 7, 0.4309992370378436);
        setField(term905, term905.getClass(), "diagR", term907);
        setDoubleElement(term916, 0, 0.4228091725302011);
        setDoubleElement(term916, 1, 0.9148340457558121);
        setDoubleElement(term916, 2, 0.5671889474210299);
        setDoubleElement(term916, 3, 0.12331301462770328);
        setDoubleElement(term916, 4, 0.07338333983034873);
        setDoubleElement(term916, 5, 0.9205377491648612);
        setField(term905, term905.getClass(), "jacNorm", term916);
        setDoubleElement(term923, 0, 0.5496976557562384);
        setDoubleElement(term923, 1, 0.528799251950027);
        setField(term905, term905.getClass(), "beta", term923);
        setIntElement(term926, 0, -14890619);
        setField(term905, term905.getClass(), "permutation", term926);
        setIntField(term905, term905.getClass(), "rank", 1632125673);
        setDoubleField(term905, term905.getClass(), "lmPar", 0.8870518852812378);
        setDoubleElement(term930, 0, 0.8540665765438992);
        setDoubleElement(term930, 1, 0.7936653683273087);
        setDoubleElement(term930, 2, 0.6999892183282963);
        setDoubleElement(term930, 3, 0.4376587023760947);
        setDoubleElement(term930, 4, 0.5498407122477659);
        setField(term905, term905.getClass(), "lmDir", term930);
        setDoubleField(term905, term905.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term905, term905.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term905, term905.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term905, term905.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term905, term905.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setField(term905, term905.getClass(), "checker", null);
        setDoubleElement(term942, 0, 0.3715546102192131);
        setDoubleElement(term942, 1, 0.07818003953962671);
        setDoubleElement(term942, 2, 0.3737994354904751);
        setDoubleElement(term942, 3, 0.4912523542152032);
        setDoubleElement(term942, 4, 0.5987936532910646);
        setDoubleElement(term942, 5, 0.5124845253152773);
        setDoubleElement(term942, 6, 0.12402111287123307);
        setDoubleElement(term942, 7, 0.6051772835079735);
        setDoubleElement(term942, 8, 0.3443365004594303);
        setElement(term941, 0, term942);
        setDoubleElement(term952, 0, 0.3400963645349382);
        setDoubleElement(term952, 1, 0.7410646003910566);
        setDoubleElement(term952, 2, 0.6056930022403243);
        setDoubleElement(term952, 3, 0.977168525811686);
        setDoubleElement(term952, 4, 0.2608334566667111);
        setDoubleElement(term952, 5, 0.4973631574706634);
        setDoubleElement(term952, 6, 0.4350078021366608);
        setElement(term941, 1, term952);
        setDoubleElement(term960, 0, 0.3798178439996389);
        setDoubleElement(term960, 1, 0.7829673903208142);
        setDoubleElement(term960, 2, 0.9582677413519696);
        setDoubleElement(term960, 3, 0.8466752101793942);
        setDoubleElement(term960, 4, 0.1523167696274942);
        setDoubleElement(term960, 5, 0.21754273979933092);
        setElement(term941, 2, term960);
        setField(term905, term905.getClass(), "jacobian", term941);
        setIntField(term905, term905.getClass(), "cols", 454281060);
        setIntField(term905, term905.getClass(), "rows", -1786399638);
        setDoubleElement(term969, 0, 0.7799781775636547);
        setDoubleElement(term969, 1, 0.3294886032690195);
        setDoubleElement(term969, 2, 0.7286890609225415);
        setDoubleElement(term969, 3, 0.5548341997020813);
        setDoubleElement(term969, 4, 0.4059165385720548);
        setField(term905, term905.getClass(), "targetValues", term969);
        setDoubleElement(term975, 0, 0.3800208987762318);
        setDoubleElement(term975, 1, 0.6329228631168875);
        setDoubleElement(term975, 2, 0.06928634128023836);
        setField(term905, term905.getClass(), "residualsWeights", term975);
        setDoubleElement(term979, 0, 0.16828712051665362);
        setDoubleElement(term979, 1, 0.5975949169840026);
        setDoubleElement(term979, 2, 0.5125207579363754);
        setDoubleElement(term979, 3, 0.1682247220070444);
        setField(term905, term905.getClass(), "point", term979);
        setDoubleElement(term984, 0, 0.040825355718595024);
        setDoubleElement(term984, 1, 0.19754021671358302);
        setDoubleElement(term984, 2, 0.905102212387978);
        setDoubleElement(term984, 3, 0.8248232334502307);
        setDoubleElement(term984, 4, 0.4342455781017177);
        setDoubleElement(term984, 5, 0.3169119418035211);
        setDoubleElement(term984, 6, 0.9171660240493722);
        setDoubleElement(term984, 7, 0.9172575643210912);
        setField(term905, term905.getClass(), "objective", term984);
        setField(term905, term905.getClass(), "residuals", term993);
        setDoubleField(term905, term905.getClass(), "cost", 0.9776553509238997);
        setIntField(term905, term905.getClass(), "maxIterations", 1000);
        setIntField(term905, term905.getClass(), "iterations", 2055867847);
        setIntField(term905, term905.getClass(), "maxEvaluations", 2147483647);
        setIntField(term905, term905.getClass(), "objectiveEvaluations", -1048298087);
        setIntField(term905, term905.getClass(), "jacobianEvaluations", 292681826);
        setField(term905, term905.getClass(), "function", null);
        setField(term905, term905.getClass(), "jF", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term905, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


