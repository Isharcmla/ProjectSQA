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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_writeEOFRecord_1063538339197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135537;

    public TarArchiveOutputStream_writeEOFRecord_1063538339197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135537 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term135349 = (byte[]) newByteArray(0);
        Object term135645 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term135793 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream"));
        setField(term135537, term135537.getClass(), "recordBuf", term135349);
        setField(term135645, term135645.getClass(), "outStream", term135793);
        setIntField(term135645, term135645.getClass(), "recordSize", 0);
        setIntField(term135645, term135645.getClass(), "currRecIdx", -2147483648);
        setIntField(term135645, term135645.getClass(), "recsPerBlock", -2147483648);
        setField(term135645, term135645.getClass(), "blockBuffer", term135349);
        setIntField(term135645, term135645.getClass(), "blockSize", 1);
        setField(term135537, term135537.getClass(), "buffer", term135645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeEOFRecord", argTypes, term135537, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


