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

public class EigenDecompositionImpl_findEigenvalues_174011735552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1986;

    public EigenDecompositionImpl_findEigenvalues_174011735552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1986 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term1988 = (double[]) newDoubleArray(8);
        double[] term1997 = (double[]) newDoubleArray(9);
        double[] term2007 = (double[]) newDoubleArray(7);
        Object term2015 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term2016 = (Object[]) newArray("[D", 8);
        double[] term2017 = (double[]) newDoubleArray(9);
        double[] term2027 = (double[]) newDoubleArray(5);
        double[] term2033 = (double[]) newDoubleArray(9);
        double[] term2043 = (double[]) newDoubleArray(9);
        double[] term2053 = (double[]) newDoubleArray(6);
        double[] term2060 = (double[]) newDoubleArray(1);
        double[] term2062 = (double[]) newDoubleArray(5);
        double[] term2068 = (double[]) newDoubleArray(3);
        double[] term2072 = (double[]) newDoubleArray(9);
        double[] term2082 = (double[]) newDoubleArray(5);
        double[] term2094 = (double[]) newDoubleArray(5);
        double[] term2111 = (double[]) newDoubleArray(2);
        double[] term2114 = (double[]) newDoubleArray(9);
        Object[] term2124 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 8);
        Object term2125 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2126 = (double[]) newDoubleArray(0);
        Object term2127 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2128 = (double[]) newDoubleArray(0);
        Object term2129 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2130 = (double[]) newDoubleArray(0);
        Object term2131 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2132 = (double[]) newDoubleArray(0);
        Object term2133 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2134 = (double[]) newDoubleArray(0);
        Object term2135 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2136 = (double[]) newDoubleArray(0);
        Object term2137 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2138 = (double[]) newDoubleArray(0);
        Object term2139 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2140 = (double[]) newDoubleArray(0);
        setDoubleField(term1986, term1986.getClass(), "splitTolerance", 0.3748057502836176);
        setDoubleElement(term1988, 0, 0.5731930829917865);
        setDoubleElement(term1988, 1, 0.7539051746561026);
        setDoubleElement(term1988, 2, 0.02005712174177421);
        setDoubleElement(term1988, 3, 0.5083146266420581);
        setDoubleElement(term1988, 4, 0.9079395441784993);
        setDoubleElement(term1988, 5, 0.5089649018567155);
        setDoubleElement(term1988, 6, 0.43450494104339743);
        setDoubleElement(term1988, 7, 0.033779151946421004);
        setField(term1986, term1986.getClass(), "main", term1988);
        setDoubleElement(term1997, 0, 0.6244268006923053);
        setDoubleElement(term1997, 1, 0.7143627594521448);
        setDoubleElement(term1997, 2, 0.11515719123986734);
        setDoubleElement(term1997, 3, 0.6413275352493107);
        setDoubleElement(term1997, 4, 0.9220677404866297);
        setDoubleElement(term1997, 5, 0.4631036210522135);
        setDoubleElement(term1997, 6, 0.5673015329740946);
        setDoubleElement(term1997, 7, 0.24319604766284109);
        setDoubleElement(term1997, 8, 0.6819755234378504);
        setField(term1986, term1986.getClass(), "secondary", term1997);
        setDoubleElement(term2007, 0, 0.7649032655562676);
        setDoubleElement(term2007, 1, 0.8134618920903623);
        setDoubleElement(term2007, 2, 0.8407288422993372);
        setDoubleElement(term2007, 3, 0.9588643380074068);
        setDoubleElement(term2007, 4, 0.8994044184659324);
        setDoubleElement(term2007, 5, 0.6511212982355623);
        setDoubleElement(term2007, 6, 0.7930471696628196);
        setField(term1986, term1986.getClass(), "squaredSecondary", term2007);
        setDoubleElement(term2017, 0, 0.9221738550316857);
        setDoubleElement(term2017, 1, 0.9500688909740819);
        setDoubleElement(term2017, 2, 0.41321123504241286);
        setDoubleElement(term2017, 3, 0.958732192900248);
        setDoubleElement(term2017, 4, 0.3781613978725693);
        setDoubleElement(term2017, 5, 0.6175317872196219);
        setDoubleElement(term2017, 6, 0.49445972971731134);
        setDoubleElement(term2017, 7, 0.8508105832793618);
        setDoubleElement(term2017, 8, 0.7439643323924844);
        setElement(term2016, 0, term2017);
        setDoubleElement(term2027, 0, 0.5332733444461174);
        setDoubleElement(term2027, 1, 0.22407276183101443);
        setDoubleElement(term2027, 2, 0.7705274550148203);
        setDoubleElement(term2027, 3, 0.4901425510526187);
        setDoubleElement(term2027, 4, 0.07278410950877034);
        setElement(term2016, 1, term2027);
        setDoubleElement(term2033, 0, 0.8888570821168202);
        setDoubleElement(term2033, 1, 0.8668367864011388);
        setDoubleElement(term2033, 2, 0.6199687921970567);
        setDoubleElement(term2033, 3, 0.10197030017477404);
        setDoubleElement(term2033, 4, 0.8407744901070183);
        setDoubleElement(term2033, 5, 0.20623434725762346);
        setDoubleElement(term2033, 6, 0.7117427045638587);
        setDoubleElement(term2033, 7, 0.18136572835226095);
        setDoubleElement(term2033, 8, 0.6590510792221129);
        setElement(term2016, 2, term2033);
        setDoubleElement(term2043, 0, 0.23150372655746188);
        setDoubleElement(term2043, 1, 0.4146617418555236);
        setDoubleElement(term2043, 2, 0.4997869887510318);
        setDoubleElement(term2043, 3, 0.27934774389918404);
        setDoubleElement(term2043, 4, 0.43814162844573357);
        setDoubleElement(term2043, 5, 0.05929047738699278);
        setDoubleElement(term2043, 6, 0.2123900087449222);
        setDoubleElement(term2043, 7, 0.8511302064941156);
        setDoubleElement(term2043, 8, 0.7036730322599665);
        setElement(term2016, 3, term2043);
        setDoubleElement(term2053, 0, 0.2204271120026764);
        setDoubleElement(term2053, 1, 0.9176544304528376);
        setDoubleElement(term2053, 2, 0.8392612253715892);
        setDoubleElement(term2053, 3, 0.4677633411051154);
        setDoubleElement(term2053, 4, 0.6531744322192781);
        setDoubleElement(term2053, 5, 0.7236447174335996);
        setElement(term2016, 4, term2053);
        setDoubleElement(term2060, 0, 0.5469686485515324);
        setElement(term2016, 5, term2060);
        setDoubleElement(term2062, 0, 0.8799789079622452);
        setDoubleElement(term2062, 1, 0.012279473391326401);
        setDoubleElement(term2062, 2, 0.7259655674926332);
        setDoubleElement(term2062, 3, 0.8047272850336552);
        setDoubleElement(term2062, 4, 0.10724311312171908);
        setElement(term2016, 6, term2062);
        setDoubleElement(term2068, 0, 0.16031470934932757);
        setDoubleElement(term2068, 1, 0.7481505476231854);
        setDoubleElement(term2068, 2, 0.04322436701994625);
        setElement(term2016, 7, term2068);
        setField(term2015, term2015.getClass(), "householderVectors", term2016);
        setDoubleElement(term2072, 0, 0.22448074339260415);
        setDoubleElement(term2072, 1, 0.6720311177231261);
        setDoubleElement(term2072, 2, 0.8797924363074923);
        setDoubleElement(term2072, 3, 0.3484618877271397);
        setDoubleElement(term2072, 4, 0.4996378383760146);
        setDoubleElement(term2072, 5, 0.3502208680062405);
        setDoubleElement(term2072, 6, 0.6885447064290993);
        setDoubleElement(term2072, 7, 0.3831812963915012);
        setDoubleElement(term2072, 8, 0.4282106854555081);
        setField(term2015, term2015.getClass(), "main", term2072);
        setDoubleElement(term2082, 0, 0.1826861672590545);
        setDoubleElement(term2082, 1, 0.9791936141175877);
        setDoubleElement(term2082, 2, 0.25117946251535295);
        setDoubleElement(term2082, 3, 0.5726119417156881);
        setDoubleElement(term2082, 4, 0.190417489318088);
        setField(term2015, term2015.getClass(), "secondary", term2082);
        setField(term2015, term2015.getClass(), "cachedQ", null);
        setField(term2015, term2015.getClass(), "cachedQt", null);
        setField(term2015, term2015.getClass(), "cachedT", null);
        setField(term1986, term1986.getClass(), "transformer", term2015);
        setDoubleField(term1986, term1986.getClass(), "lowerSpectra", 0.6263202945251085);
        setDoubleField(term1986, term1986.getClass(), "upperSpectra", 0.47971707140048314);
        setDoubleField(term1986, term1986.getClass(), "minPivot", 0.11814755873301563);
        setDoubleField(term1986, term1986.getClass(), "sigma", 0.043843045689821336);
        setDoubleField(term1986, term1986.getClass(), "sigmaLow", 0.3166434459249081);
        setDoubleField(term1986, term1986.getClass(), "tau", 0.3001038134239822);
        setDoubleElement(term2094, 0, 0.07007378007322307);
        setDoubleElement(term2094, 1, 0.15701878581568673);
        setDoubleElement(term2094, 2, 0.002952762503631967);
        setDoubleElement(term2094, 3, 0.3176774647268311);
        setDoubleElement(term2094, 4, 0.18514821141841376);
        setField(term1986, term1986.getClass(), "work", term2094);
        setIntField(term1986, term1986.getClass(), "pingPong", -1179120542);
        setDoubleField(term1986, term1986.getClass(), "qMax", 0.20888628884386784);
        setDoubleField(term1986, term1986.getClass(), "eMin", 0.493613742285562);
        setIntField(term1986, term1986.getClass(), "tType", -73683645);
        setDoubleField(term1986, term1986.getClass(), "dMin", 0.4797764207198135);
        setDoubleField(term1986, term1986.getClass(), "dMin1", 0.056284870993027813);
        setDoubleField(term1986, term1986.getClass(), "dMin2", 0.6862332128231466);
        setDoubleField(term1986, term1986.getClass(), "dN", 0.8799451196211497);
        setDoubleField(term1986, term1986.getClass(), "dN1", 0.9739388367741902);
        setDoubleField(term1986, term1986.getClass(), "dN2", 0.2503677695709047);
        setDoubleField(term1986, term1986.getClass(), "g", 0.09474948219863522);
        setDoubleElement(term2111, 0, 0.4383399830188074);
        setDoubleElement(term2111, 1, 0.31844331712731666);
        setField(term1986, term1986.getClass(), "realEigenvalues", term2111);
        setDoubleElement(term2114, 0, 0.036973761145152384);
        setDoubleElement(term2114, 1, 0.9425796768484118);
        setDoubleElement(term2114, 2, 0.2348226206523183);
        setDoubleElement(term2114, 3, 0.443439873192083);
        setDoubleElement(term2114, 4, 0.03969974986368108);
        setDoubleElement(term2114, 5, 0.46503001320013615);
        setDoubleElement(term2114, 6, 0.9068025458227947);
        setDoubleElement(term2114, 7, 0.0033019506257661035);
        setDoubleElement(term2114, 8, 0.09198544215709614);
        setField(term1986, term1986.getClass(), "imagEigenvalues", term2114);
        setField(term2125, term2125.getClass(), "data", term2126);
        setElement(term2124, 0, term2125);
        setField(term2127, term2127.getClass(), "data", term2128);
        setElement(term2124, 1, term2127);
        setField(term2129, term2129.getClass(), "data", term2130);
        setElement(term2124, 2, term2129);
        setField(term2131, term2131.getClass(), "data", term2132);
        setElement(term2124, 3, term2131);
        setField(term2133, term2133.getClass(), "data", term2134);
        setElement(term2124, 4, term2133);
        setField(term2135, term2135.getClass(), "data", term2136);
        setElement(term2124, 5, term2135);
        setField(term2137, term2137.getClass(), "data", term2138);
        setElement(term2124, 6, term2137);
        setField(term2139, term2139.getClass(), "data", term2140);
        setElement(term2124, 7, term2139);
        setField(term1986, term1986.getClass(), "eigenvectors", term2124);
        setField(term1986, term1986.getClass(), "cachedV", null);
        setField(term1986, term1986.getClass(), "cachedD", null);
        setField(term1986, term1986.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenvalues", argTypes, term1986, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


