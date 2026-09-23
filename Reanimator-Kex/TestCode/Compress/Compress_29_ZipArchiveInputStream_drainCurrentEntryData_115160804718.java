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

public class ZipArchiveInputStream_drainCurrentEntryData_115160804718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1960;

    public ZipArchiveInputStream_drainCurrentEntryData_115160804718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1960 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term1962 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term1963 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term1965 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term1966 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term1967 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term1968 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1970 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term1971 = (byte[]) newByteArray(0);
        byte[] term1981 = (byte[]) newByteArray(1);
        Object term1991 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term1992 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term2000 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term2020 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term2024 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term2025 = (byte[]) newByteArray(0);
        byte[] term2030 = (byte[]) newByteArray(1);
        byte[] term2032 = (byte[]) newByteArray(5);
        byte[] term2038 = (byte[]) newByteArray(3);
        byte[] term2042 = (byte[]) newByteArray(2);
        byte[] term2045 = (byte[]) newByteArray(2);
        byte[] term2049 = (byte[]) newByteArray(5);
        setField(term1960, term1960.getClass(), "zipEncoding", null);
        setBooleanField(term1960, term1960.getClass(), "useUnicodeExtraFields", false);
        setField(term1960, term1960.getClass(), "in", null);
        setLongField(term1963, term1963.getClass(), "address", 127288609099792L);
        setField(term1965, term1965.getClass(), "action", term1963);
        setField(term1966, term1966.getClass(), "action", null);
        setField(term1966, term1966.getClass(), "prev", null);
        setField(term1966, term1966.getClass(), "next", term1965);
        setField(term1966, term1966.getClass(), "list", term1966);
        setField(term1966, term1966.getClass(), "referent", null);
        setField(term1966, term1966.getClass(), "queue", null);
        setField(term1966, term1966.getClass(), "next", null);
        setField(term1966, term1966.getClass(), "discovered", null);
        setField(term1965, term1965.getClass(), "prev", term1966);
        setField(term1967, term1967.getClass(), "action", null);
        setField(term1967, term1967.getClass(), "prev", term1965);
        setField(term1967, term1967.getClass(), "next", null);
        setField(term1967, term1967.getClass(), "list", term1966);
        setField(term1967, term1967.getClass(), "referent", null);
        setField(term1967, term1967.getClass(), "queue", null);
        setField(term1967, term1967.getClass(), "next", null);
        setField(term1967, term1967.getClass(), "discovered", null);
        setField(term1965, term1965.getClass(), "next", term1967);
        setField(term1965, term1965.getClass(), "list", term1966);
        setField(term1965, term1965.getClass(), "referent", term1962);
        setField(term1968, term1968.getClass(), "lock", null);
        setField(term1968, term1968.getClass(), "head", null);
        setLongField(term1968, term1968.getClass(), "queueLength", 0L);
        setField(term1965, term1965.getClass(), "queue", term1968);
        setField(term1965, term1965.getClass(), "next", null);
        setField(term1965, term1965.getClass(), "discovered", null);
        setField(term1963, term1963.getClass(), "cleanable", term1965);
        setField(term1962, term1962.getClass(), "zsRef", term1963);
        setField(term1970, term1970.getClass(), "hb", term1971);
        setIntField(term1970, term1970.getClass(), "offset", 0);
        setBooleanField(term1970, term1970.getClass(), "isReadOnly", false);
        setBooleanField(term1970, term1970.getClass(), "bigEndian", true);
        setBooleanField(term1970, term1970.getClass(), "nativeByteOrder", false);
        setIntField(term1970, term1970.getClass(), "mark", -1);
        setIntField(term1970, term1970.getClass(), "position", 0);
        setIntField(term1970, term1970.getClass(), "limit", 0);
        setIntField(term1970, term1970.getClass(), "capacity", 0);
        setLongField(term1970, term1970.getClass(), "address", 16L);
        setField(term1962, term1962.getClass(), "input", term1970);
        setByteElement(term1981, 0, (byte) -106);
        setField(term1962, term1962.getClass(), "inputArray", term1981);
        setIntField(term1962, term1962.getClass(), "inputPos", -1210583429);
        setIntField(term1962, term1962.getClass(), "inputLim", -663691365);
        setBooleanField(term1962, term1962.getClass(), "finished", true);
        setBooleanField(term1962, term1962.getClass(), "needDict", true);
        setLongField(term1962, term1962.getClass(), "bytesRead", -1610676979013636850L);
        setLongField(term1962, term1962.getClass(), "bytesWritten", 2062173786000223358L);
        setIntField(term1962, term1962.getClass(), "inputConsumed", 339854490);
        setIntField(term1962, term1962.getClass(), "outputConsumed", -615654495);
        setField(term1960, term1960.getClass(), "inf", term1962);
        setField(term1960, term1960.getClass(), "buf", null);
        setIntField(term1992, term1992.getClass(), "method", -1);
        setLongField(term1992, term1992.getClass(), "size", -1L);
        setIntField(term1992, term1992.getClass(), "internalAttributes", 0);
        setIntField(term1992, term1992.getClass(), "platform", 0);
        setLongField(term1992, term1992.getClass(), "externalAttributes", 0L);
        setField(term1992, term1992.getClass(), "extraFields", null);
        setField(term1992, term1992.getClass(), "unparseableExtra", null);
        setField(term1992, term1992.getClass(), "name", "");
        setField(term1992, term1992.getClass(), "rawName", null);
        setBooleanField(term2000, term2000.getClass(), "languageEncodingFlag", false);
        setBooleanField(term2000, term2000.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term2000, term2000.getClass(), "encryptionFlag", false);
        setBooleanField(term2000, term2000.getClass(), "strongEncryptionFlag", false);
        setIntField(term2000, term2000.getClass(), "slidingDictionarySize", 0);
        setIntField(term2000, term2000.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term1992, term1992.getClass(), "gpb", term2000);
        setLongField(term1992, term1992.getClass(), "xdostime", -1L);
        setField(term1992, term1992.getClass(), "mtime", null);
        setField(term1992, term1992.getClass(), "atime", null);
        setField(term1992, term1992.getClass(), "ctime", null);
        setLongField(term1992, term1992.getClass(), "crc", -1L);
        setLongField(term1992, term1992.getClass(), "csize", -1L);
        setIntField(term1992, term1992.getClass(), "flag", 0);
        setField(term1992, term1992.getClass(), "extra", null);
        setField(term1992, term1992.getClass(), "comment", null);
        setField(term1991, term1991.getClass(), "entry", term1992);
        setBooleanField(term1991, term1991.getClass(), "hasDataDescriptor", false);
        setBooleanField(term1991, term1991.getClass(), "usesZip64", false);
        setLongField(term1991, term1991.getClass(), "bytesRead", -8658027316505137504L);
        setLongField(term1991, term1991.getClass(), "bytesReadFromStream", 414749984815662075L);
        setIntField(term2020, term2020.getClass(), "crc", 0);
        setField(term1991, term1991.getClass(), "crc", term2020);
        setField(term1991, term1991.getClass(), "in", null);
        setField(term1960, term1960.getClass(), "current", term1991);
        setBooleanField(term1960, term1960.getClass(), "closed", true);
        setBooleanField(term1960, term1960.getClass(), "hitCentralDirectory", true);
        setField(term2024, term2024.getClass(), "buf", term2025);
        setIntField(term2024, term2024.getClass(), "pos", -1476117762);
        setIntField(term2024, term2024.getClass(), "mark", -341962980);
        setIntField(term2024, term2024.getClass(), "count", 1532716628);
        setField(term1960, term1960.getClass(), "lastStoredEntry", term2024);
        setBooleanField(term1960, term1960.getClass(), "allowStoredEntriesWithDataDescriptor", true);
        setByteElement(term2030, 0, (byte) 58);
        setField(term1960, term1960.getClass(), "LFH_BUF", term2030);
        setByteElement(term2032, 0, (byte) 77);
        setByteElement(term2032, 1, (byte) -54);
        setByteElement(term2032, 2, (byte) -59);
        setByteElement(term2032, 3, (byte) 103);
        setByteElement(term2032, 4, (byte) 127);
        setField(term1960, term1960.getClass(), "SKIP_BUF", term2032);
        setByteElement(term2038, 0, (byte) 58);
        setByteElement(term2038, 1, (byte) -98);
        setByteElement(term2038, 2, (byte) 48);
        setField(term1960, term1960.getClass(), "SHORT_BUF", term2038);
        setByteElement(term2042, 0, (byte) 15);
        setByteElement(term2042, 1, (byte) 73);
        setField(term1960, term1960.getClass(), "WORD_BUF", term2042);
        setByteElement(term2045, 0, (byte) -77);
        setByteElement(term2045, 1, (byte) -11);
        setField(term1960, term1960.getClass(), "TWO_DWORD_BUF", term2045);
        setIntField(term1960, term1960.getClass(), "entriesRead", -1801760683);
        setByteElement(term2049, 0, (byte) -95);
        setByteElement(term2049, 1, (byte) 114);
        setByteElement(term2049, 2, (byte) -9);
        setByteElement(term2049, 3, (byte) -113);
        setByteElement(term2049, 4, (byte) -42);
        setField(term1960, term1960.getClass(), "SINGLE", term2049);
        setLongField(term1960, term1960.getClass(), "bytesRead", 463622836963501975L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "drainCurrentEntryData", argTypes, term1960, args);
    }

};


