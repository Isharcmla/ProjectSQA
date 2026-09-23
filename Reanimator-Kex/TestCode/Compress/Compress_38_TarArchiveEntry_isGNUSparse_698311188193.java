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

public class TarArchiveEntry_isGNUSparse_698311188193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61421;
     Object term61441;

    public TarArchiveEntry_isGNUSparse_698311188193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61421 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term61421, term61421.getClass(), "linkFlag", (byte) 83);
        term61441 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term61441, term61441.getClass(), "name", null);
        setBooleanField(term61441, term61441.getClass(), "preserveLeadingSlashes", false);
        setIntField(term61441, term61441.getClass(), "mode", 0);
        setLongField(term61441, term61441.getClass(), "userId", 0L);
        setLongField(term61441, term61441.getClass(), "groupId", 0L);
        setLongField(term61441, term61441.getClass(), "size", 0L);
        setLongField(term61441, term61441.getClass(), "modTime", 0L);
        setBooleanField(term61441, term61441.getClass(), "checkSumOK", false);
        setByteField(term61441, term61441.getClass(), "linkFlag", (byte) 83);
        setField(term61441, term61441.getClass(), "linkName", null);
        setField(term61441, term61441.getClass(), "magic", null);
        setField(term61441, term61441.getClass(), "version", null);
        setField(term61441, term61441.getClass(), "userName", null);
        setField(term61441, term61441.getClass(), "groupName", null);
        setIntField(term61441, term61441.getClass(), "devMajor", 0);
        setIntField(term61441, term61441.getClass(), "devMinor", 0);
        setBooleanField(term61441, term61441.getClass(), "isExtended", false);
        setLongField(term61441, term61441.getClass(), "realSize", 0L);
        setBooleanField(term61441, term61441.getClass(), "paxGNUSparse", false);
        setBooleanField(term61441, term61441.getClass(), "starSparse", false);
        setField(term61441, term61441.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGNUSparse", argTypes, term61421, args);
        assertTrue(recursiveEquals(term61421, term61441));
        assertTrue(recursiveEquals(retValue, true));
    }

};


