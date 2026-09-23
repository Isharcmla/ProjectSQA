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

public class TarArchiveEntry_isSparse_1184183718275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84557;
     Object term84583;

    public TarArchiveEntry_isSparse_1184183718275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84557 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term84557, term84557.getClass(), "linkFlag", (byte) 0);
        setBooleanField(term84557, term84557.getClass(), "paxGNUSparse", false);
        term84583 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term84583, term84583.getClass(), "name", null);
        setBooleanField(term84583, term84583.getClass(), "preserveLeadingSlashes", false);
        setIntField(term84583, term84583.getClass(), "mode", 0);
        setLongField(term84583, term84583.getClass(), "userId", 0L);
        setLongField(term84583, term84583.getClass(), "groupId", 0L);
        setLongField(term84583, term84583.getClass(), "size", 0L);
        setLongField(term84583, term84583.getClass(), "modTime", 0L);
        setBooleanField(term84583, term84583.getClass(), "checkSumOK", false);
        setByteField(term84583, term84583.getClass(), "linkFlag", (byte) 0);
        setField(term84583, term84583.getClass(), "linkName", null);
        setField(term84583, term84583.getClass(), "magic", null);
        setField(term84583, term84583.getClass(), "version", null);
        setField(term84583, term84583.getClass(), "userName", null);
        setField(term84583, term84583.getClass(), "groupName", null);
        setIntField(term84583, term84583.getClass(), "devMajor", 0);
        setIntField(term84583, term84583.getClass(), "devMinor", 0);
        setBooleanField(term84583, term84583.getClass(), "isExtended", false);
        setLongField(term84583, term84583.getClass(), "realSize", 0L);
        setBooleanField(term84583, term84583.getClass(), "paxGNUSparse", false);
        setBooleanField(term84583, term84583.getClass(), "starSparse", false);
        setField(term84583, term84583.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSparse", argTypes, term84557, args);
        assertTrue(recursiveEquals(term84557, term84583));
        assertTrue(recursiveEquals(retValue, false));
    }

};


