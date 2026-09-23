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

public class ZipArchiveInputStream_readFirstLocalFileHeader_194794476038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term320;

    public ZipArchiveInputStream_readFirstLocalFileHeader_194794476038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term215 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term216 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term218 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term219 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term220 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term221 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term223 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term224 = (byte[]) newByteArray(0);
        byte[] term234 = (byte[]) newByteArray(7);
        Object term250 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term251 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term259 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term279 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term283 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term284 = (byte[]) newByteArray(1);
        byte[] term290 = (byte[]) newByteArray(6);
        byte[] term297 = (byte[]) newByteArray(5);
        byte[] term303 = (byte[]) newByteArray(5);
        byte[] term309 = (byte[]) newByteArray(2);
        byte[] term312 = (byte[]) newByteArray(3);
        byte[] term317 = (byte[]) newByteArray(1);
        setField(term213, term213.getClass(), "zipEncoding", null);
        setBooleanField(term213, term213.getClass(), "useUnicodeExtraFields", true);
        setField(term213, term213.getClass(), "in", null);
        setLongField(term216, term216.getClass(), "address", 127288609926704L);
        setField(term218, term218.getClass(), "action", term216);
        setField(term219, term219.getClass(), "action", null);
        setField(term219, term219.getClass(), "prev", null);
        setField(term219, term219.getClass(), "next", term218);
        setField(term219, term219.getClass(), "list", term219);
        setField(term219, term219.getClass(), "referent", null);
        setField(term219, term219.getClass(), "queue", null);
        setField(term219, term219.getClass(), "next", null);
        setField(term219, term219.getClass(), "discovered", null);
        setField(term218, term218.getClass(), "prev", term219);
        setField(term220, term220.getClass(), "action", null);
        setField(term220, term220.getClass(), "prev", term218);
        setField(term220, term220.getClass(), "next", null);
        setField(term220, term220.getClass(), "list", term219);
        setField(term220, term220.getClass(), "referent", null);
        setField(term220, term220.getClass(), "queue", null);
        setField(term220, term220.getClass(), "next", null);
        setField(term220, term220.getClass(), "discovered", null);
        setField(term218, term218.getClass(), "next", term220);
        setField(term218, term218.getClass(), "list", term219);
        setField(term218, term218.getClass(), "referent", term215);
        setField(term221, term221.getClass(), "lock", null);
        setField(term221, term221.getClass(), "head", null);
        setLongField(term221, term221.getClass(), "queueLength", 0L);
        setField(term218, term218.getClass(), "queue", term221);
        setField(term218, term218.getClass(), "next", null);
        setField(term218, term218.getClass(), "discovered", null);
        setField(term216, term216.getClass(), "cleanable", term218);
        setField(term215, term215.getClass(), "zsRef", term216);
        setField(term223, term223.getClass(), "hb", term224);
        setIntField(term223, term223.getClass(), "offset", 0);
        setBooleanField(term223, term223.getClass(), "isReadOnly", false);
        setBooleanField(term223, term223.getClass(), "bigEndian", true);
        setBooleanField(term223, term223.getClass(), "nativeByteOrder", false);
        setIntField(term223, term223.getClass(), "mark", -1);
        setIntField(term223, term223.getClass(), "position", 0);
        setIntField(term223, term223.getClass(), "limit", 0);
        setIntField(term223, term223.getClass(), "capacity", 0);
        setLongField(term223, term223.getClass(), "address", 16L);
        setField(term215, term215.getClass(), "input", term223);
        setByteElement(term234, 0, (byte) 98);
        setByteElement(term234, 1, (byte) 67);
        setByteElement(term234, 2, (byte) 66);
        setByteElement(term234, 3, (byte) -121);
        setByteElement(term234, 4, (byte) -119);
        setByteElement(term234, 5, (byte) 71);
        setByteElement(term234, 6, (byte) 80);
        setField(term215, term215.getClass(), "inputArray", term234);
        setIntField(term215, term215.getClass(), "inputPos", 1227103734);
        setIntField(term215, term215.getClass(), "inputLim", -1339778481);
        setBooleanField(term215, term215.getClass(), "finished", false);
        setBooleanField(term215, term215.getClass(), "needDict", true);
        setLongField(term215, term215.getClass(), "bytesRead", 7411271909051562686L);
        setLongField(term215, term215.getClass(), "bytesWritten", 4872422362414183754L);
        setIntField(term215, term215.getClass(), "inputConsumed", 1725571209);
        setIntField(term215, term215.getClass(), "outputConsumed", -522618178);
        setField(term213, term213.getClass(), "inf", term215);
        setField(term213, term213.getClass(), "buf", null);
        setIntField(term251, term251.getClass(), "method", -1);
        setLongField(term251, term251.getClass(), "size", -1L);
        setIntField(term251, term251.getClass(), "internalAttributes", 0);
        setIntField(term251, term251.getClass(), "platform", 0);
        setLongField(term251, term251.getClass(), "externalAttributes", 0L);
        setField(term251, term251.getClass(), "extraFields", null);
        setField(term251, term251.getClass(), "unparseableExtra", null);
        setField(term251, term251.getClass(), "name", "");
        setField(term251, term251.getClass(), "rawName", null);
        setBooleanField(term259, term259.getClass(), "languageEncodingFlag", false);
        setBooleanField(term259, term259.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term259, term259.getClass(), "encryptionFlag", false);
        setBooleanField(term259, term259.getClass(), "strongEncryptionFlag", false);
        setIntField(term259, term259.getClass(), "slidingDictionarySize", 0);
        setIntField(term259, term259.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term251, term251.getClass(), "gpb", term259);
        setLongField(term251, term251.getClass(), "xdostime", -1L);
        setField(term251, term251.getClass(), "mtime", null);
        setField(term251, term251.getClass(), "atime", null);
        setField(term251, term251.getClass(), "ctime", null);
        setLongField(term251, term251.getClass(), "crc", -1L);
        setLongField(term251, term251.getClass(), "csize", -1L);
        setIntField(term251, term251.getClass(), "flag", 0);
        setField(term251, term251.getClass(), "extra", null);
        setField(term251, term251.getClass(), "comment", null);
        setField(term250, term250.getClass(), "entry", term251);
        setBooleanField(term250, term250.getClass(), "hasDataDescriptor", false);
        setBooleanField(term250, term250.getClass(), "usesZip64", false);
        setLongField(term250, term250.getClass(), "bytesRead", 6811161968424632369L);
        setLongField(term250, term250.getClass(), "bytesReadFromStream", -7237588299778557629L);
        setIntField(term279, term279.getClass(), "crc", 0);
        setField(term250, term250.getClass(), "crc", term279);
        setField(term250, term250.getClass(), "in", null);
        setField(term213, term213.getClass(), "current", term250);
        setBooleanField(term213, term213.getClass(), "closed", true);
        setBooleanField(term213, term213.getClass(), "hitCentralDirectory", true);
        setByteElement(term284, 0, (byte) 42);
        setField(term283, term283.getClass(), "buf", term284);
        setIntField(term283, term283.getClass(), "pos", 1134449235);
        setIntField(term283, term283.getClass(), "mark", -883034806);
        setIntField(term283, term283.getClass(), "count", 1585847225);
        setField(term213, term213.getClass(), "lastStoredEntry", term283);
        setBooleanField(term213, term213.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setByteElement(term290, 0, (byte) 72);
        setByteElement(term290, 1, (byte) 111);
        setByteElement(term290, 2, (byte) 99);
        setByteElement(term290, 3, (byte) -12);
        setByteElement(term290, 4, (byte) -61);
        setByteElement(term290, 5, (byte) -85);
        setField(term213, term213.getClass(), "LFH_BUF", term290);
        setByteElement(term297, 0, (byte) -22);
        setByteElement(term297, 1, (byte) 93);
        setByteElement(term297, 2, (byte) 69);
        setByteElement(term297, 3, (byte) -74);
        setByteElement(term297, 4, (byte) -123);
        setField(term213, term213.getClass(), "SKIP_BUF", term297);
        setByteElement(term303, 0, (byte) -23);
        setByteElement(term303, 1, (byte) 100);
        setByteElement(term303, 2, (byte) 106);
        setByteElement(term303, 3, (byte) -57);
        setByteElement(term303, 4, (byte) -103);
        setField(term213, term213.getClass(), "SHORT_BUF", term303);
        setByteElement(term309, 0, (byte) 98);
        setByteElement(term309, 1, (byte) 79);
        setField(term213, term213.getClass(), "WORD_BUF", term309);
        setByteElement(term312, 0, (byte) 61);
        setByteElement(term312, 1, (byte) -92);
        setByteElement(term312, 2, (byte) -42);
        setField(term213, term213.getClass(), "TWO_DWORD_BUF", term312);
        setIntField(term213, term213.getClass(), "entriesRead", 597278769);
        setByteElement(term317, 0, (byte) 116);
        setField(term213, term213.getClass(), "SINGLE", term317);
        setLongField(term213, term213.getClass(), "bytesRead", 6967924379644551255L);
        term320 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term320;
        try {
            callMethod(klass, "readFirstLocalFileHeader", argTypes, term213, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


