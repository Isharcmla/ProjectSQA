package org.apache.commons.math.optimization.direct;

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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BOBYQAOptimizer_bobyqa_154039991917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;
     Object term546;
     Object term552;

    public BOBYQAOptimizer_bobyqa_154039991917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29819 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term29818 = ((Class) term29819).getDeclaredField((String) "MAXIMIZE");
        ((Field) term29818).setAccessible(true);
        Object enum11 = ((Field) term29818).get((Object) null);
        term448 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        Object term453 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term454 = (double[]) newDoubleArray(0);
        double[] term455 = (double[]) newDoubleArray(3);
        Object term460 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term461 = (Object[]) newArray("[D", 1);
        double[] term462 = (double[]) newDoubleArray(0);
        Object term463 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term464 = (Object[]) newArray("[D", 2);
        double[] term465 = (double[]) newDoubleArray(8);
        double[] term474 = (double[]) newDoubleArray(6);
        Object term481 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term482 = (Object[]) newArray("[D", 2);
        double[] term483 = (double[]) newDoubleArray(1);
        double[] term485 = (double[]) newDoubleArray(9);
        Object term495 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term496 = (double[]) newDoubleArray(0);
        Object term497 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term498 = (double[]) newDoubleArray(0);
        Object term499 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term500 = (double[]) newDoubleArray(0);
        Object term501 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term502 = (double[]) newDoubleArray(0);
        Object term503 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term504 = (double[]) newDoubleArray(0);
        Object term505 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term506 = (double[]) newDoubleArray(0);
        Object term507 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term508 = (double[]) newDoubleArray(0);
        Object term509 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term510 = (double[]) newDoubleArray(0);
        Object term511 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term512 = (double[]) newDoubleArray(0);
        double[] term513 = (double[]) newDoubleArray(3);
        double[] term517 = (double[]) newDoubleArray(5);
        Object term523 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term526 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        double[] term539 = (double[]) newDoubleArray(6);
        setIntField(term448, term448.getClass(), "numberOfInterpolationPoints", -1955890973);
        setDoubleField(term448, term448.getClass(), "initialTrustRegionRadius", 0.5804948995371725);
        setDoubleField(term448, term448.getClass(), "stoppingTrustRegionRadius", 0.20737514139742264);
        setBooleanField(term448, term448.getClass(), "isMinimize", false);
        setField(term453, term453.getClass(), "data", term454);
        setField(term448, term448.getClass(), "currentBest", term453);
        setDoubleElement(term455, 0, 0.7919370314903882);
        setDoubleElement(term455, 1, 0.2109867221632754);
        setDoubleElement(term455, 2, 0.3227335400819148);
        setField(term448, term448.getClass(), "boundDifference", term455);
        setIntField(term448, term448.getClass(), "trustRegionCenterInterpolationPointIndex", -2038273078);
        setElement(term461, 0, term462);
        setField(term460, term460.getClass(), "data", term461);
        setField(term448, term448.getClass(), "bMatrix", term460);
        setDoubleElement(term465, 0, 0.43337207054070237);
        setDoubleElement(term465, 1, 0.13246999699526574);
        setDoubleElement(term465, 2, 0.9126850255993704);
        setDoubleElement(term465, 3, 0.11179067076100713);
        setDoubleElement(term465, 4, 0.5306473989087822);
        setDoubleElement(term465, 5, 0.022483645678509023);
        setDoubleElement(term465, 6, 0.025133051616627267);
        setDoubleElement(term465, 7, 0.016575281023182953);
        setElement(term464, 0, term465);
        setDoubleElement(term474, 0, 0.5308350402051779);
        setDoubleElement(term474, 1, 0.7154795600170818);
        setDoubleElement(term474, 2, 0.6355029654528058);
        setDoubleElement(term474, 3, 0.0022646783892913414);
        setDoubleElement(term474, 4, 0.36226058076369927);
        setDoubleElement(term474, 5, 0.03699061125289671);
        setElement(term464, 1, term474);
        setField(term463, term463.getClass(), "data", term464);
        setField(term448, term448.getClass(), "zMatrix", term463);
        setDoubleElement(term483, 0, 0.6047137830113202);
        setElement(term482, 0, term483);
        setDoubleElement(term485, 0, 0.6767213143579776);
        setDoubleElement(term485, 1, 0.48862955528902696);
        setDoubleElement(term485, 2, 0.426231085465289);
        setDoubleElement(term485, 3, 0.0027299293098262956);
        setDoubleElement(term485, 4, 0.29874017652881824);
        setDoubleElement(term485, 5, 0.32554480512985284);
        setDoubleElement(term485, 6, 0.8924855581421237);
        setDoubleElement(term485, 7, 0.32237559209193944);
        setDoubleElement(term485, 8, 0.53094494792755);
        setElement(term482, 1, term485);
        setField(term481, term481.getClass(), "data", term482);
        setField(term448, term448.getClass(), "interpolationPoints", term481);
        setField(term495, term495.getClass(), "data", term496);
        setField(term448, term448.getClass(), "originShift", term495);
        setField(term497, term497.getClass(), "data", term498);
        setField(term448, term448.getClass(), "fAtInterpolationPoints", term497);
        setField(term499, term499.getClass(), "data", term500);
        setField(term448, term448.getClass(), "trustRegionCenterOffset", term499);
        setField(term501, term501.getClass(), "data", term502);
        setField(term448, term448.getClass(), "gradientAtTrustRegionCenter", term501);
        setField(term503, term503.getClass(), "data", term504);
        setField(term448, term448.getClass(), "lowerDifference", term503);
        setField(term505, term505.getClass(), "data", term506);
        setField(term448, term448.getClass(), "upperDifference", term505);
        setField(term507, term507.getClass(), "data", term508);
        setField(term448, term448.getClass(), "modelSecondDerivativesParameters", term507);
        setField(term509, term509.getClass(), "data", term510);
        setField(term448, term448.getClass(), "newPoint", term509);
        setField(term511, term511.getClass(), "data", term512);
        setField(term448, term448.getClass(), "alternativeNewPoint", term511);
        setField(term448, term448.getClass(), "trialStepPoint", term507);
        setField(term448, term448.getClass(), "lagrangeValuesAtNewPoint", term509);
        setField(term448, term448.getClass(), "modelSecondDerivativesValues", term453);
        setDoubleElement(term513, 0, 0.146431486357265);
        setDoubleElement(term513, 1, 0.24259014218848696);
        setDoubleElement(term513, 2, 0.1544348383112728);
        setField(term448, term448.getClass(), "lowerBound", term513);
        setDoubleElement(term517, 0, 0.5187846213101265);
        setDoubleElement(term517, 1, 0.045893173090043815);
        setDoubleElement(term517, 2, 0.3626177854778667);
        setDoubleElement(term517, 3, 0.3163771663728089);
        setDoubleElement(term517, 4, 0.8819646072665548);
        setField(term448, term448.getClass(), "upperBound", term517);
        setIntField(term523, term523.getClass(), "maximalCount", 1227103734);
        setIntField(term523, term523.getClass(), "count", -1339778481);
        setField(term523, term523.getClass(), "maxCountCallback", term526);
        setField(term448, term448.getClass(), "evaluations", term523);
        setField(term448, term448.getClass(), "checker", null);
        setField(term448, term448.getClass(), "goal", enum11);
        setDoubleElement(term539, 0, 0.5412182593116958);
        setDoubleElement(term539, 1, 0.16988691727397487);
        setDoubleElement(term539, 2, 0.39286935532362843);
        setDoubleElement(term539, 3, 0.11577948268926874);
        setDoubleElement(term539, 4, 0.5617009352394552);
        setDoubleElement(term539, 5, 0.09067063848644474);
        setField(term448, term448.getClass(), "start", term539);
        setField(term448, term448.getClass(), "function", null);
        term546 = (double[]) newDoubleArray(5);
        setDoubleElement(term546, 0, 0.268304014379393);
        setDoubleElement(term546, 1, 0.7171972879282721);
        setDoubleElement(term546, 2, 0.9006361024877096);
        setDoubleElement(term546, 3, 0.5644914462415626);
        setDoubleElement(term546, 4, 0.509895859167191);
        term552 = (double[]) newDoubleArray(3);
        setDoubleElement(term552, 0, 0.07417792024383196);
        setDoubleElement(term552, 1, 0.686293604788188);
        setDoubleElement(term552, 2, 0.12764449157430724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term546;
        args[1] = term552;
        try {
            callMethod(klass, "bobyqa", argTypes, term448, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


