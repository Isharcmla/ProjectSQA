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

public class ZipArchiveEntry_getLocalFileDataExtra_2094040526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15518;

    public ZipArchiveEntry_getLocalFileDataExtra_2094040526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term15523 = new LinkedHashMap();
        Class<? extends Object> term15680 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15679 = ((Class) term15680).getDeclaredField((String) "HOURS");
        ((Field) term15679).setAccessible(true);
        Object enum61 = ((Field) term15679).get((Object) null);
        Class<? extends Object> term15857 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15856 = ((Class) term15857).getDeclaredField((String) "MINUTES");
        ((Field) term15856).setAccessible(true);
        Object enum62 = ((Field) term15856).get((Object) null);
        Class<? extends Object> term16040 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16039 = ((Class) term16040).getDeclaredField((String) "MILLISECONDS");
        ((Field) term16039).setAccessible(true);
        Object enum63 = ((Field) term16039).get((Object) null);
        term15518 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term15544 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15563 = newInstance(Class.forName("java.time.Instant"));
        Object term15578 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15599 = newInstance(Class.forName("java.time.Instant"));
        Object term15614 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15640 = newInstance(Class.forName("java.time.Instant"));
        byte[] term15660 = (byte[]) newByteArray(5);
        setIntField(term15518, term15518.getClass(), "method", -1);
        setIntField(term15518, term15518.getClass(), "internalAttributes", 1386130016);
        setIntField(term15518, term15518.getClass(), "platform", 1072005683);
        setLongField(term15518, term15518.getClass(), "externalAttributes", -2177368829816872572L);
        setField(term15518, term15518.getClass(), "extraFields", term15523);
        setField(term15518, term15518.getClass(), "name", "");
        setLongField(term15518, term15518.getClass(), "xdostime", -1L);
        setField(term15544, term15544.getClass(), "unit", enum61);
        setLongField(term15544, term15544.getClass(), "value", -8463029266761149071L);
        setLongField(term15563, term15563.getClass(), "seconds", 1597370397L);
        setIntField(term15563, term15563.getClass(), "nanos", 295000000);
        setField(term15544, term15544.getClass(), "instant", term15563);
        setField(term15544, term15544.getClass(), "valueAsString", "mXGCWJDOqA");
        setField(term15518, term15518.getClass(), "mtime", term15544);
        setField(term15578, term15578.getClass(), "unit", enum62);
        setLongField(term15578, term15578.getClass(), "value", 3133860696238261492L);
        setLongField(term15599, term15599.getClass(), "seconds", 1713909155L);
        setIntField(term15599, term15599.getClass(), "nanos", 263000000);
        setField(term15578, term15578.getClass(), "instant", term15599);
        setField(term15578, term15578.getClass(), "valueAsString", "dpNsDgfPso");
        setField(term15518, term15518.getClass(), "atime", term15578);
        setField(term15614, term15614.getClass(), "unit", enum63);
        setLongField(term15614, term15614.getClass(), "value", 7247160664318067468L);
        setLongField(term15640, term15640.getClass(), "seconds", 1663431767L);
        setIntField(term15640, term15640.getClass(), "nanos", 651000000);
        setField(term15614, term15614.getClass(), "instant", term15640);
        setField(term15614, term15614.getClass(), "valueAsString", "hCWPJQKpdc");
        setField(term15518, term15518.getClass(), "ctime", term15614);
        setLongField(term15518, term15518.getClass(), "crc", -1L);
        setLongField(term15518, term15518.getClass(), "size", -1L);
        setLongField(term15518, term15518.getClass(), "csize", -1L);
        setIntField(term15518, term15518.getClass(), "flag", 1861318859);
        setByteElement(term15660, 0, (byte) 82);
        setByteElement(term15660, 1, (byte) -89);
        setByteElement(term15660, 2, (byte) 24);
        setByteElement(term15660, 3, (byte) 123);
        setByteElement(term15660, 4, (byte) -101);
        setField(term15518, term15518.getClass(), "extra", term15660);
        setField(term15518, term15518.getClass(), "comment", "WzMEhMXkKx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocalFileDataExtra", argTypes, term15518, args);
    }

};


