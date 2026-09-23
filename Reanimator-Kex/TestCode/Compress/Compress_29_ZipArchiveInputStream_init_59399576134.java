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
     Object term11982;

    public ZipArchiveInputStream_init_59399576134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11982 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term11983 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term11986 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term11987 = (byte[]) newByteArray(512);
        Object term11988 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term11989 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term11990 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term11991 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term11992 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term11993 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term11994 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term11995 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term11996 = (byte[]) newByteArray(0);
        Object term11997 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term11998 = (byte[]) newByteArray(512);
        byte[] term11999 = (byte[]) newByteArray(30);
        byte[] term12000 = (byte[]) newByteArray(1024);
        byte[] term12001 = (byte[]) newByteArray(2);
        byte[] term12002 = (byte[]) newByteArray(4);
        byte[] term12003 = (byte[]) newByteArray(16);
        byte[] term12004 = (byte[]) newByteArray(1);
        setField(term11983, term11983.getClass(), "charsetName", "PAEBtnZtTD");
        setField(term11982, term11982.getClass(), "zipEncoding", term11983);
        setBooleanField(term11982, term11982.getClass(), "useUnicodeExtraFields", true);
        setField(term11986, term11986.getClass(), "buf", term11987);
        setIntField(term11986, term11986.getClass(), "pos", 512);
        setField(term11986, term11986.getClass(), "in", null);
        setField(term11982, term11982.getClass(), "in", term11986);
        setLongField(term11989, term11989.getClass(), "address", 134047007223936L);
        setField(term11990, term11990.getClass(), "action", term11989);
        setField(term11991, term11991.getClass(), "action", null);
        setField(term11991, term11991.getClass(), "prev", null);
        setField(term11991, term11991.getClass(), "next", term11990);
        setField(term11991, term11991.getClass(), "list", null);
        setField(term11991, term11991.getClass(), "referent", null);
        setField(term11991, term11991.getClass(), "queue", null);
        setField(term11991, term11991.getClass(), "next", null);
        setField(term11991, term11991.getClass(), "discovered", null);
        setField(term11990, term11990.getClass(), "prev", term11991);
        setField(term11992, term11992.getClass(), "action", null);
        setField(term11992, term11992.getClass(), "prev", term11990);
        setField(term11992, term11992.getClass(), "next", null);
        setField(term11992, term11992.getClass(), "list", null);
        setField(term11992, term11992.getClass(), "referent", null);
        setField(term11992, term11992.getClass(), "queue", null);
        setField(term11992, term11992.getClass(), "next", null);
        setField(term11992, term11992.getClass(), "discovered", null);
        setField(term11990, term11990.getClass(), "next", term11992);
        setField(term11993, term11993.getClass(), "action", null);
        setField(term11993, term11993.getClass(), "prev", null);
        setField(term11993, term11993.getClass(), "next", null);
        setField(term11993, term11993.getClass(), "list", term11993);
        setField(term11993, term11993.getClass(), "referent", null);
        setField(term11993, term11993.getClass(), "queue", null);
        setField(term11993, term11993.getClass(), "next", null);
        setField(term11993, term11993.getClass(), "discovered", null);
        setField(term11990, term11990.getClass(), "list", term11993);
        setField(term11990, term11990.getClass(), "referent", term11988);
        setField(term11994, term11994.getClass(), "lock", null);
        setField(term11994, term11994.getClass(), "head", null);
        setLongField(term11994, term11994.getClass(), "queueLength", 0L);
        setField(term11990, term11990.getClass(), "queue", term11994);
        setField(term11990, term11990.getClass(), "next", null);
        setField(term11990, term11990.getClass(), "discovered", null);
        setField(term11989, term11989.getClass(), "cleanable", term11990);
        setField(term11988, term11988.getClass(), "zsRef", term11989);
        setField(term11995, term11995.getClass(), "hb", term11996);
        setIntField(term11995, term11995.getClass(), "offset", 0);
        setBooleanField(term11995, term11995.getClass(), "isReadOnly", false);
        setBooleanField(term11995, term11995.getClass(), "bigEndian", true);
        setBooleanField(term11995, term11995.getClass(), "nativeByteOrder", false);
        setIntField(term11995, term11995.getClass(), "mark", -1);
        setIntField(term11995, term11995.getClass(), "position", 0);
        setIntField(term11995, term11995.getClass(), "limit", 0);
        setIntField(term11995, term11995.getClass(), "capacity", 0);
        setLongField(term11995, term11995.getClass(), "address", 16L);
        setField(term11988, term11988.getClass(), "input", term11995);
        setField(term11988, term11988.getClass(), "inputArray", null);
        setIntField(term11988, term11988.getClass(), "inputPos", 0);
        setIntField(term11988, term11988.getClass(), "inputLim", 0);
        setBooleanField(term11988, term11988.getClass(), "finished", false);
        setBooleanField(term11988, term11988.getClass(), "needDict", false);
        setLongField(term11988, term11988.getClass(), "bytesRead", 0L);
        setLongField(term11988, term11988.getClass(), "bytesWritten", 0L);
        setIntField(term11988, term11988.getClass(), "inputConsumed", 0);
        setIntField(term11988, term11988.getClass(), "outputConsumed", 0);
        setField(term11982, term11982.getClass(), "inf", term11988);
        setField(term11997, term11997.getClass(), "hb", term11998);
        setIntField(term11997, term11997.getClass(), "offset", 0);
        setBooleanField(term11997, term11997.getClass(), "isReadOnly", false);
        setBooleanField(term11997, term11997.getClass(), "bigEndian", true);
        setBooleanField(term11997, term11997.getClass(), "nativeByteOrder", false);
        setIntField(term11997, term11997.getClass(), "mark", -1);
        setIntField(term11997, term11997.getClass(), "position", 0);
        setIntField(term11997, term11997.getClass(), "limit", 0);
        setIntField(term11997, term11997.getClass(), "capacity", 512);
        setLongField(term11997, term11997.getClass(), "address", 16L);
        setField(term11982, term11982.getClass(), "buf", term11997);
        setField(term11982, term11982.getClass(), "current", null);
        setBooleanField(term11982, term11982.getClass(), "closed", false);
        setBooleanField(term11982, term11982.getClass(), "hitCentralDirectory", false);
        setField(term11982, term11982.getClass(), "lastStoredEntry", null);
        setBooleanField(term11982, term11982.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term11982, term11982.getClass(), "LFH_BUF", term11999);
        setField(term11982, term11982.getClass(), "SKIP_BUF", term12000);
        setField(term11982, term11982.getClass(), "SHORT_BUF", term12001);
        setField(term11982, term11982.getClass(), "WORD_BUF", term12002);
        setField(term11982, term11982.getClass(), "TWO_DWORD_BUF", term12003);
        setIntField(term11982, term11982.getClass(), "entriesRead", 0);
        setField(term11982, term11982.getClass(), "SINGLE", term12004);
        setLongField(term11982, term11982.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term11982));
    }

};


