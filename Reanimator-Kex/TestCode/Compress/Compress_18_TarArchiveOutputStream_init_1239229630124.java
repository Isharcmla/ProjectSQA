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

public class TarArchiveOutputStream_init_1239229630124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268639;

    public TarArchiveOutputStream_init_1239229630124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term267386 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term267211 = (byte[]) newByteArray(0);
        setField(term267386, term267386.getClass(), "oneByte", term267211);
        setLongField(term267386, term267386.getClass(), "bytesWritten", 0L);
        setIntField(term267386, term267386.getClass(), "longFileMode", 0);
        setIntField(term267386, term267386.getClass(), "bigNumberMode", 0);
        setBooleanField(term267386, term267386.getClass(), "closed", false);
        setBooleanField(term267386, term267386.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term267386, term267386.getClass(), "finished", false);
        setBooleanField(term267386, term267386.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term267386, term267386.getClass(), "out", null);
        term268639 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term268640 = (byte[]) newByteArray(512);
        byte[] term268641 = (byte[]) newByteArray(512);
        Object term268642 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term268643 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term268644 = newInstance(Class.forName("java.lang.Object"));
        byte[] term268645 = (byte[]) newByteArray(0);
        Object term268646 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term268649 = (byte[]) newByteArray(1);
        setLongField(term268639, term268639.getClass(), "currSize", 0L);
        setField(term268639, term268639.getClass(), "currName", null);
        setLongField(term268639, term268639.getClass(), "currBytes", 0L);
        setField(term268639, term268639.getClass(), "recordBuf", term268640);
        setIntField(term268639, term268639.getClass(), "assemLen", 0);
        setField(term268639, term268639.getClass(), "assemBuf", term268641);
        setField(term268642, term268642.getClass(), "inStream", null);
        setLongField(term268643, term268643.getClass(), "bytesWritten", 0L);
        setField(term268643, term268643.getClass(), "out", null);
        setBooleanField(term268643, term268643.getClass(), "closed", false);
        setField(term268643, term268643.getClass(), "closeLock", term268644);
        setField(term268642, term268642.getClass(), "outStream", term268643);
        setIntField(term268642, term268642.getClass(), "blockSize", 0);
        setIntField(term268642, term268642.getClass(), "recordSize", 512);
        setIntField(term268642, term268642.getClass(), "recsPerBlock", 0);
        setField(term268642, term268642.getClass(), "blockBuffer", term268645);
        setIntField(term268642, term268642.getClass(), "currBlkIdx", 0);
        setIntField(term268642, term268642.getClass(), "currRecIdx", 0);
        setField(term268639, term268639.getClass(), "buffer", term268642);
        setIntField(term268639, term268639.getClass(), "longFileMode", 0);
        setIntField(term268639, term268639.getClass(), "bigNumberMode", 0);
        setBooleanField(term268639, term268639.getClass(), "closed", false);
        setBooleanField(term268639, term268639.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term268639, term268639.getClass(), "finished", false);
        setField(term268639, term268639.getClass(), "out", term268643);
        setField(term268646, term268646.getClass(), "charset", "UTF8");
        setField(term268639, term268639.getClass(), "encoding", term268646);
        setBooleanField(term268639, term268639.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term268639, term268639.getClass(), "oneByte", term268649);
        setLongField(term268639, term268639.getClass(), "bytesWritten", 0L);
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
        assertTrue(recursiveEquals(instance, term268639));
    }

};


