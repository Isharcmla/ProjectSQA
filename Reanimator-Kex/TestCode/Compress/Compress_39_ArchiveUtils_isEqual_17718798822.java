package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Integer;

public class ArchiveUtils_isEqual_17718798822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;
     Object term140;
     Object term142;
     Object term144;
     Object term151;
     Object term153;
     Object term1326;
     Object term1327;

    public ArchiveUtils_isEqual_17718798822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = (byte[]) newByteArray(2);
        setByteElement(term137, 0, (byte) -16);
        setByteElement(term137, 1, (byte) -112);
        term140 = new Integer(1227103734);
        term142 = new Integer(-1339778481);
        term144 = (byte[]) newByteArray(6);
        setByteElement(term144, 0, (byte) -111);
        setByteElement(term144, 1, (byte) 23);
        setByteElement(term144, 2, (byte) -15);
        setByteElement(term144, 3, (byte) 36);
        setByteElement(term144, 4, (byte) 118);
        setByteElement(term144, 5, (byte) 106);
        term151 = new Integer(1725571209);
        term153 = new Integer(-522618178);
        term1326 = (byte[]) newByteArray(2);
        setByteElement(term1326, 0, (byte) -16);
        setByteElement(term1326, 1, (byte) -112);
        term1327 = (byte[]) newByteArray(6);
        setByteElement(term1327, 0, (byte) -111);
        setByteElement(term1327, 1, (byte) 23);
        setByteElement(term1327, 2, (byte) -15);
        setByteElement(term1327, 3, (byte) 36);
        setByteElement(term1327, 4, (byte) 118);
        setByteElement(term1327, 5, (byte) 106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ArchiveUtils");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term137;
        args[1] = term140;
        args[2] = term142;
        args[3] = term144;
        args[4] = term151;
        args[5] = term153;
        callMethod(klass, "isEqual", argTypes, null, args);
        assertTrue(recursiveEquals(term137, term1326));
        assertTrue(recursiveEquals(term140, 1227103734));
        assertTrue(recursiveEquals(term142, -1339778481));
        assertTrue(recursiveEquals(term144, term1327));
        assertTrue(recursiveEquals(term151, 1725571209));
        assertTrue(recursiveEquals(term153, -522618178));
    }

};


