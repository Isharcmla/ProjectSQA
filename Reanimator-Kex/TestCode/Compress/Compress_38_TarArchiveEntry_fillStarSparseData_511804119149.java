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
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class TarArchiveEntry_fillStarSparseData_511804119149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15775;
     Object term15839;
     Object term47095;
     Object term47114;

    public TarArchiveEntry_fillStarSparseData_511804119149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47137 = Class.forName((String) "java.io.File$PathStatus");
        Field term47136 = ((Class) term47137).getDeclaredField((String) "CHECKED");
        ((Field) term47136).setAccessible(true);
        Object enum192 = ((Field) term47136).get((Object) null);
        term15775 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term15814 = newInstance(Class.forName("java.io.File"));
        setField(term15775, term15775.getClass(), "name", "");
        setBooleanField(term15775, term15775.getClass(), "preserveLeadingSlashes", true);
        setIntField(term15775, term15775.getClass(), "mode", 2009020256);
        setLongField(term15775, term15775.getClass(), "userId", 6636235983121346803L);
        setLongField(term15775, term15775.getClass(), "groupId", 146749226579788091L);
        setLongField(term15775, term15775.getClass(), "size", -1279670138064751276L);
        setLongField(term15775, term15775.getClass(), "modTime", -7205236974351118210L);
        setBooleanField(term15775, term15775.getClass(), "checkSumOK", true);
        setByteField(term15775, term15775.getClass(), "linkFlag", (byte) -101);
        setField(term15775, term15775.getClass(), "linkName", "");
        setField(term15775, term15775.getClass(), "magic", "ustar ");
        setField(term15775, term15775.getClass(), "version", "00");
        setField(term15775, term15775.getClass(), "userName", "root");
        setField(term15775, term15775.getClass(), "groupName", "");
        setIntField(term15775, term15775.getClass(), "devMajor", 2049577015);
        setIntField(term15775, term15775.getClass(), "devMinor", 1236004505);
        setBooleanField(term15775, term15775.getClass(), "isExtended", false);
        setLongField(term15775, term15775.getClass(), "realSize", -2136893352275781569L);
        setBooleanField(term15775, term15775.getClass(), "paxGNUSparse", true);
        setBooleanField(term15775, term15775.getClass(), "starSparse", false);
        setField(term15814, term15814.getClass(), "path", "eVpkWxjuki");
        setField(term15814, term15814.getClass(), "status", enum192);
        setIntField(term15814, term15814.getClass(), "prefixLength", 1050765721);
        setField(term15814, term15814.getClass(), "filePath", null);
        setField(term15775, term15775.getClass(), "file", term15814);
        term15839 = new LinkedHashMap();
        Class<? extends Object> term47302 = Class.forName((String) "java.io.File$PathStatus");
        Field term47301 = ((Class) term47302).getDeclaredField((String) "CHECKED");
        ((Field) term47301).setAccessible(true);
        Object enum193 = ((Field) term47301).get((Object) null);
        term47095 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term47108 = newInstance(Class.forName("java.io.File"));
        setField(term47095, term47095.getClass(), "name", "");
        setBooleanField(term47095, term47095.getClass(), "preserveLeadingSlashes", true);
        setIntField(term47095, term47095.getClass(), "mode", 2009020256);
        setLongField(term47095, term47095.getClass(), "userId", 6636235983121346803L);
        setLongField(term47095, term47095.getClass(), "groupId", 146749226579788091L);
        setLongField(term47095, term47095.getClass(), "size", -1279670138064751276L);
        setLongField(term47095, term47095.getClass(), "modTime", -7205236974351118210L);
        setBooleanField(term47095, term47095.getClass(), "checkSumOK", true);
        setByteField(term47095, term47095.getClass(), "linkFlag", (byte) -101);
        setField(term47095, term47095.getClass(), "linkName", "");
        setField(term47095, term47095.getClass(), "magic", "ustar ");
        setField(term47095, term47095.getClass(), "version", "00");
        setField(term47095, term47095.getClass(), "userName", "root");
        setField(term47095, term47095.getClass(), "groupName", "");
        setIntField(term47095, term47095.getClass(), "devMajor", 2049577015);
        setIntField(term47095, term47095.getClass(), "devMinor", 1236004505);
        setBooleanField(term47095, term47095.getClass(), "isExtended", false);
        setLongField(term47095, term47095.getClass(), "realSize", -2136893352275781569L);
        setBooleanField(term47095, term47095.getClass(), "paxGNUSparse", true);
        setBooleanField(term47095, term47095.getClass(), "starSparse", true);
        setField(term47108, term47108.getClass(), "path", "eVpkWxjuki");
        setField(term47108, term47108.getClass(), "status", enum193);
        setIntField(term47108, term47108.getClass(), "prefixLength", 1050765721);
        setField(term47108, term47108.getClass(), "filePath", null);
        setField(term47095, term47095.getClass(), "file", term47108);
        term47114 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term15839;
        callMethod(klass, "fillStarSparseData", argTypes, term15775, args);
        assertTrue(recursiveEquals(term15775, term47095));
        assertTrue(recursiveEquals(term15839, term47114));
    }

};


