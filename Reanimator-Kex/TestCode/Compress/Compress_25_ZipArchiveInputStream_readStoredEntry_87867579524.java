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

public class ZipArchiveInputStream_readStoredEntry_87867579524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3718;

    public ZipArchiveInputStream_readStoredEntry_87867579524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3718 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term3720 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term3721 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term3723 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term3724 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term3725 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term3726 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3728 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term3729 = (byte[]) newByteArray(0);
        byte[] term3739 = (byte[]) newByteArray(6);
        Object term3754 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term3755 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term3763 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term3783 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term3787 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term3788 = (byte[]) newByteArray(1);
        byte[] term3794 = (byte[]) newByteArray(2);
        byte[] term3797 = (byte[]) newByteArray(7);
        byte[] term3805 = (byte[]) newByteArray(3);
        byte[] term3809 = (byte[]) newByteArray(3);
        byte[] term3813 = (byte[]) newByteArray(4);
        byte[] term3819 = (byte[]) newByteArray(6);
        setField(term3718, term3718.getClass(), "zipEncoding", null);
        setBooleanField(term3718, term3718.getClass(), "useUnicodeExtraFields", false);
        setField(term3718, term3718.getClass(), "in", null);
        setLongField(term3721, term3721.getClass(), "address", 128419734255152L);
        setField(term3723, term3723.getClass(), "action", term3721);
        setField(term3724, term3724.getClass(), "action", null);
        setField(term3724, term3724.getClass(), "prev", null);
        setField(term3724, term3724.getClass(), "next", term3723);
        setField(term3724, term3724.getClass(), "list", term3724);
        setField(term3724, term3724.getClass(), "referent", null);
        setField(term3724, term3724.getClass(), "queue", null);
        setField(term3724, term3724.getClass(), "next", null);
        setField(term3724, term3724.getClass(), "discovered", null);
        setField(term3723, term3723.getClass(), "prev", term3724);
        setField(term3725, term3725.getClass(), "action", null);
        setField(term3725, term3725.getClass(), "prev", term3723);
        setField(term3725, term3725.getClass(), "next", null);
        setField(term3725, term3725.getClass(), "list", term3724);
        setField(term3725, term3725.getClass(), "referent", null);
        setField(term3725, term3725.getClass(), "queue", null);
        setField(term3725, term3725.getClass(), "next", null);
        setField(term3725, term3725.getClass(), "discovered", null);
        setField(term3723, term3723.getClass(), "next", term3725);
        setField(term3723, term3723.getClass(), "list", term3724);
        setField(term3723, term3723.getClass(), "referent", term3720);
        setField(term3726, term3726.getClass(), "lock", null);
        setField(term3726, term3726.getClass(), "head", null);
        setLongField(term3726, term3726.getClass(), "queueLength", 0L);
        setField(term3723, term3723.getClass(), "queue", term3726);
        setField(term3723, term3723.getClass(), "next", null);
        setField(term3723, term3723.getClass(), "discovered", null);
        setField(term3721, term3721.getClass(), "cleanable", term3723);
        setField(term3720, term3720.getClass(), "zsRef", term3721);
        setField(term3728, term3728.getClass(), "hb", term3729);
        setIntField(term3728, term3728.getClass(), "offset", 0);
        setBooleanField(term3728, term3728.getClass(), "isReadOnly", false);
        setBooleanField(term3728, term3728.getClass(), "bigEndian", true);
        setBooleanField(term3728, term3728.getClass(), "nativeByteOrder", false);
        setIntField(term3728, term3728.getClass(), "mark", -1);
        setIntField(term3728, term3728.getClass(), "position", 0);
        setIntField(term3728, term3728.getClass(), "limit", 0);
        setIntField(term3728, term3728.getClass(), "capacity", 0);
        setLongField(term3728, term3728.getClass(), "address", 16L);
        setField(term3720, term3720.getClass(), "input", term3728);
        setByteElement(term3739, 0, (byte) 126);
        setByteElement(term3739, 1, (byte) -47);
        setByteElement(term3739, 2, (byte) 63);
        setByteElement(term3739, 3, (byte) 10);
        setByteElement(term3739, 4, (byte) 62);
        setByteElement(term3739, 5, (byte) 115);
        setField(term3720, term3720.getClass(), "inputArray", term3739);
        setIntField(term3720, term3720.getClass(), "inputPos", 1953277050);
        setIntField(term3720, term3720.getClass(), "inputLim", 1283079251);
        setBooleanField(term3720, term3720.getClass(), "finished", false);
        setBooleanField(term3720, term3720.getClass(), "needDict", true);
        setLongField(term3720, term3720.getClass(), "bytesRead", -8085190702504231560L);
        setLongField(term3720, term3720.getClass(), "bytesWritten", 1672578078364590450L);
        setIntField(term3720, term3720.getClass(), "inputConsumed", -523949691);
        setIntField(term3720, term3720.getClass(), "outputConsumed", 1398204340);
        setField(term3718, term3718.getClass(), "inf", term3720);
        setField(term3718, term3718.getClass(), "buf", null);
        setIntField(term3755, term3755.getClass(), "method", -1);
        setLongField(term3755, term3755.getClass(), "size", -1L);
        setIntField(term3755, term3755.getClass(), "internalAttributes", 0);
        setIntField(term3755, term3755.getClass(), "platform", 0);
        setLongField(term3755, term3755.getClass(), "externalAttributes", 0L);
        setField(term3755, term3755.getClass(), "extraFields", null);
        setField(term3755, term3755.getClass(), "unparseableExtra", null);
        setField(term3755, term3755.getClass(), "name", "");
        setField(term3755, term3755.getClass(), "rawName", null);
        setBooleanField(term3763, term3763.getClass(), "languageEncodingFlag", false);
        setBooleanField(term3763, term3763.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term3763, term3763.getClass(), "encryptionFlag", false);
        setBooleanField(term3763, term3763.getClass(), "strongEncryptionFlag", false);
        setIntField(term3763, term3763.getClass(), "slidingDictionarySize", 0);
        setIntField(term3763, term3763.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term3755, term3755.getClass(), "gpb", term3763);
        setLongField(term3755, term3755.getClass(), "xdostime", -1L);
        setField(term3755, term3755.getClass(), "mtime", null);
        setField(term3755, term3755.getClass(), "atime", null);
        setField(term3755, term3755.getClass(), "ctime", null);
        setLongField(term3755, term3755.getClass(), "crc", -1L);
        setLongField(term3755, term3755.getClass(), "csize", -1L);
        setIntField(term3755, term3755.getClass(), "flag", 0);
        setField(term3755, term3755.getClass(), "extra", null);
        setField(term3755, term3755.getClass(), "comment", null);
        setField(term3754, term3754.getClass(), "entry", term3755);
        setBooleanField(term3754, term3754.getClass(), "hasDataDescriptor", true);
        setBooleanField(term3754, term3754.getClass(), "usesZip64", false);
        setLongField(term3754, term3754.getClass(), "bytesRead", 4949335493504695457L);
        setLongField(term3754, term3754.getClass(), "bytesReadFromStream", -5216789073301458893L);
        setIntField(term3783, term3783.getClass(), "crc", 0);
        setField(term3754, term3754.getClass(), "crc", term3783);
        setField(term3754, term3754.getClass(), "in", null);
        setField(term3718, term3718.getClass(), "current", term3754);
        setBooleanField(term3718, term3718.getClass(), "closed", true);
        setBooleanField(term3718, term3718.getClass(), "hitCentralDirectory", true);
        setByteElement(term3788, 0, (byte) -128);
        setField(term3787, term3787.getClass(), "buf", term3788);
        setIntField(term3787, term3787.getClass(), "pos", 229204365);
        setIntField(term3787, term3787.getClass(), "mark", -461771056);
        setIntField(term3787, term3787.getClass(), "count", -243422082);
        setField(term3718, term3718.getClass(), "lastStoredEntry", term3787);
        setBooleanField(term3718, term3718.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setByteElement(term3794, 0, (byte) -52);
        setByteElement(term3794, 1, (byte) -48);
        setField(term3718, term3718.getClass(), "LFH_BUF", term3794);
        setByteElement(term3797, 0, (byte) -15);
        setByteElement(term3797, 1, (byte) -117);
        setByteElement(term3797, 2, (byte) 45);
        setByteElement(term3797, 3, (byte) 60);
        setByteElement(term3797, 4, (byte) 22);
        setByteElement(term3797, 5, (byte) -98);
        setByteElement(term3797, 6, (byte) -113);
        setField(term3718, term3718.getClass(), "SKIP_BUF", term3797);
        setByteElement(term3805, 0, (byte) -1);
        setByteElement(term3805, 1, (byte) -84);
        setByteElement(term3805, 2, (byte) 34);
        setField(term3718, term3718.getClass(), "SHORT_BUF", term3805);
        setByteElement(term3809, 0, (byte) -125);
        setByteElement(term3809, 1, (byte) 11);
        setByteElement(term3809, 2, (byte) 50);
        setField(term3718, term3718.getClass(), "WORD_BUF", term3809);
        setByteElement(term3813, 0, (byte) 86);
        setByteElement(term3813, 1, (byte) -96);
        setByteElement(term3813, 2, (byte) 18);
        setByteElement(term3813, 3, (byte) -53);
        setField(term3718, term3718.getClass(), "TWO_DWORD_BUF", term3813);
        setIntField(term3718, term3718.getClass(), "entriesRead", 1384592638);
        setByteElement(term3819, 0, (byte) 46);
        setByteElement(term3819, 1, (byte) -106);
        setByteElement(term3819, 2, (byte) 3);
        setByteElement(term3819, 3, (byte) 120);
        setByteElement(term3819, 4, (byte) 120);
        setByteElement(term3819, 5, (byte) -126);
        setField(term3718, term3718.getClass(), "SINGLE", term3819);
        setLongField(term3718, term3718.getClass(), "bytesRead", -1832940336320585644L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readStoredEntry", argTypes, term3718, args);
    }

};


