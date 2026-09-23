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

public class RealMatrixImpl_solve_161229612784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3928;

    public RealMatrixImpl_solve_161229612784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3928 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term3929 = (Object[]) newArray("[D", 3);
        double[] term3930 = (double[]) newDoubleArray(8);
        double[] term3939 = (double[]) newDoubleArray(6);
        double[] term3946 = (double[]) newDoubleArray(3);
        Object[] term3950 = (Object[]) newArray("[D", 7);
        double[] term3951 = (double[]) newDoubleArray(7);
        double[] term3959 = (double[]) newDoubleArray(6);
        double[] term3966 = (double[]) newDoubleArray(9);
        double[] term3976 = (double[]) newDoubleArray(8);
        double[] term3985 = (double[]) newDoubleArray(6);
        double[] term3992 = (double[]) newDoubleArray(7);
        double[] term4000 = (double[]) newDoubleArray(2);
        int[] term4003 = (int[]) newIntArray(3);
        setDoubleElement(term3930, 0, 0.9869943597370645);
        setDoubleElement(term3930, 1, 0.9742622723146419);
        setDoubleElement(term3930, 2, 0.6077671346464576);
        setDoubleElement(term3930, 3, 0.6250274796996639);
        setDoubleElement(term3930, 4, 0.22427137827351773);
        setDoubleElement(term3930, 5, 0.969490221046839);
        setDoubleElement(term3930, 6, 0.05936829916325781);
        setDoubleElement(term3930, 7, 0.491721920101997);
        setElement(term3929, 0, term3930);
        setDoubleElement(term3939, 0, 0.09671480925896325);
        setDoubleElement(term3939, 1, 0.831066683726038);
        setDoubleElement(term3939, 2, 0.4467038308214477);
        setDoubleElement(term3939, 3, 0.6987261712647458);
        setDoubleElement(term3939, 4, 0.027581863399333106);
        setDoubleElement(term3939, 5, 0.20990155104119645);
        setElement(term3929, 1, term3939);
        setDoubleElement(term3946, 0, 0.9249913556195489);
        setDoubleElement(term3946, 1, 0.1877052577832934);
        setDoubleElement(term3946, 2, 0.23668713227491267);
        setElement(term3929, 2, term3946);
        setField(term3928, term3928.getClass(), "data", term3929);
        setDoubleElement(term3951, 0, 0.9239377572164318);
        setDoubleElement(term3951, 1, 0.6813010351714496);
        setDoubleElement(term3951, 2, 0.09763351687433919);
        setDoubleElement(term3951, 3, 0.3806640485312077);
        setDoubleElement(term3951, 4, 0.6927105919942684);
        setDoubleElement(term3951, 5, 0.472345126379197);
        setDoubleElement(term3951, 6, 0.41193101624838113);
        setElement(term3950, 0, term3951);
        setDoubleElement(term3959, 0, 0.10886537960295217);
        setDoubleElement(term3959, 1, 0.04963830239720779);
        setDoubleElement(term3959, 2, 0.8167525902171758);
        setDoubleElement(term3959, 3, 0.807455542261219);
        setDoubleElement(term3959, 4, 0.564596292861835);
        setDoubleElement(term3959, 5, 0.5654978046272103);
        setElement(term3950, 1, term3959);
        setDoubleElement(term3966, 0, 0.49505702229385595);
        setDoubleElement(term3966, 1, 0.5599950475897455);
        setDoubleElement(term3966, 2, 0.46000626436198166);
        setDoubleElement(term3966, 3, 0.872983779948575);
        setDoubleElement(term3966, 4, 0.937384758014478);
        setDoubleElement(term3966, 5, 0.17047563714084557);
        setDoubleElement(term3966, 6, 0.8578492218112453);
        setDoubleElement(term3966, 7, 0.49494546187433763);
        setDoubleElement(term3966, 8, 0.4118373527197986);
        setElement(term3950, 2, term3966);
        setDoubleElement(term3976, 0, 0.8419204874913121);
        setDoubleElement(term3976, 1, 0.20445387624778377);
        setDoubleElement(term3976, 2, 0.14784017441675146);
        setDoubleElement(term3976, 3, 0.665820823383757);
        setDoubleElement(term3976, 4, 0.059265345156214067);
        setDoubleElement(term3976, 5, 0.4756291598245479);
        setDoubleElement(term3976, 6, 0.01713844734747194);
        setDoubleElement(term3976, 7, 0.818081528497029);
        setElement(term3950, 3, term3976);
        setDoubleElement(term3985, 0, 0.3024567751198154);
        setDoubleElement(term3985, 1, 0.5208622891399592);
        setDoubleElement(term3985, 2, 0.48286049640108797);
        setDoubleElement(term3985, 3, 0.8509665040333385);
        setDoubleElement(term3985, 4, 0.3578293137730927);
        setDoubleElement(term3985, 5, 0.8210501981778406);
        setElement(term3950, 4, term3985);
        setDoubleElement(term3992, 0, 0.9111194297569267);
        setDoubleElement(term3992, 1, 0.010433959251596847);
        setDoubleElement(term3992, 2, 0.7835783117780157);
        setDoubleElement(term3992, 3, 0.9111373377093535);
        setDoubleElement(term3992, 4, 0.42149147525108077);
        setDoubleElement(term3992, 5, 0.7855974069248086);
        setDoubleElement(term3992, 6, 0.8322154744386016);
        setElement(term3950, 5, term3992);
        setDoubleElement(term4000, 0, 0.6614161306210307);
        setDoubleElement(term4000, 1, 0.9902296633473404);
        setElement(term3950, 6, term4000);
        setField(term3928, term3928.getClass(), "lu", term3950);
        setIntElement(term4003, 0, -2066804303);
        setIntElement(term4003, 1, -1731761810);
        setIntElement(term4003, 2, 197109649);
        setField(term3928, term3928.getClass(), "permutation", term4003);
        setIntField(term3928, term3928.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "solve", argTypes, term3928, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


