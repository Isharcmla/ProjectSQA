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
     Object term17499;

    public ZipArchiveInputStream_init_40762374336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = new Boolean(false);
        term17499 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term17500 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term17505 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term17506 = (byte[]) newByteArray(512);
        Object term17507 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term17508 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term17509 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term17510 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term17511 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term17512 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term17513 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term17514 = (byte[]) newByteArray(0);
        Object term17515 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term17516 = (byte[]) newByteArray(512);
        byte[] term17517 = (byte[]) newByteArray(30);
        byte[] term17518 = (byte[]) newByteArray(1024);
        byte[] term17519 = (byte[]) newByteArray(2);
        byte[] term17520 = (byte[]) newByteArray(4);
        byte[] term17521 = (byte[]) newByteArray(16);
        byte[] term17522 = (byte[]) newByteArray(1);
        setField(term17500, term17500.getClass(), "charsetName", "sjlJAEtRrb");
        setField(term17499, term17499.getClass(), "zipEncoding", term17500);
        setField(term17499, term17499.getClass(), "encoding", "sjlJAEtRrb");
        setBooleanField(term17499, term17499.getClass(), "useUnicodeExtraFields", false);
        setField(term17505, term17505.getClass(), "buf", term17506);
        setIntField(term17505, term17505.getClass(), "pos", 512);
        setField(term17505, term17505.getClass(), "in", null);
        setField(term17499, term17499.getClass(), "in", term17505);
        setLongField(term17508, term17508.getClass(), "address", 137911141272736L);
        setField(term17509, term17509.getClass(), "action", term17508);
        setField(term17510, term17510.getClass(), "action", null);
        setField(term17510, term17510.getClass(), "prev", null);
        setField(term17510, term17510.getClass(), "next", term17509);
        setField(term17510, term17510.getClass(), "list", term17510);
        setField(term17510, term17510.getClass(), "referent", null);
        setField(term17510, term17510.getClass(), "queue", null);
        setField(term17510, term17510.getClass(), "next", null);
        setField(term17510, term17510.getClass(), "discovered", null);
        setField(term17509, term17509.getClass(), "prev", term17510);
        setField(term17511, term17511.getClass(), "action", null);
        setField(term17511, term17511.getClass(), "prev", term17509);
        setField(term17511, term17511.getClass(), "next", null);
        setField(term17511, term17511.getClass(), "list", term17510);
        setField(term17511, term17511.getClass(), "referent", null);
        setField(term17511, term17511.getClass(), "queue", null);
        setField(term17511, term17511.getClass(), "next", null);
        setField(term17511, term17511.getClass(), "discovered", null);
        setField(term17509, term17509.getClass(), "next", term17511);
        setField(term17509, term17509.getClass(), "list", term17510);
        setField(term17509, term17509.getClass(), "referent", term17507);
        setField(term17512, term17512.getClass(), "lock", null);
        setField(term17512, term17512.getClass(), "head", null);
        setLongField(term17512, term17512.getClass(), "queueLength", 0L);
        setField(term17509, term17509.getClass(), "queue", term17512);
        setField(term17509, term17509.getClass(), "next", null);
        setField(term17509, term17509.getClass(), "discovered", null);
        setField(term17508, term17508.getClass(), "cleanable", term17509);
        setField(term17507, term17507.getClass(), "zsRef", term17508);
        setField(term17513, term17513.getClass(), "hb", term17514);
        setIntField(term17513, term17513.getClass(), "offset", 0);
        setBooleanField(term17513, term17513.getClass(), "isReadOnly", false);
        setBooleanField(term17513, term17513.getClass(), "bigEndian", true);
        setBooleanField(term17513, term17513.getClass(), "nativeByteOrder", false);
        setIntField(term17513, term17513.getClass(), "mark", -1);
        setIntField(term17513, term17513.getClass(), "position", 0);
        setIntField(term17513, term17513.getClass(), "limit", 0);
        setIntField(term17513, term17513.getClass(), "capacity", 0);
        setLongField(term17513, term17513.getClass(), "address", 16L);
        setField(term17507, term17507.getClass(), "input", term17513);
        setField(term17507, term17507.getClass(), "inputArray", null);
        setIntField(term17507, term17507.getClass(), "inputPos", 0);
        setIntField(term17507, term17507.getClass(), "inputLim", 0);
        setBooleanField(term17507, term17507.getClass(), "finished", false);
        setBooleanField(term17507, term17507.getClass(), "needDict", false);
        setLongField(term17507, term17507.getClass(), "bytesRead", 0L);
        setLongField(term17507, term17507.getClass(), "bytesWritten", 0L);
        setIntField(term17507, term17507.getClass(), "inputConsumed", 0);
        setIntField(term17507, term17507.getClass(), "outputConsumed", 0);
        setField(term17499, term17499.getClass(), "inf", term17507);
        setField(term17515, term17515.getClass(), "hb", term17516);
        setIntField(term17515, term17515.getClass(), "offset", 0);
        setBooleanField(term17515, term17515.getClass(), "isReadOnly", false);
        setBooleanField(term17515, term17515.getClass(), "bigEndian", true);
        setBooleanField(term17515, term17515.getClass(), "nativeByteOrder", false);
        setIntField(term17515, term17515.getClass(), "mark", -1);
        setIntField(term17515, term17515.getClass(), "position", 0);
        setIntField(term17515, term17515.getClass(), "limit", 0);
        setIntField(term17515, term17515.getClass(), "capacity", 512);
        setLongField(term17515, term17515.getClass(), "address", 16L);
        setField(term17499, term17499.getClass(), "buf", term17515);
        setField(term17499, term17499.getClass(), "current", null);
        setBooleanField(term17499, term17499.getClass(), "closed", false);
        setBooleanField(term17499, term17499.getClass(), "hitCentralDirectory", false);
        setField(term17499, term17499.getClass(), "lastStoredEntry", null);
        setBooleanField(term17499, term17499.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term17499, term17499.getClass(), "LFH_BUF", term17517);
        setField(term17499, term17499.getClass(), "SKIP_BUF", term17518);
        setField(term17499, term17499.getClass(), "SHORT_BUF", term17519);
        setField(term17499, term17499.getClass(), "WORD_BUF", term17520);
        setField(term17499, term17499.getClass(), "TWO_DWORD_BUF", term17521);
        setIntField(term17499, term17499.getClass(), "entriesRead", 0);
        setField(term17499, term17499.getClass(), "SINGLE", term17522);
        setLongField(term17499, term17499.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term17499));
        assertTrue(recursiveEquals(term35, false));
    }

};


