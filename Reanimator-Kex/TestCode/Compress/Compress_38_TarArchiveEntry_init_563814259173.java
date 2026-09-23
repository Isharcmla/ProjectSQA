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

public class TarArchiveEntry_init_563814259173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57577;

    public TarArchiveEntry_init_563814259173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57393 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term57461 = newInstance(Class.forName("java.io.File"));
        setField(term57393, term57393.getClass(), "name", null);
        setLongField(term57393, term57393.getClass(), "userId", 0L);
        setLongField(term57393, term57393.getClass(), "groupId", 0L);
        setLongField(term57393, term57393.getClass(), "size", 0L);
        setField(term57393, term57393.getClass(), "linkName", null);
        setField(term57393, term57393.getClass(), "magic", null);
        setField(term57393, term57393.getClass(), "version", null);
        setField(term57393, term57393.getClass(), "groupName", null);
        setIntField(term57393, term57393.getClass(), "devMajor", 0);
        setIntField(term57393, term57393.getClass(), "devMinor", 0);
        setField(term57393, term57393.getClass(), "userName", "");
        setField(term57393, term57393.getClass(), "file", term57461);
        setBooleanField(term57393, term57393.getClass(), "preserveLeadingSlashes", false);
        term57577 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term57577, term57577.getClass(), "name", "");
        setBooleanField(term57577, term57577.getClass(), "preserveLeadingSlashes", false);
        setIntField(term57577, term57577.getClass(), "mode", 33188);
        setLongField(term57577, term57577.getClass(), "userId", 0L);
        setLongField(term57577, term57577.getClass(), "groupId", 0L);
        setLongField(term57577, term57577.getClass(), "size", 0L);
        setLongField(term57577, term57577.getClass(), "modTime", 1790003316L);
        setBooleanField(term57577, term57577.getClass(), "checkSumOK", false);
        setByteField(term57577, term57577.getClass(), "linkFlag", (byte) 0);
        setField(term57577, term57577.getClass(), "linkName", "");
        setField(term57577, term57577.getClass(), "magic", "ustar ");
        setField(term57577, term57577.getClass(), "version", "00");
        setField(term57577, term57577.getClass(), "userName", "");
        setField(term57577, term57577.getClass(), "groupName", "");
        setIntField(term57577, term57577.getClass(), "devMajor", 0);
        setIntField(term57577, term57577.getClass(), "devMinor", 0);
        setBooleanField(term57577, term57577.getClass(), "isExtended", false);
        setLongField(term57577, term57577.getClass(), "realSize", 0L);
        setBooleanField(term57577, term57577.getClass(), "paxGNUSparse", false);
        setBooleanField(term57577, term57577.getClass(), "starSparse", false);
        setField(term57577, term57577.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = (byte) 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term57577));
    }

};


