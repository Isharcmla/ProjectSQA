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

public class TarArchiveEntry_isGlobalPaxHeader_54701655243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75041;
     Object term75059;

    public TarArchiveEntry_isGlobalPaxHeader_54701655243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75041 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term75041, term75041.getClass(), "linkFlag", (byte) 103);
        term75059 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term75059, term75059.getClass(), "name", null);
        setBooleanField(term75059, term75059.getClass(), "preserveLeadingSlashes", false);
        setIntField(term75059, term75059.getClass(), "mode", 0);
        setLongField(term75059, term75059.getClass(), "userId", 0L);
        setLongField(term75059, term75059.getClass(), "groupId", 0L);
        setLongField(term75059, term75059.getClass(), "size", 0L);
        setLongField(term75059, term75059.getClass(), "modTime", 0L);
        setBooleanField(term75059, term75059.getClass(), "checkSumOK", false);
        setByteField(term75059, term75059.getClass(), "linkFlag", (byte) 103);
        setField(term75059, term75059.getClass(), "linkName", null);
        setField(term75059, term75059.getClass(), "magic", null);
        setField(term75059, term75059.getClass(), "version", null);
        setField(term75059, term75059.getClass(), "userName", null);
        setField(term75059, term75059.getClass(), "groupName", null);
        setIntField(term75059, term75059.getClass(), "devMajor", 0);
        setIntField(term75059, term75059.getClass(), "devMinor", 0);
        setBooleanField(term75059, term75059.getClass(), "isExtended", false);
        setLongField(term75059, term75059.getClass(), "realSize", 0L);
        setBooleanField(term75059, term75059.getClass(), "paxGNUSparse", false);
        setBooleanField(term75059, term75059.getClass(), "starSparse", false);
        setField(term75059, term75059.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGlobalPaxHeader", argTypes, term75041, args);
        assertTrue(recursiveEquals(term75041, term75059));
        assertTrue(recursiveEquals(retValue, true));
    }

};


