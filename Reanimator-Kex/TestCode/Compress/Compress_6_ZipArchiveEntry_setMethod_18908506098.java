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

public class ZipArchiveEntry_setMethod_18908506098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3447;
     Object term3609;

    public ZipArchiveEntry_setMethod_18908506098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3452 = new LinkedHashMap();
        Class<? extends Object> term3612 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3611 = ((Class) term3612).getDeclaredField((String) "MICROSECONDS");
        ((Field) term3611).setAccessible(true);
        Object enum13 = ((Field) term3611).get((Object) null);
        Class<? extends Object> term3810 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3809 = ((Class) term3810).getDeclaredField((String) "SECONDS");
        ((Field) term3809).setAccessible(true);
        Object enum14 = ((Field) term3809).get((Object) null);
        Class<? extends Object> term3993 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3992 = ((Class) term3993).getDeclaredField((String) "HOURS");
        ((Field) term3992).setAccessible(true);
        Object enum15 = ((Field) term3992).get((Object) null);
        term3447 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term3473 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3499 = newInstance(Class.forName("java.time.Instant"));
        Object term3514 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3535 = newInstance(Class.forName("java.time.Instant"));
        Object term3550 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3569 = newInstance(Class.forName("java.time.Instant"));
        byte[] term3589 = (byte[]) newByteArray(6);
        setIntField(term3447, term3447.getClass(), "method", -1);
        setIntField(term3447, term3447.getClass(), "internalAttributes", -1007160944);
        setIntField(term3447, term3447.getClass(), "platform", 1135664017);
        setLongField(term3447, term3447.getClass(), "externalAttributes", -4920224193275732920L);
        setField(term3447, term3447.getClass(), "extraFields", term3452);
        setField(term3447, term3447.getClass(), "name", "");
        setLongField(term3447, term3447.getClass(), "xdostime", -1L);
        setField(term3473, term3473.getClass(), "unit", enum13);
        setLongField(term3473, term3473.getClass(), "value", 8428634514691209827L);
        setLongField(term3499, term3499.getClass(), "seconds", 1863649094L);
        setIntField(term3499, term3499.getClass(), "nanos", 992000000);
        setField(term3473, term3473.getClass(), "instant", term3499);
        setField(term3473, term3473.getClass(), "valueAsString", "TEParAifyi");
        setField(term3447, term3447.getClass(), "mtime", term3473);
        setField(term3514, term3514.getClass(), "unit", enum14);
        setLongField(term3514, term3514.getClass(), "value", -2585684163342970173L);
        setLongField(term3535, term3535.getClass(), "seconds", 1882656884L);
        setIntField(term3535, term3535.getClass(), "nanos", 364000000);
        setField(term3514, term3514.getClass(), "instant", term3535);
        setField(term3514, term3514.getClass(), "valueAsString", "OWDIEULEFu");
        setField(term3447, term3447.getClass(), "atime", term3514);
        setField(term3550, term3550.getClass(), "unit", enum15);
        setLongField(term3550, term3550.getClass(), "value", 8059786003080744426L);
        setLongField(term3569, term3569.getClass(), "seconds", 1437775323L);
        setIntField(term3569, term3569.getClass(), "nanos", 580000000);
        setField(term3550, term3550.getClass(), "instant", term3569);
        setField(term3550, term3550.getClass(), "valueAsString", "dWRymuLBtr");
        setField(term3447, term3447.getClass(), "ctime", term3550);
        setLongField(term3447, term3447.getClass(), "crc", -1L);
        setLongField(term3447, term3447.getClass(), "size", -1L);
        setLongField(term3447, term3447.getClass(), "csize", -1L);
        setIntField(term3447, term3447.getClass(), "flag", 590364439);
        setByteElement(term3589, 0, (byte) 67);
        setByteElement(term3589, 1, (byte) 78);
        setByteElement(term3589, 2, (byte) 87);
        setByteElement(term3589, 3, (byte) 121);
        setByteElement(term3589, 4, (byte) -99);
        setByteElement(term3589, 5, (byte) -2);
        setField(term3447, term3447.getClass(), "extra", term3589);
        setField(term3447, term3447.getClass(), "comment", "AijpHYOFuy");
        term3609 = new Integer(-1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3609;
        callMethod(klass, "setMethod", argTypes, term3447, args);
    }

};


