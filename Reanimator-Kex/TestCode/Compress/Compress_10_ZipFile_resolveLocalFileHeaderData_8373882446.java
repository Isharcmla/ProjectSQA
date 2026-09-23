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
import java.util.LinkedHashMap;

public class ZipFile_resolveLocalFileHeaderData_8373882446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4642;
     Object term4726;
     Object term15819;
     Object term15831;

    public ZipFile_resolveLocalFileHeaderData_8373882446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4643 = new HashMap();
        HashMap term4667 = new HashMap();
        ArrayList term4717 = new ArrayList();
        ((ArrayList) term4717).add((Object)null);
        ((ArrayList) term4717).add((Object)null);
        term4642 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term4713 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term4714 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term4642, term4642.getClass(), "entries", term4643);
        setField(term4642, term4642.getClass(), "nameMap", term4667);
        setField(term4642, term4642.getClass(), "encoding", "OIHoJeysUi");
        setField(term4642, term4642.getClass(), "zipEncoding", null);
        setField(term4642, term4642.getClass(), "archiveName", "WXMWFDGcLB");
        setIntField(term4714, term4714.getClass(), "fd", -1);
        setLongField(term4714, term4714.getClass(), "handle", -1L);
        setField(term4714, term4714.getClass(), "parent", null);
        setField(term4714, term4714.getClass(), "otherParents", term4717);
        setBooleanField(term4714, term4714.getClass(), "closed", false);
        setBooleanField(term4714, term4714.getClass(), "append", false);
        setField(term4714, term4714.getClass(), "cleanup", null);
        setField(term4713, term4713.getClass(), "fd", term4714);
        setField(term4713, term4713.getClass(), "channel", null);
        setBooleanField(term4713, term4713.getClass(), "rw", false);
        setField(term4713, term4713.getClass(), "path", null);
        setField(term4713, term4713.getClass(), "closed", null);
        setField(term4642, term4642.getClass(), "archive", term4713);
        setBooleanField(term4642, term4642.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term4642, term4642.getClass(), "closed", false);
        setField(term4642, term4642.getClass(), "OFFSET_COMPARATOR", null);
        term4726 = new LinkedHashMap();
        HashMap term15820 = new HashMap();
        HashMap term15822 = new HashMap();
        ArrayList term15829 = new ArrayList();
        ((ArrayList) term15829).add((Object)null);
        ((ArrayList) term15829).add((Object)null);
        term15819 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term15827 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term15828 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term15819, term15819.getClass(), "entries", term15820);
        setField(term15819, term15819.getClass(), "nameMap", term15822);
        setField(term15819, term15819.getClass(), "encoding", "OIHoJeysUi");
        setField(term15819, term15819.getClass(), "zipEncoding", null);
        setField(term15819, term15819.getClass(), "archiveName", "WXMWFDGcLB");
        setIntField(term15828, term15828.getClass(), "fd", -1);
        setLongField(term15828, term15828.getClass(), "handle", -1L);
        setField(term15828, term15828.getClass(), "parent", null);
        setField(term15828, term15828.getClass(), "otherParents", term15829);
        setBooleanField(term15828, term15828.getClass(), "closed", false);
        setBooleanField(term15828, term15828.getClass(), "append", false);
        setField(term15828, term15828.getClass(), "cleanup", null);
        setField(term15827, term15827.getClass(), "fd", term15828);
        setField(term15827, term15827.getClass(), "channel", null);
        setBooleanField(term15827, term15827.getClass(), "rw", false);
        setField(term15827, term15827.getClass(), "path", null);
        setField(term15827, term15827.getClass(), "closed", null);
        setField(term15819, term15819.getClass(), "archive", term15827);
        setBooleanField(term15819, term15819.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term15819, term15819.getClass(), "closed", false);
        setField(term15819, term15819.getClass(), "OFFSET_COMPARATOR", null);
        term15831 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term4726;
        callMethod(klass, "resolveLocalFileHeaderData", argTypes, term4642, args);
        assertTrue(recursiveEquals(term4642, term15819));
        assertTrue(recursiveEquals(term4726, term15831));
    }

};


