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

public class CpioArchiveInputStream_matches_41168863966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27537;
     Object term27592;

    public CpioArchiveInputStream_matches_41168863966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27537 = (byte[]) newByteArray(8);
        setByteElement(term27537, 0, (byte) 48);
        setByteElement(term27537, 2, (byte) 48);
        setByteElement(term27537, 3, (byte) 48);
        setByteElement(term27537, 4, (byte) 48);
        setByteElement(term27537, 5, (byte) 48);
        setByteElement(term27537, 6, (byte) 48);
        setByteElement(term27537, 7, (byte) 48);
        term27592 = (byte[]) newByteArray(8);
        setByteElement(term27592, 0, (byte) 48);
        setByteElement(term27592, 2, (byte) 48);
        setByteElement(term27592, 3, (byte) 48);
        setByteElement(term27592, 4, (byte) 48);
        setByteElement(term27592, 5, (byte) 48);
        setByteElement(term27592, 6, (byte) 48);
        setByteElement(term27592, 7, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term27537;
        args[1] = 6;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term27537, term27592));
        assertTrue(recursiveEquals(retValue, false));
    }

};


