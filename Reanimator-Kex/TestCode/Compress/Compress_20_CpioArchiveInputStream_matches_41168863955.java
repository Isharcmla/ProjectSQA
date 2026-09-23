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

public class CpioArchiveInputStream_matches_41168863955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25747;
     Object term25800;

    public CpioArchiveInputStream_matches_41168863955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25747 = (byte[]) newByteArray(8);
        setByteElement(term25747, 1, (byte) 113);
        setByteElement(term25747, 2, (byte) 113);
        setByteElement(term25747, 3, (byte) 113);
        setByteElement(term25747, 4, (byte) 113);
        setByteElement(term25747, 5, (byte) 113);
        setByteElement(term25747, 6, (byte) 113);
        setByteElement(term25747, 7, (byte) 113);
        term25800 = (byte[]) newByteArray(8);
        setByteElement(term25800, 1, (byte) 113);
        setByteElement(term25800, 2, (byte) 113);
        setByteElement(term25800, 3, (byte) 113);
        setByteElement(term25800, 4, (byte) 113);
        setByteElement(term25800, 5, (byte) 113);
        setByteElement(term25800, 6, (byte) 113);
        setByteElement(term25800, 7, (byte) 113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term25747;
        args[1] = 6;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term25747, term25800));
        assertTrue(recursiveEquals(retValue, false));
    }

};


