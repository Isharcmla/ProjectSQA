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

public class ZipArchiveInputStream_checksig_101460020116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1783;
     Object term1787;

    public ZipArchiveInputStream_checksig_101460020116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1783 = (byte[]) newByteArray(3);
        setByteElement(term1783, 0, (byte) -110);
        setByteElement(term1783, 1, (byte) 62);
        setByteElement(term1783, 2, (byte) -59);
        term1787 = (byte[]) newByteArray(9);
        setByteElement(term1787, 0, (byte) 126);
        setByteElement(term1787, 1, (byte) -15);
        setByteElement(term1787, 2, (byte) 60);
        setByteElement(term1787, 3, (byte) -51);
        setByteElement(term1787, 4, (byte) 65);
        setByteElement(term1787, 5, (byte) 103);
        setByteElement(term1787, 6, (byte) -19);
        setByteElement(term1787, 7, (byte) -36);
        setByteElement(term1787, 8, (byte) -23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1783;
        args[1] = term1787;
        callMethod(klass, "checksig", argTypes, null, args);
    }

};


