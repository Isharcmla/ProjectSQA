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

public class TarArchiveEntry_equals_1801372482303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96707;
     Object term96805;
     Object term337389;
     Object term337392;

    public TarArchiveEntry_equals_1801372482303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96707 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term96707, term96707.getClass(), "name", "");
        term96805 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term96805, term96805.getClass(), "name", null);
        term337389 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term337389, term337389.getClass(), "name", "");
        setBooleanField(term337389, term337389.getClass(), "preserveLeadingSlashes", false);
        setIntField(term337389, term337389.getClass(), "mode", 0);
        setLongField(term337389, term337389.getClass(), "userId", 0L);
        setLongField(term337389, term337389.getClass(), "groupId", 0L);
        setLongField(term337389, term337389.getClass(), "size", 0L);
        setLongField(term337389, term337389.getClass(), "modTime", 0L);
        setBooleanField(term337389, term337389.getClass(), "checkSumOK", false);
        setByteField(term337389, term337389.getClass(), "linkFlag", (byte) 0);
        setField(term337389, term337389.getClass(), "linkName", null);
        setField(term337389, term337389.getClass(), "magic", null);
        setField(term337389, term337389.getClass(), "version", null);
        setField(term337389, term337389.getClass(), "userName", null);
        setField(term337389, term337389.getClass(), "groupName", null);
        setIntField(term337389, term337389.getClass(), "devMajor", 0);
        setIntField(term337389, term337389.getClass(), "devMinor", 0);
        setBooleanField(term337389, term337389.getClass(), "isExtended", false);
        setLongField(term337389, term337389.getClass(), "realSize", 0L);
        setBooleanField(term337389, term337389.getClass(), "paxGNUSparse", false);
        setBooleanField(term337389, term337389.getClass(), "starSparse", false);
        setField(term337389, term337389.getClass(), "file", null);
        term337392 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term337392, term337392.getClass(), "name", null);
        setBooleanField(term337392, term337392.getClass(), "preserveLeadingSlashes", false);
        setIntField(term337392, term337392.getClass(), "mode", 0);
        setLongField(term337392, term337392.getClass(), "userId", 0L);
        setLongField(term337392, term337392.getClass(), "groupId", 0L);
        setLongField(term337392, term337392.getClass(), "size", 0L);
        setLongField(term337392, term337392.getClass(), "modTime", 0L);
        setBooleanField(term337392, term337392.getClass(), "checkSumOK", false);
        setByteField(term337392, term337392.getClass(), "linkFlag", (byte) 0);
        setField(term337392, term337392.getClass(), "linkName", null);
        setField(term337392, term337392.getClass(), "magic", null);
        setField(term337392, term337392.getClass(), "version", null);
        setField(term337392, term337392.getClass(), "userName", null);
        setField(term337392, term337392.getClass(), "groupName", null);
        setIntField(term337392, term337392.getClass(), "devMajor", 0);
        setIntField(term337392, term337392.getClass(), "devMinor", 0);
        setBooleanField(term337392, term337392.getClass(), "isExtended", false);
        setLongField(term337392, term337392.getClass(), "realSize", 0L);
        setBooleanField(term337392, term337392.getClass(), "paxGNUSparse", false);
        setBooleanField(term337392, term337392.getClass(), "starSparse", false);
        setField(term337392, term337392.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term96805;
        Object retValue = callMethod(klass, "equals", argTypes, term96707, args);
        assertTrue(recursiveEquals(term96707, term337389));
        assertTrue(recursiveEquals(term96805, term337392));
        assertTrue(recursiveEquals(retValue, false));
    }

};


