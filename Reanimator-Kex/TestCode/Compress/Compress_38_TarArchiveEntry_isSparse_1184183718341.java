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

public class TarArchiveEntry_isSparse_1184183718341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351717;
     Object term351743;

    public TarArchiveEntry_isSparse_1184183718341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351717 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term351717, term351717.getClass(), "linkFlag", (byte) 0);
        setBooleanField(term351717, term351717.getClass(), "paxGNUSparse", false);
        setBooleanField(term351717, term351717.getClass(), "starSparse", true);
        term351743 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term351743, term351743.getClass(), "name", null);
        setBooleanField(term351743, term351743.getClass(), "preserveLeadingSlashes", false);
        setIntField(term351743, term351743.getClass(), "mode", 0);
        setLongField(term351743, term351743.getClass(), "userId", 0L);
        setLongField(term351743, term351743.getClass(), "groupId", 0L);
        setLongField(term351743, term351743.getClass(), "size", 0L);
        setLongField(term351743, term351743.getClass(), "modTime", 0L);
        setBooleanField(term351743, term351743.getClass(), "checkSumOK", false);
        setByteField(term351743, term351743.getClass(), "linkFlag", (byte) 0);
        setField(term351743, term351743.getClass(), "linkName", null);
        setField(term351743, term351743.getClass(), "magic", null);
        setField(term351743, term351743.getClass(), "version", null);
        setField(term351743, term351743.getClass(), "userName", null);
        setField(term351743, term351743.getClass(), "groupName", null);
        setIntField(term351743, term351743.getClass(), "devMajor", 0);
        setIntField(term351743, term351743.getClass(), "devMinor", 0);
        setBooleanField(term351743, term351743.getClass(), "isExtended", false);
        setLongField(term351743, term351743.getClass(), "realSize", 0L);
        setBooleanField(term351743, term351743.getClass(), "paxGNUSparse", false);
        setBooleanField(term351743, term351743.getClass(), "starSparse", true);
        setField(term351743, term351743.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSparse", argTypes, term351717, args);
        assertTrue(recursiveEquals(term351717, term351743));
        assertTrue(recursiveEquals(retValue, true));
    }

};


