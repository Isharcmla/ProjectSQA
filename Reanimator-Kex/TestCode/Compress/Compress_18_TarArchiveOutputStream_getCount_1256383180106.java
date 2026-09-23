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

public class TarArchiveOutputStream_getCount_1256383180106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228007;
     Object term260538;

    public TarArchiveOutputStream_getCount_1256383180106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228007 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term228121 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        setField(term228007, term228007.getClass(), "out", term228121);
        term260538 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term260539 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        setLongField(term260538, term260538.getClass(), "currSize", 0L);
        setField(term260538, term260538.getClass(), "currName", null);
        setLongField(term260538, term260538.getClass(), "currBytes", 0L);
        setField(term260538, term260538.getClass(), "recordBuf", null);
        setIntField(term260538, term260538.getClass(), "assemLen", 0);
        setField(term260538, term260538.getClass(), "assemBuf", null);
        setField(term260538, term260538.getClass(), "buffer", null);
        setIntField(term260538, term260538.getClass(), "longFileMode", 0);
        setIntField(term260538, term260538.getClass(), "bigNumberMode", 0);
        setBooleanField(term260538, term260538.getClass(), "closed", false);
        setBooleanField(term260538, term260538.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term260538, term260538.getClass(), "finished", false);
        setLongField(term260539, term260539.getClass(), "bytesWritten", 0L);
        setField(term260539, term260539.getClass(), "out", null);
        setBooleanField(term260539, term260539.getClass(), "closed", false);
        setField(term260539, term260539.getClass(), "closeLock", null);
        setField(term260538, term260538.getClass(), "out", term260539);
        setField(term260538, term260538.getClass(), "encoding", null);
        setBooleanField(term260538, term260538.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term260538, term260538.getClass(), "oneByte", null);
        setLongField(term260538, term260538.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCount", argTypes, term228007, args);
        assertTrue(recursiveEquals(term228007, term260538));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


