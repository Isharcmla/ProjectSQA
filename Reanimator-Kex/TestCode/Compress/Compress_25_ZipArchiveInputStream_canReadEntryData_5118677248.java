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

public class ZipArchiveInputStream_canReadEntryData_5118677248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655;

    public ZipArchiveInputStream_canReadEntryData_5118677248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term655 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term657 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term658 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term660 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term661 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term662 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term663 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term665 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term666 = (byte[]) newByteArray(0);
        byte[] term676 = (byte[]) newByteArray(5);
        Object term690 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry"));
        Object term691 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term699 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term719 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term723 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term724 = (byte[]) newByteArray(3);
        byte[] term732 = (byte[]) newByteArray(5);
        byte[] term738 = (byte[]) newByteArray(5);
        byte[] term744 = (byte[]) newByteArray(1);
        byte[] term746 = (byte[]) newByteArray(0);
        byte[] term747 = (byte[]) newByteArray(9);
        byte[] term758 = (byte[]) newByteArray(4);
        setField(term655, term655.getClass(), "zipEncoding", null);
        setBooleanField(term655, term655.getClass(), "useUnicodeExtraFields", true);
        setField(term655, term655.getClass(), "in", null);
        setLongField(term658, term658.getClass(), "address", 128419724266192L);
        setField(term660, term660.getClass(), "action", term658);
        setField(term661, term661.getClass(), "action", null);
        setField(term661, term661.getClass(), "prev", null);
        setField(term661, term661.getClass(), "next", term660);
        setField(term661, term661.getClass(), "list", term661);
        setField(term661, term661.getClass(), "referent", null);
        setField(term661, term661.getClass(), "queue", null);
        setField(term661, term661.getClass(), "next", null);
        setField(term661, term661.getClass(), "discovered", null);
        setField(term660, term660.getClass(), "prev", term661);
        setField(term662, term662.getClass(), "action", null);
        setField(term662, term662.getClass(), "prev", term660);
        setField(term662, term662.getClass(), "next", null);
        setField(term662, term662.getClass(), "list", term661);
        setField(term662, term662.getClass(), "referent", null);
        setField(term662, term662.getClass(), "queue", null);
        setField(term662, term662.getClass(), "next", null);
        setField(term662, term662.getClass(), "discovered", null);
        setField(term660, term660.getClass(), "next", term662);
        setField(term660, term660.getClass(), "list", term661);
        setField(term660, term660.getClass(), "referent", term657);
        setField(term663, term663.getClass(), "lock", null);
        setField(term663, term663.getClass(), "head", null);
        setLongField(term663, term663.getClass(), "queueLength", 0L);
        setField(term660, term660.getClass(), "queue", term663);
        setField(term660, term660.getClass(), "next", null);
        setField(term660, term660.getClass(), "discovered", null);
        setField(term658, term658.getClass(), "cleanable", term660);
        setField(term657, term657.getClass(), "zsRef", term658);
        setField(term665, term665.getClass(), "hb", term666);
        setIntField(term665, term665.getClass(), "offset", 0);
        setBooleanField(term665, term665.getClass(), "isReadOnly", false);
        setBooleanField(term665, term665.getClass(), "bigEndian", true);
        setBooleanField(term665, term665.getClass(), "nativeByteOrder", false);
        setIntField(term665, term665.getClass(), "mark", -1);
        setIntField(term665, term665.getClass(), "position", 0);
        setIntField(term665, term665.getClass(), "limit", 0);
        setIntField(term665, term665.getClass(), "capacity", 0);
        setLongField(term665, term665.getClass(), "address", 16L);
        setField(term657, term657.getClass(), "input", term665);
        setByteElement(term676, 0, (byte) -124);
        setByteElement(term676, 1, (byte) -105);
        setByteElement(term676, 2, (byte) 25);
        setByteElement(term676, 3, (byte) 16);
        setByteElement(term676, 4, (byte) 39);
        setField(term657, term657.getClass(), "inputArray", term676);
        setIntField(term657, term657.getClass(), "inputPos", -73683645);
        setIntField(term657, term657.getClass(), "inputLim", -226514366);
        setBooleanField(term657, term657.getClass(), "finished", true);
        setBooleanField(term657, term657.getClass(), "needDict", true);
        setLongField(term657, term657.getClass(), "bytesRead", 8059786003080744426L);
        setLongField(term657, term657.getClass(), "bytesWritten", -4365849114644724155L);
        setIntField(term657, term657.getClass(), "inputConsumed", 1193880199);
        setIntField(term657, term657.getClass(), "outputConsumed", -1087774327);
        setField(term655, term655.getClass(), "inf", term657);
        setField(term655, term655.getClass(), "buf", null);
        setIntField(term691, term691.getClass(), "method", -1);
        setLongField(term691, term691.getClass(), "size", -1L);
        setIntField(term691, term691.getClass(), "internalAttributes", 0);
        setIntField(term691, term691.getClass(), "platform", 0);
        setLongField(term691, term691.getClass(), "externalAttributes", 0L);
        setField(term691, term691.getClass(), "extraFields", null);
        setField(term691, term691.getClass(), "unparseableExtra", null);
        setField(term691, term691.getClass(), "name", "");
        setField(term691, term691.getClass(), "rawName", null);
        setBooleanField(term699, term699.getClass(), "languageEncodingFlag", false);
        setBooleanField(term699, term699.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term699, term699.getClass(), "encryptionFlag", false);
        setBooleanField(term699, term699.getClass(), "strongEncryptionFlag", false);
        setIntField(term699, term699.getClass(), "slidingDictionarySize", 0);
        setIntField(term699, term699.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term691, term691.getClass(), "gpb", term699);
        setLongField(term691, term691.getClass(), "xdostime", -1L);
        setField(term691, term691.getClass(), "mtime", null);
        setField(term691, term691.getClass(), "atime", null);
        setField(term691, term691.getClass(), "ctime", null);
        setLongField(term691, term691.getClass(), "crc", -1L);
        setLongField(term691, term691.getClass(), "csize", -1L);
        setIntField(term691, term691.getClass(), "flag", 0);
        setField(term691, term691.getClass(), "extra", null);
        setField(term691, term691.getClass(), "comment", null);
        setField(term690, term690.getClass(), "entry", term691);
        setBooleanField(term690, term690.getClass(), "hasDataDescriptor", true);
        setBooleanField(term690, term690.getClass(), "usesZip64", false);
        setLongField(term690, term690.getClass(), "bytesRead", 2486810210675247493L);
        setLongField(term690, term690.getClass(), "bytesReadFromStream", 7009926388951271268L);
        setIntField(term719, term719.getClass(), "crc", 0);
        setField(term690, term690.getClass(), "crc", term719);
        setField(term690, term690.getClass(), "in", null);
        setField(term655, term655.getClass(), "current", term690);
        setBooleanField(term655, term655.getClass(), "closed", false);
        setBooleanField(term655, term655.getClass(), "hitCentralDirectory", false);
        setByteElement(term724, 0, (byte) 123);
        setByteElement(term724, 1, (byte) 16);
        setByteElement(term724, 2, (byte) 2);
        setField(term723, term723.getClass(), "buf", term724);
        setIntField(term723, term723.getClass(), "pos", -1530420153);
        setIntField(term723, term723.getClass(), "mark", -469968304);
        setIntField(term723, term723.getClass(), "count", -1145578966);
        setField(term655, term655.getClass(), "lastStoredEntry", term723);
        setBooleanField(term655, term655.getClass(), "allowStoredEntriesWithDataDescriptor", true);
        setByteElement(term732, 0, (byte) -120);
        setByteElement(term732, 1, (byte) 96);
        setByteElement(term732, 2, (byte) -41);
        setByteElement(term732, 3, (byte) -88);
        setByteElement(term732, 4, (byte) 39);
        setField(term655, term655.getClass(), "LFH_BUF", term732);
        setByteElement(term738, 0, (byte) -1);
        setByteElement(term738, 1, (byte) 117);
        setByteElement(term738, 2, (byte) 43);
        setByteElement(term738, 3, (byte) -27);
        setByteElement(term738, 4, (byte) 34);
        setField(term655, term655.getClass(), "SKIP_BUF", term738);
        setByteElement(term744, 0, (byte) -126);
        setField(term655, term655.getClass(), "SHORT_BUF", term744);
        setField(term655, term655.getClass(), "WORD_BUF", term746);
        setByteElement(term747, 0, (byte) 12);
        setByteElement(term747, 1, (byte) -75);
        setByteElement(term747, 2, (byte) 69);
        setByteElement(term747, 3, (byte) -6);
        setByteElement(term747, 4, (byte) 107);
        setByteElement(term747, 5, (byte) -109);
        setByteElement(term747, 6, (byte) 122);
        setByteElement(term747, 7, (byte) 83);
        setByteElement(term747, 8, (byte) -123);
        setField(term655, term655.getClass(), "TWO_DWORD_BUF", term747);
        setIntField(term655, term655.getClass(), "entriesRead", 679763016);
        setByteElement(term758, 0, (byte) -76);
        setByteElement(term758, 1, (byte) -115);
        setByteElement(term758, 2, (byte) -48);
        setByteElement(term758, 3, (byte) 126);
        setField(term655, term655.getClass(), "SINGLE", term758);
        setLongField(term655, term655.getClass(), "bytesRead", -7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canReadEntryData", argTypes, term655, args);
    }

};


