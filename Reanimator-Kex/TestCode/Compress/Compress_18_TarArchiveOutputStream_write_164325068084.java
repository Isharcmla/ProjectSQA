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

public class TarArchiveOutputStream_write_164325068084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218860;
     Object term219330;

    public TarArchiveOutputStream_write_164325068084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218860 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term218860, term218860.getClass(), "currBytes", -1L);
        setLongField(term218860, term218860.getClass(), "currSize", 0L);
        setIntField(term218860, term218860.getClass(), "assemLen", 0);
        term219330 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term219330, term219330.getClass(), "currSize", 0L);
        setField(term219330, term219330.getClass(), "currName", null);
        setLongField(term219330, term219330.getClass(), "currBytes", -1L);
        setField(term219330, term219330.getClass(), "recordBuf", null);
        setIntField(term219330, term219330.getClass(), "assemLen", 0);
        setField(term219330, term219330.getClass(), "assemBuf", null);
        setField(term219330, term219330.getClass(), "buffer", null);
        setIntField(term219330, term219330.getClass(), "longFileMode", 0);
        setIntField(term219330, term219330.getClass(), "bigNumberMode", 0);
        setBooleanField(term219330, term219330.getClass(), "closed", false);
        setBooleanField(term219330, term219330.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term219330, term219330.getClass(), "finished", false);
        setField(term219330, term219330.getClass(), "out", null);
        setField(term219330, term219330.getClass(), "encoding", null);
        setBooleanField(term219330, term219330.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term219330, term219330.getClass(), "oneByte", null);
        setLongField(term219330, term219330.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        callMethod(klass, "write", argTypes, term218860, args);
        assertTrue(recursiveEquals(term218860, term219330));
    }

};


