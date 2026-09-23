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
import java.lang.Object;

public class SevenZOutputFile_writeFileAntiItems_237560799101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105540;
     Object term116029;

    public SevenZOutputFile_writeFileAntiItems_237560799101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105724 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setBooleanField(term105724, term105724.getClass(), "hasStream", true);
        Object term105856 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setBooleanField(term105856, term105856.getClass(), "hasStream", false);
        setBooleanField(term105856, term105856.getClass(), "isAntiItem", false);
        ArrayList term105592 = new ArrayList();
        ((ArrayList) term105592).add(term105724);
        ((ArrayList) term105592).add(term105856);
        term105540 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term105540, term105540.getClass(), "files", term105592);
        Object term116032 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term116032, term116032.getClass(), "name", null);
        setBooleanField(term116032, term116032.getClass(), "hasStream", true);
        setBooleanField(term116032, term116032.getClass(), "isDirectory", false);
        setBooleanField(term116032, term116032.getClass(), "isAntiItem", false);
        setBooleanField(term116032, term116032.getClass(), "hasCreationDate", false);
        setBooleanField(term116032, term116032.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term116032, term116032.getClass(), "hasAccessDate", false);
        setLongField(term116032, term116032.getClass(), "creationDate", 0L);
        setLongField(term116032, term116032.getClass(), "lastModifiedDate", 0L);
        setLongField(term116032, term116032.getClass(), "accessDate", 0L);
        setBooleanField(term116032, term116032.getClass(), "hasWindowsAttributes", false);
        setIntField(term116032, term116032.getClass(), "windowsAttributes", 0);
        setBooleanField(term116032, term116032.getClass(), "hasCrc", false);
        setLongField(term116032, term116032.getClass(), "crc", 0L);
        setLongField(term116032, term116032.getClass(), "compressedCrc", 0L);
        setLongField(term116032, term116032.getClass(), "size", 0L);
        setLongField(term116032, term116032.getClass(), "compressedSize", 0L);
        Object term116033 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term116033, term116033.getClass(), "name", null);
        setBooleanField(term116033, term116033.getClass(), "hasStream", false);
        setBooleanField(term116033, term116033.getClass(), "isDirectory", false);
        setBooleanField(term116033, term116033.getClass(), "isAntiItem", false);
        setBooleanField(term116033, term116033.getClass(), "hasCreationDate", false);
        setBooleanField(term116033, term116033.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term116033, term116033.getClass(), "hasAccessDate", false);
        setLongField(term116033, term116033.getClass(), "creationDate", 0L);
        setLongField(term116033, term116033.getClass(), "lastModifiedDate", 0L);
        setLongField(term116033, term116033.getClass(), "accessDate", 0L);
        setBooleanField(term116033, term116033.getClass(), "hasWindowsAttributes", false);
        setIntField(term116033, term116033.getClass(), "windowsAttributes", 0);
        setBooleanField(term116033, term116033.getClass(), "hasCrc", false);
        setLongField(term116033, term116033.getClass(), "crc", 0L);
        setLongField(term116033, term116033.getClass(), "compressedCrc", 0L);
        setLongField(term116033, term116033.getClass(), "size", 0L);
        setLongField(term116033, term116033.getClass(), "compressedSize", 0L);
        ArrayList term116030 = new ArrayList();
        ((ArrayList) term116030).add(term116032);
        ((ArrayList) term116030).add(term116033);
        term116029 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term116029, term116029.getClass(), "file", null);
        setField(term116029, term116029.getClass(), "files", term116030);
        setIntField(term116029, term116029.getClass(), "numNonEmptyStreams", 0);
        setField(term116029, term116029.getClass(), "crc32", null);
        setField(term116029, term116029.getClass(), "compressedCrc32", null);
        setLongField(term116029, term116029.getClass(), "fileBytesWritten", 0L);
        setBooleanField(term116029, term116029.getClass(), "finished", false);
        setField(term116029, term116029.getClass(), "currentOutputStream", null);
        setField(term116029, term116029.getClass(), "contentCompression", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeFileAntiItems", argTypes, term105540, args);
        assertTrue(recursiveEquals(term105540, term116029));
    }

};


