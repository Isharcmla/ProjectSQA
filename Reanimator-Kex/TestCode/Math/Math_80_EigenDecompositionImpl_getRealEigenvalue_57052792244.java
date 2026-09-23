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

public class EigenDecompositionImpl_getRealEigenvalue_57052792244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term948;
     Object term1036;

    public EigenDecompositionImpl_getRealEigenvalue_57052792244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term948 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term950 = (double[]) newDoubleArray(8);
        double[] term959 = (double[]) newDoubleArray(6);
        double[] term966 = (double[]) newDoubleArray(2);
        Object term969 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term970 = (Object[]) newArray("[D", 1);
        double[] term971 = (double[]) newDoubleArray(5);
        double[] term977 = (double[]) newDoubleArray(3);
        double[] term981 = (double[]) newDoubleArray(9);
        double[] term997 = (double[]) newDoubleArray(7);
        double[] term1016 = (double[]) newDoubleArray(6);
        double[] term1023 = (double[]) newDoubleArray(5);
        Object[] term1029 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 3);
        Object term1030 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1031 = (double[]) newDoubleArray(0);
        Object term1032 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1033 = (double[]) newDoubleArray(0);
        Object term1034 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1035 = (double[]) newDoubleArray(0);
        setDoubleField(term948, term948.getClass(), "splitTolerance", 0.2131256081762306);
        setDoubleElement(term950, 0, 0.03588195391803095);
        setDoubleElement(term950, 1, 0.7965158013308613);
        setDoubleElement(term950, 2, 0.2875565287844002);
        setDoubleElement(term950, 3, 0.18556961666156768);
        setDoubleElement(term950, 4, 0.41801713209224123);
        setDoubleElement(term950, 5, 0.010058361776520197);
        setDoubleElement(term950, 6, 0.22206025307636057);
        setDoubleElement(term950, 7, 0.3762445362551795);
        setField(term948, term948.getClass(), "main", term950);
        setDoubleElement(term959, 0, 0.6004517527698794);
        setDoubleElement(term959, 1, 0.9412219458975137);
        setDoubleElement(term959, 2, 0.06469331916225318);
        setDoubleElement(term959, 3, 0.9259830415214885);
        setDoubleElement(term959, 4, 0.6688842921741369);
        setDoubleElement(term959, 5, 0.8067108928296716);
        setField(term948, term948.getClass(), "secondary", term959);
        setDoubleElement(term966, 0, 0.6293118636954493);
        setDoubleElement(term966, 1, 0.7705839211434976);
        setField(term948, term948.getClass(), "squaredSecondary", term966);
        setDoubleElement(term971, 0, 0.08858836329417497);
        setDoubleElement(term971, 1, 0.8582456540284578);
        setDoubleElement(term971, 2, 0.061434557058998585);
        setDoubleElement(term971, 3, 0.1621025751381594);
        setDoubleElement(term971, 4, 0.8809657273235505);
        setElement(term970, 0, term971);
        setField(term969, term969.getClass(), "householderVectors", term970);
        setDoubleElement(term977, 0, 0.33296332053567956);
        setDoubleElement(term977, 1, 0.593079122289713);
        setDoubleElement(term977, 2, 0.7455431255888774);
        setField(term969, term969.getClass(), "main", term977);
        setDoubleElement(term981, 0, 0.9459012738750242);
        setDoubleElement(term981, 1, 0.967474946781822);
        setDoubleElement(term981, 2, 0.4429892630967539);
        setDoubleElement(term981, 3, 0.10126144382177782);
        setDoubleElement(term981, 4, 0.5029736700336335);
        setDoubleElement(term981, 5, 0.2617673558897229);
        setDoubleElement(term981, 6, 0.052590327313127294);
        setDoubleElement(term981, 7, 0.004207750553928968);
        setDoubleElement(term981, 8, 0.9107074560109533);
        setField(term969, term969.getClass(), "secondary", term981);
        setField(term969, term969.getClass(), "cachedQ", null);
        setField(term969, term969.getClass(), "cachedQt", null);
        setField(term969, term969.getClass(), "cachedT", null);
        setField(term948, term948.getClass(), "transformer", term969);
        setDoubleField(term948, term948.getClass(), "lowerSpectra", 0.22308265923522352);
        setDoubleField(term948, term948.getClass(), "upperSpectra", 0.46226950865842764);
        setDoubleField(term948, term948.getClass(), "minPivot", 0.6482086250011448);
        setDoubleField(term948, term948.getClass(), "sigma", 0.3154346482211354);
        setDoubleField(term948, term948.getClass(), "sigmaLow", 0.020103660328398276);
        setDoubleField(term948, term948.getClass(), "tau", 0.6530844366661772);
        setDoubleElement(term997, 0, 0.7368078667856154);
        setDoubleElement(term997, 1, 0.6799679189320558);
        setDoubleElement(term997, 2, 0.8342190257129791);
        setDoubleElement(term997, 3, 0.1057616236613994);
        setDoubleElement(term997, 4, 0.6517567007639319);
        setDoubleElement(term997, 5, 0.7471692213461502);
        setDoubleElement(term997, 6, 0.20733693951275556);
        setField(term948, term948.getClass(), "work", term997);
        setIntField(term948, term948.getClass(), "pingPong", 1134449235);
        setDoubleField(term948, term948.getClass(), "qMax", 0.6618543228332953);
        setDoubleField(term948, term948.getClass(), "eMin", 0.8760632597672348);
        setIntField(term948, term948.getClass(), "tType", -883034806);
        setDoubleField(term948, term948.getClass(), "dMin", 0.4046308665116508);
        setDoubleField(term948, term948.getClass(), "dMin1", 0.3546618953364844);
        setDoubleField(term948, term948.getClass(), "dMin2", 0.011186829850474256);
        setDoubleField(term948, term948.getClass(), "dN", 0.47058253607311484);
        setDoubleField(term948, term948.getClass(), "dN1", 0.7340691331467901);
        setDoubleField(term948, term948.getClass(), "dN2", 0.23604395020255575);
        setDoubleField(term948, term948.getClass(), "g", 0.7752202944026838);
        setDoubleElement(term1016, 0, 0.6814473488244137);
        setDoubleElement(term1016, 1, 0.7526628774283542);
        setDoubleElement(term1016, 2, 0.6609555690482892);
        setDoubleElement(term1016, 3, 0.20773286305836303);
        setDoubleElement(term1016, 4, 0.6902120717646517);
        setDoubleElement(term1016, 5, 0.483452767365532);
        setField(term948, term948.getClass(), "realEigenvalues", term1016);
        setDoubleElement(term1023, 0, 0.33984612849066775);
        setDoubleElement(term1023, 1, 0.992214897936456);
        setDoubleElement(term1023, 2, 0.10940058061451474);
        setDoubleElement(term1023, 3, 0.5280493395446559);
        setDoubleElement(term1023, 4, 0.5885698341309811);
        setField(term948, term948.getClass(), "imagEigenvalues", term1023);
        setField(term1030, term1030.getClass(), "data", term1031);
        setElement(term1029, 0, term1030);
        setField(term1032, term1032.getClass(), "data", term1033);
        setElement(term1029, 1, term1032);
        setField(term1034, term1034.getClass(), "data", term1035);
        setElement(term1029, 2, term1034);
        setField(term948, term948.getClass(), "eigenvectors", term1029);
        setField(term948, term948.getClass(), "cachedV", null);
        setField(term948, term948.getClass(), "cachedD", null);
        setField(term948, term948.getClass(), "cachedVt", null);
        term1036 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1036;
        try {
            callMethod(klass, "getRealEigenvalue", argTypes, term948, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


