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
import java.lang.String;

public class ZipArchiveEntry_getSize_113521713542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26792;

    public ZipArchiveEntry_getSize_113521713542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26975 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term26974 = ((Class) term26975).getDeclaredField((String) "MINUTES");
        ((Field) term26974).setAccessible(true);
        Object enum101 = ((Field) term26974).get((Object) null);
        Class<? extends Object> term27158 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term27157 = ((Class) term27158).getDeclaredField((String) "DAYS");
        ((Field) term27157).setAccessible(true);
        Object enum102 = ((Field) term27157).get((Object) null);
        Class<? extends Object> term27332 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term27331 = ((Class) term27332).getDeclaredField((String) "MICROSECONDS");
        ((Field) term27331).setAccessible(true);
        Object enum103 = ((Field) term27331).get((Object) null);
        term26792 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term26801 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 9);
        Object term26802 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term26803 = (byte[]) newByteArray(6);
        byte[] term26810 = (byte[]) newByteArray(1);
        byte[] term26814 = (byte[]) newByteArray(5);
        Object term26820 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term26830 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26851 = newInstance(Class.forName("java.time.Instant"));
        Object term26866 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26884 = newInstance(Class.forName("java.time.Instant"));
        Object term26899 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26925 = newInstance(Class.forName("java.time.Instant"));
        byte[] term26945 = (byte[]) newByteArray(3);
        setIntField(term26792, term26792.getClass(), "method", -1);
        setLongField(term26792, term26792.getClass(), "size", -1L);
        setIntField(term26792, term26792.getClass(), "internalAttributes", 1466373988);
        setIntField(term26792, term26792.getClass(), "versionRequired", -358526505);
        setIntField(term26792, term26792.getClass(), "versionMadeBy", 1843268026);
        setIntField(term26792, term26792.getClass(), "platform", 954660603);
        setIntField(term26792, term26792.getClass(), "rawFlag", -1351605385);
        setLongField(term26792, term26792.getClass(), "externalAttributes", -8649738738252714180L);
        setField(term26792, term26792.getClass(), "extraFields", term26801);
        setByteElement(term26803, 0, (byte) 98);
        setByteElement(term26803, 1, (byte) 80);
        setByteElement(term26803, 2, (byte) 18);
        setByteElement(term26803, 3, (byte) 66);
        setByteElement(term26803, 4, (byte) 71);
        setByteElement(term26803, 5, (byte) 119);
        setField(term26802, term26802.getClass(), "localFileData", term26803);
        setByteElement(term26810, 0, (byte) -13);
        setField(term26802, term26802.getClass(), "centralDirectoryData", term26810);
        setField(term26792, term26792.getClass(), "unparseableExtra", term26802);
        setField(term26792, term26792.getClass(), "name", "");
        setByteElement(term26814, 0, (byte) -91);
        setByteElement(term26814, 1, (byte) 59);
        setByteElement(term26814, 2, (byte) -54);
        setByteElement(term26814, 3, (byte) 84);
        setByteElement(term26814, 4, (byte) 38);
        setField(term26792, term26792.getClass(), "rawName", term26814);
        setBooleanField(term26820, term26820.getClass(), "languageEncodingFlag", false);
        setBooleanField(term26820, term26820.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term26820, term26820.getClass(), "encryptionFlag", false);
        setBooleanField(term26820, term26820.getClass(), "strongEncryptionFlag", false);
        setIntField(term26820, term26820.getClass(), "slidingDictionarySize", 0);
        setIntField(term26820, term26820.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term26792, term26792.getClass(), "gpb", term26820);
        setLongField(term26792, term26792.getClass(), "xdostime", -1L);
        setField(term26830, term26830.getClass(), "unit", enum101);
        setLongField(term26830, term26830.getClass(), "value", -7278883608542636188L);
        setLongField(term26851, term26851.getClass(), "seconds", 1728475746L);
        setIntField(term26851, term26851.getClass(), "nanos", 580000000);
        setField(term26830, term26830.getClass(), "instant", term26851);
        setField(term26830, term26830.getClass(), "valueAsString", "aWYOWZFyaX");
        setField(term26792, term26792.getClass(), "mtime", term26830);
        setField(term26866, term26866.getClass(), "unit", enum102);
        setLongField(term26866, term26866.getClass(), "value", -1539859611880912454L);
        setLongField(term26884, term26884.getClass(), "seconds", 1709196890L);
        setIntField(term26884, term26884.getClass(), "nanos", 88000000);
        setField(term26866, term26866.getClass(), "instant", term26884);
        setField(term26866, term26866.getClass(), "valueAsString", "BRIVNtfUWU");
        setField(term26792, term26792.getClass(), "atime", term26866);
        setField(term26899, term26899.getClass(), "unit", enum103);
        setLongField(term26899, term26899.getClass(), "value", 4100236067313034103L);
        setLongField(term26925, term26925.getClass(), "seconds", 1644794129L);
        setIntField(term26925, term26925.getClass(), "nanos", 220000000);
        setField(term26899, term26899.getClass(), "instant", term26925);
        setField(term26899, term26899.getClass(), "valueAsString", "DbiCVtPPCT");
        setField(term26792, term26792.getClass(), "ctime", term26899);
        setLongField(term26792, term26792.getClass(), "crc", -1L);
        setLongField(term26792, term26792.getClass(), "csize", -1L);
        setIntField(term26792, term26792.getClass(), "flag", 278355793);
        setByteElement(term26945, 0, (byte) 126);
        setByteElement(term26945, 1, (byte) -47);
        setByteElement(term26945, 2, (byte) 63);
        setField(term26792, term26792.getClass(), "extra", term26945);
        setField(term26792, term26792.getClass(), "comment", "WzFopsaDuG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term26792, args);
    }

};


