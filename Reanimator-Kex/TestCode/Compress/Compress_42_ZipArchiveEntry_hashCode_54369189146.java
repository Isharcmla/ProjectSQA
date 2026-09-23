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

public class ZipArchiveEntry_hashCode_54369189146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29845;

    public ZipArchiveEntry_hashCode_54369189146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30043 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term30042 = ((Class) term30043).getDeclaredField((String) "SECONDS");
        ((Field) term30042).setAccessible(true);
        Object enum113 = ((Field) term30042).get((Object) null);
        Class<? extends Object> term30226 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term30225 = ((Class) term30226).getDeclaredField((String) "MINUTES");
        ((Field) term30225).setAccessible(true);
        Object enum114 = ((Field) term30225).get((Object) null);
        Class<? extends Object> term30409 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term30408 = ((Class) term30409).getDeclaredField((String) "DAYS");
        ((Field) term30408).setAccessible(true);
        Object enum115 = ((Field) term30408).get((Object) null);
        term29845 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term29854 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 0);
        Object term29855 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term29856 = (byte[]) newByteArray(9);
        byte[] term29866 = (byte[]) newByteArray(2);
        byte[] term29871 = (byte[]) newByteArray(9);
        Object term29881 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term29891 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term29912 = newInstance(Class.forName("java.time.Instant"));
        Object term29927 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term29948 = newInstance(Class.forName("java.time.Instant"));
        Object term29963 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term29981 = newInstance(Class.forName("java.time.Instant"));
        byte[] term30001 = (byte[]) newByteArray(7);
        setIntField(term29845, term29845.getClass(), "method", -1);
        setLongField(term29845, term29845.getClass(), "size", -1L);
        setIntField(term29845, term29845.getClass(), "internalAttributes", -288604325);
        setIntField(term29845, term29845.getClass(), "versionRequired", -1268314569);
        setIntField(term29845, term29845.getClass(), "versionMadeBy", 877649659);
        setIntField(term29845, term29845.getClass(), "platform", -1332748804);
        setIntField(term29845, term29845.getClass(), "rawFlag", 1774507971);
        setLongField(term29845, term29845.getClass(), "externalAttributes", -8614778293741404325L);
        setField(term29845, term29845.getClass(), "extraFields", term29854);
        setByteElement(term29856, 1, (byte) -99);
        setByteElement(term29856, 2, (byte) 36);
        setByteElement(term29856, 3, (byte) 46);
        setByteElement(term29856, 4, (byte) -104);
        setByteElement(term29856, 5, (byte) -70);
        setByteElement(term29856, 6, (byte) -124);
        setByteElement(term29856, 7, (byte) 82);
        setByteElement(term29856, 8, (byte) 37);
        setField(term29855, term29855.getClass(), "localFileData", term29856);
        setByteElement(term29866, 0, (byte) -10);
        setByteElement(term29866, 1, (byte) 100);
        setField(term29855, term29855.getClass(), "centralDirectoryData", term29866);
        setField(term29845, term29845.getClass(), "unparseableExtra", term29855);
        setField(term29845, term29845.getClass(), "name", "");
        setByteElement(term29871, 0, (byte) 90);
        setByteElement(term29871, 1, (byte) -76);
        setByteElement(term29871, 2, (byte) 72);
        setByteElement(term29871, 3, (byte) -111);
        setByteElement(term29871, 4, (byte) 3);
        setByteElement(term29871, 5, (byte) 85);
        setByteElement(term29871, 6, (byte) 31);
        setByteElement(term29871, 7, (byte) 71);
        setByteElement(term29871, 8, (byte) -95);
        setField(term29845, term29845.getClass(), "rawName", term29871);
        setBooleanField(term29881, term29881.getClass(), "languageEncodingFlag", false);
        setBooleanField(term29881, term29881.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term29881, term29881.getClass(), "encryptionFlag", false);
        setBooleanField(term29881, term29881.getClass(), "strongEncryptionFlag", false);
        setIntField(term29881, term29881.getClass(), "slidingDictionarySize", 0);
        setIntField(term29881, term29881.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term29845, term29845.getClass(), "gpb", term29881);
        setLongField(term29845, term29845.getClass(), "xdostime", -1L);
        setField(term29891, term29891.getClass(), "unit", enum113);
        setLongField(term29891, term29891.getClass(), "value", -5447369594017685765L);
        setLongField(term29912, term29912.getClass(), "seconds", 1673393951L);
        setIntField(term29912, term29912.getClass(), "nanos", 909000000);
        setField(term29891, term29891.getClass(), "instant", term29912);
        setField(term29891, term29891.getClass(), "valueAsString", "jXzmYyrnnT");
        setField(term29845, term29845.getClass(), "mtime", term29891);
        setField(term29927, term29927.getClass(), "unit", enum114);
        setLongField(term29927, term29927.getClass(), "value", -5724112525188606013L);
        setLongField(term29948, term29948.getClass(), "seconds", 1816297347L);
        setIntField(term29948, term29948.getClass(), "nanos", 222000000);
        setField(term29927, term29927.getClass(), "instant", term29948);
        setField(term29927, term29927.getClass(), "valueAsString", "igCAtimmYB");
        setField(term29845, term29845.getClass(), "atime", term29927);
        setField(term29963, term29963.getClass(), "unit", enum115);
        setLongField(term29963, term29963.getClass(), "value", -6100012593724108983L);
        setLongField(term29981, term29981.getClass(), "seconds", 1267398225L);
        setIntField(term29981, term29981.getClass(), "nanos", 974000000);
        setField(term29963, term29963.getClass(), "instant", term29981);
        setField(term29963, term29963.getClass(), "valueAsString", "DyiXbeYIaN");
        setField(term29845, term29845.getClass(), "ctime", term29963);
        setLongField(term29845, term29845.getClass(), "crc", -1L);
        setLongField(term29845, term29845.getClass(), "csize", -1L);
        setIntField(term29845, term29845.getClass(), "flag", -1420269858);
        setByteElement(term30001, 0, (byte) 1);
        setByteElement(term30001, 1, (byte) 112);
        setByteElement(term30001, 2, (byte) -79);
        setByteElement(term30001, 3, (byte) 83);
        setByteElement(term30001, 4, (byte) -72);
        setByteElement(term30001, 5, (byte) 18);
        setByteElement(term30001, 6, (byte) -80);
        setField(term29845, term29845.getClass(), "extra", term30001);
        setField(term29845, term29845.getClass(), "comment", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term29845, args);
    }

};


