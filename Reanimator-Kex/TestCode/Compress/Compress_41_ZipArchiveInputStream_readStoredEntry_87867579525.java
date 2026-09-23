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

public class ZipArchiveInputStream_readStoredEntry_87867579525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4323;

    public ZipArchiveInputStream_readStoredEntry_87867579525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4323 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term4337 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term4338 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term4340 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4341 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4342 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4343 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4345 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term4346 = (byte[]) newByteArray(0);
        byte[] term4356 = (byte[]) newByteArray(2);
        Object term4367 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term4368 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term4379 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term4399 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term4403 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term4404 = (byte[]) newByteArray(0);
        byte[] term4409 = (byte[]) newByteArray(6);
        byte[] term4416 = (byte[]) newByteArray(1);
        byte[] term4418 = (byte[]) newByteArray(2);
        byte[] term4421 = (byte[]) newByteArray(4);
        byte[] term4426 = (byte[]) newByteArray(4);
        byte[] term4432 = (byte[]) newByteArray(8);
        setField(term4323, term4323.getClass(), "zipEncoding", null);
        setField(term4323, term4323.getClass(), "encoding", "flxyYxBRtu");
        setBooleanField(term4323, term4323.getClass(), "useUnicodeExtraFields", false);
        setField(term4323, term4323.getClass(), "in", null);
        setLongField(term4338, term4338.getClass(), "address", 131118850632656L);
        setField(term4340, term4340.getClass(), "action", term4338);
        setField(term4341, term4341.getClass(), "action", null);
        setField(term4341, term4341.getClass(), "prev", null);
        setField(term4341, term4341.getClass(), "next", term4340);
        setField(term4341, term4341.getClass(), "list", term4341);
        setField(term4341, term4341.getClass(), "referent", null);
        setField(term4341, term4341.getClass(), "queue", null);
        setField(term4341, term4341.getClass(), "next", null);
        setField(term4341, term4341.getClass(), "discovered", null);
        setField(term4340, term4340.getClass(), "prev", term4341);
        setField(term4342, term4342.getClass(), "action", null);
        setField(term4342, term4342.getClass(), "prev", term4340);
        setField(term4342, term4342.getClass(), "next", null);
        setField(term4342, term4342.getClass(), "list", term4341);
        setField(term4342, term4342.getClass(), "referent", null);
        setField(term4342, term4342.getClass(), "queue", null);
        setField(term4342, term4342.getClass(), "next", null);
        setField(term4342, term4342.getClass(), "discovered", null);
        setField(term4340, term4340.getClass(), "next", term4342);
        setField(term4340, term4340.getClass(), "list", term4341);
        setField(term4340, term4340.getClass(), "referent", term4337);
        setField(term4343, term4343.getClass(), "lock", null);
        setField(term4343, term4343.getClass(), "head", null);
        setLongField(term4343, term4343.getClass(), "queueLength", 0L);
        setField(term4340, term4340.getClass(), "queue", term4343);
        setField(term4340, term4340.getClass(), "next", null);
        setField(term4340, term4340.getClass(), "discovered", null);
        setField(term4338, term4338.getClass(), "cleanable", term4340);
        setField(term4337, term4337.getClass(), "zsRef", term4338);
        setField(term4345, term4345.getClass(), "hb", term4346);
        setIntField(term4345, term4345.getClass(), "offset", 0);
        setBooleanField(term4345, term4345.getClass(), "isReadOnly", false);
        setBooleanField(term4345, term4345.getClass(), "bigEndian", true);
        setBooleanField(term4345, term4345.getClass(), "nativeByteOrder", false);
        setIntField(term4345, term4345.getClass(), "mark", -1);
        setIntField(term4345, term4345.getClass(), "position", 0);
        setIntField(term4345, term4345.getClass(), "limit", 0);
        setIntField(term4345, term4345.getClass(), "capacity", 0);
        setLongField(term4345, term4345.getClass(), "address", 16L);
        setField(term4337, term4337.getClass(), "input", term4345);
        setByteElement(term4356, 0, (byte) 120);
        setByteElement(term4356, 1, (byte) -126);
        setField(term4337, term4337.getClass(), "inputArray", term4356);
        setIntField(term4337, term4337.getClass(), "inputPos", 1296895584);
        setIntField(term4337, term4337.getClass(), "inputLim", 628918458);
        setBooleanField(term4337, term4337.getClass(), "finished", false);
        setBooleanField(term4337, term4337.getClass(), "needDict", true);
        setLongField(term4337, term4337.getClass(), "bytesRead", -8033714905181142681L);
        setLongField(term4337, term4337.getClass(), "bytesWritten", -9040825890007374809L);
        setIntField(term4337, term4337.getClass(), "inputConsumed", -1274456137);
        setIntField(term4337, term4337.getClass(), "outputConsumed", 1041916673);
        setField(term4323, term4323.getClass(), "inf", term4337);
        setField(term4323, term4323.getClass(), "buf", null);
        setIntField(term4368, term4368.getClass(), "method", -1);
        setLongField(term4368, term4368.getClass(), "size", -1L);
        setIntField(term4368, term4368.getClass(), "internalAttributes", 0);
        setIntField(term4368, term4368.getClass(), "versionRequired", 0);
        setIntField(term4368, term4368.getClass(), "versionMadeBy", 0);
        setIntField(term4368, term4368.getClass(), "platform", 0);
        setIntField(term4368, term4368.getClass(), "rawFlag", 0);
        setLongField(term4368, term4368.getClass(), "externalAttributes", 0L);
        setField(term4368, term4368.getClass(), "extraFields", null);
        setField(term4368, term4368.getClass(), "unparseableExtra", null);
        setField(term4368, term4368.getClass(), "name", "");
        setField(term4368, term4368.getClass(), "rawName", null);
        setBooleanField(term4379, term4379.getClass(), "languageEncodingFlag", false);
        setBooleanField(term4379, term4379.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term4379, term4379.getClass(), "encryptionFlag", false);
        setBooleanField(term4379, term4379.getClass(), "strongEncryptionFlag", false);
        setIntField(term4379, term4379.getClass(), "slidingDictionarySize", 0);
        setIntField(term4379, term4379.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term4368, term4368.getClass(), "gpb", term4379);
        setLongField(term4368, term4368.getClass(), "xdostime", -1L);
        setField(term4368, term4368.getClass(), "mtime", null);
        setField(term4368, term4368.getClass(), "atime", null);
        setField(term4368, term4368.getClass(), "ctime", null);
        setLongField(term4368, term4368.getClass(), "crc", -1L);
        setLongField(term4368, term4368.getClass(), "csize", -1L);
        setIntField(term4368, term4368.getClass(), "flag", 0);
        setField(term4368, term4368.getClass(), "extra", null);
        setField(term4368, term4368.getClass(), "comment", null);
        setField(term4367, term4367.getClass(), "entry", term4368);
        setBooleanField(term4367, term4367.getClass(), "hasDataDescriptor", false);
        setBooleanField(term4367, term4367.getClass(), "usesZip64", false);
        setLongField(term4367, term4367.getClass(), "bytesRead", 1368340889161782793L);
        setLongField(term4367, term4367.getClass(), "bytesReadFromStream", -5786861555969446503L);
        setIntField(term4399, term4399.getClass(), "crc", 0);
        setField(term4367, term4367.getClass(), "crc", term4399);
        setField(term4367, term4367.getClass(), "in", null);
        setField(term4323, term4323.getClass(), "current", term4367);
        setBooleanField(term4323, term4323.getClass(), "closed", false);
        setBooleanField(term4323, term4323.getClass(), "hitCentralDirectory", true);
        setField(term4403, term4403.getClass(), "buf", term4404);
        setIntField(term4403, term4403.getClass(), "pos", -601863069);
        setIntField(term4403, term4403.getClass(), "mark", 663292551);
        setIntField(term4403, term4403.getClass(), "count", -1885090354);
        setField(term4323, term4323.getClass(), "lastStoredEntry", term4403);
        setBooleanField(term4323, term4323.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setByteElement(term4409, 0, (byte) -44);
        setByteElement(term4409, 1, (byte) -119);
        setByteElement(term4409, 2, (byte) 65);
        setByteElement(term4409, 3, (byte) -125);
        setByteElement(term4409, 4, (byte) -126);
        setByteElement(term4409, 5, (byte) 80);
        setField(term4323, term4323.getClass(), "LFH_BUF", term4409);
        setByteElement(term4416, 0, (byte) 118);
        setField(term4323, term4323.getClass(), "SKIP_BUF", term4416);
        setByteElement(term4418, 0, (byte) -116);
        setByteElement(term4418, 1, (byte) 85);
        setField(term4323, term4323.getClass(), "SHORT_BUF", term4418);
        setByteElement(term4421, 0, (byte) 24);
        setByteElement(term4421, 1, (byte) -51);
        setByteElement(term4421, 2, (byte) 123);
        setByteElement(term4421, 3, (byte) 104);
        setField(term4323, term4323.getClass(), "WORD_BUF", term4421);
        setByteElement(term4426, 0, (byte) 85);
        setByteElement(term4426, 1, (byte) -27);
        setByteElement(term4426, 2, (byte) 106);
        setByteElement(term4426, 3, (byte) 104);
        setField(term4323, term4323.getClass(), "TWO_DWORD_BUF", term4426);
        setIntField(term4323, term4323.getClass(), "entriesRead", -2066804303);
        setByteElement(term4432, 0, (byte) 28);
        setByteElement(term4432, 1, (byte) -84);
        setByteElement(term4432, 2, (byte) 69);
        setByteElement(term4432, 3, (byte) -101);
        setByteElement(term4432, 4, (byte) -44);
        setByteElement(term4432, 6, (byte) -99);
        setByteElement(term4432, 7, (byte) 36);
        setField(term4323, term4323.getClass(), "SINGLE", term4432);
        setLongField(term4323, term4323.getClass(), "bytesRead", 2354625302846375590L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readStoredEntry", argTypes, term4323, args);
    }

};


