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

public class ZipArchiveEntry_equals_99237856634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20651;
     Object term20811;

    public ZipArchiveEntry_equals_99237856634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term20656 = new LinkedHashMap();
        Class<? extends Object> term20813 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20812 = ((Class) term20813).getDeclaredField((String) "SECONDS");
        ((Field) term20812).setAccessible(true);
        Object enum81 = ((Field) term20812).get((Object) null);
        Class<? extends Object> term20996 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20995 = ((Class) term20996).getDeclaredField((String) "DAYS");
        ((Field) term20995).setAccessible(true);
        Object enum82 = ((Field) term20995).get((Object) null);
        Class<? extends Object> term21170 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term21169 = ((Class) term21170).getDeclaredField((String) "MICROSECONDS");
        ((Field) term21169).setAccessible(true);
        Object enum83 = ((Field) term21169).get((Object) null);
        term20651 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term20677 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20698 = newInstance(Class.forName("java.time.Instant"));
        Object term20713 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20731 = newInstance(Class.forName("java.time.Instant"));
        Object term20746 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20772 = newInstance(Class.forName("java.time.Instant"));
        byte[] term20792 = (byte[]) newByteArray(5);
        setIntField(term20651, term20651.getClass(), "method", -1);
        setIntField(term20651, term20651.getClass(), "internalAttributes", 1283079251);
        setIntField(term20651, term20651.getClass(), "platform", -523949691);
        setLongField(term20651, term20651.getClass(), "externalAttributes", 6273754186658578034L);
        setField(term20651, term20651.getClass(), "extraFields", term20656);
        setField(term20651, term20651.getClass(), "name", "");
        setLongField(term20651, term20651.getClass(), "xdostime", -1L);
        setField(term20677, term20677.getClass(), "unit", enum81);
        setLongField(term20677, term20677.getClass(), "value", 3620247240684476031L);
        setLongField(term20698, term20698.getClass(), "seconds", 1603923786L);
        setIntField(term20698, term20698.getClass(), "nanos", 801000000);
        setField(term20677, term20677.getClass(), "instant", term20698);
        setField(term20677, term20677.getClass(), "valueAsString", "VeDtgDzGAN");
        setField(term20651, term20651.getClass(), "mtime", term20677);
        setField(term20713, term20713.getClass(), "unit", enum82);
        setLongField(term20713, term20713.getClass(), "value", 8313800941204938919L);
        setLongField(term20731, term20731.getClass(), "seconds", 1369557267L);
        setIntField(term20731, term20731.getClass(), "nanos", 611000000);
        setField(term20713, term20713.getClass(), "instant", term20731);
        setField(term20713, term20713.getClass(), "valueAsString", "aWYOWZFyaX");
        setField(term20651, term20651.getClass(), "atime", term20713);
        setField(term20746, term20746.getClass(), "unit", enum83);
        setLongField(term20746, term20746.getClass(), "value", -1214968196781083707L);
        setLongField(term20772, term20772.getClass(), "seconds", 1510293079L);
        setIntField(term20772, term20772.getClass(), "nanos", 351000000);
        setField(term20746, term20746.getClass(), "instant", term20772);
        setField(term20746, term20746.getClass(), "valueAsString", "BRIVNtfUWU");
        setField(term20651, term20651.getClass(), "ctime", term20746);
        setLongField(term20651, term20651.getClass(), "crc", -1L);
        setLongField(term20651, term20651.getClass(), "size", -1L);
        setLongField(term20651, term20651.getClass(), "csize", -1L);
        setIntField(term20651, term20651.getClass(), "flag", 1398204340);
        setByteElement(term20792, 0, (byte) 25);
        setByteElement(term20792, 1, (byte) 16);
        setByteElement(term20792, 2, (byte) 39);
        setByteElement(term20792, 3, (byte) 123);
        setByteElement(term20792, 4, (byte) 16);
        setField(term20651, term20651.getClass(), "extra", term20792);
        setField(term20651, term20651.getClass(), "comment", "DbiCVtPPCT");
        term20811 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20811;
        callMethod(klass, "equals", argTypes, term20651, args);
    }

};


