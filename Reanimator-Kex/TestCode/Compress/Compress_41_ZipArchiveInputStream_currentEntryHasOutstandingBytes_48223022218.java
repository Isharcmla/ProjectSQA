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
import java.lang.Object;

public class ZipArchiveInputStream_currentEntryHasOutstandingBytes_48223022218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2260;

    public ZipArchiveInputStream_currentEntryHasOutstandingBytes_48223022218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2260 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term2274 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term2275 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term2277 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2278 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2279 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2280 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2282 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term2283 = (byte[]) newByteArray(0);
        byte[] term2293 = (byte[]) newByteArray(1);
        Object term2303 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term2304 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term2315 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term2335 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term2339 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term2340 = (byte[]) newByteArray(0);
        byte[] term2345 = (byte[]) newByteArray(1);
        byte[] term2347 = (byte[]) newByteArray(5);
        byte[] term2353 = (byte[]) newByteArray(3);
        byte[] term2357 = (byte[]) newByteArray(2);
        byte[] term2360 = (byte[]) newByteArray(2);
        byte[] term2364 = (byte[]) newByteArray(5);
        setField(term2260, term2260.getClass(), "zipEncoding", null);
        setField(term2260, term2260.getClass(), "encoding", "aJlieCFVtF");
        setBooleanField(term2260, term2260.getClass(), "useUnicodeExtraFields", false);
        setField(term2260, term2260.getClass(), "in", null);
        setLongField(term2275, term2275.getClass(), "address", 131118842118608L);
        setField(term2277, term2277.getClass(), "action", term2275);
        setField(term2278, term2278.getClass(), "action", null);
        setField(term2278, term2278.getClass(), "prev", null);
        setField(term2278, term2278.getClass(), "next", term2277);
        setField(term2278, term2278.getClass(), "list", term2278);
        setField(term2278, term2278.getClass(), "referent", null);
        setField(term2278, term2278.getClass(), "queue", null);
        setField(term2278, term2278.getClass(), "next", null);
        setField(term2278, term2278.getClass(), "discovered", null);
        setField(term2277, term2277.getClass(), "prev", term2278);
        setField(term2279, term2279.getClass(), "action", null);
        setField(term2279, term2279.getClass(), "prev", term2277);
        setField(term2279, term2279.getClass(), "next", null);
        setField(term2279, term2279.getClass(), "list", term2278);
        setField(term2279, term2279.getClass(), "referent", null);
        setField(term2279, term2279.getClass(), "queue", null);
        setField(term2279, term2279.getClass(), "next", null);
        setField(term2279, term2279.getClass(), "discovered", null);
        setField(term2277, term2277.getClass(), "next", term2279);
        setField(term2277, term2277.getClass(), "list", term2278);
        setField(term2277, term2277.getClass(), "referent", term2274);
        setField(term2280, term2280.getClass(), "lock", null);
        setField(term2280, term2280.getClass(), "head", null);
        setLongField(term2280, term2280.getClass(), "queueLength", 0L);
        setField(term2277, term2277.getClass(), "queue", term2280);
        setField(term2277, term2277.getClass(), "next", null);
        setField(term2277, term2277.getClass(), "discovered", null);
        setField(term2275, term2275.getClass(), "cleanable", term2277);
        setField(term2274, term2274.getClass(), "zsRef", term2275);
        setField(term2282, term2282.getClass(), "hb", term2283);
        setIntField(term2282, term2282.getClass(), "offset", 0);
        setBooleanField(term2282, term2282.getClass(), "isReadOnly", false);
        setBooleanField(term2282, term2282.getClass(), "bigEndian", true);
        setBooleanField(term2282, term2282.getClass(), "nativeByteOrder", false);
        setIntField(term2282, term2282.getClass(), "mark", -1);
        setIntField(term2282, term2282.getClass(), "position", 0);
        setIntField(term2282, term2282.getClass(), "limit", 0);
        setIntField(term2282, term2282.getClass(), "capacity", 0);
        setLongField(term2282, term2282.getClass(), "address", 16L);
        setField(term2274, term2274.getClass(), "input", term2282);
        setByteElement(term2293, 0, (byte) -106);
        setField(term2274, term2274.getClass(), "inputArray", term2293);
        setIntField(term2274, term2274.getClass(), "inputPos", -1210583429);
        setIntField(term2274, term2274.getClass(), "inputLim", -663691365);
        setBooleanField(term2274, term2274.getClass(), "finished", true);
        setBooleanField(term2274, term2274.getClass(), "needDict", true);
        setLongField(term2274, term2274.getClass(), "bytesRead", -1610676979013636850L);
        setLongField(term2274, term2274.getClass(), "bytesWritten", 2062173786000223358L);
        setIntField(term2274, term2274.getClass(), "inputConsumed", 339854490);
        setIntField(term2274, term2274.getClass(), "outputConsumed", -615654495);
        setField(term2260, term2260.getClass(), "inf", term2274);
        setField(term2260, term2260.getClass(), "buf", null);
        setIntField(term2304, term2304.getClass(), "method", -1);
        setLongField(term2304, term2304.getClass(), "size", -1L);
        setIntField(term2304, term2304.getClass(), "internalAttributes", 0);
        setIntField(term2304, term2304.getClass(), "versionRequired", 0);
        setIntField(term2304, term2304.getClass(), "versionMadeBy", 0);
        setIntField(term2304, term2304.getClass(), "platform", 0);
        setIntField(term2304, term2304.getClass(), "rawFlag", 0);
        setLongField(term2304, term2304.getClass(), "externalAttributes", 0L);
        setField(term2304, term2304.getClass(), "extraFields", null);
        setField(term2304, term2304.getClass(), "unparseableExtra", null);
        setField(term2304, term2304.getClass(), "name", "");
        setField(term2304, term2304.getClass(), "rawName", null);
        setBooleanField(term2315, term2315.getClass(), "languageEncodingFlag", false);
        setBooleanField(term2315, term2315.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term2315, term2315.getClass(), "encryptionFlag", false);
        setBooleanField(term2315, term2315.getClass(), "strongEncryptionFlag", false);
        setIntField(term2315, term2315.getClass(), "slidingDictionarySize", 0);
        setIntField(term2315, term2315.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term2304, term2304.getClass(), "gpb", term2315);
        setLongField(term2304, term2304.getClass(), "xdostime", -1L);
        setField(term2304, term2304.getClass(), "mtime", null);
        setField(term2304, term2304.getClass(), "atime", null);
        setField(term2304, term2304.getClass(), "ctime", null);
        setLongField(term2304, term2304.getClass(), "crc", -1L);
        setLongField(term2304, term2304.getClass(), "csize", -1L);
        setIntField(term2304, term2304.getClass(), "flag", 0);
        setField(term2304, term2304.getClass(), "extra", null);
        setField(term2304, term2304.getClass(), "comment", null);
        setField(term2303, term2303.getClass(), "entry", term2304);
        setBooleanField(term2303, term2303.getClass(), "hasDataDescriptor", false);
        setBooleanField(term2303, term2303.getClass(), "usesZip64", false);
        setLongField(term2303, term2303.getClass(), "bytesRead", -8658027316505137504L);
        setLongField(term2303, term2303.getClass(), "bytesReadFromStream", 414749984815662075L);
        setIntField(term2335, term2335.getClass(), "crc", 0);
        setField(term2303, term2303.getClass(), "crc", term2335);
        setField(term2303, term2303.getClass(), "in", null);
        setField(term2260, term2260.getClass(), "current", term2303);
        setBooleanField(term2260, term2260.getClass(), "closed", true);
        setBooleanField(term2260, term2260.getClass(), "hitCentralDirectory", true);
        setField(term2339, term2339.getClass(), "buf", term2340);
        setIntField(term2339, term2339.getClass(), "pos", -1476117762);
        setIntField(term2339, term2339.getClass(), "mark", -341962980);
        setIntField(term2339, term2339.getClass(), "count", 1532716628);
        setField(term2260, term2260.getClass(), "lastStoredEntry", term2339);
        setBooleanField(term2260, term2260.getClass(), "allowStoredEntriesWithDataDescriptor", true);
        setByteElement(term2345, 0, (byte) 58);
        setField(term2260, term2260.getClass(), "LFH_BUF", term2345);
        setByteElement(term2347, 0, (byte) 77);
        setByteElement(term2347, 1, (byte) -54);
        setByteElement(term2347, 2, (byte) -59);
        setByteElement(term2347, 3, (byte) 103);
        setByteElement(term2347, 4, (byte) 127);
        setField(term2260, term2260.getClass(), "SKIP_BUF", term2347);
        setByteElement(term2353, 0, (byte) 58);
        setByteElement(term2353, 1, (byte) -98);
        setByteElement(term2353, 2, (byte) 48);
        setField(term2260, term2260.getClass(), "SHORT_BUF", term2353);
        setByteElement(term2357, 0, (byte) 15);
        setByteElement(term2357, 1, (byte) 73);
        setField(term2260, term2260.getClass(), "WORD_BUF", term2357);
        setByteElement(term2360, 0, (byte) -77);
        setByteElement(term2360, 1, (byte) -11);
        setField(term2260, term2260.getClass(), "TWO_DWORD_BUF", term2360);
        setIntField(term2260, term2260.getClass(), "entriesRead", -1801760683);
        setByteElement(term2364, 0, (byte) -95);
        setByteElement(term2364, 1, (byte) 114);
        setByteElement(term2364, 2, (byte) -9);
        setByteElement(term2364, 3, (byte) -113);
        setByteElement(term2364, 4, (byte) -42);
        setField(term2260, term2260.getClass(), "SINGLE", term2364);
        setLongField(term2260, term2260.getClass(), "bytesRead", 463622836963501975L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "currentEntryHasOutstandingBytes", argTypes, term2260, args);
    }

};


