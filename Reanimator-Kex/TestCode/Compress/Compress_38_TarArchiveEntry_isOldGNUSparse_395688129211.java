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

public class TarArchiveEntry_isOldGNUSparse_395688129211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65969;
     Object term65987;

    public TarArchiveEntry_isOldGNUSparse_395688129211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65969 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term65969, term65969.getClass(), "linkFlag", (byte) 83);
        term65987 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term65987, term65987.getClass(), "name", null);
        setBooleanField(term65987, term65987.getClass(), "preserveLeadingSlashes", false);
        setIntField(term65987, term65987.getClass(), "mode", 0);
        setLongField(term65987, term65987.getClass(), "userId", 0L);
        setLongField(term65987, term65987.getClass(), "groupId", 0L);
        setLongField(term65987, term65987.getClass(), "size", 0L);
        setLongField(term65987, term65987.getClass(), "modTime", 0L);
        setBooleanField(term65987, term65987.getClass(), "checkSumOK", false);
        setByteField(term65987, term65987.getClass(), "linkFlag", (byte) 83);
        setField(term65987, term65987.getClass(), "linkName", null);
        setField(term65987, term65987.getClass(), "magic", null);
        setField(term65987, term65987.getClass(), "version", null);
        setField(term65987, term65987.getClass(), "userName", null);
        setField(term65987, term65987.getClass(), "groupName", null);
        setIntField(term65987, term65987.getClass(), "devMajor", 0);
        setIntField(term65987, term65987.getClass(), "devMinor", 0);
        setBooleanField(term65987, term65987.getClass(), "isExtended", false);
        setLongField(term65987, term65987.getClass(), "realSize", 0L);
        setBooleanField(term65987, term65987.getClass(), "paxGNUSparse", false);
        setBooleanField(term65987, term65987.getClass(), "starSparse", false);
        setField(term65987, term65987.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOldGNUSparse", argTypes, term65969, args);
        assertTrue(recursiveEquals(term65969, term65987));
        assertTrue(recursiveEquals(retValue, true));
    }

};


