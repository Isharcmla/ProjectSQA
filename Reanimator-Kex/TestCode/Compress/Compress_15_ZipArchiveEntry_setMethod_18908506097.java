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
import java.lang.Integer;

public class ZipArchiveEntry_setMethod_18908506097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2814;
     Object term2981;

    public ZipArchiveEntry_setMethod_18908506097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2820 = new LinkedHashMap();
        Class<? extends Object> term2990 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2989 = ((Class) term2990).getDeclaredField((String) "MICROSECONDS");
        ((Field) term2989).setAccessible(true);
        Object enum10 = ((Field) term2989).get((Object) null);
        Class<? extends Object> term3188 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3187 = ((Class) term3188).getDeclaredField((String) "MINUTES");
        ((Field) term3187).setAccessible(true);
        Object enum11 = ((Field) term3187).get((Object) null);
        Class<? extends Object> term3371 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3370 = ((Class) term3371).getDeclaredField((String) "HOURS");
        ((Field) term3370).setAccessible(true);
        Object enum12 = ((Field) term3370).get((Object) null);
        term2814 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term2831 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term2832 = (byte[]) newByteArray(2);
        byte[] term2835 = (byte[]) newByteArray(3);
        byte[] term2841 = (byte[]) newByteArray(1);
        Object term2843 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term2851 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2877 = newInstance(Class.forName("java.time.Instant"));
        Object term2892 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2913 = newInstance(Class.forName("java.time.Instant"));
        Object term2928 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2947 = newInstance(Class.forName("java.time.Instant"));
        byte[] term2967 = (byte[]) newByteArray(0);
        setIntField(term2814, term2814.getClass(), "method", -1);
        setLongField(term2814, term2814.getClass(), "size", -1L);
        setIntField(term2814, term2814.getClass(), "internalAttributes", -2068769794);
        setIntField(term2814, term2814.getClass(), "platform", -117576464);
        setLongField(term2814, term2814.getClass(), "externalAttributes", -872011222785455006L);
        setField(term2814, term2814.getClass(), "extraFields", term2820);
        setByteElement(term2832, 0, (byte) 98);
        setByteElement(term2832, 1, (byte) 79);
        setField(term2831, term2831.getClass(), "localFileData", term2832);
        setByteElement(term2835, 0, (byte) 61);
        setByteElement(term2835, 1, (byte) -92);
        setByteElement(term2835, 2, (byte) -42);
        setField(term2831, term2831.getClass(), "centralDirectoryData", term2835);
        setField(term2814, term2814.getClass(), "unparseableExtra", term2831);
        setField(term2814, term2814.getClass(), "name", "");
        setByteElement(term2841, 0, (byte) 116);
        setField(term2814, term2814.getClass(), "rawName", term2841);
        setBooleanField(term2843, term2843.getClass(), "languageEncodingFlag", false);
        setBooleanField(term2843, term2843.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term2843, term2843.getClass(), "encryptionFlag", false);
        setBooleanField(term2843, term2843.getClass(), "strongEncryptionFlag", false);
        setField(term2814, term2814.getClass(), "gpb", term2843);
        setLongField(term2814, term2814.getClass(), "xdostime", -1L);
        setField(term2851, term2851.getClass(), "unit", enum10);
        setLongField(term2851, term2851.getClass(), "value", -316468845751588286L);
        setLongField(term2877, term2877.getClass(), "seconds", 1745480962L);
        setIntField(term2877, term2877.getClass(), "nanos", 80000000);
        setField(term2851, term2851.getClass(), "instant", term2877);
        setField(term2851, term2851.getClass(), "valueAsString", "hNxWaHcfhY");
        setField(term2814, term2814.getClass(), "mtime", term2851);
        setField(term2892, term2892.getClass(), "unit", enum11);
        setLongField(term2892, term2892.getClass(), "value", 5127676408959197577L);
        setLongField(term2913, term2913.getClass(), "seconds", 1349087753L);
        setIntField(term2913, term2913.getClass(), "nanos", 960000000);
        setField(term2892, term2892.getClass(), "instant", term2913);
        setField(term2892, term2892.getClass(), "valueAsString", "RkybSrpybU");
        setField(term2814, term2814.getClass(), "atime", term2892);
        setField(term2928, term2928.getClass(), "unit", enum12);
        setLongField(term2928, term2928.getClass(), "value", -6573104506744284592L);
        setLongField(term2947, term2947.getClass(), "seconds", 1706096172L);
        setIntField(term2947, term2947.getClass(), "nanos", 457000000);
        setField(term2928, term2928.getClass(), "instant", term2947);
        setField(term2928, term2928.getClass(), "valueAsString", "xOEqzGAmDU");
        setField(term2814, term2814.getClass(), "ctime", term2928);
        setLongField(term2814, term2814.getClass(), "crc", -1L);
        setLongField(term2814, term2814.getClass(), "csize", -1L);
        setIntField(term2814, term2814.getClass(), "flag", 1135664017);
        setField(term2814, term2814.getClass(), "extra", term2967);
        setField(term2814, term2814.getClass(), "comment", "eZFUvlxvGV");
        term2981 = new Integer(865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2981;
        callMethod(klass, "setMethod", argTypes, term2814, args);
    }

};


