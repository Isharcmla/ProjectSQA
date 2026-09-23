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

public class TarArchiveEntry_isCheckSumOK_838217543111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7001;
     Object term31323;

    public TarArchiveEntry_isCheckSumOK_838217543111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31364 = Class.forName((String) "java.io.File$PathStatus");
        Field term31363 = ((Class) term31364).getDeclaredField((String) "CHECKED");
        ((Field) term31363).setAccessible(true);
        Object enum129 = ((Field) term31363).get((Object) null);
        term7001 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term7040 = newInstance(Class.forName("java.io.File"));
        setField(term7001, term7001.getClass(), "name", "");
        setBooleanField(term7001, term7001.getClass(), "preserveLeadingSlashes", false);
        setIntField(term7001, term7001.getClass(), "mode", 1474524152);
        setLongField(term7001, term7001.getClass(), "userId", 138235087558060686L);
        setLongField(term7001, term7001.getClass(), "groupId", 5381386339318883012L);
        setLongField(term7001, term7001.getClass(), "size", -1333707622307134180L);
        setLongField(term7001, term7001.getClass(), "modTime", -4360569253593381888L);
        setBooleanField(term7001, term7001.getClass(), "checkSumOK", false);
        setByteField(term7001, term7001.getClass(), "linkFlag", (byte) 111);
        setField(term7001, term7001.getClass(), "linkName", "");
        setField(term7001, term7001.getClass(), "magic", "ustar ");
        setField(term7001, term7001.getClass(), "version", "00");
        setField(term7001, term7001.getClass(), "userName", "root");
        setField(term7001, term7001.getClass(), "groupName", "");
        setIntField(term7001, term7001.getClass(), "devMajor", 568954359);
        setIntField(term7001, term7001.getClass(), "devMinor", 53410913);
        setBooleanField(term7001, term7001.getClass(), "isExtended", true);
        setLongField(term7001, term7001.getClass(), "realSize", 1457594663983990440L);
        setBooleanField(term7001, term7001.getClass(), "paxGNUSparse", true);
        setBooleanField(term7001, term7001.getClass(), "starSparse", false);
        setField(term7040, term7040.getClass(), "path", "gGSMzuGICf");
        setField(term7040, term7040.getClass(), "status", enum129);
        setIntField(term7040, term7040.getClass(), "prefixLength", -375014958);
        setField(term7040, term7040.getClass(), "filePath", null);
        setField(term7001, term7001.getClass(), "file", term7040);
        Class<? extends Object> term31529 = Class.forName((String) "java.io.File$PathStatus");
        Field term31528 = ((Class) term31529).getDeclaredField((String) "CHECKED");
        ((Field) term31528).setAccessible(true);
        Object enum130 = ((Field) term31528).get((Object) null);
        term31323 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term31336 = newInstance(Class.forName("java.io.File"));
        setField(term31323, term31323.getClass(), "name", "");
        setBooleanField(term31323, term31323.getClass(), "preserveLeadingSlashes", false);
        setIntField(term31323, term31323.getClass(), "mode", 1474524152);
        setLongField(term31323, term31323.getClass(), "userId", 138235087558060686L);
        setLongField(term31323, term31323.getClass(), "groupId", 5381386339318883012L);
        setLongField(term31323, term31323.getClass(), "size", -1333707622307134180L);
        setLongField(term31323, term31323.getClass(), "modTime", -4360569253593381888L);
        setBooleanField(term31323, term31323.getClass(), "checkSumOK", false);
        setByteField(term31323, term31323.getClass(), "linkFlag", (byte) 111);
        setField(term31323, term31323.getClass(), "linkName", "");
        setField(term31323, term31323.getClass(), "magic", "ustar ");
        setField(term31323, term31323.getClass(), "version", "00");
        setField(term31323, term31323.getClass(), "userName", "root");
        setField(term31323, term31323.getClass(), "groupName", "");
        setIntField(term31323, term31323.getClass(), "devMajor", 568954359);
        setIntField(term31323, term31323.getClass(), "devMinor", 53410913);
        setBooleanField(term31323, term31323.getClass(), "isExtended", true);
        setLongField(term31323, term31323.getClass(), "realSize", 1457594663983990440L);
        setBooleanField(term31323, term31323.getClass(), "paxGNUSparse", true);
        setBooleanField(term31323, term31323.getClass(), "starSparse", false);
        setField(term31336, term31336.getClass(), "path", "gGSMzuGICf");
        setField(term31336, term31336.getClass(), "status", enum130);
        setIntField(term31336, term31336.getClass(), "prefixLength", -375014958);
        setField(term31336, term31336.getClass(), "filePath", null);
        setField(term31323, term31323.getClass(), "file", term31336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCheckSumOK", argTypes, term7001, args);
        assertTrue(recursiveEquals(term7001, term31323));
    }

};


