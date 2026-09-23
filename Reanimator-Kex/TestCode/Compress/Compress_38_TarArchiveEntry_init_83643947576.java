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

public class TarArchiveEntry_init_83643947576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16244;

    public TarArchiveEntry_init_83643947576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16244 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term16244, term16244.getClass(), "name", "PAEBtnZtTD");
        setBooleanField(term16244, term16244.getClass(), "preserveLeadingSlashes", false);
        setIntField(term16244, term16244.getClass(), "mode", 33188);
        setLongField(term16244, term16244.getClass(), "userId", 0L);
        setLongField(term16244, term16244.getClass(), "groupId", 0L);
        setLongField(term16244, term16244.getClass(), "size", 0L);
        setLongField(term16244, term16244.getClass(), "modTime", 1790003307L);
        setBooleanField(term16244, term16244.getClass(), "checkSumOK", false);
        setByteField(term16244, term16244.getClass(), "linkFlag", (byte) 48);
        setField(term16244, term16244.getClass(), "linkName", "");
        setField(term16244, term16244.getClass(), "magic", "ustar ");
        setField(term16244, term16244.getClass(), "version", "00");
        setField(term16244, term16244.getClass(), "userName", "");
        setField(term16244, term16244.getClass(), "groupName", "");
        setIntField(term16244, term16244.getClass(), "devMajor", 0);
        setIntField(term16244, term16244.getClass(), "devMinor", 0);
        setBooleanField(term16244, term16244.getClass(), "isExtended", false);
        setLongField(term16244, term16244.getClass(), "realSize", 0L);
        setBooleanField(term16244, term16244.getClass(), "paxGNUSparse", false);
        setBooleanField(term16244, term16244.getClass(), "starSparse", false);
        setField(term16244, term16244.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16244));
    }

};


