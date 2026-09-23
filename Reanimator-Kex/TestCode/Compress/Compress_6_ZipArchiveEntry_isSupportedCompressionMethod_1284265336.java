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

public class ZipArchiveEntry_isSupportedCompressionMethod_1284265336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2173;

    public ZipArchiveEntry_isSupportedCompressionMethod_1284265336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2178 = new LinkedHashMap();
        Class<? extends Object> term2317 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2316 = ((Class) term2317).getDeclaredField((String) "MILLISECONDS");
        ((Field) term2316).setAccessible(true);
        Object enum8 = ((Field) term2316).get((Object) null);
        Class<? extends Object> term2525 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2524 = ((Class) term2525).getDeclaredField((String) "SECONDS");
        ((Field) term2524).setAccessible(true);
        Object enum9 = ((Field) term2524).get((Object) null);
        term2173 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term2199 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2225 = newInstance(Class.forName("java.time.Instant"));
        Object term2240 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2242 = newInstance(Class.forName("java.time.Instant"));
        Object term2257 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2278 = newInstance(Class.forName("java.time.Instant"));
        byte[] term2298 = (byte[]) newByteArray(4);
        setIntField(term2173, term2173.getClass(), "method", -1);
        setIntField(term2173, term2173.getClass(), "internalAttributes", 1585847225);
        setIntField(term2173, term2173.getClass(), "platform", 597278769);
        setLongField(term2173, term2173.getClass(), "externalAttributes", -8885298608300233488L);
        setField(term2173, term2173.getClass(), "extraFields", term2178);
        setField(term2173, term2173.getClass(), "name", "");
        setLongField(term2173, term2173.getClass(), "xdostime", -1L);
        setField(term2199, term2199.getClass(), "unit", enum8);
        setLongField(term2199, term2199.getClass(), "value", -4325723315152823407L);
        setLongField(term2225, term2225.getClass(), "seconds", 1500739068L);
        setIntField(term2225, term2225.getClass(), "nanos", 23000000);
        setField(term2199, term2199.getClass(), "instant", term2225);
        setField(term2199, term2199.getClass(), "valueAsString", "pCTimMblYc");
        setField(term2173, term2173.getClass(), "mtime", term2199);
        setField(term2240, term2240.getClass(), "unit", enum8);
        setLongField(term2240, term2240.getClass(), "value", 2535595959091595249L);
        setLongField(term2242, term2242.getClass(), "seconds", 1797221628L);
        setIntField(term2242, term2242.getClass(), "nanos", 25000000);
        setField(term2240, term2240.getClass(), "instant", term2242);
        setField(term2240, term2240.getClass(), "valueAsString", "hNxWaHcfhY");
        setField(term2173, term2173.getClass(), "atime", term2240);
        setField(term2257, term2257.getClass(), "unit", enum9);
        setLongField(term2257, term2257.getClass(), "value", -5476826692763582090L);
        setLongField(term2278, term2278.getClass(), "seconds", 1589475921L);
        setIntField(term2278, term2278.getClass(), "nanos", 30000000);
        setField(term2257, term2257.getClass(), "instant", term2278);
        setField(term2257, term2257.getClass(), "valueAsString", "RkybSrpybU");
        setField(term2173, term2173.getClass(), "ctime", term2257);
        setLongField(term2173, term2173.getClass(), "crc", -1L);
        setLongField(term2173, term2173.getClass(), "size", -1L);
        setLongField(term2173, term2173.getClass(), "csize", -1L);
        setIntField(term2173, term2173.getClass(), "flag", -1685132342);
        setByteElement(term2298, 0, (byte) 83);
        setByteElement(term2298, 1, (byte) 74);
        setByteElement(term2298, 2, (byte) -71);
        setByteElement(term2298, 3, (byte) 49);
        setField(term2173, term2173.getClass(), "extra", term2298);
        setField(term2173, term2173.getClass(), "comment", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSupportedCompressionMethod", argTypes, term2173, args);
    }

};


