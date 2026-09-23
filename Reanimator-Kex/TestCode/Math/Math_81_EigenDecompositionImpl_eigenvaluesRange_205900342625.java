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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class EigenDecompositionImpl_eigenvaluesRange_205900342625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3497;
     Object term3569;
     Object term3571;

    public EigenDecompositionImpl_eigenvaluesRange_205900342625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3497 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term3499 = (double[]) newDoubleArray(5);
        double[] term3505 = (double[]) newDoubleArray(0);
        double[] term3506 = (double[]) newDoubleArray(6);
        Object term3513 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term3514 = (Object[]) newArray("[D", 0);
        double[] term3515 = (double[]) newDoubleArray(2);
        double[] term3518 = (double[]) newDoubleArray(6);
        double[] term3531 = (double[]) newDoubleArray(2);
        double[] term3545 = (double[]) newDoubleArray(8);
        double[] term3554 = (double[]) newDoubleArray(7);
        Object[] term3562 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 3);
        Object term3563 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3564 = (double[]) newDoubleArray(0);
        Object term3565 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3566 = (double[]) newDoubleArray(0);
        Object term3567 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3568 = (double[]) newDoubleArray(0);
        setDoubleField(term3497, term3497.getClass(), "splitTolerance", 0.4598790063336152);
        setDoubleElement(term3499, 0, 0.855781321665093);
        setDoubleElement(term3499, 1, 0.00432978885476254);
        setDoubleElement(term3499, 2, 0.7226219442738863);
        setDoubleElement(term3499, 3, 0.09289352321391486);
        setDoubleElement(term3499, 4, 0.955766757538822);
        setField(term3497, term3497.getClass(), "main", term3499);
        setField(term3497, term3497.getClass(), "secondary", term3505);
        setDoubleElement(term3506, 0, 0.06064863889909755);
        setDoubleElement(term3506, 1, 0.43823947470678104);
        setDoubleElement(term3506, 2, 0.7826054601213082);
        setDoubleElement(term3506, 3, 0.04352020326712169);
        setDoubleElement(term3506, 4, 0.9627559723596711);
        setDoubleElement(term3506, 5, 0.639031578052806);
        setField(term3497, term3497.getClass(), "squaredSecondary", term3506);
        setField(term3513, term3513.getClass(), "householderVectors", term3514);
        setDoubleElement(term3515, 0, 0.406857009623232);
        setDoubleElement(term3515, 1, 0.20749056897406915);
        setField(term3513, term3513.getClass(), "main", term3515);
        setDoubleElement(term3518, 0, 0.6262035493360271);
        setDoubleElement(term3518, 1, 0.025761524745151254);
        setDoubleElement(term3518, 2, 0.4010401390004734);
        setDoubleElement(term3518, 3, 0.7482443498063351);
        setDoubleElement(term3518, 4, 0.14852535454334959);
        setDoubleElement(term3518, 5, 0.5924057883972601);
        setField(term3513, term3513.getClass(), "secondary", term3518);
        setField(term3513, term3513.getClass(), "cachedQ", null);
        setField(term3513, term3513.getClass(), "cachedQt", null);
        setField(term3513, term3513.getClass(), "cachedT", null);
        setField(term3497, term3497.getClass(), "transformer", term3513);
        setDoubleField(term3497, term3497.getClass(), "lowerSpectra", 0.22118847311780854);
        setDoubleField(term3497, term3497.getClass(), "upperSpectra", 0.755508343095086);
        setDoubleField(term3497, term3497.getClass(), "minPivot", 0.565609532968288);
        setDoubleField(term3497, term3497.getClass(), "sigma", 0.7947290048119144);
        setDoubleField(term3497, term3497.getClass(), "sigmaLow", 0.5337430117272884);
        setDoubleField(term3497, term3497.getClass(), "tau", 0.27163525969236135);
        setDoubleElement(term3531, 0, 0.4251526356052183);
        setDoubleElement(term3531, 1, 0.24346852568817023);
        setField(term3497, term3497.getClass(), "work", term3531);
        setIntField(term3497, term3497.getClass(), "pingPong", 493620644);
        setDoubleField(term3497, term3497.getClass(), "qMax", 0.489810781846415);
        setDoubleField(term3497, term3497.getClass(), "eMin", 0.6280707278367392);
        setIntField(term3497, term3497.getClass(), "tType", 1328271830);
        setDoubleField(term3497, term3497.getClass(), "dMin", 0.4085500442184048);
        setDoubleField(term3497, term3497.getClass(), "dMin1", 0.47989828700352943);
        setDoubleField(term3497, term3497.getClass(), "dMin2", 0.5403673884189805);
        setDoubleField(term3497, term3497.getClass(), "dN", 0.3978451405778901);
        setDoubleField(term3497, term3497.getClass(), "dN1", 0.6593342866252248);
        setDoubleField(term3497, term3497.getClass(), "dN2", 0.7011120430733232);
        setDoubleField(term3497, term3497.getClass(), "g", 0.2537379248999696);
        setDoubleElement(term3545, 0, 0.41980955559278166);
        setDoubleElement(term3545, 1, 0.30928014508519164);
        setDoubleElement(term3545, 2, 0.26818656484636727);
        setDoubleElement(term3545, 3, 0.5078233810160571);
        setDoubleElement(term3545, 4, 0.5192798694370556);
        setDoubleElement(term3545, 5, 0.9325545481074903);
        setDoubleElement(term3545, 6, 0.45245524121354275);
        setDoubleElement(term3545, 7, 0.246922193390965);
        setField(term3497, term3497.getClass(), "realEigenvalues", term3545);
        setDoubleElement(term3554, 0, 0.8749487701724186);
        setDoubleElement(term3554, 1, 0.3037953178741225);
        setDoubleElement(term3554, 2, 0.15344338351874887);
        setDoubleElement(term3554, 3, 0.7166295369378838);
        setDoubleElement(term3554, 4, 0.46337073151103136);
        setDoubleElement(term3554, 5, 0.8877623588181615);
        setDoubleElement(term3554, 6, 0.25658632990710484);
        setField(term3497, term3497.getClass(), "imagEigenvalues", term3554);
        setField(term3563, term3563.getClass(), "data", term3564);
        setElement(term3562, 0, term3563);
        setField(term3565, term3565.getClass(), "data", term3566);
        setElement(term3562, 1, term3565);
        setField(term3567, term3567.getClass(), "data", term3568);
        setElement(term3562, 2, term3567);
        setField(term3497, term3497.getClass(), "eigenvectors", term3562);
        setField(term3497, term3497.getClass(), "cachedV", null);
        setField(term3497, term3497.getClass(), "cachedD", null);
        setField(term3497, term3497.getClass(), "cachedVt", null);
        term3569 = new Integer(1596070772);
        term3571 = new Integer(97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3569;
        args[1] = term3571;
        callMethod(klass, "eigenvaluesRange", argTypes, term3497, args);
    }

};


