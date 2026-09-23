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
import java.lang.Double;

public class LevenbergMarquardtOptimizer_determineLMParameter_169194525417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;
     Object term258;
     Object term265;
     Object term267;
     Object term274;
     Object term277;
     Object term283;

    public LevenbergMarquardtOptimizer_determineLMParameter_169194525417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] term166 = (double[]) newDoubleArray(2);
        double[] term169 = (double[]) newDoubleArray(3);
        double[] term173 = (double[]) newDoubleArray(1);
        int[] term175 = (int[]) newIntArray(0);
        double[] term178 = (double[]) newDoubleArray(2);
        double[] term186 = (double[]) newDoubleArray(8);
        Object[] term195 = (Object[]) newArray("[D", 6);
        double[] term196 = (double[]) newDoubleArray(2);
        double[] term199 = (double[]) newDoubleArray(1);
        double[] term201 = (double[]) newDoubleArray(9);
        double[] term211 = (double[]) newDoubleArray(3);
        double[] term215 = (double[]) newDoubleArray(5);
        double[] term221 = (double[]) newDoubleArray(6);
        double[] term229 = (double[]) newDoubleArray(5);
        double[] term235 = (double[]) newDoubleArray(3);
        double[] term239 = (double[]) newDoubleArray(7);
        double[] term247 = (double[]) newDoubleArray(2);
        Object term250 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term253 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term254 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term257 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setIntField(term164, term164.getClass(), "solvedCols", -1955890973);
        setDoubleElement(term166, 0, 0.11179067076100713);
        setDoubleElement(term166, 1, 0.5306473989087822);
        setField(term164, term164.getClass(), "diagR", term166);
        setDoubleElement(term169, 0, 0.022483645678509023);
        setDoubleElement(term169, 1, 0.025133051616627267);
        setDoubleElement(term169, 2, 0.016575281023182953);
        setField(term164, term164.getClass(), "jacNorm", term169);
        setDoubleElement(term173, 0, 0.5308350402051779);
        setField(term164, term164.getClass(), "beta", term173);
        setField(term164, term164.getClass(), "permutation", term175);
        setIntField(term164, term164.getClass(), "rank", -2038273078);
        setDoubleField(term164, term164.getClass(), "lmPar", 0.7154795600170818);
        setDoubleElement(term178, 0, 0.6355029654528058);
        setDoubleElement(term178, 1, 0.0022646783892913414);
        setField(term164, term164.getClass(), "lmDir", term178);
        setDoubleField(term164, term164.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term164, term164.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term164, term164.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term164, term164.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term164, term164.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setDoubleElement(term186, 0, 0.36226058076369927);
        setDoubleElement(term186, 1, 0.03699061125289671);
        setDoubleElement(term186, 2, 0.6047137830113202);
        setDoubleElement(term186, 3, 0.6767213143579776);
        setDoubleElement(term186, 4, 0.48862955528902696);
        setDoubleElement(term186, 5, 0.426231085465289);
        setDoubleElement(term186, 6, 0.0027299293098262956);
        setDoubleElement(term186, 7, 0.29874017652881824);
        setField(term164, term164.getClass(), "weightedResidual", term186);
        setDoubleElement(term196, 0, 0.32554480512985284);
        setDoubleElement(term196, 1, 0.8924855581421237);
        setElement(term195, 0, term196);
        setDoubleElement(term199, 0, 0.32237559209193944);
        setElement(term195, 1, term199);
        setDoubleElement(term201, 0, 0.53094494792755);
        setDoubleElement(term201, 1, 0.146431486357265);
        setDoubleElement(term201, 2, 0.24259014218848696);
        setDoubleElement(term201, 3, 0.1544348383112728);
        setDoubleElement(term201, 4, 0.5187846213101265);
        setDoubleElement(term201, 5, 0.045893173090043815);
        setDoubleElement(term201, 6, 0.3626177854778667);
        setDoubleElement(term201, 7, 0.3163771663728089);
        setDoubleElement(term201, 8, 0.8819646072665548);
        setElement(term195, 2, term201);
        setDoubleElement(term211, 0, 0.5412182593116958);
        setDoubleElement(term211, 1, 0.16988691727397487);
        setDoubleElement(term211, 2, 0.39286935532362843);
        setElement(term195, 3, term211);
        setDoubleElement(term215, 0, 0.11577948268926874);
        setDoubleElement(term215, 1, 0.5617009352394552);
        setDoubleElement(term215, 2, 0.09067063848644474);
        setDoubleElement(term215, 3, 0.268304014379393);
        setDoubleElement(term215, 4, 0.7171972879282721);
        setElement(term195, 4, term215);
        setDoubleElement(term221, 0, 0.9006361024877096);
        setDoubleElement(term221, 1, 0.5644914462415626);
        setDoubleElement(term221, 2, 0.509895859167191);
        setDoubleElement(term221, 3, 0.07417792024383196);
        setDoubleElement(term221, 4, 0.686293604788188);
        setDoubleElement(term221, 5, 0.12764449157430724);
        setElement(term195, 5, term221);
        setField(term164, term164.getClass(), "weightedJacobian", term195);
        setField(term164, term164.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term164, term164.getClass(), "cost", 0.39446728256884744);
        setField(term164, term164.getClass(), "jacobian", null);
        setDoubleElement(term229, 0, 0.7865909711092062);
        setDoubleElement(term229, 1, 0.06587158449170749);
        setDoubleElement(term229, 2, 0.0865998004187658);
        setDoubleElement(term229, 3, 0.9628647861255637);
        setDoubleElement(term229, 4, 0.623231822150205);
        setField(term164, term164.getClass(), "target", term229);
        setField(term164, term164.getClass(), "weightMatrix", null);
        setField(term164, term164.getClass(), "model", null);
        setDoubleElement(term235, 0, 0.09037487793444521);
        setDoubleElement(term235, 1, 0.6561919196821765);
        setDoubleElement(term235, 2, 0.7330178886612495);
        setField(term164, term164.getClass(), "start", term235);
        setDoubleElement(term239, 0, 0.7618164754425794);
        setDoubleElement(term239, 1, 0.7385589312559342);
        setDoubleElement(term239, 2, 0.7080134263823477);
        setDoubleElement(term239, 3, 0.6059734092898602);
        setDoubleElement(term239, 4, 0.3074693824288357);
        setDoubleElement(term239, 5, 0.1245258965512791);
        setDoubleElement(term239, 6, 0.9511861072660375);
        setField(term164, term164.getClass(), "lowerBound", term239);
        setDoubleElement(term247, 0, 0.05880719443135807);
        setDoubleElement(term247, 1, 0.34010089048558567);
        setField(term164, term164.getClass(), "upperBound", term247);
        setIntField(term250, term250.getClass(), "maximalCount", 0);
        setIntField(term250, term250.getClass(), "count", 0);
        setField(term250, term250.getClass(), "maxCountCallback", term253);
        setField(term164, term164.getClass(), "evaluations", term250);
        setIntField(term254, term254.getClass(), "maximalCount", 0);
        setIntField(term254, term254.getClass(), "count", 0);
        setField(term254, term254.getClass(), "maxCountCallback", term257);
        setField(term164, term164.getClass(), "iterations", term254);
        setField(term164, term164.getClass(), "checker", null);
        term258 = (double[]) newDoubleArray(6);
        setDoubleElement(term258, 0, 0.19625398866403143);
        setDoubleElement(term258, 1, 0.45069204793711093);
        setDoubleElement(term258, 2, 0.9341364461850963);
        setDoubleElement(term258, 3, 0.9022041121474429);
        setDoubleElement(term258, 4, 0.6512870939318848);
        setDoubleElement(term258, 5, 0.8777038609128434);
        term265 = new Double(0.008025683154629148);
        term267 = (double[]) newDoubleArray(6);
        setDoubleElement(term267, 0, 0.40598298281353484);
        setDoubleElement(term267, 1, 0.3710067290060264);
        setDoubleElement(term267, 2, 0.7818620200430967);
        setDoubleElement(term267, 3, 0.04640022995603543);
        setDoubleElement(term267, 4, 0.9123572866833729);
        setDoubleElement(term267, 5, 0.40635376375558196);
        term274 = (double[]) newDoubleArray(2);
        setDoubleElement(term274, 0, 0.4772043271031934);
        setDoubleElement(term274, 1, 0.2446504549754045);
        term277 = (double[]) newDoubleArray(5);
        setDoubleElement(term277, 0, 0.6142723998707854);
        setDoubleElement(term277, 1, 0.4355627280318103);
        setDoubleElement(term277, 2, 0.841460835734741);
        setDoubleElement(term277, 3, 0.7859316615744082);
        setDoubleElement(term277, 4, 0.6428742553484879);
        term283 = (double[]) newDoubleArray(3);
        setDoubleElement(term283, 0, 0.6584165706677267);
        setDoubleElement(term283, 1, 0.44268490778872205);
        setDoubleElement(term283, 2, 0.7507333108648018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[6];
        args[0] = term258;
        args[1] = term265;
        args[2] = term267;
        args[3] = term274;
        args[4] = term277;
        args[5] = term283;
        try {
            callMethod(klass, "determineLMParameter", argTypes, term164, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


