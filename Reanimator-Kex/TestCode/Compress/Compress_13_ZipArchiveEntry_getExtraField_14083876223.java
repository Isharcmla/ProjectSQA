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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.String;

public class ZipArchiveEntry_getExtraField_14083876223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14095;
     Object term14274;

    public ZipArchiveEntry_getExtraField_14083876223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term14101 = new LinkedHashMap();
        Class<? extends Object> term14291 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14290 = ((Class) term14291).getDeclaredField((String) "MICROSECONDS");
        ((Field) term14290).setAccessible(true);
        Object enum53 = ((Field) term14290).get((Object) null);
        Class<? extends Object> term14489 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14488 = ((Class) term14489).getDeclaredField((String) "DAYS");
        ((Field) term14488).setAccessible(true);
        Object enum54 = ((Field) term14488).get((Object) null);
        Class<? extends Object> term14663 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14662 = ((Class) term14663).getDeclaredField((String) "NANOSECONDS");
        ((Field) term14662).setAccessible(true);
        Object enum55 = ((Field) term14662).get((Object) null);
        term14095 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term14112 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term14113 = (byte[]) newByteArray(7);
        byte[] term14121 = (byte[]) newByteArray(0);
        byte[] term14124 = (byte[]) newByteArray(7);
        Object term14132 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term14140 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14166 = newInstance(Class.forName("java.time.Instant"));
        Object term14181 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14199 = newInstance(Class.forName("java.time.Instant"));
        Object term14214 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14239 = newInstance(Class.forName("java.time.Instant"));
        byte[] term14259 = (byte[]) newByteArray(1);
        setIntField(term14095, term14095.getClass(), "method", -1);
        setLongField(term14095, term14095.getClass(), "size", -1L);
        setIntField(term14095, term14095.getClass(), "internalAttributes", 1474524152);
        setIntField(term14095, term14095.getClass(), "platform", 568954359);
        setLongField(term14095, term14095.getClass(), "externalAttributes", 5510783420697225605L);
        setField(term14095, term14095.getClass(), "extraFields", term14101);
        setByteElement(term14113, 0, (byte) -57);
        setByteElement(term14113, 1, (byte) 103);
        setByteElement(term14113, 2, (byte) 40);
        setByteElement(term14113, 3, (byte) -106);
        setByteElement(term14113, 4, (byte) -95);
        setByteElement(term14113, 5, (byte) 69);
        setByteElement(term14113, 6, (byte) 63);
        setField(term14112, term14112.getClass(), "localFileData", term14113);
        setField(term14112, term14112.getClass(), "centralDirectoryData", term14121);
        setField(term14095, term14095.getClass(), "unparseableExtra", term14112);
        setField(term14095, term14095.getClass(), "name", "");
        setByteElement(term14124, 0, (byte) -41);
        setByteElement(term14124, 1, (byte) -44);
        setByteElement(term14124, 2, (byte) -120);
        setByteElement(term14124, 3, (byte) -55);
        setByteElement(term14124, 4, (byte) 91);
        setByteElement(term14124, 5, (byte) 55);
        setByteElement(term14124, 6, (byte) -5);
        setField(term14095, term14095.getClass(), "rawName", term14124);
        setBooleanField(term14132, term14132.getClass(), "languageEncodingFlag", false);
        setBooleanField(term14132, term14132.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term14132, term14132.getClass(), "encryptionFlag", false);
        setBooleanField(term14132, term14132.getClass(), "strongEncryptionFlag", false);
        setField(term14095, term14095.getClass(), "gpb", term14132);
        setLongField(term14095, term14095.getClass(), "xdostime", -1L);
        setField(term14140, term14140.getClass(), "unit", enum53);
        setLongField(term14140, term14140.getClass(), "value", 6005241913654469005L);
        setLongField(term14166, term14166.getClass(), "seconds", 1466026719L);
        setIntField(term14166, term14166.getClass(), "nanos", 289000000);
        setField(term14140, term14140.getClass(), "instant", term14166);
        setField(term14140, term14140.getClass(), "valueAsString", "cAPeiZHKGJ");
        setField(term14095, term14095.getClass(), "mtime", term14140);
        setField(term14181, term14181.getClass(), "unit", enum54);
        setLongField(term14181, term14181.getClass(), "value", -1983291584002806658L);
        setLongField(term14199, term14199.getClass(), "seconds", 1535856449L);
        setIntField(term14199, term14199.getClass(), "nanos", 65000000);
        setField(term14181, term14181.getClass(), "instant", term14199);
        setField(term14181, term14181.getClass(), "valueAsString", "LvJFtLBaxj");
        setField(term14095, term14095.getClass(), "atime", term14181);
        setField(term14214, term14214.getClass(), "unit", enum55);
        setLongField(term14214, term14214.getClass(), "value", 5946780097489996391L);
        setLongField(term14239, term14239.getClass(), "seconds", 1345941503L);
        setIntField(term14239, term14239.getClass(), "nanos", 543000000);
        setField(term14214, term14214.getClass(), "instant", term14239);
        setField(term14214, term14214.getClass(), "valueAsString", "PHvxnGHptP");
        setField(term14095, term14095.getClass(), "ctime", term14214);
        setLongField(term14095, term14095.getClass(), "crc", -1L);
        setLongField(term14095, term14095.getClass(), "csize", -1L);
        setIntField(term14095, term14095.getClass(), "flag", -375014958);
        setByteElement(term14259, 0, (byte) -4);
        setField(term14095, term14095.getClass(), "extra", term14259);
        setField(term14095, term14095.getClass(), "comment", "TimdotUuNC");
        term14274 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term14274, term14274.getClass(), "value", 480137250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipShort");
        Object[] args = new Object[1];
        args[0] = term14274;
        callMethod(klass, "getExtraField", argTypes, term14095, args);
    }

};


