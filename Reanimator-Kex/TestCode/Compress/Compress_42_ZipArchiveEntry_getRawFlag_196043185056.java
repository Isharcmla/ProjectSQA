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

public class ZipArchiveEntry_getRawFlag_196043185056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36374;

    public ZipArchiveEntry_getRawFlag_196043185056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36541 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term36540 = ((Class) term36541).getDeclaredField((String) "MILLISECONDS");
        ((Field) term36540).setAccessible(true);
        Object enum137 = ((Field) term36540).get((Object) null);
        Class<? extends Object> term36739 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term36738 = ((Class) term36739).getDeclaredField((String) "DAYS");
        ((Field) term36738).setAccessible(true);
        Object enum138 = ((Field) term36738).get((Object) null);
        term36374 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term36383 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 3);
        Object term36384 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term36385 = (byte[]) newByteArray(1);
        byte[] term36387 = (byte[]) newByteArray(5);
        byte[] term36395 = (byte[]) newByteArray(5);
        Object term36401 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term36411 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term36437 = newInstance(Class.forName("java.time.Instant"));
        Object term36452 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term36470 = newInstance(Class.forName("java.time.Instant"));
        Object term36485 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term36487 = newInstance(Class.forName("java.time.Instant"));
        byte[] term36507 = (byte[]) newByteArray(8);
        setIntField(term36374, term36374.getClass(), "method", -1);
        setLongField(term36374, term36374.getClass(), "size", -1L);
        setIntField(term36374, term36374.getClass(), "internalAttributes", -1831826725);
        setIntField(term36374, term36374.getClass(), "versionRequired", 752152965);
        setIntField(term36374, term36374.getClass(), "versionMadeBy", -1577069773);
        setIntField(term36374, term36374.getClass(), "platform", -266625190);
        setIntField(term36374, term36374.getClass(), "rawFlag", 489201218);
        setLongField(term36374, term36374.getClass(), "externalAttributes", 2145420811068634601L);
        setField(term36374, term36374.getClass(), "extraFields", term36383);
        setByteElement(term36385, 0, (byte) -87);
        setField(term36384, term36384.getClass(), "localFileData", term36385);
        setByteElement(term36387, 0, (byte) -119);
        setByteElement(term36387, 1, (byte) -57);
        setByteElement(term36387, 2, (byte) -35);
        setByteElement(term36387, 3, (byte) -127);
        setByteElement(term36387, 4, (byte) 85);
        setField(term36384, term36384.getClass(), "centralDirectoryData", term36387);
        setField(term36374, term36374.getClass(), "unparseableExtra", term36384);
        setField(term36374, term36374.getClass(), "name", "");
        setByteElement(term36395, 0, (byte) -49);
        setByteElement(term36395, 1, (byte) -18);
        setByteElement(term36395, 2, (byte) 120);
        setByteElement(term36395, 3, (byte) 116);
        setByteElement(term36395, 4, (byte) -100);
        setField(term36374, term36374.getClass(), "rawName", term36395);
        setBooleanField(term36401, term36401.getClass(), "languageEncodingFlag", false);
        setBooleanField(term36401, term36401.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term36401, term36401.getClass(), "encryptionFlag", false);
        setBooleanField(term36401, term36401.getClass(), "strongEncryptionFlag", false);
        setIntField(term36401, term36401.getClass(), "slidingDictionarySize", 0);
        setIntField(term36401, term36401.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term36374, term36374.getClass(), "gpb", term36401);
        setLongField(term36374, term36374.getClass(), "xdostime", -1L);
        setField(term36411, term36411.getClass(), "unit", enum137);
        setLongField(term36411, term36411.getClass(), "value", 2191130532479601175L);
        setLongField(term36437, term36437.getClass(), "seconds", 1402621630L);
        setIntField(term36437, term36437.getClass(), "nanos", 583000000);
        setField(term36411, term36411.getClass(), "instant", term36437);
        setField(term36411, term36411.getClass(), "valueAsString", "CFyoseFGLF");
        setField(term36374, term36374.getClass(), "mtime", term36411);
        setField(term36452, term36452.getClass(), "unit", enum138);
        setLongField(term36452, term36452.getClass(), "value", 860079646007397083L);
        setLongField(term36470, term36470.getClass(), "seconds", 1303237614L);
        setIntField(term36470, term36470.getClass(), "nanos", 891000000);
        setField(term36452, term36452.getClass(), "instant", term36470);
        setField(term36452, term36452.getClass(), "valueAsString", "SFqCrhEWLm");
        setField(term36374, term36374.getClass(), "atime", term36452);
        setField(term36485, term36485.getClass(), "unit", enum137);
        setLongField(term36485, term36485.getClass(), "value", 3230472384687362867L);
        setLongField(term36487, term36487.getClass(), "seconds", 1798230749L);
        setIntField(term36487, term36487.getClass(), "nanos", 741000000);
        setField(term36485, term36485.getClass(), "instant", term36487);
        setField(term36485, term36485.getClass(), "valueAsString", "GZdcJyZntS");
        setField(term36374, term36374.getClass(), "ctime", term36485);
        setLongField(term36374, term36374.getClass(), "crc", -1L);
        setLongField(term36374, term36374.getClass(), "csize", -1L);
        setIntField(term36374, term36374.getClass(), "flag", 464181937);
        setByteElement(term36507, 0, (byte) 95);
        setByteElement(term36507, 1, (byte) -11);
        setByteElement(term36507, 2, (byte) 38);
        setByteElement(term36507, 3, (byte) -95);
        setByteElement(term36507, 4, (byte) 53);
        setByteElement(term36507, 5, (byte) 119);
        setByteElement(term36507, 6, (byte) -20);
        setByteElement(term36507, 7, (byte) 48);
        setField(term36374, term36374.getClass(), "extra", term36507);
        setField(term36374, term36374.getClass(), "comment", "OIHoJeysUi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRawFlag", argTypes, term36374, args);
    }

};


