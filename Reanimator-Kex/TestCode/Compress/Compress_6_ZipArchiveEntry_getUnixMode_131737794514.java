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

public class ZipArchiveEntry_getUnixMode_131737794514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7631;

    public ZipArchiveEntry_getUnixMode_131737794514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term7636 = new LinkedHashMap();
        Class<? extends Object> term7773 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7772 = ((Class) term7773).getDeclaredField((String) "HOURS");
        ((Field) term7772).setAccessible(true);
        Object enum30 = ((Field) term7772).get((Object) null);
        Class<? extends Object> term7950 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7949 = ((Class) term7950).getDeclaredField((String) "NANOSECONDS");
        ((Field) term7949).setAccessible(true);
        Object enum31 = ((Field) term7949).get((Object) null);
        term7631 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term7657 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7676 = newInstance(Class.forName("java.time.Instant"));
        Object term7691 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7716 = newInstance(Class.forName("java.time.Instant"));
        Object term7731 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7733 = newInstance(Class.forName("java.time.Instant"));
        byte[] term7753 = (byte[]) newByteArray(5);
        setIntField(term7631, term7631.getClass(), "method", -1);
        setIntField(term7631, term7631.getClass(), "internalAttributes", -184153539);
        setIntField(term7631, term7631.getClass(), "platform", 493620644);
        setLongField(term7631, term7631.getClass(), "externalAttributes", 4784595517102746672L);
        setField(term7631, term7631.getClass(), "extraFields", term7636);
        setField(term7631, term7631.getClass(), "name", "");
        setLongField(term7631, term7631.getClass(), "xdostime", -1L);
        setField(term7657, term7657.getClass(), "unit", enum30);
        setLongField(term7657, term7657.getClass(), "value", -7612550318181586304L);
        setLongField(term7676, term7676.getClass(), "seconds", 1660012192L);
        setIntField(term7676, term7676.getClass(), "nanos", 918000000);
        setField(term7657, term7657.getClass(), "instant", term7676);
        setField(term7657, term7657.getClass(), "valueAsString", "nHXjMycHlU");
        setField(term7631, term7631.getClass(), "mtime", term7657);
        setField(term7691, term7691.getClass(), "unit", enum31);
        setLongField(term7691, term7691.getClass(), "value", -2170847986967241072L);
        setLongField(term7716, term7716.getClass(), "seconds", 1876890800L);
        setIntField(term7716, term7716.getClass(), "nanos", 559000000);
        setField(term7691, term7691.getClass(), "instant", term7716);
        setField(term7691, term7691.getClass(), "valueAsString", "ieCtQFdkii");
        setField(term7631, term7631.getClass(), "atime", term7691);
        setField(term7731, term7731.getClass(), "unit", enum31);
        setLongField(term7731, term7731.getClass(), "value", 4044358158040652353L);
        setLongField(term7733, term7733.getClass(), "seconds", 1304550099L);
        setIntField(term7733, term7733.getClass(), "nanos", 366000000);
        setField(term7731, term7731.getClass(), "instant", term7733);
        setField(term7731, term7731.getClass(), "valueAsString", "dEnhdmILtU");
        setField(term7631, term7631.getClass(), "ctime", term7731);
        setLongField(term7631, term7631.getClass(), "crc", -1L);
        setLongField(term7631, term7631.getClass(), "size", -1L);
        setLongField(term7631, term7631.getClass(), "csize", -1L);
        setIntField(term7631, term7631.getClass(), "flag", 1328271830);
        setByteElement(term7753, 0, (byte) -22);
        setByteElement(term7753, 1, (byte) 93);
        setByteElement(term7753, 2, (byte) 69);
        setByteElement(term7753, 3, (byte) -74);
        setByteElement(term7753, 4, (byte) -123);
        setField(term7631, term7631.getClass(), "extra", term7753);
        setField(term7631, term7631.getClass(), "comment", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnixMode", argTypes, term7631, args);
    }

};


