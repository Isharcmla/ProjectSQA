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

public class ZipArchiveEntry_getMethod_19758031836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2227;

    public ZipArchiveEntry_getMethod_19758031836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2388 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2387 = ((Class) term2388).getDeclaredField((String) "MILLISECONDS");
        ((Field) term2387).setAccessible(true);
        Object enum8 = ((Field) term2387).get((Object) null);
        Class<? extends Object> term2596 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2595 = ((Class) term2596).getDeclaredField((String) "SECONDS");
        ((Field) term2595).setAccessible(true);
        Object enum9 = ((Field) term2595).get((Object) null);
        term2227 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term2236 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
        Object term2237 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term2238 = (byte[]) newByteArray(5);
        byte[] term2244 = (byte[]) newByteArray(2);
        byte[] term2249 = (byte[]) newByteArray(3);
        Object term2253 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term2263 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2289 = newInstance(Class.forName("java.time.Instant"));
        Object term2304 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2306 = newInstance(Class.forName("java.time.Instant"));
        Object term2321 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2342 = newInstance(Class.forName("java.time.Instant"));
        byte[] term2362 = (byte[]) newByteArray(1);
        setIntField(term2227, term2227.getClass(), "method", -1);
        setLongField(term2227, term2227.getClass(), "size", -1L);
        setIntField(term2227, term2227.getClass(), "internalAttributes", -655067527);
        setIntField(term2227, term2227.getClass(), "versionRequired", -6029667);
        setIntField(term2227, term2227.getClass(), "versionMadeBy", -2068769794);
        setIntField(term2227, term2227.getClass(), "platform", -117576464);
        setIntField(term2227, term2227.getClass(), "rawFlag", -1007160944);
        setLongField(term2227, term2227.getClass(), "externalAttributes", -8885298608300233488L);
        setField(term2227, term2227.getClass(), "extraFields", term2236);
        setByteElement(term2238, 0, (byte) 72);
        setByteElement(term2238, 1, (byte) 111);
        setByteElement(term2238, 2, (byte) 99);
        setByteElement(term2238, 3, (byte) -12);
        setByteElement(term2238, 4, (byte) -61);
        setField(term2237, term2237.getClass(), "localFileData", term2238);
        setByteElement(term2244, 0, (byte) -85);
        setByteElement(term2244, 1, (byte) -22);
        setField(term2237, term2237.getClass(), "centralDirectoryData", term2244);
        setField(term2227, term2227.getClass(), "unparseableExtra", term2237);
        setField(term2227, term2227.getClass(), "name", "");
        setByteElement(term2249, 0, (byte) 93);
        setByteElement(term2249, 1, (byte) 69);
        setByteElement(term2249, 2, (byte) -74);
        setField(term2227, term2227.getClass(), "rawName", term2249);
        setBooleanField(term2253, term2253.getClass(), "languageEncodingFlag", false);
        setBooleanField(term2253, term2253.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term2253, term2253.getClass(), "encryptionFlag", false);
        setBooleanField(term2253, term2253.getClass(), "strongEncryptionFlag", false);
        setIntField(term2253, term2253.getClass(), "slidingDictionarySize", 0);
        setIntField(term2253, term2253.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term2227, term2227.getClass(), "gpb", term2253);
        setLongField(term2227, term2227.getClass(), "xdostime", -1L);
        setField(term2263, term2263.getClass(), "unit", enum8);
        setLongField(term2263, term2263.getClass(), "value", -4325723315152823407L);
        setLongField(term2289, term2289.getClass(), "seconds", 1500739068L);
        setIntField(term2289, term2289.getClass(), "nanos", 23000000);
        setField(term2263, term2263.getClass(), "instant", term2289);
        setField(term2263, term2263.getClass(), "valueAsString", "ZiaGIbnzTs");
        setField(term2227, term2227.getClass(), "mtime", term2263);
        setField(term2304, term2304.getClass(), "unit", enum8);
        setLongField(term2304, term2304.getClass(), "value", 2535595959091595249L);
        setLongField(term2306, term2306.getClass(), "seconds", 1797221628L);
        setIntField(term2306, term2306.getClass(), "nanos", 25000000);
        setField(term2304, term2304.getClass(), "instant", term2306);
        setField(term2304, term2304.getClass(), "valueAsString", "tbcdzjIfER");
        setField(term2227, term2227.getClass(), "atime", term2304);
        setField(term2321, term2321.getClass(), "unit", enum9);
        setLongField(term2321, term2321.getClass(), "value", -5476826692763582090L);
        setLongField(term2342, term2342.getClass(), "seconds", 1589475921L);
        setIntField(term2342, term2342.getClass(), "nanos", 30000000);
        setField(term2321, term2321.getClass(), "instant", term2342);
        setField(term2321, term2321.getClass(), "valueAsString", "HyxfbSQYBe");
        setField(term2227, term2227.getClass(), "ctime", term2321);
        setLongField(term2227, term2227.getClass(), "crc", -1L);
        setLongField(term2227, term2227.getClass(), "csize", -1L);
        setIntField(term2227, term2227.getClass(), "flag", 1135664017);
        setByteElement(term2362, 0, (byte) -123);
        setField(term2227, term2227.getClass(), "extra", term2362);
        setField(term2227, term2227.getClass(), "comment", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term2227, args);
    }

};


