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

public class TarArchiveOutputStream_close_1914055047215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216262;

    public TarArchiveOutputStream_close_1914055047215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216262 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term204161 = (byte[]) newByteArray(0);
        Object term216370 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term216522 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        byte[] term204167 = (byte[]) newByteArray(489);
        setBooleanField(term216262, term216262.getClass(), "closed", false);
        setField(term216262, term216262.getClass(), "recordBuf", term204161);
        setField(term216370, term216370.getClass(), "outStream", term216522);
        setIntField(term216370, term216370.getClass(), "recordSize", 0);
        setIntField(term216370, term216370.getClass(), "currRecIdx", 1073741824);
        setIntField(term216370, term216370.getClass(), "recsPerBlock", 2);
        setField(term216370, term216370.getClass(), "blockBuffer", term204167);
        setIntField(term216370, term216370.getClass(), "blockSize", 1064961);
        setField(term216262, term216262.getClass(), "buffer", term216370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term216262, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


