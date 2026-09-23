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

public class EigenDecompositionImpl_computeGershgorinCircles_33739891615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1866;

    public EigenDecompositionImpl_computeGershgorinCircles_33739891615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1866 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term1868 = (double[]) newDoubleArray(2);
        double[] term1871 = (double[]) newDoubleArray(0);
        double[] term1872 = (double[]) newDoubleArray(7);
        Object term1880 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term1881 = (Object[]) newArray("[D", 2);
        double[] term1882 = (double[]) newDoubleArray(0);
        double[] term1883 = (double[]) newDoubleArray(9);
        double[] term1893 = (double[]) newDoubleArray(5);
        double[] term1899 = (double[]) newDoubleArray(1);
        double[] term1907 = (double[]) newDoubleArray(2);
        double[] term1921 = (double[]) newDoubleArray(8);
        double[] term1930 = (double[]) newDoubleArray(1);
        Object[] term1932 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 9);
        Object term1933 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1934 = (double[]) newDoubleArray(0);
        Object term1935 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1936 = (double[]) newDoubleArray(0);
        Object term1937 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1938 = (double[]) newDoubleArray(0);
        Object term1939 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1940 = (double[]) newDoubleArray(0);
        Object term1941 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1942 = (double[]) newDoubleArray(0);
        Object term1943 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1944 = (double[]) newDoubleArray(0);
        Object term1945 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1946 = (double[]) newDoubleArray(0);
        Object term1947 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1948 = (double[]) newDoubleArray(0);
        Object term1949 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1950 = (double[]) newDoubleArray(0);
        setDoubleField(term1866, term1866.getClass(), "splitTolerance", 0.3326214440098766);
        setDoubleElement(term1868, 0, 0.42989847076296206);
        setDoubleElement(term1868, 1, 0.8605802060060375);
        setField(term1866, term1866.getClass(), "main", term1868);
        setField(term1866, term1866.getClass(), "secondary", term1871);
        setDoubleElement(term1872, 0, 0.746182708698679);
        setDoubleElement(term1872, 1, 0.43468122773144435);
        setDoubleElement(term1872, 2, 0.30316310060633844);
        setDoubleElement(term1872, 3, 0.45666264951111046);
        setDoubleElement(term1872, 4, 0.6463368736569162);
        setDoubleElement(term1872, 5, 0.35554035462293654);
        setDoubleElement(term1872, 6, 0.6605765366899409);
        setField(term1866, term1866.getClass(), "squaredSecondary", term1872);
        setElement(term1881, 0, term1882);
        setDoubleElement(term1883, 0, 0.34606826774619304);
        setDoubleElement(term1883, 1, 0.208911877309652);
        setDoubleElement(term1883, 2, 0.6712198198383964);
        setDoubleElement(term1883, 3, 0.6560878972868479);
        setDoubleElement(term1883, 4, 0.49164780269698416);
        setDoubleElement(term1883, 5, 0.05844959776072378);
        setDoubleElement(term1883, 6, 0.7545938732933054);
        setDoubleElement(term1883, 7, 0.555720831263745);
        setDoubleElement(term1883, 8, 0.8296938655870651);
        setElement(term1881, 1, term1883);
        setField(term1880, term1880.getClass(), "householderVectors", term1881);
        setDoubleElement(term1893, 0, 0.008961627061484845);
        setDoubleElement(term1893, 1, 0.42881950761081433);
        setDoubleElement(term1893, 2, 0.5644745329624891);
        setDoubleElement(term1893, 3, 0.8988938672874076);
        setDoubleElement(term1893, 4, 0.6608826669219873);
        setField(term1880, term1880.getClass(), "main", term1893);
        setDoubleElement(term1899, 0, 0.7860233123966477);
        setField(term1880, term1880.getClass(), "secondary", term1899);
        setField(term1880, term1880.getClass(), "cachedQ", null);
        setField(term1880, term1880.getClass(), "cachedQt", null);
        setField(term1880, term1880.getClass(), "cachedT", null);
        setField(term1866, term1866.getClass(), "transformer", term1880);
        setDoubleField(term1866, term1866.getClass(), "lowerSpectra", 0.06433964340439391);
        setDoubleField(term1866, term1866.getClass(), "upperSpectra", 0.08993892686283389);
        setDoubleField(term1866, term1866.getClass(), "minPivot", 0.04630019236601257);
        setDoubleField(term1866, term1866.getClass(), "sigma", 0.6613885474313168);
        setDoubleField(term1866, term1866.getClass(), "sigmaLow", 0.494050019899438);
        setDoubleField(term1866, term1866.getClass(), "tau", 0.12165424271232805);
        setDoubleElement(term1907, 0, 0.9539599355783924);
        setDoubleElement(term1907, 1, 0.710793359488993);
        setField(term1866, term1866.getClass(), "work", term1907);
        setIntField(term1866, term1866.getClass(), "pingPong", -244121226);
        setDoubleField(term1866, term1866.getClass(), "qMax", 0.6920122631901948);
        setDoubleField(term1866, term1866.getClass(), "eMin", 0.8856493266514555);
        setIntField(term1866, term1866.getClass(), "tType", -203030934);
        setDoubleField(term1866, term1866.getClass(), "dMin", 0.35949348580116536);
        setDoubleField(term1866, term1866.getClass(), "dMin1", 0.9044080113158133);
        setDoubleField(term1866, term1866.getClass(), "dMin2", 0.7709248376486527);
        setDoubleField(term1866, term1866.getClass(), "dN", 0.24386896688203952);
        setDoubleField(term1866, term1866.getClass(), "dN1", 0.33650824379057453);
        setDoubleField(term1866, term1866.getClass(), "dN2", 0.5191680850819778);
        setDoubleField(term1866, term1866.getClass(), "g", 0.49591925980210916);
        setDoubleElement(term1921, 0, 0.7120592018058269);
        setDoubleElement(term1921, 1, 0.9306262668515027);
        setDoubleElement(term1921, 2, 0.3897971128913206);
        setDoubleElement(term1921, 3, 0.697625539365438);
        setDoubleElement(term1921, 4, 0.2170446731874749);
        setDoubleElement(term1921, 5, 0.7412534377270371);
        setDoubleElement(term1921, 6, 0.2610608910723019);
        setDoubleElement(term1921, 7, 0.46738526389049295);
        setField(term1866, term1866.getClass(), "realEigenvalues", term1921);
        setDoubleElement(term1930, 0, 0.2768470919610353);
        setField(term1866, term1866.getClass(), "imagEigenvalues", term1930);
        setField(term1933, term1933.getClass(), "data", term1934);
        setElement(term1932, 0, term1933);
        setField(term1935, term1935.getClass(), "data", term1936);
        setElement(term1932, 1, term1935);
        setField(term1937, term1937.getClass(), "data", term1938);
        setElement(term1932, 2, term1937);
        setField(term1939, term1939.getClass(), "data", term1940);
        setElement(term1932, 3, term1939);
        setField(term1941, term1941.getClass(), "data", term1942);
        setElement(term1932, 4, term1941);
        setField(term1943, term1943.getClass(), "data", term1944);
        setElement(term1932, 5, term1943);
        setField(term1945, term1945.getClass(), "data", term1946);
        setElement(term1932, 6, term1945);
        setField(term1947, term1947.getClass(), "data", term1948);
        setElement(term1932, 7, term1947);
        setField(term1949, term1949.getClass(), "data", term1950);
        setElement(term1932, 8, term1949);
        setField(term1866, term1866.getClass(), "eigenvectors", term1932);
        setField(term1866, term1866.getClass(), "cachedV", null);
        setField(term1866, term1866.getClass(), "cachedD", null);
        setField(term1866, term1866.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeGershgorinCircles", argTypes, term1866, args);
    }

};


