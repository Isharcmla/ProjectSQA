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

public class ZipArchiveEntry_getExternalAttributes_210188321611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5647;

    public ZipArchiveEntry_getExternalAttributes_210188321611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5652 = new LinkedHashMap();
        Class<? extends Object> term5810 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5809 = ((Class) term5810).getDeclaredField((String) "DAYS");
        ((Field) term5809).setAccessible(true);
        Object enum22 = ((Field) term5809).get((Object) null);
        Class<? extends Object> term5984 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term5983 = ((Class) term5984).getDeclaredField((String) "MILLISECONDS");
        ((Field) term5983).setAccessible(true);
        Object enum23 = ((Field) term5983).get((Object) null);
        Class<? extends Object> term6182 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6181 = ((Class) term6182).getDeclaredField((String) "SECONDS");
        ((Field) term6181).setAccessible(true);
        Object enum24 = ((Field) term6181).get((Object) null);
        term5647 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term5673 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5691 = newInstance(Class.forName("java.time.Instant"));
        Object term5706 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5732 = newInstance(Class.forName("java.time.Instant"));
        Object term5747 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5768 = newInstance(Class.forName("java.time.Instant"));
        byte[] term5788 = (byte[]) newByteArray(7);
        setIntField(term5647, term5647.getClass(), "method", -1);
        setIntField(term5647, term5647.getClass(), "internalAttributes", 767834723);
        setIntField(term5647, term5647.getClass(), "platform", -602026508);
        setLongField(term5647, term5647.getClass(), "externalAttributes", -5892135042702373494L);
        setField(term5647, term5647.getClass(), "extraFields", term5652);
        setField(term5647, term5647.getClass(), "name", "");
        setLongField(term5647, term5647.getClass(), "xdostime", -1L);
        setField(term5673, term5673.getClass(), "unit", enum22);
        setLongField(term5673, term5673.getClass(), "value", 5262507301787091109L);
        setLongField(term5691, term5691.getClass(), "seconds", 1347418561L);
        setIntField(term5691, term5691.getClass(), "nanos", 385000000);
        setField(term5673, term5673.getClass(), "instant", term5691);
        setField(term5673, term5673.getClass(), "valueAsString", "BndsHwAFMv");
        setField(term5647, term5647.getClass(), "mtime", term5673);
        setField(term5706, term5706.getClass(), "unit", enum23);
        setLongField(term5706, term5706.getClass(), "value", -6823727938421990489L);
        setLongField(term5732, term5732.getClass(), "seconds", 1502176153L);
        setIntField(term5732, term5732.getClass(), "nanos", 899000000);
        setField(term5706, term5706.getClass(), "instant", term5732);
        setField(term5706, term5706.getClass(), "valueAsString", "GzFkzHGYFt");
        setField(term5647, term5647.getClass(), "atime", term5706);
        setField(term5747, term5747.getClass(), "unit", enum24);
        setLongField(term5747, term5747.getClass(), "value", -484994522244390100L);
        setLongField(term5768, term5768.getClass(), "seconds", 1630970644L);
        setIntField(term5768, term5768.getClass(), "nanos", 759000000);
        setField(term5747, term5747.getClass(), "instant", term5768);
        setField(term5747, term5747.getClass(), "valueAsString", "tShwQLRGNe");
        setField(term5647, term5647.getClass(), "ctime", term5747);
        setLongField(term5647, term5647.getClass(), "crc", -1L);
        setLongField(term5647, term5647.getClass(), "size", -1L);
        setLongField(term5647, term5647.getClass(), "csize", -1L);
        setIntField(term5647, term5647.getClass(), "flag", -157887805);
        setByteElement(term5788, 0, (byte) 98);
        setByteElement(term5788, 1, (byte) 67);
        setByteElement(term5788, 2, (byte) 66);
        setByteElement(term5788, 3, (byte) -121);
        setByteElement(term5788, 4, (byte) -119);
        setByteElement(term5788, 5, (byte) 71);
        setByteElement(term5788, 6, (byte) 80);
        setField(term5647, term5647.getClass(), "extra", term5788);
        setField(term5647, term5647.getClass(), "comment", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalAttributes", argTypes, term5647, args);
    }

};


