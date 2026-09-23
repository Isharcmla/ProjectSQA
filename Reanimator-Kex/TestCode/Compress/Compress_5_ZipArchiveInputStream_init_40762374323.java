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

public class ZipArchiveInputStream_init_40762374323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ZipArchiveInputStream_init_40762374323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16538 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] term15700 = (byte[]) newByteArray(57);
        setByteElement(term15700, 0, (byte) 111);
        setByteElement(term15700, 1, (byte) 114);
        setByteElement(term15700, 2, (byte) 103);
        setByteElement(term15700, 3, (byte) 46);
        setByteElement(term15700, 4, (byte) 97);
        setByteElement(term15700, 5, (byte) 112);
        setByteElement(term15700, 6, (byte) 97);
        setByteElement(term15700, 7, (byte) 99);
        setByteElement(term15700, 8, (byte) 104);
        setByteElement(term15700, 9, (byte) 101);
        setByteElement(term15700, 10, (byte) 46);
        setByteElement(term15700, 11, (byte) 99);
        setByteElement(term15700, 12, (byte) 111);
        setByteElement(term15700, 13, (byte) 109);
        setByteElement(term15700, 14, (byte) 109);
        setByteElement(term15700, 15, (byte) 111);
        setByteElement(term15700, 16, (byte) 110);
        setByteElement(term15700, 17, (byte) 115);
        setByteElement(term15700, 18, (byte) 46);
        setByteElement(term15700, 19, (byte) 99);
        setByteElement(term15700, 20, (byte) 111);
        setByteElement(term15700, 21, (byte) 109);
        setByteElement(term15700, 22, (byte) 112);
        setByteElement(term15700, 23, (byte) 114);
        setByteElement(term15700, 24, (byte) 101);
        setByteElement(term15700, 25, (byte) 115);
        setByteElement(term15700, 26, (byte) 115);
        setByteElement(term15700, 27, (byte) 46);
        setByteElement(term15700, 28, (byte) 97);
        setByteElement(term15700, 29, (byte) 114);
        setByteElement(term15700, 30, (byte) 99);
        setByteElement(term15700, 31, (byte) 104);
        setByteElement(term15700, 32, (byte) 105);
        setByteElement(term15700, 33, (byte) 118);
        setByteElement(term15700, 34, (byte) 101);
        setByteElement(term15700, 35, (byte) 114);
        setByteElement(term15700, 36, (byte) 115);
        setByteElement(term15700, 37, (byte) 46);
        setByteElement(term15700, 38, (byte) 122);
        setByteElement(term15700, 39, (byte) 105);
        setByteElement(term15700, 40, (byte) 112);
        setByteElement(term15700, 41, (byte) 46);
        setByteElement(term15700, 42, (byte) 90);
        setByteElement(term15700, 43, (byte) 105);
        setByteElement(term15700, 44, (byte) 112);
        setByteElement(term15700, 45, (byte) 65);
        setByteElement(term15700, 46, (byte) 114);
        setByteElement(term15700, 47, (byte) 99);
        setByteElement(term15700, 48, (byte) 104);
        setByteElement(term15700, 49, (byte) 105);
        setByteElement(term15700, 50, (byte) 118);
        setByteElement(term15700, 51, (byte) 101);
        setByteElement(term15700, 52, (byte) 69);
        setByteElement(term15700, 53, (byte) 110);
        setByteElement(term15700, 54, (byte) 116);
        setByteElement(term15700, 55, (byte) 114);
        setByteElement(term15700, 56, (byte) 121);
        setField(term16538, term16538.getClass(), "SINGLE", term15700);
        setIntField(term16538, term16538.getClass(), "bytesRead", 0);
        setField(term16538, term16538.getClass(), "inf", null);
        setField(term16538, term16538.getClass(), "crc", null);
        setField(term16538, term16538.getClass(), "buf", null);
        setField(term16538, term16538.getClass(), "current", null);
        setBooleanField(term16538, term16538.getClass(), "closed", false);
        setBooleanField(term16538, term16538.getClass(), "hitCentralDirectory", false);
        setIntField(term16538, term16538.getClass(), "readBytesOfEntry", 0);
        setIntField(term16538, term16538.getClass(), "offsetInBuffer", 0);
        setIntField(term16538, term16538.getClass(), "bytesReadFromStream", 0);
        setIntField(term16538, term16538.getClass(), "lengthOfLastRead", 0);
        setBooleanField(term16538, term16538.getClass(), "hasDataDescriptor", false);
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
        args[1] = "";
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


