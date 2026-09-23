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

public class TarArchiveEntry_isDirectory_1193896813130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11358;
     Object term39651;

    public TarArchiveEntry_isDirectory_1193896813130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40890 = Class.forName((String) "java.io.File$PathStatus");
        Field term40889 = ((Class) term40890).getDeclaredField((String) "INVALID");
        ((Field) term40889).setAccessible(true);
        Object enum173 = ((Field) term40889).get((Object) null);
        term11358 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term11397 = newInstance(Class.forName("java.io.File"));
        setField(term11358, term11358.getClass(), "name", "");
        setBooleanField(term11358, term11358.getClass(), "preserveLeadingSlashes", false);
        setIntField(term11358, term11358.getClass(), "mode", 1102721075);
        setLongField(term11358, term11358.getClass(), "userId", 3752337209837437327L);
        setLongField(term11358, term11358.getClass(), "groupId", 1860789353508856614L);
        setLongField(term11358, term11358.getClass(), "size", -7456852906235966771L);
        setLongField(term11358, term11358.getClass(), "modTime", -67485388932970712L);
        setBooleanField(term11358, term11358.getClass(), "checkSumOK", false);
        setByteField(term11358, term11358.getClass(), "linkFlag", (byte) -42);
        setField(term11358, term11358.getClass(), "linkName", "");
        setField(term11358, term11358.getClass(), "magic", "ustar ");
        setField(term11358, term11358.getClass(), "version", "00");
        setField(term11358, term11358.getClass(), "userName", "root");
        setField(term11358, term11358.getClass(), "groupName", "");
        setIntField(term11358, term11358.getClass(), "devMajor", -426764678);
        setIntField(term11358, term11358.getClass(), "devMinor", -1222614956);
        setBooleanField(term11358, term11358.getClass(), "isExtended", true);
        setLongField(term11358, term11358.getClass(), "realSize", 5806367330808555223L);
        setBooleanField(term11358, term11358.getClass(), "paxGNUSparse", false);
        setBooleanField(term11358, term11358.getClass(), "starSparse", false);
        setField(term11397, term11397.getClass(), "path", "dEnhdmILtU");
        setField(term11397, term11397.getClass(), "status", enum173);
        setIntField(term11397, term11397.getClass(), "prefixLength", -1870495012);
        setField(term11397, term11397.getClass(), "filePath", null);
        setField(term11358, term11358.getClass(), "file", term11397);
        Class<? extends Object> term41055 = Class.forName((String) "java.io.File$PathStatus");
        Field term41054 = ((Class) term41055).getDeclaredField((String) "INVALID");
        ((Field) term41054).setAccessible(true);
        Object enum174 = ((Field) term41054).get((Object) null);
        term39651 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term39664 = newInstance(Class.forName("java.io.File"));
        setField(term39651, term39651.getClass(), "name", "");
        setBooleanField(term39651, term39651.getClass(), "preserveLeadingSlashes", false);
        setIntField(term39651, term39651.getClass(), "mode", 1102721075);
        setLongField(term39651, term39651.getClass(), "userId", 3752337209837437327L);
        setLongField(term39651, term39651.getClass(), "groupId", 1860789353508856614L);
        setLongField(term39651, term39651.getClass(), "size", -7456852906235966771L);
        setLongField(term39651, term39651.getClass(), "modTime", -67485388932970712L);
        setBooleanField(term39651, term39651.getClass(), "checkSumOK", false);
        setByteField(term39651, term39651.getClass(), "linkFlag", (byte) -42);
        setField(term39651, term39651.getClass(), "linkName", "");
        setField(term39651, term39651.getClass(), "magic", "ustar ");
        setField(term39651, term39651.getClass(), "version", "00");
        setField(term39651, term39651.getClass(), "userName", "root");
        setField(term39651, term39651.getClass(), "groupName", "");
        setIntField(term39651, term39651.getClass(), "devMajor", -426764678);
        setIntField(term39651, term39651.getClass(), "devMinor", -1222614956);
        setBooleanField(term39651, term39651.getClass(), "isExtended", true);
        setLongField(term39651, term39651.getClass(), "realSize", 5806367330808555223L);
        setBooleanField(term39651, term39651.getClass(), "paxGNUSparse", false);
        setBooleanField(term39651, term39651.getClass(), "starSparse", false);
        setField(term39664, term39664.getClass(), "path", "dEnhdmILtU");
        setField(term39664, term39664.getClass(), "status", enum174);
        setIntField(term39664, term39664.getClass(), "prefixLength", -1870495012);
        setField(term39664, term39664.getClass(), "filePath", null);
        setField(term39651, term39651.getClass(), "file", term39664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirectory", argTypes, term11358, args);
        assertTrue(recursiveEquals(term11358, term39651));
    }

};


