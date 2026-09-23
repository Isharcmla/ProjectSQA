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

public class ZipArchiveEntry_getName_109882553839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24592;

    public ZipArchiveEntry_getName_109882553839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24769 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term24768 = ((Class) term24769).getDeclaredField((String) "MICROSECONDS");
        ((Field) term24768).setAccessible(true);
        Object enum93 = ((Field) term24768).get((Object) null);
        Class<? extends Object> term24967 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term24966 = ((Class) term24967).getDeclaredField((String) "MILLISECONDS");
        ((Field) term24966).setAccessible(true);
        Object enum94 = ((Field) term24966).get((Object) null);
        term24592 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term24601 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 0);
        Object term24602 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term24603 = (byte[]) newByteArray(9);
        byte[] term24613 = (byte[]) newByteArray(5);
        byte[] term24621 = (byte[]) newByteArray(1);
        Object term24623 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term24633 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term24659 = newInstance(Class.forName("java.time.Instant"));
        Object term24674 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term24700 = newInstance(Class.forName("java.time.Instant"));
        Object term24715 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term24717 = newInstance(Class.forName("java.time.Instant"));
        byte[] term24737 = (byte[]) newByteArray(2);
        setIntField(term24592, term24592.getClass(), "method", -1);
        setLongField(term24592, term24592.getClass(), "size", -1L);
        setIntField(term24592, term24592.getClass(), "internalAttributes", 413548937);
        setIntField(term24592, term24592.getClass(), "versionRequired", 1901317214);
        setIntField(term24592, term24592.getClass(), "versionMadeBy", 1166710220);
        setIntField(term24592, term24592.getClass(), "platform", -1070592289);
        setIntField(term24592, term24592.getClass(), "rawFlag", -1464172784);
        setLongField(term24592, term24592.getClass(), "externalAttributes", -6587807377747738663L);
        setField(term24592, term24592.getClass(), "extraFields", term24601);
        setByteElement(term24603, 0, (byte) 62);
        setByteElement(term24603, 1, (byte) 38);
        setByteElement(term24603, 2, (byte) 31);
        setByteElement(term24603, 3, (byte) -105);
        setByteElement(term24603, 4, (byte) 73);
        setByteElement(term24603, 5, (byte) -67);
        setByteElement(term24603, 6, (byte) -72);
        setByteElement(term24603, 7, (byte) 38);
        setByteElement(term24603, 8, (byte) 91);
        setField(term24602, term24602.getClass(), "localFileData", term24603);
        setByteElement(term24613, 0, (byte) 113);
        setByteElement(term24613, 1, (byte) -75);
        setByteElement(term24613, 2, (byte) -92);
        setByteElement(term24613, 3, (byte) 52);
        setByteElement(term24613, 4, (byte) -101);
        setField(term24602, term24602.getClass(), "centralDirectoryData", term24613);
        setField(term24592, term24592.getClass(), "unparseableExtra", term24602);
        setField(term24592, term24592.getClass(), "name", "");
        setByteElement(term24621, 0, (byte) -64);
        setField(term24592, term24592.getClass(), "rawName", term24621);
        setBooleanField(term24623, term24623.getClass(), "languageEncodingFlag", false);
        setBooleanField(term24623, term24623.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term24623, term24623.getClass(), "encryptionFlag", false);
        setBooleanField(term24623, term24623.getClass(), "strongEncryptionFlag", false);
        setIntField(term24623, term24623.getClass(), "slidingDictionarySize", 0);
        setIntField(term24623, term24623.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term24592, term24592.getClass(), "gpb", term24623);
        setLongField(term24592, term24592.getClass(), "xdostime", -1L);
        setField(term24633, term24633.getClass(), "unit", enum93);
        setLongField(term24633, term24633.getClass(), "value", -6301101997917060727L);
        setLongField(term24659, term24659.getClass(), "seconds", 1758791264L);
        setIntField(term24659, term24659.getClass(), "nanos", 597000000);
        setField(term24633, term24633.getClass(), "instant", term24659);
        setField(term24633, term24633.getClass(), "valueAsString", "WHcwFgsGFC");
        setField(term24592, term24592.getClass(), "mtime", term24633);
        setField(term24674, term24674.getClass(), "unit", enum94);
        setLongField(term24674, term24674.getClass(), "value", 8166095254618543564L);
        setLongField(term24700, term24700.getClass(), "seconds", 1303907782L);
        setIntField(term24700, term24700.getClass(), "nanos", 295000000);
        setField(term24674, term24674.getClass(), "instant", term24700);
        setField(term24674, term24674.getClass(), "valueAsString", "HzqpegHiRq");
        setField(term24592, term24592.getClass(), "atime", term24674);
        setField(term24715, term24715.getClass(), "unit", enum93);
        setLongField(term24715, term24715.getClass(), "value", -4598158870068953328L);
        setLongField(term24717, term24717.getClass(), "seconds", 1316990437L);
        setIntField(term24717, term24717.getClass(), "nanos", 233000000);
        setField(term24715, term24715.getClass(), "instant", term24717);
        setField(term24715, term24715.getClass(), "valueAsString", "jwsfVjMoJT");
        setField(term24592, term24592.getClass(), "ctime", term24715);
        setLongField(term24592, term24592.getClass(), "crc", -1L);
        setLongField(term24592, term24592.getClass(), "csize", -1L);
        setIntField(term24592, term24592.getClass(), "flag", 32185364);
        setByteElement(term24737, 0, (byte) 107);
        setByteElement(term24737, 1, (byte) 91);
        setField(term24592, term24592.getClass(), "extra", term24737);
        setField(term24592, term24592.getClass(), "comment", "ZfdXfCCFDf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term24592, args);
    }

};


