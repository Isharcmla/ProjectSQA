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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_doOptimize_91367690615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;

    public LevenbergMarquardtOptimizer_doOptimize_91367690615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term749 = (double[]) newDoubleArray(5);
        double[] term755 = (double[]) newDoubleArray(1);
        double[] term757 = (double[]) newDoubleArray(4);
        int[] term762 = (int[]) newIntArray(1);
        double[] term766 = (double[]) newDoubleArray(1);
        Object term772 = newInstance(Class.forName("org.apache.commons.math.optimization.SimpleVectorialValueChecker"));
        Object[] term775 = (Object[]) newArray("[D", 6);
        double[] term776 = (double[]) newDoubleArray(7);
        double[] term784 = (double[]) newDoubleArray(0);
        double[] term785 = (double[]) newDoubleArray(7);
        double[] term793 = (double[]) newDoubleArray(1);
        double[] term795 = (double[]) newDoubleArray(6);
        double[] term802 = (double[]) newDoubleArray(4);
        double[] term809 = (double[]) newDoubleArray(6);
        double[] term816 = (double[]) newDoubleArray(7);
        double[] term824 = (double[]) newDoubleArray(0);
        double[] term825 = (double[]) newDoubleArray(9);
        double[] term835 = (double[]) newDoubleArray(6);
        setIntField(term747, term747.getClass(), "solvedCols", 1962444399);
        setDoubleElement(term749, 0, 0.07932996853888874);
        setDoubleElement(term749, 1, 0.4335752168808029);
        setDoubleElement(term749, 2, 0.9196949182738653);
        setDoubleElement(term749, 3, 0.5820770579753712);
        setDoubleElement(term749, 4, 0.8935041663395363);
        setField(term747, term747.getClass(), "diagR", term749);
        setDoubleElement(term755, 0, 0.2542403704113868);
        setField(term747, term747.getClass(), "jacNorm", term755);
        setDoubleElement(term757, 0, 0.4614378239284842);
        setDoubleElement(term757, 1, 0.10963898027157926);
        setDoubleElement(term757, 2, 0.34234234602085223);
        setDoubleElement(term757, 3, 0.8355624480198577);
        setField(term747, term747.getClass(), "beta", term757);
        setIntElement(term762, 0, 767834723);
        setField(term747, term747.getClass(), "permutation", term762);
        setIntField(term747, term747.getClass(), "rank", -602026508);
        setDoubleField(term747, term747.getClass(), "lmPar", 0.8303221706066055);
        setDoubleElement(term766, 0, 0.7102687477135848);
        setField(term747, term747.getClass(), "lmDir", term766);
        setDoubleField(term747, term747.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term747, term747.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term747, term747.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term747, term747.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term772, term772.getClass(), "relativeThreshold", 1.1102230246251565E-14);
        setDoubleField(term772, term772.getClass(), "absoluteThreshold", 2.2250738585072014E-306);
        setField(term747, term747.getClass(), "checker", term772);
        setDoubleElement(term776, 0, 0.7984332537471793);
        setDoubleElement(term776, 1, 0.6782349539183316);
        setDoubleElement(term776, 2, 0.6464654528667407);
        setDoubleElement(term776, 3, 0.6416885379658445);
        setDoubleElement(term776, 4, 0.604465128384297);
        setDoubleElement(term776, 5, 0.5180566811475131);
        setDoubleElement(term776, 6, 0.6773553630262286);
        setElement(term775, 0, term776);
        setElement(term775, 1, term784);
        setDoubleElement(term785, 0, 0.0416412064984476);
        setDoubleElement(term785, 1, 0.9188322321077216);
        setDoubleElement(term785, 2, 0.8046904246652031);
        setDoubleElement(term785, 3, 0.16734523112870836);
        setDoubleElement(term785, 4, 0.9711083796772954);
        setDoubleElement(term785, 5, 0.329228491476264);
        setDoubleElement(term785, 6, 0.8664463700873805);
        setElement(term775, 2, term785);
        setDoubleElement(term793, 0, 0.4228841212022646);
        setElement(term775, 3, term793);
        setDoubleElement(term795, 0, 0.9898207968242465);
        setDoubleElement(term795, 1, 0.025396748287270232);
        setDoubleElement(term795, 2, 0.22437750947699786);
        setDoubleElement(term795, 3, 0.3142783864669928);
        setDoubleElement(term795, 4, 0.28838369056651414);
        setDoubleElement(term795, 5, 0.3505219043338702);
        setElement(term775, 4, term795);
        setDoubleElement(term802, 0, 0.9926072201505048);
        setDoubleElement(term802, 1, 0.5862272565267508);
        setDoubleElement(term802, 2, 0.20309716492940588);
        setDoubleElement(term802, 3, 0.2353269756778571);
        setElement(term775, 5, term802);
        setField(term747, term747.getClass(), "jacobian", term775);
        setIntField(term747, term747.getClass(), "cols", -157887805);
        setIntField(term747, term747.getClass(), "rows", 1876565163);
        setDoubleElement(term809, 0, 0.6816920131943206);
        setDoubleElement(term809, 1, 0.2570702043750863);
        setDoubleElement(term809, 2, 0.1475601354637306);
        setDoubleElement(term809, 3, 0.3597510664032918);
        setDoubleElement(term809, 4, 0.007955296043747784);
        setDoubleElement(term809, 5, 0.9306289418004117);
        setField(term747, term747.getClass(), "targetValues", term809);
        setDoubleElement(term816, 0, 0.6094033208961637);
        setDoubleElement(term816, 1, 0.8841587807231336);
        setDoubleElement(term816, 2, 0.5041105894588648);
        setDoubleElement(term816, 3, 0.5447228125601069);
        setDoubleElement(term816, 4, 0.881005463515806);
        setDoubleElement(term816, 5, 0.24535082601257097);
        setDoubleElement(term816, 6, 0.8251257683961645);
        setField(term747, term747.getClass(), "residualsWeights", term816);
        setField(term747, term747.getClass(), "point", term824);
        setDoubleElement(term825, 0, 0.9368808881355091);
        setDoubleElement(term825, 1, 0.6198040082983302);
        setDoubleElement(term825, 2, 0.8222160691812529);
        setDoubleElement(term825, 3, 0.6481625751444708);
        setDoubleElement(term825, 4, 0.62046987338639);
        setDoubleElement(term825, 5, 0.16681991355621673);
        setDoubleElement(term825, 6, 0.24168508149332457);
        setDoubleElement(term825, 7, 0.9765582392968284);
        setDoubleElement(term825, 8, 0.33340230026214834);
        setField(term747, term747.getClass(), "objective", term825);
        setDoubleElement(term835, 0, 0.7912735654922212);
        setDoubleElement(term835, 1, 0.7177162541558186);
        setDoubleElement(term835, 2, 0.4751993224281752);
        setDoubleElement(term835, 3, 0.246784352391756);
        setDoubleElement(term835, 4, 0.6746769370801629);
        setDoubleElement(term835, 5, 0.09436531082165778);
        setField(term747, term747.getClass(), "residuals", term835);
        setDoubleField(term747, term747.getClass(), "cost", 0.1882701721081318);
        setIntField(term747, term747.getClass(), "maxIterations", 1000);
        setIntField(term747, term747.getClass(), "iterations", -817164822);
        setIntField(term747, term747.getClass(), "maxEvaluations", 2147483647);
        setIntField(term747, term747.getClass(), "objectiveEvaluations", -1016503459);
        setIntField(term747, term747.getClass(), "jacobianEvaluations", -1968847291);
        setField(term747, term747.getClass(), "function", null);
        setField(term747, term747.getClass(), "jF", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term747, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


