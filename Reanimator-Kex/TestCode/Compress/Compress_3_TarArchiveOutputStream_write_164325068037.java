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

public class TarArchiveOutputStream_write_164325068037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82506;
     Object term83024;

    public TarArchiveOutputStream_write_164325068037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82506 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term82506, term82506.getClass(), "currBytes", -1L);
        setLongField(term82506, term82506.getClass(), "currSize", 0L);
        term83024 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term83024, term83024.getClass(), "currSize", 0L);
        setField(term83024, term83024.getClass(), "currName", null);
        setLongField(term83024, term83024.getClass(), "currBytes", -1L);
        setField(term83024, term83024.getClass(), "recordBuf", null);
        setIntField(term83024, term83024.getClass(), "assemLen", 0);
        setField(term83024, term83024.getClass(), "assemBuf", null);
        setField(term83024, term83024.getClass(), "buffer", null);
        setIntField(term83024, term83024.getClass(), "longFileMode", 0);
        setBooleanField(term83024, term83024.getClass(), "closed", false);
        setField(term83024, term83024.getClass(), "out", null);
        setField(term83024, term83024.getClass(), "oneByte", null);
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
        callMethod(klass, "write", argTypes, term82506, args);
        assertTrue(recursiveEquals(term82506, term83024));
    }

};


