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

public class ZipArchiveEntry_setExtra_201311381824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14241;

    public ZipArchiveEntry_setExtra_201311381824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term14246 = new LinkedHashMap();
        Class<? extends Object> term14405 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14404 = ((Class) term14405).getDeclaredField((String) "DAYS");
        ((Field) term14404).setAccessible(true);
        Object enum56 = ((Field) term14404).get((Object) null);
        Class<? extends Object> term14579 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14578 = ((Class) term14579).getDeclaredField((String) "MILLISECONDS");
        ((Field) term14578).setAccessible(true);
        Object enum57 = ((Field) term14578).get((Object) null);
        Class<? extends Object> term14777 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term14776 = ((Class) term14777).getDeclaredField((String) "MICROSECONDS");
        ((Field) term14776).setAccessible(true);
        Object enum58 = ((Field) term14776).get((Object) null);
        term14241 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term14267 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14285 = newInstance(Class.forName("java.time.Instant"));
        Object term14300 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14326 = newInstance(Class.forName("java.time.Instant"));
        Object term14341 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14367 = newInstance(Class.forName("java.time.Instant"));
        byte[] term14387 = (byte[]) newByteArray(3);
        setIntField(term14241, term14241.getClass(), "method", -1);
        setIntField(term14241, term14241.getClass(), "internalAttributes", -341962980);
        setIntField(term14241, term14241.getClass(), "platform", 1532716628);
        setLongField(term14241, term14241.getClass(), "externalAttributes", -8652538484981166496L);
        setField(term14241, term14241.getClass(), "extraFields", term14246);
        setField(term14241, term14241.getClass(), "name", "");
        setLongField(term14241, term14241.getClass(), "xdostime", -1L);
        setField(term14267, term14267.getClass(), "unit", enum56);
        setLongField(term14267, term14267.getClass(), "value", 2701184207686293431L);
        setLongField(term14285, term14285.getClass(), "seconds", 1838375779L);
        setIntField(term14285, term14285.getClass(), "nanos", 277000000);
        setField(term14267, term14267.getClass(), "instant", term14285);
        setField(term14267, term14267.getClass(), "valueAsString", "fztQhjqwdP");
        setField(term14241, term14241.getClass(), "mtime", term14267);
        setField(term14300, term14300.getClass(), "unit", enum57);
        setLongField(term14300, term14300.getClass(), "value", 4474998035090263139L);
        setLongField(term14326, term14326.getClass(), "seconds", 1332889705L);
        setIntField(term14326, term14326.getClass(), "nanos", 432000000);
        setField(term14300, term14300.getClass(), "instant", term14326);
        setField(term14300, term14300.getClass(), "valueAsString", "eVpkWxjuki");
        setField(term14241, term14241.getClass(), "atime", term14300);
        setField(term14341, term14341.getClass(), "unit", enum58);
        setLongField(term14341, term14341.getClass(), "value", 2848819812340321742L);
        setLongField(term14367, term14367.getClass(), "seconds", 1597251967L);
        setIntField(term14367, term14367.getClass(), "nanos", 116000000);
        setField(term14341, term14341.getClass(), "instant", term14367);
        setField(term14341, term14341.getClass(), "valueAsString", "SJiQaLvSKv");
        setField(term14241, term14241.getClass(), "ctime", term14341);
        setLongField(term14241, term14241.getClass(), "crc", -1L);
        setLongField(term14241, term14241.getClass(), "size", -1L);
        setLongField(term14241, term14241.getClass(), "csize", -1L);
        setIntField(term14241, term14241.getClass(), "flag", -1801760683);
        setByteElement(term14387, 0, (byte) 70);
        setByteElement(term14387, 1, (byte) 48);
        setByteElement(term14387, 2, (byte) -46);
        setField(term14241, term14241.getClass(), "extra", term14387);
        setField(term14241, term14241.getClass(), "comment", "OEXDRUKcFl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setExtra", argTypes, term14241, args);
    }

};


