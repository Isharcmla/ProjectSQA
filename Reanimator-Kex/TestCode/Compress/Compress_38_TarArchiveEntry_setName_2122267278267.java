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

public class TarArchiveEntry_setName_2122267278267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82211;
     Object term82277;

    public TarArchiveEntry_setName_2122267278267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82211 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setBooleanField(term82211, term82211.getClass(), "preserveLeadingSlashes", false);
        term82277 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term82277, term82277.getClass(), "name", "");
        setBooleanField(term82277, term82277.getClass(), "preserveLeadingSlashes", false);
        setIntField(term82277, term82277.getClass(), "mode", 0);
        setLongField(term82277, term82277.getClass(), "userId", 0L);
        setLongField(term82277, term82277.getClass(), "groupId", 0L);
        setLongField(term82277, term82277.getClass(), "size", 0L);
        setLongField(term82277, term82277.getClass(), "modTime", 0L);
        setBooleanField(term82277, term82277.getClass(), "checkSumOK", false);
        setByteField(term82277, term82277.getClass(), "linkFlag", (byte) 0);
        setField(term82277, term82277.getClass(), "linkName", null);
        setField(term82277, term82277.getClass(), "magic", null);
        setField(term82277, term82277.getClass(), "version", null);
        setField(term82277, term82277.getClass(), "userName", null);
        setField(term82277, term82277.getClass(), "groupName", null);
        setIntField(term82277, term82277.getClass(), "devMajor", 0);
        setIntField(term82277, term82277.getClass(), "devMinor", 0);
        setBooleanField(term82277, term82277.getClass(), "isExtended", false);
        setLongField(term82277, term82277.getClass(), "realSize", 0L);
        setBooleanField(term82277, term82277.getClass(), "paxGNUSparse", false);
        setBooleanField(term82277, term82277.getClass(), "starSparse", false);
        setField(term82277, term82277.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "setName", argTypes, term82211, args);
        assertTrue(recursiveEquals(term82211, term82277));
    }

};


