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

public class ZipArchiveOutputStream_writeOut_131156481656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29260;
     Object term29271;
     Object term29273;

    public ZipArchiveOutputStream_writeOut_131156481656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29260 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29260, term29260.getClass(), "entry", null);
        setField(term29260, term29260.getClass(), "comment", null);
        setIntField(term29260, term29260.getClass(), "level", 0);
        setBooleanField(term29260, term29260.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29260, term29260.getClass(), "method", 0);
        setField(term29260, term29260.getClass(), "entries", null);
        setField(term29260, term29260.getClass(), "crc", null);
        setLongField(term29260, term29260.getClass(), "written", 0L);
        setLongField(term29260, term29260.getClass(), "dataStart", 0L);
        setLongField(term29260, term29260.getClass(), "localDataStart", 0L);
        setLongField(term29260, term29260.getClass(), "cdOffset", 0L);
        setLongField(term29260, term29260.getClass(), "cdLength", 0L);
        setField(term29260, term29260.getClass(), "offsets", null);
        setField(term29260, term29260.getClass(), "encoding", null);
        setField(term29260, term29260.getClass(), "zipEncoding", null);
        setField(term29260, term29260.getClass(), "def", null);
        setField(term29260, term29260.getClass(), "buf", null);
        setField(term29260, term29260.getClass(), "raf", null);
        setField(term29260, term29260.getClass(), "out", null);
        setBooleanField(term29260, term29260.getClass(), "useEFS", false);
        setBooleanField(term29260, term29260.getClass(), "fallbackToUTF8", false);
        setField(term29260, term29260.getClass(), "createUnicodeExtraFields", null);
        setField(term29260, term29260.getClass(), "oneByte", null);
        term29271 = new Integer(0);
        term29273 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term29271;
        args[2] = term29273;
        callMethod(klass, "writeOut", argTypes, term29260, args);
    }

};


