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

public class ZipArchiveInputStream_init_59399576135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35334;

    public ZipArchiveInputStream_init_59399576135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35334 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term35335 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term35336 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term35339 = (Object[]) newArray("java.lang.String", 2);
        Object term35344 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term35345 = (byte[]) newByteArray(512);
        Object term35346 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term35347 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term35348 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term35349 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term35350 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term35351 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term35352 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term35353 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term35354 = (byte[]) newByteArray(0);
        Object term35355 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term35356 = (byte[]) newByteArray(512);
        byte[] term35357 = (byte[]) newByteArray(30);
        byte[] term35358 = (byte[]) newByteArray(1024);
        byte[] term35359 = (byte[]) newByteArray(2);
        byte[] term35360 = (byte[]) newByteArray(4);
        byte[] term35361 = (byte[]) newByteArray(16);
        byte[] term35362 = (byte[]) newByteArray(1);
        setField(term35336, term35336.getClass(), "name", "UTF-8");
        setElement(term35339, 0, "");
        setElement(term35339, 1, "");
        setField(term35336, term35336.getClass(), "aliases", term35339);
        setField(term35336, term35336.getClass(), "aliasSet", null);
        setField(term35335, term35335.getClass(), "charset", term35336);
        setBooleanField(term35335, term35335.getClass(), "useReplacement", true);
        setField(term35334, term35334.getClass(), "zipEncoding", term35335);
        setField(term35334, term35334.getClass(), "encoding", "PAEBtnZtTD");
        setBooleanField(term35334, term35334.getClass(), "useUnicodeExtraFields", true);
        setField(term35344, term35344.getClass(), "buf", term35345);
        setIntField(term35344, term35344.getClass(), "pos", 512);
        setField(term35344, term35344.getClass(), "in", null);
        setField(term35334, term35334.getClass(), "in", term35344);
        setLongField(term35347, term35347.getClass(), "address", 131462174937968L);
        setField(term35348, term35348.getClass(), "action", term35347);
        setField(term35349, term35349.getClass(), "action", null);
        setField(term35349, term35349.getClass(), "prev", null);
        setField(term35349, term35349.getClass(), "next", term35348);
        setField(term35349, term35349.getClass(), "list", null);
        setField(term35349, term35349.getClass(), "referent", null);
        setField(term35349, term35349.getClass(), "queue", null);
        setField(term35349, term35349.getClass(), "next", null);
        setField(term35349, term35349.getClass(), "discovered", null);
        setField(term35348, term35348.getClass(), "prev", term35349);
        setField(term35350, term35350.getClass(), "action", null);
        setField(term35350, term35350.getClass(), "prev", term35348);
        setField(term35350, term35350.getClass(), "next", null);
        setField(term35350, term35350.getClass(), "list", null);
        setField(term35350, term35350.getClass(), "referent", null);
        setField(term35350, term35350.getClass(), "queue", null);
        setField(term35350, term35350.getClass(), "next", null);
        setField(term35350, term35350.getClass(), "discovered", null);
        setField(term35348, term35348.getClass(), "next", term35350);
        setField(term35351, term35351.getClass(), "action", null);
        setField(term35351, term35351.getClass(), "prev", null);
        setField(term35351, term35351.getClass(), "next", null);
        setField(term35351, term35351.getClass(), "list", term35351);
        setField(term35351, term35351.getClass(), "referent", null);
        setField(term35351, term35351.getClass(), "queue", null);
        setField(term35351, term35351.getClass(), "next", null);
        setField(term35351, term35351.getClass(), "discovered", null);
        setField(term35348, term35348.getClass(), "list", term35351);
        setField(term35348, term35348.getClass(), "referent", term35346);
        setField(term35352, term35352.getClass(), "lock", null);
        setField(term35352, term35352.getClass(), "head", null);
        setLongField(term35352, term35352.getClass(), "queueLength", 0L);
        setField(term35348, term35348.getClass(), "queue", term35352);
        setField(term35348, term35348.getClass(), "next", null);
        setField(term35348, term35348.getClass(), "discovered", null);
        setField(term35347, term35347.getClass(), "cleanable", term35348);
        setField(term35346, term35346.getClass(), "zsRef", term35347);
        setField(term35353, term35353.getClass(), "hb", term35354);
        setIntField(term35353, term35353.getClass(), "offset", 0);
        setBooleanField(term35353, term35353.getClass(), "isReadOnly", false);
        setBooleanField(term35353, term35353.getClass(), "bigEndian", true);
        setBooleanField(term35353, term35353.getClass(), "nativeByteOrder", false);
        setIntField(term35353, term35353.getClass(), "mark", -1);
        setIntField(term35353, term35353.getClass(), "position", 0);
        setIntField(term35353, term35353.getClass(), "limit", 0);
        setIntField(term35353, term35353.getClass(), "capacity", 0);
        setLongField(term35353, term35353.getClass(), "address", 16L);
        setField(term35346, term35346.getClass(), "input", term35353);
        setField(term35346, term35346.getClass(), "inputArray", null);
        setIntField(term35346, term35346.getClass(), "inputPos", 0);
        setIntField(term35346, term35346.getClass(), "inputLim", 0);
        setBooleanField(term35346, term35346.getClass(), "finished", false);
        setBooleanField(term35346, term35346.getClass(), "needDict", false);
        setLongField(term35346, term35346.getClass(), "bytesRead", 0L);
        setLongField(term35346, term35346.getClass(), "bytesWritten", 0L);
        setIntField(term35346, term35346.getClass(), "inputConsumed", 0);
        setIntField(term35346, term35346.getClass(), "outputConsumed", 0);
        setField(term35334, term35334.getClass(), "inf", term35346);
        setField(term35355, term35355.getClass(), "hb", term35356);
        setIntField(term35355, term35355.getClass(), "offset", 0);
        setBooleanField(term35355, term35355.getClass(), "isReadOnly", false);
        setBooleanField(term35355, term35355.getClass(), "bigEndian", true);
        setBooleanField(term35355, term35355.getClass(), "nativeByteOrder", false);
        setIntField(term35355, term35355.getClass(), "mark", -1);
        setIntField(term35355, term35355.getClass(), "position", 0);
        setIntField(term35355, term35355.getClass(), "limit", 0);
        setIntField(term35355, term35355.getClass(), "capacity", 512);
        setLongField(term35355, term35355.getClass(), "address", 16L);
        setField(term35334, term35334.getClass(), "buf", term35355);
        setField(term35334, term35334.getClass(), "current", null);
        setBooleanField(term35334, term35334.getClass(), "closed", false);
        setBooleanField(term35334, term35334.getClass(), "hitCentralDirectory", false);
        setField(term35334, term35334.getClass(), "lastStoredEntry", null);
        setBooleanField(term35334, term35334.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term35334, term35334.getClass(), "lfhBuf", term35357);
        setField(term35334, term35334.getClass(), "skipBuf", term35358);
        setField(term35334, term35334.getClass(), "shortBuf", term35359);
        setField(term35334, term35334.getClass(), "wordBuf", term35360);
        setField(term35334, term35334.getClass(), "twoDwordBuf", term35361);
        setIntField(term35334, term35334.getClass(), "entriesRead", 0);
        setField(term35334, term35334.getClass(), "single", term35362);
        setLongField(term35334, term35334.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35334));
    }

};


