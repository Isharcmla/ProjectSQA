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
import java.lang.Long;

public class ZipArchiveEntry_setExternalAttributes_4598311812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6381;
     Object term6537;

    public ZipArchiveEntry_setExternalAttributes_4598311812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term6386 = new LinkedHashMap();
        Class<? extends Object> term6540 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6539 = ((Class) term6540).getDeclaredField((String) "MICROSECONDS");
        ((Field) term6539).setAccessible(true);
        Object enum25 = ((Field) term6539).get((Object) null);
        Class<? extends Object> term6738 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6737 = ((Class) term6738).getDeclaredField((String) "MINUTES");
        ((Field) term6737).setAccessible(true);
        Object enum26 = ((Field) term6737).get((Object) null);
        Class<? extends Object> term6921 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6920 = ((Class) term6921).getDeclaredField((String) "DAYS");
        ((Field) term6920).setAccessible(true);
        Object enum27 = ((Field) term6920).get((Object) null);
        term6381 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term6407 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term6433 = newInstance(Class.forName("java.time.Instant"));
        Object term6448 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term6469 = newInstance(Class.forName("java.time.Instant"));
        Object term6484 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term6502 = newInstance(Class.forName("java.time.Instant"));
        byte[] term6522 = (byte[]) newByteArray(1);
        setIntField(term6381, term6381.getClass(), "method", -1);
        setIntField(term6381, term6381.getClass(), "internalAttributes", -1016503459);
        setIntField(term6381, term6381.getClass(), "platform", -1968847291);
        setLongField(term6381, term6381.getClass(), "externalAttributes", 1233889271256172047L);
        setField(term6381, term6381.getClass(), "extraFields", term6386);
        setField(term6381, term6381.getClass(), "name", "");
        setLongField(term6381, term6381.getClass(), "xdostime", -1L);
        setField(term6407, term6407.getClass(), "unit", enum25);
        setLongField(term6407, term6407.getClass(), "value", 6617340557564669657L);
        setLongField(term6433, term6433.getClass(), "seconds", 1739435792L);
        setIntField(term6433, term6433.getClass(), "nanos", 956000000);
        setField(term6407, term6407.getClass(), "instant", term6433);
        setField(term6407, term6407.getClass(), "valueAsString", "jDtqGUpnZN");
        setField(term6381, term6381.getClass(), "mtime", term6407);
        setField(term6448, term6448.getClass(), "unit", enum26);
        setLongField(term6448, term6448.getClass(), "value", 1439298019805881866L);
        setLongField(term6469, term6469.getClass(), "seconds", 1329658267L);
        setIntField(term6469, term6469.getClass(), "nanos", 573000000);
        setField(term6448, term6448.getClass(), "instant", term6469);
        setField(term6448, term6448.getClass(), "valueAsString", "nGKItKLYNC");
        setField(term6381, term6381.getClass(), "atime", term6448);
        setField(term6484, term6484.getClass(), "unit", enum27);
        setLongField(term6484, term6484.getClass(), "value", -8708192233349544946L);
        setLongField(term6502, term6502.getClass(), "seconds", 1334871104L);
        setIntField(term6502, term6502.getClass(), "nanos", 718000000);
        setField(term6484, term6484.getClass(), "instant", term6502);
        setField(term6484, term6484.getClass(), "valueAsString", "UiUYnPrcCi");
        setField(term6381, term6381.getClass(), "ctime", term6484);
        setLongField(term6381, term6381.getClass(), "crc", -1L);
        setLongField(term6381, term6381.getClass(), "size", -1L);
        setLongField(term6381, term6381.getClass(), "csize", -1L);
        setIntField(term6381, term6381.getClass(), "flag", 579005622);
        setByteElement(term6522, 0, (byte) 42);
        setField(term6381, term6381.getClass(), "extra", term6522);
        setField(term6381, term6381.getClass(), "comment", "UoYtihxVaS");
        term6537 = new Long(5907001541142728739L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6537;
        callMethod(klass, "setExternalAttributes", argTypes, term6381, args);
    }

};


