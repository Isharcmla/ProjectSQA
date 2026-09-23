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

public class TarArchiveEntry_isFIFO_1211150438189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61071;
     Object term61089;

    public TarArchiveEntry_isFIFO_1211150438189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61071 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term61071, term61071.getClass(), "linkFlag", (byte) 54);
        term61089 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term61089, term61089.getClass(), "name", null);
        setBooleanField(term61089, term61089.getClass(), "preserveLeadingSlashes", false);
        setIntField(term61089, term61089.getClass(), "mode", 0);
        setLongField(term61089, term61089.getClass(), "userId", 0L);
        setLongField(term61089, term61089.getClass(), "groupId", 0L);
        setLongField(term61089, term61089.getClass(), "size", 0L);
        setLongField(term61089, term61089.getClass(), "modTime", 0L);
        setBooleanField(term61089, term61089.getClass(), "checkSumOK", false);
        setByteField(term61089, term61089.getClass(), "linkFlag", (byte) 54);
        setField(term61089, term61089.getClass(), "linkName", null);
        setField(term61089, term61089.getClass(), "magic", null);
        setField(term61089, term61089.getClass(), "version", null);
        setField(term61089, term61089.getClass(), "userName", null);
        setField(term61089, term61089.getClass(), "groupName", null);
        setIntField(term61089, term61089.getClass(), "devMajor", 0);
        setIntField(term61089, term61089.getClass(), "devMinor", 0);
        setBooleanField(term61089, term61089.getClass(), "isExtended", false);
        setLongField(term61089, term61089.getClass(), "realSize", 0L);
        setBooleanField(term61089, term61089.getClass(), "paxGNUSparse", false);
        setBooleanField(term61089, term61089.getClass(), "starSparse", false);
        setField(term61089, term61089.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isFIFO", argTypes, term61071, args);
        assertTrue(recursiveEquals(term61071, term61089));
        assertTrue(recursiveEquals(retValue, true));
    }

};


