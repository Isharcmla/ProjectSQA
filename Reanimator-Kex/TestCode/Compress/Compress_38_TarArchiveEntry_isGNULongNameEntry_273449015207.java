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

public class TarArchiveEntry_isGNULongNameEntry_273449015207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64580;
     Object term64598;

    public TarArchiveEntry_isGNULongNameEntry_273449015207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64580 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term64580, term64580.getClass(), "linkFlag", (byte) 76);
        term64598 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term64598, term64598.getClass(), "name", null);
        setBooleanField(term64598, term64598.getClass(), "preserveLeadingSlashes", false);
        setIntField(term64598, term64598.getClass(), "mode", 0);
        setLongField(term64598, term64598.getClass(), "userId", 0L);
        setLongField(term64598, term64598.getClass(), "groupId", 0L);
        setLongField(term64598, term64598.getClass(), "size", 0L);
        setLongField(term64598, term64598.getClass(), "modTime", 0L);
        setBooleanField(term64598, term64598.getClass(), "checkSumOK", false);
        setByteField(term64598, term64598.getClass(), "linkFlag", (byte) 76);
        setField(term64598, term64598.getClass(), "linkName", null);
        setField(term64598, term64598.getClass(), "magic", null);
        setField(term64598, term64598.getClass(), "version", null);
        setField(term64598, term64598.getClass(), "userName", null);
        setField(term64598, term64598.getClass(), "groupName", null);
        setIntField(term64598, term64598.getClass(), "devMajor", 0);
        setIntField(term64598, term64598.getClass(), "devMinor", 0);
        setBooleanField(term64598, term64598.getClass(), "isExtended", false);
        setLongField(term64598, term64598.getClass(), "realSize", 0L);
        setBooleanField(term64598, term64598.getClass(), "paxGNUSparse", false);
        setBooleanField(term64598, term64598.getClass(), "starSparse", false);
        setField(term64598, term64598.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGNULongNameEntry", argTypes, term64580, args);
        assertTrue(recursiveEquals(term64580, term64598));
        assertTrue(recursiveEquals(retValue, true));
    }

};


