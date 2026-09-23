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

public class ZipArchiveOutputStream_deflate_75576011450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29194;

    public ZipArchiveOutputStream_deflate_75576011450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29194 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29194, term29194.getClass(), "entry", null);
        setField(term29194, term29194.getClass(), "comment", null);
        setIntField(term29194, term29194.getClass(), "level", 0);
        setBooleanField(term29194, term29194.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29194, term29194.getClass(), "method", 0);
        setField(term29194, term29194.getClass(), "entries", null);
        setField(term29194, term29194.getClass(), "crc", null);
        setLongField(term29194, term29194.getClass(), "written", 0L);
        setLongField(term29194, term29194.getClass(), "dataStart", 0L);
        setLongField(term29194, term29194.getClass(), "localDataStart", 0L);
        setLongField(term29194, term29194.getClass(), "cdOffset", 0L);
        setLongField(term29194, term29194.getClass(), "cdLength", 0L);
        setField(term29194, term29194.getClass(), "offsets", null);
        setField(term29194, term29194.getClass(), "encoding", null);
        setField(term29194, term29194.getClass(), "zipEncoding", null);
        setField(term29194, term29194.getClass(), "def", null);
        setField(term29194, term29194.getClass(), "buf", null);
        setField(term29194, term29194.getClass(), "raf", null);
        setField(term29194, term29194.getClass(), "out", null);
        setBooleanField(term29194, term29194.getClass(), "useEFS", false);
        setBooleanField(term29194, term29194.getClass(), "fallbackToUTF8", false);
        setField(term29194, term29194.getClass(), "createUnicodeExtraFields", null);
        setField(term29194, term29194.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deflate", argTypes, term29194, args);
    }

};


