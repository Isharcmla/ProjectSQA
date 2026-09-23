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
import java.lang.Short;

public class ArrayUtils_indexOf_1338795415232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term632;
     Object term640;
     Object term12845;

    public ArrayUtils_indexOf_1338795415232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term632 = (short[]) newShortArray(7);
        setShortElement(term632, 0, (short) -1725);
        setShortElement(term632, 1, (short) 2638);
        setShortElement(term632, 2, (short) 24663);
        setShortElement(term632, 3, (short) 30329);
        setShortElement(term632, 4, (short) -355);
        setShortElement(term632, 5, (short) 5118);
        setShortElement(term632, 6, (short) -4880);
        term640 = new Short((short) -3696);
        term12845 = (short[]) newShortArray(7);
        setShortElement(term12845, 0, (short) -1725);
        setShortElement(term12845, 1, (short) 2638);
        setShortElement(term12845, 2, (short) 24663);
        setShortElement(term12845, 3, (short) 30329);
        setShortElement(term12845, 4, (short) -355);
        setShortElement(term12845, 5, (short) 5118);
        setShortElement(term12845, 6, (short) -4880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = term632;
        args[1] = term640;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term632, term12845));
        assertTrue(recursiveEquals(term640, (short) -3696));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


