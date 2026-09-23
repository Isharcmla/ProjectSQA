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

public class TarArchiveEntry_equals_1801372482185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60358;
     Object term60404;
     Object term60427;
     Object term60428;

    public TarArchiveEntry_equals_1801372482185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60358 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term60404 = newInstance(Class.forName("java.io.StringReader"));
        term60427 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term60427, term60427.getClass(), "name", null);
        setBooleanField(term60427, term60427.getClass(), "preserveLeadingSlashes", false);
        setIntField(term60427, term60427.getClass(), "mode", 0);
        setLongField(term60427, term60427.getClass(), "userId", 0L);
        setLongField(term60427, term60427.getClass(), "groupId", 0L);
        setLongField(term60427, term60427.getClass(), "size", 0L);
        setLongField(term60427, term60427.getClass(), "modTime", 0L);
        setBooleanField(term60427, term60427.getClass(), "checkSumOK", false);
        setByteField(term60427, term60427.getClass(), "linkFlag", (byte) 0);
        setField(term60427, term60427.getClass(), "linkName", null);
        setField(term60427, term60427.getClass(), "magic", null);
        setField(term60427, term60427.getClass(), "version", null);
        setField(term60427, term60427.getClass(), "userName", null);
        setField(term60427, term60427.getClass(), "groupName", null);
        setIntField(term60427, term60427.getClass(), "devMajor", 0);
        setIntField(term60427, term60427.getClass(), "devMinor", 0);
        setBooleanField(term60427, term60427.getClass(), "isExtended", false);
        setLongField(term60427, term60427.getClass(), "realSize", 0L);
        setBooleanField(term60427, term60427.getClass(), "paxGNUSparse", false);
        setBooleanField(term60427, term60427.getClass(), "starSparse", false);
        setField(term60427, term60427.getClass(), "file", null);
        term60428 = newInstance(Class.forName("java.io.StringReader"));
        setField(term60428, term60428.getClass(), "str", null);
        setIntField(term60428, term60428.getClass(), "length", 0);
        setIntField(term60428, term60428.getClass(), "next", 0);
        setIntField(term60428, term60428.getClass(), "mark", 0);
        setField(term60428, term60428.getClass(), "lock", null);
        setField(term60428, term60428.getClass(), "skipBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term60404;
        Object retValue = callMethod(klass, "equals", argTypes, term60358, args);
        assertTrue(recursiveEquals(term60358, term60427));
        assertTrue(recursiveEquals(term60404, term60428));
        assertTrue(recursiveEquals(retValue, false));
    }

};


