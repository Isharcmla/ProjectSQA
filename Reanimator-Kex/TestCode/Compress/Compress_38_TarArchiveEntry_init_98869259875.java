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

public class TarArchiveEntry_init_98869259875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16141;

    public TarArchiveEntry_init_98869259875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16141 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term16141, term16141.getClass(), "name", "");
        setBooleanField(term16141, term16141.getClass(), "preserveLeadingSlashes", false);
        setIntField(term16141, term16141.getClass(), "mode", 0);
        setLongField(term16141, term16141.getClass(), "userId", 0L);
        setLongField(term16141, term16141.getClass(), "groupId", 0L);
        setLongField(term16141, term16141.getClass(), "size", 0L);
        setLongField(term16141, term16141.getClass(), "modTime", 0L);
        setBooleanField(term16141, term16141.getClass(), "checkSumOK", false);
        setByteField(term16141, term16141.getClass(), "linkFlag", (byte) 0);
        setField(term16141, term16141.getClass(), "linkName", "");
        setField(term16141, term16141.getClass(), "magic", "ustar ");
        setField(term16141, term16141.getClass(), "version", "00");
        setField(term16141, term16141.getClass(), "userName", "root");
        setField(term16141, term16141.getClass(), "groupName", "");
        setIntField(term16141, term16141.getClass(), "devMajor", 0);
        setIntField(term16141, term16141.getClass(), "devMinor", 0);
        setBooleanField(term16141, term16141.getClass(), "isExtended", false);
        setLongField(term16141, term16141.getClass(), "realSize", 0L);
        setBooleanField(term16141, term16141.getClass(), "paxGNUSparse", false);
        setBooleanField(term16141, term16141.getClass(), "starSparse", false);
        setField(term16141, term16141.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16141));
    }

};


