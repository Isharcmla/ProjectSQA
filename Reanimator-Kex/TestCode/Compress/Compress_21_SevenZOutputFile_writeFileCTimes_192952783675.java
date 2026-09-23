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

public class SevenZOutputFile_writeFileCTimes_192952783675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40748;
     Object term41239;

    public SevenZOutputFile_writeFileCTimes_192952783675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40932 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setBooleanField(term40932, term40932.getClass(), "hasCreationDate", false);
        ArrayList term40800 = new ArrayList();
        ((ArrayList) term40800).add(term40932);
        term40748 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term40748, term40748.getClass(), "files", term40800);
        Object term41242 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term41242, term41242.getClass(), "name", null);
        setBooleanField(term41242, term41242.getClass(), "hasStream", false);
        setBooleanField(term41242, term41242.getClass(), "isDirectory", false);
        setBooleanField(term41242, term41242.getClass(), "isAntiItem", false);
        setBooleanField(term41242, term41242.getClass(), "hasCreationDate", false);
        setBooleanField(term41242, term41242.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term41242, term41242.getClass(), "hasAccessDate", false);
        setLongField(term41242, term41242.getClass(), "creationDate", 0L);
        setLongField(term41242, term41242.getClass(), "lastModifiedDate", 0L);
        setLongField(term41242, term41242.getClass(), "accessDate", 0L);
        setBooleanField(term41242, term41242.getClass(), "hasWindowsAttributes", false);
        setIntField(term41242, term41242.getClass(), "windowsAttributes", 0);
        setBooleanField(term41242, term41242.getClass(), "hasCrc", false);
        setLongField(term41242, term41242.getClass(), "crc", 0L);
        setLongField(term41242, term41242.getClass(), "compressedCrc", 0L);
        setLongField(term41242, term41242.getClass(), "size", 0L);
        setLongField(term41242, term41242.getClass(), "compressedSize", 0L);
        ArrayList term41240 = new ArrayList();
        ((ArrayList) term41240).add(term41242);
        term41239 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term41239, term41239.getClass(), "file", null);
        setField(term41239, term41239.getClass(), "files", term41240);
        setIntField(term41239, term41239.getClass(), "numNonEmptyStreams", 0);
        setField(term41239, term41239.getClass(), "crc32", null);
        setField(term41239, term41239.getClass(), "compressedCrc32", null);
        setLongField(term41239, term41239.getClass(), "fileBytesWritten", 0L);
        setBooleanField(term41239, term41239.getClass(), "finished", false);
        setField(term41239, term41239.getClass(), "currentOutputStream", null);
        setField(term41239, term41239.getClass(), "contentCompression", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeFileCTimes", argTypes, term40748, args);
        assertTrue(recursiveEquals(term40748, term41239));
    }

};


