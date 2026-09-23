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

public class TarArchiveOutputStream_padAsNeeded_2075728055153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88410;
     Object term88426;

    public TarArchiveOutputStream_padAsNeeded_2075728055153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88410 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setIntField(term88410, term88410.getClass(), "recordsWritten", -2013867114);
        setIntField(term88410, term88410.getClass(), "recordsPerBlock", -671289038);
        term88426 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term88426, term88426.getClass(), "currSize", 0L);
        setField(term88426, term88426.getClass(), "currName", null);
        setLongField(term88426, term88426.getClass(), "currBytes", 0L);
        setField(term88426, term88426.getClass(), "recordBuf", null);
        setIntField(term88426, term88426.getClass(), "assemLen", 0);
        setField(term88426, term88426.getClass(), "assemBuf", null);
        setIntField(term88426, term88426.getClass(), "longFileMode", 0);
        setIntField(term88426, term88426.getClass(), "bigNumberMode", 0);
        setIntField(term88426, term88426.getClass(), "recordsWritten", -2013867114);
        setIntField(term88426, term88426.getClass(), "recordsPerBlock", -671289038);
        setIntField(term88426, term88426.getClass(), "recordSize", 0);
        setBooleanField(term88426, term88426.getClass(), "closed", false);
        setBooleanField(term88426, term88426.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term88426, term88426.getClass(), "finished", false);
        setField(term88426, term88426.getClass(), "out", null);
        setField(term88426, term88426.getClass(), "zipEncoding", null);
        setBooleanField(term88426, term88426.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term88426, term88426.getClass(), "oneByte", null);
        setLongField(term88426, term88426.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "padAsNeeded", argTypes, term88410, args);
        assertTrue(recursiveEquals(term88410, term88426));
    }

};


