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
     Object term30696;

    public ZipArchiveInputStream_init_6720531834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30696 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term30697 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term30698 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term30701 = (Object[]) newArray("java.lang.String", 2);
        Object term30706 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term30707 = (byte[]) newByteArray(512);
        Object term30708 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term30709 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term30710 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term30711 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term30712 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term30713 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term30714 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term30715 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term30716 = (byte[]) newByteArray(0);
        Object term30717 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term30718 = (byte[]) newByteArray(512);
        byte[] term30719 = (byte[]) newByteArray(30);
        byte[] term30720 = (byte[]) newByteArray(1024);
        byte[] term30721 = (byte[]) newByteArray(2);
        byte[] term30722 = (byte[]) newByteArray(4);
        byte[] term30723 = (byte[]) newByteArray(16);
        byte[] term30724 = (byte[]) newByteArray(1);
        setField(term30698, term30698.getClass(), "name", "UTF-8");
        setElement(term30701, 0, "");
        setElement(term30701, 1, "");
        setField(term30698, term30698.getClass(), "aliases", term30701);
        setField(term30698, term30698.getClass(), "aliasSet", null);
        setField(term30697, term30697.getClass(), "charset", term30698);
        setBooleanField(term30697, term30697.getClass(), "useReplacement", true);
        setField(term30696, term30696.getClass(), "zipEncoding", term30697);
        setField(term30696, term30696.getClass(), "encoding", "UTF8");
        setBooleanField(term30696, term30696.getClass(), "useUnicodeExtraFields", true);
        setField(term30706, term30706.getClass(), "buf", term30707);
        setIntField(term30706, term30706.getClass(), "pos", 512);
        setField(term30706, term30706.getClass(), "in", null);
        setField(term30696, term30696.getClass(), "in", term30706);
        setLongField(term30709, term30709.getClass(), "address", 131462190539008L);
        setField(term30710, term30710.getClass(), "action", term30709);
        setField(term30711, term30711.getClass(), "action", null);
        setField(term30711, term30711.getClass(), "prev", null);
        setField(term30711, term30711.getClass(), "next", term30710);
        setField(term30711, term30711.getClass(), "list", null);
        setField(term30711, term30711.getClass(), "referent", null);
        setField(term30711, term30711.getClass(), "queue", null);
        setField(term30711, term30711.getClass(), "next", null);
        setField(term30711, term30711.getClass(), "discovered", null);
        setField(term30710, term30710.getClass(), "prev", term30711);
        setField(term30712, term30712.getClass(), "action", null);
        setField(term30712, term30712.getClass(), "prev", term30710);
        setField(term30712, term30712.getClass(), "next", null);
        setField(term30712, term30712.getClass(), "list", null);
        setField(term30712, term30712.getClass(), "referent", null);
        setField(term30712, term30712.getClass(), "queue", null);
        setField(term30712, term30712.getClass(), "next", null);
        setField(term30712, term30712.getClass(), "discovered", null);
        setField(term30710, term30710.getClass(), "next", term30712);
        setField(term30713, term30713.getClass(), "action", null);
        setField(term30713, term30713.getClass(), "prev", null);
        setField(term30713, term30713.getClass(), "next", null);
        setField(term30713, term30713.getClass(), "list", term30713);
        setField(term30713, term30713.getClass(), "referent", null);
        setField(term30713, term30713.getClass(), "queue", null);
        setField(term30713, term30713.getClass(), "next", null);
        setField(term30713, term30713.getClass(), "discovered", null);
        setField(term30710, term30710.getClass(), "list", term30713);
        setField(term30710, term30710.getClass(), "referent", term30708);
        setField(term30714, term30714.getClass(), "lock", null);
        setField(term30714, term30714.getClass(), "head", null);
        setLongField(term30714, term30714.getClass(), "queueLength", 0L);
        setField(term30710, term30710.getClass(), "queue", term30714);
        setField(term30710, term30710.getClass(), "next", null);
        setField(term30710, term30710.getClass(), "discovered", null);
        setField(term30709, term30709.getClass(), "cleanable", term30710);
        setField(term30708, term30708.getClass(), "zsRef", term30709);
        setField(term30715, term30715.getClass(), "hb", term30716);
        setIntField(term30715, term30715.getClass(), "offset", 0);
        setBooleanField(term30715, term30715.getClass(), "isReadOnly", false);
        setBooleanField(term30715, term30715.getClass(), "bigEndian", true);
        setBooleanField(term30715, term30715.getClass(), "nativeByteOrder", false);
        setIntField(term30715, term30715.getClass(), "mark", -1);
        setIntField(term30715, term30715.getClass(), "position", 0);
        setIntField(term30715, term30715.getClass(), "limit", 0);
        setIntField(term30715, term30715.getClass(), "capacity", 0);
        setLongField(term30715, term30715.getClass(), "address", 16L);
        setField(term30708, term30708.getClass(), "input", term30715);
        setField(term30708, term30708.getClass(), "inputArray", null);
        setIntField(term30708, term30708.getClass(), "inputPos", 0);
        setIntField(term30708, term30708.getClass(), "inputLim", 0);
        setBooleanField(term30708, term30708.getClass(), "finished", false);
        setBooleanField(term30708, term30708.getClass(), "needDict", false);
        setLongField(term30708, term30708.getClass(), "bytesRead", 0L);
        setLongField(term30708, term30708.getClass(), "bytesWritten", 0L);
        setIntField(term30708, term30708.getClass(), "inputConsumed", 0);
        setIntField(term30708, term30708.getClass(), "outputConsumed", 0);
        setField(term30696, term30696.getClass(), "inf", term30708);
        setField(term30717, term30717.getClass(), "hb", term30718);
        setIntField(term30717, term30717.getClass(), "offset", 0);
        setBooleanField(term30717, term30717.getClass(), "isReadOnly", false);
        setBooleanField(term30717, term30717.getClass(), "bigEndian", true);
        setBooleanField(term30717, term30717.getClass(), "nativeByteOrder", false);
        setIntField(term30717, term30717.getClass(), "mark", -1);
        setIntField(term30717, term30717.getClass(), "position", 0);
        setIntField(term30717, term30717.getClass(), "limit", 0);
        setIntField(term30717, term30717.getClass(), "capacity", 512);
        setLongField(term30717, term30717.getClass(), "address", 16L);
        setField(term30696, term30696.getClass(), "buf", term30717);
        setField(term30696, term30696.getClass(), "current", null);
        setBooleanField(term30696, term30696.getClass(), "closed", false);
        setBooleanField(term30696, term30696.getClass(), "hitCentralDirectory", false);
        setField(term30696, term30696.getClass(), "lastStoredEntry", null);
        setBooleanField(term30696, term30696.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term30696, term30696.getClass(), "lfhBuf", term30719);
        setField(term30696, term30696.getClass(), "skipBuf", term30720);
        setField(term30696, term30696.getClass(), "shortBuf", term30721);
        setField(term30696, term30696.getClass(), "wordBuf", term30722);
        setField(term30696, term30696.getClass(), "twoDwordBuf", term30723);
        setIntField(term30696, term30696.getClass(), "entriesRead", 0);
        setField(term30696, term30696.getClass(), "single", term30724);
        setLongField(term30696, term30696.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30696));
    }

};


