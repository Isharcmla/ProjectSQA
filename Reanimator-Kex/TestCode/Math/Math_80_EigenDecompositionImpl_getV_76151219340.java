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
import org.apache.commons.math.linear.InvalidMatrixException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class EigenDecompositionImpl_getV_76151219340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;

    public EigenDecompositionImpl_getV_76151219340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term298 = (double[]) newDoubleArray(2);
        double[] term301 = (double[]) newDoubleArray(6);
        double[] term308 = (double[]) newDoubleArray(6);
        Object term315 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term316 = (Object[]) newArray("[D", 2);
        double[] term317 = (double[]) newDoubleArray(5);
        double[] term323 = (double[]) newDoubleArray(3);
        double[] term327 = (double[]) newDoubleArray(5);
        double[] term333 = (double[]) newDoubleArray(5);
        double[] term345 = (double[]) newDoubleArray(1);
        double[] term358 = (double[]) newDoubleArray(0);
        double[] term359 = (double[]) newDoubleArray(9);
        Object[] term369 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 4);
        Object term370 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term371 = (double[]) newDoubleArray(0);
        Object term372 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term373 = (double[]) newDoubleArray(0);
        Object term374 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term375 = (double[]) newDoubleArray(0);
        Object term376 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term377 = (double[]) newDoubleArray(0);
        setDoubleField(term296, term296.getClass(), "splitTolerance", 0.9123572866833729);
        setDoubleElement(term298, 0, 0.40635376375558196);
        setDoubleElement(term298, 1, 0.4772043271031934);
        setField(term296, term296.getClass(), "main", term298);
        setDoubleElement(term301, 0, 0.2446504549754045);
        setDoubleElement(term301, 1, 0.6142723998707854);
        setDoubleElement(term301, 2, 0.4355627280318103);
        setDoubleElement(term301, 3, 0.841460835734741);
        setDoubleElement(term301, 4, 0.7859316615744082);
        setDoubleElement(term301, 5, 0.6428742553484879);
        setField(term296, term296.getClass(), "secondary", term301);
        setDoubleElement(term308, 0, 0.6584165706677267);
        setDoubleElement(term308, 1, 0.44268490778872205);
        setDoubleElement(term308, 2, 0.7507333108648018);
        setDoubleElement(term308, 3, 0.007493740494434409);
        setDoubleElement(term308, 4, 0.29172553321356776);
        setDoubleElement(term308, 5, 0.9276995636844321);
        setField(term296, term296.getClass(), "squaredSecondary", term308);
        setDoubleElement(term317, 0, 0.7636130748477434);
        setDoubleElement(term317, 1, 0.07901636960861558);
        setDoubleElement(term317, 2, 0.18717846301066243);
        setDoubleElement(term317, 3, 0.5335953039331021);
        setDoubleElement(term317, 4, 0.5725602309856443);
        setElement(term316, 0, term317);
        setDoubleElement(term323, 0, 0.5310967137636303);
        setDoubleElement(term323, 1, 0.6054109236809134);
        setDoubleElement(term323, 2, 0.9165240441138934);
        setElement(term316, 1, term323);
        setField(term315, term315.getClass(), "householderVectors", term316);
        setDoubleElement(term327, 0, 0.22227423914231126);
        setDoubleElement(term327, 1, 0.06480976831423468);
        setDoubleElement(term327, 2, 0.8490790645379176);
        setDoubleElement(term327, 3, 0.23129126164078717);
        setDoubleElement(term327, 4, 0.6047138318674447);
        setField(term315, term315.getClass(), "main", term327);
        setDoubleElement(term333, 0, 0.5597136413549945);
        setDoubleElement(term333, 1, 0.28292420012823627);
        setDoubleElement(term333, 2, 0.5407563152320285);
        setDoubleElement(term333, 3, 0.9485929668765458);
        setDoubleElement(term333, 4, 0.5179319342588155);
        setField(term315, term315.getClass(), "secondary", term333);
        setField(term315, term315.getClass(), "cachedQ", null);
        setField(term315, term315.getClass(), "cachedQt", null);
        setField(term315, term315.getClass(), "cachedT", null);
        setField(term296, term296.getClass(), "transformer", term315);
        setDoubleField(term296, term296.getClass(), "lowerSpectra", 0.25025774487844066);
        setDoubleField(term296, term296.getClass(), "upperSpectra", 0.1858089882752998);
        setDoubleField(term296, term296.getClass(), "minPivot", 0.2440697646709713);
        setDoubleField(term296, term296.getClass(), "sigma", 0.7977455176064363);
        setDoubleField(term296, term296.getClass(), "sigmaLow", 0.5329919447422633);
        setDoubleField(term296, term296.getClass(), "tau", 0.7046974927834232);
        setDoubleElement(term345, 0, 0.6896952303224777);
        setField(term296, term296.getClass(), "work", term345);
        setIntField(term296, term296.getClass(), "pingPong", -1922583790);
        setDoubleField(term296, term296.getClass(), "qMax", 0.6693176553622628);
        setDoubleField(term296, term296.getClass(), "eMin", 0.2962868255626906);
        setIntField(term296, term296.getClass(), "tType", -616727354);
        setDoubleField(term296, term296.getClass(), "dMin", 0.25474180574060834);
        setDoubleField(term296, term296.getClass(), "dMin1", 0.9957585718901875);
        setDoubleField(term296, term296.getClass(), "dMin2", 0.16755811343784477);
        setDoubleField(term296, term296.getClass(), "dN", 0.9090793968999221);
        setDoubleField(term296, term296.getClass(), "dN1", 0.25997329921466494);
        setDoubleField(term296, term296.getClass(), "dN2", 0.7814864708383836);
        setDoubleField(term296, term296.getClass(), "g", 0.5657654165545906);
        setField(term296, term296.getClass(), "realEigenvalues", term358);
        setDoubleElement(term359, 0, 0.6382060245198228);
        setDoubleElement(term359, 1, 0.1849998667663698);
        setDoubleElement(term359, 2, 0.36312400202399575);
        setDoubleElement(term359, 3, 0.5485690030548175);
        setDoubleElement(term359, 4, 0.9765248027281291);
        setDoubleElement(term359, 5, 0.9184034277897645);
        setDoubleElement(term359, 6, 0.9457448635091538);
        setDoubleElement(term359, 7, 0.3238255203811462);
        setDoubleElement(term359, 8, 0.2843894095932772);
        setField(term296, term296.getClass(), "imagEigenvalues", term359);
        setField(term370, term370.getClass(), "data", term371);
        setElement(term369, 0, term370);
        setField(term372, term372.getClass(), "data", term373);
        setElement(term369, 1, term372);
        setField(term374, term374.getClass(), "data", term375);
        setElement(term369, 2, term374);
        setField(term376, term376.getClass(), "data", term377);
        setElement(term369, 3, term376);
        setField(term296, term296.getClass(), "eigenvectors", term369);
        setField(term296, term296.getClass(), "cachedV", null);
        setField(term296, term296.getClass(), "cachedD", null);
        setField(term296, term296.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getV", argTypes, term296, args);
            assertTrue(false);
        }
        catch (InvalidMatrixException e) {
        }

    }

};


