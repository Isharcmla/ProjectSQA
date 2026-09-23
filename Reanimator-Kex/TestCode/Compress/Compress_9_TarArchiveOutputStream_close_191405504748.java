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

public class TarArchiveOutputStream_close_191405504748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82470;
     Object term82991;

    public TarArchiveOutputStream_close_191405504748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82470 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term82470, term82470.getClass(), "finished", true);
        setBooleanField(term82470, term82470.getClass(), "closed", true);
        term82991 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term82991, term82991.getClass(), "currSize", 0L);
        setField(term82991, term82991.getClass(), "currName", null);
        setLongField(term82991, term82991.getClass(), "currBytes", 0L);
        setField(term82991, term82991.getClass(), "recordBuf", null);
        setIntField(term82991, term82991.getClass(), "assemLen", 0);
        setField(term82991, term82991.getClass(), "assemBuf", null);
        setField(term82991, term82991.getClass(), "buffer", null);
        setIntField(term82991, term82991.getClass(), "longFileMode", 0);
        setBooleanField(term82991, term82991.getClass(), "closed", true);
        setBooleanField(term82991, term82991.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term82991, term82991.getClass(), "finished", true);
        setField(term82991, term82991.getClass(), "out", null);
        setField(term82991, term82991.getClass(), "oneByte", null);
        setLongField(term82991, term82991.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term82470, args);
        assertTrue(recursiveEquals(term82470, term82991));
    }

};


