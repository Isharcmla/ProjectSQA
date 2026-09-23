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

public class ZipArchiveEntry_setUnixMode_209513641113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7105;
     Object term7243;

    public ZipArchiveEntry_setUnixMode_209513641113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term7110 = new LinkedHashMap();
        Class<? extends Object> term7246 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7245 = ((Class) term7246).getDeclaredField((String) "HOURS");
        ((Field) term7245).setAccessible(true);
        Object enum28 = ((Field) term7245).get((Object) null);
        Class<? extends Object> term7423 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7422 = ((Class) term7423).getDeclaredField((String) "SECONDS");
        ((Field) term7422).setAccessible(true);
        Object enum29 = ((Field) term7422).get((Object) null);
        term7105 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term7131 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7150 = newInstance(Class.forName("java.time.Instant"));
        Object term7165 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7186 = newInstance(Class.forName("java.time.Instant"));
        Object term7201 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7203 = newInstance(Class.forName("java.time.Instant"));
        byte[] term7223 = (byte[]) newByteArray(6);
        setIntField(term7105, term7105.getClass(), "method", -1);
        setIntField(term7105, term7105.getClass(), "internalAttributes", 454281060);
        setIntField(term7105, term7105.getClass(), "platform", -1786399638);
        setLongField(term7105, term7105.getClass(), "externalAttributes", 4178434741742309755L);
        setField(term7105, term7105.getClass(), "extraFields", term7110);
        setField(term7105, term7105.getClass(), "name", "");
        setLongField(term7105, term7105.getClass(), "xdostime", -1L);
        setField(term7131, term7131.getClass(), "unit", enum28);
        setLongField(term7131, term7131.getClass(), "value", -2068172595987555756L);
        setLongField(term7150, term7150.getClass(), "seconds", 1496877828L);
        setIntField(term7150, term7150.getClass(), "nanos", 764000000);
        setField(term7131, term7131.getClass(), "instant", term7150);
        setField(term7131, term7131.getClass(), "valueAsString", "onpbIeEKoi");
        setField(term7105, term7105.getClass(), "mtime", term7131);
        setField(term7165, term7165.getClass(), "unit", enum29);
        setLongField(term7165, term7165.getClass(), "value", -6292278961887936280L);
        setLongField(term7186, term7186.getClass(), "seconds", 1691886468L);
        setIntField(term7186, term7186.getClass(), "nanos", 367000000);
        setField(term7165, term7165.getClass(), "instant", term7186);
        setField(term7165, term7165.getClass(), "valueAsString", "YRHGsAkhxb");
        setField(term7105, term7105.getClass(), "atime", term7165);
        setField(term7201, term7201.getClass(), "unit", enum28);
        setLongField(term7201, term7201.getClass(), "value", -6645965768855543712L);
        setLongField(term7203, term7203.getClass(), "seconds", 1442388534L);
        setIntField(term7203, term7203.getClass(), "nanos", 632000000);
        setField(term7201, term7201.getClass(), "instant", term7203);
        setField(term7201, term7201.getClass(), "valueAsString", "ffYhPOzlUs");
        setField(term7105, term7105.getClass(), "ctime", term7201);
        setLongField(term7105, term7105.getClass(), "crc", -1L);
        setLongField(term7105, term7105.getClass(), "size", -1L);
        setLongField(term7105, term7105.getClass(), "csize", -1L);
        setIntField(term7105, term7105.getClass(), "flag", 2055867847);
        setByteElement(term7223, 0, (byte) 72);
        setByteElement(term7223, 1, (byte) 111);
        setByteElement(term7223, 2, (byte) 99);
        setByteElement(term7223, 3, (byte) -12);
        setByteElement(term7223, 4, (byte) -61);
        setByteElement(term7223, 5, (byte) -85);
        setField(term7105, term7105.getClass(), "extra", term7223);
        setField(term7105, term7105.getClass(), "comment", "MLqYREekMl");
        term7243 = new Integer(292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7243;
        callMethod(klass, "setUnixMode", argTypes, term7105, args);
    }

};


