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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RealMatrixImpl_multiply_121069545060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1022;
     Object term1086;

    public RealMatrixImpl_multiply_121069545060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1022 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term1023 = (Object[]) newArray("[D", 8);
        double[] term1024 = (double[]) newDoubleArray(8);
        double[] term1033 = (double[]) newDoubleArray(5);
        double[] term1039 = (double[]) newDoubleArray(6);
        double[] term1046 = (double[]) newDoubleArray(3);
        double[] term1050 = (double[]) newDoubleArray(0);
        double[] term1051 = (double[]) newDoubleArray(5);
        double[] term1057 = (double[]) newDoubleArray(6);
        double[] term1064 = (double[]) newDoubleArray(0);
        Object[] term1065 = (Object[]) newArray("[D", 3);
        double[] term1066 = (double[]) newDoubleArray(1);
        double[] term1068 = (double[]) newDoubleArray(9);
        double[] term1078 = (double[]) newDoubleArray(2);
        int[] term1081 = (int[]) newIntArray(3);
        setDoubleElement(term1024, 0, 0.3443365004594303);
        setDoubleElement(term1024, 1, 0.3400963645349382);
        setDoubleElement(term1024, 2, 0.7410646003910566);
        setDoubleElement(term1024, 3, 0.6056930022403243);
        setDoubleElement(term1024, 4, 0.977168525811686);
        setDoubleElement(term1024, 5, 0.2608334566667111);
        setDoubleElement(term1024, 6, 0.4973631574706634);
        setDoubleElement(term1024, 7, 0.4350078021366608);
        setElement(term1023, 0, term1024);
        setDoubleElement(term1033, 0, 0.3798178439996389);
        setDoubleElement(term1033, 1, 0.7829673903208142);
        setDoubleElement(term1033, 2, 0.9582677413519696);
        setDoubleElement(term1033, 3, 0.8466752101793942);
        setDoubleElement(term1033, 4, 0.1523167696274942);
        setElement(term1023, 1, term1033);
        setDoubleElement(term1039, 0, 0.21754273979933092);
        setDoubleElement(term1039, 1, 0.7799781775636547);
        setDoubleElement(term1039, 2, 0.3294886032690195);
        setDoubleElement(term1039, 3, 0.7286890609225415);
        setDoubleElement(term1039, 4, 0.5548341997020813);
        setDoubleElement(term1039, 5, 0.4059165385720548);
        setElement(term1023, 2, term1039);
        setDoubleElement(term1046, 0, 0.3800208987762318);
        setDoubleElement(term1046, 1, 0.6329228631168875);
        setDoubleElement(term1046, 2, 0.06928634128023836);
        setElement(term1023, 3, term1046);
        setElement(term1023, 4, term1050);
        setDoubleElement(term1051, 0, 0.16828712051665362);
        setDoubleElement(term1051, 1, 0.5975949169840026);
        setDoubleElement(term1051, 2, 0.5125207579363754);
        setDoubleElement(term1051, 3, 0.1682247220070444);
        setDoubleElement(term1051, 4, 0.040825355718595024);
        setElement(term1023, 5, term1051);
        setDoubleElement(term1057, 0, 0.19754021671358302);
        setDoubleElement(term1057, 1, 0.905102212387978);
        setDoubleElement(term1057, 2, 0.8248232334502307);
        setDoubleElement(term1057, 3, 0.4342455781017177);
        setDoubleElement(term1057, 4, 0.3169119418035211);
        setDoubleElement(term1057, 5, 0.9171660240493722);
        setElement(term1023, 6, term1057);
        setElement(term1023, 7, term1064);
        setField(term1022, term1022.getClass(), "data", term1023);
        setDoubleElement(term1066, 0, 0.9172575643210912);
        setElement(term1065, 0, term1066);
        setDoubleElement(term1068, 0, 0.9776553509238997);
        setDoubleElement(term1068, 1, 0.9214187038380094);
        setDoubleElement(term1068, 2, 0.1240028694334625);
        setDoubleElement(term1068, 3, 0.9336699309532178);
        setDoubleElement(term1068, 4, 0.18721227989825073);
        setDoubleElement(term1068, 5, 0.2131256081762306);
        setDoubleElement(term1068, 6, 0.03588195391803095);
        setDoubleElement(term1068, 7, 0.7965158013308613);
        setDoubleElement(term1068, 8, 0.2875565287844002);
        setElement(term1065, 1, term1068);
        setDoubleElement(term1078, 0, 0.18556961666156768);
        setDoubleElement(term1078, 1, 0.41801713209224123);
        setElement(term1065, 2, term1078);
        setField(term1022, term1022.getClass(), "lu", term1065);
        setIntElement(term1081, 0, -1016503459);
        setIntElement(term1081, 1, -1968847291);
        setIntElement(term1081, 2, 579005622);
        setField(term1022, term1022.getClass(), "permutation", term1081);
        setIntField(term1022, term1022.getClass(), "parity", 1);
        term1086 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term1087 = (Object[]) newArray("[D", 2);
        double[] term1088 = (double[]) newDoubleArray(5);
        double[] term1094 = (double[]) newDoubleArray(1);
        Object[] term1096 = (Object[]) newArray("[D", 8);
        double[] term1097 = (double[]) newDoubleArray(7);
        double[] term1105 = (double[]) newDoubleArray(2);
        double[] term1108 = (double[]) newDoubleArray(2);
        double[] term1111 = (double[]) newDoubleArray(8);
        double[] term1120 = (double[]) newDoubleArray(5);
        double[] term1126 = (double[]) newDoubleArray(6);
        double[] term1133 = (double[]) newDoubleArray(6);
        double[] term1140 = (double[]) newDoubleArray(7);
        int[] term1148 = (int[]) newIntArray(5);
        setDoubleElement(term1088, 0, 0.010058361776520197);
        setDoubleElement(term1088, 1, 0.22206025307636057);
        setDoubleElement(term1088, 2, 0.3762445362551795);
        setDoubleElement(term1088, 3, 0.6004517527698794);
        setDoubleElement(term1088, 4, 0.9412219458975137);
        setElement(term1087, 0, term1088);
        setDoubleElement(term1094, 0, 0.06469331916225318);
        setElement(term1087, 1, term1094);
        setField(term1086, term1086.getClass(), "data", term1087);
        setDoubleElement(term1097, 0, 0.9259830415214885);
        setDoubleElement(term1097, 1, 0.6688842921741369);
        setDoubleElement(term1097, 2, 0.8067108928296716);
        setDoubleElement(term1097, 3, 0.6293118636954493);
        setDoubleElement(term1097, 4, 0.7705839211434976);
        setDoubleElement(term1097, 5, 0.08858836329417497);
        setDoubleElement(term1097, 6, 0.8582456540284578);
        setElement(term1096, 0, term1097);
        setDoubleElement(term1105, 0, 0.061434557058998585);
        setDoubleElement(term1105, 1, 0.1621025751381594);
        setElement(term1096, 1, term1105);
        setDoubleElement(term1108, 0, 0.8809657273235505);
        setDoubleElement(term1108, 1, 0.33296332053567956);
        setElement(term1096, 2, term1108);
        setDoubleElement(term1111, 0, 0.593079122289713);
        setDoubleElement(term1111, 1, 0.7455431255888774);
        setDoubleElement(term1111, 2, 0.9459012738750242);
        setDoubleElement(term1111, 3, 0.967474946781822);
        setDoubleElement(term1111, 4, 0.4429892630967539);
        setDoubleElement(term1111, 5, 0.10126144382177782);
        setDoubleElement(term1111, 6, 0.5029736700336335);
        setDoubleElement(term1111, 7, 0.2617673558897229);
        setElement(term1096, 3, term1111);
        setDoubleElement(term1120, 0, 0.052590327313127294);
        setDoubleElement(term1120, 1, 0.004207750553928968);
        setDoubleElement(term1120, 2, 0.9107074560109533);
        setDoubleElement(term1120, 3, 0.22308265923522352);
        setDoubleElement(term1120, 4, 0.46226950865842764);
        setElement(term1096, 4, term1120);
        setDoubleElement(term1126, 0, 0.6482086250011448);
        setDoubleElement(term1126, 1, 0.3154346482211354);
        setDoubleElement(term1126, 2, 0.020103660328398276);
        setDoubleElement(term1126, 3, 0.6530844366661772);
        setDoubleElement(term1126, 4, 0.7368078667856154);
        setDoubleElement(term1126, 5, 0.6799679189320558);
        setElement(term1096, 5, term1126);
        setDoubleElement(term1133, 0, 0.8342190257129791);
        setDoubleElement(term1133, 1, 0.1057616236613994);
        setDoubleElement(term1133, 2, 0.6517567007639319);
        setDoubleElement(term1133, 3, 0.7471692213461502);
        setDoubleElement(term1133, 4, 0.20733693951275556);
        setDoubleElement(term1133, 5, 0.6618543228332953);
        setElement(term1096, 6, term1133);
        setDoubleElement(term1140, 0, 0.8760632597672348);
        setDoubleElement(term1140, 1, 0.4046308665116508);
        setDoubleElement(term1140, 2, 0.3546618953364844);
        setDoubleElement(term1140, 3, 0.011186829850474256);
        setDoubleElement(term1140, 4, 0.47058253607311484);
        setDoubleElement(term1140, 5, 0.7340691331467901);
        setDoubleElement(term1140, 6, 0.23604395020255575);
        setElement(term1096, 7, term1140);
        setField(term1086, term1086.getClass(), "lu", term1096);
        setIntElement(term1148, 0, -14890619);
        setIntElement(term1148, 1, 1632125673);
        setIntElement(term1148, 2, 454281060);
        setIntElement(term1148, 3, -1786399638);
        setIntElement(term1148, 4, 2055867847);
        setField(term1086, term1086.getClass(), "permutation", term1148);
        setIntField(term1086, term1086.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Object[] args = new Object[1];
        args[0] = term1086;
        try {
            callMethod(klass, "multiply", argTypes, term1022, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


