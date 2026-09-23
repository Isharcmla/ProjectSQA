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
import java.lang.Long;

public class ZipArchiveInputStream_skip_61418691324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16634;
     Object term16644;

    public ZipArchiveInputStream_skip_61418691324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16634 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term16634, term16634.getClass(), "zipEncoding", null);
        setBooleanField(term16634, term16634.getClass(), "useUnicodeExtraFields", false);
        setField(term16634, term16634.getClass(), "in", null);
        setField(term16634, term16634.getClass(), "inf", null);
        setField(term16634, term16634.getClass(), "crc", null);
        setField(term16634, term16634.getClass(), "buf", null);
        setField(term16634, term16634.getClass(), "current", null);
        setBooleanField(term16634, term16634.getClass(), "closed", false);
        setBooleanField(term16634, term16634.getClass(), "hitCentralDirectory", false);
        setIntField(term16634, term16634.getClass(), "readBytesOfEntry", 0);
        setIntField(term16634, term16634.getClass(), "offsetInBuffer", 0);
        setIntField(term16634, term16634.getClass(), "bytesReadFromStream", 0);
        setIntField(term16634, term16634.getClass(), "lengthOfLastRead", 0);
        setBooleanField(term16634, term16634.getClass(), "hasDataDescriptor", false);
        setField(term16634, term16634.getClass(), "SINGLE", null);
        setIntField(term16634, term16634.getClass(), "bytesRead", 0);
        term16644 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term16644;
        callMethod(klass, "skip", argTypes, term16634, args);
    }

};


