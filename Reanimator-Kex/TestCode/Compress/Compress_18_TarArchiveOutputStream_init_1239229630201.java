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

public class TarArchiveOutputStream_init_1239229630201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359117;

    public TarArchiveOutputStream_init_1239229630201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term319828 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term319657 = (byte[]) newByteArray(0);
        setField(term319828, term319828.getClass(), "oneByte", term319657);
        setLongField(term319828, term319828.getClass(), "bytesWritten", 0L);
        setIntField(term319828, term319828.getClass(), "longFileMode", 0);
        setIntField(term319828, term319828.getClass(), "bigNumberMode", 0);
        setBooleanField(term319828, term319828.getClass(), "closed", false);
        setBooleanField(term319828, term319828.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term319828, term319828.getClass(), "finished", false);
        setBooleanField(term319828, term319828.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term319828, term319828.getClass(), "out", null);
        term359117 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term359118 = (byte[]) newByteArray(512);
        byte[] term359119 = (byte[]) newByteArray(512);
        Object term359120 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term359121 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term359122 = newInstance(Class.forName("java.lang.Object"));
        byte[] term359123 = (byte[]) newByteArray(0);
        Object term359124 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term359127 = (byte[]) newByteArray(1);
        setLongField(term359117, term359117.getClass(), "currSize", 0L);
        setField(term359117, term359117.getClass(), "currName", null);
        setLongField(term359117, term359117.getClass(), "currBytes", 0L);
        setField(term359117, term359117.getClass(), "recordBuf", term359118);
        setIntField(term359117, term359117.getClass(), "assemLen", 0);
        setField(term359117, term359117.getClass(), "assemBuf", term359119);
        setField(term359120, term359120.getClass(), "inStream", null);
        setLongField(term359121, term359121.getClass(), "bytesWritten", 0L);
        setField(term359121, term359121.getClass(), "out", null);
        setBooleanField(term359121, term359121.getClass(), "closed", false);
        setField(term359121, term359121.getClass(), "closeLock", term359122);
        setField(term359120, term359120.getClass(), "outStream", term359121);
        setIntField(term359120, term359120.getClass(), "blockSize", 0);
        setIntField(term359120, term359120.getClass(), "recordSize", 512);
        setIntField(term359120, term359120.getClass(), "recsPerBlock", 0);
        setField(term359120, term359120.getClass(), "blockBuffer", term359123);
        setIntField(term359120, term359120.getClass(), "currBlkIdx", 0);
        setIntField(term359120, term359120.getClass(), "currRecIdx", 0);
        setField(term359117, term359117.getClass(), "buffer", term359120);
        setIntField(term359117, term359117.getClass(), "longFileMode", 0);
        setIntField(term359117, term359117.getClass(), "bigNumberMode", 0);
        setBooleanField(term359117, term359117.getClass(), "closed", false);
        setBooleanField(term359117, term359117.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term359117, term359117.getClass(), "finished", false);
        setField(term359117, term359117.getClass(), "out", term359121);
        setField(term359124, term359124.getClass(), "charset", "UTF8");
        setField(term359117, term359117.getClass(), "encoding", term359124);
        setBooleanField(term359117, term359117.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term359117, term359117.getClass(), "oneByte", term359127);
        setLongField(term359117, term359117.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term359117));
    }

};


