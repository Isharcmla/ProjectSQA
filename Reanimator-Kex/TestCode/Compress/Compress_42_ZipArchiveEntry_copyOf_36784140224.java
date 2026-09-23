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
import java.lang.Integer;

public class ZipArchiveEntry_copyOf_36784140224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14787;
     Object term14954;
     Object term14955;

    public ZipArchiveEntry_copyOf_36784140224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14960 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14959 = ((Class) term14960).getDeclaredField((String) "DAYS");
        ((Field) term14959).setAccessible(true);
        Object enum56 = ((Field) term14959).get((Object) null);
        Class<? extends Object> term15134 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15133 = ((Class) term15134).getDeclaredField((String) "MILLISECONDS");
        ((Field) term15133).setAccessible(true);
        Object enum57 = ((Field) term15133).get((Object) null);
        Class<? extends Object> term15332 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15331 = ((Class) term15332).getDeclaredField((String) "MICROSECONDS");
        ((Field) term15331).setAccessible(true);
        Object enum58 = ((Field) term15331).get((Object) null);
        term14787 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term14796 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 4);
        Object term14797 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term14798 = (byte[]) newByteArray(1);
        byte[] term14800 = (byte[]) newByteArray(0);
        byte[] term14803 = (byte[]) newByteArray(1);
        Object term14805 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term14815 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14833 = newInstance(Class.forName("java.time.Instant"));
        Object term14848 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14874 = newInstance(Class.forName("java.time.Instant"));
        Object term14889 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14915 = newInstance(Class.forName("java.time.Instant"));
        byte[] term14935 = (byte[]) newByteArray(5);
        setIntField(term14787, term14787.getClass(), "method", -1);
        setLongField(term14787, term14787.getClass(), "size", -1L);
        setIntField(term14787, term14787.getClass(), "internalAttributes", -2014576105);
        setIntField(term14787, term14787.getClass(), "versionRequired", 1296895584);
        setIntField(term14787, term14787.getClass(), "versionMadeBy", 628918458);
        setIntField(term14787, term14787.getClass(), "platform", -1274456137);
        setIntField(term14787, term14787.getClass(), "rawFlag", 1041916673);
        setLongField(term14787, term14787.getClass(), "externalAttributes", -8652538484981166496L);
        setField(term14787, term14787.getClass(), "extraFields", term14796);
        setByteElement(term14798, 0, (byte) 97);
        setField(term14797, term14797.getClass(), "localFileData", term14798);
        setField(term14797, term14797.getClass(), "centralDirectoryData", term14800);
        setField(term14787, term14787.getClass(), "unparseableExtra", term14797);
        setField(term14787, term14787.getClass(), "name", "");
        setByteElement(term14803, 0, (byte) 51);
        setField(term14787, term14787.getClass(), "rawName", term14803);
        setBooleanField(term14805, term14805.getClass(), "languageEncodingFlag", false);
        setBooleanField(term14805, term14805.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term14805, term14805.getClass(), "encryptionFlag", false);
        setBooleanField(term14805, term14805.getClass(), "strongEncryptionFlag", false);
        setIntField(term14805, term14805.getClass(), "slidingDictionarySize", 0);
        setIntField(term14805, term14805.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term14787, term14787.getClass(), "gpb", term14805);
        setLongField(term14787, term14787.getClass(), "xdostime", -1L);
        setField(term14815, term14815.getClass(), "unit", enum56);
        setLongField(term14815, term14815.getClass(), "value", 2701184207686293431L);
        setLongField(term14833, term14833.getClass(), "seconds", 1838375779L);
        setIntField(term14833, term14833.getClass(), "nanos", 277000000);
        setField(term14815, term14815.getClass(), "instant", term14833);
        setField(term14815, term14815.getClass(), "valueAsString", "PkWMRdJcBb");
        setField(term14787, term14787.getClass(), "mtime", term14815);
        setField(term14848, term14848.getClass(), "unit", enum57);
        setLongField(term14848, term14848.getClass(), "value", 4474998035090263139L);
        setLongField(term14874, term14874.getClass(), "seconds", 1332889705L);
        setIntField(term14874, term14874.getClass(), "nanos", 432000000);
        setField(term14848, term14848.getClass(), "instant", term14874);
        setField(term14848, term14848.getClass(), "valueAsString", "jSpAteRute");
        setField(term14787, term14787.getClass(), "atime", term14848);
        setField(term14889, term14889.getClass(), "unit", enum58);
        setLongField(term14889, term14889.getClass(), "value", 2848819812340321742L);
        setLongField(term14915, term14915.getClass(), "seconds", 1597251967L);
        setIntField(term14915, term14915.getClass(), "nanos", 116000000);
        setField(term14889, term14889.getClass(), "instant", term14915);
        setField(term14889, term14889.getClass(), "valueAsString", "swZVeJAxjt");
        setField(term14787, term14787.getClass(), "ctime", term14889);
        setLongField(term14787, term14787.getClass(), "crc", -1L);
        setLongField(term14787, term14787.getClass(), "csize", -1L);
        setIntField(term14787, term14787.getClass(), "flag", -601863069);
        setByteElement(term14935, 0, (byte) 24);
        setByteElement(term14935, 1, (byte) -14);
        setByteElement(term14935, 2, (byte) 74);
        setByteElement(term14935, 3, (byte) 56);
        setByteElement(term14935, 4, (byte) -76);
        setField(term14787, term14787.getClass(), "extra", term14935);
        setField(term14787, term14787.getClass(), "comment", "xOcJIiQQDu");
        term14954 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 3);
        term14955 = new Integer(-1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term14954;
        args[1] = term14955;
        callMethod(klass, "copyOf", argTypes, term14787, args);
    }

};


