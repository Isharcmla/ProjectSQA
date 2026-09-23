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

public class ZipArchiveEntry_setCentralDirectoryExtra_102747004425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14987;
     Object term15123;

    public ZipArchiveEntry_setCentralDirectoryExtra_102747004425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term14992 = new LinkedHashMap();
        Class<? extends Object> term15131 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15130 = ((Class) term15131).getDeclaredField((String) "DAYS");
        ((Field) term15130).setAccessible(true);
        Object enum59 = ((Field) term15130).get((Object) null);
        Class<? extends Object> term15305 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15304 = ((Class) term15305).getDeclaredField((String) "MINUTES");
        ((Field) term15304).setAccessible(true);
        Object enum60 = ((Field) term15304).get((Object) null);
        term14987 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term15013 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15031 = newInstance(Class.forName("java.time.Instant"));
        Object term15046 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15067 = newInstance(Class.forName("java.time.Instant"));
        Object term15082 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15084 = newInstance(Class.forName("java.time.Instant"));
        byte[] term15104 = (byte[]) newByteArray(5);
        setIntField(term14987, term14987.getClass(), "method", -1);
        setIntField(term14987, term14987.getClass(), "internalAttributes", 691577392);
        setIntField(term14987, term14987.getClass(), "platform", -893623680);
        setLongField(term14987, term14987.getClass(), "externalAttributes", -8876856890348836498L);
        setField(term14987, term14987.getClass(), "extraFields", term14992);
        setField(term14987, term14987.getClass(), "name", "");
        setLongField(term14987, term14987.getClass(), "xdostime", -1L);
        setField(term15013, term15013.getClass(), "unit", enum59);
        setLongField(term15013, term15013.getClass(), "value", 846579494941632714L);
        setLongField(term15031, term15031.getClass(), "seconds", 1276523397L);
        setIntField(term15031, term15031.getClass(), "nanos", 937000000);
        setField(term15013, term15013.getClass(), "instant", term15031);
        setField(term15013, term15013.getClass(), "valueAsString", "yGtHPyvYiQ");
        setField(term14987, term14987.getClass(), "mtime", term15013);
        setField(term15046, term15046.getClass(), "unit", enum60);
        setLongField(term15046, term15046.getClass(), "value", 6689117472719450333L);
        setLongField(term15067, term15067.getClass(), "seconds", 1278195575L);
        setIntField(term15067, term15067.getClass(), "nanos", 793000000);
        setField(term15046, term15046.getClass(), "instant", term15067);
        setField(term15046, term15046.getClass(), "valueAsString", "MvRIxilFMJ");
        setField(term14987, term14987.getClass(), "atime", term15046);
        setField(term15082, term15082.getClass(), "unit", enum60);
        setLongField(term15082, term15082.getClass(), "value", 5836128569274066678L);
        setLongField(term15084, term15084.getClass(), "seconds", 1272794321L);
        setIntField(term15084, term15084.getClass(), "nanos", 768000000);
        setField(term15082, term15082.getClass(), "instant", term15084);
        setField(term15082, term15082.getClass(), "valueAsString", "iNwOJRBEjp");
        setField(term14987, term14987.getClass(), "ctime", term15082);
        setLongField(term14987, term14987.getClass(), "crc", -1L);
        setLongField(term14987, term14987.getClass(), "size", -1L);
        setLongField(term14987, term14987.getClass(), "csize", -1L);
        setIntField(term14987, term14987.getClass(), "flag", -1963434938);
        setByteElement(term15104, 0, (byte) -128);
        setByteElement(term15104, 1, (byte) 66);
        setByteElement(term15104, 2, (byte) -112);
        setByteElement(term15104, 3, (byte) 81);
        setByteElement(term15104, 4, (byte) 65);
        setField(term14987, term14987.getClass(), "extra", term15104);
        setField(term14987, term14987.getClass(), "comment", "XylxrMBraH");
        term15123 = (byte[]) newByteArray(6);
        setByteElement(term15123, 0, (byte) -44);
        setByteElement(term15123, 1, (byte) 33);
        setByteElement(term15123, 2, (byte) -74);
        setByteElement(term15123, 3, (byte) -84);
        setByteElement(term15123, 4, (byte) -53);
        setByteElement(term15123, 5, (byte) -93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15123;
        callMethod(klass, "setCentralDirectoryExtra", argTypes, term14987, args);
    }

};


