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

public class ZipArchiveInputStream_drainCurrentEntryData_115160804719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2400;

    public ZipArchiveInputStream_drainCurrentEntryData_115160804719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2400 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term2414 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term2415 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term2417 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2418 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2419 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2420 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2422 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term2423 = (byte[]) newByteArray(0);
        byte[] term2433 = (byte[]) newByteArray(4);
        Object term2446 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term2447 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term2458 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term2478 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term2482 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term2483 = (byte[]) newByteArray(8);
        byte[] term2496 = (byte[]) newByteArray(0);
        byte[] term2497 = (byte[]) newByteArray(5);
        byte[] term2503 = (byte[]) newByteArray(4);
        byte[] term2508 = (byte[]) newByteArray(1);
        byte[] term2510 = (byte[]) newByteArray(0);
        byte[] term2512 = (byte[]) newByteArray(6);
        setField(term2400, term2400.getClass(), "zipEncoding", null);
        setField(term2400, term2400.getClass(), "encoding", "ZiaGIbnzTs");
        setBooleanField(term2400, term2400.getClass(), "useUnicodeExtraFields", false);
        setField(term2400, term2400.getClass(), "in", null);
        setLongField(term2415, term2415.getClass(), "address", 131118848174880L);
        setField(term2417, term2417.getClass(), "action", term2415);
        setField(term2418, term2418.getClass(), "action", null);
        setField(term2418, term2418.getClass(), "prev", null);
        setField(term2418, term2418.getClass(), "next", term2417);
        setField(term2418, term2418.getClass(), "list", term2418);
        setField(term2418, term2418.getClass(), "referent", null);
        setField(term2418, term2418.getClass(), "queue", null);
        setField(term2418, term2418.getClass(), "next", null);
        setField(term2418, term2418.getClass(), "discovered", null);
        setField(term2417, term2417.getClass(), "prev", term2418);
        setField(term2419, term2419.getClass(), "action", null);
        setField(term2419, term2419.getClass(), "prev", term2417);
        setField(term2419, term2419.getClass(), "next", null);
        setField(term2419, term2419.getClass(), "list", term2418);
        setField(term2419, term2419.getClass(), "referent", null);
        setField(term2419, term2419.getClass(), "queue", null);
        setField(term2419, term2419.getClass(), "next", null);
        setField(term2419, term2419.getClass(), "discovered", null);
        setField(term2417, term2417.getClass(), "next", term2419);
        setField(term2417, term2417.getClass(), "list", term2418);
        setField(term2417, term2417.getClass(), "referent", term2414);
        setField(term2420, term2420.getClass(), "lock", null);
        setField(term2420, term2420.getClass(), "head", null);
        setLongField(term2420, term2420.getClass(), "queueLength", 0L);
        setField(term2417, term2417.getClass(), "queue", term2420);
        setField(term2417, term2417.getClass(), "next", null);
        setField(term2417, term2417.getClass(), "discovered", null);
        setField(term2415, term2415.getClass(), "cleanable", term2417);
        setField(term2414, term2414.getClass(), "zsRef", term2415);
        setField(term2422, term2422.getClass(), "hb", term2423);
        setIntField(term2422, term2422.getClass(), "offset", 0);
        setBooleanField(term2422, term2422.getClass(), "isReadOnly", false);
        setBooleanField(term2422, term2422.getClass(), "bigEndian", true);
        setBooleanField(term2422, term2422.getClass(), "nativeByteOrder", false);
        setIntField(term2422, term2422.getClass(), "mark", -1);
        setIntField(term2422, term2422.getClass(), "position", 0);
        setIntField(term2422, term2422.getClass(), "limit", 0);
        setIntField(term2422, term2422.getClass(), "capacity", 0);
        setLongField(term2422, term2422.getClass(), "address", 16L);
        setField(term2414, term2414.getClass(), "input", term2422);
        setByteElement(term2433, 0, (byte) 60);
        setByteElement(term2433, 1, (byte) -128);
        setByteElement(term2433, 2, (byte) -55);
        setByteElement(term2433, 3, (byte) -83);
        setField(term2414, term2414.getClass(), "inputArray", term2433);
        setIntField(term2414, term2414.getClass(), "inputPos", 1141317871);
        setIntField(term2414, term2414.getClass(), "inputLim", 890669485);
        setBooleanField(term2414, term2414.getClass(), "finished", true);
        setBooleanField(term2414, term2414.getClass(), "needDict", true);
        setLongField(term2414, term2414.getClass(), "bytesRead", 305759998609888272L);
        setLongField(term2414, term2414.getClass(), "bytesWritten", -8654565919063661957L);
        setIntField(term2414, term2414.getClass(), "inputConsumed", 691577392);
        setIntField(term2414, term2414.getClass(), "outputConsumed", -893623680);
        setField(term2400, term2400.getClass(), "inf", term2414);
        setField(term2400, term2400.getClass(), "buf", null);
        setIntField(term2447, term2447.getClass(), "method", -1);
        setLongField(term2447, term2447.getClass(), "size", -1L);
        setIntField(term2447, term2447.getClass(), "internalAttributes", 0);
        setIntField(term2447, term2447.getClass(), "versionRequired", 0);
        setIntField(term2447, term2447.getClass(), "versionMadeBy", 0);
        setIntField(term2447, term2447.getClass(), "platform", 0);
        setIntField(term2447, term2447.getClass(), "rawFlag", 0);
        setLongField(term2447, term2447.getClass(), "externalAttributes", 0L);
        setField(term2447, term2447.getClass(), "extraFields", null);
        setField(term2447, term2447.getClass(), "unparseableExtra", null);
        setField(term2447, term2447.getClass(), "name", "");
        setField(term2447, term2447.getClass(), "rawName", null);
        setBooleanField(term2458, term2458.getClass(), "languageEncodingFlag", false);
        setBooleanField(term2458, term2458.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term2458, term2458.getClass(), "encryptionFlag", false);
        setBooleanField(term2458, term2458.getClass(), "strongEncryptionFlag", false);
        setIntField(term2458, term2458.getClass(), "slidingDictionarySize", 0);
        setIntField(term2458, term2458.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term2447, term2447.getClass(), "gpb", term2458);
        setLongField(term2447, term2447.getClass(), "xdostime", -1L);
        setField(term2447, term2447.getClass(), "mtime", null);
        setField(term2447, term2447.getClass(), "atime", null);
        setField(term2447, term2447.getClass(), "ctime", null);
        setLongField(term2447, term2447.getClass(), "crc", -1L);
        setLongField(term2447, term2447.getClass(), "csize", -1L);
        setIntField(term2447, term2447.getClass(), "flag", 0);
        setField(term2447, term2447.getClass(), "extra", null);
        setField(term2447, term2447.getClass(), "comment", null);
        setField(term2446, term2446.getClass(), "entry", term2447);
        setBooleanField(term2446, term2446.getClass(), "hasDataDescriptor", true);
        setBooleanField(term2446, term2446.getClass(), "usesZip64", false);
        setLongField(term2446, term2446.getClass(), "bytesRead", -5248475803419977214L);
        setLongField(term2446, term2446.getClass(), "bytesReadFromStream", -6723783499250797216L);
        setIntField(term2478, term2478.getClass(), "crc", 0);
        setField(term2446, term2446.getClass(), "crc", term2478);
        setField(term2446, term2446.getClass(), "in", null);
        setField(term2400, term2400.getClass(), "current", term2446);
        setBooleanField(term2400, term2400.getClass(), "closed", true);
        setBooleanField(term2400, term2400.getClass(), "hitCentralDirectory", false);
        setByteElement(term2483, 0, (byte) -48);
        setByteElement(term2483, 1, (byte) -113);
        setByteElement(term2483, 2, (byte) 15);
        setByteElement(term2483, 3, (byte) 38);
        setByteElement(term2483, 4, (byte) -54);
        setByteElement(term2483, 5, (byte) -51);
        setByteElement(term2483, 6, (byte) 101);
        setByteElement(term2483, 7, (byte) 40);
        setField(term2482, term2482.getClass(), "buf", term2483);
        setIntField(term2482, term2482.getClass(), "pos", -1963434938);
        setIntField(term2482, term2482.getClass(), "mark", 906181092);
        setIntField(term2482, term2482.getClass(), "count", 1045657203);
        setField(term2400, term2400.getClass(), "lastStoredEntry", term2482);
        setBooleanField(term2400, term2400.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term2400, term2400.getClass(), "LFH_BUF", term2496);
        setByteElement(term2497, 0, (byte) 83);
        setByteElement(term2497, 1, (byte) -41);
        setByteElement(term2497, 2, (byte) -102);
        setByteElement(term2497, 3, (byte) -93);
        setByteElement(term2497, 4, (byte) 111);
        setField(term2400, term2400.getClass(), "SKIP_BUF", term2497);
        setByteElement(term2503, 0, (byte) -4);
        setByteElement(term2503, 1, (byte) -68);
        setByteElement(term2503, 2, (byte) -7);
        setByteElement(term2503, 3, (byte) -109);
        setField(term2400, term2400.getClass(), "SHORT_BUF", term2503);
        setByteElement(term2508, 0, (byte) 69);
        setField(term2400, term2400.getClass(), "WORD_BUF", term2508);
        setField(term2400, term2400.getClass(), "TWO_DWORD_BUF", term2510);
        setIntField(term2400, term2400.getClass(), "entriesRead", 1386130016);
        setByteElement(term2512, 0, (byte) -50);
        setByteElement(term2512, 1, (byte) -103);
        setByteElement(term2512, 2, (byte) 122);
        setByteElement(term2512, 3, (byte) -75);
        setByteElement(term2512, 4, (byte) -72);
        setByteElement(term2512, 5, (byte) -19);
        setField(term2400, term2400.getClass(), "SINGLE", term2512);
        setLongField(term2400, term2400.getClass(), "bytesRead", 41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "drainCurrentEntryData", argTypes, term2400, args);
    }

};


