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

public class TarArchiveOutputStream_write_164325068040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83104;
     Object term83774;

    public TarArchiveOutputStream_write_164325068040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83104 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term83104, term83104.getClass(), "currBytes", -1L);
        setLongField(term83104, term83104.getClass(), "currSize", 0L);
        term83774 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term83774, term83774.getClass(), "currSize", 0L);
        setField(term83774, term83774.getClass(), "currName", null);
        setLongField(term83774, term83774.getClass(), "currBytes", -1L);
        setField(term83774, term83774.getClass(), "recordBuf", null);
        setIntField(term83774, term83774.getClass(), "assemLen", 0);
        setField(term83774, term83774.getClass(), "assemBuf", null);
        setField(term83774, term83774.getClass(), "buffer", null);
        setIntField(term83774, term83774.getClass(), "longFileMode", 0);
        setBooleanField(term83774, term83774.getClass(), "closed", false);
        setBooleanField(term83774, term83774.getClass(), "haveUnclosedEntry", false);
        setField(term83774, term83774.getClass(), "out", null);
        setField(term83774, term83774.getClass(), "oneByte", null);
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
        callMethod(klass, "write", argTypes, term83104, args);
        assertTrue(recursiveEquals(term83104, term83774));
    }

};


