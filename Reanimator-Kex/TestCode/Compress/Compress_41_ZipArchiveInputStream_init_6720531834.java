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

public class ZipArchiveInputStream_init_6720531834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8294;

    public ZipArchiveInputStream_init_6720531834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8294 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term8295 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term8300 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term8301 = (byte[]) newByteArray(512);
        Object term8302 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term8303 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term8304 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term8305 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term8306 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term8307 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term8308 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term8309 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term8310 = (byte[]) newByteArray(0);
        Object term8311 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term8312 = (byte[]) newByteArray(512);
        byte[] term8313 = (byte[]) newByteArray(30);
        byte[] term8314 = (byte[]) newByteArray(1024);
        byte[] term8315 = (byte[]) newByteArray(2);
        byte[] term8316 = (byte[]) newByteArray(4);
        byte[] term8317 = (byte[]) newByteArray(16);
        byte[] term8318 = (byte[]) newByteArray(1);
        setField(term8295, term8295.getClass(), "charsetName", "UTF8");
        setField(term8294, term8294.getClass(), "zipEncoding", term8295);
        setField(term8294, term8294.getClass(), "encoding", "UTF8");
        setBooleanField(term8294, term8294.getClass(), "useUnicodeExtraFields", true);
        setField(term8300, term8300.getClass(), "buf", term8301);
        setIntField(term8300, term8300.getClass(), "pos", 512);
        setField(term8300, term8300.getClass(), "in", null);
        setField(term8294, term8294.getClass(), "in", term8300);
        setLongField(term8303, term8303.getClass(), "address", 137911138202144L);
        setField(term8304, term8304.getClass(), "action", term8303);
        setField(term8305, term8305.getClass(), "action", null);
        setField(term8305, term8305.getClass(), "prev", null);
        setField(term8305, term8305.getClass(), "next", term8304);
        setField(term8305, term8305.getClass(), "list", null);
        setField(term8305, term8305.getClass(), "referent", null);
        setField(term8305, term8305.getClass(), "queue", null);
        setField(term8305, term8305.getClass(), "next", null);
        setField(term8305, term8305.getClass(), "discovered", null);
        setField(term8304, term8304.getClass(), "prev", term8305);
        setField(term8306, term8306.getClass(), "action", null);
        setField(term8306, term8306.getClass(), "prev", term8304);
        setField(term8306, term8306.getClass(), "next", null);
        setField(term8306, term8306.getClass(), "list", null);
        setField(term8306, term8306.getClass(), "referent", null);
        setField(term8306, term8306.getClass(), "queue", null);
        setField(term8306, term8306.getClass(), "next", null);
        setField(term8306, term8306.getClass(), "discovered", null);
        setField(term8304, term8304.getClass(), "next", term8306);
        setField(term8307, term8307.getClass(), "action", null);
        setField(term8307, term8307.getClass(), "prev", null);
        setField(term8307, term8307.getClass(), "next", null);
        setField(term8307, term8307.getClass(), "list", term8307);
        setField(term8307, term8307.getClass(), "referent", null);
        setField(term8307, term8307.getClass(), "queue", null);
        setField(term8307, term8307.getClass(), "next", null);
        setField(term8307, term8307.getClass(), "discovered", null);
        setField(term8304, term8304.getClass(), "list", term8307);
        setField(term8304, term8304.getClass(), "referent", term8302);
        setField(term8308, term8308.getClass(), "lock", null);
        setField(term8308, term8308.getClass(), "head", null);
        setLongField(term8308, term8308.getClass(), "queueLength", 0L);
        setField(term8304, term8304.getClass(), "queue", term8308);
        setField(term8304, term8304.getClass(), "next", null);
        setField(term8304, term8304.getClass(), "discovered", null);
        setField(term8303, term8303.getClass(), "cleanable", term8304);
        setField(term8302, term8302.getClass(), "zsRef", term8303);
        setField(term8309, term8309.getClass(), "hb", term8310);
        setIntField(term8309, term8309.getClass(), "offset", 0);
        setBooleanField(term8309, term8309.getClass(), "isReadOnly", false);
        setBooleanField(term8309, term8309.getClass(), "bigEndian", true);
        setBooleanField(term8309, term8309.getClass(), "nativeByteOrder", false);
        setIntField(term8309, term8309.getClass(), "mark", -1);
        setIntField(term8309, term8309.getClass(), "position", 0);
        setIntField(term8309, term8309.getClass(), "limit", 0);
        setIntField(term8309, term8309.getClass(), "capacity", 0);
        setLongField(term8309, term8309.getClass(), "address", 16L);
        setField(term8302, term8302.getClass(), "input", term8309);
        setField(term8302, term8302.getClass(), "inputArray", null);
        setIntField(term8302, term8302.getClass(), "inputPos", 0);
        setIntField(term8302, term8302.getClass(), "inputLim", 0);
        setBooleanField(term8302, term8302.getClass(), "finished", false);
        setBooleanField(term8302, term8302.getClass(), "needDict", false);
        setLongField(term8302, term8302.getClass(), "bytesRead", 0L);
        setLongField(term8302, term8302.getClass(), "bytesWritten", 0L);
        setIntField(term8302, term8302.getClass(), "inputConsumed", 0);
        setIntField(term8302, term8302.getClass(), "outputConsumed", 0);
        setField(term8294, term8294.getClass(), "inf", term8302);
        setField(term8311, term8311.getClass(), "hb", term8312);
        setIntField(term8311, term8311.getClass(), "offset", 0);
        setBooleanField(term8311, term8311.getClass(), "isReadOnly", false);
        setBooleanField(term8311, term8311.getClass(), "bigEndian", true);
        setBooleanField(term8311, term8311.getClass(), "nativeByteOrder", false);
        setIntField(term8311, term8311.getClass(), "mark", -1);
        setIntField(term8311, term8311.getClass(), "position", 0);
        setIntField(term8311, term8311.getClass(), "limit", 0);
        setIntField(term8311, term8311.getClass(), "capacity", 512);
        setLongField(term8311, term8311.getClass(), "address", 16L);
        setField(term8294, term8294.getClass(), "buf", term8311);
        setField(term8294, term8294.getClass(), "current", null);
        setBooleanField(term8294, term8294.getClass(), "closed", false);
        setBooleanField(term8294, term8294.getClass(), "hitCentralDirectory", false);
        setField(term8294, term8294.getClass(), "lastStoredEntry", null);
        setBooleanField(term8294, term8294.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term8294, term8294.getClass(), "LFH_BUF", term8313);
        setField(term8294, term8294.getClass(), "SKIP_BUF", term8314);
        setField(term8294, term8294.getClass(), "SHORT_BUF", term8315);
        setField(term8294, term8294.getClass(), "WORD_BUF", term8316);
        setField(term8294, term8294.getClass(), "TWO_DWORD_BUF", term8317);
        setIntField(term8294, term8294.getClass(), "entriesRead", 0);
        setField(term8294, term8294.getClass(), "SINGLE", term8318);
        setLongField(term8294, term8294.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8294));
    }

};


