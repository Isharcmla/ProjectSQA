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

public class ZipArchiveInputStream_init_40762374336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term39999;

    public ZipArchiveInputStream_init_40762374336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = new Boolean(false);
        term39999 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term40000 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term40001 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term40004 = (Object[]) newArray("java.lang.String", 2);
        Object term40009 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term40010 = (byte[]) newByteArray(512);
        Object term40011 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term40012 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term40013 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term40014 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term40015 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term40016 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term40017 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term40018 = (byte[]) newByteArray(0);
        Object term40019 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term40020 = (byte[]) newByteArray(512);
        byte[] term40021 = (byte[]) newByteArray(30);
        byte[] term40022 = (byte[]) newByteArray(1024);
        byte[] term40023 = (byte[]) newByteArray(2);
        byte[] term40024 = (byte[]) newByteArray(4);
        byte[] term40025 = (byte[]) newByteArray(16);
        byte[] term40026 = (byte[]) newByteArray(1);
        setField(term40001, term40001.getClass(), "name", "UTF-8");
        setElement(term40004, 0, "");
        setElement(term40004, 1, "");
        setField(term40001, term40001.getClass(), "aliases", term40004);
        setField(term40001, term40001.getClass(), "aliasSet", null);
        setField(term40000, term40000.getClass(), "charset", term40001);
        setBooleanField(term40000, term40000.getClass(), "useReplacement", true);
        setField(term39999, term39999.getClass(), "zipEncoding", term40000);
        setField(term39999, term39999.getClass(), "encoding", "sjlJAEtRrb");
        setBooleanField(term39999, term39999.getClass(), "useUnicodeExtraFields", false);
        setField(term40009, term40009.getClass(), "buf", term40010);
        setIntField(term40009, term40009.getClass(), "pos", 512);
        setField(term40009, term40009.getClass(), "in", null);
        setField(term39999, term39999.getClass(), "in", term40009);
        setLongField(term40012, term40012.getClass(), "address", 131462172357376L);
        setField(term40013, term40013.getClass(), "action", term40012);
        setField(term40014, term40014.getClass(), "action", null);
        setField(term40014, term40014.getClass(), "prev", null);
        setField(term40014, term40014.getClass(), "next", term40013);
        setField(term40014, term40014.getClass(), "list", term40014);
        setField(term40014, term40014.getClass(), "referent", null);
        setField(term40014, term40014.getClass(), "queue", null);
        setField(term40014, term40014.getClass(), "next", null);
        setField(term40014, term40014.getClass(), "discovered", null);
        setField(term40013, term40013.getClass(), "prev", term40014);
        setField(term40015, term40015.getClass(), "action", null);
        setField(term40015, term40015.getClass(), "prev", term40013);
        setField(term40015, term40015.getClass(), "next", null);
        setField(term40015, term40015.getClass(), "list", term40014);
        setField(term40015, term40015.getClass(), "referent", null);
        setField(term40015, term40015.getClass(), "queue", null);
        setField(term40015, term40015.getClass(), "next", null);
        setField(term40015, term40015.getClass(), "discovered", null);
        setField(term40013, term40013.getClass(), "next", term40015);
        setField(term40013, term40013.getClass(), "list", term40014);
        setField(term40013, term40013.getClass(), "referent", term40011);
        setField(term40016, term40016.getClass(), "lock", null);
        setField(term40016, term40016.getClass(), "head", null);
        setLongField(term40016, term40016.getClass(), "queueLength", 0L);
        setField(term40013, term40013.getClass(), "queue", term40016);
        setField(term40013, term40013.getClass(), "next", null);
        setField(term40013, term40013.getClass(), "discovered", null);
        setField(term40012, term40012.getClass(), "cleanable", term40013);
        setField(term40011, term40011.getClass(), "zsRef", term40012);
        setField(term40017, term40017.getClass(), "hb", term40018);
        setIntField(term40017, term40017.getClass(), "offset", 0);
        setBooleanField(term40017, term40017.getClass(), "isReadOnly", false);
        setBooleanField(term40017, term40017.getClass(), "bigEndian", true);
        setBooleanField(term40017, term40017.getClass(), "nativeByteOrder", false);
        setIntField(term40017, term40017.getClass(), "mark", -1);
        setIntField(term40017, term40017.getClass(), "position", 0);
        setIntField(term40017, term40017.getClass(), "limit", 0);
        setIntField(term40017, term40017.getClass(), "capacity", 0);
        setLongField(term40017, term40017.getClass(), "address", 16L);
        setField(term40011, term40011.getClass(), "input", term40017);
        setField(term40011, term40011.getClass(), "inputArray", null);
        setIntField(term40011, term40011.getClass(), "inputPos", 0);
        setIntField(term40011, term40011.getClass(), "inputLim", 0);
        setBooleanField(term40011, term40011.getClass(), "finished", false);
        setBooleanField(term40011, term40011.getClass(), "needDict", false);
        setLongField(term40011, term40011.getClass(), "bytesRead", 0L);
        setLongField(term40011, term40011.getClass(), "bytesWritten", 0L);
        setIntField(term40011, term40011.getClass(), "inputConsumed", 0);
        setIntField(term40011, term40011.getClass(), "outputConsumed", 0);
        setField(term39999, term39999.getClass(), "inf", term40011);
        setField(term40019, term40019.getClass(), "hb", term40020);
        setIntField(term40019, term40019.getClass(), "offset", 0);
        setBooleanField(term40019, term40019.getClass(), "isReadOnly", false);
        setBooleanField(term40019, term40019.getClass(), "bigEndian", true);
        setBooleanField(term40019, term40019.getClass(), "nativeByteOrder", false);
        setIntField(term40019, term40019.getClass(), "mark", -1);
        setIntField(term40019, term40019.getClass(), "position", 0);
        setIntField(term40019, term40019.getClass(), "limit", 0);
        setIntField(term40019, term40019.getClass(), "capacity", 512);
        setLongField(term40019, term40019.getClass(), "address", 16L);
        setField(term39999, term39999.getClass(), "buf", term40019);
        setField(term39999, term39999.getClass(), "current", null);
        setBooleanField(term39999, term39999.getClass(), "closed", false);
        setBooleanField(term39999, term39999.getClass(), "hitCentralDirectory", false);
        setField(term39999, term39999.getClass(), "lastStoredEntry", null);
        setBooleanField(term39999, term39999.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term39999, term39999.getClass(), "lfhBuf", term40021);
        setField(term39999, term39999.getClass(), "skipBuf", term40022);
        setField(term39999, term39999.getClass(), "shortBuf", term40023);
        setField(term39999, term39999.getClass(), "wordBuf", term40024);
        setField(term39999, term39999.getClass(), "twoDwordBuf", term40025);
        setIntField(term39999, term39999.getClass(), "entriesRead", 0);
        setField(term39999, term39999.getClass(), "single", term40026);
        setLongField(term39999, term39999.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "sjlJAEtRrb";
        args[2] = term35;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term39999));
        assertTrue(recursiveEquals(term35, false));
    }

};


