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

public class ArrayUtils_toObject_1132864560284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1248;
     Object term14536;
     Object term14519;

    public ArrayUtils_toObject_1132864560284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1248 = (double[]) newDoubleArray(5);
        setDoubleElement(term1248, 0, 0.03699061125289671);
        setDoubleElement(term1248, 1, 0.6047137830113202);
        setDoubleElement(term1248, 2, 0.6767213143579776);
        setDoubleElement(term1248, 3, 0.48862955528902696);
        setDoubleElement(term1248, 4, 0.426231085465289);
        term14536 = (double[]) newDoubleArray(5);
        setDoubleElement(term14536, 0, 0.03699061125289671);
        setDoubleElement(term14536, 1, 0.6047137830113202);
        setDoubleElement(term14536, 2, 0.6767213143579776);
        setDoubleElement(term14536, 3, 0.48862955528902696);
        setDoubleElement(term14536, 4, 0.426231085465289);
        Double term14520 = new Double(0.03699061125289671);
        Double term14522 = new Double(0.6047137830113202);
        Double term14524 = new Double(0.6767213143579776);
        Double term14526 = new Double(0.48862955528902696);
        Double term14528 = new Double(0.426231085465289);
        term14519 = (Object[]) newArray("java.lang.Double", 5);
        setElement(term14519, 0, term14520);
        setElement(term14519, 1, term14522);
        setElement(term14519, 2, term14524);
        setElement(term14519, 3, term14526);
        setElement(term14519, 4, term14528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1248;
        Object retValue = callMethod(klass, "toObject", argTypes, null, args);
        assertTrue(recursiveEquals(term1248, term14536));
        assertTrue(recursiveEquals(retValue, term14519));
    }

};


