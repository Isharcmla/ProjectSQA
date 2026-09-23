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
     Object term3708;

    public ZipArchiveInputStream_readStoredEntry_87867579524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3708 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term3710 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term3711 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term3713 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term3714 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term3715 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term3716 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3718 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term3719 = (byte[]) newByteArray(0);
        byte[] term3729 = (byte[]) newByteArray(1);
        Object term3739 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term3740 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term3748 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term3768 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term3772 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term3773 = (byte[]) newByteArray(2);
        byte[] term3780 = (byte[]) newByteArray(7);
        byte[] term3788 = (byte[]) newByteArray(3);
        byte[] term3792 = (byte[]) newByteArray(3);
        byte[] term3796 = (byte[]) newByteArray(4);
        byte[] term3801 = (byte[]) newByteArray(6);
        byte[] term3809 = (byte[]) newByteArray(1);
        setField(term3708, term3708.getClass(), "zipEncoding", null);
        setBooleanField(term3708, term3708.getClass(), "useUnicodeExtraFields", false);
        setField(term3708, term3708.getClass(), "in", null);
        setLongField(term3711, term3711.getClass(), "address", 127288609099792L);
        setField(term3713, term3713.getClass(), "action", term3711);
        setField(term3714, term3714.getClass(), "action", null);
        setField(term3714, term3714.getClass(), "prev", null);
        setField(term3714, term3714.getClass(), "next", term3713);
        setField(term3714, term3714.getClass(), "list", term3714);
        setField(term3714, term3714.getClass(), "referent", null);
        setField(term3714, term3714.getClass(), "queue", null);
        setField(term3714, term3714.getClass(), "next", null);
        setField(term3714, term3714.getClass(), "discovered", null);
        setField(term3713, term3713.getClass(), "prev", term3714);
        setField(term3715, term3715.getClass(), "action", null);
        setField(term3715, term3715.getClass(), "prev", term3713);
        setField(term3715, term3715.getClass(), "next", null);
        setField(term3715, term3715.getClass(), "list", term3714);
        setField(term3715, term3715.getClass(), "referent", null);
        setField(term3715, term3715.getClass(), "queue", null);
        setField(term3715, term3715.getClass(), "next", null);
        setField(term3715, term3715.getClass(), "discovered", null);
        setField(term3713, term3713.getClass(), "next", term3715);
        setField(term3713, term3713.getClass(), "list", term3714);
        setField(term3713, term3713.getClass(), "referent", term3710);
        setField(term3716, term3716.getClass(), "lock", null);
        setField(term3716, term3716.getClass(), "head", null);
        setLongField(term3716, term3716.getClass(), "queueLength", 0L);
        setField(term3713, term3713.getClass(), "queue", term3716);
        setField(term3713, term3713.getClass(), "next", null);
        setField(term3713, term3713.getClass(), "discovered", null);
        setField(term3711, term3711.getClass(), "cleanable", term3713);
        setField(term3710, term3710.getClass(), "zsRef", term3711);
        setField(term3718, term3718.getClass(), "hb", term3719);
        setIntField(term3718, term3718.getClass(), "offset", 0);
        setBooleanField(term3718, term3718.getClass(), "isReadOnly", false);
        setBooleanField(term3718, term3718.getClass(), "bigEndian", true);
        setBooleanField(term3718, term3718.getClass(), "nativeByteOrder", false);
        setIntField(term3718, term3718.getClass(), "mark", -1);
        setIntField(term3718, term3718.getClass(), "position", 0);
        setIntField(term3718, term3718.getClass(), "limit", 0);
        setIntField(term3718, term3718.getClass(), "capacity", 0);
        setLongField(term3718, term3718.getClass(), "address", 16L);
        setField(term3710, term3710.getClass(), "input", term3718);
        setByteElement(term3729, 0, (byte) 126);
        setField(term3710, term3710.getClass(), "inputArray", term3729);
        setIntField(term3710, term3710.getClass(), "inputPos", 11724947);
        setIntField(term3710, term3710.getClass(), "inputLim", 1953277050);
        setBooleanField(term3710, term3710.getClass(), "finished", false);
        setBooleanField(term3710, term3710.getClass(), "needDict", true);
        setLongField(term3710, term3710.getClass(), "bytesRead", -8085190702504231560L);
        setLongField(term3710, term3710.getClass(), "bytesWritten", 1672578078364590450L);
        setIntField(term3710, term3710.getClass(), "inputConsumed", 1283079251);
        setIntField(term3710, term3710.getClass(), "outputConsumed", -523949691);
        setField(term3708, term3708.getClass(), "inf", term3710);
        setField(term3708, term3708.getClass(), "buf", null);
        setIntField(term3740, term3740.getClass(), "method", -1);
        setLongField(term3740, term3740.getClass(), "size", -1L);
        setIntField(term3740, term3740.getClass(), "internalAttributes", 0);
        setIntField(term3740, term3740.getClass(), "platform", 0);
        setLongField(term3740, term3740.getClass(), "externalAttributes", 0L);
        setField(term3740, term3740.getClass(), "extraFields", null);
        setField(term3740, term3740.getClass(), "unparseableExtra", null);
        setField(term3740, term3740.getClass(), "name", "");
        setField(term3740, term3740.getClass(), "rawName", null);
        setBooleanField(term3748, term3748.getClass(), "languageEncodingFlag", false);
        setBooleanField(term3748, term3748.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term3748, term3748.getClass(), "encryptionFlag", false);
        setBooleanField(term3748, term3748.getClass(), "strongEncryptionFlag", false);
        setIntField(term3748, term3748.getClass(), "slidingDictionarySize", 0);
        setIntField(term3748, term3748.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term3740, term3740.getClass(), "gpb", term3748);
        setLongField(term3740, term3740.getClass(), "xdostime", -1L);
        setField(term3740, term3740.getClass(), "mtime", null);
        setField(term3740, term3740.getClass(), "atime", null);
        setField(term3740, term3740.getClass(), "ctime", null);
        setLongField(term3740, term3740.getClass(), "crc", -1L);
        setLongField(term3740, term3740.getClass(), "csize", -1L);
        setIntField(term3740, term3740.getClass(), "flag", 0);
        setField(term3740, term3740.getClass(), "extra", null);
        setField(term3740, term3740.getClass(), "comment", null);
        setField(term3739, term3739.getClass(), "entry", term3740);
        setBooleanField(term3739, term3739.getClass(), "hasDataDescriptor", true);
        setBooleanField(term3739, term3739.getClass(), "usesZip64", false);
        setLongField(term3739, term3739.getClass(), "bytesRead", 4949335493504695457L);
        setLongField(term3739, term3739.getClass(), "bytesReadFromStream", -5216789073301458893L);
        setIntField(term3768, term3768.getClass(), "crc", 0);
        setField(term3739, term3739.getClass(), "crc", term3768);
        setField(term3739, term3739.getClass(), "in", null);
        setField(term3708, term3708.getClass(), "current", term3739);
        setBooleanField(term3708, term3708.getClass(), "closed", true);
        setBooleanField(term3708, term3708.getClass(), "hitCentralDirectory", true);
        setByteElement(term3773, 0, (byte) -47);
        setByteElement(term3773, 1, (byte) 63);
        setField(term3772, term3772.getClass(), "buf", term3773);
        setIntField(term3772, term3772.getClass(), "pos", 1398204340);
        setIntField(term3772, term3772.getClass(), "mark", 229204365);
        setIntField(term3772, term3772.getClass(), "count", -461771056);
        setField(term3708, term3708.getClass(), "lastStoredEntry", term3772);
        setBooleanField(term3708, term3708.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setByteElement(term3780, 0, (byte) 10);
        setByteElement(term3780, 1, (byte) 62);
        setByteElement(term3780, 2, (byte) 115);
        setByteElement(term3780, 3, (byte) -128);
        setByteElement(term3780, 4, (byte) -52);
        setByteElement(term3780, 5, (byte) -48);
        setByteElement(term3780, 6, (byte) -15);
        setField(term3708, term3708.getClass(), "LFH_BUF", term3780);
        setByteElement(term3788, 0, (byte) -117);
        setByteElement(term3788, 1, (byte) 45);
        setByteElement(term3788, 2, (byte) 60);
        setField(term3708, term3708.getClass(), "SKIP_BUF", term3788);
        setByteElement(term3792, 0, (byte) 22);
        setByteElement(term3792, 1, (byte) -98);
        setByteElement(term3792, 2, (byte) -113);
        setField(term3708, term3708.getClass(), "SHORT_BUF", term3792);
        setByteElement(term3796, 0, (byte) -1);
        setByteElement(term3796, 1, (byte) -84);
        setByteElement(term3796, 2, (byte) 34);
        setByteElement(term3796, 3, (byte) -125);
        setField(term3708, term3708.getClass(), "WORD_BUF", term3796);
        setByteElement(term3801, 0, (byte) 11);
        setByteElement(term3801, 1, (byte) 50);
        setByteElement(term3801, 2, (byte) 86);
        setByteElement(term3801, 3, (byte) -96);
        setByteElement(term3801, 4, (byte) 18);
        setByteElement(term3801, 5, (byte) -53);
        setField(term3708, term3708.getClass(), "TWO_DWORD_BUF", term3801);
        setIntField(term3708, term3708.getClass(), "entriesRead", -243422082);
        setByteElement(term3809, 0, (byte) 46);
        setField(term3708, term3708.getClass(), "SINGLE", term3809);
        setLongField(term3708, term3708.getClass(), "bytesRead", -1832940336320585644L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readStoredEntry", argTypes, term3708, args);
    }

};


