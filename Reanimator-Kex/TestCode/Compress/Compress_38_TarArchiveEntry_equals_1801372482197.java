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

public class TarArchiveEntry_equals_1801372482197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62244;
     Object term62304;
     Object term62326;
     Object term62327;

    public TarArchiveEntry_equals_1801372482197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62244 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term62304 = newInstance(Class.forName("java.lang.StackTraceElement"));
        term62326 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term62326, term62326.getClass(), "name", null);
        setBooleanField(term62326, term62326.getClass(), "preserveLeadingSlashes", false);
        setIntField(term62326, term62326.getClass(), "mode", 0);
        setLongField(term62326, term62326.getClass(), "userId", 0L);
        setLongField(term62326, term62326.getClass(), "groupId", 0L);
        setLongField(term62326, term62326.getClass(), "size", 0L);
        setLongField(term62326, term62326.getClass(), "modTime", 0L);
        setBooleanField(term62326, term62326.getClass(), "checkSumOK", false);
        setByteField(term62326, term62326.getClass(), "linkFlag", (byte) 0);
        setField(term62326, term62326.getClass(), "linkName", null);
        setField(term62326, term62326.getClass(), "magic", null);
        setField(term62326, term62326.getClass(), "version", null);
        setField(term62326, term62326.getClass(), "userName", null);
        setField(term62326, term62326.getClass(), "groupName", null);
        setIntField(term62326, term62326.getClass(), "devMajor", 0);
        setIntField(term62326, term62326.getClass(), "devMinor", 0);
        setBooleanField(term62326, term62326.getClass(), "isExtended", false);
        setLongField(term62326, term62326.getClass(), "realSize", 0L);
        setBooleanField(term62326, term62326.getClass(), "paxGNUSparse", false);
        setBooleanField(term62326, term62326.getClass(), "starSparse", false);
        setField(term62326, term62326.getClass(), "file", null);
        term62327 = newInstance(Class.forName("java.lang.StackTraceElement"));
        setField(term62327, term62327.getClass(), "declaringClassObject", null);
        setField(term62327, term62327.getClass(), "classLoaderName", null);
        setField(term62327, term62327.getClass(), "moduleName", null);
        setField(term62327, term62327.getClass(), "moduleVersion", null);
        setField(term62327, term62327.getClass(), "declaringClass", null);
        setField(term62327, term62327.getClass(), "methodName", null);
        setField(term62327, term62327.getClass(), "fileName", null);
        setIntField(term62327, term62327.getClass(), "lineNumber", 0);
        setByteField(term62327, term62327.getClass(), "format", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term62304;
        Object retValue = callMethod(klass, "equals", argTypes, term62244, args);
        assertTrue(recursiveEquals(term62244, term62326));
        assertTrue(recursiveEquals(term62304, term62327));
        assertTrue(recursiveEquals(retValue, false));
    }

};


