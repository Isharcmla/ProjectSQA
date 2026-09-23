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

public class TarArchiveEntry_isSparse_1184183718177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58397;
     Object term58443;

    public TarArchiveEntry_isSparse_1184183718177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58397 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term58397, term58397.getClass(), "linkFlag", (byte) 83);
        term58443 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term58443, term58443.getClass(), "name", null);
        setBooleanField(term58443, term58443.getClass(), "preserveLeadingSlashes", false);
        setIntField(term58443, term58443.getClass(), "mode", 0);
        setLongField(term58443, term58443.getClass(), "userId", 0L);
        setLongField(term58443, term58443.getClass(), "groupId", 0L);
        setLongField(term58443, term58443.getClass(), "size", 0L);
        setLongField(term58443, term58443.getClass(), "modTime", 0L);
        setBooleanField(term58443, term58443.getClass(), "checkSumOK", false);
        setByteField(term58443, term58443.getClass(), "linkFlag", (byte) 83);
        setField(term58443, term58443.getClass(), "linkName", null);
        setField(term58443, term58443.getClass(), "magic", null);
        setField(term58443, term58443.getClass(), "version", null);
        setField(term58443, term58443.getClass(), "userName", null);
        setField(term58443, term58443.getClass(), "groupName", null);
        setIntField(term58443, term58443.getClass(), "devMajor", 0);
        setIntField(term58443, term58443.getClass(), "devMinor", 0);
        setBooleanField(term58443, term58443.getClass(), "isExtended", false);
        setLongField(term58443, term58443.getClass(), "realSize", 0L);
        setBooleanField(term58443, term58443.getClass(), "paxGNUSparse", false);
        setBooleanField(term58443, term58443.getClass(), "starSparse", false);
        setField(term58443, term58443.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSparse", argTypes, term58397, args);
        assertTrue(recursiveEquals(term58397, term58443));
        assertTrue(recursiveEquals(retValue, true));
    }

};


