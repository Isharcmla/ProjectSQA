package org.apache.commons.compress.archivers;

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
import static org.apache.commons.compress.archivers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.EqualityUtils.*;
import java.lang.Object;

public class ArchiveStreamFactory_createArchiveInputStream_188557935432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55844;
     Object term55984;
     Object term60057;
     Object term60058;
     Object term58976;

    public ArchiveStreamFactory_createArchiveInputStream_188557935432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55844 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term55984 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInflaterInputStream"));
        term60057 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term60058 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInflaterInputStream"));
        setBooleanField(term60058, term60058.getClass(), "closeRequested", false);
        setBooleanField(term60058, term60058.getClass(), "eof", false);
        setField(term60058, term60058.getClass(), "cleanable", null);
        setField(term60058, term60058.getClass(), "this$0", null);
        setField(term60058, term60058.getClass(), "inf", null);
        setField(term60058, term60058.getClass(), "buf", null);
        setIntField(term60058, term60058.getClass(), "len", 0);
        setBooleanField(term60058, term60058.getClass(), "closed", false);
        setBooleanField(term60058, term60058.getClass(), "reachEOF", false);
        setBooleanField(term60058, term60058.getClass(), "usesDefaultInflater", false);
        setField(term60058, term60058.getClass(), "singleByteBuf", null);
        setField(term60058, term60058.getClass(), "b", null);
        setField(term60058, term60058.getClass(), "in", null);
        term58976 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term58977 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term58985 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term58986 = (byte[]) newByteArray(512);
        Object term58967 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInflaterInputStream"));
        Object term59500 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term59501 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term59503 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term59504 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term59505 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term59506 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term59508 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term59509 = (byte[]) newByteArray(0);
        Object term59527 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term59529 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$Buffer"));
        byte[] term59530 = (byte[]) newByteArray(512);
        byte[] term60048 = (byte[]) newByteArray(1);
        setField(term58977, term58977.getClass(), "charset", "UTF8");
        setField(term58976, term58976.getClass(), "zipEncoding", term58977);
        setBooleanField(term58976, term58976.getClass(), "useUnicodeExtraFields", true);
        setField(term58985, term58985.getClass(), "buf", term58986);
        setIntField(term58985, term58985.getClass(), "pos", 512);
        setBooleanField(term58967, term58967.getClass(), "closeRequested", false);
        setBooleanField(term58967, term58967.getClass(), "eof", false);
        setField(term58967, term58967.getClass(), "cleanable", null);
        setField(term58967, term58967.getClass(), "this$0", null);
        setField(term58967, term58967.getClass(), "inf", null);
        setField(term58967, term58967.getClass(), "buf", null);
        setIntField(term58967, term58967.getClass(), "len", 0);
        setBooleanField(term58967, term58967.getClass(), "closed", false);
        setBooleanField(term58967, term58967.getClass(), "reachEOF", false);
        setBooleanField(term58967, term58967.getClass(), "usesDefaultInflater", false);
        setField(term58967, term58967.getClass(), "singleByteBuf", null);
        setField(term58967, term58967.getClass(), "b", null);
        setField(term58967, term58967.getClass(), "in", null);
        setField(term58985, term58985.getClass(), "in", term58967);
        setField(term58976, term58976.getClass(), "in", term58985);
        setLongField(term59501, term59501.getClass(), "address", 130351192922800L);
        setField(term59503, term59503.getClass(), "action", term59501);
        setField(term59504, term59504.getClass(), "action", null);
        setField(term59504, term59504.getClass(), "prev", null);
        setField(term59504, term59504.getClass(), "next", term59503);
        setField(term59504, term59504.getClass(), "list", term59504);
        setField(term59504, term59504.getClass(), "referent", null);
        setField(term59504, term59504.getClass(), "queue", null);
        setField(term59504, term59504.getClass(), "next", null);
        setField(term59504, term59504.getClass(), "discovered", null);
        setField(term59503, term59503.getClass(), "prev", term59504);
        setField(term59505, term59505.getClass(), "action", null);
        setField(term59505, term59505.getClass(), "prev", term59503);
        setField(term59505, term59505.getClass(), "next", null);
        setField(term59505, term59505.getClass(), "list", term59504);
        setField(term59505, term59505.getClass(), "referent", null);
        setField(term59505, term59505.getClass(), "queue", null);
        setField(term59505, term59505.getClass(), "next", null);
        setField(term59505, term59505.getClass(), "discovered", null);
        setField(term59503, term59503.getClass(), "next", term59505);
        setField(term59503, term59503.getClass(), "list", term59504);
        setField(term59503, term59503.getClass(), "referent", term59500);
        setField(term59506, term59506.getClass(), "lock", null);
        setField(term59506, term59506.getClass(), "head", null);
        setLongField(term59506, term59506.getClass(), "queueLength", 0L);
        setField(term59503, term59503.getClass(), "queue", term59506);
        setField(term59503, term59503.getClass(), "next", null);
        setField(term59503, term59503.getClass(), "discovered", null);
        setField(term59501, term59501.getClass(), "cleanable", term59503);
        setField(term59500, term59500.getClass(), "zsRef", term59501);
        setField(term59508, term59508.getClass(), "hb", term59509);
        setIntField(term59508, term59508.getClass(), "offset", 0);
        setBooleanField(term59508, term59508.getClass(), "isReadOnly", false);
        setBooleanField(term59508, term59508.getClass(), "bigEndian", true);
        setBooleanField(term59508, term59508.getClass(), "nativeByteOrder", false);
        setIntField(term59508, term59508.getClass(), "mark", -1);
        setIntField(term59508, term59508.getClass(), "position", 0);
        setIntField(term59508, term59508.getClass(), "limit", 0);
        setIntField(term59508, term59508.getClass(), "capacity", 0);
        setLongField(term59508, term59508.getClass(), "address", 16L);
        setField(term59500, term59500.getClass(), "input", term59508);
        setField(term59500, term59500.getClass(), "inputArray", null);
        setIntField(term59500, term59500.getClass(), "inputPos", 0);
        setIntField(term59500, term59500.getClass(), "inputLim", 0);
        setBooleanField(term59500, term59500.getClass(), "finished", false);
        setBooleanField(term59500, term59500.getClass(), "needDict", false);
        setLongField(term59500, term59500.getClass(), "bytesRead", 0L);
        setLongField(term59500, term59500.getClass(), "bytesWritten", 0L);
        setIntField(term59500, term59500.getClass(), "inputConsumed", 0);
        setIntField(term59500, term59500.getClass(), "outputConsumed", 0);
        setField(term58976, term58976.getClass(), "inf", term59500);
        setIntField(term59527, term59527.getClass(), "crc", 0);
        setField(term58976, term58976.getClass(), "crc", term59527);
        setField(term59529, term59529.getClass(), "buf", term59530);
        setIntField(term59529, term59529.getClass(), "offsetInBuffer", 0);
        setIntField(term59529, term59529.getClass(), "lengthOfLastRead", 0);
        setField(term58976, term58976.getClass(), "buf", term59529);
        setField(term58976, term58976.getClass(), "current", null);
        setBooleanField(term58976, term58976.getClass(), "closed", false);
        setBooleanField(term58976, term58976.getClass(), "hitCentralDirectory", false);
        setField(term58976, term58976.getClass(), "lastStoredEntry", null);
        setBooleanField(term58976, term58976.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term58976, term58976.getClass(), "SINGLE", term60048);
        setLongField(term58976, term58976.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.InputStream");
        Object[] args = new Object[2];
        args[0] = "zip";
        args[1] = term55984;
        Object retValue = callMethod(klass, "createArchiveInputStream", argTypes, term55844, args);
        assertTrue(recursiveEquals(term55844, term60057));
        assertTrue(recursiveEquals(term55984, "zip"));
        assertTrue(recursiveEquals(retValue, term58976));
    }

};


