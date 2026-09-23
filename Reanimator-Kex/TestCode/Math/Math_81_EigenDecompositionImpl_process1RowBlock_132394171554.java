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

public class EigenDecompositionImpl_process1RowBlock_132394171554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2389;
     Object term2503;

    public EigenDecompositionImpl_process1RowBlock_132394171554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2389 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term2391 = (double[]) newDoubleArray(7);
        double[] term2399 = (double[]) newDoubleArray(3);
        double[] term2403 = (double[]) newDoubleArray(6);
        Object term2410 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term2411 = (Object[]) newArray("[D", 6);
        double[] term2412 = (double[]) newDoubleArray(2);
        double[] term2415 = (double[]) newDoubleArray(8);
        double[] term2424 = (double[]) newDoubleArray(8);
        double[] term2433 = (double[]) newDoubleArray(5);
        double[] term2439 = (double[]) newDoubleArray(8);
        double[] term2448 = (double[]) newDoubleArray(9);
        double[] term2458 = (double[]) newDoubleArray(7);
        double[] term2466 = (double[]) newDoubleArray(6);
        double[] term2479 = (double[]) newDoubleArray(5);
        double[] term2496 = (double[]) newDoubleArray(2);
        double[] term2499 = (double[]) newDoubleArray(2);
        Object[] term2502 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        setDoubleField(term2389, term2389.getClass(), "splitTolerance", 0.9636047288221744);
        setDoubleElement(term2391, 0, 0.9812989520568652);
        setDoubleElement(term2391, 1, 0.5260401729085636);
        setDoubleElement(term2391, 2, 0.1966416537238288);
        setDoubleElement(term2391, 3, 0.5507226770539227);
        setDoubleElement(term2391, 4, 0.22718531728979197);
        setDoubleElement(term2391, 5, 0.945082869732553);
        setDoubleElement(term2391, 6, 0.03123965072102497);
        setField(term2389, term2389.getClass(), "main", term2391);
        setDoubleElement(term2399, 0, 0.026533684659376444);
        setDoubleElement(term2399, 1, 0.11613622644165744);
        setDoubleElement(term2399, 2, 0.7906598722688312);
        setField(term2389, term2389.getClass(), "secondary", term2399);
        setDoubleElement(term2403, 0, 0.18313324415093823);
        setDoubleElement(term2403, 1, 0.1744575635121215);
        setDoubleElement(term2403, 2, 0.7997126520436173);
        setDoubleElement(term2403, 3, 0.2885995559163721);
        setDoubleElement(term2403, 4, 0.24376380251538943);
        setDoubleElement(term2403, 5, 0.1960225801238138);
        setField(term2389, term2389.getClass(), "squaredSecondary", term2403);
        setDoubleElement(term2412, 0, 0.5148137742678777);
        setDoubleElement(term2412, 1, 0.8391459612166138);
        setElement(term2411, 0, term2412);
        setDoubleElement(term2415, 0, 0.16703018107140954);
        setDoubleElement(term2415, 1, 0.4586817610515208);
        setDoubleElement(term2415, 2, 0.4514428416311852);
        setDoubleElement(term2415, 3, 0.05035312439979578);
        setDoubleElement(term2415, 4, 0.2030931676384783);
        setDoubleElement(term2415, 5, 0.5220991694127869);
        setDoubleElement(term2415, 6, 0.7431278279525401);
        setDoubleElement(term2415, 7, 0.6468277621896449);
        setElement(term2411, 1, term2415);
        setDoubleElement(term2424, 0, 0.6348426143487798);
        setDoubleElement(term2424, 1, 0.2609298549951239);
        setDoubleElement(term2424, 2, 0.6131087144069463);
        setDoubleElement(term2424, 3, 0.4961600023778727);
        setDoubleElement(term2424, 4, 0.15336192373549007);
        setDoubleElement(term2424, 5, 0.9148125806219113);
        setDoubleElement(term2424, 6, 0.5424105805193429);
        setDoubleElement(term2424, 7, 0.961202697260254);
        setElement(term2411, 2, term2424);
        setDoubleElement(term2433, 0, 0.6198565030073423);
        setDoubleElement(term2433, 1, 0.06523961946138956);
        setDoubleElement(term2433, 2, 0.5651796580837669);
        setDoubleElement(term2433, 3, 0.4084300846738409);
        setDoubleElement(term2433, 4, 0.7788960836558265);
        setElement(term2411, 3, term2433);
        setDoubleElement(term2439, 0, 0.8641629614441709);
        setDoubleElement(term2439, 1, 0.44216771474321837);
        setDoubleElement(term2439, 2, 0.9809266777296007);
        setDoubleElement(term2439, 3, 0.21145399417290445);
        setDoubleElement(term2439, 4, 0.3206424582885071);
        setDoubleElement(term2439, 5, 0.515007129011865);
        setDoubleElement(term2439, 6, 0.6791279697510296);
        setDoubleElement(term2439, 7, 0.44610818581404355);
        setElement(term2411, 4, term2439);
        setDoubleElement(term2448, 0, 0.08953548266482225);
        setDoubleElement(term2448, 1, 0.5019274780721351);
        setDoubleElement(term2448, 2, 0.38325419627935253);
        setDoubleElement(term2448, 3, 0.6829029193256314);
        setDoubleElement(term2448, 4, 1.7403320892983576E-4);
        setDoubleElement(term2448, 5, 0.359822327374657);
        setDoubleElement(term2448, 6, 0.6984496238941496);
        setDoubleElement(term2448, 7, 0.026751890106275433);
        setDoubleElement(term2448, 8, 0.5131701879289331);
        setElement(term2411, 5, term2448);
        setField(term2410, term2410.getClass(), "householderVectors", term2411);
        setDoubleElement(term2458, 0, 0.6080820676996378);
        setDoubleElement(term2458, 1, 0.40695922365872805);
        setDoubleElement(term2458, 2, 0.475896687259849);
        setDoubleElement(term2458, 3, 0.3999358841601842);
        setDoubleElement(term2458, 4, 0.18636713236319624);
        setDoubleElement(term2458, 5, 0.8712455774005332);
        setDoubleElement(term2458, 6, 0.16581764143035682);
        setField(term2410, term2410.getClass(), "main", term2458);
        setDoubleElement(term2466, 0, 0.20219858593718787);
        setDoubleElement(term2466, 1, 0.0015033902879237893);
        setDoubleElement(term2466, 2, 0.9477686563600426);
        setDoubleElement(term2466, 3, 0.530126080388379);
        setDoubleElement(term2466, 4, 0.44773981891873893);
        setDoubleElement(term2466, 5, 0.8079395143254551);
        setField(term2410, term2410.getClass(), "secondary", term2466);
        setField(term2410, term2410.getClass(), "cachedQ", null);
        setField(term2410, term2410.getClass(), "cachedQt", null);
        setField(term2410, term2410.getClass(), "cachedT", null);
        setField(term2389, term2389.getClass(), "transformer", term2410);
        setDoubleField(term2389, term2389.getClass(), "lowerSpectra", 0.8432220434692428);
        setDoubleField(term2389, term2389.getClass(), "upperSpectra", 0.10735086460638021);
        setDoubleField(term2389, term2389.getClass(), "minPivot", 0.17377837668919804);
        setDoubleField(term2389, term2389.getClass(), "sigma", 0.9617136552411361);
        setDoubleField(term2389, term2389.getClass(), "sigmaLow", 0.8733388286648099);
        setDoubleField(term2389, term2389.getClass(), "tau", 0.6961639879171184);
        setDoubleElement(term2479, 0, 0.04086594399817722);
        setDoubleElement(term2479, 1, 0.8896348979317397);
        setDoubleElement(term2479, 2, 0.26895104127686764);
        setDoubleElement(term2479, 3, 0.44147348766746497);
        setDoubleElement(term2479, 4, 0.20785767731652216);
        setField(term2389, term2389.getClass(), "work", term2479);
        setIntField(term2389, term2389.getClass(), "pingPong", -1087774327);
        setDoubleField(term2389, term2389.getClass(), "qMax", 0.8233926052583531);
        setDoubleField(term2389, term2389.getClass(), "eMin", 0.01480700687689196);
        setIntField(term2389, term2389.getClass(), "tType", -1530420153);
        setDoubleField(term2389, term2389.getClass(), "dMin", 0.2199442770536334);
        setDoubleField(term2389, term2389.getClass(), "dMin1", 0.18246579362349058);
        setDoubleField(term2389, term2389.getClass(), "dMin2", 0.4625644623844958);
        setDoubleField(term2389, term2389.getClass(), "dN", 0.20372080216921717);
        setDoubleField(term2389, term2389.getClass(), "dN1", 0.3858905478901201);
        setDoubleField(term2389, term2389.getClass(), "dN2", 0.06209980384851188);
        setDoubleField(term2389, term2389.getClass(), "g", 0.7510022677490469);
        setDoubleElement(term2496, 0, 0.5419487144008749);
        setDoubleElement(term2496, 1, 0.5371162753597336);
        setField(term2389, term2389.getClass(), "realEigenvalues", term2496);
        setDoubleElement(term2499, 0, 0.9361416298884132);
        setDoubleElement(term2499, 1, 0.8778317260539199);
        setField(term2389, term2389.getClass(), "imagEigenvalues", term2499);
        setField(term2389, term2389.getClass(), "eigenvectors", term2502);
        setField(term2389, term2389.getClass(), "cachedV", null);
        setField(term2389, term2389.getClass(), "cachedD", null);
        setField(term2389, term2389.getClass(), "cachedVt", null);
        term2503 = new Integer(-469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2503;
        try {
            callMethod(klass, "process1RowBlock", argTypes, term2389, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


