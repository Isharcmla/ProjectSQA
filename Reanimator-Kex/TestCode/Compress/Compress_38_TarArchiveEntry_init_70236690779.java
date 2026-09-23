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
import java.lang.Byte;
import java.lang.Boolean;

public class TarArchiveEntry_init_70236690779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term85;
     Object term16641;

    public TarArchiveEntry_init_70236690779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = new Byte((byte) 48);
        term85 = new Boolean(false);
        term16641 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term16641, term16641.getClass(), "name", "xxtlPwDYFs");
        setBooleanField(term16641, term16641.getClass(), "preserveLeadingSlashes", false);
        setIntField(term16641, term16641.getClass(), "mode", 33188);
        setLongField(term16641, term16641.getClass(), "userId", 0L);
        setLongField(term16641, term16641.getClass(), "groupId", 0L);
        setLongField(term16641, term16641.getClass(), "size", 0L);
        setLongField(term16641, term16641.getClass(), "modTime", 1790003307L);
        setBooleanField(term16641, term16641.getClass(), "checkSumOK", false);
        setByteField(term16641, term16641.getClass(), "linkFlag", (byte) 48);
        setField(term16641, term16641.getClass(), "linkName", "");
        setField(term16641, term16641.getClass(), "magic", "ustar ");
        setField(term16641, term16641.getClass(), "version", "00");
        setField(term16641, term16641.getClass(), "userName", "");
        setField(term16641, term16641.getClass(), "groupName", "");
        setIntField(term16641, term16641.getClass(), "devMajor", 0);
        setIntField(term16641, term16641.getClass(), "devMinor", 0);
        setBooleanField(term16641, term16641.getClass(), "isExtended", false);
        setLongField(term16641, term16641.getClass(), "realSize", 0L);
        setBooleanField(term16641, term16641.getClass(), "paxGNUSparse", false);
        setBooleanField(term16641, term16641.getClass(), "starSparse", false);
        setField(term16641, term16641.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = byte.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "xxtlPwDYFs";
        args[1] = term83;
        args[2] = term85;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16641));
        assertTrue(recursiveEquals(term83, false));
        assertTrue(recursiveEquals(term85, (byte) 48));
    }

};


