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

public class ZipArchiveOutputStream_close_146721625748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29172;

    public ZipArchiveOutputStream_close_146721625748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29172 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29172, term29172.getClass(), "entry", null);
        setField(term29172, term29172.getClass(), "comment", null);
        setIntField(term29172, term29172.getClass(), "level", 0);
        setBooleanField(term29172, term29172.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29172, term29172.getClass(), "method", 0);
        setField(term29172, term29172.getClass(), "entries", null);
        setField(term29172, term29172.getClass(), "crc", null);
        setLongField(term29172, term29172.getClass(), "written", 0L);
        setLongField(term29172, term29172.getClass(), "dataStart", 0L);
        setLongField(term29172, term29172.getClass(), "localDataStart", 0L);
        setLongField(term29172, term29172.getClass(), "cdOffset", 0L);
        setLongField(term29172, term29172.getClass(), "cdLength", 0L);
        setField(term29172, term29172.getClass(), "offsets", null);
        setField(term29172, term29172.getClass(), "encoding", null);
        setField(term29172, term29172.getClass(), "zipEncoding", null);
        setField(term29172, term29172.getClass(), "def", null);
        setField(term29172, term29172.getClass(), "buf", null);
        setField(term29172, term29172.getClass(), "raf", null);
        setField(term29172, term29172.getClass(), "out", null);
        setBooleanField(term29172, term29172.getClass(), "useEFS", false);
        setBooleanField(term29172, term29172.getClass(), "fallbackToUTF8", false);
        setField(term29172, term29172.getClass(), "createUnicodeExtraFields", null);
        setField(term29172, term29172.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term29172, args);
    }

};


