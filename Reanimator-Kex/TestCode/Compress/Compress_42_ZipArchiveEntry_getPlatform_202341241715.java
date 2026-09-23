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

public class ZipArchiveEntry_getPlatform_202341241715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8455;

    public ZipArchiveEntry_getPlatform_202341241715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8658 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8657 = ((Class) term8658).getDeclaredField((String) "NANOSECONDS");
        ((Field) term8657).setAccessible(true);
        Object enum32 = ((Field) term8657).get((Object) null);
        Class<? extends Object> term8853 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8852 = ((Class) term8853).getDeclaredField((String) "HOURS");
        ((Field) term8852).setAccessible(true);
        Object enum33 = ((Field) term8852).get((Object) null);
        Class<? extends Object> term9030 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9029 = ((Class) term9030).getDeclaredField((String) "MILLISECONDS");
        ((Field) term9029).setAccessible(true);
        Object enum34 = ((Field) term9029).get((Object) null);
        term8455 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term8464 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 7);
        Object term8465 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term8466 = (byte[]) newByteArray(2);
        byte[] term8469 = (byte[]) newByteArray(9);
        byte[] term8481 = (byte[]) newByteArray(7);
        Object term8489 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term8499 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8524 = newInstance(Class.forName("java.time.Instant"));
        Object term8539 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8558 = newInstance(Class.forName("java.time.Instant"));
        Object term8573 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8599 = newInstance(Class.forName("java.time.Instant"));
        byte[] term8619 = (byte[]) newByteArray(6);
        setIntField(term8455, term8455.getClass(), "method", -1);
        setLongField(term8455, term8455.getClass(), "size", -1L);
        setIntField(term8455, term8455.getClass(), "internalAttributes", 444029505);
        setIntField(term8455, term8455.getClass(), "versionRequired", -1034506028);
        setIntField(term8455, term8455.getClass(), "versionMadeBy", -1263114719);
        setIntField(term8455, term8455.getClass(), "platform", -894662986);
        setIntField(term8455, term8455.getClass(), "rawFlag", 304775596);
        setLongField(term8455, term8455.getClass(), "externalAttributes", -4443169559037975007L);
        setField(term8455, term8455.getClass(), "extraFields", term8464);
        setByteElement(term8466, 0, (byte) -4);
        setByteElement(term8466, 1, (byte) -27);
        setField(term8465, term8465.getClass(), "localFileData", term8466);
        setByteElement(term8469, 0, (byte) 120);
        setByteElement(term8469, 1, (byte) -25);
        setByteElement(term8469, 2, (byte) 114);
        setByteElement(term8469, 3, (byte) 105);
        setByteElement(term8469, 4, (byte) -95);
        setByteElement(term8469, 5, (byte) -6);
        setByteElement(term8469, 6, (byte) 51);
        setByteElement(term8469, 7, (byte) 122);
        setByteElement(term8469, 8, (byte) 84);
        setField(term8465, term8465.getClass(), "centralDirectoryData", term8469);
        setField(term8455, term8455.getClass(), "unparseableExtra", term8465);
        setField(term8455, term8455.getClass(), "name", "");
        setByteElement(term8481, 0, (byte) -36);
        setByteElement(term8481, 1, (byte) 103);
        setByteElement(term8481, 2, (byte) -63);
        setByteElement(term8481, 3, (byte) 39);
        setByteElement(term8481, 4, (byte) -54);
        setByteElement(term8481, 5, (byte) 9);
        setByteElement(term8481, 6, (byte) 19);
        setField(term8455, term8455.getClass(), "rawName", term8481);
        setBooleanField(term8489, term8489.getClass(), "languageEncodingFlag", false);
        setBooleanField(term8489, term8489.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term8489, term8489.getClass(), "encryptionFlag", false);
        setBooleanField(term8489, term8489.getClass(), "strongEncryptionFlag", false);
        setIntField(term8489, term8489.getClass(), "slidingDictionarySize", 0);
        setIntField(term8489, term8489.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term8455, term8455.getClass(), "gpb", term8489);
        setLongField(term8455, term8455.getClass(), "xdostime", -1L);
        setField(term8499, term8499.getClass(), "unit", enum32);
        setLongField(term8499, term8499.getClass(), "value", -3842548265506930260L);
        setLongField(term8524, term8524.getClass(), "seconds", 1488743902L);
        setIntField(term8524, term8524.getClass(), "nanos", 101000000);
        setField(term8499, term8499.getClass(), "instant", term8524);
        setField(term8499, term8499.getClass(), "valueAsString", "UoYtihxVaS");
        setField(term8455, term8455.getClass(), "mtime", term8499);
        setField(term8539, term8539.getClass(), "unit", enum33);
        setLongField(term8539, term8539.getClass(), "value", -5788180182343976541L);
        setLongField(term8558, term8558.getClass(), "seconds", 1311578117L);
        setIntField(term8558, term8558.getClass(), "nanos", 361000000);
        setField(term8539, term8539.getClass(), "instant", term8558);
        setField(term8539, term8539.getClass(), "valueAsString", "JDswTTCZHV");
        setField(term8455, term8455.getClass(), "atime", term8539);
        setField(term8573, term8573.getClass(), "unit", enum34);
        setLongField(term8573, term8573.getClass(), "value", 2936323121573284007L);
        setLongField(term8599, term8599.getClass(), "seconds", 1595535583L);
        setIntField(term8599, term8599.getClass(), "nanos", 842000000);
        setField(term8573, term8573.getClass(), "instant", term8599);
        setField(term8573, term8573.getClass(), "valueAsString", "onpbIeEKoi");
        setField(term8455, term8455.getClass(), "ctime", term8573);
        setLongField(term8455, term8455.getClass(), "crc", -1L);
        setLongField(term8455, term8455.getClass(), "csize", -1L);
        setIntField(term8455, term8455.getClass(), "flag", -1347665717);
        setByteElement(term8619, 0, (byte) -103);
        setByteElement(term8619, 1, (byte) 61);
        setByteElement(term8619, 2, (byte) -90);
        setByteElement(term8619, 3, (byte) -27);
        setByteElement(term8619, 4, (byte) 119);
        setByteElement(term8619, 5, (byte) -125);
        setField(term8455, term8455.getClass(), "extra", term8619);
        setField(term8455, term8455.getClass(), "comment", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlatform", argTypes, term8455, args);
    }

};


