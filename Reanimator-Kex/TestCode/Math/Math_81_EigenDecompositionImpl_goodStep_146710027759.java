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

public class EigenDecompositionImpl_goodStep_146710027759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3218;
     Object term3303;
     Object term3305;

    public EigenDecompositionImpl_goodStep_146710027759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3218 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term3220 = (double[]) newDoubleArray(0);
        double[] term3221 = (double[]) newDoubleArray(5);
        double[] term3227 = (double[]) newDoubleArray(4);
        Object term3232 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term3233 = (Object[]) newArray("[D", 3);
        double[] term3234 = (double[]) newDoubleArray(5);
        double[] term3240 = (double[]) newDoubleArray(9);
        double[] term3250 = (double[]) newDoubleArray(3);
        double[] term3254 = (double[]) newDoubleArray(5);
        double[] term3260 = (double[]) newDoubleArray(0);
        double[] term3267 = (double[]) newDoubleArray(1);
        double[] term3280 = (double[]) newDoubleArray(0);
        double[] term3281 = (double[]) newDoubleArray(6);
        Object[] term3288 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 7);
        Object term3289 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3290 = (double[]) newDoubleArray(0);
        Object term3291 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3292 = (double[]) newDoubleArray(0);
        Object term3293 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3294 = (double[]) newDoubleArray(0);
        Object term3295 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3296 = (double[]) newDoubleArray(0);
        Object term3297 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3298 = (double[]) newDoubleArray(0);
        Object term3299 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3300 = (double[]) newDoubleArray(0);
        Object term3301 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3302 = (double[]) newDoubleArray(0);
        setDoubleField(term3218, term3218.getClass(), "splitTolerance", 0.5515266472781634);
        setField(term3218, term3218.getClass(), "main", term3220);
        setDoubleElement(term3221, 0, 0.920204482814009);
        setDoubleElement(term3221, 1, 0.18677602647831992);
        setDoubleElement(term3221, 2, 0.5620284908568363);
        setDoubleElement(term3221, 3, 0.4214941757931592);
        setDoubleElement(term3221, 4, 0.9009620538952149);
        setField(term3218, term3218.getClass(), "secondary", term3221);
        setDoubleElement(term3227, 0, 0.09598300824663397);
        setDoubleElement(term3227, 1, 0.3488342586091009);
        setDoubleElement(term3227, 2, 0.07084009583074191);
        setDoubleElement(term3227, 3, 0.976589553034152);
        setField(term3218, term3218.getClass(), "squaredSecondary", term3227);
        setDoubleElement(term3234, 0, 0.9091029161718786);
        setDoubleElement(term3234, 1, 0.3485608451860187);
        setDoubleElement(term3234, 2, 0.8058692746281759);
        setDoubleElement(term3234, 3, 0.09981780078534064);
        setDoubleElement(term3234, 4, 0.7820943194486873);
        setElement(term3233, 0, term3234);
        setDoubleElement(term3240, 0, 0.26216865675155776);
        setDoubleElement(term3240, 1, 0.5086784040916195);
        setDoubleElement(term3240, 2, 0.5349035289029883);
        setDoubleElement(term3240, 3, 0.8355679479881373);
        setDoubleElement(term3240, 4, 0.13327625409903998);
        setDoubleElement(term3240, 5, 0.46233438925988046);
        setDoubleElement(term3240, 6, 0.8952865943131467);
        setDoubleElement(term3240, 7, 0.9486485257232683);
        setDoubleElement(term3240, 8, 0.9279305067048012);
        setElement(term3233, 1, term3240);
        setDoubleElement(term3250, 0, 0.8754210616005208);
        setDoubleElement(term3250, 1, 0.9982379295613013);
        setDoubleElement(term3250, 2, 0.8334584355306505);
        setElement(term3233, 2, term3250);
        setField(term3232, term3232.getClass(), "householderVectors", term3233);
        setDoubleElement(term3254, 0, 0.9707502413967632);
        setDoubleElement(term3254, 1, 0.6427281333635387);
        setDoubleElement(term3254, 2, 0.03836010467767137);
        setDoubleElement(term3254, 3, 0.851312830445343);
        setDoubleElement(term3254, 4, 0.04252809268281976);
        setField(term3232, term3232.getClass(), "main", term3254);
        setField(term3232, term3232.getClass(), "secondary", term3260);
        setField(term3232, term3232.getClass(), "cachedQ", null);
        setField(term3232, term3232.getClass(), "cachedQt", null);
        setField(term3232, term3232.getClass(), "cachedT", null);
        setField(term3218, term3218.getClass(), "transformer", term3232);
        setDoubleField(term3218, term3218.getClass(), "lowerSpectra", 0.8915512623583132);
        setDoubleField(term3218, term3218.getClass(), "upperSpectra", 0.41480949198625816);
        setDoubleField(term3218, term3218.getClass(), "minPivot", 0.9975368153396807);
        setDoubleField(term3218, term3218.getClass(), "sigma", 0.8555074009522616);
        setDoubleField(term3218, term3218.getClass(), "sigmaLow", 0.032017661073214576);
        setDoubleField(term3218, term3218.getClass(), "tau", 0.7863675468675377);
        setDoubleElement(term3267, 0, 0.1038853571690046);
        setField(term3218, term3218.getClass(), "work", term3267);
        setIntField(term3218, term3218.getClass(), "pingPong", 1632125673);
        setDoubleField(term3218, term3218.getClass(), "qMax", 0.43993390063139404);
        setDoubleField(term3218, term3218.getClass(), "eMin", 0.3550466083267433);
        setIntField(term3218, term3218.getClass(), "tType", 454281060);
        setDoubleField(term3218, term3218.getClass(), "dMin", 0.5739961255724226);
        setDoubleField(term3218, term3218.getClass(), "dMin1", 0.5858669515619307);
        setDoubleField(term3218, term3218.getClass(), "dMin2", 0.699115160808336);
        setDoubleField(term3218, term3218.getClass(), "dN", 0.7030001298508088);
        setDoubleField(term3218, term3218.getClass(), "dN1", 0.18226954599281897);
        setDoubleField(term3218, term3218.getClass(), "dN2", 0.9968423617165025);
        setDoubleField(term3218, term3218.getClass(), "g", 0.020102885132596948);
        setField(term3218, term3218.getClass(), "realEigenvalues", term3280);
        setDoubleElement(term3281, 0, 0.3757739798028954);
        setDoubleElement(term3281, 1, 0.6690842886241162);
        setDoubleElement(term3281, 2, 0.24159013107052651);
        setDoubleElement(term3281, 3, 0.36324671953515286);
        setDoubleElement(term3281, 4, 0.2290241149807456);
        setDoubleElement(term3281, 5, 0.4573043724934611);
        setField(term3218, term3218.getClass(), "imagEigenvalues", term3281);
        setField(term3289, term3289.getClass(), "data", term3290);
        setElement(term3288, 0, term3289);
        setField(term3291, term3291.getClass(), "data", term3292);
        setElement(term3288, 1, term3291);
        setField(term3293, term3293.getClass(), "data", term3294);
        setElement(term3288, 2, term3293);
        setField(term3295, term3295.getClass(), "data", term3296);
        setElement(term3288, 3, term3295);
        setField(term3297, term3297.getClass(), "data", term3298);
        setElement(term3288, 4, term3297);
        setField(term3299, term3299.getClass(), "data", term3300);
        setElement(term3288, 5, term3299);
        setField(term3301, term3301.getClass(), "data", term3302);
        setElement(term3288, 6, term3301);
        setField(term3218, term3218.getClass(), "eigenvectors", term3288);
        setField(term3218, term3218.getClass(), "cachedV", null);
        setField(term3218, term3218.getClass(), "cachedD", null);
        setField(term3218, term3218.getClass(), "cachedVt", null);
        term3303 = new Integer(-1786399638);
        term3305 = new Integer(2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3303;
        args[1] = term3305;
        try {
            callMethod(klass, "goodStep", argTypes, term3218, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


