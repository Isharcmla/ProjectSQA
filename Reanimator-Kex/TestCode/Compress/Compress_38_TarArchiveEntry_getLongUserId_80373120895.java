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

public class TarArchiveEntry_getLongUserId_80373120895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3235;
     Object term24504;

    public TarArchiveEntry_getLongUserId_80373120895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24545 = Class.forName((String) "java.io.File$PathStatus");
        Field term24544 = ((Class) term24545).getDeclaredField((String) "INVALID");
        ((Field) term24544).setAccessible(true);
        Object enum97 = ((Field) term24544).get((Object) null);
        term3235 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3274 = newInstance(Class.forName("java.io.File"));
        setField(term3235, term3235.getClass(), "name", "");
        setBooleanField(term3235, term3235.getClass(), "preserveLeadingSlashes", true);
        setIntField(term3235, term3235.getClass(), "mode", 458147407);
        setLongField(term3235, term3235.getClass(), "userId", -8658027316505137504L);
        setLongField(term3235, term3235.getClass(), "groupId", 414749984815662075L);
        setLongField(term3235, term3235.getClass(), "size", 463622836963501975L);
        setLongField(term3235, term3235.getClass(), "modTime", 305759998609888272L);
        setBooleanField(term3235, term3235.getClass(), "checkSumOK", true);
        setByteField(term3235, term3235.getClass(), "linkFlag", (byte) -112);
        setField(term3235, term3235.getClass(), "linkName", "");
        setField(term3235, term3235.getClass(), "magic", "ustar ");
        setField(term3235, term3235.getClass(), "version", "00");
        setField(term3235, term3235.getClass(), "userName", "root");
        setField(term3235, term3235.getClass(), "groupName", "");
        setIntField(term3235, term3235.getClass(), "devMajor", -184153539);
        setIntField(term3235, term3235.getClass(), "devMinor", 493620644);
        setBooleanField(term3235, term3235.getClass(), "isExtended", false);
        setLongField(term3235, term3235.getClass(), "realSize", -8654565919063661957L);
        setBooleanField(term3235, term3235.getClass(), "paxGNUSparse", false);
        setBooleanField(term3235, term3235.getClass(), "starSparse", false);
        setField(term3274, term3274.getClass(), "path", "xOEqzGAmDU");
        setField(term3274, term3274.getClass(), "status", enum97);
        setIntField(term3274, term3274.getClass(), "prefixLength", 1328271830);
        setField(term3274, term3274.getClass(), "filePath", null);
        setField(term3235, term3235.getClass(), "file", term3274);
        Class<? extends Object> term24710 = Class.forName((String) "java.io.File$PathStatus");
        Field term24709 = ((Class) term24710).getDeclaredField((String) "INVALID");
        ((Field) term24709).setAccessible(true);
        Object enum98 = ((Field) term24709).get((Object) null);
        term24504 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term24517 = newInstance(Class.forName("java.io.File"));
        setField(term24504, term24504.getClass(), "name", "");
        setBooleanField(term24504, term24504.getClass(), "preserveLeadingSlashes", true);
        setIntField(term24504, term24504.getClass(), "mode", 458147407);
        setLongField(term24504, term24504.getClass(), "userId", -8658027316505137504L);
        setLongField(term24504, term24504.getClass(), "groupId", 414749984815662075L);
        setLongField(term24504, term24504.getClass(), "size", 463622836963501975L);
        setLongField(term24504, term24504.getClass(), "modTime", 305759998609888272L);
        setBooleanField(term24504, term24504.getClass(), "checkSumOK", true);
        setByteField(term24504, term24504.getClass(), "linkFlag", (byte) -112);
        setField(term24504, term24504.getClass(), "linkName", "");
        setField(term24504, term24504.getClass(), "magic", "ustar ");
        setField(term24504, term24504.getClass(), "version", "00");
        setField(term24504, term24504.getClass(), "userName", "root");
        setField(term24504, term24504.getClass(), "groupName", "");
        setIntField(term24504, term24504.getClass(), "devMajor", -184153539);
        setIntField(term24504, term24504.getClass(), "devMinor", 493620644);
        setBooleanField(term24504, term24504.getClass(), "isExtended", false);
        setLongField(term24504, term24504.getClass(), "realSize", -8654565919063661957L);
        setBooleanField(term24504, term24504.getClass(), "paxGNUSparse", false);
        setBooleanField(term24504, term24504.getClass(), "starSparse", false);
        setField(term24517, term24517.getClass(), "path", "xOEqzGAmDU");
        setField(term24517, term24517.getClass(), "status", enum98);
        setIntField(term24517, term24517.getClass(), "prefixLength", 1328271830);
        setField(term24517, term24517.getClass(), "filePath", null);
        setField(term24504, term24504.getClass(), "file", term24517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongUserId", argTypes, term3235, args);
        assertTrue(recursiveEquals(term3235, term24504));
        assertTrue(recursiveEquals(retValue, -8658027316505137504L));
    }

};


