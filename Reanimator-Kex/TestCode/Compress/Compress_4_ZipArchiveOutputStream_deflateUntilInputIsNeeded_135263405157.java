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

public class ZipArchiveOutputStream_deflateUntilInputIsNeeded_135263405157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29275;

    public ZipArchiveOutputStream_deflateUntilInputIsNeeded_135263405157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29275 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29275, term29275.getClass(), "entry", null);
        setField(term29275, term29275.getClass(), "comment", null);
        setIntField(term29275, term29275.getClass(), "level", 0);
        setBooleanField(term29275, term29275.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29275, term29275.getClass(), "method", 0);
        setField(term29275, term29275.getClass(), "entries", null);
        setField(term29275, term29275.getClass(), "crc", null);
        setLongField(term29275, term29275.getClass(), "written", 0L);
        setLongField(term29275, term29275.getClass(), "dataStart", 0L);
        setLongField(term29275, term29275.getClass(), "localDataStart", 0L);
        setLongField(term29275, term29275.getClass(), "cdOffset", 0L);
        setLongField(term29275, term29275.getClass(), "cdLength", 0L);
        setField(term29275, term29275.getClass(), "offsets", null);
        setField(term29275, term29275.getClass(), "encoding", null);
        setField(term29275, term29275.getClass(), "zipEncoding", null);
        setField(term29275, term29275.getClass(), "def", null);
        setField(term29275, term29275.getClass(), "buf", null);
        setField(term29275, term29275.getClass(), "raf", null);
        setField(term29275, term29275.getClass(), "out", null);
        setBooleanField(term29275, term29275.getClass(), "useEFS", false);
        setBooleanField(term29275, term29275.getClass(), "fallbackToUTF8", false);
        setField(term29275, term29275.getClass(), "createUnicodeExtraFields", null);
        setField(term29275, term29275.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deflateUntilInputIsNeeded", argTypes, term29275, args);
    }

};


