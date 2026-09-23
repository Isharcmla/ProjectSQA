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

public class ZipArchiveEntry_getPlatform_202341241715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8169;

    public ZipArchiveEntry_getPlatform_202341241715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term8174 = new LinkedHashMap();
        Class<? extends Object> term8335 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8334 = ((Class) term8335).getDeclaredField((String) "NANOSECONDS");
        ((Field) term8334).setAccessible(true);
        Object enum32 = ((Field) term8334).get((Object) null);
        Class<? extends Object> term8530 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8529 = ((Class) term8530).getDeclaredField((String) "HOURS");
        ((Field) term8529).setAccessible(true);
        Object enum33 = ((Field) term8529).get((Object) null);
        Class<? extends Object> term8707 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8706 = ((Class) term8707).getDeclaredField((String) "MILLISECONDS");
        ((Field) term8706).setAccessible(true);
        Object enum34 = ((Field) term8706).get((Object) null);
        term8169 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term8195 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8220 = newInstance(Class.forName("java.time.Instant"));
        Object term8235 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8254 = newInstance(Class.forName("java.time.Instant"));
        Object term8269 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8295 = newInstance(Class.forName("java.time.Instant"));
        byte[] term8315 = (byte[]) newByteArray(5);
        setIntField(term8169, term8169.getClass(), "method", -1);
        setIntField(term8169, term8169.getClass(), "internalAttributes", -1371869594);
        setIntField(term8169, term8169.getClass(), "platform", -2095575670);
        setLongField(term8169, term8169.getClass(), "externalAttributes", -4443169559037975007L);
        setField(term8169, term8169.getClass(), "extraFields", term8174);
        setField(term8169, term8169.getClass(), "name", "");
        setLongField(term8169, term8169.getClass(), "xdostime", -1L);
        setField(term8195, term8195.getClass(), "unit", enum32);
        setLongField(term8195, term8195.getClass(), "value", -3842548265506930260L);
        setLongField(term8220, term8220.getClass(), "seconds", 1488743902L);
        setIntField(term8220, term8220.getClass(), "nanos", 101000000);
        setField(term8195, term8195.getClass(), "instant", term8220);
        setField(term8195, term8195.getClass(), "valueAsString", "fhkbdRViHi");
        setField(term8169, term8169.getClass(), "mtime", term8195);
        setField(term8235, term8235.getClass(), "unit", enum33);
        setLongField(term8235, term8235.getClass(), "value", -5788180182343976541L);
        setLongField(term8254, term8254.getClass(), "seconds", 1311578117L);
        setIntField(term8254, term8254.getClass(), "nanos", 361000000);
        setField(term8235, term8235.getClass(), "instant", term8254);
        setField(term8235, term8235.getClass(), "valueAsString", "uWHnvSvaPl");
        setField(term8169, term8169.getClass(), "atime", term8235);
        setField(term8269, term8269.getClass(), "unit", enum34);
        setLongField(term8269, term8269.getClass(), "value", 2936323121573284007L);
        setLongField(term8295, term8295.getClass(), "seconds", 1595535583L);
        setIntField(term8295, term8295.getClass(), "nanos", 842000000);
        setField(term8269, term8269.getClass(), "instant", term8295);
        setField(term8269, term8269.getClass(), "valueAsString", "kBdSllIBVz");
        setField(term8169, term8169.getClass(), "ctime", term8269);
        setLongField(term8169, term8169.getClass(), "crc", -1L);
        setLongField(term8169, term8169.getClass(), "size", -1L);
        setLongField(term8169, term8169.getClass(), "csize", -1L);
        setIntField(term8169, term8169.getClass(), "flag", 1225272962);
        setByteElement(term8315, 0, (byte) -23);
        setByteElement(term8315, 1, (byte) 100);
        setByteElement(term8315, 2, (byte) 106);
        setByteElement(term8315, 3, (byte) -57);
        setByteElement(term8315, 4, (byte) -103);
        setField(term8169, term8169.getClass(), "extra", term8315);
        setField(term8169, term8169.getClass(), "comment", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlatform", argTypes, term8169, args);
    }

};


