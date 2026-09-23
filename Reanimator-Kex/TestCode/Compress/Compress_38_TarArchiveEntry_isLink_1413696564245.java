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

public class TarArchiveEntry_isLink_1413696564245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75209;
     Object term75227;

    public TarArchiveEntry_isLink_1413696564245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75209 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term75209, term75209.getClass(), "linkFlag", (byte) 49);
        term75227 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term75227, term75227.getClass(), "name", null);
        setBooleanField(term75227, term75227.getClass(), "preserveLeadingSlashes", false);
        setIntField(term75227, term75227.getClass(), "mode", 0);
        setLongField(term75227, term75227.getClass(), "userId", 0L);
        setLongField(term75227, term75227.getClass(), "groupId", 0L);
        setLongField(term75227, term75227.getClass(), "size", 0L);
        setLongField(term75227, term75227.getClass(), "modTime", 0L);
        setBooleanField(term75227, term75227.getClass(), "checkSumOK", false);
        setByteField(term75227, term75227.getClass(), "linkFlag", (byte) 49);
        setField(term75227, term75227.getClass(), "linkName", null);
        setField(term75227, term75227.getClass(), "magic", null);
        setField(term75227, term75227.getClass(), "version", null);
        setField(term75227, term75227.getClass(), "userName", null);
        setField(term75227, term75227.getClass(), "groupName", null);
        setIntField(term75227, term75227.getClass(), "devMajor", 0);
        setIntField(term75227, term75227.getClass(), "devMinor", 0);
        setBooleanField(term75227, term75227.getClass(), "isExtended", false);
        setLongField(term75227, term75227.getClass(), "realSize", 0L);
        setBooleanField(term75227, term75227.getClass(), "paxGNUSparse", false);
        setBooleanField(term75227, term75227.getClass(), "starSparse", false);
        setField(term75227, term75227.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLink", argTypes, term75209, args);
        assertTrue(recursiveEquals(term75209, term75227));
        assertTrue(recursiveEquals(retValue, true));
    }

};


