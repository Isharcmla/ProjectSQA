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

public class TarArchiveEntry_setName_2122267278339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351475;
     Object term351541;

    public TarArchiveEntry_setName_2122267278339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351475 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setBooleanField(term351475, term351475.getClass(), "preserveLeadingSlashes", false);
        term351541 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term351541, term351541.getClass(), "name", "");
        setBooleanField(term351541, term351541.getClass(), "preserveLeadingSlashes", false);
        setIntField(term351541, term351541.getClass(), "mode", 0);
        setLongField(term351541, term351541.getClass(), "userId", 0L);
        setLongField(term351541, term351541.getClass(), "groupId", 0L);
        setLongField(term351541, term351541.getClass(), "size", 0L);
        setLongField(term351541, term351541.getClass(), "modTime", 0L);
        setBooleanField(term351541, term351541.getClass(), "checkSumOK", false);
        setByteField(term351541, term351541.getClass(), "linkFlag", (byte) 0);
        setField(term351541, term351541.getClass(), "linkName", null);
        setField(term351541, term351541.getClass(), "magic", null);
        setField(term351541, term351541.getClass(), "version", null);
        setField(term351541, term351541.getClass(), "userName", null);
        setField(term351541, term351541.getClass(), "groupName", null);
        setIntField(term351541, term351541.getClass(), "devMajor", 0);
        setIntField(term351541, term351541.getClass(), "devMinor", 0);
        setBooleanField(term351541, term351541.getClass(), "isExtended", false);
        setLongField(term351541, term351541.getClass(), "realSize", 0L);
        setBooleanField(term351541, term351541.getClass(), "paxGNUSparse", false);
        setBooleanField(term351541, term351541.getClass(), "starSparse", false);
        setField(term351541, term351541.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "setName", argTypes, term351475, args);
        assertTrue(recursiveEquals(term351475, term351541));
    }

};


