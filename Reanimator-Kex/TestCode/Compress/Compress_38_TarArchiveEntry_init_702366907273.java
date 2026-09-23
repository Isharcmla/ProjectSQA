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

public class TarArchiveEntry_init_702366907273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84398;

    public TarArchiveEntry_init_702366907273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84158 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term84158, term84158.getClass(), "name", "");
        setLongField(term84158, term84158.getClass(), "userId", 0L);
        setLongField(term84158, term84158.getClass(), "groupId", 0L);
        setLongField(term84158, term84158.getClass(), "size", 0L);
        setField(term84158, term84158.getClass(), "linkName", "");
        setField(term84158, term84158.getClass(), "magic", "");
        setField(term84158, term84158.getClass(), "version", null);
        setField(term84158, term84158.getClass(), "groupName", null);
        setIntField(term84158, term84158.getClass(), "devMajor", 0);
        setIntField(term84158, term84158.getClass(), "devMinor", 0);
        setField(term84158, term84158.getClass(), "userName", "");
        setField(term84158, term84158.getClass(), "file", null);
        setBooleanField(term84158, term84158.getClass(), "preserveLeadingSlashes", false);
        term84398 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term84398, term84398.getClass(), "name", "");
        setBooleanField(term84398, term84398.getClass(), "preserveLeadingSlashes", true);
        setIntField(term84398, term84398.getClass(), "mode", 33188);
        setLongField(term84398, term84398.getClass(), "userId", 0L);
        setLongField(term84398, term84398.getClass(), "groupId", 0L);
        setLongField(term84398, term84398.getClass(), "size", 0L);
        setLongField(term84398, term84398.getClass(), "modTime", 1790003331L);
        setBooleanField(term84398, term84398.getClass(), "checkSumOK", false);
        setByteField(term84398, term84398.getClass(), "linkFlag", (byte) 0);
        setField(term84398, term84398.getClass(), "linkName", "");
        setField(term84398, term84398.getClass(), "magic", "ustar ");
        setField(term84398, term84398.getClass(), "version", "00");
        setField(term84398, term84398.getClass(), "userName", "");
        setField(term84398, term84398.getClass(), "groupName", "");
        setIntField(term84398, term84398.getClass(), "devMajor", 0);
        setIntField(term84398, term84398.getClass(), "devMinor", 0);
        setBooleanField(term84398, term84398.getClass(), "isExtended", false);
        setLongField(term84398, term84398.getClass(), "realSize", 0L);
        setBooleanField(term84398, term84398.getClass(), "paxGNUSparse", false);
        setBooleanField(term84398, term84398.getClass(), "starSparse", false);
        setField(term84398, term84398.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = byte.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = (byte) 0;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term84398));
    }

};


