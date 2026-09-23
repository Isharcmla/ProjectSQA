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
import java.lang.Object;

public class ZipArchiveEntry_init_17140711190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39296;

    public ZipArchiveEntry_init_17140711190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38836 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        byte[] term38671 = (byte[]) newByteArray(0);
        Object term39052 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term38680 = (byte[]) newByteArray(0);
        Object term39176 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        setLongField(term38836, term38836.getClass(), "xdostime", 0L);
        setLongField(term38836, term38836.getClass(), "crc", 0L);
        setLongField(term38836, term38836.getClass(), "size", 0L);
        setLongField(term38836, term38836.getClass(), "csize", 0L);
        setIntField(term38836, term38836.getClass(), "method", 0);
        setIntField(term38836, term38836.getClass(), "flag", 0);
        setField(term38836, term38836.getClass(), "name", "");
        setField(term38836, term38836.getClass(), "mtime", null);
        setField(term38836, term38836.getClass(), "atime", null);
        setField(term38836, term38836.getClass(), "ctime", null);
        setField(term38836, term38836.getClass(), "extra", term38671);
        setField(term38836, term38836.getClass(), "comment", "");
        setIntField(term38836, term38836.getClass(), "internalAttributes", 0);
        setIntField(term38836, term38836.getClass(), "platform", 0);
        setLongField(term38836, term38836.getClass(), "externalAttributes", 0L);
        setField(term38836, term38836.getClass(), "extraFields", null);
        setField(term38836, term38836.getClass(), "unparseableExtra", term39052);
        setField(term38836, term38836.getClass(), "rawName", term38680);
        setField(term38836, term38836.getClass(), "gpb", term39176);
        term39296 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term39404 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term39474 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term38180 = (byte[]) newByteArray(490);
        setField(term39296, term39296.getClass(), "name", "");
        setLongField(term39296, term39296.getClass(), "xdostime", 0L);
        setField(term39296, term39296.getClass(), "mtime", term39404);
        setField(term39296, term39296.getClass(), "atime", null);
        setField(term39296, term39296.getClass(), "ctime", term39474);
        setLongField(term39296, term39296.getClass(), "crc", 0L);
        setLongField(term39296, term39296.getClass(), "size", 0L);
        setLongField(term39296, term39296.getClass(), "csize", 0L);
        setIntField(term39296, term39296.getClass(), "method", 0);
        setIntField(term39296, term39296.getClass(), "flag", 0);
        setField(term39296, term39296.getClass(), "extra", term38180);
        setField(term39296, term39296.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term39296;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


