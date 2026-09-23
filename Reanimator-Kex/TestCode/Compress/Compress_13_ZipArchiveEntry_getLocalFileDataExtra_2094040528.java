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

public class ZipArchiveEntry_getLocalFileDataExtra_2094040528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17396;

    public ZipArchiveEntry_getLocalFileDataExtra_2094040528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term17402 = new LinkedHashMap();
        Class<? extends Object> term17578 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term17577 = ((Class) term17578).getDeclaredField((String) "SECONDS");
        ((Field) term17577).setAccessible(true);
        Object enum65 = ((Field) term17577).get((Object) null);
        Class<? extends Object> term17761 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term17760 = ((Class) term17761).getDeclaredField((String) "DAYS");
        ((Field) term17760).setAccessible(true);
        Object enum66 = ((Field) term17760).get((Object) null);
        Class<? extends Object> term17935 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term17934 = ((Class) term17935).getDeclaredField((String) "HOURS");
        ((Field) term17934).setAccessible(true);
        Object enum67 = ((Field) term17934).get((Object) null);
        term17396 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term17413 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term17414 = (byte[]) newByteArray(4);
        byte[] term17419 = (byte[]) newByteArray(8);
        byte[] term17430 = (byte[]) newByteArray(0);
        Object term17431 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term17439 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17460 = newInstance(Class.forName("java.time.Instant"));
        Object term17475 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17493 = newInstance(Class.forName("java.time.Instant"));
        Object term17508 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17527 = newInstance(Class.forName("java.time.Instant"));
        byte[] term17547 = (byte[]) newByteArray(4);
        setIntField(term17396, term17396.getClass(), "method", -1);
        setLongField(term17396, term17396.getClass(), "size", -1L);
        setIntField(term17396, term17396.getClass(), "internalAttributes", 2098647989);
        setIntField(term17396, term17396.getClass(), "platform", 1598895173);
        setLongField(term17396, term17396.getClass(), "externalAttributes", -5216789073301458893L);
        setField(term17396, term17396.getClass(), "extraFields", term17402);
        setByteElement(term17414, 0, (byte) -33);
        setByteElement(term17414, 1, (byte) 1);
        setByteElement(term17414, 2, (byte) -88);
        setByteElement(term17414, 3, (byte) -53);
        setField(term17413, term17413.getClass(), "localFileData", term17414);
        setByteElement(term17419, 0, (byte) -120);
        setByteElement(term17419, 1, (byte) 94);
        setByteElement(term17419, 2, (byte) -76);
        setByteElement(term17419, 3, (byte) -122);
        setByteElement(term17419, 4, (byte) 43);
        setByteElement(term17419, 5, (byte) -31);
        setByteElement(term17419, 6, (byte) 95);
        setByteElement(term17419, 7, (byte) -33);
        setField(term17413, term17413.getClass(), "centralDirectoryData", term17419);
        setField(term17396, term17396.getClass(), "unparseableExtra", term17413);
        setField(term17396, term17396.getClass(), "name", "");
        setField(term17396, term17396.getClass(), "rawName", term17430);
        setBooleanField(term17431, term17431.getClass(), "languageEncodingFlag", false);
        setBooleanField(term17431, term17431.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term17431, term17431.getClass(), "encryptionFlag", false);
        setBooleanField(term17431, term17431.getClass(), "strongEncryptionFlag", false);
        setField(term17396, term17396.getClass(), "gpb", term17431);
        setLongField(term17396, term17396.getClass(), "xdostime", -1L);
        setField(term17439, term17439.getClass(), "unit", enum65);
        setLongField(term17439, term17439.getClass(), "value", -1832940336320585644L);
        setLongField(term17460, term17460.getClass(), "seconds", 1643999113L);
        setIntField(term17460, term17460.getClass(), "nanos", 575000000);
        setField(term17439, term17439.getClass(), "instant", term17460);
        setField(term17439, term17439.getClass(), "valueAsString", "QXzGXbEXMu");
        setField(term17396, term17396.getClass(), "mtime", term17439);
        setField(term17475, term17475.getClass(), "unit", enum66);
        setLongField(term17475, term17475.getClass(), "value", -8033714905181142681L);
        setLongField(term17493, term17493.getClass(), "seconds", 1689446810L);
        setIntField(term17493, term17493.getClass(), "nanos", 999000000);
        setField(term17475, term17475.getClass(), "instant", term17493);
        setField(term17475, term17475.getClass(), "valueAsString", "qxSDVejjiY");
        setField(term17396, term17396.getClass(), "atime", term17475);
        setField(term17508, term17508.getClass(), "unit", enum67);
        setLongField(term17508, term17508.getClass(), "value", -9040825890007374809L);
        setLongField(term17527, term17527.getClass(), "seconds", 1570732321L);
        setIntField(term17527, term17527.getClass(), "nanos", 79000000);
        setField(term17508, term17508.getClass(), "instant", term17527);
        setField(term17508, term17508.getClass(), "valueAsString", "xBsXSDjXYK");
        setField(term17396, term17396.getClass(), "ctime", term17508);
        setLongField(term17396, term17396.getClass(), "crc", -1L);
        setLongField(term17396, term17396.getClass(), "csize", -1L);
        setIntField(term17396, term17396.getClass(), "flag", -227365013);
        setByteElement(term17547, 0, (byte) 21);
        setByteElement(term17547, 1, (byte) -8);
        setByteElement(term17547, 2, (byte) -85);
        setByteElement(term17547, 3, (byte) -77);
        setField(term17396, term17396.getClass(), "extra", term17547);
        setField(term17396, term17396.getClass(), "comment", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocalFileDataExtra", argTypes, term17396, args);
    }

};


