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

public class ZipArchiveEntry_getCentralDirectoryExtra_65160582638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23826;

    public ZipArchiveEntry_getCentralDirectoryExtra_65160582638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24008 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term24007 = ((Class) term24008).getDeclaredField((String) "MILLISECONDS");
        ((Field) term24007).setAccessible(true);
        Object enum90 = ((Field) term24007).get((Object) null);
        Class<? extends Object> term24206 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term24205 = ((Class) term24206).getDeclaredField((String) "MICROSECONDS");
        ((Field) term24205).setAccessible(true);
        Object enum91 = ((Field) term24205).get((Object) null);
        Class<? extends Object> term24404 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term24403 = ((Class) term24404).getDeclaredField((String) "HOURS");
        ((Field) term24403).setAccessible(true);
        Object enum92 = ((Field) term24403).get((Object) null);
        term23826 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term23835 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
        Object term23836 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term23837 = (byte[]) newByteArray(2);
        byte[] term23840 = (byte[]) newByteArray(0);
        byte[] term23843 = (byte[]) newByteArray(7);
        Object term23851 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term23861 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23887 = newInstance(Class.forName("java.time.Instant"));
        Object term23902 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23928 = newInstance(Class.forName("java.time.Instant"));
        Object term23943 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23962 = newInstance(Class.forName("java.time.Instant"));
        byte[] term23982 = (byte[]) newByteArray(2);
        setIntField(term23826, term23826.getClass(), "method", -1);
        setLongField(term23826, term23826.getClass(), "size", -1L);
        setIntField(term23826, term23826.getClass(), "internalAttributes", -519881101);
        setIntField(term23826, term23826.getClass(), "versionRequired", -680920524);
        setIntField(term23826, term23826.getClass(), "versionMadeBy", -916335264);
        setIntField(term23826, term23826.getClass(), "platform", -919416536);
        setIntField(term23826, term23826.getClass(), "rawFlag", -43417861);
        setLongField(term23826, term23826.getClass(), "externalAttributes", -7115418542247301000L);
        setField(term23826, term23826.getClass(), "extraFields", term23835);
        setByteElement(term23837, 0, (byte) -61);
        setByteElement(term23837, 1, (byte) -108);
        setField(term23836, term23836.getClass(), "localFileData", term23837);
        setField(term23836, term23836.getClass(), "centralDirectoryData", term23840);
        setField(term23826, term23826.getClass(), "unparseableExtra", term23836);
        setField(term23826, term23826.getClass(), "name", "");
        setByteElement(term23843, 0, (byte) 10);
        setByteElement(term23843, 1, (byte) -83);
        setByteElement(term23843, 2, (byte) -117);
        setByteElement(term23843, 3, (byte) 97);
        setByteElement(term23843, 4, (byte) 100);
        setByteElement(term23843, 5, (byte) 79);
        setByteElement(term23843, 6, (byte) -56);
        setField(term23826, term23826.getClass(), "rawName", term23843);
        setBooleanField(term23851, term23851.getClass(), "languageEncodingFlag", false);
        setBooleanField(term23851, term23851.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term23851, term23851.getClass(), "encryptionFlag", false);
        setBooleanField(term23851, term23851.getClass(), "strongEncryptionFlag", false);
        setIntField(term23851, term23851.getClass(), "slidingDictionarySize", 0);
        setIntField(term23851, term23851.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term23826, term23826.getClass(), "gpb", term23851);
        setLongField(term23826, term23826.getClass(), "xdostime", -1L);
        setField(term23861, term23861.getClass(), "unit", enum90);
        setLongField(term23861, term23861.getClass(), "value", 8034714140377562739L);
        setLongField(term23887, term23887.getClass(), "seconds", 1695488381L);
        setIntField(term23887, term23887.getClass(), "nanos", 249000000);
        setField(term23861, term23861.getClass(), "instant", term23887);
        setField(term23861, term23861.getClass(), "valueAsString", "GgZWSjxjyE");
        setField(term23826, term23826.getClass(), "mtime", term23861);
        setField(term23902, term23902.getClass(), "unit", enum91);
        setLongField(term23902, term23902.getClass(), "value", -2924531382671518368L);
        setLongField(term23928, term23928.getClass(), "seconds", 1342895876L);
        setIntField(term23928, term23928.getClass(), "nanos", 146000000);
        setField(term23902, term23902.getClass(), "instant", term23928);
        setField(term23902, term23902.getClass(), "valueAsString", "EeBVbzjcCI");
        setField(term23826, term23826.getClass(), "atime", term23902);
        setField(term23943, term23943.getClass(), "unit", enum92);
        setLongField(term23943, term23943.getClass(), "value", -3948863953565024517L);
        setLongField(term23962, term23962.getClass(), "seconds", 1511301614L);
        setIntField(term23962, term23962.getClass(), "nanos", 327000000);
        setField(term23943, term23943.getClass(), "instant", term23962);
        setField(term23943, term23943.getClass(), "valueAsString", "UfQtPRyWRC");
        setField(term23826, term23826.getClass(), "ctime", term23943);
        setLongField(term23826, term23826.getClass(), "crc", -1L);
        setLongField(term23826, term23826.getClass(), "csize", -1L);
        setIntField(term23826, term23826.getClass(), "flag", -1533843432);
        setByteElement(term23982, 0, (byte) 105);
        setByteElement(term23982, 1, (byte) -8);
        setField(term23826, term23826.getClass(), "extra", term23982);
        setField(term23826, term23826.getClass(), "comment", "FPvxVzzSvD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCentralDirectoryExtra", argTypes, term23826, args);
    }

};


