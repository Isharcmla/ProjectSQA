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

public class ZipArchiveEntry_setPlatform_149379641315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8504;
     Object term8695;

    public ZipArchiveEntry_setPlatform_149379641315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term8510 = new LinkedHashMap();
        Class<? extends Object> term8715 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8714 = ((Class) term8715).getDeclaredField((String) "NANOSECONDS");
        ((Field) term8714).setAccessible(true);
        Object enum32 = ((Field) term8714).get((Object) null);
        Class<? extends Object> term8910 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8909 = ((Class) term8910).getDeclaredField((String) "HOURS");
        ((Field) term8909).setAccessible(true);
        Object enum33 = ((Field) term8909).get((Object) null);
        Class<? extends Object> term9087 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9086 = ((Class) term9087).getDeclaredField((String) "MILLISECONDS");
        ((Field) term9086).setAccessible(true);
        Object enum34 = ((Field) term9086).get((Object) null);
        term8504 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term8521 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term8522 = (byte[]) newByteArray(3);
        byte[] term8526 = (byte[]) newByteArray(6);
        byte[] term8535 = (byte[]) newByteArray(8);
        Object term8544 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term8552 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8577 = newInstance(Class.forName("java.time.Instant"));
        Object term8592 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8611 = newInstance(Class.forName("java.time.Instant"));
        Object term8626 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8652 = newInstance(Class.forName("java.time.Instant"));
        byte[] term8672 = (byte[]) newByteArray(9);
        setIntField(term8504, term8504.getClass(), "method", -1);
        setLongField(term8504, term8504.getClass(), "size", -1L);
        setIntField(term8504, term8504.getClass(), "internalAttributes", 1265463001);
        setIntField(term8504, term8504.getClass(), "platform", 335112684);
        setLongField(term8504, term8504.getClass(), "externalAttributes", -4443169559037975007L);
        setField(term8504, term8504.getClass(), "extraFields", term8510);
        setByteElement(term8522, 0, (byte) 58);
        setByteElement(term8522, 1, (byte) 12);
        setByteElement(term8522, 2, (byte) 79);
        setField(term8521, term8521.getClass(), "localFileData", term8522);
        setByteElement(term8526, 0, (byte) -4);
        setByteElement(term8526, 1, (byte) -27);
        setByteElement(term8526, 2, (byte) 120);
        setByteElement(term8526, 3, (byte) -25);
        setByteElement(term8526, 4, (byte) 114);
        setByteElement(term8526, 5, (byte) 105);
        setField(term8521, term8521.getClass(), "centralDirectoryData", term8526);
        setField(term8504, term8504.getClass(), "unparseableExtra", term8521);
        setField(term8504, term8504.getClass(), "name", "");
        setByteElement(term8535, 0, (byte) -95);
        setByteElement(term8535, 1, (byte) -6);
        setByteElement(term8535, 2, (byte) 51);
        setByteElement(term8535, 3, (byte) 122);
        setByteElement(term8535, 4, (byte) 84);
        setByteElement(term8535, 5, (byte) -36);
        setByteElement(term8535, 6, (byte) 103);
        setByteElement(term8535, 7, (byte) -63);
        setField(term8504, term8504.getClass(), "rawName", term8535);
        setBooleanField(term8544, term8544.getClass(), "languageEncodingFlag", false);
        setBooleanField(term8544, term8544.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term8544, term8544.getClass(), "encryptionFlag", false);
        setBooleanField(term8544, term8544.getClass(), "strongEncryptionFlag", false);
        setField(term8504, term8504.getClass(), "gpb", term8544);
        setLongField(term8504, term8504.getClass(), "xdostime", -1L);
        setField(term8552, term8552.getClass(), "unit", enum32);
        setLongField(term8552, term8552.getClass(), "value", -3842548265506930260L);
        setLongField(term8577, term8577.getClass(), "seconds", 1488743902L);
        setIntField(term8577, term8577.getClass(), "nanos", 101000000);
        setField(term8552, term8552.getClass(), "instant", term8577);
        setField(term8552, term8552.getClass(), "valueAsString", "UoYtihxVaS");
        setField(term8504, term8504.getClass(), "mtime", term8552);
        setField(term8592, term8592.getClass(), "unit", enum33);
        setLongField(term8592, term8592.getClass(), "value", -5788180182343976541L);
        setLongField(term8611, term8611.getClass(), "seconds", 1311578117L);
        setIntField(term8611, term8611.getClass(), "nanos", 361000000);
        setField(term8592, term8592.getClass(), "instant", term8611);
        setField(term8592, term8592.getClass(), "valueAsString", "JDswTTCZHV");
        setField(term8504, term8504.getClass(), "atime", term8592);
        setField(term8626, term8626.getClass(), "unit", enum34);
        setLongField(term8626, term8626.getClass(), "value", 2936323121573284007L);
        setLongField(term8652, term8652.getClass(), "seconds", 1595535583L);
        setIntField(term8652, term8652.getClass(), "nanos", 842000000);
        setField(term8626, term8626.getClass(), "instant", term8652);
        setField(term8626, term8626.getClass(), "valueAsString", "onpbIeEKoi");
        setField(term8504, term8504.getClass(), "ctime", term8626);
        setLongField(term8504, term8504.getClass(), "crc", -1L);
        setLongField(term8504, term8504.getClass(), "csize", -1L);
        setIntField(term8504, term8504.getClass(), "flag", -2027534003);
        setByteElement(term8672, 0, (byte) 39);
        setByteElement(term8672, 1, (byte) -54);
        setByteElement(term8672, 2, (byte) 9);
        setByteElement(term8672, 3, (byte) 19);
        setByteElement(term8672, 4, (byte) -103);
        setByteElement(term8672, 5, (byte) 61);
        setByteElement(term8672, 6, (byte) -90);
        setByteElement(term8672, 7, (byte) -27);
        setByteElement(term8672, 8, (byte) 119);
        setField(term8504, term8504.getClass(), "extra", term8672);
        setField(term8504, term8504.getClass(), "comment", "YRHGsAkhxb");
        term8695 = new Integer(1375330971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8695;
        callMethod(klass, "setPlatform", argTypes, term8504, args);
    }

};


