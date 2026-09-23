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

public class BigMatrixImpl_isValidCoordinate_793631384121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27489;
     Object term27505;
     Object term27507;

    public BigMatrixImpl_isValidCoordinate_793631384121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27489 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term27490 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        Object[] term27491 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        int[] term27492 = (int[]) newIntArray(9);
        setField(term27489, term27489.getClass(), "data", term27490);
        setField(term27489, term27489.getClass(), "lu", term27491);
        setIntElement(term27492, 0, 2049577015);
        setIntElement(term27492, 1, 1236004505);
        setIntElement(term27492, 2, 1050765721);
        setIntElement(term27492, 3, 474518942);
        setIntElement(term27492, 4, -1656687479);
        setIntElement(term27492, 5, -249614216);
        setIntElement(term27492, 6, 1870727665);
        setIntElement(term27492, 7, -519881101);
        setIntElement(term27492, 8, -680920524);
        setField(term27489, term27489.getClass(), "permutation", term27492);
        setIntField(term27489, term27489.getClass(), "parity", 1);
        setIntField(term27489, term27489.getClass(), "roundingMode", 4);
        setIntField(term27489, term27489.getClass(), "scale", 64);
        term27505 = new Integer(-916335264);
        term27507 = new Integer(-919416536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term27505;
        args[1] = term27507;
        try {
            callMethod(klass, "isValidCoordinate", argTypes, term27489, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


