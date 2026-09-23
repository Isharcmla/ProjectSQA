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

public class ZipArchiveInputStream_readOneByte_72589887231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4952;

    public ZipArchiveInputStream_readOneByte_72589887231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4952 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term4954 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term4955 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term4957 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4958 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4959 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4960 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4962 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term4963 = (byte[]) newByteArray(0);
        byte[] term4973 = (byte[]) newByteArray(3);
        Object term4985 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term4986 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term4994 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term5014 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term5018 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term5019 = (byte[]) newByteArray(1);
        byte[] term5025 = (byte[]) newByteArray(0);
        byte[] term5026 = (byte[]) newByteArray(0);
        byte[] term5027 = (byte[]) newByteArray(9);
        byte[] term5037 = (byte[]) newByteArray(2);
        byte[] term5040 = (byte[]) newByteArray(9);
        byte[] term5051 = (byte[]) newByteArray(7);
        setField(term4952, term4952.getClass(), "zipEncoding", null);
        setBooleanField(term4952, term4952.getClass(), "useUnicodeExtraFields", true);
        setField(term4952, term4952.getClass(), "in", null);
        setLongField(term4955, term4955.getClass(), "address", 128419724550736L);
        setField(term4957, term4957.getClass(), "action", term4955);
        setField(term4958, term4958.getClass(), "action", null);
        setField(term4958, term4958.getClass(), "prev", null);
        setField(term4958, term4958.getClass(), "next", term4957);
        setField(term4958, term4958.getClass(), "list", term4958);
        setField(term4958, term4958.getClass(), "referent", null);
        setField(term4958, term4958.getClass(), "queue", null);
        setField(term4958, term4958.getClass(), "next", null);
        setField(term4958, term4958.getClass(), "discovered", null);
        setField(term4957, term4957.getClass(), "prev", term4958);
        setField(term4959, term4959.getClass(), "action", null);
        setField(term4959, term4959.getClass(), "prev", term4957);
        setField(term4959, term4959.getClass(), "next", null);
        setField(term4959, term4959.getClass(), "list", term4958);
        setField(term4959, term4959.getClass(), "referent", null);
        setField(term4959, term4959.getClass(), "queue", null);
        setField(term4959, term4959.getClass(), "next", null);
        setField(term4959, term4959.getClass(), "discovered", null);
        setField(term4957, term4957.getClass(), "next", term4959);
        setField(term4957, term4957.getClass(), "list", term4958);
        setField(term4957, term4957.getClass(), "referent", term4954);
        setField(term4960, term4960.getClass(), "lock", null);
        setField(term4960, term4960.getClass(), "head", null);
        setLongField(term4960, term4960.getClass(), "queueLength", 0L);
        setField(term4957, term4957.getClass(), "queue", term4960);
        setField(term4957, term4957.getClass(), "next", null);
        setField(term4957, term4957.getClass(), "discovered", null);
        setField(term4955, term4955.getClass(), "cleanable", term4957);
        setField(term4954, term4954.getClass(), "zsRef", term4955);
        setField(term4962, term4962.getClass(), "hb", term4963);
        setIntField(term4962, term4962.getClass(), "offset", 0);
        setBooleanField(term4962, term4962.getClass(), "isReadOnly", false);
        setBooleanField(term4962, term4962.getClass(), "bigEndian", true);
        setBooleanField(term4962, term4962.getClass(), "nativeByteOrder", false);
        setIntField(term4962, term4962.getClass(), "mark", -1);
        setIntField(term4962, term4962.getClass(), "position", 0);
        setIntField(term4962, term4962.getClass(), "limit", 0);
        setIntField(term4962, term4962.getClass(), "capacity", 0);
        setLongField(term4962, term4962.getClass(), "address", 16L);
        setField(term4954, term4954.getClass(), "input", term4962);
        setByteElement(term4973, 0, (byte) -127);
        setByteElement(term4973, 1, (byte) 85);
        setByteElement(term4973, 2, (byte) -49);
        setField(term4954, term4954.getClass(), "inputArray", term4973);
        setIntField(term4954, term4954.getClass(), "inputPos", -1747406163);
        setIntField(term4954, term4954.getClass(), "inputLim", 388157121);
        setBooleanField(term4954, term4954.getClass(), "finished", true);
        setBooleanField(term4954, term4954.getClass(), "needDict", true);
        setLongField(term4954, term4954.getClass(), "bytesRead", 6843866297465638866L);
        setLongField(term4954, term4954.getClass(), "bytesWritten", -4023935540989049732L);
        setIntField(term4954, term4954.getClass(), "inputConsumed", 1684998508);
        setIntField(term4954, term4954.getClass(), "outputConsumed", -1476644457);
        setField(term4952, term4952.getClass(), "inf", term4954);
        setField(term4952, term4952.getClass(), "buf", null);
        setIntField(term4986, term4986.getClass(), "method", -1);
        setLongField(term4986, term4986.getClass(), "size", -1L);
        setIntField(term4986, term4986.getClass(), "internalAttributes", 0);
        setIntField(term4986, term4986.getClass(), "platform", 0);
        setLongField(term4986, term4986.getClass(), "externalAttributes", 0L);
        setField(term4986, term4986.getClass(), "extraFields", null);
        setField(term4986, term4986.getClass(), "unparseableExtra", null);
        setField(term4986, term4986.getClass(), "name", "");
        setField(term4986, term4986.getClass(), "rawName", null);
        setBooleanField(term4994, term4994.getClass(), "languageEncodingFlag", false);
        setBooleanField(term4994, term4994.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term4994, term4994.getClass(), "encryptionFlag", false);
        setBooleanField(term4994, term4994.getClass(), "strongEncryptionFlag", false);
        setIntField(term4994, term4994.getClass(), "slidingDictionarySize", 0);
        setIntField(term4994, term4994.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term4986, term4986.getClass(), "gpb", term4994);
        setLongField(term4986, term4986.getClass(), "xdostime", -1L);
        setField(term4986, term4986.getClass(), "mtime", null);
        setField(term4986, term4986.getClass(), "atime", null);
        setField(term4986, term4986.getClass(), "ctime", null);
        setLongField(term4986, term4986.getClass(), "crc", -1L);
        setLongField(term4986, term4986.getClass(), "csize", -1L);
        setIntField(term4986, term4986.getClass(), "flag", 0);
        setField(term4986, term4986.getClass(), "extra", null);
        setField(term4986, term4986.getClass(), "comment", null);
        setField(term4985, term4985.getClass(), "entry", term4986);
        setBooleanField(term4985, term4985.getClass(), "hasDataDescriptor", true);
        setBooleanField(term4985, term4985.getClass(), "usesZip64", true);
        setLongField(term4985, term4985.getClass(), "bytesRead", 855932984568615096L);
        setLongField(term4985, term4985.getClass(), "bytesReadFromStream", -1616722610139554082L);
        setIntField(term5014, term5014.getClass(), "crc", 0);
        setField(term4985, term4985.getClass(), "crc", term5014);
        setField(term4985, term4985.getClass(), "in", null);
        setField(term4952, term4952.getClass(), "current", term4985);
        setBooleanField(term4952, term4952.getClass(), "closed", false);
        setBooleanField(term4952, term4952.getClass(), "hitCentralDirectory", true);
        setByteElement(term5019, 0, (byte) -18);
        setField(term5018, term5018.getClass(), "buf", term5019);
        setIntField(term5018, term5018.getClass(), "pos", 1270666529);
        setIntField(term5018, term5018.getClass(), "mark", -1146679443);
        setIntField(term5018, term5018.getClass(), "count", -860131894);
        setField(term4952, term4952.getClass(), "lastStoredEntry", term5018);
        setBooleanField(term4952, term4952.getClass(), "allowStoredEntriesWithDataDescriptor", true);
        setField(term4952, term4952.getClass(), "LFH_BUF", term5025);
        setField(term4952, term4952.getClass(), "SKIP_BUF", term5026);
        setByteElement(term5027, 0, (byte) 120);
        setByteElement(term5027, 1, (byte) 116);
        setByteElement(term5027, 2, (byte) -100);
        setByteElement(term5027, 3, (byte) 95);
        setByteElement(term5027, 4, (byte) -11);
        setByteElement(term5027, 5, (byte) 38);
        setByteElement(term5027, 6, (byte) -95);
        setByteElement(term5027, 7, (byte) 53);
        setByteElement(term5027, 8, (byte) 119);
        setField(term4952, term4952.getClass(), "SHORT_BUF", term5027);
        setByteElement(term5037, 0, (byte) -20);
        setByteElement(term5037, 1, (byte) 48);
        setField(term4952, term4952.getClass(), "WORD_BUF", term5037);
        setByteElement(term5040, 0, (byte) 79);
        setByteElement(term5040, 1, (byte) -19);
        setByteElement(term5040, 2, (byte) 75);
        setByteElement(term5040, 3, (byte) -25);
        setByteElement(term5040, 4, (byte) -57);
        setByteElement(term5040, 5, (byte) 69);
        setByteElement(term5040, 6, (byte) -49);
        setByteElement(term5040, 7, (byte) 106);
        setByteElement(term5040, 8, (byte) -99);
        setField(term4952, term4952.getClass(), "TWO_DWORD_BUF", term5040);
        setIntField(term4952, term4952.getClass(), "entriesRead", -1022990421);
        setByteElement(term5051, 0, (byte) 66);
        setByteElement(term5051, 1, (byte) 82);
        setByteElement(term5051, 2, (byte) 81);
        setByteElement(term5051, 3, (byte) -106);
        setByteElement(term5051, 4, (byte) -110);
        setByteElement(term5051, 5, (byte) 126);
        setByteElement(term5051, 6, (byte) 100);
        setField(term4952, term4952.getClass(), "SINGLE", term5051);
        setLongField(term4952, term4952.getClass(), "bytesRead", 7495904023107549024L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readOneByte", argTypes, term4952, args);
    }

};


