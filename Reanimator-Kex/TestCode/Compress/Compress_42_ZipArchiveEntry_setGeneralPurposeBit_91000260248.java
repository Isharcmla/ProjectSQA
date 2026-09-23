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

public class ZipArchiveEntry_setGeneralPurposeBit_91000260248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31351;
     Object term31534;

    public ZipArchiveEntry_setGeneralPurposeBit_91000260248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31560 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term31559 = ((Class) term31560).getDeclaredField((String) "DAYS");
        ((Field) term31559).setAccessible(true);
        Object enum119 = ((Field) term31559).get((Object) null);
        Class<? extends Object> term31734 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term31733 = ((Class) term31734).getDeclaredField((String) "MICROSECONDS");
        ((Field) term31733).setAccessible(true);
        Object enum120 = ((Field) term31733).get((Object) null);
        Class<? extends Object> term31932 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term31931 = ((Class) term31932).getDeclaredField((String) "MILLISECONDS");
        ((Field) term31931).setAccessible(true);
        Object enum121 = ((Field) term31931).get((Object) null);
        term31351 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term31360 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 6);
        Object term31361 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term31362 = (byte[]) newByteArray(2);
        byte[] term31365 = (byte[]) newByteArray(8);
        byte[] term31376 = (byte[]) newByteArray(8);
        Object term31385 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term31395 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term31413 = newInstance(Class.forName("java.time.Instant"));
        Object term31428 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term31454 = newInstance(Class.forName("java.time.Instant"));
        Object term31469 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term31495 = newInstance(Class.forName("java.time.Instant"));
        byte[] term31515 = (byte[]) newByteArray(5);
        setIntField(term31351, term31351.getClass(), "method", -1);
        setLongField(term31351, term31351.getClass(), "size", -1L);
        setIntField(term31351, term31351.getClass(), "internalAttributes", -1667482829);
        setIntField(term31351, term31351.getClass(), "versionRequired", 1116576792);
        setIntField(term31351, term31351.getClass(), "versionMadeBy", -942194446);
        setIntField(term31351, term31351.getClass(), "platform", -938508470);
        setIntField(term31351, term31351.getClass(), "rawFlag", 1242676024);
        setLongField(term31351, term31351.getClass(), "externalAttributes", -1677189124507026637L);
        setField(term31351, term31351.getClass(), "extraFields", term31360);
        setByteElement(term31362, 0, (byte) -20);
        setByteElement(term31362, 1, (byte) 31);
        setField(term31361, term31361.getClass(), "localFileData", term31362);
        setByteElement(term31365, 0, (byte) 67);
        setByteElement(term31365, 1, (byte) 51);
        setByteElement(term31365, 2, (byte) -76);
        setByteElement(term31365, 3, (byte) 38);
        setByteElement(term31365, 4, (byte) -20);
        setByteElement(term31365, 5, (byte) -20);
        setByteElement(term31365, 6, (byte) 53);
        setByteElement(term31365, 7, (byte) -80);
        setField(term31361, term31361.getClass(), "centralDirectoryData", term31365);
        setField(term31351, term31351.getClass(), "unparseableExtra", term31361);
        setField(term31351, term31351.getClass(), "name", "");
        setByteElement(term31376, 0, (byte) -11);
        setByteElement(term31376, 1, (byte) -33);
        setByteElement(term31376, 2, (byte) 58);
        setByteElement(term31376, 3, (byte) 31);
        setByteElement(term31376, 4, (byte) -18);
        setByteElement(term31376, 5, (byte) 30);
        setByteElement(term31376, 6, (byte) 105);
        setByteElement(term31376, 7, (byte) 100);
        setField(term31351, term31351.getClass(), "rawName", term31376);
        setBooleanField(term31385, term31385.getClass(), "languageEncodingFlag", false);
        setBooleanField(term31385, term31385.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term31385, term31385.getClass(), "encryptionFlag", false);
        setBooleanField(term31385, term31385.getClass(), "strongEncryptionFlag", false);
        setIntField(term31385, term31385.getClass(), "slidingDictionarySize", 0);
        setIntField(term31385, term31385.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term31351, term31351.getClass(), "gpb", term31385);
        setLongField(term31351, term31351.getClass(), "xdostime", -1L);
        setField(term31395, term31395.getClass(), "unit", enum119);
        setLongField(term31395, term31395.getClass(), "value", 4795660804170399986L);
        setLongField(term31413, term31413.getClass(), "seconds", 1291618397L);
        setIntField(term31413, term31413.getClass(), "nanos", 937000000);
        setField(term31395, term31395.getClass(), "instant", term31413);
        setField(term31395, term31395.getClass(), "valueAsString", "JppkknKVOw");
        setField(term31351, term31351.getClass(), "mtime", term31395);
        setField(term31428, term31428.getClass(), "unit", enum120);
        setLongField(term31428, term31428.getClass(), "value", -4030863184426321096L);
        setLongField(term31454, term31454.getClass(), "seconds", 1838168926L);
        setIntField(term31454, term31454.getClass(), "nanos", 204000000);
        setField(term31428, term31428.getClass(), "instant", term31454);
        setField(term31428, term31428.getClass(), "valueAsString", "iljANwuEjk");
        setField(term31351, term31351.getClass(), "atime", term31428);
        setField(term31469, term31469.getClass(), "unit", enum121);
        setLongField(term31469, term31469.getClass(), "value", -8010214112439224349L);
        setLongField(term31495, term31495.getClass(), "seconds", 1518803790L);
        setIntField(term31495, term31495.getClass(), "nanos", 701000000);
        setField(term31469, term31469.getClass(), "instant", term31495);
        setField(term31469, term31469.getClass(), "valueAsString", "kNqaJKIATy");
        setField(term31351, term31351.getClass(), "ctime", term31469);
        setLongField(term31351, term31351.getClass(), "crc", -1L);
        setLongField(term31351, term31351.getClass(), "csize", -1L);
        setIntField(term31351, term31351.getClass(), "flag", -1865023308);
        setByteElement(term31515, 0, (byte) 117);
        setByteElement(term31515, 1, (byte) -111);
        setByteElement(term31515, 3, (byte) -92);
        setByteElement(term31515, 4, (byte) 16);
        setField(term31351, term31351.getClass(), "extra", term31515);
        setField(term31351, term31351.getClass(), "comment", "vKQukfbJUd");
        term31534 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        setBooleanField(term31534, term31534.getClass(), "languageEncodingFlag", false);
        setBooleanField(term31534, term31534.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term31534, term31534.getClass(), "encryptionFlag", false);
        setBooleanField(term31534, term31534.getClass(), "strongEncryptionFlag", true);
        setIntField(term31534, term31534.getClass(), "slidingDictionarySize", -1553893255);
        setIntField(term31534, term31534.getClass(), "numberOfShannonFanoTrees", 1303442927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit");
        Object[] args = new Object[1];
        args[0] = term31534;
        callMethod(klass, "setGeneralPurposeBit", argTypes, term31351, args);
    }

};


