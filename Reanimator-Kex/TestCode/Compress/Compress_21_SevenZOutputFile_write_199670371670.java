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

public class SevenZOutputFile_write_199670371670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39915;
     Object term39775;
     Object term40069;
     Object term40070;

    public SevenZOutputFile_write_199670371670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39915 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        term39775 = (byte[]) newByteArray(0);
        term40069 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term40069, term40069.getClass(), "file", null);
        setField(term40069, term40069.getClass(), "files", null);
        setIntField(term40069, term40069.getClass(), "numNonEmptyStreams", 0);
        setField(term40069, term40069.getClass(), "crc32", null);
        setField(term40069, term40069.getClass(), "compressedCrc32", null);
        setLongField(term40069, term40069.getClass(), "fileBytesWritten", 0L);
        setBooleanField(term40069, term40069.getClass(), "finished", false);
        setField(term40069, term40069.getClass(), "currentOutputStream", null);
        setField(term40069, term40069.getClass(), "contentCompression", null);
        term40070 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term39775;
        callMethod(klass, "write", argTypes, term39915, args);
        assertTrue(recursiveEquals(term39915, term40069));
        assertTrue(recursiveEquals(term39775, term40070));
    }

};


