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

public class TarArchiveEntry_setSize_1869522775191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61241;
     Object term61260;

    public TarArchiveEntry_setSize_1869522775191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61241 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term61260 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term61260, term61260.getClass(), "name", null);
        setBooleanField(term61260, term61260.getClass(), "preserveLeadingSlashes", false);
        setIntField(term61260, term61260.getClass(), "mode", 0);
        setLongField(term61260, term61260.getClass(), "userId", 0L);
        setLongField(term61260, term61260.getClass(), "groupId", 0L);
        setLongField(term61260, term61260.getClass(), "size", 0L);
        setLongField(term61260, term61260.getClass(), "modTime", 0L);
        setBooleanField(term61260, term61260.getClass(), "checkSumOK", false);
        setByteField(term61260, term61260.getClass(), "linkFlag", (byte) 0);
        setField(term61260, term61260.getClass(), "linkName", null);
        setField(term61260, term61260.getClass(), "magic", null);
        setField(term61260, term61260.getClass(), "version", null);
        setField(term61260, term61260.getClass(), "userName", null);
        setField(term61260, term61260.getClass(), "groupName", null);
        setIntField(term61260, term61260.getClass(), "devMajor", 0);
        setIntField(term61260, term61260.getClass(), "devMinor", 0);
        setBooleanField(term61260, term61260.getClass(), "isExtended", false);
        setLongField(term61260, term61260.getClass(), "realSize", 0L);
        setBooleanField(term61260, term61260.getClass(), "paxGNUSparse", false);
        setBooleanField(term61260, term61260.getClass(), "starSparse", false);
        setField(term61260, term61260.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "setSize", argTypes, term61241, args);
        assertTrue(recursiveEquals(term61241, term61260));
    }

};


