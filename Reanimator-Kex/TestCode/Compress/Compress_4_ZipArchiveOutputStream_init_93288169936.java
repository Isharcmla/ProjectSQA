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

public class ZipArchiveOutputStream_init_93288169936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ZipArchiveOutputStream_init_93288169936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28584 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term28584, term28584.getClass(), "oneByte", null);
        setField(term28584, term28584.getClass(), "comment", null);
        setIntField(term28584, term28584.getClass(), "level", 0);
        setBooleanField(term28584, term28584.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term28584, term28584.getClass(), "method", 0);
        setField(term28584, term28584.getClass(), "entries", null);
        setField(term28584, term28584.getClass(), "crc", null);
        setLongField(term28584, term28584.getClass(), "written", 0L);
        setLongField(term28584, term28584.getClass(), "dataStart", 0L);
        setLongField(term28584, term28584.getClass(), "localDataStart", 0L);
        setLongField(term28584, term28584.getClass(), "cdOffset", 0L);
        setLongField(term28584, term28584.getClass(), "cdLength", 0L);
        setField(term28584, term28584.getClass(), "offsets", null);
        setField(term28584, term28584.getClass(), "encoding", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


