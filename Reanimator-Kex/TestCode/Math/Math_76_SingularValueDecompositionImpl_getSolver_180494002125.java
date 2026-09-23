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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getSolver_180494002125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1145;

    public SingularValueDecompositionImpl_getSolver_180494002125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1145 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term1148 = newInstance(Class.forName("org.apache.commons.math.linear.BiDiagonalTransformer"));
        Object[] term1149 = (Object[]) newArray("[D", 8);
        double[] term1150 = (double[]) newDoubleArray(5);
        double[] term1156 = (double[]) newDoubleArray(6);
        double[] term1163 = (double[]) newDoubleArray(3);
        double[] term1167 = (double[]) newDoubleArray(0);
        double[] term1168 = (double[]) newDoubleArray(5);
        double[] term1174 = (double[]) newDoubleArray(6);
        double[] term1181 = (double[]) newDoubleArray(0);
        double[] term1182 = (double[]) newDoubleArray(3);
        double[] term1186 = (double[]) newDoubleArray(1);
        double[] term1188 = (double[]) newDoubleArray(9);
        double[] term1198 = (double[]) newDoubleArray(2);
        double[] term1201 = (double[]) newDoubleArray(3);
        double[] term1205 = (double[]) newDoubleArray(2);
        double[] term1208 = (double[]) newDoubleArray(5);
        double[] term1214 = (double[]) newDoubleArray(1);
        setIntField(term1145, term1145.getClass(), "m", -6029667);
        setIntField(term1145, term1145.getClass(), "n", -2068769794);
        setDoubleElement(term1150, 0, 0.6609555690482892);
        setDoubleElement(term1150, 1, 0.20773286305836303);
        setDoubleElement(term1150, 2, 0.6902120717646517);
        setDoubleElement(term1150, 3, 0.483452767365532);
        setDoubleElement(term1150, 4, 0.33984612849066775);
        setElement(term1149, 0, term1150);
        setDoubleElement(term1156, 0, 0.992214897936456);
        setDoubleElement(term1156, 1, 0.10940058061451474);
        setDoubleElement(term1156, 2, 0.5280493395446559);
        setDoubleElement(term1156, 3, 0.5885698341309811);
        setDoubleElement(term1156, 4, 0.47963743635149814);
        setDoubleElement(term1156, 5, 0.07322031754051816);
        setElement(term1149, 1, term1156);
        setDoubleElement(term1163, 0, 0.7572808992551947);
        setDoubleElement(term1163, 1, 0.34277768712445844);
        setDoubleElement(term1163, 2, 0.9807605245238011);
        setElement(term1149, 2, term1163);
        setElement(term1149, 3, term1167);
        setDoubleElement(term1168, 0, 0.6765249801226639);
        setDoubleElement(term1168, 1, 0.08404543279803334);
        setDoubleElement(term1168, 2, 0.2456100607115369);
        setDoubleElement(term1168, 3, 0.40390514476233974);
        setDoubleElement(term1168, 4, 0.07467808093133665);
        setElement(term1149, 4, term1168);
        setDoubleElement(term1174, 0, 0.5375131002500685);
        setDoubleElement(term1174, 1, 0.8347207486220592);
        setDoubleElement(term1174, 2, 0.6121208871391735);
        setDoubleElement(term1174, 3, 0.7727907711525114);
        setDoubleElement(term1174, 4, 0.01895872020734357);
        setDoubleElement(term1174, 5, 0.2736100778332827);
        setElement(term1149, 5, term1174);
        setElement(term1149, 6, term1181);
        setDoubleElement(term1182, 0, 0.3629389093951403);
        setDoubleElement(term1182, 1, 0.5048764503874877);
        setDoubleElement(term1182, 2, 0.18688693015118896);
        setElement(term1149, 7, term1182);
        setField(term1148, term1148.getClass(), "householderVectors", term1149);
        setDoubleElement(term1186, 0, 0.6474385034713966);
        setField(term1148, term1148.getClass(), "main", term1186);
        setDoubleElement(term1188, 0, 0.589407706873697);
        setDoubleElement(term1188, 1, 0.6317865333680911);
        setDoubleElement(term1188, 2, 0.8927448424561988);
        setDoubleElement(term1188, 3, 0.5749385818274158);
        setDoubleElement(term1188, 4, 0.08286713692323);
        setDoubleElement(term1188, 5, 0.1713603524061028);
        setDoubleElement(term1188, 6, 0.46840044557462845);
        setDoubleElement(term1188, 7, 0.7757378334599976);
        setDoubleElement(term1188, 8, 0.3459237114146855);
        setField(term1148, term1148.getClass(), "secondary", term1188);
        setField(term1148, term1148.getClass(), "cachedU", null);
        setField(term1148, term1148.getClass(), "cachedB", null);
        setField(term1148, term1148.getClass(), "cachedV", null);
        setField(term1145, term1145.getClass(), "transformer", term1148);
        setDoubleElement(term1198, 0, 0.41504405374405495);
        setDoubleElement(term1198, 1, 0.9526973682054863);
        setField(term1145, term1145.getClass(), "mainBidiagonal", term1198);
        setDoubleElement(term1201, 0, 0.27635065300519635);
        setDoubleElement(term1201, 1, 0.49834805734323884);
        setDoubleElement(term1201, 2, 0.5823024616231472);
        setField(term1145, term1145.getClass(), "secondaryBidiagonal", term1201);
        setDoubleElement(term1205, 0, 0.036779689625219825);
        setDoubleElement(term1205, 1, 0.13829257568797448);
        setField(term1145, term1145.getClass(), "mainTridiagonal", term1205);
        setDoubleElement(term1208, 0, 0.63912351480947);
        setDoubleElement(term1208, 1, 0.11746904890800369);
        setDoubleElement(term1208, 2, 0.1065132285415139);
        setDoubleElement(term1208, 3, 0.9482156027893403);
        setDoubleElement(term1208, 4, 0.9946322297398043);
        setField(term1145, term1145.getClass(), "secondaryTridiagonal", term1208);
        setField(term1145, term1145.getClass(), "eigenDecomposition", null);
        setDoubleElement(term1214, 0, 0.04324873162392873);
        setField(term1145, term1145.getClass(), "singularValues", term1214);
        setField(term1145, term1145.getClass(), "cachedU", null);
        setField(term1145, term1145.getClass(), "cachedUt", null);
        setField(term1145, term1145.getClass(), "cachedS", null);
        setField(term1145, term1145.getClass(), "cachedV", null);
        setField(term1145, term1145.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolver", argTypes, term1145, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


