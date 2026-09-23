package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;

public class TarArchiveInputStream_canReadEntryData_75948832495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30388;
     Object term30508;
     Object term30545;
     Object term30546;

    public TarArchiveInputStream_canReadEntryData_75948832495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30388 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term30508 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term30545 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term30545, term30545.getClass(), "SMALL_BUF", null);
        setIntField(term30545, term30545.getClass(), "recordSize", 0);
        setIntField(term30545, term30545.getClass(), "blockSize", 0);
        setBooleanField(term30545, term30545.getClass(), "hasHitEOF", false);
        setLongField(term30545, term30545.getClass(), "entrySize", 0L);
        setLongField(term30545, term30545.getClass(), "entryOffset", 0L);
        setField(term30545, term30545.getClass(), "is", null);
        setField(term30545, term30545.getClass(), "currEntry", null);
        setField(term30545, term30545.getClass(), "zipEncoding", null);
        setField(term30545, term30545.getClass(), "encoding", null);
        setField(term30545, term30545.getClass(), "SINGLE", null);
        setLongField(term30545, term30545.getClass(), "bytesRead", 0L);
        term30546 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term30546, term30546.getClass(), "name", null);
        setIntField(term30546, term30546.getClass(), "mode", 0);
        setLongField(term30546, term30546.getClass(), "userId", 0L);
        setLongField(term30546, term30546.getClass(), "groupId", 0L);
        setLongField(term30546, term30546.getClass(), "size", 0L);
        setLongField(term30546, term30546.getClass(), "modTime", 0L);
        setBooleanField(term30546, term30546.getClass(), "checkSumOK", false);
        setByteField(term30546, term30546.getClass(), "linkFlag", (byte) 0);
        setField(term30546, term30546.getClass(), "linkName", null);
        setField(term30546, term30546.getClass(), "magic", null);
        setField(term30546, term30546.getClass(), "version", null);
        setField(term30546, term30546.getClass(), "userName", null);
        setField(term30546, term30546.getClass(), "groupName", null);
        setIntField(term30546, term30546.getClass(), "devMajor", 0);
        setIntField(term30546, term30546.getClass(), "devMinor", 0);
        setBooleanField(term30546, term30546.getClass(), "isExtended", false);
        setLongField(term30546, term30546.getClass(), "realSize", 0L);
        setField(term30546, term30546.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term30508;
        Object retValue = callMethod(klass, "canReadEntryData", argTypes, term30388, args);
        assertTrue(recursiveEquals(term30388, term30545));
        assertTrue(recursiveEquals(term30508, term30546));
        assertTrue(recursiveEquals(retValue, true));
    }

};


