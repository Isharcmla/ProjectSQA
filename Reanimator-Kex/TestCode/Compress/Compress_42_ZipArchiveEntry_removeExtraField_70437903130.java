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

public class ZipArchiveEntry_removeExtraField_70437903130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18502;
     Object term18670;

    public ZipArchiveEntry_removeExtraField_70437903130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18680 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18679 = ((Class) term18680).getDeclaredField((String) "HOURS");
        ((Field) term18679).setAccessible(true);
        Object enum70 = ((Field) term18679).get((Object) null);
        Class<? extends Object> term18857 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18856 = ((Class) term18857).getDeclaredField((String) "MINUTES");
        ((Field) term18856).setAccessible(true);
        Object enum71 = ((Field) term18856).get((Object) null);
        Class<? extends Object> term19040 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19039 = ((Class) term19040).getDeclaredField((String) "MICROSECONDS");
        ((Field) term19039).setAccessible(true);
        Object enum72 = ((Field) term19039).get((Object) null);
        term18502 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term18511 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 9);
        Object term18512 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term18513 = (byte[]) newByteArray(2);
        byte[] term18516 = (byte[]) newByteArray(3);
        byte[] term18522 = (byte[]) newByteArray(2);
        Object term18525 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term18535 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18554 = newInstance(Class.forName("java.time.Instant"));
        Object term18569 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18590 = newInstance(Class.forName("java.time.Instant"));
        Object term18605 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18631 = newInstance(Class.forName("java.time.Instant"));
        byte[] term18651 = (byte[]) newByteArray(5);
        setIntField(term18502, term18502.getClass(), "method", -1);
        setLongField(term18502, term18502.getClass(), "size", -1L);
        setIntField(term18502, term18502.getClass(), "internalAttributes", -2131181468);
        setIntField(term18502, term18502.getClass(), "versionRequired", 282916351);
        setIntField(term18502, term18502.getClass(), "versionMadeBy", 880977281);
        setIntField(term18502, term18502.getClass(), "platform", 371943306);
        setIntField(term18502, term18502.getClass(), "rawFlag", 982388293);
        setLongField(term18502, term18502.getClass(), "externalAttributes", -3936701866695933852L);
        setField(term18502, term18502.getClass(), "extraFields", term18511);
        setByteElement(term18513, 0, (byte) 59);
        setByteElement(term18513, 1, (byte) -79);
        setField(term18512, term18512.getClass(), "localFileData", term18513);
        setByteElement(term18516, 0, (byte) -33);
        setByteElement(term18516, 1, (byte) 1);
        setByteElement(term18516, 2, (byte) -88);
        setField(term18512, term18512.getClass(), "centralDirectoryData", term18516);
        setField(term18502, term18502.getClass(), "unparseableExtra", term18512);
        setField(term18502, term18502.getClass(), "name", "");
        setByteElement(term18522, 0, (byte) -53);
        setByteElement(term18522, 1, (byte) -120);
        setField(term18502, term18502.getClass(), "rawName", term18522);
        setBooleanField(term18525, term18525.getClass(), "languageEncodingFlag", false);
        setBooleanField(term18525, term18525.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term18525, term18525.getClass(), "encryptionFlag", false);
        setBooleanField(term18525, term18525.getClass(), "strongEncryptionFlag", false);
        setIntField(term18525, term18525.getClass(), "slidingDictionarySize", 0);
        setIntField(term18525, term18525.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term18502, term18502.getClass(), "gpb", term18525);
        setLongField(term18502, term18502.getClass(), "xdostime", -1L);
        setField(term18535, term18535.getClass(), "unit", enum70);
        setLongField(term18535, term18535.getClass(), "value", 1215116475929634177L);
        setLongField(term18554, term18554.getClass(), "seconds", 1467801054L);
        setIntField(term18554, term18554.getClass(), "nanos", 847000000);
        setField(term18535, term18535.getClass(), "instant", term18554);
        setField(term18535, term18535.getClass(), "valueAsString", "OEXDRUKcFl");
        setField(term18502, term18502.getClass(), "mtime", term18535);
        setField(term18569, term18569.getClass(), "unit", enum71);
        setLongField(term18569, term18569.getClass(), "value", 1597484336218508869L);
        setLongField(term18590, term18590.getClass(), "seconds", 1825626844L);
        setIntField(term18590, term18590.getClass(), "nanos", 992000000);
        setField(term18569, term18569.getClass(), "instant", term18590);
        setField(term18569, term18569.getClass(), "valueAsString", "RYdKCNNMBR");
        setField(term18502, term18502.getClass(), "atime", term18569);
        setField(term18605, term18605.getClass(), "unit", enum72);
        setLongField(term18605, term18605.getClass(), "value", -685023850445639859L);
        setLongField(term18631, term18631.getClass(), "seconds", 1465800799L);
        setIntField(term18631, term18631.getClass(), "nanos", 700000000);
        setField(term18605, term18605.getClass(), "instant", term18631);
        setField(term18605, term18605.getClass(), "valueAsString", "yGtHPyvYiQ");
        setField(term18502, term18502.getClass(), "ctime", term18605);
        setLongField(term18502, term18502.getClass(), "crc", -1L);
        setLongField(term18502, term18502.getClass(), "csize", -1L);
        setIntField(term18502, term18502.getClass(), "flag", -159494544);
        setByteElement(term18651, 0, (byte) 94);
        setByteElement(term18651, 1, (byte) -76);
        setByteElement(term18651, 2, (byte) -122);
        setByteElement(term18651, 3, (byte) 43);
        setByteElement(term18651, 4, (byte) -31);
        setField(term18502, term18502.getClass(), "extra", term18651);
        setField(term18502, term18502.getClass(), "comment", "MvRIxilFMJ");
        term18670 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term18670, term18670.getClass(), "value", -1618206977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipShort");
        Object[] args = new Object[1];
        args[0] = term18670;
        callMethod(klass, "removeExtraField", argTypes, term18502, args);
    }

};


