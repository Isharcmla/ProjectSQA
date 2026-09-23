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

public class TarArchiveOutputStream_getBytesWritten_2077705309135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84992;
     Object term85129;

    public TarArchiveOutputStream_getBytesWritten_2077705309135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84992 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term85106 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        setField(term84992, term84992.getClass(), "out", term85106);
        term85129 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term85130 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        setLongField(term85129, term85129.getClass(), "currSize", 0L);
        setField(term85129, term85129.getClass(), "currName", null);
        setLongField(term85129, term85129.getClass(), "currBytes", 0L);
        setField(term85129, term85129.getClass(), "recordBuf", null);
        setIntField(term85129, term85129.getClass(), "assemLen", 0);
        setField(term85129, term85129.getClass(), "assemBuf", null);
        setIntField(term85129, term85129.getClass(), "longFileMode", 0);
        setIntField(term85129, term85129.getClass(), "bigNumberMode", 0);
        setIntField(term85129, term85129.getClass(), "recordsWritten", 0);
        setIntField(term85129, term85129.getClass(), "recordsPerBlock", 0);
        setIntField(term85129, term85129.getClass(), "recordSize", 0);
        setBooleanField(term85129, term85129.getClass(), "closed", false);
        setBooleanField(term85129, term85129.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term85129, term85129.getClass(), "finished", false);
        setLongField(term85130, term85130.getClass(), "bytesWritten", 0L);
        setField(term85130, term85130.getClass(), "out", null);
        setBooleanField(term85130, term85130.getClass(), "closed", false);
        setField(term85130, term85130.getClass(), "closeLock", null);
        setField(term85129, term85129.getClass(), "out", term85130);
        setField(term85129, term85129.getClass(), "zipEncoding", null);
        setBooleanField(term85129, term85129.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term85129, term85129.getClass(), "oneByte", null);
        setLongField(term85129, term85129.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBytesWritten", argTypes, term84992, args);
        assertTrue(recursiveEquals(term84992, term85129));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


