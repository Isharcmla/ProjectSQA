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

public class ZipArchiveEntry_setName_62105103032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20196;

    public ZipArchiveEntry_setName_62105103032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term20202 = new LinkedHashMap();
        Class<? extends Object> term20373 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20372 = ((Class) term20373).getDeclaredField((String) "MICROSECONDS");
        ((Field) term20372).setAccessible(true);
        Object enum76 = ((Field) term20372).get((Object) null);
        Class<? extends Object> term20571 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20570 = ((Class) term20571).getDeclaredField((String) "NANOSECONDS");
        ((Field) term20570).setAccessible(true);
        Object enum77 = ((Field) term20570).get((Object) null);
        term20196 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term20213 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term20214 = (byte[]) newByteArray(4);
        byte[] term20219 = (byte[]) newByteArray(1);
        byte[] term20223 = (byte[]) newByteArray(0);
        Object term20224 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term20232 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20258 = newInstance(Class.forName("java.time.Instant"));
        Object term20273 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20298 = newInstance(Class.forName("java.time.Instant"));
        Object term20313 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20315 = newInstance(Class.forName("java.time.Instant"));
        byte[] term20335 = (byte[]) newByteArray(6);
        setIntField(term20196, term20196.getClass(), "method", -1);
        setLongField(term20196, term20196.getClass(), "size", -1L);
        setIntField(term20196, term20196.getClass(), "internalAttributes", 197109649);
        setIntField(term20196, term20196.getClass(), "platform", -1239406390);
        setLongField(term20196, term20196.getClass(), "externalAttributes", -4393710401270724527L);
        setField(term20196, term20196.getClass(), "extraFields", term20202);
        setByteElement(term20214, 0, (byte) 83);
        setByteElement(term20214, 1, (byte) -41);
        setByteElement(term20214, 2, (byte) -102);
        setByteElement(term20214, 3, (byte) -93);
        setField(term20213, term20213.getClass(), "localFileData", term20214);
        setByteElement(term20219, 0, (byte) 111);
        setField(term20213, term20213.getClass(), "centralDirectoryData", term20219);
        setField(term20196, term20196.getClass(), "unparseableExtra", term20213);
        setField(term20196, term20196.getClass(), "name", "");
        setField(term20196, term20196.getClass(), "rawName", term20223);
        setBooleanField(term20224, term20224.getClass(), "languageEncodingFlag", false);
        setBooleanField(term20224, term20224.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term20224, term20224.getClass(), "encryptionFlag", false);
        setBooleanField(term20224, term20224.getClass(), "strongEncryptionFlag", false);
        setField(term20196, term20196.getClass(), "gpb", term20224);
        setLongField(term20196, term20196.getClass(), "xdostime", -1L);
        setField(term20232, term20232.getClass(), "unit", enum76);
        setLongField(term20232, term20232.getClass(), "value", -4822736661741380518L);
        setLongField(term20258, term20258.getClass(), "seconds", 1359804657L);
        setIntField(term20258, term20258.getClass(), "nanos", 69000000);
        setField(term20232, term20232.getClass(), "instant", term20258);
        setField(term20232, term20232.getClass(), "valueAsString", "dpNsDgfPso");
        setField(term20196, term20196.getClass(), "mtime", term20232);
        setField(term20273, term20273.getClass(), "unit", enum77);
        setLongField(term20273, term20273.getClass(), "value", -5386201758403679145L);
        setLongField(term20298, term20298.getClass(), "seconds", 1589764751L);
        setIntField(term20298, term20298.getClass(), "nanos", 309000000);
        setField(term20273, term20273.getClass(), "instant", term20298);
        setField(term20273, term20273.getClass(), "valueAsString", "hCWPJQKpdc");
        setField(term20196, term20196.getClass(), "atime", term20273);
        setField(term20313, term20313.getClass(), "unit", enum76);
        setLongField(term20313, term20313.getClass(), "value", -7268507582722666254L);
        setLongField(term20315, term20315.getClass(), "seconds", 1291298367L);
        setIntField(term20315, term20315.getClass(), "nanos", 982000000);
        setField(term20313, term20313.getClass(), "instant", term20315);
        setField(term20313, term20313.getClass(), "valueAsString", "WzMEhMXkKx");
        setField(term20196, term20196.getClass(), "ctime", term20313);
        setLongField(term20196, term20196.getClass(), "crc", -1L);
        setLongField(term20196, term20196.getClass(), "csize", -1L);
        setIntField(term20196, term20196.getClass(), "flag", -1504890659);
        setByteElement(term20335, 0, (byte) -4);
        setByteElement(term20335, 1, (byte) -68);
        setByteElement(term20335, 2, (byte) -7);
        setByteElement(term20335, 3, (byte) -109);
        setByteElement(term20335, 4, (byte) 69);
        setByteElement(term20335, 5, (byte) -50);
        setField(term20196, term20196.getClass(), "extra", term20335);
        setField(term20196, term20196.getClass(), "comment", "XOiDvlDhdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdxvLJhNLe";
        callMethod(klass, "setName", argTypes, term20196, args);
    }

};


