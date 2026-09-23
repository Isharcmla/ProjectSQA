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

public class CpioArchiveInputStream_matches_41168863985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40194;
     Object term40711;

    public CpioArchiveInputStream_matches_41168863985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40194 = (byte[]) newByteArray(8);
        setByteElement(term40194, 0, (byte) 48);
        setByteElement(term40194, 1, (byte) 113);
        setByteElement(term40194, 2, (byte) 48);
        setByteElement(term40194, 3, (byte) 48);
        setByteElement(term40194, 4, (byte) 48);
        setByteElement(term40194, 5, (byte) 48);
        setByteElement(term40194, 6, (byte) 48);
        setByteElement(term40194, 7, (byte) 48);
        term40711 = (byte[]) newByteArray(8);
        setByteElement(term40711, 0, (byte) 48);
        setByteElement(term40711, 1, (byte) 113);
        setByteElement(term40711, 2, (byte) 48);
        setByteElement(term40711, 3, (byte) 48);
        setByteElement(term40711, 4, (byte) 48);
        setByteElement(term40711, 5, (byte) 48);
        setByteElement(term40711, 6, (byte) 48);
        setByteElement(term40711, 7, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term40194;
        args[1] = 6;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term40194, term40711));
        assertTrue(recursiveEquals(retValue, false));
    }

};


