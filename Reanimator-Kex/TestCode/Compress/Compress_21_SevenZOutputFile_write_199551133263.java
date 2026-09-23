package org.apache.commons.compress.archivers.sevenz;

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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.sevenz.EqualityUtils.*;

public class SevenZOutputFile_write_199551133263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38349;
     Object term38914;

    public SevenZOutputFile_write_199551133263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38349 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        term38914 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term38914, term38914.getClass(), "file", null);
        setField(term38914, term38914.getClass(), "files", null);
        setIntField(term38914, term38914.getClass(), "numNonEmptyStreams", 0);
        setField(term38914, term38914.getClass(), "crc32", null);
        setField(term38914, term38914.getClass(), "compressedCrc32", null);
        setLongField(term38914, term38914.getClass(), "fileBytesWritten", 0L);
        setBooleanField(term38914, term38914.getClass(), "finished", false);
        setField(term38914, term38914.getClass(), "currentOutputStream", null);
        setField(term38914, term38914.getClass(), "contentCompression", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        callMethod(klass, "write", argTypes, term38349, args);
        assertTrue(recursiveEquals(term38349, term38914));
    }

};


