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

public class ZipArchiveEntry_setExtraFields_205839310017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9665;
     Object term9797;

    public ZipArchiveEntry_setExtraFields_205839310017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9670 = new LinkedHashMap();
        Class<? extends Object> term9799 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9798 = ((Class) term9799).getDeclaredField((String) "DAYS");
        ((Field) term9798).setAccessible(true);
        Object enum38 = ((Field) term9798).get((Object) null);
        Class<? extends Object> term9983 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9982 = ((Class) term9983).getDeclaredField((String) "HOURS");
        ((Field) term9982).setAccessible(true);
        Object enum39 = ((Field) term9982).get((Object) null);
        term9665 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term9691 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9709 = newInstance(Class.forName("java.time.Instant"));
        Object term9724 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9726 = newInstance(Class.forName("java.time.Instant"));
        Object term9741 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9760 = newInstance(Class.forName("java.time.Instant"));
        byte[] term9780 = (byte[]) newByteArray(3);
        setIntField(term9665, term9665.getClass(), "method", -1);
        setIntField(term9665, term9665.getClass(), "internalAttributes", 1265463001);
        setIntField(term9665, term9665.getClass(), "platform", 335112684);
        setLongField(term9665, term9665.getClass(), "externalAttributes", -7738503207562305297L);
        setField(term9665, term9665.getClass(), "extraFields", term9670);
        setField(term9665, term9665.getClass(), "name", "");
        setLongField(term9665, term9665.getClass(), "xdostime", -1L);
        setField(term9691, term9691.getClass(), "unit", enum38);
        setLongField(term9691, term9691.getClass(), "value", 3825396310311739952L);
        setLongField(term9709, term9709.getClass(), "seconds", 1678195615L);
        setIntField(term9709, term9709.getClass(), "nanos", 298000000);
        setField(term9691, term9691.getClass(), "instant", term9709);
        setField(term9691, term9691.getClass(), "valueAsString", "HqBOwkVqjD");
        setField(term9665, term9665.getClass(), "mtime", term9691);
        setField(term9724, term9724.getClass(), "unit", enum38);
        setLongField(term9724, term9724.getClass(), "value", -3838084482494604218L);
        setLongField(term9726, term9726.getClass(), "seconds", 1666094287L);
        setIntField(term9726, term9726.getClass(), "nanos", 186000000);
        setField(term9724, term9724.getClass(), "instant", term9726);
        setField(term9724, term9724.getClass(), "valueAsString", "MAcUBcBckh");
        setField(term9665, term9665.getClass(), "atime", term9724);
        setField(term9741, term9741.getClass(), "unit", enum39);
        setLongField(term9741, term9741.getClass(), "value", 3892018155439224435L);
        setLongField(term9760, term9760.getClass(), "seconds", 1426036874L);
        setIntField(term9760, term9760.getClass(), "nanos", 434000000);
        setField(term9741, term9741.getClass(), "instant", term9760);
        setField(term9741, term9741.getClass(), "valueAsString", "oVgzLbrsFr");
        setField(term9665, term9665.getClass(), "ctime", term9741);
        setLongField(term9665, term9665.getClass(), "crc", -1L);
        setLongField(term9665, term9665.getClass(), "size", -1L);
        setLongField(term9665, term9665.getClass(), "csize", -1L);
        setIntField(term9665, term9665.getClass(), "flag", 1551099402);
        setByteElement(term9780, 0, (byte) 61);
        setByteElement(term9780, 1, (byte) -92);
        setByteElement(term9780, 2, (byte) -42);
        setField(term9665, term9665.getClass(), "extra", term9780);
        setField(term9665, term9665.getClass(), "comment", "vQVyKLdtaz");
        term9797 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9797;
        callMethod(klass, "setExtraFields", argTypes, term9665, args);
    }

};


