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
     Object term7414;

    public ZipArchiveInputStream_init_6720531833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7414 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term7415 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term7418 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term7419 = (byte[]) newByteArray(512);
        Object term7420 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term7421 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term7422 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term7423 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term7424 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term7425 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term7426 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7427 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term7428 = (byte[]) newByteArray(0);
        Object term7429 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term7430 = (byte[]) newByteArray(512);
        byte[] term7431 = (byte[]) newByteArray(30);
        byte[] term7432 = (byte[]) newByteArray(1024);
        byte[] term7433 = (byte[]) newByteArray(2);
        byte[] term7434 = (byte[]) newByteArray(4);
        byte[] term7435 = (byte[]) newByteArray(16);
        byte[] term7436 = (byte[]) newByteArray(1);
        setField(term7415, term7415.getClass(), "charsetName", "UTF8");
        setField(term7414, term7414.getClass(), "zipEncoding", term7415);
        setBooleanField(term7414, term7414.getClass(), "useUnicodeExtraFields", true);
        setField(term7418, term7418.getClass(), "buf", term7419);
        setIntField(term7418, term7418.getClass(), "pos", 512);
        setField(term7418, term7418.getClass(), "in", null);
        setField(term7414, term7414.getClass(), "in", term7418);
        setLongField(term7421, term7421.getClass(), "address", 134047006345152L);
        setField(term7422, term7422.getClass(), "action", term7421);
        setField(term7423, term7423.getClass(), "action", null);
        setField(term7423, term7423.getClass(), "prev", null);
        setField(term7423, term7423.getClass(), "next", term7422);
        setField(term7423, term7423.getClass(), "list", null);
        setField(term7423, term7423.getClass(), "referent", null);
        setField(term7423, term7423.getClass(), "queue", null);
        setField(term7423, term7423.getClass(), "next", null);
        setField(term7423, term7423.getClass(), "discovered", null);
        setField(term7422, term7422.getClass(), "prev", term7423);
        setField(term7424, term7424.getClass(), "action", null);
        setField(term7424, term7424.getClass(), "prev", term7422);
        setField(term7424, term7424.getClass(), "next", null);
        setField(term7424, term7424.getClass(), "list", null);
        setField(term7424, term7424.getClass(), "referent", null);
        setField(term7424, term7424.getClass(), "queue", null);
        setField(term7424, term7424.getClass(), "next", null);
        setField(term7424, term7424.getClass(), "discovered", null);
        setField(term7422, term7422.getClass(), "next", term7424);
        setField(term7425, term7425.getClass(), "action", null);
        setField(term7425, term7425.getClass(), "prev", null);
        setField(term7425, term7425.getClass(), "next", null);
        setField(term7425, term7425.getClass(), "list", term7425);
        setField(term7425, term7425.getClass(), "referent", null);
        setField(term7425, term7425.getClass(), "queue", null);
        setField(term7425, term7425.getClass(), "next", null);
        setField(term7425, term7425.getClass(), "discovered", null);
        setField(term7422, term7422.getClass(), "list", term7425);
        setField(term7422, term7422.getClass(), "referent", term7420);
        setField(term7426, term7426.getClass(), "lock", null);
        setField(term7426, term7426.getClass(), "head", null);
        setLongField(term7426, term7426.getClass(), "queueLength", 0L);
        setField(term7422, term7422.getClass(), "queue", term7426);
        setField(term7422, term7422.getClass(), "next", null);
        setField(term7422, term7422.getClass(), "discovered", null);
        setField(term7421, term7421.getClass(), "cleanable", term7422);
        setField(term7420, term7420.getClass(), "zsRef", term7421);
        setField(term7427, term7427.getClass(), "hb", term7428);
        setIntField(term7427, term7427.getClass(), "offset", 0);
        setBooleanField(term7427, term7427.getClass(), "isReadOnly", false);
        setBooleanField(term7427, term7427.getClass(), "bigEndian", true);
        setBooleanField(term7427, term7427.getClass(), "nativeByteOrder", false);
        setIntField(term7427, term7427.getClass(), "mark", -1);
        setIntField(term7427, term7427.getClass(), "position", 0);
        setIntField(term7427, term7427.getClass(), "limit", 0);
        setIntField(term7427, term7427.getClass(), "capacity", 0);
        setLongField(term7427, term7427.getClass(), "address", 16L);
        setField(term7420, term7420.getClass(), "input", term7427);
        setField(term7420, term7420.getClass(), "inputArray", null);
        setIntField(term7420, term7420.getClass(), "inputPos", 0);
        setIntField(term7420, term7420.getClass(), "inputLim", 0);
        setBooleanField(term7420, term7420.getClass(), "finished", false);
        setBooleanField(term7420, term7420.getClass(), "needDict", false);
        setLongField(term7420, term7420.getClass(), "bytesRead", 0L);
        setLongField(term7420, term7420.getClass(), "bytesWritten", 0L);
        setIntField(term7420, term7420.getClass(), "inputConsumed", 0);
        setIntField(term7420, term7420.getClass(), "outputConsumed", 0);
        setField(term7414, term7414.getClass(), "inf", term7420);
        setField(term7429, term7429.getClass(), "hb", term7430);
        setIntField(term7429, term7429.getClass(), "offset", 0);
        setBooleanField(term7429, term7429.getClass(), "isReadOnly", false);
        setBooleanField(term7429, term7429.getClass(), "bigEndian", true);
        setBooleanField(term7429, term7429.getClass(), "nativeByteOrder", false);
        setIntField(term7429, term7429.getClass(), "mark", -1);
        setIntField(term7429, term7429.getClass(), "position", 0);
        setIntField(term7429, term7429.getClass(), "limit", 0);
        setIntField(term7429, term7429.getClass(), "capacity", 512);
        setLongField(term7429, term7429.getClass(), "address", 16L);
        setField(term7414, term7414.getClass(), "buf", term7429);
        setField(term7414, term7414.getClass(), "current", null);
        setBooleanField(term7414, term7414.getClass(), "closed", false);
        setBooleanField(term7414, term7414.getClass(), "hitCentralDirectory", false);
        setField(term7414, term7414.getClass(), "lastStoredEntry", null);
        setBooleanField(term7414, term7414.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term7414, term7414.getClass(), "LFH_BUF", term7431);
        setField(term7414, term7414.getClass(), "SKIP_BUF", term7432);
        setField(term7414, term7414.getClass(), "SHORT_BUF", term7433);
        setField(term7414, term7414.getClass(), "WORD_BUF", term7434);
        setField(term7414, term7414.getClass(), "TWO_DWORD_BUF", term7435);
        setIntField(term7414, term7414.getClass(), "entriesRead", 0);
        setField(term7414, term7414.getClass(), "SINGLE", term7436);
        setLongField(term7414, term7414.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7414));
    }

};


