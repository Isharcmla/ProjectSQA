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

public class ZipArchiveInputStream_init_6720531833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7420;

    public ZipArchiveInputStream_init_6720531833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7420 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term7421 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term7424 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term7425 = (byte[]) newByteArray(512);
        Object term7426 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term7427 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term7428 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term7429 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term7430 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term7431 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term7432 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7433 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term7434 = (byte[]) newByteArray(0);
        Object term7435 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term7436 = (byte[]) newByteArray(512);
        byte[] term7437 = (byte[]) newByteArray(30);
        byte[] term7438 = (byte[]) newByteArray(1024);
        byte[] term7439 = (byte[]) newByteArray(2);
        byte[] term7440 = (byte[]) newByteArray(4);
        byte[] term7441 = (byte[]) newByteArray(16);
        byte[] term7442 = (byte[]) newByteArray(1);
        setField(term7421, term7421.getClass(), "charsetName", "UTF8");
        setField(term7420, term7420.getClass(), "zipEncoding", term7421);
        setBooleanField(term7420, term7420.getClass(), "useUnicodeExtraFields", true);
        setField(term7424, term7424.getClass(), "buf", term7425);
        setIntField(term7424, term7424.getClass(), "pos", 512);
        setField(term7424, term7424.getClass(), "in", null);
        setField(term7420, term7420.getClass(), "in", term7424);
        setLongField(term7427, term7427.getClass(), "address", 132350099049344L);
        setField(term7428, term7428.getClass(), "action", term7427);
        setField(term7429, term7429.getClass(), "action", null);
        setField(term7429, term7429.getClass(), "prev", null);
        setField(term7429, term7429.getClass(), "next", term7428);
        setField(term7429, term7429.getClass(), "list", null);
        setField(term7429, term7429.getClass(), "referent", null);
        setField(term7429, term7429.getClass(), "queue", null);
        setField(term7429, term7429.getClass(), "next", null);
        setField(term7429, term7429.getClass(), "discovered", null);
        setField(term7428, term7428.getClass(), "prev", term7429);
        setField(term7430, term7430.getClass(), "action", null);
        setField(term7430, term7430.getClass(), "prev", term7428);
        setField(term7430, term7430.getClass(), "next", null);
        setField(term7430, term7430.getClass(), "list", null);
        setField(term7430, term7430.getClass(), "referent", null);
        setField(term7430, term7430.getClass(), "queue", null);
        setField(term7430, term7430.getClass(), "next", null);
        setField(term7430, term7430.getClass(), "discovered", null);
        setField(term7428, term7428.getClass(), "next", term7430);
        setField(term7431, term7431.getClass(), "action", null);
        setField(term7431, term7431.getClass(), "prev", null);
        setField(term7431, term7431.getClass(), "next", null);
        setField(term7431, term7431.getClass(), "list", term7431);
        setField(term7431, term7431.getClass(), "referent", null);
        setField(term7431, term7431.getClass(), "queue", null);
        setField(term7431, term7431.getClass(), "next", null);
        setField(term7431, term7431.getClass(), "discovered", null);
        setField(term7428, term7428.getClass(), "list", term7431);
        setField(term7428, term7428.getClass(), "referent", term7426);
        setField(term7432, term7432.getClass(), "lock", null);
        setField(term7432, term7432.getClass(), "head", null);
        setLongField(term7432, term7432.getClass(), "queueLength", 0L);
        setField(term7428, term7428.getClass(), "queue", term7432);
        setField(term7428, term7428.getClass(), "next", null);
        setField(term7428, term7428.getClass(), "discovered", null);
        setField(term7427, term7427.getClass(), "cleanable", term7428);
        setField(term7426, term7426.getClass(), "zsRef", term7427);
        setField(term7433, term7433.getClass(), "hb", term7434);
        setIntField(term7433, term7433.getClass(), "offset", 0);
        setBooleanField(term7433, term7433.getClass(), "isReadOnly", false);
        setBooleanField(term7433, term7433.getClass(), "bigEndian", true);
        setBooleanField(term7433, term7433.getClass(), "nativeByteOrder", false);
        setIntField(term7433, term7433.getClass(), "mark", -1);
        setIntField(term7433, term7433.getClass(), "position", 0);
        setIntField(term7433, term7433.getClass(), "limit", 0);
        setIntField(term7433, term7433.getClass(), "capacity", 0);
        setLongField(term7433, term7433.getClass(), "address", 16L);
        setField(term7426, term7426.getClass(), "input", term7433);
        setField(term7426, term7426.getClass(), "inputArray", null);
        setIntField(term7426, term7426.getClass(), "inputPos", 0);
        setIntField(term7426, term7426.getClass(), "inputLim", 0);
        setBooleanField(term7426, term7426.getClass(), "finished", false);
        setBooleanField(term7426, term7426.getClass(), "needDict", false);
        setLongField(term7426, term7426.getClass(), "bytesRead", 0L);
        setLongField(term7426, term7426.getClass(), "bytesWritten", 0L);
        setIntField(term7426, term7426.getClass(), "inputConsumed", 0);
        setIntField(term7426, term7426.getClass(), "outputConsumed", 0);
        setField(term7420, term7420.getClass(), "inf", term7426);
        setField(term7435, term7435.getClass(), "hb", term7436);
        setIntField(term7435, term7435.getClass(), "offset", 0);
        setBooleanField(term7435, term7435.getClass(), "isReadOnly", false);
        setBooleanField(term7435, term7435.getClass(), "bigEndian", true);
        setBooleanField(term7435, term7435.getClass(), "nativeByteOrder", false);
        setIntField(term7435, term7435.getClass(), "mark", -1);
        setIntField(term7435, term7435.getClass(), "position", 0);
        setIntField(term7435, term7435.getClass(), "limit", 512);
        setIntField(term7435, term7435.getClass(), "capacity", 512);
        setLongField(term7435, term7435.getClass(), "address", 16L);
        setField(term7420, term7420.getClass(), "buf", term7435);
        setField(term7420, term7420.getClass(), "current", null);
        setBooleanField(term7420, term7420.getClass(), "closed", false);
        setBooleanField(term7420, term7420.getClass(), "hitCentralDirectory", false);
        setField(term7420, term7420.getClass(), "lastStoredEntry", null);
        setBooleanField(term7420, term7420.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term7420, term7420.getClass(), "LFH_BUF", term7437);
        setField(term7420, term7420.getClass(), "SKIP_BUF", term7438);
        setField(term7420, term7420.getClass(), "SHORT_BUF", term7439);
        setField(term7420, term7420.getClass(), "WORD_BUF", term7440);
        setField(term7420, term7420.getClass(), "TWO_DWORD_BUF", term7441);
        setIntField(term7420, term7420.getClass(), "entriesRead", 0);
        setField(term7420, term7420.getClass(), "SINGLE", term7442);
        setLongField(term7420, term7420.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7420));
    }

};


