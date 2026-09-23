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
import java.lang.Long;

public class TarArchiveEntry_setUserId_72650312296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3464;
     Object term3528;
     Object term24917;

    public TarArchiveEntry_setUserId_72650312296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24959 = Class.forName((String) "java.io.File$PathStatus");
        Field term24958 = ((Class) term24959).getDeclaredField((String) "CHECKED");
        ((Field) term24958).setAccessible(true);
        Object enum99 = ((Field) term24958).get((Object) null);
        term3464 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3503 = newInstance(Class.forName("java.io.File"));
        setField(term3464, term3464.getClass(), "name", "");
        setBooleanField(term3464, term3464.getClass(), "preserveLeadingSlashes", false);
        setIntField(term3464, term3464.getClass(), "mode", 1596070772);
        setLongField(term3464, term3464.getClass(), "userId", -5248475803419977214L);
        setLongField(term3464, term3464.getClass(), "groupId", -6723783499250797216L);
        setLongField(term3464, term3464.getClass(), "size", 41775768178052008L);
        setLongField(term3464, term3464.getClass(), "modTime", 6682528376118987775L);
        setBooleanField(term3464, term3464.getClass(), "checkSumOK", false);
        setByteField(term3464, term3464.getClass(), "linkFlag", (byte) -111);
        setField(term3464, term3464.getClass(), "linkName", "");
        setField(term3464, term3464.getClass(), "magic", "ustar ");
        setField(term3464, term3464.getClass(), "version", "00");
        setField(term3464, term3464.getClass(), "userName", "root");
        setField(term3464, term3464.getClass(), "groupName", "");
        setIntField(term3464, term3464.getClass(), "devMajor", 97029295);
        setIntField(term3464, term3464.getClass(), "devMinor", -1371869594);
        setBooleanField(term3464, term3464.getClass(), "isExtended", false);
        setLongField(term3464, term3464.getClass(), "realSize", 682356318767179819L);
        setBooleanField(term3464, term3464.getClass(), "paxGNUSparse", false);
        setBooleanField(term3464, term3464.getClass(), "starSparse", true);
        setField(term3503, term3503.getClass(), "path", "eZFUvlxvGV");
        setField(term3503, term3503.getClass(), "status", enum99);
        setIntField(term3503, term3503.getClass(), "prefixLength", -2095575670);
        setField(term3503, term3503.getClass(), "filePath", null);
        setField(term3464, term3464.getClass(), "file", term3503);
        term3528 = new Long(-7291743527973326814L);
        Class<? extends Object> term25167 = Class.forName((String) "java.io.File$PathStatus");
        Field term25165 = ((Class) term25167).getDeclaredField((String) "CHECKED");
        ((Field) term25165).setAccessible(true);
        Object enum100 = ((Field) term25165).get((Object) null);
        term24917 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term24930 = newInstance(Class.forName("java.io.File"));
        setField(term24917, term24917.getClass(), "name", "");
        setBooleanField(term24917, term24917.getClass(), "preserveLeadingSlashes", false);
        setIntField(term24917, term24917.getClass(), "mode", 1596070772);
        setLongField(term24917, term24917.getClass(), "userId", -7291743527973326814L);
        setLongField(term24917, term24917.getClass(), "groupId", -6723783499250797216L);
        setLongField(term24917, term24917.getClass(), "size", 41775768178052008L);
        setLongField(term24917, term24917.getClass(), "modTime", 6682528376118987775L);
        setBooleanField(term24917, term24917.getClass(), "checkSumOK", false);
        setByteField(term24917, term24917.getClass(), "linkFlag", (byte) -111);
        setField(term24917, term24917.getClass(), "linkName", "");
        setField(term24917, term24917.getClass(), "magic", "ustar ");
        setField(term24917, term24917.getClass(), "version", "00");
        setField(term24917, term24917.getClass(), "userName", "root");
        setField(term24917, term24917.getClass(), "groupName", "");
        setIntField(term24917, term24917.getClass(), "devMajor", 97029295);
        setIntField(term24917, term24917.getClass(), "devMinor", -1371869594);
        setBooleanField(term24917, term24917.getClass(), "isExtended", false);
        setLongField(term24917, term24917.getClass(), "realSize", 682356318767179819L);
        setBooleanField(term24917, term24917.getClass(), "paxGNUSparse", false);
        setBooleanField(term24917, term24917.getClass(), "starSparse", true);
        setField(term24930, term24930.getClass(), "path", "eZFUvlxvGV");
        setField(term24930, term24930.getClass(), "status", enum100);
        setIntField(term24930, term24930.getClass(), "prefixLength", -2095575670);
        setField(term24930, term24930.getClass(), "filePath", null);
        setField(term24917, term24917.getClass(), "file", term24930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3528;
        callMethod(klass, "setUserId", argTypes, term3464, args);
        assertTrue(recursiveEquals(term3464, term24917));
        assertTrue(recursiveEquals(term3528, -7291743527973326814L));
    }

};


