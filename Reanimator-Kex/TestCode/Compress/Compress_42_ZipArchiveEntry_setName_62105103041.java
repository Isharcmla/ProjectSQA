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

public class ZipArchiveEntry_setName_62105103041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25988;

    public ZipArchiveEntry_setName_62105103041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26209 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term26208 = ((Class) term26209).getDeclaredField((String) "DAYS");
        ((Field) term26208).setAccessible(true);
        Object enum98 = ((Field) term26208).get((Object) null);
        Class<? extends Object> term26383 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term26382 = ((Class) term26383).getDeclaredField((String) "MICROSECONDS");
        ((Field) term26382).setAccessible(true);
        Object enum99 = ((Field) term26382).get((Object) null);
        Class<? extends Object> term26581 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term26580 = ((Class) term26581).getDeclaredField((String) "SECONDS");
        ((Field) term26580).setAccessible(true);
        Object enum100 = ((Field) term26580).get((Object) null);
        term25988 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term25997 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 7);
        Object term25998 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term25999 = (byte[]) newByteArray(8);
        byte[] term26008 = (byte[]) newByteArray(9);
        byte[] term26020 = (byte[]) newByteArray(5);
        Object term26026 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term26036 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26054 = newInstance(Class.forName("java.time.Instant"));
        Object term26069 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26095 = newInstance(Class.forName("java.time.Instant"));
        Object term26110 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26131 = newInstance(Class.forName("java.time.Instant"));
        byte[] term26151 = (byte[]) newByteArray(9);
        setIntField(term25988, term25988.getClass(), "method", -1);
        setLongField(term25988, term25988.getClass(), "size", -1L);
        setIntField(term25988, term25988.getClass(), "internalAttributes", 76929641);
        setIntField(term25988, term25988.getClass(), "versionRequired", -2003192918);
        setIntField(term25988, term25988.getClass(), "versionMadeBy", -1362856620);
        setIntField(term25988, term25988.getClass(), "platform", -1835839814);
        setIntField(term25988, term25988.getClass(), "rawFlag", -1404350380);
        setLongField(term25988, term25988.getClass(), "externalAttributes", 1457594663983990440L);
        setField(term25988, term25988.getClass(), "extraFields", term25997);
        setByteElement(term25999, 0, (byte) 9);
        setByteElement(term25999, 1, (byte) 44);
        setByteElement(term25999, 2, (byte) 26);
        setByteElement(term25999, 3, (byte) 125);
        setByteElement(term25999, 4, (byte) -119);
        setByteElement(term25999, 5, (byte) 94);
        setByteElement(term25999, 6, (byte) -1);
        setByteElement(term25999, 7, (byte) 99);
        setField(term25998, term25998.getClass(), "localFileData", term25999);
        setByteElement(term26008, 0, (byte) 32);
        setByteElement(term26008, 1, (byte) -81);
        setByteElement(term26008, 2, (byte) 122);
        setByteElement(term26008, 3, (byte) 27);
        setByteElement(term26008, 4, (byte) -118);
        setByteElement(term26008, 5, (byte) 37);
        setByteElement(term26008, 6, (byte) -9);
        setByteElement(term26008, 7, (byte) -3);
        setByteElement(term26008, 8, (byte) 68);
        setField(term25998, term25998.getClass(), "centralDirectoryData", term26008);
        setField(term25988, term25988.getClass(), "unparseableExtra", term25998);
        setField(term25988, term25988.getClass(), "name", "");
        setByteElement(term26020, 0, (byte) 108);
        setByteElement(term26020, 1, (byte) 118);
        setByteElement(term26020, 2, (byte) 111);
        setByteElement(term26020, 3, (byte) -122);
        setByteElement(term26020, 4, (byte) -76);
        setField(term25988, term25988.getClass(), "rawName", term26020);
        setBooleanField(term26026, term26026.getClass(), "languageEncodingFlag", false);
        setBooleanField(term26026, term26026.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term26026, term26026.getClass(), "encryptionFlag", false);
        setBooleanField(term26026, term26026.getClass(), "strongEncryptionFlag", false);
        setIntField(term26026, term26026.getClass(), "slidingDictionarySize", 0);
        setIntField(term26026, term26026.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term25988, term25988.getClass(), "gpb", term26026);
        setLongField(term25988, term25988.getClass(), "xdostime", -1L);
        setField(term26036, term26036.getClass(), "unit", enum98);
        setLongField(term26036, term26036.getClass(), "value", 3452833434644634217L);
        setLongField(term26054, term26054.getClass(), "seconds", 1676489642L);
        setIntField(term26054, term26054.getClass(), "nanos", 491000000);
        setField(term26036, term26036.getClass(), "instant", term26054);
        setField(term26036, term26036.getClass(), "valueAsString", "HHmNoYxIGj");
        setField(term25988, term25988.getClass(), "mtime", term26036);
        setField(term26069, term26069.getClass(), "unit", enum99);
        setLongField(term26069, term26069.getClass(), "value", -8603648071751666348L);
        setLongField(term26095, term26095.getClass(), "seconds", 1724978506L);
        setIntField(term26095, term26095.getClass(), "nanos", 464000000);
        setField(term26069, term26069.getClass(), "instant", term26095);
        setField(term26069, term26069.getClass(), "valueAsString", "PtirvZmsGt");
        setField(term25988, term25988.getClass(), "atime", term26069);
        setField(term26110, term26110.getClass(), "unit", enum100);
        setLongField(term26110, term26110.getClass(), "value", -7884871963229073324L);
        setLongField(term26131, term26131.getClass(), "seconds", 1743154792L);
        setIntField(term26131, term26131.getClass(), "nanos", 108000000);
        setField(term26110, term26110.getClass(), "instant", term26131);
        setField(term26110, term26110.getClass(), "valueAsString", "HWkpTmtlrc");
        setField(term25988, term25988.getClass(), "ctime", term26110);
        setLongField(term25988, term25988.getClass(), "crc", -1L);
        setLongField(term25988, term25988.getClass(), "csize", -1L);
        setIntField(term25988, term25988.getClass(), "flag", -2013924238);
        setByteElement(term26151, 0, (byte) -97);
        setByteElement(term26151, 1, (byte) 101);
        setByteElement(term26151, 2, (byte) 111);
        setByteElement(term26151, 3, (byte) -38);
        setByteElement(term26151, 4, (byte) 24);
        setByteElement(term26151, 5, (byte) 43);
        setByteElement(term26151, 6, (byte) -126);
        setByteElement(term26151, 7, (byte) -59);
        setByteElement(term26151, 8, (byte) 27);
        setField(term25988, term25988.getClass(), "extra", term26151);
        setField(term25988, term25988.getClass(), "comment", "hMmaoREuCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VeDtgDzGAN";
        callMethod(klass, "setName", argTypes, term25988, args);
    }

};


