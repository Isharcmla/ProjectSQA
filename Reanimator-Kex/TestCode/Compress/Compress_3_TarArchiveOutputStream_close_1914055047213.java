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

public class TarArchiveOutputStream_close_1914055047213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203126;

    public TarArchiveOutputStream_close_1914055047213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203126 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term201346 = (byte[]) newByteArray(0);
        Object term203234 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term203382 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream"));
        byte[] term201352 = (byte[]) newByteArray(0);
        setBooleanField(term203126, term203126.getClass(), "closed", false);
        setField(term203126, term203126.getClass(), "recordBuf", term201346);
        setField(term203234, term203234.getClass(), "outStream", term203382);
        setIntField(term203234, term203234.getClass(), "recordSize", 0);
        setIntField(term203234, term203234.getClass(), "currRecIdx", 1739559191);
        setIntField(term203234, term203234.getClass(), "recsPerBlock", -961402620);
        setField(term203234, term203234.getClass(), "blockBuffer", term201352);
        setIntField(term203234, term203234.getClass(), "blockSize", 1524620287);
        setField(term203126, term203126.getClass(), "buffer", term203234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term203126, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


