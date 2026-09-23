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

public class ZipFile_init_151997400156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ZipFile_init_151997400156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18937 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        setField(term18937, term18937.getClass(), "entries", null);
        setField(term18937, term18937.getClass(), "nameMap", null);
        setField(term18937, term18937.getClass(), "OFFSET_COMPARATOR", null);
        setField(term18937, term18937.getClass(), "archiveName", null);
        setField(term18937, term18937.getClass(), "encoding", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


