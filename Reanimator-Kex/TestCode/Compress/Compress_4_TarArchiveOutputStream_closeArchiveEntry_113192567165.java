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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_closeArchiveEntry_113192567165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126255;

    public TarArchiveOutputStream_closeArchiveEntry_113192567165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126255 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term126065 = (byte[]) newByteArray(0);
        Object term126363 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term126515 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setIntField(term126255, term126255.getClass(), "assemLen", 1022);
        setField(term126255, term126255.getClass(), "assemBuf", term126065);
        setField(term126363, term126363.getClass(), "outStream", term126515);
        setIntField(term126363, term126363.getClass(), "recordSize", 0);
        setIntField(term126363, term126363.getClass(), "currRecIdx", -2147483648);
        setIntField(term126363, term126363.getClass(), "recsPerBlock", -2147483648);
        setField(term126363, term126363.getClass(), "blockBuffer", null);
        setIntField(term126363, term126363.getClass(), "blockSize", 1);
        setField(term126255, term126255.getClass(), "buffer", term126363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term126255, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


