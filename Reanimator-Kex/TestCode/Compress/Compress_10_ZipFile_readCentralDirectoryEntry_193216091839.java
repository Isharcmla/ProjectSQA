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
import java.io.IOException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ZipFile_readCentralDirectoryEntry_193216091839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3009;
     Object term3093;

    public ZipFile_readCentralDirectoryEntry_193216091839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3010 = new HashMap();
        HashMap term3034 = new HashMap();
        ArrayList term3084 = new ArrayList();
        ((ArrayList) term3084).add((Object)null);
        term3009 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term3080 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term3081 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term3009, term3009.getClass(), "entries", term3010);
        setField(term3009, term3009.getClass(), "nameMap", term3034);
        setField(term3009, term3009.getClass(), "encoding", "wfaXBpWAUH");
        setField(term3009, term3009.getClass(), "zipEncoding", null);
        setField(term3009, term3009.getClass(), "archiveName", "VMeAzAHwZj");
        setIntField(term3081, term3081.getClass(), "fd", -1);
        setLongField(term3081, term3081.getClass(), "handle", -1L);
        setField(term3081, term3081.getClass(), "parent", null);
        setField(term3081, term3081.getClass(), "otherParents", term3084);
        setBooleanField(term3081, term3081.getClass(), "closed", false);
        setBooleanField(term3081, term3081.getClass(), "append", true);
        setField(term3081, term3081.getClass(), "cleanup", null);
        setField(term3080, term3080.getClass(), "fd", term3081);
        setField(term3080, term3080.getClass(), "channel", null);
        setBooleanField(term3080, term3080.getClass(), "rw", false);
        setField(term3080, term3080.getClass(), "path", null);
        setField(term3080, term3080.getClass(), "closed", null);
        setField(term3009, term3009.getClass(), "archive", term3080);
        setBooleanField(term3009, term3009.getClass(), "useUnicodeExtraFields", true);
        setBooleanField(term3009, term3009.getClass(), "closed", false);
        setField(term3009, term3009.getClass(), "OFFSET_COMPARATOR", null);
        term3093 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term3093;
        try {
            callMethod(klass, "readCentralDirectoryEntry", argTypes, term3009, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


