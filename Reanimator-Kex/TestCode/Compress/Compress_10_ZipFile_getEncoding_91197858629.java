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

public class ZipFile_getEncoding_91197858629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;
     Object term8486;

    public ZipFile_getEncoding_91197858629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term670 = new HashMap();
        HashMap term694 = new HashMap();
        ArrayList term744 = new ArrayList();
        ((ArrayList) term744).add((Object)null);
        ((ArrayList) term744).add((Object)null);
        ((ArrayList) term744).add((Object)null);
        ((ArrayList) term744).add((Object)null);
        ((ArrayList) term744).add((Object)null);
        ((ArrayList) term744).add((Object)null);
        ((ArrayList) term744).add((Object)null);
        term669 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term740 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term741 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term669, term669.getClass(), "entries", term670);
        setField(term669, term669.getClass(), "nameMap", term694);
        setField(term669, term669.getClass(), "encoding", "tbcdzjIfER");
        setField(term669, term669.getClass(), "zipEncoding", null);
        setField(term669, term669.getClass(), "archiveName", "HyxfbSQYBe");
        setIntField(term741, term741.getClass(), "fd", -1);
        setLongField(term741, term741.getClass(), "handle", -1L);
        setField(term741, term741.getClass(), "parent", null);
        setField(term741, term741.getClass(), "otherParents", term744);
        setBooleanField(term741, term741.getClass(), "closed", false);
        setBooleanField(term741, term741.getClass(), "append", false);
        setField(term741, term741.getClass(), "cleanup", null);
        setField(term740, term740.getClass(), "fd", term741);
        setField(term740, term740.getClass(), "channel", null);
        setBooleanField(term740, term740.getClass(), "rw", false);
        setField(term740, term740.getClass(), "path", null);
        setField(term740, term740.getClass(), "closed", null);
        setField(term669, term669.getClass(), "archive", term740);
        setBooleanField(term669, term669.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term669, term669.getClass(), "closed", true);
        setField(term669, term669.getClass(), "OFFSET_COMPARATOR", null);
        HashMap term8487 = new HashMap();
        HashMap term8488 = new HashMap();
        ArrayList term8495 = new ArrayList();
        ((ArrayList) term8495).add((Object)null);
        ((ArrayList) term8495).add((Object)null);
        ((ArrayList) term8495).add((Object)null);
        ((ArrayList) term8495).add((Object)null);
        ((ArrayList) term8495).add((Object)null);
        ((ArrayList) term8495).add((Object)null);
        ((ArrayList) term8495).add((Object)null);
        term8486 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term8493 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term8494 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term8486, term8486.getClass(), "entries", term8487);
        setField(term8486, term8486.getClass(), "nameMap", term8488);
        setField(term8486, term8486.getClass(), "encoding", "tbcdzjIfER");
        setField(term8486, term8486.getClass(), "zipEncoding", null);
        setField(term8486, term8486.getClass(), "archiveName", "HyxfbSQYBe");
        setIntField(term8494, term8494.getClass(), "fd", -1);
        setLongField(term8494, term8494.getClass(), "handle", -1L);
        setField(term8494, term8494.getClass(), "parent", null);
        setField(term8494, term8494.getClass(), "otherParents", term8495);
        setBooleanField(term8494, term8494.getClass(), "closed", false);
        setBooleanField(term8494, term8494.getClass(), "append", false);
        setField(term8494, term8494.getClass(), "cleanup", null);
        setField(term8493, term8493.getClass(), "fd", term8494);
        setField(term8493, term8493.getClass(), "channel", null);
        setBooleanField(term8493, term8493.getClass(), "rw", false);
        setField(term8493, term8493.getClass(), "path", null);
        setField(term8493, term8493.getClass(), "closed", null);
        setField(term8486, term8486.getClass(), "archive", term8493);
        setBooleanField(term8486, term8486.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term8486, term8486.getClass(), "closed", true);
        setField(term8486, term8486.getClass(), "OFFSET_COMPARATOR", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncoding", argTypes, term669, args);
        assertTrue(recursiveEquals(term669, term8486));
    }

};


