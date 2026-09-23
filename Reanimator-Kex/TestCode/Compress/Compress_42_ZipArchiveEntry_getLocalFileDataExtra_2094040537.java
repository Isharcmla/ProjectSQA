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

public class ZipArchiveEntry_getLocalFileDataExtra_2094040537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23462;

    public ZipArchiveEntry_getLocalFileDataExtra_2094040537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23618 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term23617 = ((Class) term23618).getDeclaredField((String) "DAYS");
        ((Field) term23617).setAccessible(true);
        Object enum89 = ((Field) term23617).get((Object) null);
        term23462 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term23471 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 4);
        Object term23472 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term23473 = (byte[]) newByteArray(4);
        byte[] term23478 = (byte[]) newByteArray(8);
        byte[] term23489 = (byte[]) newByteArray(7);
        Object term23497 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term23507 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23525 = newInstance(Class.forName("java.time.Instant"));
        Object term23540 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23542 = newInstance(Class.forName("java.time.Instant"));
        Object term23557 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23559 = newInstance(Class.forName("java.time.Instant"));
        byte[] term23579 = (byte[]) newByteArray(5);
        setIntField(term23462, term23462.getClass(), "method", -1);
        setLongField(term23462, term23462.getClass(), "size", -1L);
        setIntField(term23462, term23462.getClass(), "internalAttributes", 2009020256);
        setIntField(term23462, term23462.getClass(), "versionRequired", 2049577015);
        setIntField(term23462, term23462.getClass(), "versionMadeBy", 1236004505);
        setIntField(term23462, term23462.getClass(), "platform", 1050765721);
        setIntField(term23462, term23462.getClass(), "rawFlag", 474518942);
        setLongField(term23462, term23462.getClass(), "externalAttributes", -1616722610139554082L);
        setField(term23462, term23462.getClass(), "extraFields", term23471);
        setByteElement(term23473, 0, (byte) 40);
        setByteElement(term23473, 1, (byte) -31);
        setByteElement(term23473, 2, (byte) 83);
        setByteElement(term23473, 3, (byte) 19);
        setField(term23472, term23472.getClass(), "localFileData", term23473);
        setByteElement(term23478, 0, (byte) 95);
        setByteElement(term23478, 1, (byte) 95);
        setByteElement(term23478, 2, (byte) 15);
        setByteElement(term23478, 3, (byte) 121);
        setByteElement(term23478, 4, (byte) 83);
        setByteElement(term23478, 5, (byte) -2);
        setByteElement(term23478, 6, (byte) 101);
        setByteElement(term23478, 7, (byte) 14);
        setField(term23472, term23472.getClass(), "centralDirectoryData", term23478);
        setField(term23462, term23462.getClass(), "unparseableExtra", term23472);
        setField(term23462, term23462.getClass(), "name", "");
        setByteElement(term23489, 0, (byte) 106);
        setByteElement(term23489, 1, (byte) -24);
        setByteElement(term23489, 3, (byte) -88);
        setByteElement(term23489, 4, (byte) 87);
        setByteElement(term23489, 5, (byte) -51);
        setByteElement(term23489, 6, (byte) -55);
        setField(term23462, term23462.getClass(), "rawName", term23489);
        setBooleanField(term23497, term23497.getClass(), "languageEncodingFlag", false);
        setBooleanField(term23497, term23497.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term23497, term23497.getClass(), "encryptionFlag", false);
        setBooleanField(term23497, term23497.getClass(), "strongEncryptionFlag", false);
        setIntField(term23497, term23497.getClass(), "slidingDictionarySize", 0);
        setIntField(term23497, term23497.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term23462, term23462.getClass(), "gpb", term23497);
        setLongField(term23462, term23462.getClass(), "xdostime", -1L);
        setField(term23507, term23507.getClass(), "unit", enum89);
        setLongField(term23507, term23507.getClass(), "value", 7495904023107549024L);
        setLongField(term23525, term23525.getClass(), "seconds", 1618612705L);
        setIntField(term23525, term23525.getClass(), "nanos", 278000000);
        setField(term23507, term23507.getClass(), "instant", term23525);
        setField(term23507, term23507.getClass(), "valueAsString", "LWyEaeIyAo");
        setField(term23462, term23462.getClass(), "mtime", term23507);
        setField(term23540, term23540.getClass(), "unit", enum89);
        setLongField(term23540, term23540.getClass(), "value", 8802866251294305945L);
        setLongField(term23542, term23542.getClass(), "seconds", 1584154591L);
        setIntField(term23542, term23542.getClass(), "nanos", 305000000);
        setField(term23540, term23540.getClass(), "instant", term23542);
        setField(term23540, term23540.getClass(), "valueAsString", "yVMkkQhvmN");
        setField(term23462, term23462.getClass(), "atime", term23540);
        setField(term23557, term23557.getClass(), "unit", enum89);
        setLongField(term23557, term23557.getClass(), "value", 4513004407927379358L);
        setLongField(term23559, term23559.getClass(), "seconds", 1309150342L);
        setIntField(term23559, term23559.getClass(), "nanos", 717000000);
        setField(term23557, term23557.getClass(), "instant", term23559);
        setField(term23557, term23557.getClass(), "valueAsString", "mvrkADEgpp");
        setField(term23462, term23462.getClass(), "ctime", term23557);
        setLongField(term23462, term23462.getClass(), "crc", -1L);
        setLongField(term23462, term23462.getClass(), "csize", -1L);
        setIntField(term23462, term23462.getClass(), "flag", -1656687479);
        setByteElement(term23579, 0, (byte) 67);
        setByteElement(term23579, 1, (byte) 8);
        setByteElement(term23579, 2, (byte) -11);
        setByteElement(term23579, 3, (byte) 104);
        setByteElement(term23579, 4, (byte) 56);
        setField(term23462, term23462.getClass(), "extra", term23579);
        setField(term23462, term23462.getClass(), "comment", "pXOkjyeIRb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocalFileDataExtra", argTypes, term23462, args);
    }

};


