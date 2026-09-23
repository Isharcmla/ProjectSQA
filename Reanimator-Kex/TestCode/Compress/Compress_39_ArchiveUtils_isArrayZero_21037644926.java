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

public class ArchiveUtils_isArrayZero_21037644926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;
     Object term235;
     Object term1738;

    public ArchiveUtils_isArrayZero_21037644926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231 = (byte[]) newByteArray(3);
        setByteElement(term231, 0, (byte) 61);
        setByteElement(term231, 1, (byte) -92);
        setByteElement(term231, 2, (byte) -42);
        term235 = new Integer(-1685132342);
        term1738 = (byte[]) newByteArray(3);
        setByteElement(term1738, 0, (byte) 61);
        setByteElement(term1738, 1, (byte) -92);
        setByteElement(term1738, 2, (byte) -42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ArchiveUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term231;
        args[1] = term235;
        Object retValue = callMethod(klass, "isArrayZero", argTypes, null, args);
        assertTrue(recursiveEquals(term231, term1738));
        assertTrue(recursiveEquals(term235, -1685132342));
        assertTrue(recursiveEquals(retValue, true));
    }

};


