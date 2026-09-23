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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZipArchiveInputStream_readFirstLocalFileHeader_194794476039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238;
     Object term360;

    public ZipArchiveInputStream_readFirstLocalFileHeader_194794476039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term252 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term253 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term255 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term256 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term257 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term258 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term260 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term261 = (byte[]) newByteArray(0);
        byte[] term271 = (byte[]) newByteArray(7);
        Object term287 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term288 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term299 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term319 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term323 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term324 = (byte[]) newByteArray(1);
        byte[] term330 = (byte[]) newByteArray(6);
        byte[] term337 = (byte[]) newByteArray(5);
        byte[] term343 = (byte[]) newByteArray(5);
        byte[] term349 = (byte[]) newByteArray(2);
        byte[] term352 = (byte[]) newByteArray(3);
        byte[] term357 = (byte[]) newByteArray(1);
        setField(term238, term238.getClass(), "zipEncoding", null);
        setField(term238, term238.getClass(), "encoding", "jJCZpVmanW");
        setBooleanField(term238, term238.getClass(), "useUnicodeExtraFields", true);
        setField(term238, term238.getClass(), "in", null);
        setLongField(term253, term253.getClass(), "address", 131118848349424L);
        setField(term255, term255.getClass(), "action", term253);
        setField(term256, term256.getClass(), "action", null);
        setField(term256, term256.getClass(), "prev", null);
        setField(term256, term256.getClass(), "next", term255);
        setField(term256, term256.getClass(), "list", term256);
        setField(term256, term256.getClass(), "referent", null);
        setField(term256, term256.getClass(), "queue", null);
        setField(term256, term256.getClass(), "next", null);
        setField(term256, term256.getClass(), "discovered", null);
        setField(term255, term255.getClass(), "prev", term256);
        setField(term257, term257.getClass(), "action", null);
        setField(term257, term257.getClass(), "prev", term255);
        setField(term257, term257.getClass(), "next", null);
        setField(term257, term257.getClass(), "list", term256);
        setField(term257, term257.getClass(), "referent", null);
        setField(term257, term257.getClass(), "queue", null);
        setField(term257, term257.getClass(), "next", null);
        setField(term257, term257.getClass(), "discovered", null);
        setField(term255, term255.getClass(), "next", term257);
        setField(term255, term255.getClass(), "list", term256);
        setField(term255, term255.getClass(), "referent", term252);
        setField(term258, term258.getClass(), "lock", null);
        setField(term258, term258.getClass(), "head", null);
        setLongField(term258, term258.getClass(), "queueLength", 0L);
        setField(term255, term255.getClass(), "queue", term258);
        setField(term255, term255.getClass(), "next", null);
        setField(term255, term255.getClass(), "discovered", null);
        setField(term253, term253.getClass(), "cleanable", term255);
        setField(term252, term252.getClass(), "zsRef", term253);
        setField(term260, term260.getClass(), "hb", term261);
        setIntField(term260, term260.getClass(), "offset", 0);
        setBooleanField(term260, term260.getClass(), "isReadOnly", false);
        setBooleanField(term260, term260.getClass(), "bigEndian", true);
        setBooleanField(term260, term260.getClass(), "nativeByteOrder", false);
        setIntField(term260, term260.getClass(), "mark", -1);
        setIntField(term260, term260.getClass(), "position", 0);
        setIntField(term260, term260.getClass(), "limit", 0);
        setIntField(term260, term260.getClass(), "capacity", 0);
        setLongField(term260, term260.getClass(), "address", 16L);
        setField(term252, term252.getClass(), "input", term260);
        setByteElement(term271, 0, (byte) 98);
        setByteElement(term271, 1, (byte) 67);
        setByteElement(term271, 2, (byte) 66);
        setByteElement(term271, 3, (byte) -121);
        setByteElement(term271, 4, (byte) -119);
        setByteElement(term271, 5, (byte) 71);
        setByteElement(term271, 6, (byte) 80);
        setField(term252, term252.getClass(), "inputArray", term271);
        setIntField(term252, term252.getClass(), "inputPos", 1227103734);
        setIntField(term252, term252.getClass(), "inputLim", -1339778481);
        setBooleanField(term252, term252.getClass(), "finished", false);
        setBooleanField(term252, term252.getClass(), "needDict", true);
        setLongField(term252, term252.getClass(), "bytesRead", 7411271909051562686L);
        setLongField(term252, term252.getClass(), "bytesWritten", 4872422362414183754L);
        setIntField(term252, term252.getClass(), "inputConsumed", 1725571209);
        setIntField(term252, term252.getClass(), "outputConsumed", -522618178);
        setField(term238, term238.getClass(), "inf", term252);
        setField(term238, term238.getClass(), "buf", null);
        setIntField(term288, term288.getClass(), "method", -1);
        setLongField(term288, term288.getClass(), "size", -1L);
        setIntField(term288, term288.getClass(), "internalAttributes", 0);
        setIntField(term288, term288.getClass(), "versionRequired", 0);
        setIntField(term288, term288.getClass(), "versionMadeBy", 0);
        setIntField(term288, term288.getClass(), "platform", 0);
        setIntField(term288, term288.getClass(), "rawFlag", 0);
        setLongField(term288, term288.getClass(), "externalAttributes", 0L);
        setField(term288, term288.getClass(), "extraFields", null);
        setField(term288, term288.getClass(), "unparseableExtra", null);
        setField(term288, term288.getClass(), "name", "");
        setField(term288, term288.getClass(), "rawName", null);
        setBooleanField(term299, term299.getClass(), "languageEncodingFlag", false);
        setBooleanField(term299, term299.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term299, term299.getClass(), "encryptionFlag", false);
        setBooleanField(term299, term299.getClass(), "strongEncryptionFlag", false);
        setIntField(term299, term299.getClass(), "slidingDictionarySize", 0);
        setIntField(term299, term299.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term288, term288.getClass(), "gpb", term299);
        setLongField(term288, term288.getClass(), "xdostime", -1L);
        setField(term288, term288.getClass(), "mtime", null);
        setField(term288, term288.getClass(), "atime", null);
        setField(term288, term288.getClass(), "ctime", null);
        setLongField(term288, term288.getClass(), "crc", -1L);
        setLongField(term288, term288.getClass(), "csize", -1L);
        setIntField(term288, term288.getClass(), "flag", 0);
        setField(term288, term288.getClass(), "extra", null);
        setField(term288, term288.getClass(), "comment", null);
        setField(term287, term287.getClass(), "entry", term288);
        setBooleanField(term287, term287.getClass(), "hasDataDescriptor", false);
        setBooleanField(term287, term287.getClass(), "usesZip64", false);
        setLongField(term287, term287.getClass(), "bytesRead", 6811161968424632369L);
        setLongField(term287, term287.getClass(), "bytesReadFromStream", -7237588299778557629L);
        setIntField(term319, term319.getClass(), "crc", 0);
        setField(term287, term287.getClass(), "crc", term319);
        setField(term287, term287.getClass(), "in", null);
        setField(term238, term238.getClass(), "current", term287);
        setBooleanField(term238, term238.getClass(), "closed", true);
        setBooleanField(term238, term238.getClass(), "hitCentralDirectory", true);
        setByteElement(term324, 0, (byte) 42);
        setField(term323, term323.getClass(), "buf", term324);
        setIntField(term323, term323.getClass(), "pos", 1134449235);
        setIntField(term323, term323.getClass(), "mark", -883034806);
        setIntField(term323, term323.getClass(), "count", 1585847225);
        setField(term238, term238.getClass(), "lastStoredEntry", term323);
        setBooleanField(term238, term238.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setByteElement(term330, 0, (byte) 72);
        setByteElement(term330, 1, (byte) 111);
        setByteElement(term330, 2, (byte) 99);
        setByteElement(term330, 3, (byte) -12);
        setByteElement(term330, 4, (byte) -61);
        setByteElement(term330, 5, (byte) -85);
        setField(term238, term238.getClass(), "LFH_BUF", term330);
        setByteElement(term337, 0, (byte) -22);
        setByteElement(term337, 1, (byte) 93);
        setByteElement(term337, 2, (byte) 69);
        setByteElement(term337, 3, (byte) -74);
        setByteElement(term337, 4, (byte) -123);
        setField(term238, term238.getClass(), "SKIP_BUF", term337);
        setByteElement(term343, 0, (byte) -23);
        setByteElement(term343, 1, (byte) 100);
        setByteElement(term343, 2, (byte) 106);
        setByteElement(term343, 3, (byte) -57);
        setByteElement(term343, 4, (byte) -103);
        setField(term238, term238.getClass(), "SHORT_BUF", term343);
        setByteElement(term349, 0, (byte) 98);
        setByteElement(term349, 1, (byte) 79);
        setField(term238, term238.getClass(), "WORD_BUF", term349);
        setByteElement(term352, 0, (byte) 61);
        setByteElement(term352, 1, (byte) -92);
        setByteElement(term352, 2, (byte) -42);
        setField(term238, term238.getClass(), "TWO_DWORD_BUF", term352);
        setIntField(term238, term238.getClass(), "entriesRead", 597278769);
        setByteElement(term357, 0, (byte) 116);
        setField(term238, term238.getClass(), "SINGLE", term357);
        setLongField(term238, term238.getClass(), "bytesRead", 6967924379644551255L);
        term360 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term360;
        try {
            callMethod(klass, "readFirstLocalFileHeader", argTypes, term238, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


