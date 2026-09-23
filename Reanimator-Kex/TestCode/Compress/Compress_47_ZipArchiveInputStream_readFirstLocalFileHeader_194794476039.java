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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ZipArchiveInputStream_readFirstLocalFileHeader_194794476039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1155;
     Object term1280;

    public ZipArchiveInputStream_readFirstLocalFileHeader_194794476039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48908 = Class.forName((String) "org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource");
        Field term48907 = ((Class) term48908).getDeclaredField((String) "NAME_WITH_EFS_FLAG");
        ((Field) term48907).setAccessible(true);
        Object enum63 = ((Field) term48907).get((Object) null);
        Class<? extends Object> term49309 = Class.forName((String) "org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource");
        Field term49308 = ((Class) term49309).getDeclaredField((String) "UNICODE_EXTRA_FIELD");
        ((Field) term49308).setAccessible(true);
        Object enum64 = ((Field) term49308).get((Object) null);
        term1155 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term1169 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term1170 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term1172 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term1173 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term1174 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term1175 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1177 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term1178 = (byte[]) newByteArray(0);
        byte[] term1188 = (byte[]) newByteArray(1);
        Object term1198 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term1199 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term1211 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term1240 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term1244 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term1245 = (byte[]) newByteArray(6);
        byte[] term1256 = (byte[]) newByteArray(5);
        byte[] term1262 = (byte[]) newByteArray(5);
        byte[] term1268 = (byte[]) newByteArray(2);
        byte[] term1271 = (byte[]) newByteArray(3);
        byte[] term1275 = (byte[]) newByteArray(1);
        byte[] term1278 = (byte[]) newByteArray(0);
        setField(term1155, term1155.getClass(), "zipEncoding", null);
        setField(term1155, term1155.getClass(), "encoding", "jJCZpVmanW");
        setBooleanField(term1155, term1155.getClass(), "useUnicodeExtraFields", true);
        setField(term1155, term1155.getClass(), "in", null);
        setLongField(term1170, term1170.getClass(), "address", 134562620372496L);
        setField(term1172, term1172.getClass(), "action", term1170);
        setField(term1173, term1173.getClass(), "action", null);
        setField(term1173, term1173.getClass(), "prev", null);
        setField(term1173, term1173.getClass(), "next", term1172);
        setField(term1173, term1173.getClass(), "list", term1173);
        setField(term1173, term1173.getClass(), "referent", null);
        setField(term1173, term1173.getClass(), "queue", null);
        setField(term1173, term1173.getClass(), "next", null);
        setField(term1173, term1173.getClass(), "discovered", null);
        setField(term1172, term1172.getClass(), "prev", term1173);
        setField(term1174, term1174.getClass(), "action", null);
        setField(term1174, term1174.getClass(), "prev", term1172);
        setField(term1174, term1174.getClass(), "next", null);
        setField(term1174, term1174.getClass(), "list", term1173);
        setField(term1174, term1174.getClass(), "referent", null);
        setField(term1174, term1174.getClass(), "queue", null);
        setField(term1174, term1174.getClass(), "next", null);
        setField(term1174, term1174.getClass(), "discovered", null);
        setField(term1172, term1172.getClass(), "next", term1174);
        setField(term1172, term1172.getClass(), "list", term1173);
        setField(term1172, term1172.getClass(), "referent", term1169);
        setField(term1175, term1175.getClass(), "lock", null);
        setField(term1175, term1175.getClass(), "head", null);
        setLongField(term1175, term1175.getClass(), "queueLength", 0L);
        setField(term1172, term1172.getClass(), "queue", term1175);
        setField(term1172, term1172.getClass(), "next", null);
        setField(term1172, term1172.getClass(), "discovered", null);
        setField(term1170, term1170.getClass(), "cleanable", term1172);
        setField(term1169, term1169.getClass(), "zsRef", term1170);
        setField(term1177, term1177.getClass(), "hb", term1178);
        setIntField(term1177, term1177.getClass(), "offset", 0);
        setBooleanField(term1177, term1177.getClass(), "isReadOnly", false);
        setBooleanField(term1177, term1177.getClass(), "bigEndian", true);
        setBooleanField(term1177, term1177.getClass(), "nativeByteOrder", false);
        setIntField(term1177, term1177.getClass(), "mark", -1);
        setIntField(term1177, term1177.getClass(), "position", 0);
        setIntField(term1177, term1177.getClass(), "limit", 0);
        setIntField(term1177, term1177.getClass(), "capacity", 0);
        setLongField(term1177, term1177.getClass(), "address", 16L);
        setField(term1169, term1169.getClass(), "input", term1177);
        setByteElement(term1188, 0, (byte) 98);
        setField(term1169, term1169.getClass(), "inputArray", term1188);
        setIntField(term1169, term1169.getClass(), "inputPos", 1227103734);
        setIntField(term1169, term1169.getClass(), "inputLim", -1339778481);
        setBooleanField(term1169, term1169.getClass(), "finished", false);
        setBooleanField(term1169, term1169.getClass(), "needDict", true);
        setLongField(term1169, term1169.getClass(), "bytesRead", 7411271909051562686L);
        setLongField(term1169, term1169.getClass(), "bytesWritten", 4872422362414183754L);
        setIntField(term1169, term1169.getClass(), "inputConsumed", 1725571209);
        setIntField(term1169, term1169.getClass(), "outputConsumed", -522618178);
        setField(term1155, term1155.getClass(), "inf", term1169);
        setField(term1155, term1155.getClass(), "buf", null);
        setIntField(term1199, term1199.getClass(), "method", -1);
        setLongField(term1199, term1199.getClass(), "size", -1L);
        setIntField(term1199, term1199.getClass(), "internalAttributes", 0);
        setIntField(term1199, term1199.getClass(), "versionRequired", 0);
        setIntField(term1199, term1199.getClass(), "versionMadeBy", 0);
        setIntField(term1199, term1199.getClass(), "platform", 0);
        setIntField(term1199, term1199.getClass(), "rawFlag", 0);
        setLongField(term1199, term1199.getClass(), "externalAttributes", 0L);
        setIntField(term1199, term1199.getClass(), "alignment", 0);
        setField(term1199, term1199.getClass(), "extraFields", null);
        setField(term1199, term1199.getClass(), "unparseableExtra", null);
        setField(term1199, term1199.getClass(), "name", "");
        setField(term1199, term1199.getClass(), "rawName", null);
        setBooleanField(term1211, term1211.getClass(), "languageEncodingFlag", false);
        setBooleanField(term1211, term1211.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term1211, term1211.getClass(), "encryptionFlag", false);
        setBooleanField(term1211, term1211.getClass(), "strongEncryptionFlag", false);
        setIntField(term1211, term1211.getClass(), "slidingDictionarySize", 0);
        setIntField(term1211, term1211.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term1199, term1199.getClass(), "gpb", term1211);
        setLongField(term1199, term1199.getClass(), "localHeaderOffset", -1L);
        setLongField(term1199, term1199.getClass(), "dataOffset", -1L);
        setBooleanField(term1199, term1199.getClass(), "isStreamContiguous", false);
        setField(term1199, term1199.getClass(), "nameSource", enum63);
        setField(term1199, term1199.getClass(), "commentSource", enum64);
        setLongField(term1199, term1199.getClass(), "xdostime", -1L);
        setField(term1199, term1199.getClass(), "mtime", null);
        setField(term1199, term1199.getClass(), "atime", null);
        setField(term1199, term1199.getClass(), "ctime", null);
        setLongField(term1199, term1199.getClass(), "crc", -1L);
        setLongField(term1199, term1199.getClass(), "csize", -1L);
        setIntField(term1199, term1199.getClass(), "flag", 0);
        setField(term1199, term1199.getClass(), "extra", null);
        setField(term1199, term1199.getClass(), "comment", null);
        setField(term1198, term1198.getClass(), "entry", term1199);
        setBooleanField(term1198, term1198.getClass(), "hasDataDescriptor", false);
        setBooleanField(term1198, term1198.getClass(), "usesZip64", false);
        setLongField(term1198, term1198.getClass(), "bytesRead", 6811161968424632369L);
        setLongField(term1198, term1198.getClass(), "bytesReadFromStream", -7237588299778557629L);
        setIntField(term1240, term1240.getClass(), "crc", 0);
        setField(term1198, term1198.getClass(), "crc", term1240);
        setField(term1198, term1198.getClass(), "in", null);
        setField(term1155, term1155.getClass(), "current", term1198);
        setBooleanField(term1155, term1155.getClass(), "closed", true);
        setBooleanField(term1155, term1155.getClass(), "hitCentralDirectory", true);
        setByteElement(term1245, 0, (byte) 67);
        setByteElement(term1245, 1, (byte) 66);
        setByteElement(term1245, 2, (byte) -121);
        setByteElement(term1245, 3, (byte) -119);
        setByteElement(term1245, 4, (byte) 71);
        setByteElement(term1245, 5, (byte) 80);
        setField(term1244, term1244.getClass(), "buf", term1245);
        setIntField(term1244, term1244.getClass(), "pos", 1134449235);
        setIntField(term1244, term1244.getClass(), "mark", -883034806);
        setIntField(term1244, term1244.getClass(), "count", 1585847225);
        setField(term1155, term1155.getClass(), "lastStoredEntry", term1244);
        setBooleanField(term1155, term1155.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setByteElement(term1256, 0, (byte) 42);
        setByteElement(term1256, 1, (byte) 72);
        setByteElement(term1256, 2, (byte) 111);
        setByteElement(term1256, 3, (byte) 99);
        setByteElement(term1256, 4, (byte) -12);
        setField(term1155, term1155.getClass(), "lfhBuf", term1256);
        setByteElement(term1262, 0, (byte) -61);
        setByteElement(term1262, 1, (byte) -85);
        setByteElement(term1262, 2, (byte) -22);
        setByteElement(term1262, 3, (byte) 93);
        setByteElement(term1262, 4, (byte) 69);
        setField(term1155, term1155.getClass(), "skipBuf", term1262);
        setByteElement(term1268, 0, (byte) -74);
        setByteElement(term1268, 1, (byte) -123);
        setField(term1155, term1155.getClass(), "shortBuf", term1268);
        setByteElement(term1271, 0, (byte) -23);
        setByteElement(term1271, 1, (byte) 100);
        setByteElement(term1271, 2, (byte) 106);
        setField(term1155, term1155.getClass(), "wordBuf", term1271);
        setByteElement(term1275, 0, (byte) -57);
        setField(term1155, term1155.getClass(), "twoDwordBuf", term1275);
        setIntField(term1155, term1155.getClass(), "entriesRead", 597278769);
        setField(term1155, term1155.getClass(), "single", term1278);
        setLongField(term1155, term1155.getClass(), "bytesRead", 6967924379644551255L);
        term1280 = (byte[]) newByteArray(2);
        setByteElement(term1280, 0, (byte) -103);
        setByteElement(term1280, 1, (byte) 98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1280;
        try {
            callMethod(klass, "readFirstLocalFileHeader", argTypes, term1155, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


