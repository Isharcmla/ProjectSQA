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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class ZipFile_finalize_193261439837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2801;
     Object term12266;

    public ZipFile_finalize_193261439837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2802 = new HashMap();
        HashMap term2826 = new HashMap();
        ArrayList term2876 = new ArrayList();
        ((ArrayList) term2876).add((Object)null);
        ((ArrayList) term2876).add((Object)null);
        ((ArrayList) term2876).add((Object)null);
        ((ArrayList) term2876).add((Object)null);
        ((ArrayList) term2876).add((Object)null);
        ((ArrayList) term2876).add((Object)null);
        term2801 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term2872 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term2873 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term2801, term2801.getClass(), "entries", term2802);
        setField(term2801, term2801.getClass(), "nameMap", term2826);
        setField(term2801, term2801.getClass(), "encoding", "yGtHPyvYiQ");
        setField(term2801, term2801.getClass(), "zipEncoding", null);
        setField(term2801, term2801.getClass(), "archiveName", "MvRIxilFMJ");
        setIntField(term2873, term2873.getClass(), "fd", -1);
        setLongField(term2873, term2873.getClass(), "handle", -1L);
        setField(term2873, term2873.getClass(), "parent", null);
        setField(term2873, term2873.getClass(), "otherParents", term2876);
        setBooleanField(term2873, term2873.getClass(), "closed", true);
        setBooleanField(term2873, term2873.getClass(), "append", false);
        setField(term2873, term2873.getClass(), "cleanup", null);
        setField(term2872, term2872.getClass(), "fd", term2873);
        setField(term2872, term2872.getClass(), "channel", null);
        setBooleanField(term2872, term2872.getClass(), "rw", false);
        setField(term2872, term2872.getClass(), "path", null);
        setField(term2872, term2872.getClass(), "closed", null);
        setField(term2801, term2801.getClass(), "archive", term2872);
        setBooleanField(term2801, term2801.getClass(), "useUnicodeExtraFields", true);
        setBooleanField(term2801, term2801.getClass(), "closed", true);
        setField(term2801, term2801.getClass(), "OFFSET_COMPARATOR", null);
        HashMap term12267 = new HashMap();
        HashMap term12268 = new HashMap();
        ArrayList term12275 = new ArrayList();
        ((ArrayList) term12275).add((Object)null);
        ((ArrayList) term12275).add((Object)null);
        ((ArrayList) term12275).add((Object)null);
        ((ArrayList) term12275).add((Object)null);
        ((ArrayList) term12275).add((Object)null);
        ((ArrayList) term12275).add((Object)null);
        term12266 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term12273 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term12274 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term12266, term12266.getClass(), "entries", term12267);
        setField(term12266, term12266.getClass(), "nameMap", term12268);
        setField(term12266, term12266.getClass(), "encoding", "yGtHPyvYiQ");
        setField(term12266, term12266.getClass(), "zipEncoding", null);
        setField(term12266, term12266.getClass(), "archiveName", "MvRIxilFMJ");
        setIntField(term12274, term12274.getClass(), "fd", -1);
        setLongField(term12274, term12274.getClass(), "handle", -1L);
        setField(term12274, term12274.getClass(), "parent", null);
        setField(term12274, term12274.getClass(), "otherParents", term12275);
        setBooleanField(term12274, term12274.getClass(), "closed", true);
        setBooleanField(term12274, term12274.getClass(), "append", false);
        setField(term12274, term12274.getClass(), "cleanup", null);
        setField(term12273, term12273.getClass(), "fd", term12274);
        setField(term12273, term12273.getClass(), "channel", null);
        setBooleanField(term12273, term12273.getClass(), "rw", false);
        setField(term12273, term12273.getClass(), "path", null);
        setField(term12273, term12273.getClass(), "closed", null);
        setField(term12266, term12266.getClass(), "archive", term12273);
        setBooleanField(term12266, term12266.getClass(), "useUnicodeExtraFields", true);
        setBooleanField(term12266, term12266.getClass(), "closed", true);
        setField(term12266, term12266.getClass(), "OFFSET_COMPARATOR", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finalize", argTypes, term2801, args);
        assertTrue(recursiveEquals(term2801, term12266));
    }

};


