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

public class TarArchiveEntry_init_836439475269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82825;

    public TarArchiveEntry_init_836439475269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82643 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term82711 = newInstance(Class.forName("java.io.File"));
        setField(term82643, term82643.getClass(), "name", null);
        setLongField(term82643, term82643.getClass(), "userId", 0L);
        setLongField(term82643, term82643.getClass(), "groupId", 0L);
        setLongField(term82643, term82643.getClass(), "size", 0L);
        setField(term82643, term82643.getClass(), "linkName", null);
        setField(term82643, term82643.getClass(), "magic", null);
        setField(term82643, term82643.getClass(), "version", null);
        setField(term82643, term82643.getClass(), "groupName", null);
        setIntField(term82643, term82643.getClass(), "devMajor", 0);
        setIntField(term82643, term82643.getClass(), "devMinor", 0);
        setField(term82643, term82643.getClass(), "userName", "");
        setField(term82643, term82643.getClass(), "file", term82711);
        setBooleanField(term82643, term82643.getClass(), "preserveLeadingSlashes", false);
        term82825 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term82825, term82825.getClass(), "name", "");
        setBooleanField(term82825, term82825.getClass(), "preserveLeadingSlashes", false);
        setIntField(term82825, term82825.getClass(), "mode", 33188);
        setLongField(term82825, term82825.getClass(), "userId", 0L);
        setLongField(term82825, term82825.getClass(), "groupId", 0L);
        setLongField(term82825, term82825.getClass(), "size", 0L);
        setLongField(term82825, term82825.getClass(), "modTime", 1790003329L);
        setBooleanField(term82825, term82825.getClass(), "checkSumOK", false);
        setByteField(term82825, term82825.getClass(), "linkFlag", (byte) 48);
        setField(term82825, term82825.getClass(), "linkName", "");
        setField(term82825, term82825.getClass(), "magic", "ustar ");
        setField(term82825, term82825.getClass(), "version", "00");
        setField(term82825, term82825.getClass(), "userName", "");
        setField(term82825, term82825.getClass(), "groupName", "");
        setIntField(term82825, term82825.getClass(), "devMajor", 0);
        setIntField(term82825, term82825.getClass(), "devMinor", 0);
        setBooleanField(term82825, term82825.getClass(), "isExtended", false);
        setLongField(term82825, term82825.getClass(), "realSize", 0L);
        setBooleanField(term82825, term82825.getClass(), "paxGNUSparse", false);
        setBooleanField(term82825, term82825.getClass(), "starSparse", false);
        setField(term82825, term82825.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term82825));
    }

};


