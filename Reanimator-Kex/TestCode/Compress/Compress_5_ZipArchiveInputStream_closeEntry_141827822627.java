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

public class ZipArchiveInputStream_closeEntry_141827822627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16668;

    public ZipArchiveInputStream_closeEntry_141827822627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16668 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term16668, term16668.getClass(), "zipEncoding", null);
        setBooleanField(term16668, term16668.getClass(), "useUnicodeExtraFields", false);
        setField(term16668, term16668.getClass(), "in", null);
        setField(term16668, term16668.getClass(), "inf", null);
        setField(term16668, term16668.getClass(), "crc", null);
        setField(term16668, term16668.getClass(), "buf", null);
        setField(term16668, term16668.getClass(), "current", null);
        setBooleanField(term16668, term16668.getClass(), "closed", false);
        setBooleanField(term16668, term16668.getClass(), "hitCentralDirectory", false);
        setIntField(term16668, term16668.getClass(), "readBytesOfEntry", 0);
        setIntField(term16668, term16668.getClass(), "offsetInBuffer", 0);
        setIntField(term16668, term16668.getClass(), "bytesReadFromStream", 0);
        setIntField(term16668, term16668.getClass(), "lengthOfLastRead", 0);
        setBooleanField(term16668, term16668.getClass(), "hasDataDescriptor", false);
        setField(term16668, term16668.getClass(), "SINGLE", null);
        setIntField(term16668, term16668.getClass(), "bytesRead", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeEntry", argTypes, term16668, args);
    }

};


