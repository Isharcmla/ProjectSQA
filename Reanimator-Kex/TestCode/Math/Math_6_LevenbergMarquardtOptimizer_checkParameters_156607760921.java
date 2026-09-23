package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

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
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_checkParameters_156607760921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term937;

    public LevenbergMarquardtOptimizer_checkParameters_156607760921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term937 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] term939 = (double[]) newDoubleArray(6);
        double[] term946 = (double[]) newDoubleArray(8);
        double[] term955 = (double[]) newDoubleArray(6);
        int[] term962 = (int[]) newIntArray(2);
        double[] term967 = (double[]) newDoubleArray(1);
        double[] term974 = (double[]) newDoubleArray(5);
        Object[] term980 = (Object[]) newArray("[D", 3);
        double[] term981 = (double[]) newDoubleArray(9);
        double[] term991 = (double[]) newDoubleArray(7);
        double[] term999 = (double[]) newDoubleArray(6);
        double[] term1007 = (double[]) newDoubleArray(5);
        double[] term1013 = (double[]) newDoubleArray(3);
        double[] term1017 = (double[]) newDoubleArray(4);
        double[] term1022 = (double[]) newDoubleArray(8);
        Object term1031 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1034 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term1035 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1038 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setIntField(term937, term937.getClass(), "solvedCols", -1275173084);
        setDoubleElement(term939, 0, 0.9148340457558121);
        setDoubleElement(term939, 1, 0.5671889474210299);
        setDoubleElement(term939, 2, 0.12331301462770328);
        setDoubleElement(term939, 3, 0.07338333983034873);
        setDoubleElement(term939, 4, 0.9205377491648612);
        setDoubleElement(term939, 5, 0.5496976557562384);
        setField(term937, term937.getClass(), "diagR", term939);
        setDoubleElement(term946, 0, 0.528799251950027);
        setDoubleElement(term946, 1, 0.8870518852812378);
        setDoubleElement(term946, 2, 0.8540665765438992);
        setDoubleElement(term946, 3, 0.7936653683273087);
        setDoubleElement(term946, 4, 0.6999892183282963);
        setDoubleElement(term946, 5, 0.4376587023760947);
        setDoubleElement(term946, 6, 0.5498407122477659);
        setDoubleElement(term946, 7, 0.3715546102192131);
        setField(term937, term937.getClass(), "jacNorm", term946);
        setDoubleElement(term955, 0, 0.07818003953962671);
        setDoubleElement(term955, 1, 0.3737994354904751);
        setDoubleElement(term955, 2, 0.4912523542152032);
        setDoubleElement(term955, 3, 0.5987936532910646);
        setDoubleElement(term955, 4, 0.5124845253152773);
        setDoubleElement(term955, 5, 0.12402111287123307);
        setField(term937, term937.getClass(), "beta", term955);
        setIntElement(term962, 0, -244121226);
        setIntElement(term962, 1, -203030934);
        setField(term937, term937.getClass(), "permutation", term962);
        setIntField(term937, term937.getClass(), "rank", -1179120542);
        setDoubleField(term937, term937.getClass(), "lmPar", 0.6051772835079735);
        setDoubleElement(term967, 0, 0.3443365004594303);
        setField(term937, term937.getClass(), "lmDir", term967);
        setDoubleField(term937, term937.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term937, term937.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term937, term937.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term937, term937.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term937, term937.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setDoubleElement(term974, 0, 0.3400963645349382);
        setDoubleElement(term974, 1, 0.7410646003910566);
        setDoubleElement(term974, 2, 0.6056930022403243);
        setDoubleElement(term974, 3, 0.977168525811686);
        setDoubleElement(term974, 4, 0.2608334566667111);
        setField(term937, term937.getClass(), "weightedResidual", term974);
        setDoubleElement(term981, 0, 0.4973631574706634);
        setDoubleElement(term981, 1, 0.4350078021366608);
        setDoubleElement(term981, 2, 0.3798178439996389);
        setDoubleElement(term981, 3, 0.7829673903208142);
        setDoubleElement(term981, 4, 0.9582677413519696);
        setDoubleElement(term981, 5, 0.8466752101793942);
        setDoubleElement(term981, 6, 0.1523167696274942);
        setDoubleElement(term981, 7, 0.21754273979933092);
        setDoubleElement(term981, 8, 0.7799781775636547);
        setElement(term980, 0, term981);
        setDoubleElement(term991, 0, 0.3294886032690195);
        setDoubleElement(term991, 1, 0.7286890609225415);
        setDoubleElement(term991, 2, 0.5548341997020813);
        setDoubleElement(term991, 3, 0.4059165385720548);
        setDoubleElement(term991, 4, 0.3800208987762318);
        setDoubleElement(term991, 5, 0.6329228631168875);
        setDoubleElement(term991, 6, 0.06928634128023836);
        setElement(term980, 1, term991);
        setDoubleElement(term999, 0, 0.16828712051665362);
        setDoubleElement(term999, 1, 0.5975949169840026);
        setDoubleElement(term999, 2, 0.5125207579363754);
        setDoubleElement(term999, 3, 0.1682247220070444);
        setDoubleElement(term999, 4, 0.040825355718595024);
        setDoubleElement(term999, 5, 0.19754021671358302);
        setElement(term980, 2, term999);
        setField(term937, term937.getClass(), "weightedJacobian", term980);
        setField(term937, term937.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term937, term937.getClass(), "cost", 0.905102212387978);
        setField(term937, term937.getClass(), "jacobian", null);
        setDoubleElement(term1007, 0, 0.8248232334502307);
        setDoubleElement(term1007, 1, 0.4342455781017177);
        setDoubleElement(term1007, 2, 0.3169119418035211);
        setDoubleElement(term1007, 3, 0.9171660240493722);
        setDoubleElement(term1007, 4, 0.9172575643210912);
        setField(term937, term937.getClass(), "target", term1007);
        setField(term937, term937.getClass(), "weightMatrix", null);
        setField(term937, term937.getClass(), "model", null);
        setDoubleElement(term1013, 0, 0.9776553509238997);
        setDoubleElement(term1013, 1, 0.9214187038380094);
        setDoubleElement(term1013, 2, 0.1240028694334625);
        setField(term937, term937.getClass(), "start", term1013);
        setDoubleElement(term1017, 0, 0.9336699309532178);
        setDoubleElement(term1017, 1, 0.18721227989825073);
        setDoubleElement(term1017, 2, 0.2131256081762306);
        setDoubleElement(term1017, 3, 0.03588195391803095);
        setField(term937, term937.getClass(), "lowerBound", term1017);
        setDoubleElement(term1022, 0, 0.7965158013308613);
        setDoubleElement(term1022, 1, 0.2875565287844002);
        setDoubleElement(term1022, 2, 0.18556961666156768);
        setDoubleElement(term1022, 3, 0.41801713209224123);
        setDoubleElement(term1022, 4, 0.010058361776520197);
        setDoubleElement(term1022, 5, 0.22206025307636057);
        setDoubleElement(term1022, 6, 0.3762445362551795);
        setDoubleElement(term1022, 7, 0.6004517527698794);
        setField(term937, term937.getClass(), "upperBound", term1022);
        setIntField(term1031, term1031.getClass(), "maximalCount", 0);
        setIntField(term1031, term1031.getClass(), "count", 0);
        setField(term1031, term1031.getClass(), "maxCountCallback", term1034);
        setField(term937, term937.getClass(), "evaluations", term1031);
        setIntField(term1035, term1035.getClass(), "maximalCount", 0);
        setIntField(term1035, term1035.getClass(), "count", 0);
        setField(term1035, term1035.getClass(), "maxCountCallback", term1038);
        setField(term937, term937.getClass(), "iterations", term1035);
        setField(term937, term937.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "checkParameters", argTypes, term937, args);
            assertTrue(false);
        }
        catch (MathUnsupportedOperationException e) {
        }

    }

};


