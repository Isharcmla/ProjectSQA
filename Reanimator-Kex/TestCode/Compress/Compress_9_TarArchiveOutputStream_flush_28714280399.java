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

public class TarArchiveOutputStream_flush_28714280399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94909;
     Object term96182;

    public TarArchiveOutputStream_flush_28714280399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94909 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term95069 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream"));
        setField(term94909, term94909.getClass(), "out", term95069);
        term96182 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term96183 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream"));
        setLongField(term96182, term96182.getClass(), "currSize", 0L);
        setField(term96182, term96182.getClass(), "currName", null);
        setLongField(term96182, term96182.getClass(), "currBytes", 0L);
        setField(term96182, term96182.getClass(), "recordBuf", null);
        setIntField(term96182, term96182.getClass(), "assemLen", 0);
        setField(term96182, term96182.getClass(), "assemBuf", null);
        setField(term96182, term96182.getClass(), "buffer", null);
        setIntField(term96182, term96182.getClass(), "longFileMode", 0);
        setBooleanField(term96182, term96182.getClass(), "closed", false);
        setBooleanField(term96182, term96182.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term96182, term96182.getClass(), "finished", false);
        setBooleanField(term96183, term96183.getClass(), "finished", false);
        setField(term96183, term96183.getClass(), "originalOutput", null);
        setField(term96183, term96183.getClass(), "streamBridge", null);
        setField(term96183, term96183.getClass(), "properties", null);
        setField(term96182, term96182.getClass(), "out", term96183);
        setField(term96182, term96182.getClass(), "oneByte", null);
        setLongField(term96182, term96182.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term94909, args);
        assertTrue(recursiveEquals(term94909, term96182));
    }

};


