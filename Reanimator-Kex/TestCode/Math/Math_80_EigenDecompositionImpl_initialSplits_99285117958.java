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

public class EigenDecompositionImpl_initialSplits_99285117958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3109;
     Object term3182;

    public EigenDecompositionImpl_initialSplits_99285117958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3109 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term3111 = (double[]) newDoubleArray(3);
        double[] term3115 = (double[]) newDoubleArray(0);
        double[] term3116 = (double[]) newDoubleArray(2);
        Object term3119 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term3120 = (Object[]) newArray("[D", 5);
        double[] term3121 = (double[]) newDoubleArray(0);
        double[] term3122 = (double[]) newDoubleArray(6);
        double[] term3129 = (double[]) newDoubleArray(2);
        double[] term3132 = (double[]) newDoubleArray(7);
        double[] term3140 = (double[]) newDoubleArray(4);
        double[] term3145 = (double[]) newDoubleArray(2);
        double[] term3148 = (double[]) newDoubleArray(1);
        double[] term3156 = (double[]) newDoubleArray(0);
        double[] term3168 = (double[]) newDoubleArray(2);
        double[] term3171 = (double[]) newDoubleArray(5);
        Object[] term3177 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 2);
        Object term3178 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3179 = (double[]) newDoubleArray(0);
        Object term3180 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3181 = (double[]) newDoubleArray(0);
        setDoubleField(term3109, term3109.getClass(), "splitTolerance", 0.7835572863983016);
        setDoubleElement(term3111, 0, 0.27036192661860925);
        setDoubleElement(term3111, 1, 0.871322715553573);
        setDoubleElement(term3111, 2, 0.9859225497604077);
        setField(term3109, term3109.getClass(), "main", term3111);
        setField(term3109, term3109.getClass(), "secondary", term3115);
        setDoubleElement(term3116, 0, 0.29527820404600214);
        setDoubleElement(term3116, 1, 0.8434643614018447);
        setField(term3109, term3109.getClass(), "squaredSecondary", term3116);
        setElement(term3120, 0, term3121);
        setDoubleElement(term3122, 0, 0.00210877501865836);
        setDoubleElement(term3122, 1, 0.11749444093040129);
        setDoubleElement(term3122, 2, 0.12856990669752166);
        setDoubleElement(term3122, 3, 0.7871693137371649);
        setDoubleElement(term3122, 4, 0.4111991184653976);
        setDoubleElement(term3122, 5, 0.3688320407866329);
        setElement(term3120, 1, term3122);
        setDoubleElement(term3129, 0, 0.7704283024189764);
        setDoubleElement(term3129, 1, 0.24532916475451183);
        setElement(term3120, 2, term3129);
        setDoubleElement(term3132, 0, 0.2821279199094008);
        setDoubleElement(term3132, 1, 0.7198652890536935);
        setDoubleElement(term3132, 2, 0.010833029141803951);
        setDoubleElement(term3132, 3, 0.1708539695203959);
        setDoubleElement(term3132, 4, 0.46630440467911727);
        setDoubleElement(term3132, 5, 0.6135021698139438);
        setDoubleElement(term3132, 6, 0.9744854247738662);
        setElement(term3120, 3, term3132);
        setDoubleElement(term3140, 0, 0.8448572663497166);
        setDoubleElement(term3140, 1, 0.44427267003047954);
        setDoubleElement(term3140, 2, 0.6510046609054884);
        setDoubleElement(term3140, 3, 0.7348952452308307);
        setElement(term3120, 4, term3140);
        setField(term3119, term3119.getClass(), "householderVectors", term3120);
        setDoubleElement(term3145, 0, 0.3554167808758565);
        setDoubleElement(term3145, 1, 0.6602905273017295);
        setField(term3119, term3119.getClass(), "main", term3145);
        setDoubleElement(term3148, 0, 0.18162585474118642);
        setField(term3119, term3119.getClass(), "secondary", term3148);
        setField(term3119, term3119.getClass(), "cachedQ", null);
        setField(term3119, term3119.getClass(), "cachedQt", null);
        setField(term3119, term3119.getClass(), "cachedT", null);
        setField(term3109, term3109.getClass(), "transformer", term3119);
        setDoubleField(term3109, term3109.getClass(), "lowerSpectra", 0.13499238703794558);
        setDoubleField(term3109, term3109.getClass(), "upperSpectra", 0.46505735758715006);
        setDoubleField(term3109, term3109.getClass(), "minPivot", 0.8021566501622185);
        setDoubleField(term3109, term3109.getClass(), "sigma", 0.9797763362008045);
        setDoubleField(term3109, term3109.getClass(), "sigmaLow", 0.8730095856413708);
        setDoubleField(term3109, term3109.getClass(), "tau", 0.42594697418584104);
        setField(term3109, term3109.getClass(), "work", term3156);
        setIntField(term3109, term3109.getClass(), "pingPong", -1968847291);
        setDoubleField(term3109, term3109.getClass(), "qMax", 0.7359116915729608);
        setDoubleField(term3109, term3109.getClass(), "eMin", 0.16099540167443394);
        setIntField(term3109, term3109.getClass(), "tType", 579005622);
        setDoubleField(term3109, term3109.getClass(), "dMin", 0.0032031687815008425);
        setDoubleField(term3109, term3109.getClass(), "dMin1", 0.3379289469153276);
        setDoubleField(term3109, term3109.getClass(), "dMin2", 0.09898387578677581);
        setDoubleField(term3109, term3109.getClass(), "dN", 0.8522605188766443);
        setDoubleField(term3109, term3109.getClass(), "dN1", 0.7480484510848255);
        setDoubleField(term3109, term3109.getClass(), "dN2", 0.5868962060721916);
        setDoubleField(term3109, term3109.getClass(), "g", 0.005544728815947253);
        setDoubleElement(term3168, 0, 0.902676261684306);
        setDoubleElement(term3168, 1, 0.9218672416580571);
        setField(term3109, term3109.getClass(), "realEigenvalues", term3168);
        setDoubleElement(term3171, 0, 0.7496470784921199);
        setDoubleElement(term3171, 1, 0.9242863644075359);
        setDoubleElement(term3171, 2, 0.0973418973835607);
        setDoubleElement(term3171, 3, 0.32541509985477524);
        setDoubleElement(term3171, 4, 0.10624377997246504);
        setField(term3109, term3109.getClass(), "imagEigenvalues", term3171);
        setField(term3178, term3178.getClass(), "data", term3179);
        setElement(term3177, 0, term3178);
        setField(term3180, term3180.getClass(), "data", term3181);
        setElement(term3177, 1, term3180);
        setField(term3109, term3109.getClass(), "eigenvectors", term3177);
        setField(term3109, term3109.getClass(), "cachedV", null);
        setField(term3109, term3109.getClass(), "cachedD", null);
        setField(term3109, term3109.getClass(), "cachedVt", null);
        term3182 = new Integer(-14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3182;
        try {
            callMethod(klass, "initialSplits", argTypes, term3109, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


