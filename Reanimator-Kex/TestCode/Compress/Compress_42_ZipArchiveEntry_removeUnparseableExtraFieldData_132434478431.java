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

public class ZipArchiveEntry_removeUnparseableExtraFieldData_132434478431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19252;

    public ZipArchiveEntry_removeUnparseableExtraFieldData_132434478431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19444 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19443 = ((Class) term19444).getDeclaredField((String) "MILLISECONDS");
        ((Field) term19443).setAccessible(true);
        Object enum73 = ((Field) term19443).get((Object) null);
        Class<? extends Object> term19642 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19641 = ((Class) term19642).getDeclaredField((String) "SECONDS");
        ((Field) term19641).setAccessible(true);
        Object enum74 = ((Field) term19641).get((Object) null);
        Class<? extends Object> term19825 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19824 = ((Class) term19825).getDeclaredField((String) "DAYS");
        ((Field) term19824).setAccessible(true);
        Object enum75 = ((Field) term19824).get((Object) null);
        term19252 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term19261 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 1);
        Object term19262 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term19263 = (byte[]) newByteArray(8);
        byte[] term19272 = (byte[]) newByteArray(7);
        byte[] term19282 = (byte[]) newByteArray(2);
        Object term19285 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term19295 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term19321 = newInstance(Class.forName("java.time.Instant"));
        Object term19336 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term19357 = newInstance(Class.forName("java.time.Instant"));
        Object term19372 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term19390 = newInstance(Class.forName("java.time.Instant"));
        byte[] term19410 = (byte[]) newByteArray(2);
        setIntField(term19252, term19252.getClass(), "method", -1);
        setLongField(term19252, term19252.getClass(), "size", -1L);
        setIntField(term19252, term19252.getClass(), "internalAttributes", 388157121);
        setIntField(term19252, term19252.getClass(), "versionRequired", 1684998508);
        setIntField(term19252, term19252.getClass(), "versionMadeBy", -1476644457);
        setIntField(term19252, term19252.getClass(), "platform", 1270666529);
        setIntField(term19252, term19252.getClass(), "rawFlag", -1146679443);
        setLongField(term19252, term19252.getClass(), "externalAttributes", -6950146046121430355L);
        setField(term19252, term19252.getClass(), "extraFields", term19261);
        setByteElement(term19263, 0, (byte) 95);
        setByteElement(term19263, 1, (byte) -33);
        setByteElement(term19263, 2, (byte) 21);
        setByteElement(term19263, 3, (byte) -8);
        setByteElement(term19263, 4, (byte) -85);
        setByteElement(term19263, 5, (byte) -77);
        setByteElement(term19263, 6, (byte) 106);
        setByteElement(term19263, 7, (byte) 92);
        setField(term19262, term19262.getClass(), "localFileData", term19263);
        setByteElement(term19272, 0, (byte) -110);
        setByteElement(term19272, 1, (byte) -88);
        setByteElement(term19272, 2, (byte) 56);
        setByteElement(term19272, 3, (byte) -106);
        setByteElement(term19272, 4, (byte) 58);
        setByteElement(term19272, 5, (byte) 77);
        setByteElement(term19272, 6, (byte) -54);
        setField(term19262, term19262.getClass(), "centralDirectoryData", term19272);
        setField(term19252, term19252.getClass(), "unparseableExtra", term19262);
        setField(term19252, term19252.getClass(), "name", "");
        setByteElement(term19282, 0, (byte) -59);
        setByteElement(term19282, 1, (byte) 103);
        setField(term19252, term19252.getClass(), "rawName", term19282);
        setBooleanField(term19285, term19285.getClass(), "languageEncodingFlag", false);
        setBooleanField(term19285, term19285.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term19285, term19285.getClass(), "encryptionFlag", false);
        setBooleanField(term19285, term19285.getClass(), "strongEncryptionFlag", false);
        setIntField(term19285, term19285.getClass(), "slidingDictionarySize", 0);
        setIntField(term19285, term19285.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term19252, term19252.getClass(), "gpb", term19285);
        setLongField(term19252, term19252.getClass(), "xdostime", -1L);
        setField(term19295, term19295.getClass(), "unit", enum73);
        setLongField(term19295, term19295.getClass(), "value", 1667122142089513324L);
        setLongField(term19321, term19321.getClass(), "seconds", 1597439765L);
        setIntField(term19321, term19321.getClass(), "nanos", 774000000);
        setField(term19295, term19295.getClass(), "instant", term19321);
        setField(term19295, term19295.getClass(), "valueAsString", "iNwOJRBEjp");
        setField(term19252, term19252.getClass(), "mtime", term19295);
        setField(term19336, term19336.getClass(), "unit", enum74);
        setLongField(term19336, term19336.getClass(), "value", -6342139649364011743L);
        setLongField(term19357, term19357.getClass(), "seconds", 1354753325L);
        setIntField(term19357, term19357.getClass(), "nanos", 477000000);
        setField(term19336, term19336.getClass(), "instant", term19357);
        setField(term19336, term19336.getClass(), "valueAsString", "XylxrMBraH");
        setField(term19252, term19252.getClass(), "atime", term19336);
        setField(term19372, term19372.getClass(), "unit", enum75);
        setLongField(term19372, term19372.getClass(), "value", -4924950707540628022L);
        setLongField(term19390, term19390.getClass(), "seconds", 1415444053L);
        setIntField(term19390, term19390.getClass(), "nanos", 422000000);
        setField(term19372, term19372.getClass(), "instant", term19390);
        setField(term19372, term19372.getClass(), "valueAsString", "pORebkoRdD");
        setField(term19252, term19252.getClass(), "ctime", term19372);
        setLongField(term19252, term19252.getClass(), "crc", -1L);
        setLongField(term19252, term19252.getClass(), "csize", -1L);
        setIntField(term19252, term19252.getClass(), "flag", -860131894);
        setByteElement(term19410, 0, (byte) 127);
        setByteElement(term19410, 1, (byte) 58);
        setField(term19252, term19252.getClass(), "extra", term19410);
        setField(term19252, term19252.getClass(), "comment", "mXGCWJDOqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeUnparseableExtraFieldData", argTypes, term19252, args);
    }

};


