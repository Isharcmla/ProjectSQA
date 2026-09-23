package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;

public class TarArchiveOutputStream_writeRecord_1598060345245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141936;
     Object term141780;
     Object term142043;
     Object term142045;

    public TarArchiveOutputStream_writeRecord_1598060345245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141936 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term142024 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        setIntField(term141936, term141936.getClass(), "recordSize", 0);
        setField(term141936, term141936.getClass(), "out", term142024);
        term141780 = (byte[]) newByteArray(0);
        term142043 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term142044 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        setLongField(term142043, term142043.getClass(), "currSize", 0L);
        setField(term142043, term142043.getClass(), "currName", null);
        setLongField(term142043, term142043.getClass(), "currBytes", 0L);
        setField(term142043, term142043.getClass(), "recordBuf", null);
        setIntField(term142043, term142043.getClass(), "assemLen", 0);
        setField(term142043, term142043.getClass(), "assemBuf", null);
        setIntField(term142043, term142043.getClass(), "longFileMode", 0);
        setIntField(term142043, term142043.getClass(), "bigNumberMode", 0);
        setIntField(term142043, term142043.getClass(), "recordsWritten", 1);
        setIntField(term142043, term142043.getClass(), "recordsPerBlock", 0);
        setIntField(term142043, term142043.getClass(), "recordSize", 0);
        setBooleanField(term142043, term142043.getClass(), "closed", false);
        setBooleanField(term142043, term142043.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term142043, term142043.getClass(), "finished", false);
        setField(term142043, term142043.getClass(), "out", term142044);
        setField(term142043, term142043.getClass(), "zipEncoding", null);
        setBooleanField(term142043, term142043.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term142043, term142043.getClass(), "oneByte", null);
        setLongField(term142043, term142043.getClass(), "bytesWritten", 0L);
        term142045 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term141780;
        args[1] = 0;
        callMethod(klass, "writeRecord", argTypes, term141936, args);
        assertTrue(recursiveEquals(term141936, term142043));
        assertTrue(recursiveEquals(term141780, term142045));
    }

};


