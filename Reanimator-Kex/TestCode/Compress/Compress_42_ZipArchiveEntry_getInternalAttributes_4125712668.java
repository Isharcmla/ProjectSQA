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

public class ZipArchiveEntry_getInternalAttributes_4125712668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3551;

    public ZipArchiveEntry_getInternalAttributes_4125712668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3748 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3747 = ((Class) term3748).getDeclaredField((String) "MICROSECONDS");
        ((Field) term3747).setAccessible(true);
        Object enum13 = ((Field) term3747).get((Object) null);
        Class<? extends Object> term3946 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3945 = ((Class) term3946).getDeclaredField((String) "SECONDS");
        ((Field) term3945).setAccessible(true);
        Object enum14 = ((Field) term3945).get((Object) null);
        Class<? extends Object> term4129 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4128 = ((Class) term4129).getDeclaredField((String) "HOURS");
        ((Field) term4128).setAccessible(true);
        Object enum15 = ((Field) term4128).get((Object) null);
        term3551 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term3560 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 1);
        Object term3561 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term3562 = (byte[]) newByteArray(9);
        byte[] term3572 = (byte[]) newByteArray(3);
        byte[] term3578 = (byte[]) newByteArray(5);
        Object term3584 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term3594 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3620 = newInstance(Class.forName("java.time.Instant"));
        Object term3635 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3656 = newInstance(Class.forName("java.time.Instant"));
        Object term3671 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3690 = newInstance(Class.forName("java.time.Instant"));
        byte[] term3710 = (byte[]) newByteArray(6);
        setIntField(term3551, term3551.getClass(), "method", -1);
        setLongField(term3551, term3551.getClass(), "size", -1L);
        setIntField(term3551, term3551.getClass(), "internalAttributes", -469968304);
        setIntField(term3551, term3551.getClass(), "versionRequired", -1145578966);
        setIntField(term3551, term3551.getClass(), "versionMadeBy", 679763016);
        setIntField(term3551, term3551.getClass(), "platform", 1962444399);
        setIntField(term3551, term3551.getClass(), "rawFlag", 767834723);
        setLongField(term3551, term3551.getClass(), "externalAttributes", -4920224193275732920L);
        setField(term3551, term3551.getClass(), "extraFields", term3560);
        setByteElement(term3562, 0, (byte) 13);
        setByteElement(term3562, 1, (byte) 44);
        setByteElement(term3562, 2, (byte) -63);
        setByteElement(term3562, 3, (byte) 15);
        setByteElement(term3562, 4, (byte) 45);
        setByteElement(term3562, 5, (byte) -39);
        setByteElement(term3562, 6, (byte) -20);
        setByteElement(term3562, 7, (byte) 10);
        setByteElement(term3562, 8, (byte) 77);
        setField(term3561, term3561.getClass(), "localFileData", term3562);
        setByteElement(term3572, 0, (byte) 14);
        setByteElement(term3572, 1, (byte) -101);
        setByteElement(term3572, 2, (byte) 35);
        setField(term3561, term3561.getClass(), "centralDirectoryData", term3572);
        setField(term3551, term3551.getClass(), "unparseableExtra", term3561);
        setField(term3551, term3551.getClass(), "name", "");
        setByteElement(term3578, 0, (byte) 66);
        setByteElement(term3578, 1, (byte) 123);
        setByteElement(term3578, 2, (byte) -5);
        setByteElement(term3578, 3, (byte) 84);
        setByteElement(term3578, 4, (byte) -97);
        setField(term3551, term3551.getClass(), "rawName", term3578);
        setBooleanField(term3584, term3584.getClass(), "languageEncodingFlag", false);
        setBooleanField(term3584, term3584.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term3584, term3584.getClass(), "encryptionFlag", false);
        setBooleanField(term3584, term3584.getClass(), "strongEncryptionFlag", false);
        setIntField(term3584, term3584.getClass(), "slidingDictionarySize", 0);
        setIntField(term3584, term3584.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term3551, term3551.getClass(), "gpb", term3584);
        setLongField(term3551, term3551.getClass(), "xdostime", -1L);
        setField(term3594, term3594.getClass(), "unit", enum13);
        setLongField(term3594, term3594.getClass(), "value", 8428634514691209827L);
        setLongField(term3620, term3620.getClass(), "seconds", 1863649094L);
        setIntField(term3620, term3620.getClass(), "nanos", 992000000);
        setField(term3594, term3594.getClass(), "instant", term3620);
        setField(term3594, term3594.getClass(), "valueAsString", "BYqFIqCKAV");
        setField(term3551, term3551.getClass(), "mtime", term3594);
        setField(term3635, term3635.getClass(), "unit", enum14);
        setLongField(term3635, term3635.getClass(), "value", -2585684163342970173L);
        setLongField(term3656, term3656.getClass(), "seconds", 1882656884L);
        setIntField(term3656, term3656.getClass(), "nanos", 364000000);
        setField(term3635, term3635.getClass(), "instant", term3656);
        setField(term3635, term3635.getClass(), "valueAsString", "vrQLuWIDJX");
        setField(term3551, term3551.getClass(), "atime", term3635);
        setField(term3671, term3671.getClass(), "unit", enum15);
        setLongField(term3671, term3671.getClass(), "value", 8059786003080744426L);
        setLongField(term3690, term3690.getClass(), "seconds", 1437775323L);
        setIntField(term3690, term3690.getClass(), "nanos", 580000000);
        setField(term3671, term3671.getClass(), "instant", term3690);
        setField(term3671, term3671.getClass(), "valueAsString", "flxyYxBRtu");
        setField(term3551, term3551.getClass(), "ctime", term3671);
        setLongField(term3551, term3551.getClass(), "crc", -1L);
        setLongField(term3551, term3551.getClass(), "csize", -1L);
        setIntField(term3551, term3551.getClass(), "flag", -602026508);
        setByteElement(term3710, 0, (byte) -24);
        setByteElement(term3710, 1, (byte) 88);
        setByteElement(term3710, 2, (byte) 96);
        setByteElement(term3710, 3, (byte) 70);
        setByteElement(term3710, 4, (byte) 48);
        setByteElement(term3710, 5, (byte) -46);
        setField(term3551, term3551.getClass(), "extra", term3710);
        setField(term3551, term3551.getClass(), "comment", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInternalAttributes", argTypes, term3551, args);
    }

};


