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

public class TarArchiveEntry_isBlockDevice_1035254679215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67302;
     Object term67320;

    public TarArchiveEntry_isBlockDevice_1035254679215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67302 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term67302, term67302.getClass(), "linkFlag", (byte) 52);
        term67320 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term67320, term67320.getClass(), "name", null);
        setBooleanField(term67320, term67320.getClass(), "preserveLeadingSlashes", false);
        setIntField(term67320, term67320.getClass(), "mode", 0);
        setLongField(term67320, term67320.getClass(), "userId", 0L);
        setLongField(term67320, term67320.getClass(), "groupId", 0L);
        setLongField(term67320, term67320.getClass(), "size", 0L);
        setLongField(term67320, term67320.getClass(), "modTime", 0L);
        setBooleanField(term67320, term67320.getClass(), "checkSumOK", false);
        setByteField(term67320, term67320.getClass(), "linkFlag", (byte) 52);
        setField(term67320, term67320.getClass(), "linkName", null);
        setField(term67320, term67320.getClass(), "magic", null);
        setField(term67320, term67320.getClass(), "version", null);
        setField(term67320, term67320.getClass(), "userName", null);
        setField(term67320, term67320.getClass(), "groupName", null);
        setIntField(term67320, term67320.getClass(), "devMajor", 0);
        setIntField(term67320, term67320.getClass(), "devMinor", 0);
        setBooleanField(term67320, term67320.getClass(), "isExtended", false);
        setLongField(term67320, term67320.getClass(), "realSize", 0L);
        setBooleanField(term67320, term67320.getClass(), "paxGNUSparse", false);
        setBooleanField(term67320, term67320.getClass(), "starSparse", false);
        setField(term67320, term67320.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isBlockDevice", argTypes, term67302, args);
        assertTrue(recursiveEquals(term67302, term67320));
        assertTrue(recursiveEquals(retValue, true));
    }

};


