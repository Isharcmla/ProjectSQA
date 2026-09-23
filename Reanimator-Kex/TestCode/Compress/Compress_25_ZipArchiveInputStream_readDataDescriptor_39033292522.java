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

public class ZipArchiveInputStream_readDataDescriptor_39033292522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2506;

    public ZipArchiveInputStream_readDataDescriptor_39033292522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2506 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term2508 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term2509 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term2511 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2512 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2513 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2514 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2516 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term2517 = (byte[]) newByteArray(0);
        byte[] term2527 = (byte[]) newByteArray(2);
        Object term2538 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term2539 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term2547 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term2567 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term2571 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term2572 = (byte[]) newByteArray(5);
        byte[] term2582 = (byte[]) newByteArray(1);
        byte[] term2584 = (byte[]) newByteArray(8);
        byte[] term2593 = (byte[]) newByteArray(7);
        byte[] term2601 = (byte[]) newByteArray(2);
        byte[] term2604 = (byte[]) newByteArray(2);
        byte[] term2608 = (byte[]) newByteArray(8);
        setField(term2506, term2506.getClass(), "zipEncoding", null);
        setBooleanField(term2506, term2506.getClass(), "useUnicodeExtraFields", false);
        setField(term2506, term2506.getClass(), "in", null);
        setLongField(term2509, term2509.getClass(), "address", 128419730600816L);
        setField(term2511, term2511.getClass(), "action", term2509);
        setField(term2512, term2512.getClass(), "action", null);
        setField(term2512, term2512.getClass(), "prev", null);
        setField(term2512, term2512.getClass(), "next", term2511);
        setField(term2512, term2512.getClass(), "list", term2512);
        setField(term2512, term2512.getClass(), "referent", null);
        setField(term2512, term2512.getClass(), "queue", null);
        setField(term2512, term2512.getClass(), "next", null);
        setField(term2512, term2512.getClass(), "discovered", null);
        setField(term2511, term2511.getClass(), "prev", term2512);
        setField(term2513, term2513.getClass(), "action", null);
        setField(term2513, term2513.getClass(), "prev", term2511);
        setField(term2513, term2513.getClass(), "next", null);
        setField(term2513, term2513.getClass(), "list", term2512);
        setField(term2513, term2513.getClass(), "referent", null);
        setField(term2513, term2513.getClass(), "queue", null);
        setField(term2513, term2513.getClass(), "next", null);
        setField(term2513, term2513.getClass(), "discovered", null);
        setField(term2511, term2511.getClass(), "next", term2513);
        setField(term2511, term2511.getClass(), "list", term2512);
        setField(term2511, term2511.getClass(), "referent", term2508);
        setField(term2514, term2514.getClass(), "lock", null);
        setField(term2514, term2514.getClass(), "head", null);
        setLongField(term2514, term2514.getClass(), "queueLength", 0L);
        setField(term2511, term2511.getClass(), "queue", term2514);
        setField(term2511, term2511.getClass(), "next", null);
        setField(term2511, term2511.getClass(), "discovered", null);
        setField(term2509, term2509.getClass(), "cleanable", term2511);
        setField(term2508, term2508.getClass(), "zsRef", term2509);
        setField(term2516, term2516.getClass(), "hb", term2517);
        setIntField(term2516, term2516.getClass(), "offset", 0);
        setBooleanField(term2516, term2516.getClass(), "isReadOnly", false);
        setBooleanField(term2516, term2516.getClass(), "bigEndian", true);
        setBooleanField(term2516, term2516.getClass(), "nativeByteOrder", false);
        setIntField(term2516, term2516.getClass(), "mark", -1);
        setIntField(term2516, term2516.getClass(), "position", 0);
        setIntField(term2516, term2516.getClass(), "limit", 0);
        setIntField(term2516, term2516.getClass(), "capacity", 0);
        setLongField(term2516, term2516.getClass(), "address", 16L);
        setField(term2508, term2508.getClass(), "input", term2516);
        setByteElement(term2527, 0, (byte) -117);
        setByteElement(term2527, 1, (byte) 97);
        setField(term2508, term2508.getClass(), "inputArray", term2527);
        setIntField(term2508, term2508.getClass(), "inputPos", 1202361360);
        setIntField(term2508, term2508.getClass(), "inputLim", -2015048153);
        setBooleanField(term2508, term2508.getClass(), "finished", false);
        setBooleanField(term2508, term2508.getClass(), "needDict", true);
        setLongField(term2508, term2508.getClass(), "bytesRead", 5946780097489996391L);
        setLongField(term2508, term2508.getClass(), "bytesWritten", -8652538484981166496L);
        setIntField(term2508, term2508.getClass(), "inputConsumed", -2063457669);
        setIntField(term2508, term2508.getClass(), "outputConsumed", -1222006000);
        setField(term2506, term2506.getClass(), "inf", term2508);
        setField(term2506, term2506.getClass(), "buf", null);
        setIntField(term2539, term2539.getClass(), "method", -1);
        setLongField(term2539, term2539.getClass(), "size", -1L);
        setIntField(term2539, term2539.getClass(), "internalAttributes", 0);
        setIntField(term2539, term2539.getClass(), "platform", 0);
        setLongField(term2539, term2539.getClass(), "externalAttributes", 0L);
        setField(term2539, term2539.getClass(), "extraFields", null);
        setField(term2539, term2539.getClass(), "unparseableExtra", null);
        setField(term2539, term2539.getClass(), "name", "");
        setField(term2539, term2539.getClass(), "rawName", null);
        setBooleanField(term2547, term2547.getClass(), "languageEncodingFlag", false);
        setBooleanField(term2547, term2547.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term2547, term2547.getClass(), "encryptionFlag", false);
        setBooleanField(term2547, term2547.getClass(), "strongEncryptionFlag", false);
        setIntField(term2547, term2547.getClass(), "slidingDictionarySize", 0);
        setIntField(term2547, term2547.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term2539, term2539.getClass(), "gpb", term2547);
        setLongField(term2539, term2539.getClass(), "xdostime", -1L);
        setField(term2539, term2539.getClass(), "mtime", null);
        setField(term2539, term2539.getClass(), "atime", null);
        setField(term2539, term2539.getClass(), "ctime", null);
        setLongField(term2539, term2539.getClass(), "crc", -1L);
        setLongField(term2539, term2539.getClass(), "csize", -1L);
        setIntField(term2539, term2539.getClass(), "flag", 0);
        setField(term2539, term2539.getClass(), "extra", null);
        setField(term2539, term2539.getClass(), "comment", null);
        setField(term2538, term2538.getClass(), "entry", term2539);
        setBooleanField(term2538, term2538.getClass(), "hasDataDescriptor", false);
        setBooleanField(term2538, term2538.getClass(), "usesZip64", true);
        setLongField(term2538, term2538.getClass(), "bytesRead", 2701184207686293431L);
        setLongField(term2538, term2538.getClass(), "bytesReadFromStream", 4474998035090263139L);
        setIntField(term2567, term2567.getClass(), "crc", 0);
        setField(term2538, term2538.getClass(), "crc", term2567);
        setField(term2538, term2538.getClass(), "in", null);
        setField(term2506, term2506.getClass(), "current", term2538);
        setBooleanField(term2506, term2506.getClass(), "closed", false);
        setBooleanField(term2506, term2506.getClass(), "hitCentralDirectory", false);
        setByteElement(term2572, 0, (byte) 100);
        setByteElement(term2572, 1, (byte) 79);
        setByteElement(term2572, 2, (byte) -56);
        setByteElement(term2572, 3, (byte) 105);
        setByteElement(term2572, 4, (byte) -8);
        setField(term2571, term2571.getClass(), "buf", term2572);
        setIntField(term2571, term2571.getClass(), "pos", 2095798786);
        setIntField(term2571, term2571.getClass(), "mark", -1565502840);
        setIntField(term2571, term2571.getClass(), "count", 344323424);
        setField(term2506, term2506.getClass(), "lastStoredEntry", term2571);
        setBooleanField(term2506, term2506.getClass(), "allowStoredEntriesWithDataDescriptor", true);
        setByteElement(term2582, 0, (byte) 62);
        setField(term2506, term2506.getClass(), "LFH_BUF", term2582);
        setByteElement(term2584, 0, (byte) 38);
        setByteElement(term2584, 1, (byte) 31);
        setByteElement(term2584, 2, (byte) -105);
        setByteElement(term2584, 3, (byte) 73);
        setByteElement(term2584, 4, (byte) -67);
        setByteElement(term2584, 5, (byte) -72);
        setByteElement(term2584, 6, (byte) 38);
        setByteElement(term2584, 7, (byte) 91);
        setField(term2506, term2506.getClass(), "SKIP_BUF", term2584);
        setByteElement(term2593, 0, (byte) 113);
        setByteElement(term2593, 1, (byte) -75);
        setByteElement(term2593, 2, (byte) -92);
        setByteElement(term2593, 3, (byte) 52);
        setByteElement(term2593, 4, (byte) -101);
        setByteElement(term2593, 5, (byte) -64);
        setByteElement(term2593, 6, (byte) 107);
        setField(term2506, term2506.getClass(), "SHORT_BUF", term2593);
        setByteElement(term2601, 0, (byte) 91);
        setByteElement(term2601, 1, (byte) -24);
        setField(term2506, term2506.getClass(), "WORD_BUF", term2601);
        setByteElement(term2604, 0, (byte) -68);
        setByteElement(term2604, 1, (byte) -75);
        setField(term2506, term2506.getClass(), "TWO_DWORD_BUF", term2604);
        setIntField(term2506, term2506.getClass(), "entriesRead", 9726679);
        setByteElement(term2608, 0, (byte) 82);
        setByteElement(term2608, 1, (byte) -127);
        setByteElement(term2608, 2, (byte) 23);
        setByteElement(term2608, 3, (byte) 98);
        setByteElement(term2608, 4, (byte) 11);
        setByteElement(term2608, 5, (byte) 108);
        setByteElement(term2608, 6, (byte) 97);
        setByteElement(term2608, 7, (byte) -9);
        setField(term2506, term2506.getClass(), "SINGLE", term2608);
        setLongField(term2506, term2506.getClass(), "bytesRead", 2848819812340321742L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readDataDescriptor", argTypes, term2506, args);
    }

};


