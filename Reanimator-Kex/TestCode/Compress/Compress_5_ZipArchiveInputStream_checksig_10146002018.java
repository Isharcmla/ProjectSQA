package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZipArchiveInputStream_checksig_10146002018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3517;
     Object term3525;

    public ZipArchiveInputStream_checksig_10146002018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3517 = (byte[]) newByteArray(7);
        setByteElement(term3517, 0, (byte) 123);
        setByteElement(term3517, 1, (byte) -5);
        setByteElement(term3517, 2, (byte) 84);
        setByteElement(term3517, 3, (byte) -97);
        setByteElement(term3517, 4, (byte) -24);
        setByteElement(term3517, 5, (byte) 88);
        setByteElement(term3517, 6, (byte) 96);
        term3525 = (byte[]) newByteArray(2);
        setByteElement(term3525, 0, (byte) 70);
        setByteElement(term3525, 1, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3517;
        args[1] = term3525;
        callMethod(klass, "checksig", argTypes, null, args);
    }

};


