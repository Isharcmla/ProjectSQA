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
import java.lang.Boolean;

public class ZipArchiveOutputStream_setFallbackToUTF8_1670215140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29074;
     Object term29085;

    public ZipArchiveOutputStream_setFallbackToUTF8_1670215140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29074 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29074, term29074.getClass(), "entry", null);
        setField(term29074, term29074.getClass(), "comment", null);
        setIntField(term29074, term29074.getClass(), "level", 0);
        setBooleanField(term29074, term29074.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29074, term29074.getClass(), "method", 0);
        setField(term29074, term29074.getClass(), "entries", null);
        setField(term29074, term29074.getClass(), "crc", null);
        setLongField(term29074, term29074.getClass(), "written", 0L);
        setLongField(term29074, term29074.getClass(), "dataStart", 0L);
        setLongField(term29074, term29074.getClass(), "localDataStart", 0L);
        setLongField(term29074, term29074.getClass(), "cdOffset", 0L);
        setLongField(term29074, term29074.getClass(), "cdLength", 0L);
        setField(term29074, term29074.getClass(), "offsets", null);
        setField(term29074, term29074.getClass(), "encoding", null);
        setField(term29074, term29074.getClass(), "zipEncoding", null);
        setField(term29074, term29074.getClass(), "def", null);
        setField(term29074, term29074.getClass(), "buf", null);
        setField(term29074, term29074.getClass(), "raf", null);
        setField(term29074, term29074.getClass(), "out", null);
        setBooleanField(term29074, term29074.getClass(), "useEFS", false);
        setBooleanField(term29074, term29074.getClass(), "fallbackToUTF8", false);
        setField(term29074, term29074.getClass(), "createUnicodeExtraFields", null);
        setField(term29074, term29074.getClass(), "oneByte", null);
        term29085 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term29085;
        callMethod(klass, "setFallbackToUTF8", argTypes, term29074, args);
    }

};


