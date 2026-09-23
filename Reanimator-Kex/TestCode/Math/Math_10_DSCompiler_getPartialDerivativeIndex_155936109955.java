package org.apache.commons.math3.analysis.differentiation;

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
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class DSCompiler_getPartialDerivativeIndex_155936109955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6743;
     Object term6745;
     Object term6747;
     Object term6768;

    public DSCompiler_getPartialDerivativeIndex_155936109955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6743 = new Integer(1126005767);
        term6745 = new Integer(-1155333431);
        term6747 = (Object[]) newArray("[I", 3);
        int[] term6748 = (int[]) newIntArray(1);
        int[] term6750 = (int[]) newIntArray(7);
        int[] term6758 = (int[]) newIntArray(9);
        setIntElement(term6748, 0, -2110210183);
        setElement(term6747, 0, term6748);
        setIntElement(term6750, 0, -687531774);
        setIntElement(term6750, 1, -1997574107);
        setIntElement(term6750, 2, 748487022);
        setIntElement(term6750, 3, -706230330);
        setIntElement(term6750, 4, -926446006);
        setIntElement(term6750, 5, 572417171);
        setIntElement(term6750, 6, 46222099);
        setElement(term6747, 1, term6750);
        setIntElement(term6758, 0, 1985711069);
        setIntElement(term6758, 1, -1497378582);
        setIntElement(term6758, 2, -449740668);
        setIntElement(term6758, 3, 1283268105);
        setIntElement(term6758, 4, -220552939);
        setIntElement(term6758, 5, -444257155);
        setIntElement(term6758, 6, -309536114);
        setIntElement(term6758, 7, 755500171);
        setIntElement(term6758, 8, -535062491);
        setElement(term6747, 2, term6758);
        term6768 = (int[]) newIntArray(5);
        setIntElement(term6768, 0, -147381920);
        setIntElement(term6768, 1, -7568006);
        setIntElement(term6768, 2, 1952367361);
        setIntElement(term6768, 3, -715290594);
        setIntElement(term6768, 4, -860371306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term6743;
        args[1] = term6745;
        args[2] = term6747;
        args[3] = term6768;
        try {
            callMethod(klass, "getPartialDerivativeIndex", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


