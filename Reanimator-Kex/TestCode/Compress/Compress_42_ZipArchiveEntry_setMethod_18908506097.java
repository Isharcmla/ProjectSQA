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

public class ZipArchiveEntry_setMethod_18908506097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2789;
     Object term2963;

    public ZipArchiveEntry_setMethod_18908506097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2982 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2981 = ((Class) term2982).getDeclaredField((String) "MICROSECONDS");
        ((Field) term2981).setAccessible(true);
        Object enum10 = ((Field) term2981).get((Object) null);
        Class<? extends Object> term3180 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3179 = ((Class) term3180).getDeclaredField((String) "MINUTES");
        ((Field) term3179).setAccessible(true);
        Object enum11 = ((Field) term3179).get((Object) null);
        Class<? extends Object> term3363 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3362 = ((Class) term3363).getDeclaredField((String) "HOURS");
        ((Field) term3362).setAccessible(true);
        Object enum12 = ((Field) term3362).get((Object) null);
        term2789 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term2798 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 0);
        Object term2799 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term2800 = (byte[]) newByteArray(2);
        byte[] term2803 = (byte[]) newByteArray(8);
        byte[] term2814 = (byte[]) newByteArray(6);
        Object term2821 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term2831 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2857 = newInstance(Class.forName("java.time.Instant"));
        Object term2872 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2893 = newInstance(Class.forName("java.time.Instant"));
        Object term2908 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2927 = newInstance(Class.forName("java.time.Instant"));
        byte[] term2947 = (byte[]) newByteArray(2);
        setIntField(term2789, term2789.getClass(), "method", -1);
        setLongField(term2789, term2789.getClass(), "size", -1L);
        setIntField(term2789, term2789.getClass(), "internalAttributes", -1275173084);
        setIntField(term2789, term2789.getClass(), "versionRequired", -244121226);
        setIntField(term2789, term2789.getClass(), "versionMadeBy", -203030934);
        setIntField(term2789, term2789.getClass(), "platform", -1179120542);
        setIntField(term2789, term2789.getClass(), "rawFlag", -73683645);
        setLongField(term2789, term2789.getClass(), "externalAttributes", -872011222785455006L);
        setField(term2789, term2789.getClass(), "extraFields", term2798);
        setByteElement(term2800, 0, (byte) -23);
        setByteElement(term2800, 1, (byte) 100);
        setField(term2799, term2799.getClass(), "localFileData", term2800);
        setByteElement(term2803, 0, (byte) 106);
        setByteElement(term2803, 1, (byte) -57);
        setByteElement(term2803, 2, (byte) -103);
        setByteElement(term2803, 3, (byte) 98);
        setByteElement(term2803, 4, (byte) 79);
        setByteElement(term2803, 5, (byte) 61);
        setByteElement(term2803, 6, (byte) -92);
        setByteElement(term2803, 7, (byte) -42);
        setField(term2799, term2799.getClass(), "centralDirectoryData", term2803);
        setField(term2789, term2789.getClass(), "unparseableExtra", term2799);
        setField(term2789, term2789.getClass(), "name", "");
        setByteElement(term2814, 0, (byte) 116);
        setByteElement(term2814, 1, (byte) -81);
        setByteElement(term2814, 2, (byte) 102);
        setByteElement(term2814, 3, (byte) -118);
        setByteElement(term2814, 4, (byte) -126);
        setByteElement(term2814, 5, (byte) -91);
        setField(term2789, term2789.getClass(), "rawName", term2814);
        setBooleanField(term2821, term2821.getClass(), "languageEncodingFlag", false);
        setBooleanField(term2821, term2821.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term2821, term2821.getClass(), "encryptionFlag", false);
        setBooleanField(term2821, term2821.getClass(), "strongEncryptionFlag", false);
        setIntField(term2821, term2821.getClass(), "slidingDictionarySize", 0);
        setIntField(term2821, term2821.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term2789, term2789.getClass(), "gpb", term2821);
        setLongField(term2789, term2789.getClass(), "xdostime", -1L);
        setField(term2831, term2831.getClass(), "unit", enum10);
        setLongField(term2831, term2831.getClass(), "value", -316468845751588286L);
        setLongField(term2857, term2857.getClass(), "seconds", 1745480962L);
        setIntField(term2857, term2857.getClass(), "nanos", 80000000);
        setField(term2831, term2831.getClass(), "instant", term2857);
        setField(term2831, term2831.getClass(), "valueAsString", "hNxWaHcfhY");
        setField(term2789, term2789.getClass(), "mtime", term2831);
        setField(term2872, term2872.getClass(), "unit", enum11);
        setLongField(term2872, term2872.getClass(), "value", 5127676408959197577L);
        setLongField(term2893, term2893.getClass(), "seconds", 1349087753L);
        setIntField(term2893, term2893.getClass(), "nanos", 960000000);
        setField(term2872, term2872.getClass(), "instant", term2893);
        setField(term2872, term2872.getClass(), "valueAsString", "RkybSrpybU");
        setField(term2789, term2789.getClass(), "atime", term2872);
        setField(term2908, term2908.getClass(), "unit", enum12);
        setLongField(term2908, term2908.getClass(), "value", -6573104506744284592L);
        setLongField(term2927, term2927.getClass(), "seconds", 1706096172L);
        setIntField(term2927, term2927.getClass(), "nanos", 457000000);
        setField(term2908, term2908.getClass(), "instant", term2927);
        setField(term2908, term2908.getClass(), "valueAsString", "xOEqzGAmDU");
        setField(term2789, term2789.getClass(), "ctime", term2908);
        setLongField(term2789, term2789.getClass(), "crc", -1L);
        setLongField(term2789, term2789.getClass(), "csize", -1L);
        setIntField(term2789, term2789.getClass(), "flag", -226514366);
        setByteElement(term2947, 0, (byte) -104);
        setByteElement(term2947, 1, (byte) -89);
        setField(term2789, term2789.getClass(), "extra", term2947);
        setField(term2789, term2789.getClass(), "comment", "eZFUvlxvGV");
        term2963 = new Integer(-1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2963;
        callMethod(klass, "setMethod", argTypes, term2789, args);
    }

};


