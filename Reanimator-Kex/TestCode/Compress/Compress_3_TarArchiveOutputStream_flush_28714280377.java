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

public class TarArchiveOutputStream_flush_28714280377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92842;
     Object term93184;

    public TarArchiveOutputStream_flush_28714280377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92842 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term92898 = newInstance(Class.forName("java.io.PipedOutputStream"));
        setField(term92842, term92842.getClass(), "out", term92898);
        term93184 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term93185 = newInstance(Class.forName("java.io.PipedOutputStream"));
        setLongField(term93184, term93184.getClass(), "currSize", 0L);
        setField(term93184, term93184.getClass(), "currName", null);
        setLongField(term93184, term93184.getClass(), "currBytes", 0L);
        setField(term93184, term93184.getClass(), "recordBuf", null);
        setIntField(term93184, term93184.getClass(), "assemLen", 0);
        setField(term93184, term93184.getClass(), "assemBuf", null);
        setField(term93184, term93184.getClass(), "buffer", null);
        setIntField(term93184, term93184.getClass(), "longFileMode", 0);
        setBooleanField(term93184, term93184.getClass(), "closed", false);
        setField(term93185, term93185.getClass(), "sink", null);
        setField(term93184, term93184.getClass(), "out", term93185);
        setField(term93184, term93184.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term92842, args);
        assertTrue(recursiveEquals(term92842, term93184));
    }

};


