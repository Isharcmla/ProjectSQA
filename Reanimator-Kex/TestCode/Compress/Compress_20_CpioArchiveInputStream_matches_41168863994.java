package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;

public class CpioArchiveInputStream_matches_41168863994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42060;
     Object term42424;

    public CpioArchiveInputStream_matches_41168863994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42060 = (byte[]) newByteArray(8);
        setByteElement(term42060, 0, (byte) 113);
        setByteElement(term42060, 1, (byte) 113);
        setByteElement(term42060, 2, (byte) 113);
        setByteElement(term42060, 3, (byte) 113);
        setByteElement(term42060, 4, (byte) 113);
        setByteElement(term42060, 5, (byte) 113);
        setByteElement(term42060, 6, (byte) 113);
        setByteElement(term42060, 7, (byte) 113);
        term42424 = (byte[]) newByteArray(8);
        setByteElement(term42424, 0, (byte) 113);
        setByteElement(term42424, 1, (byte) 113);
        setByteElement(term42424, 2, (byte) 113);
        setByteElement(term42424, 3, (byte) 113);
        setByteElement(term42424, 4, (byte) 113);
        setByteElement(term42424, 5, (byte) 113);
        setByteElement(term42424, 6, (byte) 113);
        setByteElement(term42424, 7, (byte) 113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term42060;
        args[1] = 6;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term42060, term42424));
        assertTrue(recursiveEquals(retValue, false));
    }

};


