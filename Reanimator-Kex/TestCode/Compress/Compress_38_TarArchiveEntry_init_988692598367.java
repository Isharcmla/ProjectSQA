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

public class TarArchiveEntry_init_988692598367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367750;

    public TarArchiveEntry_init_988692598367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term367671 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term367671, term367671.getClass(), "name", null);
        setLongField(term367671, term367671.getClass(), "userId", 0L);
        setLongField(term367671, term367671.getClass(), "groupId", 0L);
        setLongField(term367671, term367671.getClass(), "size", 0L);
        setField(term367671, term367671.getClass(), "linkName", "");
        setField(term367671, term367671.getClass(), "magic", null);
        setField(term367671, term367671.getClass(), "version", null);
        setField(term367671, term367671.getClass(), "groupName", null);
        setIntField(term367671, term367671.getClass(), "devMajor", 0);
        setIntField(term367671, term367671.getClass(), "devMinor", 0);
        term367750 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term367750, term367750.getClass(), "name", "");
        setBooleanField(term367750, term367750.getClass(), "preserveLeadingSlashes", false);
        setIntField(term367750, term367750.getClass(), "mode", 0);
        setLongField(term367750, term367750.getClass(), "userId", 0L);
        setLongField(term367750, term367750.getClass(), "groupId", 0L);
        setLongField(term367750, term367750.getClass(), "size", 0L);
        setLongField(term367750, term367750.getClass(), "modTime", 0L);
        setBooleanField(term367750, term367750.getClass(), "checkSumOK", false);
        setByteField(term367750, term367750.getClass(), "linkFlag", (byte) 0);
        setField(term367750, term367750.getClass(), "linkName", "");
        setField(term367750, term367750.getClass(), "magic", "ustar ");
        setField(term367750, term367750.getClass(), "version", "00");
        setField(term367750, term367750.getClass(), "userName", "root");
        setField(term367750, term367750.getClass(), "groupName", "");
        setIntField(term367750, term367750.getClass(), "devMajor", 0);
        setIntField(term367750, term367750.getClass(), "devMinor", 0);
        setBooleanField(term367750, term367750.getClass(), "isExtended", false);
        setLongField(term367750, term367750.getClass(), "realSize", 0L);
        setBooleanField(term367750, term367750.getClass(), "paxGNUSparse", false);
        setBooleanField(term367750, term367750.getClass(), "starSparse", false);
        setField(term367750, term367750.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term367750));
    }

};


