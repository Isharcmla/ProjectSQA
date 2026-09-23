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

public class ZipArchiveEntry_copyOf_81940170223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14010;
     Object term14189;

    public ZipArchiveEntry_copyOf_81940170223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14203 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14202 = ((Class) term14203).getDeclaredField((String) "MICROSECONDS");
        ((Field) term14202).setAccessible(true);
        Object enum53 = ((Field) term14202).get((Object) null);
        Class<? extends Object> term14401 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14400 = ((Class) term14401).getDeclaredField((String) "DAYS");
        ((Field) term14400).setAccessible(true);
        Object enum54 = ((Field) term14400).get((Object) null);
        Class<? extends Object> term14575 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14574 = ((Class) term14575).getDeclaredField((String) "NANOSECONDS");
        ((Field) term14574).setAccessible(true);
        Object enum55 = ((Field) term14574).get((Object) null);
        term14010 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term14019 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 6);
        Object term14020 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term14021 = (byte[]) newByteArray(5);
        byte[] term14027 = (byte[]) newByteArray(3);
        byte[] term14033 = (byte[]) newByteArray(4);
        Object term14038 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term14048 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14074 = newInstance(Class.forName("java.time.Instant"));
        Object term14089 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14107 = newInstance(Class.forName("java.time.Instant"));
        Object term14122 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14147 = newInstance(Class.forName("java.time.Instant"));
        byte[] term14167 = (byte[]) newByteArray(8);
        setIntField(term14010, term14010.getClass(), "method", -1);
        setLongField(term14010, term14010.getClass(), "size", -1L);
        setIntField(term14010, term14010.getClass(), "internalAttributes", 1283079251);
        setIntField(term14010, term14010.getClass(), "versionRequired", -523949691);
        setIntField(term14010, term14010.getClass(), "versionMadeBy", 1398204340);
        setIntField(term14010, term14010.getClass(), "platform", 229204365);
        setIntField(term14010, term14010.getClass(), "rawFlag", -461771056);
        setLongField(term14010, term14010.getClass(), "externalAttributes", 5510783420697225605L);
        setField(term14010, term14010.getClass(), "extraFields", term14019);
        setByteElement(term14021, 0, (byte) 63);
        setByteElement(term14021, 1, (byte) -41);
        setByteElement(term14021, 2, (byte) -44);
        setByteElement(term14021, 3, (byte) -120);
        setByteElement(term14021, 4, (byte) -55);
        setField(term14020, term14020.getClass(), "localFileData", term14021);
        setByteElement(term14027, 0, (byte) 91);
        setByteElement(term14027, 1, (byte) 55);
        setByteElement(term14027, 2, (byte) -5);
        setField(term14020, term14020.getClass(), "centralDirectoryData", term14027);
        setField(term14010, term14010.getClass(), "unparseableExtra", term14020);
        setField(term14010, term14010.getClass(), "name", "");
        setByteElement(term14033, 0, (byte) -4);
        setByteElement(term14033, 1, (byte) -61);
        setByteElement(term14033, 2, (byte) -34);
        setByteElement(term14033, 3, (byte) 73);
        setField(term14010, term14010.getClass(), "rawName", term14033);
        setBooleanField(term14038, term14038.getClass(), "languageEncodingFlag", false);
        setBooleanField(term14038, term14038.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term14038, term14038.getClass(), "encryptionFlag", false);
        setBooleanField(term14038, term14038.getClass(), "strongEncryptionFlag", false);
        setIntField(term14038, term14038.getClass(), "slidingDictionarySize", 0);
        setIntField(term14038, term14038.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term14010, term14010.getClass(), "gpb", term14038);
        setLongField(term14010, term14010.getClass(), "xdostime", -1L);
        setField(term14048, term14048.getClass(), "unit", enum53);
        setLongField(term14048, term14048.getClass(), "value", 6005241913654469005L);
        setLongField(term14074, term14074.getClass(), "seconds", 1466026719L);
        setIntField(term14074, term14074.getClass(), "nanos", 289000000);
        setField(term14048, term14048.getClass(), "instant", term14074);
        setField(term14048, term14048.getClass(), "valueAsString", "cAPeiZHKGJ");
        setField(term14010, term14010.getClass(), "mtime", term14048);
        setField(term14089, term14089.getClass(), "unit", enum54);
        setLongField(term14089, term14089.getClass(), "value", -1983291584002806658L);
        setLongField(term14107, term14107.getClass(), "seconds", 1535856449L);
        setIntField(term14107, term14107.getClass(), "nanos", 65000000);
        setField(term14089, term14089.getClass(), "instant", term14107);
        setField(term14089, term14089.getClass(), "valueAsString", "LvJFtLBaxj");
        setField(term14010, term14010.getClass(), "atime", term14089);
        setField(term14122, term14122.getClass(), "unit", enum55);
        setLongField(term14122, term14122.getClass(), "value", 5946780097489996391L);
        setLongField(term14147, term14147.getClass(), "seconds", 1345941503L);
        setIntField(term14147, term14147.getClass(), "nanos", 543000000);
        setField(term14122, term14122.getClass(), "instant", term14147);
        setField(term14122, term14122.getClass(), "valueAsString", "PHvxnGHptP");
        setField(term14010, term14010.getClass(), "ctime", term14122);
        setLongField(term14010, term14010.getClass(), "crc", -1L);
        setLongField(term14010, term14010.getClass(), "csize", -1L);
        setIntField(term14010, term14010.getClass(), "flag", -243422082);
        setByteElement(term14167, 0, (byte) 10);
        setByteElement(term14167, 1, (byte) 36);
        setByteElement(term14167, 2, (byte) 103);
        setByteElement(term14167, 3, (byte) -64);
        setByteElement(term14167, 4, (byte) -107);
        setByteElement(term14167, 5, (byte) 119);
        setByteElement(term14167, 6, (byte) -109);
        setByteElement(term14167, 7, (byte) 87);
        setField(term14010, term14010.getClass(), "extra", term14167);
        setField(term14010, term14010.getClass(), "comment", "TimdotUuNC");
        term14189 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term14189;
        callMethod(klass, "copyOf", argTypes, term14010, args);
    }

};


