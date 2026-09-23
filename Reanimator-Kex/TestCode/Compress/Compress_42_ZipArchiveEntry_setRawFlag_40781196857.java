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

public class ZipArchiveEntry_setRawFlag_40781196857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36940;
     Object term37116;

    public ZipArchiveEntry_setRawFlag_40781196857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37136 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term37135 = ((Class) term37136).getDeclaredField((String) "MINUTES");
        ((Field) term37135).setAccessible(true);
        Object enum139 = ((Field) term37135).get((Object) null);
        Class<? extends Object> term37319 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term37318 = ((Class) term37319).getDeclaredField((String) "MILLISECONDS");
        ((Field) term37318).setAccessible(true);
        Object enum140 = ((Field) term37318).get((Object) null);
        Class<? extends Object> term37517 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term37516 = ((Class) term37517).getDeclaredField((String) "SECONDS");
        ((Field) term37516).setAccessible(true);
        Object enum141 = ((Field) term37516).get((Object) null);
        term36940 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term36949 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 3);
        Object term36950 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term36951 = (byte[]) newByteArray(6);
        byte[] term36958 = (byte[]) newByteArray(8);
        byte[] term36969 = (byte[]) newByteArray(3);
        Object term36973 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term36983 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term37004 = newInstance(Class.forName("java.time.Instant"));
        Object term37019 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term37045 = newInstance(Class.forName("java.time.Instant"));
        Object term37060 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term37081 = newInstance(Class.forName("java.time.Instant"));
        byte[] term37101 = (byte[]) newByteArray(1);
        setIntField(term36940, term36940.getClass(), "method", -1);
        setLongField(term36940, term36940.getClass(), "size", -1L);
        setIntField(term36940, term36940.getClass(), "internalAttributes", -201517446);
        setIntField(term36940, term36940.getClass(), "versionRequired", -97742366);
        setIntField(term36940, term36940.getClass(), "versionMadeBy", 1638851942);
        setIntField(term36940, term36940.getClass(), "platform", 1374790203);
        setIntField(term36940, term36940.getClass(), "rawFlag", 1160010161);
        setLongField(term36940, term36940.getClass(), "externalAttributes", -1145146470850585022L);
        setField(term36940, term36940.getClass(), "extraFields", term36949);
        setByteElement(term36951, 0, (byte) 79);
        setByteElement(term36951, 1, (byte) -19);
        setByteElement(term36951, 2, (byte) 75);
        setByteElement(term36951, 3, (byte) -25);
        setByteElement(term36951, 4, (byte) -57);
        setByteElement(term36951, 5, (byte) 69);
        setField(term36950, term36950.getClass(), "localFileData", term36951);
        setByteElement(term36958, 0, (byte) -49);
        setByteElement(term36958, 1, (byte) 106);
        setByteElement(term36958, 2, (byte) -99);
        setByteElement(term36958, 3, (byte) 66);
        setByteElement(term36958, 4, (byte) 82);
        setByteElement(term36958, 5, (byte) 81);
        setByteElement(term36958, 6, (byte) -106);
        setByteElement(term36958, 7, (byte) -110);
        setField(term36950, term36950.getClass(), "centralDirectoryData", term36958);
        setField(term36940, term36940.getClass(), "unparseableExtra", term36950);
        setField(term36940, term36940.getClass(), "name", "");
        setByteElement(term36969, 0, (byte) 126);
        setByteElement(term36969, 1, (byte) 100);
        setByteElement(term36969, 2, (byte) 97);
        setField(term36940, term36940.getClass(), "rawName", term36969);
        setBooleanField(term36973, term36973.getClass(), "languageEncodingFlag", false);
        setBooleanField(term36973, term36973.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term36973, term36973.getClass(), "encryptionFlag", false);
        setBooleanField(term36973, term36973.getClass(), "strongEncryptionFlag", false);
        setIntField(term36973, term36973.getClass(), "slidingDictionarySize", 0);
        setIntField(term36973, term36973.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term36940, term36940.getClass(), "gpb", term36973);
        setLongField(term36940, term36940.getClass(), "xdostime", -1L);
        setField(term36983, term36983.getClass(), "unit", enum139);
        setLongField(term36983, term36983.getClass(), "value", 1993646237353405740L);
        setLongField(term37004, term37004.getClass(), "seconds", 1408312742L);
        setIntField(term37004, term37004.getClass(), "nanos", 367000000);
        setField(term36983, term36983.getClass(), "instant", term37004);
        setField(term36983, term36983.getClass(), "valueAsString", "WXMWFDGcLB");
        setField(term36940, term36940.getClass(), "mtime", term36983);
        setField(term37019, term37019.getClass(), "unit", enum140);
        setLongField(term37019, term37019.getClass(), "value", -4043093655001688454L);
        setLongField(term37045, term37045.getClass(), "seconds", 1643999144L);
        setIntField(term37045, term37045.getClass(), "nanos", 410000000);
        setField(term37019, term37019.getClass(), "instant", term37045);
        setField(term37019, term37019.getClass(), "valueAsString", "wKWbJssZuG");
        setField(term36940, term36940.getClass(), "atime", term37019);
        setField(term37060, term37060.getClass(), "unit", enum141);
        setLongField(term37060, term37060.getClass(), "value", -419800263764810394L);
        setLongField(term37081, term37081.getClass(), "seconds", 1615597184L);
        setIntField(term37081, term37081.getClass(), "nanos", 168000000);
        setField(term37060, term37060.getClass(), "instant", term37081);
        setField(term37060, term37060.getClass(), "valueAsString", "NzBMMhkhpT");
        setField(term36940, term36940.getClass(), "ctime", term37060);
        setLongField(term36940, term36940.getClass(), "crc", -1L);
        setLongField(term36940, term36940.getClass(), "csize", -1L);
        setIntField(term36940, term36940.getClass(), "flag", -423900705);
        setByteElement(term37101, 0, (byte) 31);
        setField(term36940, term36940.getClass(), "extra", term37101);
        setField(term36940, term36940.getClass(), "comment", "qCpEbQDHdF");
        term37116 = new Integer(754055848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37116;
        callMethod(klass, "setRawFlag", argTypes, term36940, args);
    }

};


