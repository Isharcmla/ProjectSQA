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
import java.util.ArrayList;

public class SevenZOutputFile_writeFileCTimes_192952783690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45345;
     Object term65984;

    public SevenZOutputFile_writeFileCTimes_192952783690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term45397 = new ArrayList();
        term45345 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term45345, term45345.getClass(), "files", term45397);
        ArrayList term65985 = new ArrayList();
        term65984 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term65984, term65984.getClass(), "file", null);
        setField(term65984, term65984.getClass(), "files", term65985);
        setIntField(term65984, term65984.getClass(), "numNonEmptyStreams", 0);
        setField(term65984, term65984.getClass(), "crc32", null);
        setField(term65984, term65984.getClass(), "compressedCrc32", null);
        setLongField(term65984, term65984.getClass(), "fileBytesWritten", 0L);
        setBooleanField(term65984, term65984.getClass(), "finished", false);
        setField(term65984, term65984.getClass(), "currentOutputStream", null);
        setField(term65984, term65984.getClass(), "contentCompression", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeFileCTimes", argTypes, term45345, args);
        assertTrue(recursiveEquals(term45345, term65984));
    }

};


