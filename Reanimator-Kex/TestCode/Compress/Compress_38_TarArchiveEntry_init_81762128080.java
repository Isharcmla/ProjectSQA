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
import java.lang.String;
import java.lang.Object;

public class TarArchiveEntry_init_81762128080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term16795;
     Object term16814;

    public TarArchiveEntry_init_81762128080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16831 = Class.forName((String) "java.io.File$PathStatus");
        Field term16830 = ((Class) term16831).getDeclaredField((String) "INVALID");
        ((Field) term16830).setAccessible(true);
        Object enum67 = ((Field) term16830).get((Object) null);
        term97 = newInstance(Class.forName("java.io.File"));
        setField(term97, term97.getClass(), "path", "jJCZpVmanW");
        setField(term97, term97.getClass(), "status", enum67);
        setIntField(term97, term97.getClass(), "prefixLength", 568599855);
        setField(term97, term97.getClass(), "filePath", null);
        Class<? extends Object> term17002 = Class.forName((String) "java.io.File$PathStatus");
        Field term17001 = ((Class) term17002).getDeclaredField((String) "INVALID");
        ((Field) term17001).setAccessible(true);
        Object enum68 = ((Field) term17001).get((Object) null);
        term16795 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term16808 = newInstance(Class.forName("java.io.File"));
        setField(term16795, term16795.getClass(), "name", "jJCZpVmanW");
        setBooleanField(term16795, term16795.getClass(), "preserveLeadingSlashes", false);
        setIntField(term16795, term16795.getClass(), "mode", 33188);
        setLongField(term16795, term16795.getClass(), "userId", 0L);
        setLongField(term16795, term16795.getClass(), "groupId", 0L);
        setLongField(term16795, term16795.getClass(), "size", 0L);
        setLongField(term16795, term16795.getClass(), "modTime", 0L);
        setBooleanField(term16795, term16795.getClass(), "checkSumOK", false);
        setByteField(term16795, term16795.getClass(), "linkFlag", (byte) 48);
        setField(term16795, term16795.getClass(), "linkName", "");
        setField(term16795, term16795.getClass(), "magic", "ustar ");
        setField(term16795, term16795.getClass(), "version", "00");
        setField(term16795, term16795.getClass(), "userName", "");
        setField(term16795, term16795.getClass(), "groupName", "");
        setIntField(term16795, term16795.getClass(), "devMajor", 0);
        setIntField(term16795, term16795.getClass(), "devMinor", 0);
        setBooleanField(term16795, term16795.getClass(), "isExtended", false);
        setLongField(term16795, term16795.getClass(), "realSize", 0L);
        setBooleanField(term16795, term16795.getClass(), "paxGNUSparse", false);
        setBooleanField(term16795, term16795.getClass(), "starSparse", false);
        setField(term16808, term16808.getClass(), "path", "jJCZpVmanW");
        setField(term16808, term16808.getClass(), "status", enum68);
        setIntField(term16808, term16808.getClass(), "prefixLength", 568599855);
        setField(term16808, term16808.getClass(), "filePath", null);
        setField(term16795, term16795.getClass(), "file", term16808);
        Class<? extends Object> term17155 = Class.forName((String) "java.io.File$PathStatus");
        Field term17154 = ((Class) term17155).getDeclaredField((String) "INVALID");
        ((Field) term17154).setAccessible(true);
        Object enum69 = ((Field) term17154).get((Object) null);
        term16814 = newInstance(Class.forName("java.io.File"));
        setField(term16814, term16814.getClass(), "path", "jJCZpVmanW");
        setField(term16814, term16814.getClass(), "status", enum69);
        setIntField(term16814, term16814.getClass(), "prefixLength", 568599855);
        setField(term16814, term16814.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term97;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16795));
        assertTrue(recursiveEquals(term97, term16814));
    }

};


