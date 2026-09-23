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

public class ZipArchiveInputStream_init_59399576134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11988;

    public ZipArchiveInputStream_init_59399576134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11988 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term11989 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term11992 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term11993 = (byte[]) newByteArray(512);
        Object term11994 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term11995 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term11996 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term11997 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term11998 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term11999 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term12000 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term12001 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term12002 = (byte[]) newByteArray(0);
        Object term12003 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term12004 = (byte[]) newByteArray(512);
        byte[] term12005 = (byte[]) newByteArray(30);
        byte[] term12006 = (byte[]) newByteArray(1024);
        byte[] term12007 = (byte[]) newByteArray(2);
        byte[] term12008 = (byte[]) newByteArray(4);
        byte[] term12009 = (byte[]) newByteArray(16);
        byte[] term12010 = (byte[]) newByteArray(1);
        setField(term11989, term11989.getClass(), "charsetName", "PAEBtnZtTD");
        setField(term11988, term11988.getClass(), "zipEncoding", term11989);
        setBooleanField(term11988, term11988.getClass(), "useUnicodeExtraFields", true);
        setField(term11992, term11992.getClass(), "buf", term11993);
        setIntField(term11992, term11992.getClass(), "pos", 512);
        setField(term11992, term11992.getClass(), "in", null);
        setField(term11988, term11988.getClass(), "in", term11992);
        setLongField(term11995, term11995.getClass(), "address", 132350101949408L);
        setField(term11996, term11996.getClass(), "action", term11995);
        setField(term11997, term11997.getClass(), "action", null);
        setField(term11997, term11997.getClass(), "prev", null);
        setField(term11997, term11997.getClass(), "next", term11996);
        setField(term11997, term11997.getClass(), "list", null);
        setField(term11997, term11997.getClass(), "referent", null);
        setField(term11997, term11997.getClass(), "queue", null);
        setField(term11997, term11997.getClass(), "next", null);
        setField(term11997, term11997.getClass(), "discovered", null);
        setField(term11996, term11996.getClass(), "prev", term11997);
        setField(term11998, term11998.getClass(), "action", null);
        setField(term11998, term11998.getClass(), "prev", term11996);
        setField(term11998, term11998.getClass(), "next", null);
        setField(term11998, term11998.getClass(), "list", null);
        setField(term11998, term11998.getClass(), "referent", null);
        setField(term11998, term11998.getClass(), "queue", null);
        setField(term11998, term11998.getClass(), "next", null);
        setField(term11998, term11998.getClass(), "discovered", null);
        setField(term11996, term11996.getClass(), "next", term11998);
        setField(term11999, term11999.getClass(), "action", null);
        setField(term11999, term11999.getClass(), "prev", null);
        setField(term11999, term11999.getClass(), "next", null);
        setField(term11999, term11999.getClass(), "list", term11999);
        setField(term11999, term11999.getClass(), "referent", null);
        setField(term11999, term11999.getClass(), "queue", null);
        setField(term11999, term11999.getClass(), "next", null);
        setField(term11999, term11999.getClass(), "discovered", null);
        setField(term11996, term11996.getClass(), "list", term11999);
        setField(term11996, term11996.getClass(), "referent", term11994);
        setField(term12000, term12000.getClass(), "lock", null);
        setField(term12000, term12000.getClass(), "head", null);
        setLongField(term12000, term12000.getClass(), "queueLength", 0L);
        setField(term11996, term11996.getClass(), "queue", term12000);
        setField(term11996, term11996.getClass(), "next", null);
        setField(term11996, term11996.getClass(), "discovered", null);
        setField(term11995, term11995.getClass(), "cleanable", term11996);
        setField(term11994, term11994.getClass(), "zsRef", term11995);
        setField(term12001, term12001.getClass(), "hb", term12002);
        setIntField(term12001, term12001.getClass(), "offset", 0);
        setBooleanField(term12001, term12001.getClass(), "isReadOnly", false);
        setBooleanField(term12001, term12001.getClass(), "bigEndian", true);
        setBooleanField(term12001, term12001.getClass(), "nativeByteOrder", false);
        setIntField(term12001, term12001.getClass(), "mark", -1);
        setIntField(term12001, term12001.getClass(), "position", 0);
        setIntField(term12001, term12001.getClass(), "limit", 0);
        setIntField(term12001, term12001.getClass(), "capacity", 0);
        setLongField(term12001, term12001.getClass(), "address", 16L);
        setField(term11994, term11994.getClass(), "input", term12001);
        setField(term11994, term11994.getClass(), "inputArray", null);
        setIntField(term11994, term11994.getClass(), "inputPos", 0);
        setIntField(term11994, term11994.getClass(), "inputLim", 0);
        setBooleanField(term11994, term11994.getClass(), "finished", false);
        setBooleanField(term11994, term11994.getClass(), "needDict", false);
        setLongField(term11994, term11994.getClass(), "bytesRead", 0L);
        setLongField(term11994, term11994.getClass(), "bytesWritten", 0L);
        setIntField(term11994, term11994.getClass(), "inputConsumed", 0);
        setIntField(term11994, term11994.getClass(), "outputConsumed", 0);
        setField(term11988, term11988.getClass(), "inf", term11994);
        setField(term12003, term12003.getClass(), "hb", term12004);
        setIntField(term12003, term12003.getClass(), "offset", 0);
        setBooleanField(term12003, term12003.getClass(), "isReadOnly", false);
        setBooleanField(term12003, term12003.getClass(), "bigEndian", true);
        setBooleanField(term12003, term12003.getClass(), "nativeByteOrder", false);
        setIntField(term12003, term12003.getClass(), "mark", -1);
        setIntField(term12003, term12003.getClass(), "position", 0);
        setIntField(term12003, term12003.getClass(), "limit", 512);
        setIntField(term12003, term12003.getClass(), "capacity", 512);
        setLongField(term12003, term12003.getClass(), "address", 16L);
        setField(term11988, term11988.getClass(), "buf", term12003);
        setField(term11988, term11988.getClass(), "current", null);
        setBooleanField(term11988, term11988.getClass(), "closed", false);
        setBooleanField(term11988, term11988.getClass(), "hitCentralDirectory", false);
        setField(term11988, term11988.getClass(), "lastStoredEntry", null);
        setBooleanField(term11988, term11988.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term11988, term11988.getClass(), "LFH_BUF", term12005);
        setField(term11988, term11988.getClass(), "SKIP_BUF", term12006);
        setField(term11988, term11988.getClass(), "SHORT_BUF", term12007);
        setField(term11988, term11988.getClass(), "WORD_BUF", term12008);
        setField(term11988, term11988.getClass(), "TWO_DWORD_BUF", term12009);
        setIntField(term11988, term11988.getClass(), "entriesRead", 0);
        setField(term11988, term11988.getClass(), "SINGLE", term12010);
        setLongField(term11988, term11988.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term11988));
    }

};


