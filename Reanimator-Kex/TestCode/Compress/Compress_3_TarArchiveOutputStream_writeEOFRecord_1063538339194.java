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

public class TarArchiveOutputStream_writeEOFRecord_1063538339194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134280;

    public TarArchiveOutputStream_writeEOFRecord_1063538339194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134280 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term134065 = (byte[]) newByteArray(2);
        Object term134388 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term134540 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        byte[] term134085 = (byte[]) newByteArray(2);
        setField(term134280, term134280.getClass(), "recordBuf", term134065);
        setField(term134388, term134388.getClass(), "outStream", term134540);
        setIntField(term134388, term134388.getClass(), "recordSize", 2);
        setIntField(term134388, term134388.getClass(), "currRecIdx", -2147483648);
        setIntField(term134388, term134388.getClass(), "recsPerBlock", -2147483648);
        setField(term134388, term134388.getClass(), "blockBuffer", term134085);
        setIntField(term134388, term134388.getClass(), "blockSize", 0);
        setField(term134280, term134280.getClass(), "buffer", term134388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeEOFRecord", argTypes, term134280, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


