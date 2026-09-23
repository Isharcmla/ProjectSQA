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
import java.lang.Boolean;

public class ZipArchiveOutputStream_writeVersionNeededToExtractAndGeneralPurposeBits_7734518258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29286;
     Object term29297;
     Object term29299;

    public ZipArchiveOutputStream_writeVersionNeededToExtractAndGeneralPurposeBits_7734518258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29286 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29286, term29286.getClass(), "entry", null);
        setField(term29286, term29286.getClass(), "comment", null);
        setIntField(term29286, term29286.getClass(), "level", 0);
        setBooleanField(term29286, term29286.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29286, term29286.getClass(), "method", 0);
        setField(term29286, term29286.getClass(), "entries", null);
        setField(term29286, term29286.getClass(), "crc", null);
        setLongField(term29286, term29286.getClass(), "written", 0L);
        setLongField(term29286, term29286.getClass(), "dataStart", 0L);
        setLongField(term29286, term29286.getClass(), "localDataStart", 0L);
        setLongField(term29286, term29286.getClass(), "cdOffset", 0L);
        setLongField(term29286, term29286.getClass(), "cdLength", 0L);
        setField(term29286, term29286.getClass(), "offsets", null);
        setField(term29286, term29286.getClass(), "encoding", null);
        setField(term29286, term29286.getClass(), "zipEncoding", null);
        setField(term29286, term29286.getClass(), "def", null);
        setField(term29286, term29286.getClass(), "buf", null);
        setField(term29286, term29286.getClass(), "raf", null);
        setField(term29286, term29286.getClass(), "out", null);
        setBooleanField(term29286, term29286.getClass(), "useEFS", false);
        setBooleanField(term29286, term29286.getClass(), "fallbackToUTF8", false);
        setField(term29286, term29286.getClass(), "createUnicodeExtraFields", null);
        setField(term29286, term29286.getClass(), "oneByte", null);
        term29297 = new Integer(0);
        term29299 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term29297;
        args[1] = term29299;
        callMethod(klass, "writeVersionNeededToExtractAndGeneralPurposeBits", argTypes, term29286, args);
    }

};


