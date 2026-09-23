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

public class RealMatrixImpl_toString_166277358386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4146;

    public RealMatrixImpl_toString_166277358386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4146 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term4147 = (Object[]) newArray("[D", 9);
        double[] term4148 = (double[]) newDoubleArray(6);
        double[] term4155 = (double[]) newDoubleArray(7);
        double[] term4163 = (double[]) newDoubleArray(9);
        double[] term4173 = (double[]) newDoubleArray(8);
        double[] term4182 = (double[]) newDoubleArray(5);
        double[] term4188 = (double[]) newDoubleArray(6);
        double[] term4195 = (double[]) newDoubleArray(6);
        double[] term4202 = (double[]) newDoubleArray(3);
        double[] term4206 = (double[]) newDoubleArray(9);
        Object[] term4216 = (Object[]) newArray("[D", 3);
        double[] term4217 = (double[]) newDoubleArray(7);
        double[] term4225 = (double[]) newDoubleArray(7);
        double[] term4233 = (double[]) newDoubleArray(2);
        int[] term4236 = (int[]) newIntArray(6);
        setDoubleElement(term4148, 0, 0.565609532968288);
        setDoubleElement(term4148, 1, 0.7947290048119144);
        setDoubleElement(term4148, 2, 0.5337430117272884);
        setDoubleElement(term4148, 3, 0.27163525969236135);
        setDoubleElement(term4148, 4, 0.4251526356052183);
        setDoubleElement(term4148, 5, 0.24346852568817023);
        setElement(term4147, 0, term4148);
        setDoubleElement(term4155, 0, 0.489810781846415);
        setDoubleElement(term4155, 1, 0.6280707278367392);
        setDoubleElement(term4155, 2, 0.4085500442184048);
        setDoubleElement(term4155, 3, 0.47989828700352943);
        setDoubleElement(term4155, 4, 0.5403673884189805);
        setDoubleElement(term4155, 5, 0.3978451405778901);
        setDoubleElement(term4155, 6, 0.6593342866252248);
        setElement(term4147, 1, term4155);
        setDoubleElement(term4163, 0, 0.7011120430733232);
        setDoubleElement(term4163, 1, 0.2537379248999696);
        setDoubleElement(term4163, 2, 0.41980955559278166);
        setDoubleElement(term4163, 3, 0.30928014508519164);
        setDoubleElement(term4163, 4, 0.26818656484636727);
        setDoubleElement(term4163, 5, 0.5078233810160571);
        setDoubleElement(term4163, 6, 0.5192798694370556);
        setDoubleElement(term4163, 7, 0.9325545481074903);
        setDoubleElement(term4163, 8, 0.45245524121354275);
        setElement(term4147, 2, term4163);
        setDoubleElement(term4173, 0, 0.246922193390965);
        setDoubleElement(term4173, 1, 0.8749487701724186);
        setDoubleElement(term4173, 2, 0.3037953178741225);
        setDoubleElement(term4173, 3, 0.15344338351874887);
        setDoubleElement(term4173, 4, 0.7166295369378838);
        setDoubleElement(term4173, 5, 0.46337073151103136);
        setDoubleElement(term4173, 6, 0.8877623588181615);
        setDoubleElement(term4173, 7, 0.25658632990710484);
        setElement(term4147, 3, term4173);
        setDoubleElement(term4182, 0, 0.7201803211069798);
        setDoubleElement(term4182, 1, 0.6500197748826614);
        setDoubleElement(term4182, 2, 0.946211618813987);
        setDoubleElement(term4182, 3, 0.8896721147742989);
        setDoubleElement(term4182, 4, 0.9757334596651891);
        setElement(term4147, 4, term4182);
        setDoubleElement(term4188, 0, 0.7898661714152403);
        setDoubleElement(term4188, 1, 0.011900111538757252);
        setDoubleElement(term4188, 2, 0.08402068319025136);
        setDoubleElement(term4188, 3, 0.09647925132289159);
        setDoubleElement(term4188, 4, 0.6506123772888653);
        setDoubleElement(term4188, 5, 0.7501385925844105);
        setElement(term4147, 5, term4188);
        setDoubleElement(term4195, 0, 0.2497320017073733);
        setDoubleElement(term4195, 1, 0.06408311287687929);
        setDoubleElement(term4195, 2, 0.5781748232301926);
        setDoubleElement(term4195, 3, 0.9050658066338464);
        setDoubleElement(term4195, 4, 0.4339052897775906);
        setDoubleElement(term4195, 5, 0.3208630345467227);
        setElement(term4147, 6, term4195);
        setDoubleElement(term4202, 0, 0.586692763250887);
        setDoubleElement(term4202, 1, 0.11082607348088147);
        setDoubleElement(term4202, 2, 0.5465528774415719);
        setElement(term4147, 7, term4202);
        setDoubleElement(term4206, 0, 0.7672297485346153);
        setDoubleElement(term4206, 1, 0.9742910752220957);
        setDoubleElement(term4206, 2, 0.8370900141444069);
        setDoubleElement(term4206, 3, 0.6110011448268153);
        setDoubleElement(term4206, 4, 0.018302261391212493);
        setDoubleElement(term4206, 5, 0.6410193852146185);
        setDoubleElement(term4206, 6, 0.6338660920761878);
        setDoubleElement(term4206, 7, 0.6238929519140947);
        setDoubleElement(term4206, 8, 0.24724392457453415);
        setElement(term4147, 8, term4206);
        setField(term4146, term4146.getClass(), "data", term4147);
        setDoubleElement(term4217, 0, 0.01683435405886269);
        setDoubleElement(term4217, 1, 0.14230806046570932);
        setDoubleElement(term4217, 2, 0.7944745155049505);
        setDoubleElement(term4217, 3, 0.822746872244374);
        setDoubleElement(term4217, 4, 0.39518853263245735);
        setDoubleElement(term4217, 5, 0.04623139308451618);
        setDoubleElement(term4217, 6, 0.7736715547701163);
        setElement(term4216, 0, term4217);
        setDoubleElement(term4225, 0, 0.7342256643582769);
        setDoubleElement(term4225, 1, 0.5117334512228887);
        setDoubleElement(term4225, 2, 0.25330994555642383);
        setDoubleElement(term4225, 3, 0.98052877651785);
        setDoubleElement(term4225, 4, 0.4906639639979675);
        setDoubleElement(term4225, 5, 0.4078402832279562);
        setDoubleElement(term4225, 6, 0.11543135860402265);
        setElement(term4216, 1, term4225);
        setDoubleElement(term4233, 0, 0.2869076979265147);
        setDoubleElement(term4233, 1, 0.777690186289802);
        setElement(term4216, 2, term4233);
        setField(term4146, term4146.getClass(), "lu", term4216);
        setIntElement(term4236, 0, -1970452551);
        setIntElement(term4236, 1, -1896376975);
        setIntElement(term4236, 2, 729658803);
        setIntElement(term4236, 3, 114754804);
        setIntElement(term4236, 4, 1687361082);
        setIntElement(term4236, 5, 584893196);
        setField(term4146, term4146.getClass(), "permutation", term4236);
        setIntField(term4146, term4146.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term4146, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


