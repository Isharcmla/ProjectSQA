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

public class TarArchiveEntry_isGlobalPaxHeader_54701655129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11129;
     Object term38821;

    public TarArchiveEntry_isGlobalPaxHeader_54701655129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38863 = Class.forName((String) "java.io.File$PathStatus");
        Field term38862 = ((Class) term38863).getDeclaredField((String) "CHECKED");
        ((Field) term38862).setAccessible(true);
        Object enum163 = ((Field) term38862).get((Object) null);
        term11129 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term11168 = newInstance(Class.forName("java.io.File"));
        setField(term11129, term11129.getClass(), "name", "");
        setBooleanField(term11129, term11129.getClass(), "preserveLeadingSlashes", true);
        setIntField(term11129, term11129.getClass(), "mode", -1945706126);
        setLongField(term11129, term11129.getClass(), "userId", 868503089567085985L);
        setLongField(term11129, term11129.getClass(), "groupId", -3277773415369003529L);
        setLongField(term11129, term11129.getClass(), "size", 1253549421411622358L);
        setLongField(term11129, term11129.getClass(), "modTime", 3666226122807672448L);
        setBooleanField(term11129, term11129.getClass(), "checkSumOK", true);
        setByteField(term11129, term11129.getClass(), "linkFlag", (byte) -92);
        setField(term11129, term11129.getClass(), "linkName", "");
        setField(term11129, term11129.getClass(), "magic", "ustar ");
        setField(term11129, term11129.getClass(), "version", "00");
        setField(term11129, term11129.getClass(), "userName", "root");
        setField(term11129, term11129.getClass(), "groupName", "");
        setIntField(term11129, term11129.getClass(), "devMajor", 1152356969);
        setIntField(term11129, term11129.getClass(), "devMinor", -1667990367);
        setBooleanField(term11129, term11129.getClass(), "isExtended", false);
        setLongField(term11129, term11129.getClass(), "realSize", 3108750145697087661L);
        setBooleanField(term11129, term11129.getClass(), "paxGNUSparse", false);
        setBooleanField(term11129, term11129.getClass(), "starSparse", true);
        setField(term11168, term11168.getClass(), "path", "ieCtQFdkii");
        setField(term11168, term11168.getClass(), "status", enum163);
        setIntField(term11168, term11168.getClass(), "prefixLength", -1214628358);
        setField(term11168, term11168.getClass(), "filePath", null);
        setField(term11129, term11129.getClass(), "file", term11168);
        Class<? extends Object> term39377 = Class.forName((String) "java.io.File$PathStatus");
        Field term39376 = ((Class) term39377).getDeclaredField((String) "CHECKED");
        ((Field) term39376).setAccessible(true);
        Object enum166 = ((Field) term39376).get((Object) null);
        term38821 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term38834 = newInstance(Class.forName("java.io.File"));
        setField(term38821, term38821.getClass(), "name", "");
        setBooleanField(term38821, term38821.getClass(), "preserveLeadingSlashes", true);
        setIntField(term38821, term38821.getClass(), "mode", -1945706126);
        setLongField(term38821, term38821.getClass(), "userId", 868503089567085985L);
        setLongField(term38821, term38821.getClass(), "groupId", -3277773415369003529L);
        setLongField(term38821, term38821.getClass(), "size", 1253549421411622358L);
        setLongField(term38821, term38821.getClass(), "modTime", 3666226122807672448L);
        setBooleanField(term38821, term38821.getClass(), "checkSumOK", true);
        setByteField(term38821, term38821.getClass(), "linkFlag", (byte) -92);
        setField(term38821, term38821.getClass(), "linkName", "");
        setField(term38821, term38821.getClass(), "magic", "ustar ");
        setField(term38821, term38821.getClass(), "version", "00");
        setField(term38821, term38821.getClass(), "userName", "root");
        setField(term38821, term38821.getClass(), "groupName", "");
        setIntField(term38821, term38821.getClass(), "devMajor", 1152356969);
        setIntField(term38821, term38821.getClass(), "devMinor", -1667990367);
        setBooleanField(term38821, term38821.getClass(), "isExtended", false);
        setLongField(term38821, term38821.getClass(), "realSize", 3108750145697087661L);
        setBooleanField(term38821, term38821.getClass(), "paxGNUSparse", false);
        setBooleanField(term38821, term38821.getClass(), "starSparse", true);
        setField(term38834, term38834.getClass(), "path", "ieCtQFdkii");
        setField(term38834, term38834.getClass(), "status", enum166);
        setIntField(term38834, term38834.getClass(), "prefixLength", -1214628358);
        setField(term38834, term38834.getClass(), "filePath", null);
        setField(term38821, term38821.getClass(), "file", term38834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGlobalPaxHeader", argTypes, term11129, args);
        assertTrue(recursiveEquals(term11129, term38821));
        assertTrue(recursiveEquals(retValue, false));
    }

};


