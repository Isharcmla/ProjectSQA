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
import java.lang.Object;

public class SevenZFile_getNextEntry_1960450404109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40577;
     Object term40948;

    public SevenZFile_getNextEntry_1960450404109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40577 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        Object term40687 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term40444 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", 18);
        setIntField(term40577, term40577.getClass(), "currentEntryIndex", 17);
        setField(term40687, term40687.getClass(), "files", term40444);
        setField(term40577, term40577.getClass(), "archive", term40687);
        term40948 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        Object term40949 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term40950 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", 18);
        setField(term40948, term40948.getClass(), "fileName", null);
        setField(term40948, term40948.getClass(), "file", null);
        setLongField(term40949, term40949.getClass(), "packPos", 0L);
        setField(term40949, term40949.getClass(), "packSizes", null);
        setField(term40949, term40949.getClass(), "packCrcsDefined", null);
        setField(term40949, term40949.getClass(), "packCrcs", null);
        setField(term40949, term40949.getClass(), "folders", null);
        setField(term40949, term40949.getClass(), "subStreamsInfo", null);
        setField(term40949, term40949.getClass(), "files", term40950);
        setField(term40949, term40949.getClass(), "streamMap", null);
        setField(term40948, term40948.getClass(), "archive", term40949);
        setIntField(term40948, term40948.getClass(), "currentEntryIndex", 17);
        setIntField(term40948, term40948.getClass(), "currentFolderIndex", 0);
        setField(term40948, term40948.getClass(), "currentFolderInputStream", null);
        setField(term40948, term40948.getClass(), "password", null);
        setField(term40948, term40948.getClass(), "deferredBlockStreams", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term40577, args);
        assertTrue(recursiveEquals(term40577, term40948));
        assertTrue(recursiveEquals(retValue, null));
    }

};


