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

public class ZipArchiveEntry_getExternalAttributes_210188321610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5079;

    public ZipArchiveEntry_getExternalAttributes_210188321610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5261 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5260 = ((Class) term5261).getDeclaredField((String) "HOURS");
        ((Field) term5260).setAccessible(true);
        Object enum19 = ((Field) term5260).get((Object) null);
        Class<? extends Object> term5438 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5437 = ((Class) term5438).getDeclaredField((String) "MILLISECONDS");
        ((Field) term5437).setAccessible(true);
        Object enum20 = ((Field) term5437).get((Object) null);
        Class<? extends Object> term5636 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5635 = ((Class) term5636).getDeclaredField((String) "SECONDS");
        ((Field) term5635).setAccessible(true);
        Object enum21 = ((Field) term5635).get((Object) null);
        term5079 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term5088 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 6);
        Object term5089 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term5090 = (byte[]) newByteArray(2);
        byte[] term5093 = (byte[]) newByteArray(5);
        byte[] term5101 = (byte[]) newByteArray(3);
        Object term5105 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term5115 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5134 = newInstance(Class.forName("java.time.Instant"));
        Object term5149 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5175 = newInstance(Class.forName("java.time.Instant"));
        Object term5190 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5211 = newInstance(Class.forName("java.time.Instant"));
        byte[] term5231 = (byte[]) newByteArray(5);
        setIntField(term5079, term5079.getClass(), "method", -1);
        setLongField(term5079, term5079.getClass(), "size", -1L);
        setIntField(term5079, term5079.getClass(), "internalAttributes", -1048298087);
        setIntField(term5079, term5079.getClass(), "versionRequired", 292681826);
        setIntField(term5079, term5079.getClass(), "versionMadeBy", 458147407);
        setIntField(term5079, term5079.getClass(), "platform", -184153539);
        setIntField(term5079, term5079.getClass(), "rawFlag", 493620644);
        setLongField(term5079, term5079.getClass(), "externalAttributes", -4502405999831680926L);
        setField(term5079, term5079.getClass(), "extraFields", term5088);
        setByteElement(term5090, 0, (byte) -2);
        setByteElement(term5090, 1, (byte) 28);
        setField(term5089, term5089.getClass(), "localFileData", term5090);
        setByteElement(term5093, 0, (byte) 84);
        setByteElement(term5093, 1, (byte) 85);
        setByteElement(term5093, 2, (byte) -17);
        setByteElement(term5093, 3, (byte) -83);
        setByteElement(term5093, 4, (byte) 48);
        setField(term5089, term5089.getClass(), "centralDirectoryData", term5093);
        setField(term5079, term5079.getClass(), "unparseableExtra", term5089);
        setField(term5079, term5079.getClass(), "name", "");
        setByteElement(term5101, 0, (byte) -128);
        setByteElement(term5101, 1, (byte) 70);
        setByteElement(term5101, 2, (byte) -28);
        setField(term5079, term5079.getClass(), "rawName", term5101);
        setBooleanField(term5105, term5105.getClass(), "languageEncodingFlag", false);
        setBooleanField(term5105, term5105.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term5105, term5105.getClass(), "encryptionFlag", false);
        setBooleanField(term5105, term5105.getClass(), "strongEncryptionFlag", false);
        setIntField(term5105, term5105.getClass(), "slidingDictionarySize", 0);
        setIntField(term5105, term5105.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term5079, term5079.getClass(), "gpb", term5105);
        setLongField(term5079, term5079.getClass(), "xdostime", -1L);
        setField(term5115, term5115.getClass(), "unit", enum19);
        setLongField(term5115, term5115.getClass(), "value", 1967728129628047933L);
        setLongField(term5134, term5134.getClass(), "seconds", 1805016087L);
        setIntField(term5134, term5134.getClass(), "nanos", 131000000);
        setField(term5115, term5115.getClass(), "instant", term5134);
        setField(term5115, term5115.getClass(), "valueAsString", "AijpHYOFuy");
        setField(term5079, term5079.getClass(), "mtime", term5115);
        setField(term5149, term5149.getClass(), "unit", enum20);
        setLongField(term5149, term5149.getClass(), "value", 2120084523938730454L);
        setLongField(term5175, term5175.getClass(), "seconds", 1538096916L);
        setIntField(term5175, term5175.getClass(), "nanos", 394000000);
        setField(term5149, term5149.getClass(), "instant", term5175);
        setField(term5149, term5149.getClass(), "valueAsString", "SbAoxhfrkn");
        setField(term5079, term5079.getClass(), "atime", term5149);
        setField(term5190, term5190.getClass(), "unit", enum21);
        setLongField(term5190, term5190.getClass(), "value", 6855071767938501807L);
        setLongField(term5211, term5211.getClass(), "seconds", 1744108065L);
        setIntField(term5211, term5211.getClass(), "nanos", 937000000);
        setField(term5190, term5190.getClass(), "instant", term5211);
        setField(term5190, term5190.getClass(), "valueAsString", "kuTXqwMtDB");
        setField(term5079, term5079.getClass(), "ctime", term5190);
        setLongField(term5079, term5079.getClass(), "crc", -1L);
        setLongField(term5079, term5079.getClass(), "csize", -1L);
        setIntField(term5079, term5079.getClass(), "flag", 1328271830);
        setByteElement(term5231, 0, (byte) 115);
        setByteElement(term5231, 1, (byte) 96);
        setByteElement(term5231, 2, (byte) 51);
        setByteElement(term5231, 3, (byte) -53);
        setByteElement(term5231, 4, (byte) -8);
        setField(term5079, term5079.getClass(), "extra", term5231);
        setField(term5079, term5079.getClass(), "comment", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalAttributes", argTypes, term5079, args);
    }

};


