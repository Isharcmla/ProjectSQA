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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ArchiveUtils_isEqualWithNull_194549087325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;
     Object term213;
     Object term215;
     Object term217;
     Object term220;
     Object term222;

    public ArchiveUtils_isEqualWithNull_194549087325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207 = (byte[]) newByteArray(5);
        setByteElement(term207, 0, (byte) -23);
        setByteElement(term207, 1, (byte) 100);
        setByteElement(term207, 2, (byte) 106);
        setByteElement(term207, 3, (byte) -57);
        setByteElement(term207, 4, (byte) -103);
        term213 = new Integer(1134449235);
        term215 = new Integer(-883034806);
        term217 = (byte[]) newByteArray(2);
        setByteElement(term217, 0, (byte) 98);
        setByteElement(term217, 1, (byte) 79);
        term220 = new Integer(1585847225);
        term222 = new Integer(597278769);
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
        args[0] = term207;
        args[1] = term213;
        args[2] = term215;
        args[3] = term217;
        args[4] = term220;
        args[5] = term222;
        try {
            callMethod(klass, "isEqualWithNull", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


