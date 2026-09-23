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

public class ZipArchiveEntry_setPlatform_149379641316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8919;
     Object term9081;

    public ZipArchiveEntry_setPlatform_149379641316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term8924 = new LinkedHashMap();
        Class<? extends Object> term9084 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9083 = ((Class) term9084).getDeclaredField((String) "MICROSECONDS");
        ((Field) term9083).setAccessible(true);
        Object enum35 = ((Field) term9083).get((Object) null);
        Class<? extends Object> term9282 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9281 = ((Class) term9282).getDeclaredField((String) "DAYS");
        ((Field) term9281).setAccessible(true);
        Object enum36 = ((Field) term9281).get((Object) null);
        Class<? extends Object> term9456 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9455 = ((Class) term9456).getDeclaredField((String) "MILLISECONDS");
        ((Field) term9455).setAccessible(true);
        Object enum37 = ((Field) term9455).get((Object) null);
        term8919 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term8945 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8971 = newInstance(Class.forName("java.time.Instant"));
        Object term8986 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9004 = newInstance(Class.forName("java.time.Instant"));
        Object term9019 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9045 = newInstance(Class.forName("java.time.Instant"));
        byte[] term9065 = (byte[]) newByteArray(2);
        setIntField(term8919, term8919.getClass(), "method", -1);
        setIntField(term8919, term8919.getClass(), "internalAttributes", -93135961);
        setIntField(term8919, term8919.getClass(), "platform", -112921587);
        setLongField(term8919, term8919.getClass(), "externalAttributes", -1154553077993834885L);
        setField(term8919, term8919.getClass(), "extraFields", term8924);
        setField(term8919, term8919.getClass(), "name", "");
        setLongField(term8919, term8919.getClass(), "xdostime", -1L);
        setField(term8945, term8945.getClass(), "unit", enum35);
        setLongField(term8945, term8945.getClass(), "value", -2850532706972744550L);
        setLongField(term8971, term8971.getClass(), "seconds", 1464439789L);
        setIntField(term8971, term8971.getClass(), "nanos", 888000000);
        setField(term8945, term8945.getClass(), "instant", term8971);
        setField(term8945, term8945.getClass(), "valueAsString", "bLPjGVBhlX");
        setField(term8919, term8919.getClass(), "mtime", term8945);
        setField(term8986, term8986.getClass(), "unit", enum36);
        setLongField(term8986, term8986.getClass(), "value", -2644215923136513282L);
        setLongField(term9004, term9004.getClass(), "seconds", 1405297189L);
        setIntField(term9004, term9004.getClass(), "nanos", 488000000);
        setField(term8986, term8986.getClass(), "instant", term9004);
        setField(term8986, term8986.getClass(), "valueAsString", "whBvTVIIlC");
        setField(term8919, term8919.getClass(), "atime", term8986);
        setField(term9019, term9019.getClass(), "unit", enum37);
        setLongField(term9019, term9019.getClass(), "value", -1468719814009985452L);
        setLongField(term9045, term9045.getClass(), "seconds", 1822722644L);
        setIntField(term9045, term9045.getClass(), "nanos", 50000000);
        setField(term9019, term9019.getClass(), "instant", term9045);
        setField(term9019, term9019.getClass(), "valueAsString", "IgRJUzaCwW");
        setField(term8919, term8919.getClass(), "ctime", term9019);
        setLongField(term8919, term8919.getClass(), "crc", -1L);
        setLongField(term8919, term8919.getClass(), "size", -1L);
        setLongField(term8919, term8919.getClass(), "csize", -1L);
        setIntField(term8919, term8919.getClass(), "flag", 933028652);
        setByteElement(term9065, 0, (byte) 98);
        setByteElement(term9065, 1, (byte) 79);
        setField(term8919, term8919.getClass(), "extra", term9065);
        setField(term8919, term8919.getClass(), "comment", "JUmudUmaaV");
        term9081 = new Integer(962840079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9081;
        callMethod(klass, "setPlatform", argTypes, term8919, args);
    }

};


