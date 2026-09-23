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

public class BigMatrixImpl_init_139489340367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term991;

    public BigMatrixImpl_init_139489340367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term991 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object term992 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term993 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term995 = (int[]) newIntArray(6);
        Object term1009 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1010 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1012 = (int[]) newIntArray(6);
        setIntField(term993, term993.getClass(), "signum", 1);
        setIntElement(term995, 0, 465);
        setIntElement(term995, 1, -1390153706);
        setIntElement(term995, 2, -2072151250);
        setIntElement(term995, 3, -351773634);
        setIntElement(term995, 4, -2080264737);
        setIntElement(term995, 5, -362538513);
        setField(term993, term993.getClass(), "mag", term995);
        setIntField(term993, term993.getClass(), "bitCountPlusOne", 0);
        setIntField(term993, term993.getClass(), "bitLengthPlusOne", 0);
        setIntField(term993, term993.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term993, term993.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term992, term992.getClass(), "intVal", term993);
        setIntField(term992, term992.getClass(), "scale", 51);
        setIntField(term992, term992.getClass(), "precision", 0);
        setField(term992, term992.getClass(), "stringCache", null);
        setLongField(term992, term992.getClass(), "intCompact", -9223372036854775808L);
        setElement(term991, 0, term992);
        setIntField(term1010, term1010.getClass(), "signum", 1);
        setIntElement(term1012, 0, 19519);
        setIntElement(term1012, 1, -1182278371);
        setIntElement(term1012, 2, -1767261549);
        setIntElement(term1012, 3, 1466667712);
        setIntElement(term1012, 4, 124168962);
        setIntElement(term1012, 5, -1752295351);
        setField(term1010, term1010.getClass(), "mag", term1012);
        setIntField(term1010, term1010.getClass(), "bitCountPlusOne", 0);
        setIntField(term1010, term1010.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1010, term1010.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1010, term1010.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1009, term1009.getClass(), "intVal", term1010);
        setIntField(term1009, term1009.getClass(), "scale", 53);
        setIntField(term1009, term1009.getClass(), "precision", 0);
        setField(term1009, term1009.getClass(), "stringCache", null);
        setLongField(term1009, term1009.getClass(), "intCompact", -9223372036854775808L);
        setElement(term991, 1, term1009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term991;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


