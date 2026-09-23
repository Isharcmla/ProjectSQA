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

public class TarArchiveOutputStream_failForBigNumberWithPosixMessage_2076765620127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81174;
     Object term81323;

    public TarArchiveOutputStream_failForBigNumberWithPosixMessage_2076765620127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81174 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        term81323 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term81323, term81323.getClass(), "currSize", 0L);
        setField(term81323, term81323.getClass(), "currName", null);
        setLongField(term81323, term81323.getClass(), "currBytes", 0L);
        setField(term81323, term81323.getClass(), "recordBuf", null);
        setIntField(term81323, term81323.getClass(), "assemLen", 0);
        setField(term81323, term81323.getClass(), "assemBuf", null);
        setIntField(term81323, term81323.getClass(), "longFileMode", 0);
        setIntField(term81323, term81323.getClass(), "bigNumberMode", 0);
        setIntField(term81323, term81323.getClass(), "recordsWritten", 0);
        setIntField(term81323, term81323.getClass(), "recordsPerBlock", 0);
        setIntField(term81323, term81323.getClass(), "recordSize", 0);
        setBooleanField(term81323, term81323.getClass(), "closed", false);
        setBooleanField(term81323, term81323.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term81323, term81323.getClass(), "finished", false);
        setField(term81323, term81323.getClass(), "out", null);
        setField(term81323, term81323.getClass(), "zipEncoding", null);
        setBooleanField(term81323, term81323.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term81323, term81323.getClass(), "oneByte", null);
        setLongField(term81323, term81323.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0L;
        args[2] = 0L;
        callMethod(klass, "failForBigNumberWithPosixMessage", argTypes, term81174, args);
        assertTrue(recursiveEquals(term81174, term81323));
    }

};


