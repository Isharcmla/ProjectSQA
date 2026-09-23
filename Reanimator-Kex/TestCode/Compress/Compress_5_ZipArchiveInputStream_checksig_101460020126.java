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

public class ZipArchiveInputStream_checksig_101460020126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16658;

    public ZipArchiveInputStream_checksig_101460020126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16658 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term16658, term16658.getClass(), "zipEncoding", null);
        setBooleanField(term16658, term16658.getClass(), "useUnicodeExtraFields", false);
        setField(term16658, term16658.getClass(), "in", null);
        setField(term16658, term16658.getClass(), "inf", null);
        setField(term16658, term16658.getClass(), "crc", null);
        setField(term16658, term16658.getClass(), "buf", null);
        setField(term16658, term16658.getClass(), "current", null);
        setBooleanField(term16658, term16658.getClass(), "closed", false);
        setBooleanField(term16658, term16658.getClass(), "hitCentralDirectory", false);
        setIntField(term16658, term16658.getClass(), "readBytesOfEntry", 0);
        setIntField(term16658, term16658.getClass(), "offsetInBuffer", 0);
        setIntField(term16658, term16658.getClass(), "bytesReadFromStream", 0);
        setIntField(term16658, term16658.getClass(), "lengthOfLastRead", 0);
        setBooleanField(term16658, term16658.getClass(), "hasDataDescriptor", false);
        setField(term16658, term16658.getClass(), "SINGLE", null);
        setIntField(term16658, term16658.getClass(), "bytesRead", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "checksig", argTypes, term16658, args);
    }

};


