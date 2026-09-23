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
     Object term12880;

    public ZipArchiveInputStream_init_59399576135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12880 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term12881 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term12886 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term12887 = (byte[]) newByteArray(512);
        Object term12888 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term12889 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term12890 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term12891 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term12892 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term12893 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term12894 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term12895 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term12896 = (byte[]) newByteArray(0);
        Object term12897 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term12898 = (byte[]) newByteArray(512);
        byte[] term12899 = (byte[]) newByteArray(30);
        byte[] term12900 = (byte[]) newByteArray(1024);
        byte[] term12901 = (byte[]) newByteArray(2);
        byte[] term12902 = (byte[]) newByteArray(4);
        byte[] term12903 = (byte[]) newByteArray(16);
        byte[] term12904 = (byte[]) newByteArray(1);
        setField(term12881, term12881.getClass(), "charsetName", "PAEBtnZtTD");
        setField(term12880, term12880.getClass(), "zipEncoding", term12881);
        setField(term12880, term12880.getClass(), "encoding", "PAEBtnZtTD");
        setBooleanField(term12880, term12880.getClass(), "useUnicodeExtraFields", true);
        setField(term12886, term12886.getClass(), "buf", term12887);
        setIntField(term12886, term12886.getClass(), "pos", 512);
        setField(term12886, term12886.getClass(), "in", null);
        setField(term12880, term12880.getClass(), "in", term12886);
        setLongField(term12889, term12889.getClass(), "address", 137911141095712L);
        setField(term12890, term12890.getClass(), "action", term12889);
        setField(term12891, term12891.getClass(), "action", null);
        setField(term12891, term12891.getClass(), "prev", null);
        setField(term12891, term12891.getClass(), "next", term12890);
        setField(term12891, term12891.getClass(), "list", null);
        setField(term12891, term12891.getClass(), "referent", null);
        setField(term12891, term12891.getClass(), "queue", null);
        setField(term12891, term12891.getClass(), "next", null);
        setField(term12891, term12891.getClass(), "discovered", null);
        setField(term12890, term12890.getClass(), "prev", term12891);
        setField(term12892, term12892.getClass(), "action", null);
        setField(term12892, term12892.getClass(), "prev", term12890);
        setField(term12892, term12892.getClass(), "next", null);
        setField(term12892, term12892.getClass(), "list", null);
        setField(term12892, term12892.getClass(), "referent", null);
        setField(term12892, term12892.getClass(), "queue", null);
        setField(term12892, term12892.getClass(), "next", null);
        setField(term12892, term12892.getClass(), "discovered", null);
        setField(term12890, term12890.getClass(), "next", term12892);
        setField(term12893, term12893.getClass(), "action", null);
        setField(term12893, term12893.getClass(), "prev", null);
        setField(term12893, term12893.getClass(), "next", null);
        setField(term12893, term12893.getClass(), "list", term12893);
        setField(term12893, term12893.getClass(), "referent", null);
        setField(term12893, term12893.getClass(), "queue", null);
        setField(term12893, term12893.getClass(), "next", null);
        setField(term12893, term12893.getClass(), "discovered", null);
        setField(term12890, term12890.getClass(), "list", term12893);
        setField(term12890, term12890.getClass(), "referent", term12888);
        setField(term12894, term12894.getClass(), "lock", null);
        setField(term12894, term12894.getClass(), "head", null);
        setLongField(term12894, term12894.getClass(), "queueLength", 0L);
        setField(term12890, term12890.getClass(), "queue", term12894);
        setField(term12890, term12890.getClass(), "next", null);
        setField(term12890, term12890.getClass(), "discovered", null);
        setField(term12889, term12889.getClass(), "cleanable", term12890);
        setField(term12888, term12888.getClass(), "zsRef", term12889);
        setField(term12895, term12895.getClass(), "hb", term12896);
        setIntField(term12895, term12895.getClass(), "offset", 0);
        setBooleanField(term12895, term12895.getClass(), "isReadOnly", false);
        setBooleanField(term12895, term12895.getClass(), "bigEndian", true);
        setBooleanField(term12895, term12895.getClass(), "nativeByteOrder", false);
        setIntField(term12895, term12895.getClass(), "mark", -1);
        setIntField(term12895, term12895.getClass(), "position", 0);
        setIntField(term12895, term12895.getClass(), "limit", 0);
        setIntField(term12895, term12895.getClass(), "capacity", 0);
        setLongField(term12895, term12895.getClass(), "address", 16L);
        setField(term12888, term12888.getClass(), "input", term12895);
        setField(term12888, term12888.getClass(), "inputArray", null);
        setIntField(term12888, term12888.getClass(), "inputPos", 0);
        setIntField(term12888, term12888.getClass(), "inputLim", 0);
        setBooleanField(term12888, term12888.getClass(), "finished", false);
        setBooleanField(term12888, term12888.getClass(), "needDict", false);
        setLongField(term12888, term12888.getClass(), "bytesRead", 0L);
        setLongField(term12888, term12888.getClass(), "bytesWritten", 0L);
        setIntField(term12888, term12888.getClass(), "inputConsumed", 0);
        setIntField(term12888, term12888.getClass(), "outputConsumed", 0);
        setField(term12880, term12880.getClass(), "inf", term12888);
        setField(term12897, term12897.getClass(), "hb", term12898);
        setIntField(term12897, term12897.getClass(), "offset", 0);
        setBooleanField(term12897, term12897.getClass(), "isReadOnly", false);
        setBooleanField(term12897, term12897.getClass(), "bigEndian", true);
        setBooleanField(term12897, term12897.getClass(), "nativeByteOrder", false);
        setIntField(term12897, term12897.getClass(), "mark", -1);
        setIntField(term12897, term12897.getClass(), "position", 0);
        setIntField(term12897, term12897.getClass(), "limit", 0);
        setIntField(term12897, term12897.getClass(), "capacity", 512);
        setLongField(term12897, term12897.getClass(), "address", 16L);
        setField(term12880, term12880.getClass(), "buf", term12897);
        setField(term12880, term12880.getClass(), "current", null);
        setBooleanField(term12880, term12880.getClass(), "closed", false);
        setBooleanField(term12880, term12880.getClass(), "hitCentralDirectory", false);
        setField(term12880, term12880.getClass(), "lastStoredEntry", null);
        setBooleanField(term12880, term12880.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term12880, term12880.getClass(), "LFH_BUF", term12899);
        setField(term12880, term12880.getClass(), "SKIP_BUF", term12900);
        setField(term12880, term12880.getClass(), "SHORT_BUF", term12901);
        setField(term12880, term12880.getClass(), "WORD_BUF", term12902);
        setField(term12880, term12880.getClass(), "TWO_DWORD_BUF", term12903);
        setIntField(term12880, term12880.getClass(), "entriesRead", 0);
        setField(term12880, term12880.getClass(), "SINGLE", term12904);
        setLongField(term12880, term12880.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term12880));
    }

};


