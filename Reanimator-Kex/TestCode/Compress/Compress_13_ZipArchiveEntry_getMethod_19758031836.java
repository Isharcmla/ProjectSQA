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

public class ZipArchiveEntry_getMethod_19758031836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2235;

    public ZipArchiveEntry_getMethod_19758031836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2241 = new LinkedHashMap();
        Class<? extends Object> term2409 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2408 = ((Class) term2409).getDeclaredField((String) "MILLISECONDS");
        ((Field) term2408).setAccessible(true);
        Object enum8 = ((Field) term2408).get((Object) null);
        Class<? extends Object> term2617 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2616 = ((Class) term2617).getDeclaredField((String) "SECONDS");
        ((Field) term2616).setAccessible(true);
        Object enum9 = ((Field) term2616).get((Object) null);
        term2235 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term2252 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term2253 = (byte[]) newByteArray(1);
        byte[] term2255 = (byte[]) newByteArray(6);
        byte[] term2264 = (byte[]) newByteArray(5);
        Object term2270 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term2278 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2304 = newInstance(Class.forName("java.time.Instant"));
        Object term2319 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2321 = newInstance(Class.forName("java.time.Instant"));
        Object term2336 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2357 = newInstance(Class.forName("java.time.Instant"));
        byte[] term2377 = (byte[]) newByteArray(5);
        setIntField(term2235, term2235.getClass(), "method", -1);
        setLongField(term2235, term2235.getClass(), "size", -1L);
        setIntField(term2235, term2235.getClass(), "internalAttributes", -1685132342);
        setIntField(term2235, term2235.getClass(), "platform", -1456670397);
        setLongField(term2235, term2235.getClass(), "externalAttributes", -8885298608300233488L);
        setField(term2235, term2235.getClass(), "extraFields", term2241);
        setByteElement(term2253, 0, (byte) 42);
        setField(term2252, term2252.getClass(), "localFileData", term2253);
        setByteElement(term2255, 0, (byte) 72);
        setByteElement(term2255, 1, (byte) 111);
        setByteElement(term2255, 2, (byte) 99);
        setByteElement(term2255, 3, (byte) -12);
        setByteElement(term2255, 4, (byte) -61);
        setByteElement(term2255, 5, (byte) -85);
        setField(term2252, term2252.getClass(), "centralDirectoryData", term2255);
        setField(term2235, term2235.getClass(), "unparseableExtra", term2252);
        setField(term2235, term2235.getClass(), "name", "");
        setByteElement(term2264, 0, (byte) -22);
        setByteElement(term2264, 1, (byte) 93);
        setByteElement(term2264, 2, (byte) 69);
        setByteElement(term2264, 3, (byte) -74);
        setByteElement(term2264, 4, (byte) -123);
        setField(term2235, term2235.getClass(), "rawName", term2264);
        setBooleanField(term2270, term2270.getClass(), "languageEncodingFlag", false);
        setBooleanField(term2270, term2270.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term2270, term2270.getClass(), "encryptionFlag", false);
        setBooleanField(term2270, term2270.getClass(), "strongEncryptionFlag", false);
        setField(term2235, term2235.getClass(), "gpb", term2270);
        setLongField(term2235, term2235.getClass(), "xdostime", -1L);
        setField(term2278, term2278.getClass(), "unit", enum8);
        setLongField(term2278, term2278.getClass(), "value", -4325723315152823407L);
        setLongField(term2304, term2304.getClass(), "seconds", 1500739068L);
        setIntField(term2304, term2304.getClass(), "nanos", 23000000);
        setField(term2278, term2278.getClass(), "instant", term2304);
        setField(term2278, term2278.getClass(), "valueAsString", "ZiaGIbnzTs");
        setField(term2235, term2235.getClass(), "mtime", term2278);
        setField(term2319, term2319.getClass(), "unit", enum8);
        setLongField(term2319, term2319.getClass(), "value", 2535595959091595249L);
        setLongField(term2321, term2321.getClass(), "seconds", 1797221628L);
        setIntField(term2321, term2321.getClass(), "nanos", 25000000);
        setField(term2319, term2319.getClass(), "instant", term2321);
        setField(term2319, term2319.getClass(), "valueAsString", "tbcdzjIfER");
        setField(term2235, term2235.getClass(), "atime", term2319);
        setField(term2336, term2336.getClass(), "unit", enum9);
        setLongField(term2336, term2336.getClass(), "value", -5476826692763582090L);
        setLongField(term2357, term2357.getClass(), "seconds", 1589475921L);
        setIntField(term2357, term2357.getClass(), "nanos", 30000000);
        setField(term2336, term2336.getClass(), "instant", term2357);
        setField(term2336, term2336.getClass(), "valueAsString", "HyxfbSQYBe");
        setField(term2235, term2235.getClass(), "ctime", term2336);
        setLongField(term2235, term2235.getClass(), "crc", -1L);
        setLongField(term2235, term2235.getClass(), "csize", -1L);
        setIntField(term2235, term2235.getClass(), "flag", 1048535127);
        setByteElement(term2377, 0, (byte) -23);
        setByteElement(term2377, 1, (byte) 100);
        setByteElement(term2377, 2, (byte) 106);
        setByteElement(term2377, 3, (byte) -57);
        setByteElement(term2377, 4, (byte) -103);
        setField(term2235, term2235.getClass(), "extra", term2377);
        setField(term2235, term2235.getClass(), "comment", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term2235, args);
    }

};


