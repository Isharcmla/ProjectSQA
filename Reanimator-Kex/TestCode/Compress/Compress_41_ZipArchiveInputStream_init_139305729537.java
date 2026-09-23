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
import java.lang.Boolean;
import java.lang.Object;

public class ZipArchiveInputStream_init_139305729537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term61;
     Object term22117;

    public ZipArchiveInputStream_init_139305729537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = new Boolean(false);
        term61 = new Boolean(false);
        term22117 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term22118 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term22123 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term22124 = (byte[]) newByteArray(512);
        Object term22125 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term22126 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term22127 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term22128 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term22129 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term22130 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term22131 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term22132 = (byte[]) newByteArray(0);
        Object term22133 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term22134 = (byte[]) newByteArray(512);
        byte[] term22135 = (byte[]) newByteArray(30);
        byte[] term22136 = (byte[]) newByteArray(1024);
        byte[] term22137 = (byte[]) newByteArray(2);
        byte[] term22138 = (byte[]) newByteArray(4);
        byte[] term22139 = (byte[]) newByteArray(16);
        byte[] term22140 = (byte[]) newByteArray(1);
        setField(term22118, term22118.getClass(), "charsetName", "MuLcgQHgqz");
        setField(term22117, term22117.getClass(), "zipEncoding", term22118);
        setField(term22117, term22117.getClass(), "encoding", "MuLcgQHgqz");
        setBooleanField(term22117, term22117.getClass(), "useUnicodeExtraFields", false);
        setField(term22123, term22123.getClass(), "buf", term22124);
        setIntField(term22123, term22123.getClass(), "pos", 512);
        setField(term22123, term22123.getClass(), "in", null);
        setField(term22117, term22117.getClass(), "in", term22123);
        setLongField(term22126, term22126.getClass(), "address", 137911141276368L);
        setField(term22127, term22127.getClass(), "action", term22126);
        setField(term22128, term22128.getClass(), "action", null);
        setField(term22128, term22128.getClass(), "prev", null);
        setField(term22128, term22128.getClass(), "next", term22127);
        setField(term22128, term22128.getClass(), "list", term22128);
        setField(term22128, term22128.getClass(), "referent", null);
        setField(term22128, term22128.getClass(), "queue", null);
        setField(term22128, term22128.getClass(), "next", null);
        setField(term22128, term22128.getClass(), "discovered", null);
        setField(term22127, term22127.getClass(), "prev", term22128);
        setField(term22129, term22129.getClass(), "action", null);
        setField(term22129, term22129.getClass(), "prev", term22127);
        setField(term22129, term22129.getClass(), "next", null);
        setField(term22129, term22129.getClass(), "list", term22128);
        setField(term22129, term22129.getClass(), "referent", null);
        setField(term22129, term22129.getClass(), "queue", null);
        setField(term22129, term22129.getClass(), "next", null);
        setField(term22129, term22129.getClass(), "discovered", null);
        setField(term22127, term22127.getClass(), "next", term22129);
        setField(term22127, term22127.getClass(), "list", term22128);
        setField(term22127, term22127.getClass(), "referent", term22125);
        setField(term22130, term22130.getClass(), "lock", null);
        setField(term22130, term22130.getClass(), "head", null);
        setLongField(term22130, term22130.getClass(), "queueLength", 0L);
        setField(term22127, term22127.getClass(), "queue", term22130);
        setField(term22127, term22127.getClass(), "next", null);
        setField(term22127, term22127.getClass(), "discovered", null);
        setField(term22126, term22126.getClass(), "cleanable", term22127);
        setField(term22125, term22125.getClass(), "zsRef", term22126);
        setField(term22131, term22131.getClass(), "hb", term22132);
        setIntField(term22131, term22131.getClass(), "offset", 0);
        setBooleanField(term22131, term22131.getClass(), "isReadOnly", false);
        setBooleanField(term22131, term22131.getClass(), "bigEndian", true);
        setBooleanField(term22131, term22131.getClass(), "nativeByteOrder", false);
        setIntField(term22131, term22131.getClass(), "mark", -1);
        setIntField(term22131, term22131.getClass(), "position", 0);
        setIntField(term22131, term22131.getClass(), "limit", 0);
        setIntField(term22131, term22131.getClass(), "capacity", 0);
        setLongField(term22131, term22131.getClass(), "address", 16L);
        setField(term22125, term22125.getClass(), "input", term22131);
        setField(term22125, term22125.getClass(), "inputArray", null);
        setIntField(term22125, term22125.getClass(), "inputPos", 0);
        setIntField(term22125, term22125.getClass(), "inputLim", 0);
        setBooleanField(term22125, term22125.getClass(), "finished", false);
        setBooleanField(term22125, term22125.getClass(), "needDict", false);
        setLongField(term22125, term22125.getClass(), "bytesRead", 0L);
        setLongField(term22125, term22125.getClass(), "bytesWritten", 0L);
        setIntField(term22125, term22125.getClass(), "inputConsumed", 0);
        setIntField(term22125, term22125.getClass(), "outputConsumed", 0);
        setField(term22117, term22117.getClass(), "inf", term22125);
        setField(term22133, term22133.getClass(), "hb", term22134);
        setIntField(term22133, term22133.getClass(), "offset", 0);
        setBooleanField(term22133, term22133.getClass(), "isReadOnly", false);
        setBooleanField(term22133, term22133.getClass(), "bigEndian", true);
        setBooleanField(term22133, term22133.getClass(), "nativeByteOrder", false);
        setIntField(term22133, term22133.getClass(), "mark", -1);
        setIntField(term22133, term22133.getClass(), "position", 0);
        setIntField(term22133, term22133.getClass(), "limit", 0);
        setIntField(term22133, term22133.getClass(), "capacity", 512);
        setLongField(term22133, term22133.getClass(), "address", 16L);
        setField(term22117, term22117.getClass(), "buf", term22133);
        setField(term22117, term22117.getClass(), "current", null);
        setBooleanField(term22117, term22117.getClass(), "closed", false);
        setBooleanField(term22117, term22117.getClass(), "hitCentralDirectory", false);
        setField(term22117, term22117.getClass(), "lastStoredEntry", null);
        setBooleanField(term22117, term22117.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term22117, term22117.getClass(), "LFH_BUF", term22135);
        setField(term22117, term22117.getClass(), "SKIP_BUF", term22136);
        setField(term22117, term22117.getClass(), "SHORT_BUF", term22137);
        setField(term22117, term22117.getClass(), "WORD_BUF", term22138);
        setField(term22117, term22117.getClass(), "TWO_DWORD_BUF", term22139);
        setIntField(term22117, term22117.getClass(), "entriesRead", 0);
        setField(term22117, term22117.getClass(), "SINGLE", term22140);
        setLongField(term22117, term22117.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "MuLcgQHgqz";
        args[2] = term59;
        args[3] = term61;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22117));
        assertTrue(recursiveEquals(term59, false));
        assertTrue(recursiveEquals(term61, false));
    }

};


