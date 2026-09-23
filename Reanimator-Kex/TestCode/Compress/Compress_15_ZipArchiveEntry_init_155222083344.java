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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ZipArchiveEntry_init_155222083344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public ZipArchiveEntry_init_155222083344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28617 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term28616 = ((Class) term28617).getDeclaredField((String) "MILLISECONDS");
        ((Field) term28616).setAccessible(true);
        Object enum104 = ((Field) term28616).get((Object) null);
        Class<? extends Object> term28815 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term28814 = ((Class) term28815).getDeclaredField((String) "MINUTES");
        ((Field) term28814).setAccessible(true);
        Object enum105 = ((Field) term28814).get((Object) null);
        Class<? extends Object> term28998 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term28997 = ((Class) term28998).getDeclaredField((String) "DAYS");
        ((Field) term28997).setAccessible(true);
        Object enum106 = ((Field) term28997).get((Object) null);
        term23 = newInstance(Class.forName("java.util.zip.ZipEntry"));
        Object term37 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term63 = newInstance(Class.forName("java.time.Instant"));
        Object term78 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term99 = newInstance(Class.forName("java.time.Instant"));
        Object term114 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term132 = newInstance(Class.forName("java.time.Instant"));
        byte[] term152 = (byte[]) newByteArray(5);
        setField(term23, term23.getClass(), "name", "sjlJAEtRrb");
        setLongField(term23, term23.getClass(), "xdostime", -1L);
        setField(term37, term37.getClass(), "unit", enum104);
        setLongField(term37, term37.getClass(), "value", 2442117782898005296L);
        setLongField(term63, term63.getClass(), "seconds", 1345889412L);
        setIntField(term63, term63.getClass(), "nanos", 244000000);
        setField(term37, term37.getClass(), "instant", term63);
        setField(term37, term37.getClass(), "valueAsString", "MuLcgQHgqz");
        setField(term23, term23.getClass(), "mtime", term37);
        setField(term78, term78.getClass(), "unit", enum105);
        setLongField(term78, term78.getClass(), "value", 6375119433582206027L);
        setLongField(term99, term99.getClass(), "seconds", 1480456351L);
        setIntField(term99, term99.getClass(), "nanos", 369000000);
        setField(term78, term78.getClass(), "instant", term99);
        setField(term78, term78.getClass(), "valueAsString", "xxtlPwDYFs");
        setField(term23, term23.getClass(), "atime", term78);
        setField(term114, term114.getClass(), "unit", enum106);
        setLongField(term114, term114.getClass(), "value", -8257434502486459194L);
        setLongField(term132, term132.getClass(), "seconds", 1610958182L);
        setIntField(term132, term132.getClass(), "nanos", 830000000);
        setField(term114, term114.getClass(), "instant", term132);
        setField(term114, term114.getClass(), "valueAsString", "jJCZpVmanW");
        setField(term23, term23.getClass(), "ctime", term114);
        setLongField(term23, term23.getClass(), "crc", -1L);
        setLongField(term23, term23.getClass(), "size", -1L);
        setLongField(term23, term23.getClass(), "csize", -1L);
        setIntField(term23, term23.getClass(), "method", -1);
        setIntField(term23, term23.getClass(), "flag", 568599855);
        setByteElement(term152, 0, (byte) 47);
        setByteElement(term152, 1, (byte) 48);
        setByteElement(term152, 2, (byte) 89);
        setByteElement(term152, 3, (byte) 75);
        setByteElement(term152, 4, (byte) 18);
        setField(term23, term23.getClass(), "extra", term152);
        setField(term23, term23.getClass(), "comment", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term23;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


