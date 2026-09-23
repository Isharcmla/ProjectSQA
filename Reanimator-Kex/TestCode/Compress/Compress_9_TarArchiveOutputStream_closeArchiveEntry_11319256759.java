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

public class TarArchiveOutputStream_closeArchiveEntry_11319256759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85007;
     Object term85341;

    public TarArchiveOutputStream_closeArchiveEntry_11319256759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85007 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term85007, term85007.getClass(), "finished", false);
        setBooleanField(term85007, term85007.getClass(), "haveUnclosedEntry", true);
        term85341 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term85341, term85341.getClass(), "currSize", 0L);
        setField(term85341, term85341.getClass(), "currName", null);
        setLongField(term85341, term85341.getClass(), "currBytes", 0L);
        setField(term85341, term85341.getClass(), "recordBuf", null);
        setIntField(term85341, term85341.getClass(), "assemLen", 0);
        setField(term85341, term85341.getClass(), "assemBuf", null);
        setField(term85341, term85341.getClass(), "buffer", null);
        setIntField(term85341, term85341.getClass(), "longFileMode", 0);
        setBooleanField(term85341, term85341.getClass(), "closed", false);
        setBooleanField(term85341, term85341.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term85341, term85341.getClass(), "finished", false);
        setField(term85341, term85341.getClass(), "out", null);
        setField(term85341, term85341.getClass(), "oneByte", null);
        setLongField(term85341, term85341.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term85007, args);
        assertTrue(recursiveEquals(term85007, term85341));
    }

};


