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
import java.lang.Integer;

public class ZipArchiveOutputStream_setLevel_70970004345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29131;
     Object term29142;

    public ZipArchiveOutputStream_setLevel_70970004345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29131 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29131, term29131.getClass(), "entry", null);
        setField(term29131, term29131.getClass(), "comment", null);
        setIntField(term29131, term29131.getClass(), "level", 0);
        setBooleanField(term29131, term29131.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29131, term29131.getClass(), "method", 0);
        setField(term29131, term29131.getClass(), "entries", null);
        setField(term29131, term29131.getClass(), "crc", null);
        setLongField(term29131, term29131.getClass(), "written", 0L);
        setLongField(term29131, term29131.getClass(), "dataStart", 0L);
        setLongField(term29131, term29131.getClass(), "localDataStart", 0L);
        setLongField(term29131, term29131.getClass(), "cdOffset", 0L);
        setLongField(term29131, term29131.getClass(), "cdLength", 0L);
        setField(term29131, term29131.getClass(), "offsets", null);
        setField(term29131, term29131.getClass(), "encoding", null);
        setField(term29131, term29131.getClass(), "zipEncoding", null);
        setField(term29131, term29131.getClass(), "def", null);
        setField(term29131, term29131.getClass(), "buf", null);
        setField(term29131, term29131.getClass(), "raf", null);
        setField(term29131, term29131.getClass(), "out", null);
        setBooleanField(term29131, term29131.getClass(), "useEFS", false);
        setBooleanField(term29131, term29131.getClass(), "fallbackToUTF8", false);
        setField(term29131, term29131.getClass(), "createUnicodeExtraFields", null);
        setField(term29131, term29131.getClass(), "oneByte", null);
        term29142 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29142;
        callMethod(klass, "setLevel", argTypes, term29131, args);
    }

};


