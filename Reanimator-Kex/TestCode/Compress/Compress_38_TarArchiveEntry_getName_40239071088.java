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

public class TarArchiveEntry_getName_40239071088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1584;
     Object term21491;

    public TarArchiveEntry_getName_40239071088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21532 = Class.forName((String) "java.io.File$PathStatus");
        Field term21531 = ((Class) term21532).getDeclaredField((String) "INVALID");
        ((Field) term21531).setAccessible(true);
        Object enum83 = ((Field) term21531).get((Object) null);
        term1584 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1623 = newInstance(Class.forName("java.io.File"));
        setField(term1584, term1584.getClass(), "name", "");
        setBooleanField(term1584, term1584.getClass(), "preserveLeadingSlashes", true);
        setIntField(term1584, term1584.getClass(), "mode", 590364439);
        setLongField(term1584, term1584.getClass(), "userId", 6855071767938501807L);
        setLongField(term1584, term1584.getClass(), "groupId", -5892135042702373494L);
        setLongField(term1584, term1584.getClass(), "size", 5262507301787091109L);
        setLongField(term1584, term1584.getClass(), "modTime", -6823727938421990489L);
        setBooleanField(term1584, term1584.getClass(), "checkSumOK", true);
        setByteField(term1584, term1584.getClass(), "linkFlag", (byte) 67);
        setField(term1584, term1584.getClass(), "linkName", "");
        setField(term1584, term1584.getClass(), "magic", "ustar ");
        setField(term1584, term1584.getClass(), "version", "00");
        setField(term1584, term1584.getClass(), "userName", "root");
        setField(term1584, term1584.getClass(), "groupName", "");
        setIntField(term1584, term1584.getClass(), "devMajor", 865208305);
        setIntField(term1584, term1584.getClass(), "devMinor", -1275173084);
        setBooleanField(term1584, term1584.getClass(), "isExtended", false);
        setLongField(term1584, term1584.getClass(), "realSize", -484994522244390100L);
        setBooleanField(term1584, term1584.getClass(), "paxGNUSparse", true);
        setBooleanField(term1584, term1584.getClass(), "starSparse", true);
        setField(term1623, term1623.getClass(), "path", "LQFpaHEwXR");
        setField(term1623, term1623.getClass(), "status", enum83);
        setIntField(term1623, term1623.getClass(), "prefixLength", -244121226);
        setField(term1623, term1623.getClass(), "filePath", null);
        setField(term1584, term1584.getClass(), "file", term1623);
        Class<? extends Object> term21697 = Class.forName((String) "java.io.File$PathStatus");
        Field term21696 = ((Class) term21697).getDeclaredField((String) "INVALID");
        ((Field) term21696).setAccessible(true);
        Object enum84 = ((Field) term21696).get((Object) null);
        term21491 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term21504 = newInstance(Class.forName("java.io.File"));
        setField(term21491, term21491.getClass(), "name", "");
        setBooleanField(term21491, term21491.getClass(), "preserveLeadingSlashes", true);
        setIntField(term21491, term21491.getClass(), "mode", 590364439);
        setLongField(term21491, term21491.getClass(), "userId", 6855071767938501807L);
        setLongField(term21491, term21491.getClass(), "groupId", -5892135042702373494L);
        setLongField(term21491, term21491.getClass(), "size", 5262507301787091109L);
        setLongField(term21491, term21491.getClass(), "modTime", -6823727938421990489L);
        setBooleanField(term21491, term21491.getClass(), "checkSumOK", true);
        setByteField(term21491, term21491.getClass(), "linkFlag", (byte) 67);
        setField(term21491, term21491.getClass(), "linkName", "");
        setField(term21491, term21491.getClass(), "magic", "ustar ");
        setField(term21491, term21491.getClass(), "version", "00");
        setField(term21491, term21491.getClass(), "userName", "root");
        setField(term21491, term21491.getClass(), "groupName", "");
        setIntField(term21491, term21491.getClass(), "devMajor", 865208305);
        setIntField(term21491, term21491.getClass(), "devMinor", -1275173084);
        setBooleanField(term21491, term21491.getClass(), "isExtended", false);
        setLongField(term21491, term21491.getClass(), "realSize", -484994522244390100L);
        setBooleanField(term21491, term21491.getClass(), "paxGNUSparse", true);
        setBooleanField(term21491, term21491.getClass(), "starSparse", true);
        setField(term21504, term21504.getClass(), "path", "LQFpaHEwXR");
        setField(term21504, term21504.getClass(), "status", enum84);
        setIntField(term21504, term21504.getClass(), "prefixLength", -244121226);
        setField(term21504, term21504.getClass(), "filePath", null);
        setField(term21491, term21491.getClass(), "file", term21504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term1584, args);
        assertTrue(recursiveEquals(term1584, term21491));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


