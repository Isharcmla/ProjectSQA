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

public class ZipFile_getEntry_59108346834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1189;
     Object term9351;

    public ZipFile_getEntry_59108346834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1190 = new HashMap();
        HashMap term1214 = new HashMap();
        ArrayList term1264 = new ArrayList();
        ((ArrayList) term1264).add((Object)null);
        ((ArrayList) term1264).add((Object)null);
        ((ArrayList) term1264).add((Object)null);
        ((ArrayList) term1264).add((Object)null);
        ((ArrayList) term1264).add((Object)null);
        term1189 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term1260 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term1261 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term1189, term1189.getClass(), "entries", term1190);
        setField(term1189, term1189.getClass(), "nameMap", term1214);
        setField(term1189, term1189.getClass(), "encoding", "JUmudUmaaV");
        setField(term1189, term1189.getClass(), "zipEncoding", null);
        setField(term1189, term1189.getClass(), "archiveName", "KoyGrUJeJW");
        setIntField(term1261, term1261.getClass(), "fd", -1);
        setLongField(term1261, term1261.getClass(), "handle", -1L);
        setField(term1261, term1261.getClass(), "parent", null);
        setField(term1261, term1261.getClass(), "otherParents", term1264);
        setBooleanField(term1261, term1261.getClass(), "closed", true);
        setBooleanField(term1261, term1261.getClass(), "append", true);
        setField(term1261, term1261.getClass(), "cleanup", null);
        setField(term1260, term1260.getClass(), "fd", term1261);
        setField(term1260, term1260.getClass(), "channel", null);
        setBooleanField(term1260, term1260.getClass(), "rw", false);
        setField(term1260, term1260.getClass(), "path", null);
        setField(term1260, term1260.getClass(), "closed", null);
        setField(term1189, term1189.getClass(), "archive", term1260);
        setBooleanField(term1189, term1189.getClass(), "useUnicodeExtraFields", true);
        setBooleanField(term1189, term1189.getClass(), "closed", true);
        setField(term1189, term1189.getClass(), "OFFSET_COMPARATOR", null);
        HashMap term9352 = new HashMap();
        HashMap term9353 = new HashMap();
        ArrayList term9360 = new ArrayList();
        ((ArrayList) term9360).add((Object)null);
        ((ArrayList) term9360).add((Object)null);
        ((ArrayList) term9360).add((Object)null);
        ((ArrayList) term9360).add((Object)null);
        ((ArrayList) term9360).add((Object)null);
        term9351 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term9358 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term9359 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term9351, term9351.getClass(), "entries", term9352);
        setField(term9351, term9351.getClass(), "nameMap", term9353);
        setField(term9351, term9351.getClass(), "encoding", "JUmudUmaaV");
        setField(term9351, term9351.getClass(), "zipEncoding", null);
        setField(term9351, term9351.getClass(), "archiveName", "KoyGrUJeJW");
        setIntField(term9359, term9359.getClass(), "fd", -1);
        setLongField(term9359, term9359.getClass(), "handle", -1L);
        setField(term9359, term9359.getClass(), "parent", null);
        setField(term9359, term9359.getClass(), "otherParents", term9360);
        setBooleanField(term9359, term9359.getClass(), "closed", true);
        setBooleanField(term9359, term9359.getClass(), "append", true);
        setField(term9359, term9359.getClass(), "cleanup", null);
        setField(term9358, term9358.getClass(), "fd", term9359);
        setField(term9358, term9358.getClass(), "channel", null);
        setBooleanField(term9358, term9358.getClass(), "rw", false);
        setField(term9358, term9358.getClass(), "path", null);
        setField(term9358, term9358.getClass(), "closed", null);
        setField(term9351, term9351.getClass(), "archive", term9358);
        setBooleanField(term9351, term9351.getClass(), "useUnicodeExtraFields", true);
        setBooleanField(term9351, term9351.getClass(), "closed", true);
        setField(term9351, term9351.getClass(), "OFFSET_COMPARATOR", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HqBOwkVqjD";
        Object retValue = callMethod(klass, "getEntry", argTypes, term1189, args);
        assertTrue(recursiveEquals(term1189, term9351));
        assertTrue(recursiveEquals(retValue, null));
    }

};


