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

public class TarArchiveEntry_evaluateType_1877905315349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360387;
     Object term359236;
     Object term361432;
     Object term361433;

    public TarArchiveEntry_evaluateType_1877905315349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360387 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term359236 = (byte[]) newByteArray(490);
        setByteElement(term359236, 257, (byte) -128);
        term361432 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term361432, term361432.getClass(), "name", null);
        setBooleanField(term361432, term361432.getClass(), "preserveLeadingSlashes", false);
        setIntField(term361432, term361432.getClass(), "mode", 0);
        setLongField(term361432, term361432.getClass(), "userId", 0L);
        setLongField(term361432, term361432.getClass(), "groupId", 0L);
        setLongField(term361432, term361432.getClass(), "size", 0L);
        setLongField(term361432, term361432.getClass(), "modTime", 0L);
        setBooleanField(term361432, term361432.getClass(), "checkSumOK", false);
        setByteField(term361432, term361432.getClass(), "linkFlag", (byte) 0);
        setField(term361432, term361432.getClass(), "linkName", null);
        setField(term361432, term361432.getClass(), "magic", null);
        setField(term361432, term361432.getClass(), "version", null);
        setField(term361432, term361432.getClass(), "userName", null);
        setField(term361432, term361432.getClass(), "groupName", null);
        setIntField(term361432, term361432.getClass(), "devMajor", 0);
        setIntField(term361432, term361432.getClass(), "devMinor", 0);
        setBooleanField(term361432, term361432.getClass(), "isExtended", false);
        setLongField(term361432, term361432.getClass(), "realSize", 0L);
        setBooleanField(term361432, term361432.getClass(), "paxGNUSparse", false);
        setBooleanField(term361432, term361432.getClass(), "starSparse", false);
        setField(term361432, term361432.getClass(), "file", null);
        term361433 = (byte[]) newByteArray(490);
        setByteElement(term361433, 257, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term359236;
        Object retValue = callMethod(klass, "evaluateType", argTypes, term360387, args);
        assertTrue(recursiveEquals(term360387, term361432));
        assertTrue(recursiveEquals(term359236, term361433));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


