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

public class ZipArchiveInputStream_readFully_26773689829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16688;

    public ZipArchiveInputStream_readFully_26773689829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16688 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term16688, term16688.getClass(), "zipEncoding", null);
        setBooleanField(term16688, term16688.getClass(), "useUnicodeExtraFields", false);
        setField(term16688, term16688.getClass(), "in", null);
        setField(term16688, term16688.getClass(), "inf", null);
        setField(term16688, term16688.getClass(), "crc", null);
        setField(term16688, term16688.getClass(), "buf", null);
        setField(term16688, term16688.getClass(), "current", null);
        setBooleanField(term16688, term16688.getClass(), "closed", false);
        setBooleanField(term16688, term16688.getClass(), "hitCentralDirectory", false);
        setIntField(term16688, term16688.getClass(), "readBytesOfEntry", 0);
        setIntField(term16688, term16688.getClass(), "offsetInBuffer", 0);
        setIntField(term16688, term16688.getClass(), "bytesReadFromStream", 0);
        setIntField(term16688, term16688.getClass(), "lengthOfLastRead", 0);
        setBooleanField(term16688, term16688.getClass(), "hasDataDescriptor", false);
        setField(term16688, term16688.getClass(), "SINGLE", null);
        setIntField(term16688, term16688.getClass(), "bytesRead", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "readFully", argTypes, term16688, args);
    }

};


