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

public class ZipArchiveOutputStream_setMethod_78764002046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29144;
     Object term29155;

    public ZipArchiveOutputStream_setMethod_78764002046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29144 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29144, term29144.getClass(), "entry", null);
        setField(term29144, term29144.getClass(), "comment", null);
        setIntField(term29144, term29144.getClass(), "level", 0);
        setBooleanField(term29144, term29144.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29144, term29144.getClass(), "method", 0);
        setField(term29144, term29144.getClass(), "entries", null);
        setField(term29144, term29144.getClass(), "crc", null);
        setLongField(term29144, term29144.getClass(), "written", 0L);
        setLongField(term29144, term29144.getClass(), "dataStart", 0L);
        setLongField(term29144, term29144.getClass(), "localDataStart", 0L);
        setLongField(term29144, term29144.getClass(), "cdOffset", 0L);
        setLongField(term29144, term29144.getClass(), "cdLength", 0L);
        setField(term29144, term29144.getClass(), "offsets", null);
        setField(term29144, term29144.getClass(), "encoding", null);
        setField(term29144, term29144.getClass(), "zipEncoding", null);
        setField(term29144, term29144.getClass(), "def", null);
        setField(term29144, term29144.getClass(), "buf", null);
        setField(term29144, term29144.getClass(), "raf", null);
        setField(term29144, term29144.getClass(), "out", null);
        setBooleanField(term29144, term29144.getClass(), "useEFS", false);
        setBooleanField(term29144, term29144.getClass(), "fallbackToUTF8", false);
        setField(term29144, term29144.getClass(), "createUnicodeExtraFields", null);
        setField(term29144, term29144.getClass(), "oneByte", null);
        term29155 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29155;
        callMethod(klass, "setMethod", argTypes, term29144, args);
    }

};


