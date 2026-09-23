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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class EigenDecompositionImpl_flipIfWarranted_43216517260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3345;
     Object term3440;
     Object term3442;

    public EigenDecompositionImpl_flipIfWarranted_43216517260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3345 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term3347 = (double[]) newDoubleArray(5);
        double[] term3353 = (double[]) newDoubleArray(8);
        double[] term3362 = (double[]) newDoubleArray(2);
        Object term3365 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term3366 = (Object[]) newArray("[D", 4);
        double[] term3367 = (double[]) newDoubleArray(2);
        double[] term3370 = (double[]) newDoubleArray(6);
        double[] term3377 = (double[]) newDoubleArray(4);
        double[] term3382 = (double[]) newDoubleArray(0);
        double[] term3383 = (double[]) newDoubleArray(3);
        double[] term3387 = (double[]) newDoubleArray(4);
        double[] term3398 = (double[]) newDoubleArray(9);
        double[] term3419 = (double[]) newDoubleArray(4);
        double[] term3424 = (double[]) newDoubleArray(6);
        Object[] term3431 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 4);
        Object term3432 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3433 = (double[]) newDoubleArray(0);
        Object term3434 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3435 = (double[]) newDoubleArray(0);
        Object term3436 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3437 = (double[]) newDoubleArray(0);
        Object term3438 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3439 = (double[]) newDoubleArray(0);
        setDoubleField(term3345, term3345.getClass(), "splitTolerance", 0.5491008007248219);
        setDoubleElement(term3347, 0, 0.6962503987895765);
        setDoubleElement(term3347, 1, 0.8714203144648995);
        setDoubleElement(term3347, 2, 0.9525091173767415);
        setDoubleElement(term3347, 3, 0.2076820298271066);
        setDoubleElement(term3347, 4, 0.9869943597370645);
        setField(term3345, term3345.getClass(), "main", term3347);
        setDoubleElement(term3353, 0, 0.9742622723146419);
        setDoubleElement(term3353, 1, 0.6077671346464576);
        setDoubleElement(term3353, 2, 0.6250274796996639);
        setDoubleElement(term3353, 3, 0.22427137827351773);
        setDoubleElement(term3353, 4, 0.969490221046839);
        setDoubleElement(term3353, 5, 0.05936829916325781);
        setDoubleElement(term3353, 6, 0.491721920101997);
        setDoubleElement(term3353, 7, 0.09671480925896325);
        setField(term3345, term3345.getClass(), "secondary", term3353);
        setDoubleElement(term3362, 0, 0.831066683726038);
        setDoubleElement(term3362, 1, 0.4467038308214477);
        setField(term3345, term3345.getClass(), "squaredSecondary", term3362);
        setDoubleElement(term3367, 0, 0.6987261712647458);
        setDoubleElement(term3367, 1, 0.027581863399333106);
        setElement(term3366, 0, term3367);
        setDoubleElement(term3370, 0, 0.20990155104119645);
        setDoubleElement(term3370, 1, 0.9249913556195489);
        setDoubleElement(term3370, 2, 0.1877052577832934);
        setDoubleElement(term3370, 3, 0.23668713227491267);
        setDoubleElement(term3370, 4, 0.9239377572164318);
        setDoubleElement(term3370, 5, 0.6813010351714496);
        setElement(term3366, 1, term3370);
        setDoubleElement(term3377, 0, 0.09763351687433919);
        setDoubleElement(term3377, 1, 0.3806640485312077);
        setDoubleElement(term3377, 2, 0.6927105919942684);
        setDoubleElement(term3377, 3, 0.472345126379197);
        setElement(term3366, 2, term3377);
        setElement(term3366, 3, term3382);
        setField(term3365, term3365.getClass(), "householderVectors", term3366);
        setDoubleElement(term3383, 0, 0.41193101624838113);
        setDoubleElement(term3383, 1, 0.10886537960295217);
        setDoubleElement(term3383, 2, 0.04963830239720779);
        setField(term3365, term3365.getClass(), "main", term3383);
        setDoubleElement(term3387, 0, 0.8167525902171758);
        setDoubleElement(term3387, 1, 0.807455542261219);
        setDoubleElement(term3387, 2, 0.564596292861835);
        setDoubleElement(term3387, 3, 0.5654978046272103);
        setField(term3365, term3365.getClass(), "secondary", term3387);
        setField(term3365, term3365.getClass(), "cachedQ", null);
        setField(term3365, term3365.getClass(), "cachedQt", null);
        setField(term3365, term3365.getClass(), "cachedT", null);
        setField(term3345, term3345.getClass(), "transformer", term3365);
        setDoubleField(term3345, term3345.getClass(), "lowerSpectra", 0.49505702229385595);
        setDoubleField(term3345, term3345.getClass(), "upperSpectra", 0.5599950475897455);
        setDoubleField(term3345, term3345.getClass(), "minPivot", 0.46000626436198166);
        setDoubleField(term3345, term3345.getClass(), "sigma", 0.872983779948575);
        setDoubleField(term3345, term3345.getClass(), "sigmaLow", 0.937384758014478);
        setDoubleField(term3345, term3345.getClass(), "tau", 0.17047563714084557);
        setDoubleElement(term3398, 0, 0.8578492218112453);
        setDoubleElement(term3398, 1, 0.49494546187433763);
        setDoubleElement(term3398, 2, 0.4118373527197986);
        setDoubleElement(term3398, 3, 0.8419204874913121);
        setDoubleElement(term3398, 4, 0.20445387624778377);
        setDoubleElement(term3398, 5, 0.14784017441675146);
        setDoubleElement(term3398, 6, 0.665820823383757);
        setDoubleElement(term3398, 7, 0.059265345156214067);
        setDoubleElement(term3398, 8, 0.4756291598245479);
        setField(term3345, term3345.getClass(), "work", term3398);
        setIntField(term3345, term3345.getClass(), "pingPong", -1048298087);
        setDoubleField(term3345, term3345.getClass(), "qMax", 0.01713844734747194);
        setDoubleField(term3345, term3345.getClass(), "eMin", 0.818081528497029);
        setIntField(term3345, term3345.getClass(), "tType", 292681826);
        setDoubleField(term3345, term3345.getClass(), "dMin", 0.3024567751198154);
        setDoubleField(term3345, term3345.getClass(), "dMin1", 0.5208622891399592);
        setDoubleField(term3345, term3345.getClass(), "dMin2", 0.48286049640108797);
        setDoubleField(term3345, term3345.getClass(), "dN", 0.8509665040333385);
        setDoubleField(term3345, term3345.getClass(), "dN1", 0.3578293137730927);
        setDoubleField(term3345, term3345.getClass(), "dN2", 0.8210501981778406);
        setDoubleField(term3345, term3345.getClass(), "g", 0.9111194297569267);
        setDoubleElement(term3419, 0, 0.010433959251596847);
        setDoubleElement(term3419, 1, 0.7835783117780157);
        setDoubleElement(term3419, 2, 0.9111373377093535);
        setDoubleElement(term3419, 3, 0.42149147525108077);
        setField(term3345, term3345.getClass(), "realEigenvalues", term3419);
        setDoubleElement(term3424, 0, 0.7855974069248086);
        setDoubleElement(term3424, 1, 0.8322154744386016);
        setDoubleElement(term3424, 2, 0.6614161306210307);
        setDoubleElement(term3424, 3, 0.9902296633473404);
        setDoubleElement(term3424, 4, 0.9100944689992451);
        setDoubleElement(term3424, 5, 0.5362140838151028);
        setField(term3345, term3345.getClass(), "imagEigenvalues", term3424);
        setField(term3432, term3432.getClass(), "data", term3433);
        setElement(term3431, 0, term3432);
        setField(term3434, term3434.getClass(), "data", term3435);
        setElement(term3431, 1, term3434);
        setField(term3436, term3436.getClass(), "data", term3437);
        setElement(term3431, 2, term3436);
        setField(term3438, term3438.getClass(), "data", term3439);
        setElement(term3431, 3, term3438);
        setField(term3345, term3345.getClass(), "eigenvectors", term3431);
        setField(term3345, term3345.getClass(), "cachedV", null);
        setField(term3345, term3345.getClass(), "cachedD", null);
        setField(term3345, term3345.getClass(), "cachedVt", null);
        term3440 = new Integer(458147407);
        term3442 = new Integer(-184153539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3440;
        args[1] = term3442;
        try {
            callMethod(klass, "flipIfWarranted", argTypes, term3345, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


