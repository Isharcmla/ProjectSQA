package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class ArrayUtils_toObject_1132864560286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;
     Object term14582;
     Object term14565;

    public ArrayUtils_toObject_1132864560286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1259 = (double[]) newDoubleArray(5);
        setDoubleElement(term1259, 0, 0.03699061125289671);
        setDoubleElement(term1259, 1, 0.6047137830113202);
        setDoubleElement(term1259, 2, 0.6767213143579776);
        setDoubleElement(term1259, 3, 0.48862955528902696);
        setDoubleElement(term1259, 4, 0.426231085465289);
        term14582 = (double[]) newDoubleArray(5);
        setDoubleElement(term14582, 0, 0.03699061125289671);
        setDoubleElement(term14582, 1, 0.6047137830113202);
        setDoubleElement(term14582, 2, 0.6767213143579776);
        setDoubleElement(term14582, 3, 0.48862955528902696);
        setDoubleElement(term14582, 4, 0.426231085465289);
        Double term14566 = new Double(0.03699061125289671);
        Double term14568 = new Double(0.6047137830113202);
        Double term14570 = new Double(0.6767213143579776);
        Double term14572 = new Double(0.48862955528902696);
        Double term14574 = new Double(0.426231085465289);
        term14565 = (Object[]) newArray("java.lang.Double", 5);
        setElement(term14565, 0, term14566);
        setElement(term14565, 1, term14568);
        setElement(term14565, 2, term14570);
        setElement(term14565, 3, term14572);
        setElement(term14565, 4, term14574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1259;
        Object retValue = callMethod(klass, "toObject", argTypes, null, args);
        assertTrue(recursiveEquals(term1259, term14582));
        assertTrue(recursiveEquals(retValue, term14565));
    }

};


