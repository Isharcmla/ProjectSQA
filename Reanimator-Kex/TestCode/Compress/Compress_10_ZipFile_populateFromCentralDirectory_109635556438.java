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

public class ZipFile_populateFromCentralDirectory_109635556438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2905;

    public ZipFile_populateFromCentralDirectory_109635556438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2906 = new HashMap();
        HashMap term2930 = new HashMap();
        ArrayList term2980 = new ArrayList();
        ((ArrayList) term2980).add((Object)null);
        ((ArrayList) term2980).add((Object)null);
        ((ArrayList) term2980).add((Object)null);
        ((ArrayList) term2980).add((Object)null);
        ((ArrayList) term2980).add((Object)null);
        ((ArrayList) term2980).add((Object)null);
        term2905 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term2976 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term2977 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term2905, term2905.getClass(), "entries", term2906);
        setField(term2905, term2905.getClass(), "nameMap", term2930);
        setField(term2905, term2905.getClass(), "encoding", "lHfTrWKMPk");
        setField(term2905, term2905.getClass(), "zipEncoding", null);
        setField(term2905, term2905.getClass(), "archiveName", "JDaAnsVTGV");
        setIntField(term2977, term2977.getClass(), "fd", -1);
        setLongField(term2977, term2977.getClass(), "handle", -1L);
        setField(term2977, term2977.getClass(), "parent", null);
        setField(term2977, term2977.getClass(), "otherParents", term2980);
        setBooleanField(term2977, term2977.getClass(), "closed", true);
        setBooleanField(term2977, term2977.getClass(), "append", true);
        setField(term2977, term2977.getClass(), "cleanup", null);
        setField(term2976, term2976.getClass(), "fd", term2977);
        setField(term2976, term2976.getClass(), "channel", null);
        setBooleanField(term2976, term2976.getClass(), "rw", false);
        setField(term2976, term2976.getClass(), "path", null);
        setField(term2976, term2976.getClass(), "closed", null);
        setField(term2905, term2905.getClass(), "archive", term2976);
        setBooleanField(term2905, term2905.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term2905, term2905.getClass(), "closed", false);
        setField(term2905, term2905.getClass(), "OFFSET_COMPARATOR", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "populateFromCentralDirectory", argTypes, term2905, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


