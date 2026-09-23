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

public class TarArchiveEntry_isFile_1241856310131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11587;
     Object term39674;

    public TarArchiveEntry_isFile_1241856310131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39777 = Class.forName((String) "java.io.File$PathStatus");
        Field term39776 = ((Class) term39777).getDeclaredField((String) "INVALID");
        ((Field) term39776).setAccessible(true);
        Object enum167 = ((Field) term39776).get((Object) null);
        term11587 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term11626 = newInstance(Class.forName("java.io.File"));
        setField(term11587, term11587.getClass(), "name", "");
        setBooleanField(term11587, term11587.getClass(), "preserveLeadingSlashes", false);
        setIntField(term11587, term11587.getClass(), "mode", -1310015129);
        setLongField(term11587, term11587.getClass(), "userId", 4576699120365923235L);
        setLongField(term11587, term11587.getClass(), "groupId", -1635471392209071620L);
        setLongField(term11587, term11587.getClass(), "size", -4714000263923324167L);
        setLongField(term11587, term11587.getClass(), "modTime", 6906379511067694917L);
        setBooleanField(term11587, term11587.getClass(), "checkSumOK", false);
        setByteField(term11587, term11587.getClass(), "linkFlag", (byte) 116);
        setField(term11587, term11587.getClass(), "linkName", "");
        setField(term11587, term11587.getClass(), "magic", "ustar ");
        setField(term11587, term11587.getClass(), "version", "00");
        setField(term11587, term11587.getClass(), "userName", "root");
        setField(term11587, term11587.getClass(), "groupName", "");
        setIntField(term11587, term11587.getClass(), "devMajor", -2104981311);
        setIntField(term11587, term11587.getClass(), "devMinor", -571169753);
        setBooleanField(term11587, term11587.getClass(), "isExtended", false);
        setLongField(term11587, term11587.getClass(), "realSize", -9204303423581447271L);
        setBooleanField(term11587, term11587.getClass(), "paxGNUSparse", false);
        setBooleanField(term11587, term11587.getClass(), "starSparse", false);
        setField(term11626, term11626.getClass(), "path", "hoicvmsovO");
        setField(term11626, term11626.getClass(), "status", enum167);
        setIntField(term11626, term11626.getClass(), "prefixLength", 318591690);
        setField(term11626, term11626.getClass(), "filePath", null);
        setField(term11587, term11587.getClass(), "file", term11626);
        Class<? extends Object> term39953 = Class.forName((String) "java.io.File$PathStatus");
        Field term39952 = ((Class) term39953).getDeclaredField((String) "INVALID");
        ((Field) term39952).setAccessible(true);
        Object enum168 = ((Field) term39952).get((Object) null);
        term39674 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term39693 = newInstance(Class.forName("java.io.File"));
        setField(term39674, term39674.getClass(), "name", "");
        setBooleanField(term39674, term39674.getClass(), "preserveLeadingSlashes", false);
        setIntField(term39674, term39674.getClass(), "mode", -1310015129);
        setLongField(term39674, term39674.getClass(), "userId", 4576699120365923235L);
        setLongField(term39674, term39674.getClass(), "groupId", -1635471392209071620L);
        setLongField(term39674, term39674.getClass(), "size", -4714000263923324167L);
        setLongField(term39674, term39674.getClass(), "modTime", 6906379511067694917L);
        setBooleanField(term39674, term39674.getClass(), "checkSumOK", false);
        setByteField(term39674, term39674.getClass(), "linkFlag", (byte) 116);
        setField(term39674, term39674.getClass(), "linkName", "");
        setField(term39674, term39674.getClass(), "magic", "ustar ");
        setField(term39674, term39674.getClass(), "version", "00");
        setField(term39674, term39674.getClass(), "userName", "root");
        setField(term39674, term39674.getClass(), "groupName", "");
        setIntField(term39674, term39674.getClass(), "devMajor", -2104981311);
        setIntField(term39674, term39674.getClass(), "devMinor", -571169753);
        setBooleanField(term39674, term39674.getClass(), "isExtended", false);
        setLongField(term39674, term39674.getClass(), "realSize", -9204303423581447271L);
        setBooleanField(term39674, term39674.getClass(), "paxGNUSparse", false);
        setBooleanField(term39674, term39674.getClass(), "starSparse", false);
        setField(term39693, term39693.getClass(), "path", "hoicvmsovO");
        setField(term39693, term39693.getClass(), "status", enum168);
        setIntField(term39693, term39693.getClass(), "prefixLength", 318591690);
        setField(term39693, term39693.getClass(), "filePath", null);
        setField(term39674, term39674.getClass(), "file", term39693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFile", argTypes, term11587, args);
        assertTrue(recursiveEquals(term11587, term39674));
    }

};


