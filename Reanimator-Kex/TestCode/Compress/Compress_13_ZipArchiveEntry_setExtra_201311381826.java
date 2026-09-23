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

public class ZipArchiveEntry_setExtra_201311381826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16231;

    public ZipArchiveEntry_setExtra_201311381826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term16237 = new LinkedHashMap();
        Class<? extends Object> term16412 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16411 = ((Class) term16412).getDeclaredField((String) "HOURS");
        ((Field) term16411).setAccessible(true);
        Object enum61 = ((Field) term16411).get((Object) null);
        Class<? extends Object> term16589 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16588 = ((Class) term16589).getDeclaredField((String) "MINUTES");
        ((Field) term16588).setAccessible(true);
        Object enum62 = ((Field) term16588).get((Object) null);
        Class<? extends Object> term16772 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16771 = ((Class) term16772).getDeclaredField((String) "MILLISECONDS");
        ((Field) term16771).setAccessible(true);
        Object enum63 = ((Field) term16771).get((Object) null);
        term16231 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term16248 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term16249 = (byte[]) newByteArray(2);
        byte[] term16252 = (byte[]) newByteArray(1);
        byte[] term16256 = (byte[]) newByteArray(5);
        Object term16262 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term16270 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16289 = newInstance(Class.forName("java.time.Instant"));
        Object term16304 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16325 = newInstance(Class.forName("java.time.Instant"));
        Object term16340 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16366 = newInstance(Class.forName("java.time.Instant"));
        byte[] term16386 = (byte[]) newByteArray(3);
        setIntField(term16231, term16231.getClass(), "method", -1);
        setLongField(term16231, term16231.getClass(), "size", -1L);
        setIntField(term16231, term16231.getClass(), "internalAttributes", -1565502840);
        setIntField(term16231, term16231.getClass(), "platform", 344323424);
        setLongField(term16231, term16231.getClass(), "externalAttributes", -2177368829816872572L);
        setField(term16231, term16231.getClass(), "extraFields", term16237);
        setByteElement(term16249, 0, (byte) 122);
        setByteElement(term16249, 1, (byte) -67);
        setField(term16248, term16248.getClass(), "localFileData", term16249);
        setByteElement(term16252, 0, (byte) -23);
        setField(term16248, term16248.getClass(), "centralDirectoryData", term16252);
        setField(term16231, term16231.getClass(), "unparseableExtra", term16248);
        setField(term16231, term16231.getClass(), "name", "");
        setByteElement(term16256, 0, (byte) 25);
        setByteElement(term16256, 1, (byte) 98);
        setByteElement(term16256, 2, (byte) -92);
        setByteElement(term16256, 3, (byte) -43);
        setByteElement(term16256, 4, (byte) -55);
        setField(term16231, term16231.getClass(), "rawName", term16256);
        setBooleanField(term16262, term16262.getClass(), "languageEncodingFlag", false);
        setBooleanField(term16262, term16262.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term16262, term16262.getClass(), "encryptionFlag", false);
        setBooleanField(term16262, term16262.getClass(), "strongEncryptionFlag", false);
        setField(term16231, term16231.getClass(), "gpb", term16262);
        setLongField(term16231, term16231.getClass(), "xdostime", -1L);
        setField(term16270, term16270.getClass(), "unit", enum61);
        setLongField(term16270, term16270.getClass(), "value", -8463029266761149071L);
        setLongField(term16289, term16289.getClass(), "seconds", 1597370397L);
        setIntField(term16289, term16289.getClass(), "nanos", 295000000);
        setField(term16270, term16270.getClass(), "instant", term16289);
        setField(term16270, term16270.getClass(), "valueAsString", "XqgfKFvPSD");
        setField(term16231, term16231.getClass(), "mtime", term16270);
        setField(term16304, term16304.getClass(), "unit", enum62);
        setLongField(term16304, term16304.getClass(), "value", 3133860696238261492L);
        setLongField(term16325, term16325.getClass(), "seconds", 1713909155L);
        setIntField(term16325, term16325.getClass(), "nanos", 263000000);
        setField(term16304, term16304.getClass(), "instant", term16325);
        setField(term16304, term16304.getClass(), "valueAsString", "JiVRgTZvKc");
        setField(term16231, term16231.getClass(), "atime", term16304);
        setField(term16340, term16340.getClass(), "unit", enum63);
        setLongField(term16340, term16340.getClass(), "value", 7247160664318067468L);
        setLongField(term16366, term16366.getClass(), "seconds", 1663431767L);
        setIntField(term16366, term16366.getClass(), "nanos", 651000000);
        setField(term16340, term16340.getClass(), "instant", term16366);
        setField(term16340, term16340.getClass(), "valueAsString", "XPKmummaqg");
        setField(term16231, term16231.getClass(), "ctime", term16340);
        setLongField(term16231, term16231.getClass(), "crc", -1L);
        setLongField(term16231, term16231.getClass(), "csize", -1L);
        setIntField(term16231, term16231.getClass(), "flag", -25637976);
        setByteElement(term16386, 0, (byte) 122);
        setByteElement(term16386, 1, (byte) -44);
        setByteElement(term16386, 2, (byte) 87);
        setField(term16231, term16231.getClass(), "extra", term16386);
        setField(term16231, term16231.getClass(), "comment", "BKLfkLiZTH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setExtra", argTypes, term16231, args);
    }

};


