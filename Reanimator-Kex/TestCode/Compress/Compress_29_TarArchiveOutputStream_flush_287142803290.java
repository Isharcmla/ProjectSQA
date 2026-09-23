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

public class TarArchiveOutputStream_flush_287142803290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163960;
     Object term168069;

    public TarArchiveOutputStream_flush_287142803290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163960 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term164090 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        setField(term163960, term163960.getClass(), "out", term164090);
        term168069 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term168070 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        setLongField(term168069, term168069.getClass(), "currSize", 0L);
        setField(term168069, term168069.getClass(), "currName", null);
        setLongField(term168069, term168069.getClass(), "currBytes", 0L);
        setField(term168069, term168069.getClass(), "recordBuf", null);
        setIntField(term168069, term168069.getClass(), "assemLen", 0);
        setField(term168069, term168069.getClass(), "assemBuf", null);
        setIntField(term168069, term168069.getClass(), "longFileMode", 0);
        setIntField(term168069, term168069.getClass(), "bigNumberMode", 0);
        setIntField(term168069, term168069.getClass(), "recordsWritten", 0);
        setIntField(term168069, term168069.getClass(), "recordsPerBlock", 0);
        setIntField(term168069, term168069.getClass(), "recordSize", 0);
        setBooleanField(term168069, term168069.getClass(), "closed", false);
        setBooleanField(term168069, term168069.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term168069, term168069.getClass(), "finished", false);
        setField(term168070, term168070.getClass(), "out", null);
        setLongField(term168070, term168070.getClass(), "entryOffset", 0L);
        setField(term168070, term168070.getClass(), "prevEntry", null);
        setBooleanField(term168070, term168070.getClass(), "haveUnclosedEntry", false);
        setIntField(term168070, term168070.getClass(), "longFileMode", 0);
        setBooleanField(term168070, term168070.getClass(), "finished", false);
        setField(term168070, term168070.getClass(), "oneByte", null);
        setLongField(term168070, term168070.getClass(), "bytesWritten", 0L);
        setField(term168069, term168069.getClass(), "out", term168070);
        setField(term168069, term168069.getClass(), "zipEncoding", null);
        setBooleanField(term168069, term168069.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term168069, term168069.getClass(), "oneByte", null);
        setLongField(term168069, term168069.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term163960, args);
        assertTrue(recursiveEquals(term163960, term168069));
    }

};


