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

public class ZipArchiveOutputStream_setCreateUnicodeExtraFields_146874437039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29063;

    public ZipArchiveOutputStream_setCreateUnicodeExtraFields_146874437039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29063 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29063, term29063.getClass(), "entry", null);
        setField(term29063, term29063.getClass(), "comment", null);
        setIntField(term29063, term29063.getClass(), "level", 0);
        setBooleanField(term29063, term29063.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29063, term29063.getClass(), "method", 0);
        setField(term29063, term29063.getClass(), "entries", null);
        setField(term29063, term29063.getClass(), "crc", null);
        setLongField(term29063, term29063.getClass(), "written", 0L);
        setLongField(term29063, term29063.getClass(), "dataStart", 0L);
        setLongField(term29063, term29063.getClass(), "localDataStart", 0L);
        setLongField(term29063, term29063.getClass(), "cdOffset", 0L);
        setLongField(term29063, term29063.getClass(), "cdLength", 0L);
        setField(term29063, term29063.getClass(), "offsets", null);
        setField(term29063, term29063.getClass(), "encoding", null);
        setField(term29063, term29063.getClass(), "zipEncoding", null);
        setField(term29063, term29063.getClass(), "def", null);
        setField(term29063, term29063.getClass(), "buf", null);
        setField(term29063, term29063.getClass(), "raf", null);
        setField(term29063, term29063.getClass(), "out", null);
        setBooleanField(term29063, term29063.getClass(), "useEFS", false);
        setBooleanField(term29063, term29063.getClass(), "fallbackToUTF8", false);
        setField(term29063, term29063.getClass(), "createUnicodeExtraFields", null);
        setField(term29063, term29063.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreateUnicodeExtraFields", argTypes, term29063, args);
    }

};


