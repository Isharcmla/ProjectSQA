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

public class ZipArchiveEntry_getName_109882553828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16606;

    public ZipArchiveEntry_getName_109882553828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term16611 = new LinkedHashMap();
        Class<? extends Object> term16762 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16761 = ((Class) term16762).getDeclaredField((String) "SECONDS");
        ((Field) term16761).setAccessible(true);
        Object enum65 = ((Field) term16761).get((Object) null);
        Class<? extends Object> term16945 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16944 = ((Class) term16945).getDeclaredField((String) "DAYS");
        ((Field) term16944).setAccessible(true);
        Object enum66 = ((Field) term16944).get((Object) null);
        Class<? extends Object> term17119 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term17118 = ((Class) term17119).getDeclaredField((String) "HOURS");
        ((Field) term17118).setAccessible(true);
        Object enum67 = ((Field) term17118).get((Object) null);
        term16606 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term16632 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16653 = newInstance(Class.forName("java.time.Instant"));
        Object term16668 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16686 = newInstance(Class.forName("java.time.Instant"));
        Object term16701 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16720 = newInstance(Class.forName("java.time.Instant"));
        byte[] term16740 = (byte[]) newByteArray(7);
        setIntField(term16606, term16606.getClass(), "method", -1);
        setIntField(term16606, term16606.getClass(), "internalAttributes", -2015854073);
        setIntField(term16606, term16606.getClass(), "platform", 538259104);
        setLongField(term16606, term16606.getClass(), "externalAttributes", -5216789073301458893L);
        setField(term16606, term16606.getClass(), "extraFields", term16611);
        setField(term16606, term16606.getClass(), "name", "");
        setLongField(term16606, term16606.getClass(), "xdostime", -1L);
        setField(term16632, term16632.getClass(), "unit", enum65);
        setLongField(term16632, term16632.getClass(), "value", -1832940336320585644L);
        setLongField(term16653, term16653.getClass(), "seconds", 1643999113L);
        setIntField(term16653, term16653.getClass(), "nanos", 575000000);
        setField(term16632, term16632.getClass(), "instant", term16653);
        setField(term16632, term16632.getClass(), "valueAsString", "SdCKLMIYnX");
        setField(term16606, term16606.getClass(), "mtime", term16632);
        setField(term16668, term16668.getClass(), "unit", enum66);
        setLongField(term16668, term16668.getClass(), "value", -8033714905181142681L);
        setLongField(term16686, term16686.getClass(), "seconds", 1689446810L);
        setIntField(term16686, term16686.getClass(), "nanos", 999000000);
        setField(term16668, term16668.getClass(), "instant", term16686);
        setField(term16668, term16668.getClass(), "valueAsString", "OJJtVNPyKZ");
        setField(term16606, term16606.getClass(), "atime", term16668);
        setField(term16701, term16701.getClass(), "unit", enum67);
        setLongField(term16701, term16701.getClass(), "value", -9040825890007374809L);
        setLongField(term16720, term16720.getClass(), "seconds", 1570732321L);
        setIntField(term16720, term16720.getClass(), "nanos", 79000000);
        setField(term16701, term16701.getClass(), "instant", term16720);
        setField(term16701, term16701.getClass(), "valueAsString", "AKNapTAfmD");
        setField(term16606, term16606.getClass(), "ctime", term16701);
        setLongField(term16606, term16606.getClass(), "crc", -1L);
        setLongField(term16606, term16606.getClass(), "size", -1L);
        setLongField(term16606, term16606.getClass(), "csize", -1L);
        setIntField(term16606, term16606.getClass(), "flag", 96566506);
        setByteElement(term16740, 0, (byte) 28);
        setByteElement(term16740, 1, (byte) 84);
        setByteElement(term16740, 2, (byte) 85);
        setByteElement(term16740, 3, (byte) -17);
        setByteElement(term16740, 4, (byte) -83);
        setByteElement(term16740, 5, (byte) 48);
        setByteElement(term16740, 6, (byte) -128);
        setField(term16606, term16606.getClass(), "extra", term16740);
        setField(term16606, term16606.getClass(), "comment", "xJgPlLxpgC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term16606, args);
    }

};


