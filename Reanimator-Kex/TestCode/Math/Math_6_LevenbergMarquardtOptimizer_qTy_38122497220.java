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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_qTy_38122497220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798;
     Object term873;

    public LevenbergMarquardtOptimizer_qTy_38122497220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] term800 = (double[]) newDoubleArray(1);
        double[] term802 = (double[]) newDoubleArray(1);
        double[] term804 = (double[]) newDoubleArray(6);
        int[] term811 = (int[]) newIntArray(7);
        double[] term821 = (double[]) newDoubleArray(0);
        double[] term827 = (double[]) newDoubleArray(7);
        Object[] term835 = (Object[]) newArray("[D", 1);
        double[] term836 = (double[]) newDoubleArray(6);
        double[] term844 = (double[]) newDoubleArray(4);
        double[] term849 = (double[]) newDoubleArray(6);
        double[] term856 = (double[]) newDoubleArray(7);
        double[] term864 = (double[]) newDoubleArray(0);
        Object term865 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term868 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term869 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term872 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setIntField(term798, term798.getClass(), "solvedCols", 1048535127);
        setDoubleElement(term800, 0, 0.9898207968242465);
        setField(term798, term798.getClass(), "diagR", term800);
        setDoubleElement(term802, 0, 0.025396748287270232);
        setField(term798, term798.getClass(), "jacNorm", term802);
        setDoubleElement(term804, 0, 0.22437750947699786);
        setDoubleElement(term804, 1, 0.3142783864669928);
        setDoubleElement(term804, 2, 0.28838369056651414);
        setDoubleElement(term804, 3, 0.3505219043338702);
        setDoubleElement(term804, 4, 0.9926072201505048);
        setDoubleElement(term804, 5, 0.5862272565267508);
        setField(term798, term798.getClass(), "beta", term804);
        setIntElement(term811, 0, -655067527);
        setIntElement(term811, 1, -6029667);
        setIntElement(term811, 2, -2068769794);
        setIntElement(term811, 3, -117576464);
        setIntElement(term811, 4, -1007160944);
        setIntElement(term811, 5, 1135664017);
        setIntElement(term811, 6, 590364439);
        setField(term798, term798.getClass(), "permutation", term811);
        setIntField(term798, term798.getClass(), "rank", 865208305);
        setDoubleField(term798, term798.getClass(), "lmPar", 0.20309716492940588);
        setField(term798, term798.getClass(), "lmDir", term821);
        setDoubleField(term798, term798.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term798, term798.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term798, term798.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term798, term798.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term798, term798.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setDoubleElement(term827, 0, 0.2353269756778571);
        setDoubleElement(term827, 1, 0.6816920131943206);
        setDoubleElement(term827, 2, 0.2570702043750863);
        setDoubleElement(term827, 3, 0.1475601354637306);
        setDoubleElement(term827, 4, 0.3597510664032918);
        setDoubleElement(term827, 5, 0.007955296043747784);
        setDoubleElement(term827, 6, 0.9306289418004117);
        setField(term798, term798.getClass(), "weightedResidual", term827);
        setDoubleElement(term836, 0, 0.6094033208961637);
        setDoubleElement(term836, 1, 0.8841587807231336);
        setDoubleElement(term836, 2, 0.5041105894588648);
        setDoubleElement(term836, 3, 0.5447228125601069);
        setDoubleElement(term836, 4, 0.881005463515806);
        setDoubleElement(term836, 5, 0.24535082601257097);
        setElement(term835, 0, term836);
        setField(term798, term798.getClass(), "weightedJacobian", term835);
        setField(term798, term798.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term798, term798.getClass(), "cost", 0.8251257683961645);
        setField(term798, term798.getClass(), "jacobian", null);
        setDoubleElement(term844, 0, 0.9368808881355091);
        setDoubleElement(term844, 1, 0.6198040082983302);
        setDoubleElement(term844, 2, 0.8222160691812529);
        setDoubleElement(term844, 3, 0.6481625751444708);
        setField(term798, term798.getClass(), "target", term844);
        setField(term798, term798.getClass(), "weightMatrix", null);
        setField(term798, term798.getClass(), "model", null);
        setDoubleElement(term849, 0, 0.62046987338639);
        setDoubleElement(term849, 1, 0.16681991355621673);
        setDoubleElement(term849, 2, 0.24168508149332457);
        setDoubleElement(term849, 3, 0.9765582392968284);
        setDoubleElement(term849, 4, 0.33340230026214834);
        setDoubleElement(term849, 5, 0.7912735654922212);
        setField(term798, term798.getClass(), "start", term849);
        setDoubleElement(term856, 0, 0.7177162541558186);
        setDoubleElement(term856, 1, 0.4751993224281752);
        setDoubleElement(term856, 2, 0.246784352391756);
        setDoubleElement(term856, 3, 0.6746769370801629);
        setDoubleElement(term856, 4, 0.09436531082165778);
        setDoubleElement(term856, 5, 0.1882701721081318);
        setDoubleElement(term856, 6, 0.20230843747579808);
        setField(term798, term798.getClass(), "lowerBound", term856);
        setField(term798, term798.getClass(), "upperBound", term864);
        setIntField(term865, term865.getClass(), "maximalCount", 0);
        setIntField(term865, term865.getClass(), "count", 0);
        setField(term865, term865.getClass(), "maxCountCallback", term868);
        setField(term798, term798.getClass(), "evaluations", term865);
        setIntField(term869, term869.getClass(), "maximalCount", 0);
        setIntField(term869, term869.getClass(), "count", 0);
        setField(term869, term869.getClass(), "maxCountCallback", term872);
        setField(term798, term798.getClass(), "iterations", term869);
        setField(term798, term798.getClass(), "checker", null);
        term873 = (double[]) newDoubleArray(9);
        setDoubleElement(term873, 0, 0.4995447078885714);
        setDoubleElement(term873, 1, 0.19855958465701706);
        setDoubleElement(term873, 2, 0.6202418999768349);
        setDoubleElement(term873, 3, 0.9848907582209794);
        setDoubleElement(term873, 4, 0.9658751931880928);
        setDoubleElement(term873, 5, 0.6990187833274262);
        setDoubleElement(term873, 6, 0.6970994777067232);
        setDoubleElement(term873, 7, 0.4309992370378436);
        setDoubleElement(term873, 8, 0.4228091725302011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term873;
        try {
            callMethod(klass, "qTy", argTypes, term798, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


