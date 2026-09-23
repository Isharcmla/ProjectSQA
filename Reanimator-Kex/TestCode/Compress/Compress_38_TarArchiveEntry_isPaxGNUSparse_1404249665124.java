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

public class TarArchiveEntry_isPaxGNUSparse_1404249665124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9984;
     Object term37229;

    public TarArchiveEntry_isPaxGNUSparse_1404249665124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37270 = Class.forName((String) "java.io.File$PathStatus");
        Field term37269 = ((Class) term37270).getDeclaredField((String) "INVALID");
        ((Field) term37269).setAccessible(true);
        Object enum155 = ((Field) term37269).get((Object) null);
        term9984 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term10023 = newInstance(Class.forName("java.io.File"));
        setField(term9984, term9984.getClass(), "name", "");
        setBooleanField(term9984, term9984.getClass(), "preserveLeadingSlashes", false);
        setIntField(term9984, term9984.getClass(), "mode", -1731761810);
        setLongField(term9984, term9984.getClass(), "userId", 2191130532479601175L);
        setLongField(term9984, term9984.getClass(), "groupId", 860079646007397083L);
        setLongField(term9984, term9984.getClass(), "size", 3230472384687362867L);
        setLongField(term9984, term9984.getClass(), "modTime", -1145146470850585022L);
        setBooleanField(term9984, term9984.getClass(), "checkSumOK", true);
        setByteField(term9984, term9984.getClass(), "linkFlag", (byte) -57);
        setField(term9984, term9984.getClass(), "linkName", "");
        setField(term9984, term9984.getClass(), "magic", "ustar ");
        setField(term9984, term9984.getClass(), "version", "00");
        setField(term9984, term9984.getClass(), "userName", "root");
        setField(term9984, term9984.getClass(), "groupName", "");
        setIntField(term9984, term9984.getClass(), "devMajor", 197109649);
        setIntField(term9984, term9984.getClass(), "devMinor", -1239406390);
        setBooleanField(term9984, term9984.getClass(), "isExtended", false);
        setLongField(term9984, term9984.getClass(), "realSize", 1993646237353405740L);
        setBooleanField(term9984, term9984.getClass(), "paxGNUSparse", false);
        setBooleanField(term9984, term9984.getClass(), "starSparse", true);
        setField(term10023, term10023.getClass(), "path", "YRHGsAkhxb");
        setField(term10023, term10023.getClass(), "status", enum155);
        setIntField(term10023, term10023.getClass(), "prefixLength", 1557431527);
        setField(term10023, term10023.getClass(), "filePath", null);
        setField(term9984, term9984.getClass(), "file", term10023);
        Class<? extends Object> term37435 = Class.forName((String) "java.io.File$PathStatus");
        Field term37434 = ((Class) term37435).getDeclaredField((String) "INVALID");
        ((Field) term37434).setAccessible(true);
        Object enum156 = ((Field) term37434).get((Object) null);
        term37229 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term37242 = newInstance(Class.forName("java.io.File"));
        setField(term37229, term37229.getClass(), "name", "");
        setBooleanField(term37229, term37229.getClass(), "preserveLeadingSlashes", false);
        setIntField(term37229, term37229.getClass(), "mode", -1731761810);
        setLongField(term37229, term37229.getClass(), "userId", 2191130532479601175L);
        setLongField(term37229, term37229.getClass(), "groupId", 860079646007397083L);
        setLongField(term37229, term37229.getClass(), "size", 3230472384687362867L);
        setLongField(term37229, term37229.getClass(), "modTime", -1145146470850585022L);
        setBooleanField(term37229, term37229.getClass(), "checkSumOK", true);
        setByteField(term37229, term37229.getClass(), "linkFlag", (byte) -57);
        setField(term37229, term37229.getClass(), "linkName", "");
        setField(term37229, term37229.getClass(), "magic", "ustar ");
        setField(term37229, term37229.getClass(), "version", "00");
        setField(term37229, term37229.getClass(), "userName", "root");
        setField(term37229, term37229.getClass(), "groupName", "");
        setIntField(term37229, term37229.getClass(), "devMajor", 197109649);
        setIntField(term37229, term37229.getClass(), "devMinor", -1239406390);
        setBooleanField(term37229, term37229.getClass(), "isExtended", false);
        setLongField(term37229, term37229.getClass(), "realSize", 1993646237353405740L);
        setBooleanField(term37229, term37229.getClass(), "paxGNUSparse", false);
        setBooleanField(term37229, term37229.getClass(), "starSparse", true);
        setField(term37242, term37242.getClass(), "path", "YRHGsAkhxb");
        setField(term37242, term37242.getClass(), "status", enum156);
        setIntField(term37242, term37242.getClass(), "prefixLength", 1557431527);
        setField(term37242, term37242.getClass(), "filePath", null);
        setField(term37229, term37229.getClass(), "file", term37242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPaxGNUSparse", argTypes, term9984, args);
        assertTrue(recursiveEquals(term9984, term37229));
    }

};


