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

public class ZipArchiveEntry_getExtraFields_88501410017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10081;

    public ZipArchiveEntry_getExtraFields_88501410017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10087 = new LinkedHashMap();
        Class<? extends Object> term10236 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term10235 = ((Class) term10236).getDeclaredField((String) "DAYS");
        ((Field) term10235).setAccessible(true);
        Object enum38 = ((Field) term10235).get((Object) null);
        Class<? extends Object> term10420 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term10419 = ((Class) term10420).getDeclaredField((String) "HOURS");
        ((Field) term10419).setAccessible(true);
        Object enum39 = ((Field) term10419).get((Object) null);
        term10081 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term10098 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term10099 = (byte[]) newByteArray(0);
        byte[] term10100 = (byte[]) newByteArray(2);
        byte[] term10105 = (byte[]) newByteArray(7);
        Object term10113 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term10121 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10139 = newInstance(Class.forName("java.time.Instant"));
        Object term10154 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10156 = newInstance(Class.forName("java.time.Instant"));
        Object term10171 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10190 = newInstance(Class.forName("java.time.Instant"));
        byte[] term10210 = (byte[]) newByteArray(2);
        setIntField(term10081, term10081.getClass(), "method", -1);
        setLongField(term10081, term10081.getClass(), "size", -1L);
        setIntField(term10081, term10081.getClass(), "internalAttributes", -1547384488);
        setIntField(term10081, term10081.getClass(), "platform", 1442160736);
        setLongField(term10081, term10081.getClass(), "externalAttributes", -7738503207562305297L);
        setField(term10081, term10081.getClass(), "extraFields", term10087);
        setField(term10098, term10098.getClass(), "localFileData", term10099);
        setByteElement(term10100, 0, (byte) -85);
        setByteElement(term10100, 1, (byte) 81);
        setField(term10098, term10098.getClass(), "centralDirectoryData", term10100);
        setField(term10081, term10081.getClass(), "unparseableExtra", term10098);
        setField(term10081, term10081.getClass(), "name", "");
        setByteElement(term10105, 0, (byte) -113);
        setByteElement(term10105, 1, (byte) 90);
        setByteElement(term10105, 2, (byte) 10);
        setByteElement(term10105, 3, (byte) 87);
        setByteElement(term10105, 4, (byte) -35);
        setByteElement(term10105, 5, (byte) -14);
        setByteElement(term10105, 6, (byte) 10);
        setField(term10081, term10081.getClass(), "rawName", term10105);
        setBooleanField(term10113, term10113.getClass(), "languageEncodingFlag", false);
        setBooleanField(term10113, term10113.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term10113, term10113.getClass(), "encryptionFlag", false);
        setBooleanField(term10113, term10113.getClass(), "strongEncryptionFlag", false);
        setField(term10081, term10081.getClass(), "gpb", term10113);
        setLongField(term10081, term10081.getClass(), "xdostime", -1L);
        setField(term10121, term10121.getClass(), "unit", enum38);
        setLongField(term10121, term10121.getClass(), "value", 3825396310311739952L);
        setLongField(term10139, term10139.getClass(), "seconds", 1678195615L);
        setIntField(term10139, term10139.getClass(), "nanos", 298000000);
        setField(term10121, term10121.getClass(), "instant", term10139);
        setField(term10121, term10121.getClass(), "valueAsString", "ieCtQFdkii");
        setField(term10081, term10081.getClass(), "mtime", term10121);
        setField(term10154, term10154.getClass(), "unit", enum38);
        setLongField(term10154, term10154.getClass(), "value", -3838084482494604218L);
        setLongField(term10156, term10156.getClass(), "seconds", 1666094287L);
        setIntField(term10156, term10156.getClass(), "nanos", 186000000);
        setField(term10154, term10154.getClass(), "instant", term10156);
        setField(term10154, term10154.getClass(), "valueAsString", "dEnhdmILtU");
        setField(term10081, term10081.getClass(), "atime", term10154);
        setField(term10171, term10171.getClass(), "unit", enum39);
        setLongField(term10171, term10171.getClass(), "value", 3892018155439224435L);
        setLongField(term10190, term10190.getClass(), "seconds", 1426036874L);
        setIntField(term10190, term10190.getClass(), "nanos", 434000000);
        setField(term10171, term10171.getClass(), "instant", term10190);
        setField(term10171, term10171.getClass(), "valueAsString", "hoicvmsovO");
        setField(term10081, term10081.getClass(), "ctime", term10171);
        setLongField(term10081, term10081.getClass(), "crc", -1L);
        setLongField(term10081, term10081.getClass(), "csize", -1L);
        setIntField(term10081, term10081.getClass(), "flag", -556405712);
        setByteElement(term10210, 0, (byte) 65);
        setByteElement(term10210, 1, (byte) -44);
        setField(term10081, term10081.getClass(), "extra", term10210);
        setField(term10081, term10081.getClass(), "comment", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtraFields", argTypes, term10081, args);
    }

};


