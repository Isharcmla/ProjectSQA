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
import java.lang.Object;

public class ZipArchiveInputStream_init_40762374331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ZipArchiveInputStream_init_40762374331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19875 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] term19129 = (byte[]) newByteArray(0);
        byte[] term18839 = (byte[]) newByteArray(24);
        setField(term19875, term19875.getClass(), "SINGLE", term19129);
        setIntField(term19875, term19875.getClass(), "bytesRead", 0);
        setField(term19875, term19875.getClass(), "inf", null);
        setField(term19875, term19875.getClass(), "crc", null);
        setByteElement(term18839, 0, (byte) 106);
        setByteElement(term18839, 1, (byte) 97);
        setByteElement(term18839, 2, (byte) 118);
        setByteElement(term18839, 3, (byte) 97);
        setByteElement(term18839, 4, (byte) 46);
        setByteElement(term18839, 5, (byte) 108);
        setByteElement(term18839, 6, (byte) 97);
        setByteElement(term18839, 7, (byte) 110);
        setByteElement(term18839, 8, (byte) 103);
        setByteElement(term18839, 9, (byte) 46);
        setByteElement(term18839, 10, (byte) 114);
        setByteElement(term18839, 11, (byte) 101);
        setByteElement(term18839, 12, (byte) 102);
        setByteElement(term18839, 13, (byte) 108);
        setByteElement(term18839, 14, (byte) 101);
        setByteElement(term18839, 15, (byte) 99);
        setByteElement(term18839, 16, (byte) 116);
        setByteElement(term18839, 17, (byte) 46);
        setByteElement(term18839, 18, (byte) 77);
        setByteElement(term18839, 19, (byte) 101);
        setByteElement(term18839, 20, (byte) 116);
        setByteElement(term18839, 21, (byte) 104);
        setByteElement(term18839, 22, (byte) 111);
        setByteElement(term18839, 23, (byte) 100);
        setField(term19875, term19875.getClass(), "buf", term18839);
        setField(term19875, term19875.getClass(), "current", null);
        setBooleanField(term19875, term19875.getClass(), "closed", false);
        setBooleanField(term19875, term19875.getClass(), "hitCentralDirectory", false);
        setIntField(term19875, term19875.getClass(), "readBytesOfEntry", 0);
        setIntField(term19875, term19875.getClass(), "offsetInBuffer", 0);
        setIntField(term19875, term19875.getClass(), "bytesReadFromStream", 0);
        setIntField(term19875, term19875.getClass(), "lengthOfLastRead", 0);
        setBooleanField(term19875, term19875.getClass(), "hasDataDescriptor", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


