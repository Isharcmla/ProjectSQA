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

public class ZipArchiveInputStream_getBytesInflated_62032565019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2075;

    public ZipArchiveInputStream_getBytesInflated_62032565019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2075 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term2077 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term2078 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term2080 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2081 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2082 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2083 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2085 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term2086 = (byte[]) newByteArray(0);
        byte[] term2096 = (byte[]) newByteArray(4);
        Object term2109 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term2110 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term2118 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term2138 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term2142 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term2143 = (byte[]) newByteArray(8);
        byte[] term2156 = (byte[]) newByteArray(0);
        byte[] term2157 = (byte[]) newByteArray(5);
        byte[] term2163 = (byte[]) newByteArray(4);
        byte[] term2168 = (byte[]) newByteArray(1);
        byte[] term2170 = (byte[]) newByteArray(0);
        byte[] term2172 = (byte[]) newByteArray(6);
        setField(term2075, term2075.getClass(), "zipEncoding", null);
        setBooleanField(term2075, term2075.getClass(), "useUnicodeExtraFields", false);
        setField(term2075, term2075.getClass(), "in", null);
        setLongField(term2078, term2078.getClass(), "address", 127288604062272L);
        setField(term2080, term2080.getClass(), "action", term2078);
        setField(term2081, term2081.getClass(), "action", null);
        setField(term2081, term2081.getClass(), "prev", null);
        setField(term2081, term2081.getClass(), "next", term2080);
        setField(term2081, term2081.getClass(), "list", term2081);
        setField(term2081, term2081.getClass(), "referent", null);
        setField(term2081, term2081.getClass(), "queue", null);
        setField(term2081, term2081.getClass(), "next", null);
        setField(term2081, term2081.getClass(), "discovered", null);
        setField(term2080, term2080.getClass(), "prev", term2081);
        setField(term2082, term2082.getClass(), "action", null);
        setField(term2082, term2082.getClass(), "prev", term2080);
        setField(term2082, term2082.getClass(), "next", null);
        setField(term2082, term2082.getClass(), "list", term2081);
        setField(term2082, term2082.getClass(), "referent", null);
        setField(term2082, term2082.getClass(), "queue", null);
        setField(term2082, term2082.getClass(), "next", null);
        setField(term2082, term2082.getClass(), "discovered", null);
        setField(term2080, term2080.getClass(), "next", term2082);
        setField(term2080, term2080.getClass(), "list", term2081);
        setField(term2080, term2080.getClass(), "referent", term2077);
        setField(term2083, term2083.getClass(), "lock", null);
        setField(term2083, term2083.getClass(), "head", null);
        setLongField(term2083, term2083.getClass(), "queueLength", 0L);
        setField(term2080, term2080.getClass(), "queue", term2083);
        setField(term2080, term2080.getClass(), "next", null);
        setField(term2080, term2080.getClass(), "discovered", null);
        setField(term2078, term2078.getClass(), "cleanable", term2080);
        setField(term2077, term2077.getClass(), "zsRef", term2078);
        setField(term2085, term2085.getClass(), "hb", term2086);
        setIntField(term2085, term2085.getClass(), "offset", 0);
        setBooleanField(term2085, term2085.getClass(), "isReadOnly", false);
        setBooleanField(term2085, term2085.getClass(), "bigEndian", true);
        setBooleanField(term2085, term2085.getClass(), "nativeByteOrder", false);
        setIntField(term2085, term2085.getClass(), "mark", -1);
        setIntField(term2085, term2085.getClass(), "position", 0);
        setIntField(term2085, term2085.getClass(), "limit", 0);
        setIntField(term2085, term2085.getClass(), "capacity", 0);
        setLongField(term2085, term2085.getClass(), "address", 16L);
        setField(term2077, term2077.getClass(), "input", term2085);
        setByteElement(term2096, 0, (byte) 60);
        setByteElement(term2096, 1, (byte) -128);
        setByteElement(term2096, 2, (byte) -55);
        setByteElement(term2096, 3, (byte) -83);
        setField(term2077, term2077.getClass(), "inputArray", term2096);
        setIntField(term2077, term2077.getClass(), "inputPos", 1141317871);
        setIntField(term2077, term2077.getClass(), "inputLim", 890669485);
        setBooleanField(term2077, term2077.getClass(), "finished", true);
        setBooleanField(term2077, term2077.getClass(), "needDict", true);
        setLongField(term2077, term2077.getClass(), "bytesRead", 305759998609888272L);
        setLongField(term2077, term2077.getClass(), "bytesWritten", -8654565919063661957L);
        setIntField(term2077, term2077.getClass(), "inputConsumed", 691577392);
        setIntField(term2077, term2077.getClass(), "outputConsumed", -893623680);
        setField(term2075, term2075.getClass(), "inf", term2077);
        setField(term2075, term2075.getClass(), "buf", null);
        setIntField(term2110, term2110.getClass(), "method", -1);
        setLongField(term2110, term2110.getClass(), "size", -1L);
        setIntField(term2110, term2110.getClass(), "internalAttributes", 0);
        setIntField(term2110, term2110.getClass(), "platform", 0);
        setLongField(term2110, term2110.getClass(), "externalAttributes", 0L);
        setField(term2110, term2110.getClass(), "extraFields", null);
        setField(term2110, term2110.getClass(), "unparseableExtra", null);
        setField(term2110, term2110.getClass(), "name", "");
        setField(term2110, term2110.getClass(), "rawName", null);
        setBooleanField(term2118, term2118.getClass(), "languageEncodingFlag", false);
        setBooleanField(term2118, term2118.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term2118, term2118.getClass(), "encryptionFlag", false);
        setBooleanField(term2118, term2118.getClass(), "strongEncryptionFlag", false);
        setIntField(term2118, term2118.getClass(), "slidingDictionarySize", 0);
        setIntField(term2118, term2118.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term2110, term2110.getClass(), "gpb", term2118);
        setLongField(term2110, term2110.getClass(), "xdostime", -1L);
        setField(term2110, term2110.getClass(), "mtime", null);
        setField(term2110, term2110.getClass(), "atime", null);
        setField(term2110, term2110.getClass(), "ctime", null);
        setLongField(term2110, term2110.getClass(), "crc", -1L);
        setLongField(term2110, term2110.getClass(), "csize", -1L);
        setIntField(term2110, term2110.getClass(), "flag", 0);
        setField(term2110, term2110.getClass(), "extra", null);
        setField(term2110, term2110.getClass(), "comment", null);
        setField(term2109, term2109.getClass(), "entry", term2110);
        setBooleanField(term2109, term2109.getClass(), "hasDataDescriptor", true);
        setBooleanField(term2109, term2109.getClass(), "usesZip64", false);
        setLongField(term2109, term2109.getClass(), "bytesRead", -5248475803419977214L);
        setLongField(term2109, term2109.getClass(), "bytesReadFromStream", -6723783499250797216L);
        setIntField(term2138, term2138.getClass(), "crc", 0);
        setField(term2109, term2109.getClass(), "crc", term2138);
        setField(term2109, term2109.getClass(), "in", null);
        setField(term2075, term2075.getClass(), "current", term2109);
        setBooleanField(term2075, term2075.getClass(), "closed", true);
        setBooleanField(term2075, term2075.getClass(), "hitCentralDirectory", false);
        setByteElement(term2143, 0, (byte) -48);
        setByteElement(term2143, 1, (byte) -113);
        setByteElement(term2143, 2, (byte) 15);
        setByteElement(term2143, 3, (byte) 38);
        setByteElement(term2143, 4, (byte) -54);
        setByteElement(term2143, 5, (byte) -51);
        setByteElement(term2143, 6, (byte) 101);
        setByteElement(term2143, 7, (byte) 40);
        setField(term2142, term2142.getClass(), "buf", term2143);
        setIntField(term2142, term2142.getClass(), "pos", -1963434938);
        setIntField(term2142, term2142.getClass(), "mark", 906181092);
        setIntField(term2142, term2142.getClass(), "count", 1045657203);
        setField(term2075, term2075.getClass(), "lastStoredEntry", term2142);
        setBooleanField(term2075, term2075.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term2075, term2075.getClass(), "LFH_BUF", term2156);
        setByteElement(term2157, 0, (byte) 83);
        setByteElement(term2157, 1, (byte) -41);
        setByteElement(term2157, 2, (byte) -102);
        setByteElement(term2157, 3, (byte) -93);
        setByteElement(term2157, 4, (byte) 111);
        setField(term2075, term2075.getClass(), "SKIP_BUF", term2157);
        setByteElement(term2163, 0, (byte) -4);
        setByteElement(term2163, 1, (byte) -68);
        setByteElement(term2163, 2, (byte) -7);
        setByteElement(term2163, 3, (byte) -109);
        setField(term2075, term2075.getClass(), "SHORT_BUF", term2163);
        setByteElement(term2168, 0, (byte) 69);
        setField(term2075, term2075.getClass(), "WORD_BUF", term2168);
        setField(term2075, term2075.getClass(), "TWO_DWORD_BUF", term2170);
        setIntField(term2075, term2075.getClass(), "entriesRead", 1386130016);
        setByteElement(term2172, 0, (byte) -50);
        setByteElement(term2172, 1, (byte) -103);
        setByteElement(term2172, 2, (byte) 122);
        setByteElement(term2172, 3, (byte) -75);
        setByteElement(term2172, 4, (byte) -72);
        setByteElement(term2172, 5, (byte) -19);
        setField(term2075, term2075.getClass(), "SINGLE", term2172);
        setLongField(term2075, term2075.getClass(), "bytesRead", 41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBytesInflated", argTypes, term2075, args);
    }

};


