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

public class ZipArchiveEntry_getExternalAttributes_210188321610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5085;

    public ZipArchiveEntry_getExternalAttributes_210188321610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5091 = new LinkedHashMap();
        Class<? extends Object> term5282 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5281 = ((Class) term5282).getDeclaredField((String) "HOURS");
        ((Field) term5281).setAccessible(true);
        Object enum19 = ((Field) term5281).get((Object) null);
        Class<? extends Object> term5459 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5458 = ((Class) term5459).getDeclaredField((String) "MILLISECONDS");
        ((Field) term5458).setAccessible(true);
        Object enum20 = ((Field) term5458).get((Object) null);
        Class<? extends Object> term5657 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5656 = ((Class) term5657).getDeclaredField((String) "SECONDS");
        ((Field) term5656).setAccessible(true);
        Object enum21 = ((Field) term5656).get((Object) null);
        term5085 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term5102 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term5103 = (byte[]) newByteArray(6);
        byte[] term5110 = (byte[]) newByteArray(5);
        byte[] term5118 = (byte[]) newByteArray(3);
        Object term5122 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term5130 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5149 = newInstance(Class.forName("java.time.Instant"));
        Object term5164 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5190 = newInstance(Class.forName("java.time.Instant"));
        Object term5205 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5226 = newInstance(Class.forName("java.time.Instant"));
        byte[] term5246 = (byte[]) newByteArray(7);
        setIntField(term5085, term5085.getClass(), "method", -1);
        setLongField(term5085, term5085.getClass(), "size", -1L);
        setIntField(term5085, term5085.getClass(), "internalAttributes", -602026508);
        setIntField(term5085, term5085.getClass(), "platform", -157887805);
        setLongField(term5085, term5085.getClass(), "externalAttributes", -4502405999831680926L);
        setField(term5085, term5085.getClass(), "extraFields", term5091);
        setByteElement(term5103, 0, (byte) 33);
        setByteElement(term5103, 1, (byte) -74);
        setByteElement(term5103, 2, (byte) -84);
        setByteElement(term5103, 3, (byte) -53);
        setByteElement(term5103, 4, (byte) -93);
        setByteElement(term5103, 5, (byte) 82);
        setField(term5102, term5102.getClass(), "localFileData", term5103);
        setByteElement(term5110, 0, (byte) -89);
        setByteElement(term5110, 1, (byte) 24);
        setByteElement(term5110, 2, (byte) 123);
        setByteElement(term5110, 3, (byte) -101);
        setByteElement(term5110, 4, (byte) -102);
        setField(term5102, term5102.getClass(), "centralDirectoryData", term5110);
        setField(term5085, term5085.getClass(), "unparseableExtra", term5102);
        setField(term5085, term5085.getClass(), "name", "");
        setByteElement(term5118, 0, (byte) -95);
        setByteElement(term5118, 1, (byte) -2);
        setByteElement(term5118, 2, (byte) 28);
        setField(term5085, term5085.getClass(), "rawName", term5118);
        setBooleanField(term5122, term5122.getClass(), "languageEncodingFlag", false);
        setBooleanField(term5122, term5122.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term5122, term5122.getClass(), "encryptionFlag", false);
        setBooleanField(term5122, term5122.getClass(), "strongEncryptionFlag", false);
        setField(term5085, term5085.getClass(), "gpb", term5122);
        setLongField(term5085, term5085.getClass(), "xdostime", -1L);
        setField(term5130, term5130.getClass(), "unit", enum19);
        setLongField(term5130, term5130.getClass(), "value", 1967728129628047933L);
        setLongField(term5149, term5149.getClass(), "seconds", 1805016087L);
        setIntField(term5149, term5149.getClass(), "nanos", 131000000);
        setField(term5130, term5130.getClass(), "instant", term5149);
        setField(term5130, term5130.getClass(), "valueAsString", "AijpHYOFuy");
        setField(term5085, term5085.getClass(), "mtime", term5130);
        setField(term5164, term5164.getClass(), "unit", enum20);
        setLongField(term5164, term5164.getClass(), "value", 2120084523938730454L);
        setLongField(term5190, term5190.getClass(), "seconds", 1538096916L);
        setIntField(term5190, term5190.getClass(), "nanos", 394000000);
        setField(term5164, term5164.getClass(), "instant", term5190);
        setField(term5164, term5164.getClass(), "valueAsString", "SbAoxhfrkn");
        setField(term5085, term5085.getClass(), "atime", term5164);
        setField(term5205, term5205.getClass(), "unit", enum21);
        setLongField(term5205, term5205.getClass(), "value", 6855071767938501807L);
        setLongField(term5226, term5226.getClass(), "seconds", 1744108065L);
        setIntField(term5226, term5226.getClass(), "nanos", 937000000);
        setField(term5205, term5205.getClass(), "instant", term5226);
        setField(term5205, term5205.getClass(), "valueAsString", "kuTXqwMtDB");
        setField(term5085, term5085.getClass(), "ctime", term5205);
        setLongField(term5085, term5085.getClass(), "crc", -1L);
        setLongField(term5085, term5085.getClass(), "csize", -1L);
        setIntField(term5085, term5085.getClass(), "flag", -817164822);
        setByteElement(term5246, 0, (byte) 84);
        setByteElement(term5246, 1, (byte) 85);
        setByteElement(term5246, 2, (byte) -17);
        setByteElement(term5246, 3, (byte) -83);
        setByteElement(term5246, 4, (byte) 48);
        setByteElement(term5246, 5, (byte) -128);
        setByteElement(term5246, 6, (byte) 70);
        setField(term5085, term5085.getClass(), "extra", term5246);
        setField(term5085, term5085.getClass(), "comment", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalAttributes", argTypes, term5085, args);
    }

};


