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

public class LevenbergMarquardtOptimizer_determineLMDirection_107049755218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368;
     Object term492;
     Object term493;
     Object term496;
     Object term504;

    public LevenbergMarquardtOptimizer_determineLMDirection_107049755218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] term370 = (double[]) newDoubleArray(5);
        double[] term376 = (double[]) newDoubleArray(5);
        double[] term382 = (double[]) newDoubleArray(1);
        int[] term384 = (int[]) newIntArray(0);
        double[] term387 = (double[]) newDoubleArray(9);
        double[] term402 = (double[]) newDoubleArray(4);
        Object[] term407 = (Object[]) newArray("[D", 8);
        double[] term408 = (double[]) newDoubleArray(6);
        double[] term415 = (double[]) newDoubleArray(2);
        double[] term418 = (double[]) newDoubleArray(8);
        double[] term427 = (double[]) newDoubleArray(3);
        double[] term431 = (double[]) newDoubleArray(6);
        double[] term438 = (double[]) newDoubleArray(8);
        double[] term447 = (double[]) newDoubleArray(9);
        double[] term457 = (double[]) newDoubleArray(7);
        double[] term466 = (double[]) newDoubleArray(3);
        double[] term470 = (double[]) newDoubleArray(4);
        double[] term475 = (double[]) newDoubleArray(2);
        double[] term478 = (double[]) newDoubleArray(5);
        Object term484 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term487 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term488 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term491 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setIntField(term368, term368.getClass(), "solvedCols", 1227103734);
        setDoubleElement(term370, 0, 0.007493740494434409);
        setDoubleElement(term370, 1, 0.29172553321356776);
        setDoubleElement(term370, 2, 0.9276995636844321);
        setDoubleElement(term370, 3, 0.7636130748477434);
        setDoubleElement(term370, 4, 0.07901636960861558);
        setField(term368, term368.getClass(), "diagR", term370);
        setDoubleElement(term376, 0, 0.18717846301066243);
        setDoubleElement(term376, 1, 0.5335953039331021);
        setDoubleElement(term376, 2, 0.5725602309856443);
        setDoubleElement(term376, 3, 0.5310967137636303);
        setDoubleElement(term376, 4, 0.6054109236809134);
        setField(term368, term368.getClass(), "jacNorm", term376);
        setDoubleElement(term382, 0, 0.9165240441138934);
        setField(term368, term368.getClass(), "beta", term382);
        setField(term368, term368.getClass(), "permutation", term384);
        setIntField(term368, term368.getClass(), "rank", -1339778481);
        setDoubleField(term368, term368.getClass(), "lmPar", 0.22227423914231126);
        setDoubleElement(term387, 0, 0.06480976831423468);
        setDoubleElement(term387, 1, 0.8490790645379176);
        setDoubleElement(term387, 2, 0.23129126164078717);
        setDoubleElement(term387, 3, 0.6047138318674447);
        setDoubleElement(term387, 4, 0.5597136413549945);
        setDoubleElement(term387, 5, 0.28292420012823627);
        setDoubleElement(term387, 6, 0.5407563152320285);
        setDoubleElement(term387, 7, 0.9485929668765458);
        setDoubleElement(term387, 8, 0.5179319342588155);
        setField(term368, term368.getClass(), "lmDir", term387);
        setDoubleField(term368, term368.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term368, term368.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term368, term368.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term368, term368.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term368, term368.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setDoubleElement(term402, 0, 0.25025774487844066);
        setDoubleElement(term402, 1, 0.1858089882752998);
        setDoubleElement(term402, 2, 0.2440697646709713);
        setDoubleElement(term402, 3, 0.7977455176064363);
        setField(term368, term368.getClass(), "weightedResidual", term402);
        setDoubleElement(term408, 0, 0.5329919447422633);
        setDoubleElement(term408, 1, 0.7046974927834232);
        setDoubleElement(term408, 2, 0.6896952303224777);
        setDoubleElement(term408, 3, 0.6693176553622628);
        setDoubleElement(term408, 4, 0.2962868255626906);
        setDoubleElement(term408, 5, 0.25474180574060834);
        setElement(term407, 0, term408);
        setDoubleElement(term415, 0, 0.9957585718901875);
        setDoubleElement(term415, 1, 0.16755811343784477);
        setElement(term407, 1, term415);
        setDoubleElement(term418, 0, 0.9090793968999221);
        setDoubleElement(term418, 1, 0.25997329921466494);
        setDoubleElement(term418, 2, 0.7814864708383836);
        setDoubleElement(term418, 3, 0.5657654165545906);
        setDoubleElement(term418, 4, 0.6382060245198228);
        setDoubleElement(term418, 5, 0.1849998667663698);
        setDoubleElement(term418, 6, 0.36312400202399575);
        setDoubleElement(term418, 7, 0.5485690030548175);
        setElement(term407, 2, term418);
        setDoubleElement(term427, 0, 0.9765248027281291);
        setDoubleElement(term427, 1, 0.9184034277897645);
        setDoubleElement(term427, 2, 0.9457448635091538);
        setElement(term407, 3, term427);
        setDoubleElement(term431, 0, 0.3238255203811462);
        setDoubleElement(term431, 1, 0.2843894095932772);
        setDoubleElement(term431, 2, 0.2382345237223229);
        setDoubleElement(term431, 3, 0.6037093070161561);
        setDoubleElement(term431, 4, 0.48050706663913145);
        setDoubleElement(term431, 5, 0.4990217874180345);
        setElement(term407, 4, term431);
        setDoubleElement(term438, 0, 0.22767631814145395);
        setDoubleElement(term438, 1, 0.4630082575704827);
        setDoubleElement(term438, 2, 0.8732511635701926);
        setDoubleElement(term438, 3, 0.8977760608415547);
        setDoubleElement(term438, 4, 0.3107086749915061);
        setDoubleElement(term438, 5, 0.18330246984174836);
        setDoubleElement(term438, 6, 0.1941255640189572);
        setDoubleElement(term438, 7, 0.2889811903417371);
        setElement(term407, 5, term438);
        setDoubleElement(term447, 0, 0.7856101337088763);
        setDoubleElement(term447, 1, 0.1782857269567425);
        setDoubleElement(term447, 2, 0.17829386444171214);
        setDoubleElement(term447, 3, 0.547995853732519);
        setDoubleElement(term447, 4, 0.3483938514131425);
        setDoubleElement(term447, 5, 0.0100718646868041);
        setDoubleElement(term447, 6, 0.58265008665336);
        setDoubleElement(term447, 7, 0.1163034938203874);
        setDoubleElement(term447, 8, 0.1187814206908886);
        setElement(term407, 6, term447);
        setDoubleElement(term457, 0, 0.04662501176438627);
        setDoubleElement(term457, 1, 0.17512426723256447);
        setDoubleElement(term457, 2, 0.9379214810416256);
        setDoubleElement(term457, 3, 0.10807577760679721);
        setDoubleElement(term457, 4, 0.7808234535616719);
        setDoubleElement(term457, 5, 0.9772425797816359);
        setDoubleElement(term457, 6, 0.32009327814110977);
        setElement(term407, 7, term457);
        setField(term368, term368.getClass(), "weightedJacobian", term407);
        setField(term368, term368.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term368, term368.getClass(), "cost", 0.9013029318694921);
        setField(term368, term368.getClass(), "jacobian", null);
        setDoubleElement(term466, 0, 0.1755673139619638);
        setDoubleElement(term466, 1, 0.9136597256674437);
        setDoubleElement(term466, 2, 0.3741779691002205);
        setField(term368, term368.getClass(), "target", term466);
        setField(term368, term368.getClass(), "weightMatrix", null);
        setField(term368, term368.getClass(), "model", null);
        setDoubleElement(term470, 0, 0.5652495059647745);
        setDoubleElement(term470, 1, 0.021410850431387685);
        setDoubleElement(term470, 2, 0.8397628091272534);
        setDoubleElement(term470, 3, 0.01784667720947175);
        setField(term368, term368.getClass(), "start", term470);
        setDoubleElement(term475, 0, 0.4395312828193261);
        setDoubleElement(term475, 1, 0.5715204226647931);
        setField(term368, term368.getClass(), "lowerBound", term475);
        setDoubleElement(term478, 0, 0.6420798930164424);
        setDoubleElement(term478, 1, 0.0011409626665044303);
        setDoubleElement(term478, 2, 0.5195852993308188);
        setDoubleElement(term478, 3, 0.6533293939565151);
        setDoubleElement(term478, 4, 0.7361083671494018);
        setField(term368, term368.getClass(), "upperBound", term478);
        setIntField(term484, term484.getClass(), "maximalCount", 0);
        setIntField(term484, term484.getClass(), "count", 0);
        setField(term484, term484.getClass(), "maxCountCallback", term487);
        setField(term368, term368.getClass(), "evaluations", term484);
        setIntField(term488, term488.getClass(), "maximalCount", 0);
        setIntField(term488, term488.getClass(), "count", 0);
        setField(term488, term488.getClass(), "maxCountCallback", term491);
        setField(term368, term368.getClass(), "iterations", term488);
        setField(term368, term368.getClass(), "checker", null);
        term492 = (double[]) newDoubleArray(0);
        term493 = (double[]) newDoubleArray(2);
        setDoubleElement(term493, 0, 0.056643259984349825);
        setDoubleElement(term493, 1, 0.5984863932443171);
        term496 = (double[]) newDoubleArray(7);
        setDoubleElement(term496, 0, 0.04708163975594959);
        setDoubleElement(term496, 1, 0.8223115496053149);
        setDoubleElement(term496, 2, 0.06795505641704636);
        setDoubleElement(term496, 3, 0.198746516614277);
        setDoubleElement(term496, 4, 0.16852568658760048);
        setDoubleElement(term496, 5, 0.20341461558365515);
        setDoubleElement(term496, 6, 0.10087360265456191);
        term504 = (double[]) newDoubleArray(2);
        setDoubleElement(term504, 0, 0.5957631946929023);
        setDoubleElement(term504, 1, 0.9963416078314885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term492;
        args[1] = term493;
        args[2] = term496;
        args[3] = term504;
        try {
            callMethod(klass, "determineLMDirection", argTypes, term368, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


