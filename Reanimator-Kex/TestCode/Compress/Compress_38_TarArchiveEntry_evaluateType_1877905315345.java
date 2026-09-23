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

public class TarArchiveEntry_evaluateType_1877905315345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354331;
     Object term352689;
     Object term355312;
     Object term355313;

    public TarArchiveEntry_evaluateType_1877905315345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354331 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term352689 = (byte[]) newByteArray(458);
        setByteElement(term352689, 257, (byte) -128);
        term355312 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term355312, term355312.getClass(), "name", null);
        setBooleanField(term355312, term355312.getClass(), "preserveLeadingSlashes", false);
        setIntField(term355312, term355312.getClass(), "mode", 0);
        setLongField(term355312, term355312.getClass(), "userId", 0L);
        setLongField(term355312, term355312.getClass(), "groupId", 0L);
        setLongField(term355312, term355312.getClass(), "size", 0L);
        setLongField(term355312, term355312.getClass(), "modTime", 0L);
        setBooleanField(term355312, term355312.getClass(), "checkSumOK", false);
        setByteField(term355312, term355312.getClass(), "linkFlag", (byte) 0);
        setField(term355312, term355312.getClass(), "linkName", null);
        setField(term355312, term355312.getClass(), "magic", null);
        setField(term355312, term355312.getClass(), "version", null);
        setField(term355312, term355312.getClass(), "userName", null);
        setField(term355312, term355312.getClass(), "groupName", null);
        setIntField(term355312, term355312.getClass(), "devMajor", 0);
        setIntField(term355312, term355312.getClass(), "devMinor", 0);
        setBooleanField(term355312, term355312.getClass(), "isExtended", false);
        setLongField(term355312, term355312.getClass(), "realSize", 0L);
        setBooleanField(term355312, term355312.getClass(), "paxGNUSparse", false);
        setBooleanField(term355312, term355312.getClass(), "starSparse", false);
        setField(term355312, term355312.getClass(), "file", null);
        term355313 = (byte[]) newByteArray(458);
        setByteElement(term355313, 257, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term352689;
        Object retValue = callMethod(klass, "evaluateType", argTypes, term354331, args);
        assertTrue(recursiveEquals(term354331, term355312));
        assertTrue(recursiveEquals(term352689, term355313));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


