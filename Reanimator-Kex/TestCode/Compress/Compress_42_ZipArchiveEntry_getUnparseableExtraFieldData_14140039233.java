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

public class ZipArchiveEntry_getUnparseableExtraFieldData_14140039233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20616;

    public ZipArchiveEntry_getUnparseableExtraFieldData_14140039233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20800 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20799 = ((Class) term20800).getDeclaredField((String) "NANOSECONDS");
        ((Field) term20799).setAccessible(true);
        Object enum78 = ((Field) term20799).get((Object) null);
        Class<? extends Object> term20995 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20994 = ((Class) term20995).getDeclaredField((String) "MILLISECONDS");
        ((Field) term20994).setAccessible(true);
        Object enum79 = ((Field) term20994).get((Object) null);
        Class<? extends Object> term21193 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term21192 = ((Class) term21193).getDeclaredField((String) "DAYS");
        ((Field) term21192).setAccessible(true);
        Object enum80 = ((Field) term21192).get((Object) null);
        term20616 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term20625 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
        Object term20626 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term20627 = (byte[]) newByteArray(2);
        byte[] term20630 = (byte[]) newByteArray(6);
        byte[] term20639 = (byte[]) newByteArray(1);
        Object term20641 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term20651 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20676 = newInstance(Class.forName("java.time.Instant"));
        Object term20691 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20717 = newInstance(Class.forName("java.time.Instant"));
        Object term20732 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20750 = newInstance(Class.forName("java.time.Instant"));
        byte[] term20770 = (byte[]) newByteArray(6);
        setIntField(term20616, term20616.getClass(), "method", -1);
        setLongField(term20616, term20616.getClass(), "size", -1L);
        setIntField(term20616, term20616.getClass(), "internalAttributes", 1959097203);
        setIntField(term20616, term20616.getClass(), "versionRequired", -209654048);
        setIntField(term20616, term20616.getClass(), "versionMadeBy", 477625804);
        setIntField(term20616, term20616.getClass(), "platform", 252575029);
        setIntField(term20616, term20616.getClass(), "rawFlag", 57189932);
        setLongField(term20616, term20616.getClass(), "externalAttributes", 5671808784468963649L);
        setField(term20616, term20616.getClass(), "extraFields", term20625);
        setByteElement(term20627, 0, (byte) -41);
        setByteElement(term20627, 1, (byte) -102);
        setField(term20626, term20626.getClass(), "localFileData", term20627);
        setByteElement(term20630, 0, (byte) -93);
        setByteElement(term20630, 1, (byte) 111);
        setByteElement(term20630, 2, (byte) -4);
        setByteElement(term20630, 3, (byte) -68);
        setByteElement(term20630, 4, (byte) -7);
        setByteElement(term20630, 5, (byte) -109);
        setField(term20626, term20626.getClass(), "centralDirectoryData", term20630);
        setField(term20616, term20616.getClass(), "unparseableExtra", term20626);
        setField(term20616, term20616.getClass(), "name", "");
        setByteElement(term20639, 0, (byte) 69);
        setField(term20616, term20616.getClass(), "rawName", term20639);
        setBooleanField(term20641, term20641.getClass(), "languageEncodingFlag", false);
        setBooleanField(term20641, term20641.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term20641, term20641.getClass(), "encryptionFlag", false);
        setBooleanField(term20641, term20641.getClass(), "strongEncryptionFlag", false);
        setIntField(term20641, term20641.getClass(), "slidingDictionarySize", 0);
        setIntField(term20641, term20641.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term20616, term20616.getClass(), "gpb", term20641);
        setLongField(term20616, term20616.getClass(), "xdostime", -1L);
        setField(term20651, term20651.getClass(), "unit", enum78);
        setLongField(term20651, term20651.getClass(), "value", 2297097306706899827L);
        setLongField(term20676, term20676.getClass(), "seconds", 1491199740L);
        setIntField(term20676, term20676.getClass(), "nanos", 539000000);
        setField(term20651, term20651.getClass(), "instant", term20676);
        setField(term20651, term20651.getClass(), "valueAsString", "AdxvLJhNLe");
        setField(term20616, term20616.getClass(), "mtime", term20651);
        setField(term20691, term20691.getClass(), "unit", enum79);
        setLongField(term20691, term20691.getClass(), "value", -900457279156388404L);
        setLongField(term20717, term20717.getClass(), "seconds", 1462014881L);
        setIntField(term20717, term20717.getClass(), "nanos", 310000000);
        setField(term20691, term20691.getClass(), "instant", term20717);
        setField(term20691, term20691.getClass(), "valueAsString", "lHfTrWKMPk");
        setField(term20616, term20616.getClass(), "atime", term20691);
        setField(term20732, term20732.getClass(), "unit", enum80);
        setLongField(term20732, term20732.getClass(), "value", 1084801489398441516L);
        setLongField(term20750, term20750.getClass(), "seconds", 1818986525L);
        setIntField(term20750, term20750.getClass(), "nanos", 805000000);
        setField(term20732, term20732.getClass(), "instant", term20750);
        setField(term20732, term20732.getClass(), "valueAsString", "JDaAnsVTGV");
        setField(term20616, term20616.getClass(), "ctime", term20732);
        setLongField(term20616, term20616.getClass(), "crc", -1L);
        setLongField(term20616, term20616.getClass(), "csize", -1L);
        setIntField(term20616, term20616.getClass(), "flag", 1460722225);
        setByteElement(term20770, 0, (byte) -50);
        setByteElement(term20770, 1, (byte) -103);
        setByteElement(term20770, 2, (byte) 122);
        setByteElement(term20770, 3, (byte) -75);
        setByteElement(term20770, 4, (byte) -72);
        setByteElement(term20770, 5, (byte) -19);
        setField(term20616, term20616.getClass(), "extra", term20770);
        setField(term20616, term20616.getClass(), "comment", "mLUZFTfjle");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnparseableExtraFieldData", argTypes, term20616, args);
    }

};


