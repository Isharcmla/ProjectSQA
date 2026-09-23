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

public class ZipArchiveEntry_getSize_113521713533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20801;

    public ZipArchiveEntry_getSize_113521713533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term20807 = new LinkedHashMap();
        Class<? extends Object> term20998 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20997 = ((Class) term20998).getDeclaredField((String) "NANOSECONDS");
        ((Field) term20997).setAccessible(true);
        Object enum78 = ((Field) term20997).get((Object) null);
        Class<? extends Object> term21193 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term21192 = ((Class) term21193).getDeclaredField((String) "MILLISECONDS");
        ((Field) term21192).setAccessible(true);
        Object enum79 = ((Field) term21192).get((Object) null);
        Class<? extends Object> term21391 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term21390 = ((Class) term21391).getDeclaredField((String) "DAYS");
        ((Field) term21390).setAccessible(true);
        Object enum80 = ((Field) term21390).get((Object) null);
        term20801 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term20818 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term20819 = (byte[]) newByteArray(3);
        byte[] term20823 = (byte[]) newByteArray(4);
        byte[] term20830 = (byte[]) newByteArray(5);
        Object term20836 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term20844 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20869 = newInstance(Class.forName("java.time.Instant"));
        Object term20884 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20910 = newInstance(Class.forName("java.time.Instant"));
        Object term20925 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20943 = newInstance(Class.forName("java.time.Instant"));
        byte[] term20963 = (byte[]) newByteArray(8);
        setIntField(term20801, term20801.getClass(), "method", -1);
        setLongField(term20801, term20801.getClass(), "size", -1L);
        setIntField(term20801, term20801.getClass(), "internalAttributes", -506958186);
        setIntField(term20801, term20801.getClass(), "platform", -507387516);
        setLongField(term20801, term20801.getClass(), "externalAttributes", 5671808784468963649L);
        setField(term20801, term20801.getClass(), "extraFields", term20807);
        setByteElement(term20819, 0, (byte) -103);
        setByteElement(term20819, 1, (byte) 122);
        setByteElement(term20819, 2, (byte) -75);
        setField(term20818, term20818.getClass(), "localFileData", term20819);
        setByteElement(term20823, 0, (byte) -72);
        setByteElement(term20823, 1, (byte) -19);
        setByteElement(term20823, 2, (byte) 56);
        setByteElement(term20823, 3, (byte) -47);
        setField(term20818, term20818.getClass(), "centralDirectoryData", term20823);
        setField(term20801, term20801.getClass(), "unparseableExtra", term20818);
        setField(term20801, term20801.getClass(), "name", "");
        setByteElement(term20830, 0, (byte) 126);
        setByteElement(term20830, 1, (byte) 118);
        setByteElement(term20830, 2, (byte) -114);
        setByteElement(term20830, 3, (byte) 97);
        setByteElement(term20830, 4, (byte) -75);
        setField(term20801, term20801.getClass(), "rawName", term20830);
        setBooleanField(term20836, term20836.getClass(), "languageEncodingFlag", false);
        setBooleanField(term20836, term20836.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term20836, term20836.getClass(), "encryptionFlag", false);
        setBooleanField(term20836, term20836.getClass(), "strongEncryptionFlag", false);
        setField(term20801, term20801.getClass(), "gpb", term20836);
        setLongField(term20801, term20801.getClass(), "xdostime", -1L);
        setField(term20844, term20844.getClass(), "unit", enum78);
        setLongField(term20844, term20844.getClass(), "value", 2297097306706899827L);
        setLongField(term20869, term20869.getClass(), "seconds", 1491199740L);
        setIntField(term20869, term20869.getClass(), "nanos", 539000000);
        setField(term20844, term20844.getClass(), "instant", term20869);
        setField(term20844, term20844.getClass(), "valueAsString", "lHfTrWKMPk");
        setField(term20801, term20801.getClass(), "mtime", term20844);
        setField(term20884, term20884.getClass(), "unit", enum79);
        setLongField(term20884, term20884.getClass(), "value", -900457279156388404L);
        setLongField(term20910, term20910.getClass(), "seconds", 1462014881L);
        setIntField(term20910, term20910.getClass(), "nanos", 310000000);
        setField(term20884, term20884.getClass(), "instant", term20910);
        setField(term20884, term20884.getClass(), "valueAsString", "JDaAnsVTGV");
        setField(term20801, term20801.getClass(), "atime", term20884);
        setField(term20925, term20925.getClass(), "unit", enum80);
        setLongField(term20925, term20925.getClass(), "value", 1084801489398441516L);
        setLongField(term20943, term20943.getClass(), "seconds", 1818986525L);
        setIntField(term20943, term20943.getClass(), "nanos", 805000000);
        setField(term20925, term20925.getClass(), "instant", term20943);
        setField(term20925, term20925.getClass(), "valueAsString", "mLUZFTfjle");
        setField(term20801, term20801.getClass(), "ctime", term20925);
        setLongField(term20801, term20801.getClass(), "crc", -1L);
        setLongField(term20801, term20801.getClass(), "csize", -1L);
        setIntField(term20801, term20801.getClass(), "flag", -1896376975);
        setByteElement(term20963, 0, (byte) 52);
        setByteElement(term20963, 1, (byte) -128);
        setByteElement(term20963, 2, (byte) 120);
        setByteElement(term20963, 3, (byte) 49);
        setByteElement(term20963, 4, (byte) 74);
        setByteElement(term20963, 5, (byte) 37);
        setByteElement(term20963, 6, (byte) -78);
        setByteElement(term20963, 7, (byte) 3);
        setField(term20801, term20801.getClass(), "extra", term20963);
        setField(term20801, term20801.getClass(), "comment", "xIeFjkHkOe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term20801, args);
    }

};


