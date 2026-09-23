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
import java.lang.Double;

public class EigenDecompositionImpl_stationaryQuotientDifferenceWithShift_50998924170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5206;
     Object term5321;
     Object term5322;
     Object term5326;

    public EigenDecompositionImpl_stationaryQuotientDifferenceWithShift_50998924170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5206 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term5208 = (double[]) newDoubleArray(8);
        double[] term5217 = (double[]) newDoubleArray(5);
        double[] term5223 = (double[]) newDoubleArray(6);
        Object term5230 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term5231 = (Object[]) newArray("[D", 6);
        double[] term5232 = (double[]) newDoubleArray(3);
        double[] term5236 = (double[]) newDoubleArray(9);
        double[] term5246 = (double[]) newDoubleArray(3);
        double[] term5250 = (double[]) newDoubleArray(7);
        double[] term5258 = (double[]) newDoubleArray(7);
        double[] term5266 = (double[]) newDoubleArray(2);
        double[] term5269 = (double[]) newDoubleArray(6);
        double[] term5276 = (double[]) newDoubleArray(3);
        double[] term5286 = (double[]) newDoubleArray(1);
        double[] term5299 = (double[]) newDoubleArray(6);
        double[] term5306 = (double[]) newDoubleArray(3);
        Object[] term5310 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 5);
        Object term5311 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5312 = (double[]) newDoubleArray(0);
        Object term5313 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5314 = (double[]) newDoubleArray(0);
        Object term5315 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5316 = (double[]) newDoubleArray(0);
        Object term5317 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5318 = (double[]) newDoubleArray(0);
        Object term5319 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5320 = (double[]) newDoubleArray(0);
        setDoubleField(term5206, term5206.getClass(), "splitTolerance", 0.390237134332043);
        setDoubleElement(term5208, 0, 0.2757573728599094);
        setDoubleElement(term5208, 1, 0.7438091389964213);
        setDoubleElement(term5208, 2, 0.008921788103920192);
        setDoubleElement(term5208, 3, 0.8805048253069812);
        setDoubleElement(term5208, 4, 0.7448733035412175);
        setDoubleElement(term5208, 5, 0.3845482252445903);
        setDoubleElement(term5208, 6, 0.876454613416512);
        setDoubleElement(term5208, 7, 0.38178935567583794);
        setField(term5206, term5206.getClass(), "main", term5208);
        setDoubleElement(term5217, 0, 0.9687992355203028);
        setDoubleElement(term5217, 1, 0.9499160662233723);
        setDoubleElement(term5217, 2, 0.5814353266206046);
        setDoubleElement(term5217, 3, 0.8043066395150607);
        setDoubleElement(term5217, 4, 0.891555325478132);
        setField(term5206, term5206.getClass(), "secondary", term5217);
        setDoubleElement(term5223, 0, 0.059738907809076536);
        setDoubleElement(term5223, 1, 0.19398368109610542);
        setDoubleElement(term5223, 2, 0.8612637768294583);
        setDoubleElement(term5223, 3, 0.9424442994432171);
        setDoubleElement(term5223, 4, 0.5474118497321805);
        setDoubleElement(term5223, 5, 0.17790062681320606);
        setField(term5206, term5206.getClass(), "squaredSecondary", term5223);
        setDoubleElement(term5232, 0, 0.8307296245630915);
        setDoubleElement(term5232, 1, 0.35852249755699717);
        setDoubleElement(term5232, 2, 0.28275365956572185);
        setElement(term5231, 0, term5232);
        setDoubleElement(term5236, 0, 0.23585834406127726);
        setDoubleElement(term5236, 1, 0.424375033688698);
        setDoubleElement(term5236, 2, 0.31481492658104016);
        setDoubleElement(term5236, 3, 0.6326911540704958);
        setDoubleElement(term5236, 4, 0.9709554643348661);
        setDoubleElement(term5236, 5, 0.2695830254677728);
        setDoubleElement(term5236, 6, 0.6854250716294141);
        setDoubleElement(term5236, 7, 0.25621511712059697);
        setDoubleElement(term5236, 8, 0.3816357800048622);
        setElement(term5231, 1, term5236);
        setDoubleElement(term5246, 0, 0.30537444836656047);
        setDoubleElement(term5246, 1, 0.12294763927016261);
        setDoubleElement(term5246, 2, 0.1771195655130856);
        setElement(term5231, 2, term5246);
        setDoubleElement(term5250, 0, 0.649351552726493);
        setDoubleElement(term5250, 1, 0.34279000047783226);
        setDoubleElement(term5250, 2, 0.41410088697379166);
        setDoubleElement(term5250, 3, 0.9813566349096453);
        setDoubleElement(term5250, 4, 0.026985574018368097);
        setDoubleElement(term5250, 5, 0.14681486102975605);
        setDoubleElement(term5250, 6, 0.7462521758943206);
        setElement(term5231, 3, term5250);
        setDoubleElement(term5258, 0, 0.5454098568207479);
        setDoubleElement(term5258, 1, 0.8909282328965482);
        setDoubleElement(term5258, 2, 0.6596272655393589);
        setDoubleElement(term5258, 3, 0.602519009294781);
        setDoubleElement(term5258, 4, 0.9179084782729681);
        setDoubleElement(term5258, 5, 0.1808395976666537);
        setDoubleElement(term5258, 6, 0.40389806155755015);
        setElement(term5231, 4, term5258);
        setDoubleElement(term5266, 0, 0.49238504773717184);
        setDoubleElement(term5266, 1, 0.8487762138126403);
        setElement(term5231, 5, term5266);
        setField(term5230, term5230.getClass(), "householderVectors", term5231);
        setDoubleElement(term5269, 0, 0.518508613907528);
        setDoubleElement(term5269, 1, 0.6800630907381233);
        setDoubleElement(term5269, 2, 0.6202785851151852);
        setDoubleElement(term5269, 3, 0.9885278352709502);
        setDoubleElement(term5269, 4, 0.2708547150367854);
        setDoubleElement(term5269, 5, 0.9029360654932364);
        setField(term5230, term5230.getClass(), "main", term5269);
        setDoubleElement(term5276, 0, 0.8963190263619079);
        setDoubleElement(term5276, 1, 0.9648975201420071);
        setDoubleElement(term5276, 2, 0.7019995580853622);
        setField(term5230, term5230.getClass(), "secondary", term5276);
        setField(term5230, term5230.getClass(), "cachedQ", null);
        setField(term5230, term5230.getClass(), "cachedQt", null);
        setField(term5230, term5230.getClass(), "cachedT", null);
        setField(term5206, term5206.getClass(), "transformer", term5230);
        setDoubleField(term5206, term5206.getClass(), "lowerSpectra", 0.3107245374239328);
        setDoubleField(term5206, term5206.getClass(), "upperSpectra", 0.40144414904569325);
        setDoubleField(term5206, term5206.getClass(), "minPivot", 0.38480314944840743);
        setDoubleField(term5206, term5206.getClass(), "sigma", 0.1454700533666492);
        setDoubleField(term5206, term5206.getClass(), "sigmaLow", 0.323457154658249);
        setDoubleField(term5206, term5206.getClass(), "tau", 0.5333895326449968);
        setDoubleElement(term5286, 0, 0.3067208748963842);
        setField(term5206, term5206.getClass(), "work", term5286);
        setIntField(term5206, term5206.getClass(), "pingPong", -556405712);
        setDoubleField(term5206, term5206.getClass(), "qMax", 0.8199761472340232);
        setDoubleField(term5206, term5206.getClass(), "eMin", 0.02802539469148746);
        setIntField(term5206, term5206.getClass(), "tType", -1772434990);
        setDoubleField(term5206, term5206.getClass(), "dMin", 0.5804984910326321);
        setDoubleField(term5206, term5206.getClass(), "dMin1", 0.8818647695943428);
        setDoubleField(term5206, term5206.getClass(), "dMin2", 0.5108394470959321);
        setDoubleField(term5206, term5206.getClass(), "dN", 0.6234885601985392);
        setDoubleField(term5206, term5206.getClass(), "dN1", 0.397099408955928);
        setDoubleField(term5206, term5206.getClass(), "dN2", 0.6721368342930351);
        setDoubleField(term5206, term5206.getClass(), "g", 0.8440325966662732);
        setDoubleElement(term5299, 0, 0.17298605410007284);
        setDoubleElement(term5299, 1, 0.18719462654289487);
        setDoubleElement(term5299, 2, 0.6186324708575596);
        setDoubleElement(term5299, 3, 0.29092071098866223);
        setDoubleElement(term5299, 4, 0.6775462539478143);
        setDoubleElement(term5299, 5, 0.14246324677572686);
        setField(term5206, term5206.getClass(), "realEigenvalues", term5299);
        setDoubleElement(term5306, 0, 0.7565573956285062);
        setDoubleElement(term5306, 1, 0.3591803059869073);
        setDoubleElement(term5306, 2, 0.3122764460304267);
        setField(term5206, term5206.getClass(), "imagEigenvalues", term5306);
        setField(term5311, term5311.getClass(), "data", term5312);
        setElement(term5310, 0, term5311);
        setField(term5313, term5313.getClass(), "data", term5314);
        setElement(term5310, 1, term5313);
        setField(term5315, term5315.getClass(), "data", term5316);
        setElement(term5310, 2, term5315);
        setField(term5317, term5317.getClass(), "data", term5318);
        setElement(term5310, 3, term5317);
        setField(term5319, term5319.getClass(), "data", term5320);
        setElement(term5310, 4, term5319);
        setField(term5206, term5206.getClass(), "eigenvectors", term5310);
        setField(term5206, term5206.getClass(), "cachedV", null);
        setField(term5206, term5206.getClass(), "cachedD", null);
        setField(term5206, term5206.getClass(), "cachedVt", null);
        term5321 = (double[]) newDoubleArray(0);
        term5322 = (double[]) newDoubleArray(3);
        setDoubleElement(term5322, 0, 0.8260877756205602);
        setDoubleElement(term5322, 1, 0.5507317613093311);
        setDoubleElement(term5322, 2, 0.6490029993704342);
        term5326 = new Double(0.6468638972406162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term5321;
        args[1] = term5322;
        args[2] = term5326;
        try {
            callMethod(klass, "stationaryQuotientDifferenceWithShift", argTypes, term5206, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


