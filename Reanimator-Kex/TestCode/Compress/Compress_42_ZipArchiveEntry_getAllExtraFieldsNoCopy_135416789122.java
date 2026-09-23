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

public class ZipArchiveEntry_getAllExtraFieldsNoCopy_135416789122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13214;

    public ZipArchiveEntry_getAllExtraFieldsNoCopy_135416789122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13418 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13417 = ((Class) term13418).getDeclaredField((String) "NANOSECONDS");
        ((Field) term13417).setAccessible(true);
        Object enum50 = ((Field) term13417).get((Object) null);
        Class<? extends Object> term13613 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13612 = ((Class) term13613).getDeclaredField((String) "SECONDS");
        ((Field) term13612).setAccessible(true);
        Object enum51 = ((Field) term13612).get((Object) null);
        Class<? extends Object> term13796 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13795 = ((Class) term13796).getDeclaredField((String) "MILLISECONDS");
        ((Field) term13795).setAccessible(true);
        Object enum52 = ((Field) term13795).get((Object) null);
        term13214 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term13223 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 1);
        Object term13224 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term13225 = (byte[]) newByteArray(5);
        byte[] term13231 = (byte[]) newByteArray(3);
        byte[] term13237 = (byte[]) newByteArray(9);
        Object term13247 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term13257 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term13282 = newInstance(Class.forName("java.time.Instant"));
        Object term13297 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term13318 = newInstance(Class.forName("java.time.Instant"));
        Object term13333 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term13359 = newInstance(Class.forName("java.time.Instant"));
        byte[] term13379 = (byte[]) newByteArray(7);
        setIntField(term13214, term13214.getClass(), "method", -1);
        setLongField(term13214, term13214.getClass(), "size", -1L);
        setIntField(term13214, term13214.getClass(), "internalAttributes", -1388471422);
        setIntField(term13214, term13214.getClass(), "versionRequired", -1498296052);
        setIntField(term13214, term13214.getClass(), "versionMadeBy", 2098647989);
        setIntField(term13214, term13214.getClass(), "platform", 1598895173);
        setIntField(term13214, term13214.getClass(), "rawFlag", 1830648570);
        setLongField(term13214, term13214.getClass(), "externalAttributes", -5963439350418910964L);
        setField(term13214, term13214.getClass(), "extraFields", term13223);
        setByteElement(term13225, 0, (byte) -5);
        setByteElement(term13225, 1, (byte) 119);
        setByteElement(term13225, 2, (byte) 81);
        setByteElement(term13225, 3, (byte) -28);
        setByteElement(term13225, 4, (byte) -18);
        setField(term13224, term13224.getClass(), "localFileData", term13225);
        setByteElement(term13231, 0, (byte) -61);
        setByteElement(term13231, 1, (byte) 70);
        setByteElement(term13231, 2, (byte) 89);
        setField(term13224, term13224.getClass(), "centralDirectoryData", term13231);
        setField(term13214, term13214.getClass(), "unparseableExtra", term13224);
        setField(term13214, term13214.getClass(), "name", "");
        setByteElement(term13237, 0, (byte) -99);
        setByteElement(term13237, 1, (byte) 59);
        setByteElement(term13237, 2, (byte) -99);
        setByteElement(term13237, 3, (byte) 61);
        setByteElement(term13237, 4, (byte) 100);
        setByteElement(term13237, 5, (byte) 55);
        setByteElement(term13237, 6, (byte) -111);
        setByteElement(term13237, 7, (byte) -127);
        setByteElement(term13237, 8, (byte) 19);
        setField(term13214, term13214.getClass(), "rawName", term13237);
        setBooleanField(term13247, term13247.getClass(), "languageEncodingFlag", false);
        setBooleanField(term13247, term13247.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term13247, term13247.getClass(), "encryptionFlag", false);
        setBooleanField(term13247, term13247.getClass(), "strongEncryptionFlag", false);
        setIntField(term13247, term13247.getClass(), "slidingDictionarySize", 0);
        setIntField(term13247, term13247.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term13214, term13214.getClass(), "gpb", term13247);
        setLongField(term13214, term13214.getClass(), "xdostime", -1L);
        setField(term13257, term13257.getClass(), "unit", enum50);
        setLongField(term13257, term13257.getClass(), "value", 9013624480170062917L);
        setLongField(term13282, term13282.getClass(), "seconds", 1393218035L);
        setIntField(term13282, term13282.getClass(), "nanos", 243000000);
        setField(term13257, term13257.getClass(), "instant", term13282);
        setField(term13257, term13257.getClass(), "valueAsString", "idgaQsnJpQ");
        setField(term13214, term13214.getClass(), "mtime", term13257);
        setField(term13297, term13297.getClass(), "unit", enum51);
        setLongField(term13297, term13297.getClass(), "value", 7862575738391801707L);
        setLongField(term13318, term13318.getClass(), "seconds", 1762165441L);
        setIntField(term13318, term13318.getClass(), "nanos", 299000000);
        setField(term13297, term13297.getClass(), "instant", term13318);
        setField(term13297, term13297.getClass(), "valueAsString", "VgZnGoIFwQ");
        setField(term13214, term13214.getClass(), "atime", term13297);
        setField(term13333, term13333.getClass(), "unit", enum52);
        setLongField(term13333, term13333.getClass(), "value", 50358265865610362L);
        setLongField(term13359, term13359.getClass(), "seconds", 1395497491L);
        setIntField(term13359, term13359.getClass(), "nanos", 666000000);
        setField(term13333, term13333.getClass(), "instant", term13359);
        setField(term13333, term13333.getClass(), "valueAsString", "jUbSRrkrYZ");
        setField(term13214, term13214.getClass(), "ctime", term13333);
        setLongField(term13214, term13214.getClass(), "crc", -1L);
        setLongField(term13214, term13214.getClass(), "csize", -1L);
        setIntField(term13214, term13214.getClass(), "flag", -227365013);
        setByteElement(term13379, 0, (byte) 83);
        setByteElement(term13379, 1, (byte) -57);
        setByteElement(term13379, 2, (byte) 103);
        setByteElement(term13379, 3, (byte) 40);
        setByteElement(term13379, 4, (byte) -106);
        setByteElement(term13379, 5, (byte) -95);
        setByteElement(term13379, 6, (byte) 69);
        setField(term13214, term13214.getClass(), "extra", term13379);
        setField(term13214, term13214.getClass(), "comment", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllExtraFieldsNoCopy", argTypes, term13214, args);
    }

};


