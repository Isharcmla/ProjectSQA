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

public class ZipArchiveEntry_setCentralDirectoryExtra_102747004436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22707;
     Object term22874;

    public ZipArchiveEntry_setCentralDirectoryExtra_102747004436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22886 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term22885 = ((Class) term22886).getDeclaredField((String) "SECONDS");
        ((Field) term22885).setAccessible(true);
        Object enum86 = ((Field) term22885).get((Object) null);
        Class<? extends Object> term23069 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term23068 = ((Class) term23069).getDeclaredField((String) "MILLISECONDS");
        ((Field) term23068).setAccessible(true);
        Object enum87 = ((Field) term23068).get((Object) null);
        Class<? extends Object> term23267 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term23266 = ((Class) term23267).getDeclaredField((String) "MINUTES");
        ((Field) term23266).setAccessible(true);
        Object enum88 = ((Field) term23266).get((Object) null);
        term22707 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term22716 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 1);
        Object term22717 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term22718 = (byte[]) newByteArray(2);
        byte[] term22721 = (byte[]) newByteArray(0);
        byte[] term22724 = (byte[]) newByteArray(6);
        Object term22731 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term22741 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term22762 = newInstance(Class.forName("java.time.Instant"));
        Object term22777 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term22803 = newInstance(Class.forName("java.time.Instant"));
        Object term22818 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term22839 = newInstance(Class.forName("java.time.Instant"));
        byte[] term22859 = (byte[]) newByteArray(1);
        setIntField(term22707, term22707.getClass(), "method", -1);
        setLongField(term22707, term22707.getClass(), "size", -1L);
        setIntField(term22707, term22707.getClass(), "internalAttributes", 515182546);
        setIntField(term22707, term22707.getClass(), "versionRequired", -936895502);
        setIntField(term22707, term22707.getClass(), "versionMadeBy", -129547140);
        setIntField(term22707, term22707.getClass(), "platform", 199287428);
        setIntField(term22707, term22707.getClass(), "rawFlag", -1195339592);
        setLongField(term22707, term22707.getClass(), "externalAttributes", 7489064039921396098L);
        setField(term22707, term22707.getClass(), "extraFields", term22716);
        setByteElement(term22718, 0, (byte) -63);
        setByteElement(term22718, 1, (byte) -76);
        setField(term22717, term22717.getClass(), "localFileData", term22718);
        setField(term22717, term22717.getClass(), "centralDirectoryData", term22721);
        setField(term22707, term22707.getClass(), "unparseableExtra", term22717);
        setField(term22707, term22707.getClass(), "name", "");
        setByteElement(term22724, 0, (byte) -87);
        setByteElement(term22724, 1, (byte) 108);
        setByteElement(term22724, 2, (byte) -119);
        setByteElement(term22724, 3, (byte) -51);
        setByteElement(term22724, 4, (byte) -55);
        setByteElement(term22724, 5, (byte) -5);
        setField(term22707, term22707.getClass(), "rawName", term22724);
        setBooleanField(term22731, term22731.getClass(), "languageEncodingFlag", false);
        setBooleanField(term22731, term22731.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term22731, term22731.getClass(), "encryptionFlag", false);
        setBooleanField(term22731, term22731.getClass(), "strongEncryptionFlag", false);
        setIntField(term22731, term22731.getClass(), "slidingDictionarySize", 0);
        setIntField(term22731, term22731.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term22707, term22707.getClass(), "gpb", term22731);
        setLongField(term22707, term22707.getClass(), "xdostime", -1L);
        setField(term22741, term22741.getClass(), "unit", enum86);
        setLongField(term22741, term22741.getClass(), "value", 6843866297465638866L);
        setLongField(term22762, term22762.getClass(), "seconds", 1431673415L);
        setIntField(term22762, term22762.getClass(), "nanos", 283000000);
        setField(term22741, term22741.getClass(), "instant", term22762);
        setField(term22741, term22741.getClass(), "valueAsString", "wfaXBpWAUH");
        setField(term22707, term22707.getClass(), "mtime", term22741);
        setField(term22777, term22777.getClass(), "unit", enum87);
        setLongField(term22777, term22777.getClass(), "value", -4023935540989049732L);
        setLongField(term22803, term22803.getClass(), "seconds", 1714993302L);
        setIntField(term22803, term22803.getClass(), "nanos", 670000000);
        setField(term22777, term22777.getClass(), "instant", term22803);
        setField(term22777, term22777.getClass(), "valueAsString", "VMeAzAHwZj");
        setField(term22707, term22707.getClass(), "atime", term22777);
        setField(term22818, term22818.getClass(), "unit", enum88);
        setLongField(term22818, term22818.getClass(), "value", 855932984568615096L);
        setLongField(term22839, term22839.getClass(), "seconds", 1830771077L);
        setIntField(term22839, term22839.getClass(), "nanos", 357000000);
        setField(term22818, term22818.getClass(), "instant", term22839);
        setField(term22818, term22818.getClass(), "valueAsString", "PznxWXsZME");
        setField(term22707, term22707.getClass(), "ctime", term22818);
        setLongField(term22707, term22707.getClass(), "crc", -1L);
        setLongField(term22707, term22707.getClass(), "csize", -1L);
        setIntField(term22707, term22707.getClass(), "flag", -376422566);
        setByteElement(term22859, 0, (byte) 14);
        setField(term22707, term22707.getClass(), "extra", term22859);
        setField(term22707, term22707.getClass(), "comment", "ZzIujlwVsw");
        term22874 = (byte[]) newByteArray(2);
        setByteElement(term22874, 0, (byte) 125);
        setByteElement(term22874, 1, (byte) 57);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term22874;
        callMethod(klass, "setCentralDirectoryExtra", argTypes, term22707, args);
    }

};


