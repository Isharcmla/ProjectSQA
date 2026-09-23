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

public class TarArchiveEntry_isSymbolicLink_1644069498217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67452;
     Object term67470;

    public TarArchiveEntry_isSymbolicLink_1644069498217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67452 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term67452, term67452.getClass(), "linkFlag", (byte) 50);
        term67470 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term67470, term67470.getClass(), "name", null);
        setBooleanField(term67470, term67470.getClass(), "preserveLeadingSlashes", false);
        setIntField(term67470, term67470.getClass(), "mode", 0);
        setLongField(term67470, term67470.getClass(), "userId", 0L);
        setLongField(term67470, term67470.getClass(), "groupId", 0L);
        setLongField(term67470, term67470.getClass(), "size", 0L);
        setLongField(term67470, term67470.getClass(), "modTime", 0L);
        setBooleanField(term67470, term67470.getClass(), "checkSumOK", false);
        setByteField(term67470, term67470.getClass(), "linkFlag", (byte) 50);
        setField(term67470, term67470.getClass(), "linkName", null);
        setField(term67470, term67470.getClass(), "magic", null);
        setField(term67470, term67470.getClass(), "version", null);
        setField(term67470, term67470.getClass(), "userName", null);
        setField(term67470, term67470.getClass(), "groupName", null);
        setIntField(term67470, term67470.getClass(), "devMajor", 0);
        setIntField(term67470, term67470.getClass(), "devMinor", 0);
        setBooleanField(term67470, term67470.getClass(), "isExtended", false);
        setLongField(term67470, term67470.getClass(), "realSize", 0L);
        setBooleanField(term67470, term67470.getClass(), "paxGNUSparse", false);
        setBooleanField(term67470, term67470.getClass(), "starSparse", false);
        setField(term67470, term67470.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSymbolicLink", argTypes, term67452, args);
        assertTrue(recursiveEquals(term67452, term67470));
        assertTrue(recursiveEquals(retValue, true));
    }

};


