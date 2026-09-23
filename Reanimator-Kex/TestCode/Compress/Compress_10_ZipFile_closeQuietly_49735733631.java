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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class ZipFile_closeQuietly_49735733631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;

    public ZipFile_closeQuietly_49735733631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term878 = new HashMap();
        HashMap term902 = new HashMap();
        ArrayList term952 = new ArrayList();
        ((ArrayList) term952).add((Object)null);
        ((ArrayList) term952).add((Object)null);
        ((ArrayList) term952).add((Object)null);
        ((ArrayList) term952).add((Object)null);
        ((ArrayList) term952).add((Object)null);
        term877 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term948 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term949 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term877, term877.getClass(), "entries", term878);
        setField(term877, term877.getClass(), "nameMap", term902);
        setField(term877, term877.getClass(), "encoding", "aKnKipADSo");
        setField(term877, term877.getClass(), "zipEncoding", null);
        setField(term877, term877.getClass(), "archiveName", "wSQxaModmm");
        setIntField(term949, term949.getClass(), "fd", -1);
        setLongField(term949, term949.getClass(), "handle", -1L);
        setField(term949, term949.getClass(), "parent", null);
        setField(term949, term949.getClass(), "otherParents", term952);
        setBooleanField(term949, term949.getClass(), "closed", true);
        setBooleanField(term949, term949.getClass(), "append", false);
        setField(term949, term949.getClass(), "cleanup", null);
        setField(term948, term948.getClass(), "fd", term949);
        setField(term948, term948.getClass(), "channel", null);
        setBooleanField(term948, term948.getClass(), "rw", false);
        setField(term948, term948.getClass(), "path", null);
        setField(term948, term948.getClass(), "closed", null);
        setField(term877, term877.getClass(), "archive", term948);
        setBooleanField(term877, term877.getClass(), "useUnicodeExtraFields", true);
        setBooleanField(term877, term877.getClass(), "closed", false);
        setField(term877, term877.getClass(), "OFFSET_COMPARATOR", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Object[] args = new Object[1];
        args[0] = term877;
        try {
            callMethod(klass, "closeQuietly", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


