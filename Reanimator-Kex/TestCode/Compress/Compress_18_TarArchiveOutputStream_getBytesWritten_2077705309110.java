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

public class TarArchiveOutputStream_getBytesWritten_2077705309110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260951;
     Object term261343;

    public TarArchiveOutputStream_getBytesWritten_2077705309110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260951 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term261065 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        setField(term260951, term260951.getClass(), "out", term261065);
        term261343 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term261344 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        setLongField(term261343, term261343.getClass(), "currSize", 0L);
        setField(term261343, term261343.getClass(), "currName", null);
        setLongField(term261343, term261343.getClass(), "currBytes", 0L);
        setField(term261343, term261343.getClass(), "recordBuf", null);
        setIntField(term261343, term261343.getClass(), "assemLen", 0);
        setField(term261343, term261343.getClass(), "assemBuf", null);
        setField(term261343, term261343.getClass(), "buffer", null);
        setIntField(term261343, term261343.getClass(), "longFileMode", 0);
        setIntField(term261343, term261343.getClass(), "bigNumberMode", 0);
        setBooleanField(term261343, term261343.getClass(), "closed", false);
        setBooleanField(term261343, term261343.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term261343, term261343.getClass(), "finished", false);
        setLongField(term261344, term261344.getClass(), "bytesWritten", 0L);
        setField(term261344, term261344.getClass(), "out", null);
        setBooleanField(term261344, term261344.getClass(), "closed", false);
        setField(term261344, term261344.getClass(), "closeLock", null);
        setField(term261343, term261343.getClass(), "out", term261344);
        setField(term261343, term261343.getClass(), "encoding", null);
        setBooleanField(term261343, term261343.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term261343, term261343.getClass(), "oneByte", null);
        setLongField(term261343, term261343.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBytesWritten", argTypes, term260951, args);
        assertTrue(recursiveEquals(term260951, term261343));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


