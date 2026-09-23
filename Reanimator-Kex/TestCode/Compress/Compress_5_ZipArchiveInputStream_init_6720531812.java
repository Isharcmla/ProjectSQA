package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.lang.Object;

public class ZipArchiveInputStream_init_6720531812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6919;

    public ZipArchiveInputStream_init_6720531812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6919 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term6920 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term6923 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term6924 = (byte[]) newByteArray(512);
        Object term6925 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term6926 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term6927 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term6928 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term6929 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term6930 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term6931 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6932 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term6933 = (byte[]) newByteArray(0);
        Object term6934 = newInstance(Class.forName("java.util.zip.CRC32"));
        byte[] term6935 = (byte[]) newByteArray(512);
        byte[] term6936 = (byte[]) newByteArray(1);
        setField(term6920, term6920.getClass(), "charset", "UTF8");
        setField(term6919, term6919.getClass(), "zipEncoding", term6920);
        setBooleanField(term6919, term6919.getClass(), "useUnicodeExtraFields", true);
        setField(term6923, term6923.getClass(), "buf", term6924);
        setIntField(term6923, term6923.getClass(), "pos", 512);
        setField(term6923, term6923.getClass(), "in", null);
        setField(term6919, term6919.getClass(), "in", term6923);
        setLongField(term6926, term6926.getClass(), "address", 137029661504096L);
        setField(term6927, term6927.getClass(), "action", term6926);
        setField(term6928, term6928.getClass(), "action", null);
        setField(term6928, term6928.getClass(), "prev", null);
        setField(term6928, term6928.getClass(), "next", term6927);
        setField(term6928, term6928.getClass(), "list", null);
        setField(term6928, term6928.getClass(), "referent", null);
        setField(term6928, term6928.getClass(), "queue", null);
        setField(term6928, term6928.getClass(), "next", null);
        setField(term6928, term6928.getClass(), "discovered", null);
        setField(term6927, term6927.getClass(), "prev", term6928);
        setField(term6929, term6929.getClass(), "action", null);
        setField(term6929, term6929.getClass(), "prev", term6927);
        setField(term6929, term6929.getClass(), "next", null);
        setField(term6929, term6929.getClass(), "list", null);
        setField(term6929, term6929.getClass(), "referent", null);
        setField(term6929, term6929.getClass(), "queue", null);
        setField(term6929, term6929.getClass(), "next", null);
        setField(term6929, term6929.getClass(), "discovered", null);
        setField(term6927, term6927.getClass(), "next", term6929);
        setField(term6930, term6930.getClass(), "action", null);
        setField(term6930, term6930.getClass(), "prev", null);
        setField(term6930, term6930.getClass(), "next", null);
        setField(term6930, term6930.getClass(), "list", term6930);
        setField(term6930, term6930.getClass(), "referent", null);
        setField(term6930, term6930.getClass(), "queue", null);
        setField(term6930, term6930.getClass(), "next", null);
        setField(term6930, term6930.getClass(), "discovered", null);
        setField(term6927, term6927.getClass(), "list", term6930);
        setField(term6927, term6927.getClass(), "referent", term6925);
        setField(term6931, term6931.getClass(), "lock", null);
        setField(term6931, term6931.getClass(), "head", null);
        setLongField(term6931, term6931.getClass(), "queueLength", 0L);
        setField(term6927, term6927.getClass(), "queue", term6931);
        setField(term6927, term6927.getClass(), "next", null);
        setField(term6927, term6927.getClass(), "discovered", null);
        setField(term6926, term6926.getClass(), "cleanable", term6927);
        setField(term6925, term6925.getClass(), "zsRef", term6926);
        setField(term6932, term6932.getClass(), "hb", term6933);
        setIntField(term6932, term6932.getClass(), "offset", 0);
        setBooleanField(term6932, term6932.getClass(), "isReadOnly", false);
        setBooleanField(term6932, term6932.getClass(), "bigEndian", true);
        setBooleanField(term6932, term6932.getClass(), "nativeByteOrder", false);
        setIntField(term6932, term6932.getClass(), "mark", -1);
        setIntField(term6932, term6932.getClass(), "position", 0);
        setIntField(term6932, term6932.getClass(), "limit", 0);
        setIntField(term6932, term6932.getClass(), "capacity", 0);
        setLongField(term6932, term6932.getClass(), "address", 16L);
        setField(term6925, term6925.getClass(), "input", term6932);
        setField(term6925, term6925.getClass(), "inputArray", null);
        setIntField(term6925, term6925.getClass(), "inputPos", 0);
        setIntField(term6925, term6925.getClass(), "inputLim", 0);
        setBooleanField(term6925, term6925.getClass(), "finished", false);
        setBooleanField(term6925, term6925.getClass(), "needDict", false);
        setLongField(term6925, term6925.getClass(), "bytesRead", 0L);
        setLongField(term6925, term6925.getClass(), "bytesWritten", 0L);
        setIntField(term6925, term6925.getClass(), "inputConsumed", 0);
        setIntField(term6925, term6925.getClass(), "outputConsumed", 0);
        setField(term6919, term6919.getClass(), "inf", term6925);
        setIntField(term6934, term6934.getClass(), "crc", 0);
        setField(term6919, term6919.getClass(), "crc", term6934);
        setField(term6919, term6919.getClass(), "buf", term6935);
        setField(term6919, term6919.getClass(), "current", null);
        setBooleanField(term6919, term6919.getClass(), "closed", false);
        setBooleanField(term6919, term6919.getClass(), "hitCentralDirectory", false);
        setIntField(term6919, term6919.getClass(), "readBytesOfEntry", 0);
        setIntField(term6919, term6919.getClass(), "offsetInBuffer", 0);
        setIntField(term6919, term6919.getClass(), "bytesReadFromStream", 0);
        setIntField(term6919, term6919.getClass(), "lengthOfLastRead", 0);
        setBooleanField(term6919, term6919.getClass(), "hasDataDescriptor", false);
        setField(term6919, term6919.getClass(), "SINGLE", term6936);
        setIntField(term6919, term6919.getClass(), "bytesRead", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6919));
    }

};


