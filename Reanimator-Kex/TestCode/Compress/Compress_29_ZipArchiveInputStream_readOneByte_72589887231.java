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
     Object term4936;

    public ZipArchiveInputStream_readOneByte_72589887231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4936 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term4938 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term4939 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term4941 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4942 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4943 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4944 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4946 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term4947 = (byte[]) newByteArray(0);
        byte[] term4957 = (byte[]) newByteArray(1);
        Object term4967 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term4968 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term4976 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term4996 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term5000 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term5001 = (byte[]) newByteArray(0);
        byte[] term5006 = (byte[]) newByteArray(0);
        byte[] term5007 = (byte[]) newByteArray(9);
        byte[] term5017 = (byte[]) newByteArray(2);
        byte[] term5020 = (byte[]) newByteArray(9);
        byte[] term5030 = (byte[]) newByteArray(7);
        byte[] term5039 = (byte[]) newByteArray(0);
        setField(term4936, term4936.getClass(), "zipEncoding", null);
        setBooleanField(term4936, term4936.getClass(), "useUnicodeExtraFields", true);
        setField(term4936, term4936.getClass(), "in", null);
        setLongField(term4939, term4939.getClass(), "address", 127288604060992L);
        setField(term4941, term4941.getClass(), "action", term4939);
        setField(term4942, term4942.getClass(), "action", null);
        setField(term4942, term4942.getClass(), "prev", null);
        setField(term4942, term4942.getClass(), "next", term4941);
        setField(term4942, term4942.getClass(), "list", term4942);
        setField(term4942, term4942.getClass(), "referent", null);
        setField(term4942, term4942.getClass(), "queue", null);
        setField(term4942, term4942.getClass(), "next", null);
        setField(term4942, term4942.getClass(), "discovered", null);
        setField(term4941, term4941.getClass(), "prev", term4942);
        setField(term4943, term4943.getClass(), "action", null);
        setField(term4943, term4943.getClass(), "prev", term4941);
        setField(term4943, term4943.getClass(), "next", null);
        setField(term4943, term4943.getClass(), "list", term4942);
        setField(term4943, term4943.getClass(), "referent", null);
        setField(term4943, term4943.getClass(), "queue", null);
        setField(term4943, term4943.getClass(), "next", null);
        setField(term4943, term4943.getClass(), "discovered", null);
        setField(term4941, term4941.getClass(), "next", term4943);
        setField(term4941, term4941.getClass(), "list", term4942);
        setField(term4941, term4941.getClass(), "referent", term4938);
        setField(term4944, term4944.getClass(), "lock", null);
        setField(term4944, term4944.getClass(), "head", null);
        setLongField(term4944, term4944.getClass(), "queueLength", 0L);
        setField(term4941, term4941.getClass(), "queue", term4944);
        setField(term4941, term4941.getClass(), "next", null);
        setField(term4941, term4941.getClass(), "discovered", null);
        setField(term4939, term4939.getClass(), "cleanable", term4941);
        setField(term4938, term4938.getClass(), "zsRef", term4939);
        setField(term4946, term4946.getClass(), "hb", term4947);
        setIntField(term4946, term4946.getClass(), "offset", 0);
        setBooleanField(term4946, term4946.getClass(), "isReadOnly", false);
        setBooleanField(term4946, term4946.getClass(), "bigEndian", true);
        setBooleanField(term4946, term4946.getClass(), "nativeByteOrder", false);
        setIntField(term4946, term4946.getClass(), "mark", -1);
        setIntField(term4946, term4946.getClass(), "position", 0);
        setIntField(term4946, term4946.getClass(), "limit", 0);
        setIntField(term4946, term4946.getClass(), "capacity", 0);
        setLongField(term4946, term4946.getClass(), "address", 16L);
        setField(term4938, term4938.getClass(), "input", term4946);
        setByteElement(term4957, 0, (byte) -119);
        setField(term4938, term4938.getClass(), "inputArray", term4957);
        setIntField(term4938, term4938.getClass(), "inputPos", -1618206977);
        setIntField(term4938, term4938.getClass(), "inputLim", -1747406163);
        setBooleanField(term4938, term4938.getClass(), "finished", true);
        setBooleanField(term4938, term4938.getClass(), "needDict", true);
        setLongField(term4938, term4938.getClass(), "bytesRead", 6843866297465638866L);
        setLongField(term4938, term4938.getClass(), "bytesWritten", -4023935540989049732L);
        setIntField(term4938, term4938.getClass(), "inputConsumed", 388157121);
        setIntField(term4938, term4938.getClass(), "outputConsumed", 1684998508);
        setField(term4936, term4936.getClass(), "inf", term4938);
        setField(term4936, term4936.getClass(), "buf", null);
        setIntField(term4968, term4968.getClass(), "method", -1);
        setLongField(term4968, term4968.getClass(), "size", -1L);
        setIntField(term4968, term4968.getClass(), "internalAttributes", 0);
        setIntField(term4968, term4968.getClass(), "platform", 0);
        setLongField(term4968, term4968.getClass(), "externalAttributes", 0L);
        setField(term4968, term4968.getClass(), "extraFields", null);
        setField(term4968, term4968.getClass(), "unparseableExtra", null);
        setField(term4968, term4968.getClass(), "name", "");
        setField(term4968, term4968.getClass(), "rawName", null);
        setBooleanField(term4976, term4976.getClass(), "languageEncodingFlag", false);
        setBooleanField(term4976, term4976.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term4976, term4976.getClass(), "encryptionFlag", false);
        setBooleanField(term4976, term4976.getClass(), "strongEncryptionFlag", false);
        setIntField(term4976, term4976.getClass(), "slidingDictionarySize", 0);
        setIntField(term4976, term4976.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term4968, term4968.getClass(), "gpb", term4976);
        setLongField(term4968, term4968.getClass(), "xdostime", -1L);
        setField(term4968, term4968.getClass(), "mtime", null);
        setField(term4968, term4968.getClass(), "atime", null);
        setField(term4968, term4968.getClass(), "ctime", null);
        setLongField(term4968, term4968.getClass(), "crc", -1L);
        setLongField(term4968, term4968.getClass(), "csize", -1L);
        setIntField(term4968, term4968.getClass(), "flag", 0);
        setField(term4968, term4968.getClass(), "extra", null);
        setField(term4968, term4968.getClass(), "comment", null);
        setField(term4967, term4967.getClass(), "entry", term4968);
        setBooleanField(term4967, term4967.getClass(), "hasDataDescriptor", true);
        setBooleanField(term4967, term4967.getClass(), "usesZip64", true);
        setLongField(term4967, term4967.getClass(), "bytesRead", 855932984568615096L);
        setLongField(term4967, term4967.getClass(), "bytesReadFromStream", -1616722610139554082L);
        setIntField(term4996, term4996.getClass(), "crc", 0);
        setField(term4967, term4967.getClass(), "crc", term4996);
        setField(term4967, term4967.getClass(), "in", null);
        setField(term4936, term4936.getClass(), "current", term4967);
        setBooleanField(term4936, term4936.getClass(), "closed", false);
        setBooleanField(term4936, term4936.getClass(), "hitCentralDirectory", true);
        setField(term5000, term5000.getClass(), "buf", term5001);
        setIntField(term5000, term5000.getClass(), "pos", -1476644457);
        setIntField(term5000, term5000.getClass(), "mark", 1270666529);
        setIntField(term5000, term5000.getClass(), "count", -1146679443);
        setField(term4936, term4936.getClass(), "lastStoredEntry", term5000);
        setBooleanField(term4936, term4936.getClass(), "allowStoredEntriesWithDataDescriptor", true);
        setField(term4936, term4936.getClass(), "LFH_BUF", term5006);
        setByteElement(term5007, 0, (byte) -57);
        setByteElement(term5007, 1, (byte) -35);
        setByteElement(term5007, 2, (byte) -127);
        setByteElement(term5007, 3, (byte) 85);
        setByteElement(term5007, 4, (byte) -49);
        setByteElement(term5007, 5, (byte) -18);
        setByteElement(term5007, 6, (byte) 120);
        setByteElement(term5007, 7, (byte) 116);
        setByteElement(term5007, 8, (byte) -100);
        setField(term4936, term4936.getClass(), "SKIP_BUF", term5007);
        setByteElement(term5017, 0, (byte) 95);
        setByteElement(term5017, 1, (byte) -11);
        setField(term4936, term4936.getClass(), "SHORT_BUF", term5017);
        setByteElement(term5020, 0, (byte) 38);
        setByteElement(term5020, 1, (byte) -95);
        setByteElement(term5020, 2, (byte) 53);
        setByteElement(term5020, 3, (byte) 119);
        setByteElement(term5020, 4, (byte) -20);
        setByteElement(term5020, 5, (byte) 48);
        setByteElement(term5020, 6, (byte) 79);
        setByteElement(term5020, 7, (byte) -19);
        setByteElement(term5020, 8, (byte) 75);
        setField(term4936, term4936.getClass(), "WORD_BUF", term5020);
        setByteElement(term5030, 0, (byte) -25);
        setByteElement(term5030, 1, (byte) -57);
        setByteElement(term5030, 2, (byte) 69);
        setByteElement(term5030, 3, (byte) -49);
        setByteElement(term5030, 4, (byte) 106);
        setByteElement(term5030, 5, (byte) -99);
        setByteElement(term5030, 6, (byte) 66);
        setField(term4936, term4936.getClass(), "TWO_DWORD_BUF", term5030);
        setIntField(term4936, term4936.getClass(), "entriesRead", -860131894);
        setField(term4936, term4936.getClass(), "SINGLE", term5039);
        setLongField(term4936, term4936.getClass(), "bytesRead", 7495904023107549024L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readOneByte", argTypes, term4936, args);
    }

};


