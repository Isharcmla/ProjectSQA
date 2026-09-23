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
import java.lang.Long;

public class SevenZFile_skipBytesFully_64082024257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26475;
     Object term26478;

    public SevenZFile_skipBytesFully_64082024257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26475 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        setField(term26475, term26475.getClass(), "fileName", null);
        setField(term26475, term26475.getClass(), "file", null);
        setField(term26475, term26475.getClass(), "archive", null);
        setIntField(term26475, term26475.getClass(), "currentEntryIndex", 0);
        setIntField(term26475, term26475.getClass(), "currentFolderIndex", 0);
        setField(term26475, term26475.getClass(), "currentFolderInputStream", null);
        setField(term26475, term26475.getClass(), "password", null);
        setField(term26475, term26475.getClass(), "deferredBlockStreams", null);
        term26478 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26478;
        callMethod(klass, "skipBytesFully", argTypes, term26475, args);
    }

};


