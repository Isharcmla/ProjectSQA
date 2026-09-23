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
import java.io.IOException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_close_1914055047211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198990;

    public TarArchiveOutputStream_close_1914055047211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198990 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term191097 = (byte[]) newByteArray(225);
        Object term199098 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term199246 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream"));
        byte[] term191571 = (byte[]) newByteArray(116);
        setBooleanField(term198990, term198990.getClass(), "closed", false);
        setField(term198990, term198990.getClass(), "recordBuf", term191097);
        setField(term199098, term199098.getClass(), "outStream", term199246);
        setIntField(term199098, term199098.getClass(), "recordSize", -2147483151);
        setIntField(term199098, term199098.getClass(), "currRecIdx", 0);
        setIntField(term199098, term199098.getClass(), "recsPerBlock", -2147483646);
        setField(term199098, term199098.getClass(), "blockBuffer", term191571);
        setIntField(term199098, term199098.getClass(), "blockSize", 1073742081);
        setField(term198990, term198990.getClass(), "buffer", term199098);
        setLongField(term198990, term198990.getClass(), "currBytes", 74723713L);
        setLongField(term198990, term198990.getClass(), "currSize", 4611686018550674561L);
        setIntField(term198990, term198990.getClass(), "assemLen", -1073741824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term198990, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


