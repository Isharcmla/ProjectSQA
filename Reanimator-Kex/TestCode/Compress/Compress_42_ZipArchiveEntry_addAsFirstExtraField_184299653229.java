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

public class ZipArchiveEntry_addAsFirstExtraField_184299653229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17942;

    public ZipArchiveEntry_addAsFirstExtraField_184299653229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18101 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18100 = ((Class) term18101).getDeclaredField((String) "SECONDS");
        ((Field) term18100).setAccessible(true);
        Object enum68 = ((Field) term18100).get((Object) null);
        Class<? extends Object> term18284 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18283 = ((Class) term18284).getDeclaredField((String) "MICROSECONDS");
        ((Field) term18283).setAccessible(true);
        Object enum69 = ((Field) term18283).get((Object) null);
        term17942 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term17951 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
        Object term17952 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term17953 = (byte[]) newByteArray(6);
        byte[] term17960 = (byte[]) newByteArray(0);
        byte[] term17963 = (byte[]) newByteArray(3);
        Object term17967 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term17977 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17998 = newInstance(Class.forName("java.time.Instant"));
        Object term18013 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18039 = newInstance(Class.forName("java.time.Instant"));
        Object term18054 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18056 = newInstance(Class.forName("java.time.Instant"));
        byte[] term18076 = (byte[]) newByteArray(1);
        setIntField(term17942, term17942.getClass(), "method", -1);
        setLongField(term17942, term17942.getClass(), "size", -1L);
        setIntField(term17942, term17942.getClass(), "internalAttributes", -165587447);
        setIntField(term17942, term17942.getClass(), "versionRequired", -1347358701);
        setIntField(term17942, term17942.getClass(), "versionMadeBy", 806595993);
        setIntField(term17942, term17942.getClass(), "platform", 548228925);
        setIntField(term17942, term17942.getClass(), "rawFlag", -749861210);
        setLongField(term17942, term17942.getClass(), "externalAttributes", 1368340889161782793L);
        setField(term17942, term17942.getClass(), "extraFields", term17951);
        setByteElement(term17953, 0, (byte) -123);
        setByteElement(term17953, 1, (byte) 51);
        setByteElement(term17953, 2, (byte) 90);
        setByteElement(term17953, 3, (byte) 66);
        setByteElement(term17953, 4, (byte) -79);
        setByteElement(term17953, 5, (byte) 44);
        setField(term17952, term17952.getClass(), "localFileData", term17953);
        setField(term17952, term17952.getClass(), "centralDirectoryData", term17960);
        setField(term17942, term17942.getClass(), "unparseableExtra", term17952);
        setField(term17942, term17942.getClass(), "name", "");
        setByteElement(term17963, 0, (byte) -66);
        setByteElement(term17963, 1, (byte) 122);
        setByteElement(term17963, 2, (byte) -30);
        setField(term17942, term17942.getClass(), "rawName", term17963);
        setBooleanField(term17967, term17967.getClass(), "languageEncodingFlag", false);
        setBooleanField(term17967, term17967.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term17967, term17967.getClass(), "encryptionFlag", false);
        setBooleanField(term17967, term17967.getClass(), "strongEncryptionFlag", false);
        setIntField(term17967, term17967.getClass(), "slidingDictionarySize", 0);
        setIntField(term17967, term17967.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term17942, term17942.getClass(), "gpb", term17967);
        setLongField(term17942, term17942.getClass(), "xdostime", -1L);
        setField(term17977, term17977.getClass(), "unit", enum68);
        setLongField(term17977, term17977.getClass(), "value", -5786861555969446503L);
        setLongField(term17998, term17998.getClass(), "seconds", 1531349402L);
        setIntField(term17998, term17998.getClass(), "nanos", 53000000);
        setField(term17977, term17977.getClass(), "instant", term17998);
        setField(term17977, term17977.getClass(), "valueAsString", "ZVecLZMLHF");
        setField(term17942, term17942.getClass(), "mtime", term17977);
        setField(term18013, term18013.getClass(), "unit", enum69);
        setLongField(term18013, term18013.getClass(), "value", 2354625302846375590L);
        setLongField(term18039, term18039.getClass(), "seconds", 1264055800L);
        setIntField(term18039, term18039.getClass(), "nanos", 343000000);
        setField(term18013, term18013.getClass(), "instant", term18039);
        setField(term18013, term18013.getClass(), "valueAsString", "fztQhjqwdP");
        setField(term17942, term17942.getClass(), "atime", term18013);
        setField(term18054, term18054.getClass(), "unit", enum68);
        setLongField(term18054, term18054.getClass(), "value", 7276637106827860087L);
        setLongField(term18056, term18056.getClass(), "seconds", 1450883259L);
        setIntField(term18056, term18056.getClass(), "nanos", 896000000);
        setField(term18054, term18054.getClass(), "instant", term18056);
        setField(term18054, term18054.getClass(), "valueAsString", "eVpkWxjuki");
        setField(term17942, term17942.getClass(), "ctime", term18054);
        setLongField(term17942, term17942.getClass(), "crc", -1L);
        setLongField(term17942, term17942.getClass(), "csize", -1L);
        setIntField(term17942, term17942.getClass(), "flag", 1694224101);
        setByteElement(term18076, 0, (byte) 102);
        setField(term17942, term17942.getClass(), "extra", term18076);
        setField(term17942, term17942.getClass(), "comment", "SJiQaLvSKv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addAsFirstExtraField", argTypes, term17942, args);
    }

};


