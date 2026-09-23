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

public class ZipArchiveEntry_setExtra_201311499623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13484;
     Object term13644;

    public ZipArchiveEntry_setExtra_201311499623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term13489 = new LinkedHashMap();
        Class<? extends Object> term13655 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13654 = ((Class) term13655).getDeclaredField((String) "MICROSECONDS");
        ((Field) term13654).setAccessible(true);
        Object enum53 = ((Field) term13654).get((Object) null);
        Class<? extends Object> term13853 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13852 = ((Class) term13853).getDeclaredField((String) "DAYS");
        ((Field) term13852).setAccessible(true);
        Object enum54 = ((Field) term13852).get((Object) null);
        Class<? extends Object> term14027 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14026 = ((Class) term14027).getDeclaredField((String) "NANOSECONDS");
        ((Field) term14026).setAccessible(true);
        Object enum55 = ((Field) term14026).get((Object) null);
        term13484 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term13510 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term13536 = newInstance(Class.forName("java.time.Instant"));
        Object term13551 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term13569 = newInstance(Class.forName("java.time.Instant"));
        Object term13584 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term13609 = newInstance(Class.forName("java.time.Instant"));
        byte[] term13629 = (byte[]) newByteArray(1);
        setIntField(term13484, term13484.getClass(), "method", -1);
        setIntField(term13484, term13484.getClass(), "internalAttributes", -1210583429);
        setIntField(term13484, term13484.getClass(), "platform", -663691365);
        setLongField(term13484, term13484.getClass(), "externalAttributes", 5510783420697225605L);
        setField(term13484, term13484.getClass(), "extraFields", term13489);
        setField(term13484, term13484.getClass(), "name", "");
        setLongField(term13484, term13484.getClass(), "xdostime", -1L);
        setField(term13510, term13510.getClass(), "unit", enum53);
        setLongField(term13510, term13510.getClass(), "value", 6005241913654469005L);
        setLongField(term13536, term13536.getClass(), "seconds", 1466026719L);
        setIntField(term13536, term13536.getClass(), "nanos", 289000000);
        setField(term13510, term13510.getClass(), "instant", term13536);
        setField(term13510, term13510.getClass(), "valueAsString", "QXzGXbEXMu");
        setField(term13484, term13484.getClass(), "mtime", term13510);
        setField(term13551, term13551.getClass(), "unit", enum54);
        setLongField(term13551, term13551.getClass(), "value", -1983291584002806658L);
        setLongField(term13569, term13569.getClass(), "seconds", 1535856449L);
        setIntField(term13569, term13569.getClass(), "nanos", 65000000);
        setField(term13551, term13551.getClass(), "instant", term13569);
        setField(term13551, term13551.getClass(), "valueAsString", "qxSDVejjiY");
        setField(term13484, term13484.getClass(), "atime", term13551);
        setField(term13584, term13584.getClass(), "unit", enum55);
        setLongField(term13584, term13584.getClass(), "value", 5946780097489996391L);
        setLongField(term13609, term13609.getClass(), "seconds", 1345941503L);
        setIntField(term13609, term13609.getClass(), "nanos", 543000000);
        setField(term13584, term13584.getClass(), "instant", term13609);
        setField(term13584, term13584.getClass(), "valueAsString", "xBsXSDjXYK");
        setField(term13484, term13484.getClass(), "ctime", term13584);
        setLongField(term13484, term13484.getClass(), "crc", -1L);
        setLongField(term13484, term13484.getClass(), "size", -1L);
        setLongField(term13484, term13484.getClass(), "csize", -1L);
        setIntField(term13484, term13484.getClass(), "flag", 339854490);
        setByteElement(term13629, 0, (byte) -101);
        setField(term13484, term13484.getClass(), "extra", term13629);
        setField(term13484, term13484.getClass(), "comment", "sEnIVFtZuQ");
        term13644 = (byte[]) newByteArray(9);
        setByteElement(term13644, 0, (byte) 35);
        setByteElement(term13644, 1, (byte) 66);
        setByteElement(term13644, 2, (byte) 123);
        setByteElement(term13644, 3, (byte) -5);
        setByteElement(term13644, 4, (byte) 84);
        setByteElement(term13644, 5, (byte) -97);
        setByteElement(term13644, 6, (byte) -24);
        setByteElement(term13644, 7, (byte) 88);
        setByteElement(term13644, 8, (byte) 96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term13644;
        callMethod(klass, "setExtra", argTypes, term13484, args);
    }

};


