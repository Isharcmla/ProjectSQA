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

public class TarArchiveOutputStream_init_1332473446166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304204;

    public TarArchiveOutputStream_init_1332473446166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term282705 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term282534 = (byte[]) newByteArray(0);
        setField(term282705, term282705.getClass(), "oneByte", term282534);
        setLongField(term282705, term282705.getClass(), "bytesWritten", 0L);
        setIntField(term282705, term282705.getClass(), "longFileMode", 0);
        setIntField(term282705, term282705.getClass(), "bigNumberMode", 0);
        setBooleanField(term282705, term282705.getClass(), "closed", false);
        setBooleanField(term282705, term282705.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term282705, term282705.getClass(), "finished", false);
        setBooleanField(term282705, term282705.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term282705, term282705.getClass(), "out", null);
        term304204 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term304205 = (byte[]) newByteArray(512);
        byte[] term304206 = (byte[]) newByteArray(512);
        Object term304207 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term304208 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term304209 = newInstance(Class.forName("java.lang.Object"));
        byte[] term304210 = (byte[]) newByteArray(10240);
        Object term304211 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term304214 = (byte[]) newByteArray(1);
        setLongField(term304204, term304204.getClass(), "currSize", 0L);
        setField(term304204, term304204.getClass(), "currName", null);
        setLongField(term304204, term304204.getClass(), "currBytes", 0L);
        setField(term304204, term304204.getClass(), "recordBuf", term304205);
        setIntField(term304204, term304204.getClass(), "assemLen", 0);
        setField(term304204, term304204.getClass(), "assemBuf", term304206);
        setField(term304207, term304207.getClass(), "inStream", null);
        setLongField(term304208, term304208.getClass(), "bytesWritten", 0L);
        setField(term304208, term304208.getClass(), "out", null);
        setBooleanField(term304208, term304208.getClass(), "closed", false);
        setField(term304208, term304208.getClass(), "closeLock", term304209);
        setField(term304207, term304207.getClass(), "outStream", term304208);
        setIntField(term304207, term304207.getClass(), "blockSize", 10240);
        setIntField(term304207, term304207.getClass(), "recordSize", 512);
        setIntField(term304207, term304207.getClass(), "recsPerBlock", 20);
        setField(term304207, term304207.getClass(), "blockBuffer", term304210);
        setIntField(term304207, term304207.getClass(), "currBlkIdx", 0);
        setIntField(term304207, term304207.getClass(), "currRecIdx", 0);
        setField(term304204, term304204.getClass(), "buffer", term304207);
        setIntField(term304204, term304204.getClass(), "longFileMode", 0);
        setIntField(term304204, term304204.getClass(), "bigNumberMode", 0);
        setBooleanField(term304204, term304204.getClass(), "closed", false);
        setBooleanField(term304204, term304204.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term304204, term304204.getClass(), "finished", false);
        setField(term304204, term304204.getClass(), "out", term304208);
        setField(term304211, term304211.getClass(), "charset", "UTF8");
        setField(term304204, term304204.getClass(), "encoding", term304211);
        setBooleanField(term304204, term304204.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term304204, term304204.getClass(), "oneByte", term304214);
        setLongField(term304204, term304204.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term304204));
    }

};


