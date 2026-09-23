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
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;

public class ZipArchiveOutputStream_init_204879785827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21270;

    public ZipArchiveOutputStream_init_204879785827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term21273 = new LinkedList();
        HashMap term21275 = new HashMap();
        term21270 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object term21274 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term21278 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term21281 = newInstance(Class.forName("java.util.zip.Deflater"));
        Object term21282 = newInstance(Class.forName("java.util.zip.Deflater$DeflaterZStreamRef"));
        Object term21283 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term21284 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term21285 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term21286 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term21287 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term21288 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term21289 = (byte[]) newByteArray(0);
        byte[] term21290 = (byte[]) newByteArray(512);
        Object term21291 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
        byte[] term21294 = (byte[]) newByteArray(1);
        setField(term21270, term21270.getClass(), "entry", null);
        setField(term21270, term21270.getClass(), "comment", "");
        setIntField(term21270, term21270.getClass(), "level", -1);
        setBooleanField(term21270, term21270.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term21270, term21270.getClass(), "method", 8);
        setField(term21270, term21270.getClass(), "entries", term21273);
        setIntField(term21274, term21274.getClass(), "crc", 0);
        setField(term21270, term21270.getClass(), "crc", term21274);
        setLongField(term21270, term21270.getClass(), "written", 0L);
        setLongField(term21270, term21270.getClass(), "dataStart", 0L);
        setLongField(term21270, term21270.getClass(), "localDataStart", 0L);
        setLongField(term21270, term21270.getClass(), "cdOffset", 0L);
        setLongField(term21270, term21270.getClass(), "cdLength", 0L);
        setField(term21270, term21270.getClass(), "offsets", term21275);
        setField(term21270, term21270.getClass(), "encoding", "UTF8");
        setField(term21278, term21278.getClass(), "charset", "UTF8");
        setField(term21270, term21270.getClass(), "zipEncoding", term21278);
        setLongField(term21282, term21282.getClass(), "address", 126608466584512L);
        setField(term21283, term21283.getClass(), "action", term21282);
        setField(term21284, term21284.getClass(), "action", null);
        setField(term21284, term21284.getClass(), "prev", null);
        setField(term21284, term21284.getClass(), "next", term21283);
        setField(term21284, term21284.getClass(), "list", null);
        setField(term21284, term21284.getClass(), "referent", null);
        setField(term21284, term21284.getClass(), "queue", null);
        setField(term21284, term21284.getClass(), "next", null);
        setField(term21284, term21284.getClass(), "discovered", null);
        setField(term21283, term21283.getClass(), "prev", term21284);
        setField(term21285, term21285.getClass(), "action", null);
        setField(term21285, term21285.getClass(), "prev", term21283);
        setField(term21285, term21285.getClass(), "next", null);
        setField(term21285, term21285.getClass(), "list", null);
        setField(term21285, term21285.getClass(), "referent", null);
        setField(term21285, term21285.getClass(), "queue", null);
        setField(term21285, term21285.getClass(), "next", null);
        setField(term21285, term21285.getClass(), "discovered", null);
        setField(term21283, term21283.getClass(), "next", term21285);
        setField(term21286, term21286.getClass(), "action", null);
        setField(term21286, term21286.getClass(), "prev", null);
        setField(term21286, term21286.getClass(), "next", null);
        setField(term21286, term21286.getClass(), "list", term21286);
        setField(term21286, term21286.getClass(), "referent", null);
        setField(term21286, term21286.getClass(), "queue", null);
        setField(term21286, term21286.getClass(), "next", null);
        setField(term21286, term21286.getClass(), "discovered", null);
        setField(term21283, term21283.getClass(), "list", term21286);
        setField(term21283, term21283.getClass(), "referent", term21281);
        setField(term21287, term21287.getClass(), "lock", null);
        setField(term21287, term21287.getClass(), "head", null);
        setLongField(term21287, term21287.getClass(), "queueLength", 0L);
        setField(term21283, term21283.getClass(), "queue", term21287);
        setField(term21283, term21283.getClass(), "next", null);
        setField(term21283, term21283.getClass(), "discovered", null);
        setField(term21282, term21282.getClass(), "cleanable", term21283);
        setField(term21281, term21281.getClass(), "zsRef", term21282);
        setField(term21288, term21288.getClass(), "hb", term21289);
        setIntField(term21288, term21288.getClass(), "offset", 0);
        setBooleanField(term21288, term21288.getClass(), "isReadOnly", false);
        setBooleanField(term21288, term21288.getClass(), "bigEndian", true);
        setBooleanField(term21288, term21288.getClass(), "nativeByteOrder", false);
        setIntField(term21288, term21288.getClass(), "mark", -1);
        setIntField(term21288, term21288.getClass(), "position", 0);
        setIntField(term21288, term21288.getClass(), "limit", 0);
        setIntField(term21288, term21288.getClass(), "capacity", 0);
        setLongField(term21288, term21288.getClass(), "address", 16L);
        setField(term21281, term21281.getClass(), "input", term21288);
        setField(term21281, term21281.getClass(), "inputArray", null);
        setIntField(term21281, term21281.getClass(), "inputPos", 0);
        setIntField(term21281, term21281.getClass(), "inputLim", 0);
        setIntField(term21281, term21281.getClass(), "level", -1);
        setIntField(term21281, term21281.getClass(), "strategy", 0);
        setBooleanField(term21281, term21281.getClass(), "setParams", false);
        setBooleanField(term21281, term21281.getClass(), "finish", false);
        setBooleanField(term21281, term21281.getClass(), "finished", false);
        setLongField(term21281, term21281.getClass(), "bytesRead", 0L);
        setLongField(term21281, term21281.getClass(), "bytesWritten", 0L);
        setField(term21270, term21270.getClass(), "def", term21281);
        setField(term21270, term21270.getClass(), "buf", term21290);
        setField(term21270, term21270.getClass(), "raf", null);
        setField(term21270, term21270.getClass(), "out", null);
        setBooleanField(term21270, term21270.getClass(), "useEFS", true);
        setBooleanField(term21270, term21270.getClass(), "fallbackToUTF8", false);
        setField(term21291, term21291.getClass(), "name", "never");
        setField(term21270, term21270.getClass(), "createUnicodeExtraFields", term21291);
        setField(term21270, term21270.getClass(), "oneByte", term21294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21270));
    }

};


