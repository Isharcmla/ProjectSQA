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

public class SevenZFile_toString_159221119131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51764;
     Object term52376;

    public SevenZFile_toString_159221119131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51764 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        Object term51874 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        long[] term51585 = (long[]) newLongArray(0);
        Object[] term51586 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 0);
        setLongField(term51874, term51874.getClass(), "packPos", 0L);
        setField(term51874, term51874.getClass(), "packSizes", term51585);
        setField(term51874, term51874.getClass(), "packCrcs", term51585);
        setField(term51874, term51874.getClass(), "folders", term51586);
        setField(term51874, term51874.getClass(), "files", null);
        setField(term51764, term51764.getClass(), "archive", term51874);
        term52376 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        Object term52377 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        long[] term52378 = (long[]) newLongArray(0);
        long[] term52379 = (long[]) newLongArray(0);
        Object[] term52380 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 0);
        setField(term52376, term52376.getClass(), "fileName", null);
        setField(term52376, term52376.getClass(), "file", null);
        setLongField(term52377, term52377.getClass(), "packPos", 0L);
        setField(term52377, term52377.getClass(), "packSizes", term52378);
        setField(term52377, term52377.getClass(), "packCrcsDefined", null);
        setField(term52377, term52377.getClass(), "packCrcs", term52379);
        setField(term52377, term52377.getClass(), "folders", term52380);
        setField(term52377, term52377.getClass(), "subStreamsInfo", null);
        setField(term52377, term52377.getClass(), "files", null);
        setField(term52377, term52377.getClass(), "streamMap", null);
        setField(term52376, term52376.getClass(), "archive", term52377);
        setIntField(term52376, term52376.getClass(), "currentEntryIndex", 0);
        setIntField(term52376, term52376.getClass(), "currentFolderIndex", 0);
        setField(term52376, term52376.getClass(), "currentFolderInputStream", null);
        setField(term52376, term52376.getClass(), "password", null);
        setField(term52376, term52376.getClass(), "deferredBlockStreams", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term51764, args);
        assertTrue(recursiveEquals(term51764, term52376));
        assertTrue(recursiveEquals(retValue, "Archive with packed streams starting at offset 0, 0 pack sizes, 0 CRCs, 0 folders, (null) files and null"));
    }

};


