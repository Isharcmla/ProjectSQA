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
        LinkedHashMap term899 = new LinkedHashMap();
        Class<? extends Object> term1054 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1053 = ((Class) term1054).getDeclaredField((String) "HOURS");
        ((Field) term1053).setAccessible(true);
        Object enum3 = ((Field) term1053).get((Object) null);
        Class<? extends Object> term1241 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1240 = ((Class) term1241).getDeclaredField((String) "SECONDS");
        ((Field) term1240).setAccessible(true);
        Object enum4 = ((Field) term1240).get((Object) null);
        term893 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term910 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term911 = (byte[]) newByteArray(4);
        byte[] term916 = (byte[]) newByteArray(3);
        byte[] term922 = (byte[]) newByteArray(4);
        Object term927 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term935 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term954 = newInstance(Class.forName("java.time.Instant"));
        Object term969 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term971 = newInstance(Class.forName("java.time.Instant"));
        Object term986 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1007 = newInstance(Class.forName("java.time.Instant"));
        byte[] term1027 = (byte[]) newByteArray(1);
        setIntField(term893, term893.getClass(), "method", -1);
        setLongField(term893, term893.getClass(), "size", -1L);
        setIntField(term893, term893.getClass(), "internalAttributes", 391863371);
        setIntField(term893, term893.getClass(), "platform", -1922583790);
        setLongField(term893, term893.getClass(), "externalAttributes", -8400487765614892086L);
        setField(term893, term893.getClass(), "extraFields", term899);
        setByteElement(term911, 0, (byte) -58);
        setByteElement(term911, 1, (byte) -29);
        setByteElement(term911, 2, (byte) -54);
        setByteElement(term911, 3, (byte) -10);
        setField(term910, term910.getClass(), "localFileData", term911);
        setByteElement(term916, 0, (byte) 79);
        setByteElement(term916, 1, (byte) -119);
        setByteElement(term916, 2, (byte) -66);
        setField(term910, term910.getClass(), "centralDirectoryData", term916);
        setField(term893, term893.getClass(), "unparseableExtra", term910);
        setField(term893, term893.getClass(), "name", "");
        setByteElement(term922, 0, (byte) 83);
        setByteElement(term922, 1, (byte) 74);
        setByteElement(term922, 2, (byte) -71);
        setByteElement(term922, 3, (byte) 49);
        setField(term893, term893.getClass(), "rawName", term922);
        setBooleanField(term927, term927.getClass(), "languageEncodingFlag", false);
        setBooleanField(term927, term927.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term927, term927.getClass(), "encryptionFlag", false);
        setBooleanField(term927, term927.getClass(), "strongEncryptionFlag", false);
        setField(term893, term893.getClass(), "gpb", term927);
        setLongField(term893, term893.getClass(), "xdostime", -1L);
        setField(term935, term935.getClass(), "unit", enum3);
        setLongField(term935, term935.getClass(), "value", 5270370404989704783L);
        setLongField(term954, term954.getClass(), "seconds", 1606063635L);
        setIntField(term954, term954.getClass(), "nanos", 837000000);
        setField(term935, term935.getClass(), "instant", term954);
        setField(term935, term935.getClass(), "valueAsString", "SzjVpOQTyS");
        setField(term893, term893.getClass(), "mtime", term935);
        setField(term969, term969.getClass(), "unit", enum3);
        setLongField(term969, term969.getClass(), "value", 7411271909051562686L);
        setLongField(term971, term971.getClass(), "seconds", 1442657565L);
        setIntField(term971, term971.getClass(), "nanos", 302000000);
        setField(term969, term969.getClass(), "instant", term971);
        setField(term969, term969.getClass(), "valueAsString", "MjGYSRKTNF");
        setField(term893, term893.getClass(), "atime", term969);
        setField(term986, term986.getClass(), "unit", enum4);
        setLongField(term986, term986.getClass(), "value", 4872422362414183754L);
        setLongField(term1007, term1007.getClass(), "seconds", 1515908130L);
        setIntField(term1007, term1007.getClass(), "nanos", 18000000);
        setField(term986, term986.getClass(), "instant", term1007);
        setField(term986, term986.getClass(), "valueAsString", "hRNSzYYIrc");
        setField(term893, term893.getClass(), "ctime", term986);
        setLongField(term893, term893.getClass(), "crc", -1L);
        setLongField(term893, term893.getClass(), "csize", -1L);
        setIntField(term893, term893.getClass(), "flag", -1955890973);
        setByteElement(term1027, 0, (byte) -54);
        setField(term893, term893.getClass(), "extra", term1027);
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


