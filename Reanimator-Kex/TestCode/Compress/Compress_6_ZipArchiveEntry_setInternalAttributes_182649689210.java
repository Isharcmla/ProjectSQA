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

public class ZipArchiveEntry_setInternalAttributes_182649689210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4909;
     Object term5071;

    public ZipArchiveEntry_setInternalAttributes_182649689210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4914 = new LinkedHashMap();
        Class<? extends Object> term5074 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5073 = ((Class) term5074).getDeclaredField((String) "HOURS");
        ((Field) term5073).setAccessible(true);
        Object enum19 = ((Field) term5073).get((Object) null);
        Class<? extends Object> term5251 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5250 = ((Class) term5251).getDeclaredField((String) "MILLISECONDS");
        ((Field) term5250).setAccessible(true);
        Object enum20 = ((Field) term5250).get((Object) null);
        Class<? extends Object> term5449 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5448 = ((Class) term5449).getDeclaredField((String) "SECONDS");
        ((Field) term5448).setAccessible(true);
        Object enum21 = ((Field) term5448).get((Object) null);
        term4909 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term4935 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4954 = newInstance(Class.forName("java.time.Instant"));
        Object term4969 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4995 = newInstance(Class.forName("java.time.Instant"));
        Object term5010 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5031 = newInstance(Class.forName("java.time.Instant"));
        byte[] term5051 = (byte[]) newByteArray(6);
        setIntField(term4909, term4909.getClass(), "method", -1);
        setIntField(term4909, term4909.getClass(), "internalAttributes", -1087774327);
        setIntField(term4909, term4909.getClass(), "platform", -1530420153);
        setLongField(term4909, term4909.getClass(), "externalAttributes", -4502405999831680926L);
        setField(term4909, term4909.getClass(), "extraFields", term4914);
        setField(term4909, term4909.getClass(), "name", "");
        setLongField(term4909, term4909.getClass(), "xdostime", -1L);
        setField(term4935, term4935.getClass(), "unit", enum19);
        setLongField(term4935, term4935.getClass(), "value", 1967728129628047933L);
        setLongField(term4954, term4954.getClass(), "seconds", 1805016087L);
        setIntField(term4954, term4954.getClass(), "nanos", 131000000);
        setField(term4935, term4935.getClass(), "instant", term4954);
        setField(term4935, term4935.getClass(), "valueAsString", "aKnKipADSo");
        setField(term4909, term4909.getClass(), "mtime", term4935);
        setField(term4969, term4969.getClass(), "unit", enum20);
        setLongField(term4969, term4969.getClass(), "value", 2120084523938730454L);
        setLongField(term4995, term4995.getClass(), "seconds", 1538096916L);
        setIntField(term4995, term4995.getClass(), "nanos", 394000000);
        setField(term4969, term4969.getClass(), "instant", term4995);
        setField(term4969, term4969.getClass(), "valueAsString", "wSQxaModmm");
        setField(term4909, term4909.getClass(), "atime", term4969);
        setField(term5010, term5010.getClass(), "unit", enum21);
        setLongField(term5010, term5010.getClass(), "value", 6855071767938501807L);
        setLongField(term5031, term5031.getClass(), "seconds", 1744108065L);
        setIntField(term5031, term5031.getClass(), "nanos", 937000000);
        setField(term5010, term5010.getClass(), "instant", term5031);
        setField(term5010, term5010.getClass(), "valueAsString", "UlajhuVLaP");
        setField(term4909, term4909.getClass(), "ctime", term5010);
        setLongField(term4909, term4909.getClass(), "crc", -1L);
        setLongField(term4909, term4909.getClass(), "size", -1L);
        setLongField(term4909, term4909.getClass(), "csize", -1L);
        setIntField(term4909, term4909.getClass(), "flag", -469968304);
        setByteElement(term5051, 0, (byte) -111);
        setByteElement(term5051, 1, (byte) 23);
        setByteElement(term5051, 2, (byte) -15);
        setByteElement(term5051, 3, (byte) 36);
        setByteElement(term5051, 4, (byte) 118);
        setByteElement(term5051, 5, (byte) 106);
        setField(term4909, term4909.getClass(), "extra", term5051);
        setField(term4909, term4909.getClass(), "comment", "gGSMzuGICf");
        term5071 = new Integer(679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5071;
        callMethod(klass, "setInternalAttributes", argTypes, term4909, args);
    }

};


