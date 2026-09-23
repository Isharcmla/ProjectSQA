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

public class ZipArchiveInputStream_init_6720531830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ZipArchiveInputStream_init_6720531830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18465 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] term17702 = (byte[]) newByteArray(4);
        Object term18490 = newInstance(Class.forName("java.util.zip.Inflater"));
        setByteElement(term17702, 0, (byte) 85);
        setByteElement(term17702, 1, (byte) 84);
        setByteElement(term17702, 2, (byte) 70);
        setByteElement(term17702, 3, (byte) 56);
        setField(term18465, term18465.getClass(), "SINGLE", term17702);
        setIntField(term18465, term18465.getClass(), "bytesRead", 0);
        setField(term18490, term18490.getClass(), "input", null);
        setField(term18490, term18490.getClass(), "zsRef", null);
        setField(term18465, term18465.getClass(), "inf", term18490);
        setField(term18465, term18465.getClass(), "crc", null);
        setField(term18465, term18465.getClass(), "buf", null);
        setField(term18465, term18465.getClass(), "current", null);
        setBooleanField(term18465, term18465.getClass(), "closed", false);
        setBooleanField(term18465, term18465.getClass(), "hitCentralDirectory", false);
        setIntField(term18465, term18465.getClass(), "readBytesOfEntry", 0);
        setIntField(term18465, term18465.getClass(), "offsetInBuffer", 0);
        setIntField(term18465, term18465.getClass(), "bytesReadFromStream", 0);
        setIntField(term18465, term18465.getClass(), "lengthOfLastRead", 0);
        setBooleanField(term18465, term18465.getClass(), "hasDataDescriptor", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


