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

public class EigenDecompositionImpl_getImagEigenvalue_37183999446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1209;
     Object term1291;

    public EigenDecompositionImpl_getImagEigenvalue_37183999446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1209 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term1211 = (double[]) newDoubleArray(0);
        double[] term1212 = (double[]) newDoubleArray(5);
        double[] term1218 = (double[]) newDoubleArray(4);
        Object term1223 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term1224 = (Object[]) newArray("[D", 1);
        double[] term1225 = (double[]) newDoubleArray(0);
        double[] term1226 = (double[]) newDoubleArray(6);
        double[] term1233 = (double[]) newDoubleArray(3);
        double[] term1243 = (double[]) newDoubleArray(4);
        double[] term1259 = (double[]) newDoubleArray(5);
        double[] term1265 = (double[]) newDoubleArray(8);
        Object[] term1274 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 8);
        Object term1275 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1276 = (double[]) newDoubleArray(0);
        Object term1277 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1278 = (double[]) newDoubleArray(0);
        Object term1279 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1280 = (double[]) newDoubleArray(0);
        Object term1281 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1282 = (double[]) newDoubleArray(0);
        Object term1283 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1284 = (double[]) newDoubleArray(0);
        Object term1285 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1286 = (double[]) newDoubleArray(0);
        Object term1287 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1288 = (double[]) newDoubleArray(0);
        Object term1289 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1290 = (double[]) newDoubleArray(0);
        setDoubleField(term1209, term1209.getClass(), "splitTolerance", 0.7090123011614375);
        setField(term1209, term1209.getClass(), "main", term1211);
        setDoubleElement(term1212, 0, 0.5754903433429454);
        setDoubleElement(term1212, 1, 0.5128908508266724);
        setDoubleElement(term1212, 2, 0.3548098444455199);
        setDoubleElement(term1212, 3, 0.21420289639728962);
        setDoubleElement(term1212, 4, 0.7730078762317051);
        setField(term1209, term1209.getClass(), "secondary", term1212);
        setDoubleElement(term1218, 0, 0.5645277595401526);
        setDoubleElement(term1218, 1, 0.25081064664364316);
        setDoubleElement(term1218, 2, 0.6171429441798344);
        setDoubleElement(term1218, 3, 0.7042450068993633);
        setField(term1209, term1209.getClass(), "squaredSecondary", term1218);
        setElement(term1224, 0, term1225);
        setField(term1223, term1223.getClass(), "householderVectors", term1224);
        setDoubleElement(term1226, 0, 0.8975545796030406);
        setDoubleElement(term1226, 1, 0.3031712642083415);
        setDoubleElement(term1226, 2, 0.8602777539261507);
        setDoubleElement(term1226, 3, 0.3043665728161581);
        setDoubleElement(term1226, 4, 0.9913552224565947);
        setDoubleElement(term1226, 5, 0.4966124252410027);
        setField(term1223, term1223.getClass(), "main", term1226);
        setDoubleElement(term1233, 0, 0.37123128056890065);
        setDoubleElement(term1233, 1, 0.7106040066640994);
        setDoubleElement(term1233, 2, 0.9558229513823179);
        setField(term1223, term1223.getClass(), "secondary", term1233);
        setField(term1223, term1223.getClass(), "cachedQ", null);
        setField(term1223, term1223.getClass(), "cachedQt", null);
        setField(term1223, term1223.getClass(), "cachedT", null);
        setField(term1209, term1209.getClass(), "transformer", term1223);
        setDoubleField(term1209, term1209.getClass(), "lowerSpectra", 0.04341654576535725);
        setDoubleField(term1209, term1209.getClass(), "upperSpectra", 0.6213999222429707);
        setDoubleField(term1209, term1209.getClass(), "minPivot", 0.8524962128719791);
        setDoubleField(term1209, term1209.getClass(), "sigma", 0.9607682688593241);
        setDoubleField(term1209, term1209.getClass(), "sigmaLow", 0.6925697954611718);
        setDoubleField(term1209, term1209.getClass(), "tau", 0.4269446855123301);
        setDoubleElement(term1243, 0, 0.5334986794148128);
        setDoubleElement(term1243, 1, 0.16182948586501322);
        setDoubleElement(term1243, 2, 0.2190694321818214);
        setDoubleElement(term1243, 3, 0.39028347452315004);
        setField(term1209, term1209.getClass(), "work", term1243);
        setIntField(term1209, term1209.getClass(), "pingPong", -1456670397);
        setDoubleField(term1209, term1209.getClass(), "qMax", 0.9452756892252447);
        setDoubleField(term1209, term1209.getClass(), "eMin", 0.7265543616081012);
        setIntField(term1209, term1209.getClass(), "tType", 1622346318);
        setDoubleField(term1209, term1209.getClass(), "dMin", 0.8691836681752382);
        setDoubleField(term1209, term1209.getClass(), "dMin1", 0.9553804492342851);
        setDoubleField(term1209, term1209.getClass(), "dMin2", 0.951497914828045);
        setDoubleField(term1209, term1209.getClass(), "dN", 0.5926415532310654);
        setDoubleField(term1209, term1209.getClass(), "dN1", 0.011084532735115116);
        setDoubleField(term1209, term1209.getClass(), "dN2", 0.7815751235487547);
        setDoubleField(term1209, term1209.getClass(), "g", 0.27972598243188085);
        setDoubleElement(term1259, 0, 0.2749003034310852);
        setDoubleElement(term1259, 1, 0.6201564110803683);
        setDoubleElement(term1259, 2, 0.5283886615348917);
        setDoubleElement(term1259, 3, 0.9679677362359832);
        setDoubleElement(term1259, 4, 0.37830789098595463);
        setField(term1209, term1209.getClass(), "realEigenvalues", term1259);
        setDoubleElement(term1265, 0, 0.5144161196478283);
        setDoubleElement(term1265, 1, 0.687690824750583);
        setDoubleElement(term1265, 2, 0.026755796057250425);
        setDoubleElement(term1265, 3, 0.47161396910781994);
        setDoubleElement(term1265, 4, 0.4478633017907302);
        setDoubleElement(term1265, 5, 0.7998055139571558);
        setDoubleElement(term1265, 6, 0.2980983794282903);
        setDoubleElement(term1265, 7, 0.6292619847139933);
        setField(term1209, term1209.getClass(), "imagEigenvalues", term1265);
        setField(term1275, term1275.getClass(), "data", term1276);
        setElement(term1274, 0, term1275);
        setField(term1277, term1277.getClass(), "data", term1278);
        setElement(term1274, 1, term1277);
        setField(term1279, term1279.getClass(), "data", term1280);
        setElement(term1274, 2, term1279);
        setField(term1281, term1281.getClass(), "data", term1282);
        setElement(term1274, 3, term1281);
        setField(term1283, term1283.getClass(), "data", term1284);
        setElement(term1274, 4, term1283);
        setField(term1285, term1285.getClass(), "data", term1286);
        setElement(term1274, 5, term1285);
        setField(term1287, term1287.getClass(), "data", term1288);
        setElement(term1274, 6, term1287);
        setField(term1289, term1289.getClass(), "data", term1290);
        setElement(term1274, 7, term1289);
        setField(term1209, term1209.getClass(), "eigenvectors", term1274);
        setField(term1209, term1209.getClass(), "cachedV", null);
        setField(term1209, term1209.getClass(), "cachedD", null);
        setField(term1209, term1209.getClass(), "cachedVt", null);
        term1291 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1291;
        try {
            callMethod(klass, "getImagEigenvalue", argTypes, term1209, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


