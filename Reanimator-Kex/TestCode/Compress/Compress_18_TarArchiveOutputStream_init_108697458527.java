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

public class TarArchiveOutputStream_init_108697458527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56059;

    public TarArchiveOutputStream_init_108697458527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56059 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term56060 = (byte[]) newByteArray(512);
        byte[] term56061 = (byte[]) newByteArray(512);
        Object term56062 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term56063 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term56064 = newInstance(Class.forName("java.lang.Object"));
        byte[] term56065 = (byte[]) newByteArray(10240);
        Object term56066 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term56069 = (byte[]) newByteArray(1);
        setLongField(term56059, term56059.getClass(), "currSize", 0L);
        setField(term56059, term56059.getClass(), "currName", null);
        setLongField(term56059, term56059.getClass(), "currBytes", 0L);
        setField(term56059, term56059.getClass(), "recordBuf", term56060);
        setIntField(term56059, term56059.getClass(), "assemLen", 0);
        setField(term56059, term56059.getClass(), "assemBuf", term56061);
        setField(term56062, term56062.getClass(), "inStream", null);
        setLongField(term56063, term56063.getClass(), "bytesWritten", 0L);
        setField(term56063, term56063.getClass(), "out", null);
        setBooleanField(term56063, term56063.getClass(), "closed", false);
        setField(term56063, term56063.getClass(), "closeLock", term56064);
        setField(term56062, term56062.getClass(), "outStream", term56063);
        setIntField(term56062, term56062.getClass(), "blockSize", 10240);
        setIntField(term56062, term56062.getClass(), "recordSize", 512);
        setIntField(term56062, term56062.getClass(), "recsPerBlock", 20);
        setField(term56062, term56062.getClass(), "blockBuffer", term56065);
        setIntField(term56062, term56062.getClass(), "currBlkIdx", 0);
        setIntField(term56062, term56062.getClass(), "currRecIdx", 0);
        setField(term56059, term56059.getClass(), "buffer", term56062);
        setIntField(term56059, term56059.getClass(), "longFileMode", 0);
        setIntField(term56059, term56059.getClass(), "bigNumberMode", 0);
        setBooleanField(term56059, term56059.getClass(), "closed", false);
        setBooleanField(term56059, term56059.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term56059, term56059.getClass(), "finished", false);
        setField(term56059, term56059.getClass(), "out", term56063);
        setField(term56066, term56066.getClass(), "charset", "PAEBtnZtTD");
        setField(term56059, term56059.getClass(), "encoding", term56066);
        setBooleanField(term56059, term56059.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term56059, term56059.getClass(), "oneByte", term56069);
        setLongField(term56059, term56059.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term56059));
    }

};


