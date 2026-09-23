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

public class ZipArchiveEntry_init_1714071112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term893;

    public ZipArchiveEntry_init_1714071112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1048 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1047 = ((Class) term1048).getDeclaredField((String) "HOURS");
        ((Field) term1047).setAccessible(true);
        Object enum3 = ((Field) term1047).get((Object) null);
        Class<? extends Object> term1235 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1234 = ((Class) term1235).getDeclaredField((String) "SECONDS");
        ((Field) term1234).setAccessible(true);
        Object enum4 = ((Field) term1234).get((Object) null);
        term893 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term902 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 4);
        Object term903 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term904 = (byte[]) newByteArray(3);
        byte[] term908 = (byte[]) newByteArray(4);
        byte[] term915 = (byte[]) newByteArray(1);
        Object term917 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term927 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term946 = newInstance(Class.forName("java.time.Instant"));
        Object term961 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term963 = newInstance(Class.forName("java.time.Instant"));
        Object term978 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term999 = newInstance(Class.forName("java.time.Instant"));
        byte[] term1019 = (byte[]) newByteArray(6);
        setIntField(term893, term893.getClass(), "method", -1);
        setLongField(term893, term893.getClass(), "size", -1L);
        setIntField(term893, term893.getClass(), "internalAttributes", 391863371);
        setIntField(term893, term893.getClass(), "versionRequired", -1922583790);
        setIntField(term893, term893.getClass(), "versionMadeBy", -616727354);
        setIntField(term893, term893.getClass(), "platform", -1955890973);
        setIntField(term893, term893.getClass(), "rawFlag", -2038273078);
        setLongField(term893, term893.getClass(), "externalAttributes", -8400487765614892086L);
        setField(term893, term893.getClass(), "extraFields", term902);
        setByteElement(term904, 0, (byte) -58);
        setByteElement(term904, 1, (byte) -29);
        setByteElement(term904, 2, (byte) -54);
        setField(term903, term903.getClass(), "localFileData", term904);
        setByteElement(term908, 0, (byte) -10);
        setByteElement(term908, 1, (byte) 79);
        setByteElement(term908, 2, (byte) -119);
        setByteElement(term908, 3, (byte) -66);
        setField(term903, term903.getClass(), "centralDirectoryData", term908);
        setField(term893, term893.getClass(), "unparseableExtra", term903);
        setField(term893, term893.getClass(), "name", "");
        setByteElement(term915, 0, (byte) 83);
        setField(term893, term893.getClass(), "rawName", term915);
        setBooleanField(term917, term917.getClass(), "languageEncodingFlag", false);
        setBooleanField(term917, term917.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term917, term917.getClass(), "encryptionFlag", false);
        setBooleanField(term917, term917.getClass(), "strongEncryptionFlag", false);
        setIntField(term917, term917.getClass(), "slidingDictionarySize", 0);
        setIntField(term917, term917.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term893, term893.getClass(), "gpb", term917);
        setLongField(term893, term893.getClass(), "xdostime", -1L);
        setField(term927, term927.getClass(), "unit", enum3);
        setLongField(term927, term927.getClass(), "value", 5270370404989704783L);
        setLongField(term946, term946.getClass(), "seconds", 1606063635L);
        setIntField(term946, term946.getClass(), "nanos", 837000000);
        setField(term927, term927.getClass(), "instant", term946);
        setField(term927, term927.getClass(), "valueAsString", "SzjVpOQTyS");
        setField(term893, term893.getClass(), "mtime", term927);
        setField(term961, term961.getClass(), "unit", enum3);
        setLongField(term961, term961.getClass(), "value", 7411271909051562686L);
        setLongField(term963, term963.getClass(), "seconds", 1442657565L);
        setIntField(term963, term963.getClass(), "nanos", 302000000);
        setField(term961, term961.getClass(), "instant", term963);
        setField(term961, term961.getClass(), "valueAsString", "MjGYSRKTNF");
        setField(term893, term893.getClass(), "atime", term961);
        setField(term978, term978.getClass(), "unit", enum4);
        setLongField(term978, term978.getClass(), "value", 4872422362414183754L);
        setLongField(term999, term999.getClass(), "seconds", 1515908130L);
        setIntField(term999, term999.getClass(), "nanos", 18000000);
        setField(term978, term978.getClass(), "instant", term999);
        setField(term978, term978.getClass(), "valueAsString", "hRNSzYYIrc");
        setField(term893, term893.getClass(), "ctime", term978);
        setLongField(term893, term893.getClass(), "crc", -1L);
        setLongField(term893, term893.getClass(), "csize", -1L);
        setIntField(term893, term893.getClass(), "flag", 1227103734);
        setByteElement(term1019, 0, (byte) 74);
        setByteElement(term1019, 1, (byte) -71);
        setByteElement(term1019, 2, (byte) 49);
        setByteElement(term1019, 3, (byte) -54);
        setByteElement(term1019, 4, (byte) 67);
        setByteElement(term1019, 5, (byte) 78);
        setField(term893, term893.getClass(), "extra", term1019);
        setField(term893, term893.getClass(), "comment", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term893;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


