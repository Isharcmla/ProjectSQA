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

public class TarArchiveOutputStream_close_1914055047114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261751;
     Object term262178;

    public TarArchiveOutputStream_close_1914055047114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261751 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term261751, term261751.getClass(), "finished", true);
        setBooleanField(term261751, term261751.getClass(), "closed", true);
        term262178 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term262178, term262178.getClass(), "currSize", 0L);
        setField(term262178, term262178.getClass(), "currName", null);
        setLongField(term262178, term262178.getClass(), "currBytes", 0L);
        setField(term262178, term262178.getClass(), "recordBuf", null);
        setIntField(term262178, term262178.getClass(), "assemLen", 0);
        setField(term262178, term262178.getClass(), "assemBuf", null);
        setField(term262178, term262178.getClass(), "buffer", null);
        setIntField(term262178, term262178.getClass(), "longFileMode", 0);
        setIntField(term262178, term262178.getClass(), "bigNumberMode", 0);
        setBooleanField(term262178, term262178.getClass(), "closed", true);
        setBooleanField(term262178, term262178.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term262178, term262178.getClass(), "finished", true);
        setField(term262178, term262178.getClass(), "out", null);
        setField(term262178, term262178.getClass(), "encoding", null);
        setBooleanField(term262178, term262178.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term262178, term262178.getClass(), "oneByte", null);
        setLongField(term262178, term262178.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term261751, args);
        assertTrue(recursiveEquals(term261751, term262178));
    }

};


