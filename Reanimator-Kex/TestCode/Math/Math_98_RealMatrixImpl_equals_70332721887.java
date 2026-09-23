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
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class RealMatrixImpl_equals_70332721887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4325;
     Object term4379;
     Object term23503;
     Object term23515;

    public RealMatrixImpl_equals_70332721887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4325 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term4326 = (Object[]) newArray("[D", 3);
        double[] term4327 = (double[]) newDoubleArray(1);
        double[] term4329 = (double[]) newDoubleArray(6);
        double[] term4336 = (double[]) newDoubleArray(3);
        Object[] term4340 = (Object[]) newArray("[D", 5);
        double[] term4341 = (double[]) newDoubleArray(0);
        double[] term4342 = (double[]) newDoubleArray(3);
        double[] term4346 = (double[]) newDoubleArray(4);
        double[] term4351 = (double[]) newDoubleArray(9);
        double[] term4361 = (double[]) newDoubleArray(8);
        int[] term4370 = (int[]) newIntArray(7);
        setDoubleElement(term4327, 0, 0.9750871435414475);
        setElement(term4326, 0, term4327);
        setDoubleElement(term4329, 0, 0.4244479522523773);
        setDoubleElement(term4329, 1, 0.13090766612376525);
        setDoubleElement(term4329, 2, 0.6623418154867594);
        setDoubleElement(term4329, 3, 0.08955649121950282);
        setDoubleElement(term4329, 4, 0.25256714791793244);
        setDoubleElement(term4329, 5, 0.5952958317290666);
        setElement(term4326, 1, term4329);
        setDoubleElement(term4336, 0, 0.5461102482995668);
        setDoubleElement(term4336, 1, 0.9137323783820119);
        setDoubleElement(term4336, 2, 0.4458842375648203);
        setElement(term4326, 2, term4336);
        setField(term4325, term4325.getClass(), "data", term4326);
        setElement(term4340, 0, term4341);
        setDoubleElement(term4342, 0, 0.10930138312122684);
        setDoubleElement(term4342, 1, 0.3842409546853731);
        setDoubleElement(term4342, 2, 0.7689818911978834);
        setElement(term4340, 1, term4342);
        setDoubleElement(term4346, 0, 0.7250667809747515);
        setDoubleElement(term4346, 1, 0.21045027666063687);
        setDoubleElement(term4346, 2, 0.9128966771635857);
        setDoubleElement(term4346, 3, 0.9630509997618707);
        setElement(term4340, 2, term4346);
        setDoubleElement(term4351, 0, 0.8989590306383064);
        setDoubleElement(term4351, 1, 0.23768685961979785);
        setDoubleElement(term4351, 2, 0.755674197120759);
        setDoubleElement(term4351, 3, 0.09469959379296888);
        setDoubleElement(term4351, 4, 0.6548817606608114);
        setDoubleElement(term4351, 5, 0.917848996719316);
        setDoubleElement(term4351, 6, 0.3170978963909493);
        setDoubleElement(term4351, 7, 0.6515468596140501);
        setDoubleElement(term4351, 8, 0.7536609151347575);
        setElement(term4340, 3, term4351);
        setDoubleElement(term4361, 0, 0.5546333544124585);
        setDoubleElement(term4361, 1, 0.3130962773814131);
        setDoubleElement(term4361, 2, 0.1673922529900559);
        setDoubleElement(term4361, 3, 0.22792641547114512);
        setDoubleElement(term4361, 4, 0.9325087254152569);
        setDoubleElement(term4361, 5, 0.6371002089118303);
        setDoubleElement(term4361, 6, 0.8117238508746569);
        setDoubleElement(term4361, 7, 0.35898034971003856);
        setElement(term4340, 4, term4361);
        setField(term4325, term4325.getClass(), "lu", term4340);
        setIntElement(term4370, 0, 497269071);
        setIntElement(term4370, 1, -1899301124);
        setIntElement(term4370, 2, -1882480155);
        setIntElement(term4370, 3, -1410220680);
        setIntElement(term4370, 4, 389427431);
        setIntElement(term4370, 5, -1945706126);
        setIntElement(term4370, 6, 1152356969);
        setField(term4325, term4325.getClass(), "permutation", term4370);
        setIntField(term4325, term4325.getClass(), "parity", 1);
        term4379 = newInstance(Class.forName("java.lang.Object"));
        term23503 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term23504 = (Object[]) newArray("[D", 3);
        double[] term23505 = (double[]) newDoubleArray(1);
        double[] term23506 = (double[]) newDoubleArray(6);
        double[] term23507 = (double[]) newDoubleArray(3);
        Object[] term23508 = (Object[]) newArray("[D", 5);
        double[] term23509 = (double[]) newDoubleArray(0);
        double[] term23510 = (double[]) newDoubleArray(3);
        double[] term23511 = (double[]) newDoubleArray(4);
        double[] term23512 = (double[]) newDoubleArray(9);
        double[] term23513 = (double[]) newDoubleArray(8);
        int[] term23514 = (int[]) newIntArray(7);
        setDoubleElement(term23505, 0, 0.9750871435414475);
        setElement(term23504, 0, term23505);
        setDoubleElement(term23506, 0, 0.4244479522523773);
        setDoubleElement(term23506, 1, 0.13090766612376525);
        setDoubleElement(term23506, 2, 0.6623418154867594);
        setDoubleElement(term23506, 3, 0.08955649121950282);
        setDoubleElement(term23506, 4, 0.25256714791793244);
        setDoubleElement(term23506, 5, 0.5952958317290666);
        setElement(term23504, 1, term23506);
        setDoubleElement(term23507, 0, 0.5461102482995668);
        setDoubleElement(term23507, 1, 0.9137323783820119);
        setDoubleElement(term23507, 2, 0.4458842375648203);
        setElement(term23504, 2, term23507);
        setField(term23503, term23503.getClass(), "data", term23504);
        setElement(term23508, 0, term23509);
        setDoubleElement(term23510, 0, 0.10930138312122684);
        setDoubleElement(term23510, 1, 0.3842409546853731);
        setDoubleElement(term23510, 2, 0.7689818911978834);
        setElement(term23508, 1, term23510);
        setDoubleElement(term23511, 0, 0.7250667809747515);
        setDoubleElement(term23511, 1, 0.21045027666063687);
        setDoubleElement(term23511, 2, 0.9128966771635857);
        setDoubleElement(term23511, 3, 0.9630509997618707);
        setElement(term23508, 2, term23511);
        setDoubleElement(term23512, 0, 0.8989590306383064);
        setDoubleElement(term23512, 1, 0.23768685961979785);
        setDoubleElement(term23512, 2, 0.755674197120759);
        setDoubleElement(term23512, 3, 0.09469959379296888);
        setDoubleElement(term23512, 4, 0.6548817606608114);
        setDoubleElement(term23512, 5, 0.917848996719316);
        setDoubleElement(term23512, 6, 0.3170978963909493);
        setDoubleElement(term23512, 7, 0.6515468596140501);
        setDoubleElement(term23512, 8, 0.7536609151347575);
        setElement(term23508, 3, term23512);
        setDoubleElement(term23513, 0, 0.5546333544124585);
        setDoubleElement(term23513, 1, 0.3130962773814131);
        setDoubleElement(term23513, 2, 0.1673922529900559);
        setDoubleElement(term23513, 3, 0.22792641547114512);
        setDoubleElement(term23513, 4, 0.9325087254152569);
        setDoubleElement(term23513, 5, 0.6371002089118303);
        setDoubleElement(term23513, 6, 0.8117238508746569);
        setDoubleElement(term23513, 7, 0.35898034971003856);
        setElement(term23508, 4, term23513);
        setField(term23503, term23503.getClass(), "lu", term23508);
        setIntElement(term23514, 0, 497269071);
        setIntElement(term23514, 1, -1899301124);
        setIntElement(term23514, 2, -1882480155);
        setIntElement(term23514, 3, -1410220680);
        setIntElement(term23514, 4, 389427431);
        setIntElement(term23514, 5, -1945706126);
        setIntElement(term23514, 6, 1152356969);
        setField(term23503, term23503.getClass(), "permutation", term23514);
        setIntField(term23503, term23503.getClass(), "parity", 1);
        term23515 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4379;
        Object retValue = callMethod(klass, "equals", argTypes, term4325, args);
        assertTrue(recursiveEquals(term4325, term23503));
        assertTrue(recursiveEquals(term4379, term23515));
        assertTrue(recursiveEquals(retValue, false));
    }

};


