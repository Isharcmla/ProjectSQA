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
import java.lang.Long;

public class ZipArchiveEntry_setExternalAttributes_4598311811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5833;
     Object term6002;

    public ZipArchiveEntry_setExternalAttributes_4598311811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6015 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6014 = ((Class) term6015).getDeclaredField((String) "DAYS");
        ((Field) term6014).setAccessible(true);
        Object enum22 = ((Field) term6014).get((Object) null);
        Class<? extends Object> term6189 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6188 = ((Class) term6189).getDeclaredField((String) "MILLISECONDS");
        ((Field) term6188).setAccessible(true);
        Object enum23 = ((Field) term6188).get((Object) null);
        Class<? extends Object> term6387 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6386 = ((Class) term6387).getDeclaredField((String) "SECONDS");
        ((Field) term6386).setAccessible(true);
        Object enum24 = ((Field) term6386).get((Object) null);
        term5833 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term5842 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
        Object term5843 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term5844 = (byte[]) newByteArray(1);
        byte[] term5846 = (byte[]) newByteArray(0);
        byte[] term5849 = (byte[]) newByteArray(9);
        Object term5859 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term5869 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5887 = newInstance(Class.forName("java.time.Instant"));
        Object term5902 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5928 = newInstance(Class.forName("java.time.Instant"));
        Object term5943 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5964 = newInstance(Class.forName("java.time.Instant"));
        byte[] term5984 = (byte[]) newByteArray(4);
        setIntField(term5833, term5833.getClass(), "method", -1);
        setLongField(term5833, term5833.getClass(), "size", -1L);
        setIntField(term5833, term5833.getClass(), "internalAttributes", -1371869594);
        setIntField(term5833, term5833.getClass(), "versionRequired", -2095575670);
        setIntField(term5833, term5833.getClass(), "versionMadeBy", 1225272962);
        setIntField(term5833, term5833.getClass(), "platform", 1324040357);
        setIntField(term5833, term5833.getClass(), "rawFlag", -1588772968);
        setLongField(term5833, term5833.getClass(), "externalAttributes", -5892135042702373494L);
        setField(term5833, term5833.getClass(), "extraFields", term5842);
        setByteElement(term5844, 0, (byte) -9);
        setField(term5843, term5843.getClass(), "localFileData", term5844);
        setField(term5843, term5843.getClass(), "centralDirectoryData", term5846);
        setField(term5833, term5833.getClass(), "unparseableExtra", term5843);
        setField(term5833, term5833.getClass(), "name", "");
        setByteElement(term5849, 0, (byte) 97);
        setByteElement(term5849, 1, (byte) -46);
        setByteElement(term5849, 2, (byte) 14);
        setByteElement(term5849, 3, (byte) 34);
        setByteElement(term5849, 4, (byte) 126);
        setByteElement(term5849, 5, (byte) 7);
        setByteElement(term5849, 6, (byte) -96);
        setByteElement(term5849, 7, (byte) -22);
        setByteElement(term5849, 8, (byte) -5);
        setField(term5833, term5833.getClass(), "rawName", term5849);
        setBooleanField(term5859, term5859.getClass(), "languageEncodingFlag", false);
        setBooleanField(term5859, term5859.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term5859, term5859.getClass(), "encryptionFlag", false);
        setBooleanField(term5859, term5859.getClass(), "strongEncryptionFlag", false);
        setIntField(term5859, term5859.getClass(), "slidingDictionarySize", 0);
        setIntField(term5859, term5859.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term5833, term5833.getClass(), "gpb", term5859);
        setLongField(term5833, term5833.getClass(), "xdostime", -1L);
        setField(term5869, term5869.getClass(), "unit", enum22);
        setLongField(term5869, term5869.getClass(), "value", 5262507301787091109L);
        setLongField(term5887, term5887.getClass(), "seconds", 1347418561L);
        setIntField(term5887, term5887.getClass(), "nanos", 385000000);
        setField(term5869, term5869.getClass(), "instant", term5887);
        setField(term5869, term5869.getClass(), "valueAsString", "xrwlQZdwCp");
        setField(term5833, term5833.getClass(), "mtime", term5869);
        setField(term5902, term5902.getClass(), "unit", enum23);
        setLongField(term5902, term5902.getClass(), "value", -6823727938421990489L);
        setLongField(term5928, term5928.getClass(), "seconds", 1502176153L);
        setIntField(term5928, term5928.getClass(), "nanos", 899000000);
        setField(term5902, term5902.getClass(), "instant", term5928);
        setField(term5902, term5902.getClass(), "valueAsString", "IDCWpPLRkE");
        setField(term5833, term5833.getClass(), "atime", term5902);
        setField(term5943, term5943.getClass(), "unit", enum24);
        setLongField(term5943, term5943.getClass(), "value", -484994522244390100L);
        setLongField(term5964, term5964.getClass(), "seconds", 1630970644L);
        setIntField(term5964, term5964.getClass(), "nanos", 759000000);
        setField(term5943, term5943.getClass(), "instant", term5964);
        setField(term5943, term5943.getClass(), "valueAsString", "nyiiPDVjAc");
        setField(term5833, term5833.getClass(), "ctime", term5943);
        setLongField(term5833, term5833.getClass(), "crc", -1L);
        setLongField(term5833, term5833.getClass(), "csize", -1L);
        setIntField(term5833, term5833.getClass(), "flag", -93135961);
        setByteElement(term5984, 0, (byte) -124);
        setByteElement(term5984, 1, (byte) -105);
        setByteElement(term5984, 2, (byte) 25);
        setByteElement(term5984, 3, (byte) 16);
        setField(term5833, term5833.getClass(), "extra", term5984);
        setField(term5833, term5833.getClass(), "comment", "aKnKipADSo");
        term6002 = new Long(1233889271256172047L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6002;
        callMethod(klass, "setExternalAttributes", argTypes, term5833, args);
    }

};


