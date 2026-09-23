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

public class ZipArchiveEntry_getInternalAttributes_4125712668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3557;

    public ZipArchiveEntry_getInternalAttributes_4125712668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3563 = new LinkedHashMap();
        Class<? extends Object> term3753 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3752 = ((Class) term3753).getDeclaredField((String) "MICROSECONDS");
        ((Field) term3752).setAccessible(true);
        Object enum13 = ((Field) term3752).get((Object) null);
        Class<? extends Object> term3951 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3950 = ((Class) term3951).getDeclaredField((String) "SECONDS");
        ((Field) term3950).setAccessible(true);
        Object enum14 = ((Field) term3950).get((Object) null);
        Class<? extends Object> term4134 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4133 = ((Class) term4134).getDeclaredField((String) "HOURS");
        ((Field) term4133).setAccessible(true);
        Object enum15 = ((Field) term4133).get((Object) null);
        term3557 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term3574 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term3575 = (byte[]) newByteArray(2);
        byte[] term3578 = (byte[]) newByteArray(8);
        byte[] term3589 = (byte[]) newByteArray(6);
        Object term3596 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term3604 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3630 = newInstance(Class.forName("java.time.Instant"));
        Object term3645 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3666 = newInstance(Class.forName("java.time.Instant"));
        Object term3681 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3700 = newInstance(Class.forName("java.time.Instant"));
        byte[] term3720 = (byte[]) newByteArray(2);
        setIntField(term3557, term3557.getClass(), "method", -1);
        setLongField(term3557, term3557.getClass(), "size", -1L);
        setIntField(term3557, term3557.getClass(), "internalAttributes", -244121226);
        setIntField(term3557, term3557.getClass(), "platform", -203030934);
        setLongField(term3557, term3557.getClass(), "externalAttributes", -4920224193275732920L);
        setField(term3557, term3557.getClass(), "extraFields", term3563);
        setByteElement(term3575, 0, (byte) -81);
        setByteElement(term3575, 1, (byte) 102);
        setField(term3574, term3574.getClass(), "localFileData", term3575);
        setByteElement(term3578, 0, (byte) -118);
        setByteElement(term3578, 1, (byte) -126);
        setByteElement(term3578, 2, (byte) -91);
        setByteElement(term3578, 3, (byte) -104);
        setByteElement(term3578, 4, (byte) -89);
        setByteElement(term3578, 5, (byte) 13);
        setByteElement(term3578, 6, (byte) 44);
        setByteElement(term3578, 7, (byte) -63);
        setField(term3574, term3574.getClass(), "centralDirectoryData", term3578);
        setField(term3557, term3557.getClass(), "unparseableExtra", term3574);
        setField(term3557, term3557.getClass(), "name", "");
        setByteElement(term3589, 0, (byte) 15);
        setByteElement(term3589, 1, (byte) 45);
        setByteElement(term3589, 2, (byte) -39);
        setByteElement(term3589, 3, (byte) -20);
        setByteElement(term3589, 4, (byte) 10);
        setByteElement(term3589, 5, (byte) 77);
        setField(term3557, term3557.getClass(), "rawName", term3589);
        setBooleanField(term3596, term3596.getClass(), "languageEncodingFlag", false);
        setBooleanField(term3596, term3596.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term3596, term3596.getClass(), "encryptionFlag", false);
        setBooleanField(term3596, term3596.getClass(), "strongEncryptionFlag", false);
        setField(term3557, term3557.getClass(), "gpb", term3596);
        setLongField(term3557, term3557.getClass(), "xdostime", -1L);
        setField(term3604, term3604.getClass(), "unit", enum13);
        setLongField(term3604, term3604.getClass(), "value", 8428634514691209827L);
        setLongField(term3630, term3630.getClass(), "seconds", 1863649094L);
        setIntField(term3630, term3630.getClass(), "nanos", 992000000);
        setField(term3604, term3604.getClass(), "instant", term3630);
        setField(term3604, term3604.getClass(), "valueAsString", "BYqFIqCKAV");
        setField(term3557, term3557.getClass(), "mtime", term3604);
        setField(term3645, term3645.getClass(), "unit", enum14);
        setLongField(term3645, term3645.getClass(), "value", -2585684163342970173L);
        setLongField(term3666, term3666.getClass(), "seconds", 1882656884L);
        setIntField(term3666, term3666.getClass(), "nanos", 364000000);
        setField(term3645, term3645.getClass(), "instant", term3666);
        setField(term3645, term3645.getClass(), "valueAsString", "vrQLuWIDJX");
        setField(term3557, term3557.getClass(), "atime", term3645);
        setField(term3681, term3681.getClass(), "unit", enum15);
        setLongField(term3681, term3681.getClass(), "value", 8059786003080744426L);
        setLongField(term3700, term3700.getClass(), "seconds", 1437775323L);
        setIntField(term3700, term3700.getClass(), "nanos", 580000000);
        setField(term3681, term3681.getClass(), "instant", term3700);
        setField(term3681, term3681.getClass(), "valueAsString", "flxyYxBRtu");
        setField(term3557, term3557.getClass(), "ctime", term3681);
        setLongField(term3557, term3557.getClass(), "crc", -1L);
        setLongField(term3557, term3557.getClass(), "csize", -1L);
        setIntField(term3557, term3557.getClass(), "flag", -73683645);
        setByteElement(term3720, 0, (byte) 14);
        setByteElement(term3720, 1, (byte) -101);
        setField(term3557, term3557.getClass(), "extra", term3720);
        setField(term3557, term3557.getClass(), "comment", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInternalAttributes", argTypes, term3557, args);
    }

};


