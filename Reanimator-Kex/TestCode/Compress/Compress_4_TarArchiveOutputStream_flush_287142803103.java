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

public class TarArchiveOutputStream_flush_287142803103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100245;
     Object term100797;

    public TarArchiveOutputStream_flush_287142803103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100245 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term100379 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term100435 = newInstance(Class.forName("java.io.PipedOutputStream"));
        setField(term100379, term100379.getClass(), "out", term100435);
        setField(term100245, term100245.getClass(), "out", term100379);
        term100797 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term100798 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term100799 = newInstance(Class.forName("java.io.PipedOutputStream"));
        setLongField(term100797, term100797.getClass(), "currSize", 0L);
        setField(term100797, term100797.getClass(), "currName", null);
        setLongField(term100797, term100797.getClass(), "currBytes", 0L);
        setField(term100797, term100797.getClass(), "recordBuf", null);
        setIntField(term100797, term100797.getClass(), "assemLen", 0);
        setField(term100797, term100797.getClass(), "assemBuf", null);
        setField(term100797, term100797.getClass(), "buffer", null);
        setIntField(term100797, term100797.getClass(), "longFileMode", 0);
        setBooleanField(term100797, term100797.getClass(), "closed", false);
        setBooleanField(term100797, term100797.getClass(), "haveUnclosedEntry", false);
        setLongField(term100798, term100798.getClass(), "currSize", 0L);
        setField(term100798, term100798.getClass(), "currName", null);
        setLongField(term100798, term100798.getClass(), "currBytes", 0L);
        setField(term100798, term100798.getClass(), "recordBuf", null);
        setIntField(term100798, term100798.getClass(), "assemLen", 0);
        setField(term100798, term100798.getClass(), "assemBuf", null);
        setField(term100798, term100798.getClass(), "buffer", null);
        setIntField(term100798, term100798.getClass(), "longFileMode", 0);
        setBooleanField(term100798, term100798.getClass(), "closed", false);
        setBooleanField(term100798, term100798.getClass(), "haveUnclosedEntry", false);
        setField(term100799, term100799.getClass(), "sink", null);
        setField(term100798, term100798.getClass(), "out", term100799);
        setField(term100798, term100798.getClass(), "oneByte", null);
        setField(term100797, term100797.getClass(), "out", term100798);
        setField(term100797, term100797.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term100245, args);
        assertTrue(recursiveEquals(term100245, term100797));
    }

};


