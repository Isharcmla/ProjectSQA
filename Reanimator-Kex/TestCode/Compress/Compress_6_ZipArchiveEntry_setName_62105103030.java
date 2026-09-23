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

public class ZipArchiveEntry_setName_62105103030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17856;

    public ZipArchiveEntry_setName_62105103030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term17861 = new LinkedHashMap();
        Class<? extends Object> term18031 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18030 = ((Class) term18031).getDeclaredField((String) "HOURS");
        ((Field) term18030).setAccessible(true);
        Object enum70 = ((Field) term18030).get((Object) null);
        Class<? extends Object> term18208 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18207 = ((Class) term18208).getDeclaredField((String) "MINUTES");
        ((Field) term18207).setAccessible(true);
        Object enum71 = ((Field) term18207).get((Object) null);
        Class<? extends Object> term18391 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18390 = ((Class) term18391).getDeclaredField((String) "MICROSECONDS");
        ((Field) term18390).setAccessible(true);
        Object enum72 = ((Field) term18390).get((Object) null);
        term17856 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term17882 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17901 = newInstance(Class.forName("java.time.Instant"));
        Object term17916 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17937 = newInstance(Class.forName("java.time.Instant"));
        Object term17952 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17978 = newInstance(Class.forName("java.time.Instant"));
        byte[] term17998 = (byte[]) newByteArray(6);
        setIntField(term17856, term17856.getClass(), "method", -1);
        setIntField(term17856, term17856.getClass(), "internalAttributes", -1222006000);
        setIntField(term17856, term17856.getClass(), "platform", 2095798786);
        setLongField(term17856, term17856.getClass(), "externalAttributes", -3936701866695933852L);
        setField(term17856, term17856.getClass(), "extraFields", term17861);
        setField(term17856, term17856.getClass(), "name", "");
        setLongField(term17856, term17856.getClass(), "xdostime", -1L);
        setField(term17882, term17882.getClass(), "unit", enum70);
        setLongField(term17882, term17882.getClass(), "value", 1215116475929634177L);
        setLongField(term17901, term17901.getClass(), "seconds", 1467801054L);
        setIntField(term17901, term17901.getClass(), "nanos", 847000000);
        setField(term17882, term17882.getClass(), "instant", term17901);
        setField(term17882, term17882.getClass(), "valueAsString", "ZzIujlwVsw");
        setField(term17856, term17856.getClass(), "mtime", term17882);
        setField(term17916, term17916.getClass(), "unit", enum71);
        setLongField(term17916, term17916.getClass(), "value", 1597484336218508869L);
        setLongField(term17937, term17937.getClass(), "seconds", 1825626844L);
        setIntField(term17937, term17937.getClass(), "nanos", 992000000);
        setField(term17916, term17916.getClass(), "instant", term17937);
        setField(term17916, term17916.getClass(), "valueAsString", "LWyEaeIyAo");
        setField(term17856, term17856.getClass(), "atime", term17916);
        setField(term17952, term17952.getClass(), "unit", enum72);
        setLongField(term17952, term17952.getClass(), "value", -685023850445639859L);
        setLongField(term17978, term17978.getClass(), "seconds", 1465800799L);
        setIntField(term17978, term17978.getClass(), "nanos", 700000000);
        setField(term17952, term17952.getClass(), "instant", term17978);
        setField(term17952, term17952.getClass(), "valueAsString", "yVMkkQhvmN");
        setField(term17856, term17856.getClass(), "ctime", term17952);
        setLongField(term17856, term17856.getClass(), "crc", -1L);
        setLongField(term17856, term17856.getClass(), "size", -1L);
        setLongField(term17856, term17856.getClass(), "csize", -1L);
        setIntField(term17856, term17856.getClass(), "flag", -1565502840);
        setByteElement(term17998, 0, (byte) 115);
        setByteElement(term17998, 1, (byte) 96);
        setByteElement(term17998, 2, (byte) 51);
        setByteElement(term17998, 3, (byte) -53);
        setByteElement(term17998, 4, (byte) -8);
        setByteElement(term17998, 5, (byte) -9);
        setField(term17856, term17856.getClass(), "extra", term17998);
        setField(term17856, term17856.getClass(), "comment", "mvrkADEgpp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pXOkjyeIRb";
        callMethod(klass, "setName", argTypes, term17856, args);
    }

};


