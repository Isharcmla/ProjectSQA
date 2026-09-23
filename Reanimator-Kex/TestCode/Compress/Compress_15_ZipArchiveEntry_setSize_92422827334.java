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
import java.lang.Long;

public class ZipArchiveEntry_setSize_92422827334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21582;
     Object term21764;

    public ZipArchiveEntry_setSize_92422827334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term21588 = new LinkedHashMap();
        Class<? extends Object> term21786 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term21785 = ((Class) term21786).getDeclaredField((String) "SECONDS");
        ((Field) term21785).setAccessible(true);
        Object enum81 = ((Field) term21785).get((Object) null);
        Class<? extends Object> term21969 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term21968 = ((Class) term21969).getDeclaredField((String) "DAYS");
        ((Field) term21968).setAccessible(true);
        Object enum82 = ((Field) term21968).get((Object) null);
        Class<? extends Object> term22143 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term22142 = ((Class) term22143).getDeclaredField((String) "MICROSECONDS");
        ((Field) term22142).setAccessible(true);
        Object enum83 = ((Field) term22142).get((Object) null);
        term21582 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term21599 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term21600 = (byte[]) newByteArray(8);
        byte[] term21609 = (byte[]) newByteArray(5);
        byte[] term21617 = (byte[]) newByteArray(6);
        Object term21624 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term21632 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term21653 = newInstance(Class.forName("java.time.Instant"));
        Object term21668 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term21686 = newInstance(Class.forName("java.time.Instant"));
        Object term21701 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term21727 = newInstance(Class.forName("java.time.Instant"));
        byte[] term21747 = (byte[]) newByteArray(3);
        setIntField(term21582, term21582.getClass(), "method", -1);
        setLongField(term21582, term21582.getClass(), "size", -1L);
        setIntField(term21582, term21582.getClass(), "internalAttributes", 1687361082);
        setIntField(term21582, term21582.getClass(), "platform", 584893196);
        setLongField(term21582, term21582.getClass(), "externalAttributes", 6273754186658578034L);
        setField(term21582, term21582.getClass(), "extraFields", term21588);
        setByteElement(term21600, 0, (byte) -30);
        setByteElement(term21600, 1, (byte) -67);
        setByteElement(term21600, 2, (byte) -67);
        setByteElement(term21600, 3, (byte) -94);
        setByteElement(term21600, 4, (byte) 78);
        setByteElement(term21600, 5, (byte) 8);
        setByteElement(term21600, 6, (byte) 25);
        setByteElement(term21600, 7, (byte) 103);
        setField(term21599, term21599.getClass(), "localFileData", term21600);
        setByteElement(term21609, 0, (byte) 111);
        setByteElement(term21609, 1, (byte) -43);
        setByteElement(term21609, 2, (byte) 35);
        setByteElement(term21609, 3, (byte) 62);
        setByteElement(term21609, 4, (byte) 90);
        setField(term21599, term21599.getClass(), "centralDirectoryData", term21609);
        setField(term21582, term21582.getClass(), "unparseableExtra", term21599);
        setField(term21582, term21582.getClass(), "name", "");
        setByteElement(term21617, 0, (byte) -40);
        setByteElement(term21617, 1, (byte) 79);
        setByteElement(term21617, 2, (byte) -102);
        setByteElement(term21617, 3, (byte) 55);
        setByteElement(term21617, 4, (byte) -63);
        setByteElement(term21617, 5, (byte) -76);
        setField(term21582, term21582.getClass(), "rawName", term21617);
        setBooleanField(term21624, term21624.getClass(), "languageEncodingFlag", false);
        setBooleanField(term21624, term21624.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term21624, term21624.getClass(), "encryptionFlag", false);
        setBooleanField(term21624, term21624.getClass(), "strongEncryptionFlag", false);
        setField(term21582, term21582.getClass(), "gpb", term21624);
        setLongField(term21582, term21582.getClass(), "xdostime", -1L);
        setField(term21632, term21632.getClass(), "unit", enum81);
        setLongField(term21632, term21632.getClass(), "value", 3620247240684476031L);
        setLongField(term21653, term21653.getClass(), "seconds", 1603923786L);
        setIntField(term21653, term21653.getClass(), "nanos", 801000000);
        setField(term21632, term21632.getClass(), "instant", term21653);
        setField(term21632, term21632.getClass(), "valueAsString", "SdCKLMIYnX");
        setField(term21582, term21582.getClass(), "mtime", term21632);
        setField(term21668, term21668.getClass(), "unit", enum82);
        setLongField(term21668, term21668.getClass(), "value", 8313800941204938919L);
        setLongField(term21686, term21686.getClass(), "seconds", 1369557267L);
        setIntField(term21686, term21686.getClass(), "nanos", 611000000);
        setField(term21668, term21668.getClass(), "instant", term21686);
        setField(term21668, term21668.getClass(), "valueAsString", "OJJtVNPyKZ");
        setField(term21582, term21582.getClass(), "atime", term21668);
        setField(term21701, term21701.getClass(), "unit", enum83);
        setLongField(term21701, term21701.getClass(), "value", -1214968196781083707L);
        setLongField(term21727, term21727.getClass(), "seconds", 1510293079L);
        setIntField(term21727, term21727.getClass(), "nanos", 351000000);
        setField(term21701, term21701.getClass(), "instant", term21727);
        setField(term21701, term21701.getClass(), "valueAsString", "AKNapTAfmD");
        setField(term21582, term21582.getClass(), "ctime", term21701);
        setLongField(term21582, term21582.getClass(), "crc", -1L);
        setLongField(term21582, term21582.getClass(), "csize", -1L);
        setIntField(term21582, term21582.getClass(), "flag", -1899301124);
        setByteElement(term21747, 0, (byte) -87);
        setByteElement(term21747, 1, (byte) 108);
        setByteElement(term21747, 2, (byte) -119);
        setField(term21582, term21582.getClass(), "extra", term21747);
        setField(term21582, term21582.getClass(), "comment", "xJgPlLxpgC");
        term21764 = new Long(-1804015692891701666L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term21764;
        callMethod(klass, "setSize", argTypes, term21582, args);
    }

};


