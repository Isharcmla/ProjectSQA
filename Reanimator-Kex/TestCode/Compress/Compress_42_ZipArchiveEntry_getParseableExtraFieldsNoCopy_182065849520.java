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

public class ZipArchiveEntry_getParseableExtraFieldsNoCopy_182065849520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12064;

    public ZipArchiveEntry_getParseableExtraFieldsNoCopy_182065849520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12243 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term12242 = ((Class) term12243).getDeclaredField((String) "MICROSECONDS");
        ((Field) term12242).setAccessible(true);
        Object enum46 = ((Field) term12242).get((Object) null);
        Class<? extends Object> term12451 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term12450 = ((Class) term12451).getDeclaredField((String) "MILLISECONDS");
        ((Field) term12450).setAccessible(true);
        Object enum47 = ((Field) term12450).get((Object) null);
        term12064 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term12073 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 6);
        Object term12074 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term12075 = (byte[]) newByteArray(4);
        byte[] term12080 = (byte[]) newByteArray(6);
        byte[] term12089 = (byte[]) newByteArray(7);
        Object term12097 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term12107 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12133 = newInstance(Class.forName("java.time.Instant"));
        Object term12148 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12150 = newInstance(Class.forName("java.time.Instant"));
        Object term12165 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12191 = newInstance(Class.forName("java.time.Instant"));
        byte[] term12211 = (byte[]) newByteArray(0);
        setIntField(term12064, term12064.getClass(), "method", -1);
        setLongField(term12064, term12064.getClass(), "size", -1L);
        setIntField(term12064, term12064.getClass(), "internalAttributes", 71190297);
        setIntField(term12064, term12064.getClass(), "versionRequired", 1202361360);
        setIntField(term12064, term12064.getClass(), "versionMadeBy", -2015048153);
        setIntField(term12064, term12064.getClass(), "platform", -2063457669);
        setIntField(term12064, term12064.getClass(), "rawFlag", -1222006000);
        setLongField(term12064, term12064.getClass(), "externalAttributes", 305759998609888272L);
        setField(term12064, term12064.getClass(), "extraFields", term12073);
        setByteElement(term12075, 0, (byte) -98);
        setByteElement(term12075, 1, (byte) -119);
        setByteElement(term12075, 2, (byte) 120);
        setByteElement(term12075, 3, (byte) -15);
        setField(term12074, term12074.getClass(), "localFileData", term12075);
        setByteElement(term12080, 0, (byte) 115);
        setByteElement(term12080, 1, (byte) 52);
        setByteElement(term12080, 2, (byte) 96);
        setByteElement(term12080, 3, (byte) 40);
        setByteElement(term12080, 4, (byte) -5);
        setByteElement(term12080, 5, (byte) 24);
        setField(term12074, term12074.getClass(), "centralDirectoryData", term12080);
        setField(term12064, term12064.getClass(), "unparseableExtra", term12074);
        setField(term12064, term12064.getClass(), "name", "");
        setByteElement(term12089, 0, (byte) -39);
        setByteElement(term12089, 1, (byte) 30);
        setByteElement(term12089, 2, (byte) -119);
        setByteElement(term12089, 3, (byte) 94);
        setByteElement(term12089, 4, (byte) -52);
        setByteElement(term12089, 5, (byte) -33);
        setByteElement(term12089, 6, (byte) 16);
        setField(term12064, term12064.getClass(), "rawName", term12089);
        setBooleanField(term12097, term12097.getClass(), "languageEncodingFlag", false);
        setBooleanField(term12097, term12097.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term12097, term12097.getClass(), "encryptionFlag", false);
        setBooleanField(term12097, term12097.getClass(), "strongEncryptionFlag", false);
        setIntField(term12097, term12097.getClass(), "slidingDictionarySize", 0);
        setIntField(term12097, term12097.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term12064, term12064.getClass(), "gpb", term12097);
        setLongField(term12064, term12064.getClass(), "xdostime", -1L);
        setField(term12107, term12107.getClass(), "unit", enum46);
        setLongField(term12107, term12107.getClass(), "value", -8654565919063661957L);
        setLongField(term12133, term12133.getClass(), "seconds", 1362798563L);
        setIntField(term12133, term12133.getClass(), "nanos", 394000000);
        setField(term12107, term12107.getClass(), "instant", term12133);
        setField(term12107, term12107.getClass(), "valueAsString", "JUmudUmaaV");
        setField(term12064, term12064.getClass(), "mtime", term12107);
        setField(term12148, term12148.getClass(), "unit", enum46);
        setLongField(term12148, term12148.getClass(), "value", -5248475803419977214L);
        setLongField(term12150, term12150.getClass(), "seconds", 1853981979L);
        setIntField(term12150, term12150.getClass(), "nanos", 281000000);
        setField(term12148, term12148.getClass(), "instant", term12150);
        setField(term12148, term12148.getClass(), "valueAsString", "KoyGrUJeJW");
        setField(term12064, term12064.getClass(), "atime", term12148);
        setField(term12165, term12165.getClass(), "unit", enum47);
        setLongField(term12165, term12165.getClass(), "value", -6723783499250797216L);
        setLongField(term12191, term12191.getClass(), "seconds", 1795954337L);
        setIntField(term12191, term12191.getClass(), "nanos", 628000000);
        setField(term12165, term12165.getClass(), "instant", term12191);
        setField(term12165, term12165.getClass(), "valueAsString", "HqBOwkVqjD");
        setField(term12064, term12064.getClass(), "ctime", term12165);
        setLongField(term12064, term12064.getClass(), "crc", -1L);
        setLongField(term12064, term12064.getClass(), "csize", -1L);
        setIntField(term12064, term12064.getClass(), "flag", 2095798786);
        setField(term12064, term12064.getClass(), "extra", term12211);
        setField(term12064, term12064.getClass(), "comment", "MAcUBcBckh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParseableExtraFieldsNoCopy", argTypes, term12064, args);
    }

};


