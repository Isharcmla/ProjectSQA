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
import java.lang.Object;

public class TarArchiveEntry_init_563814011167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55707;

    public TarArchiveEntry_init_563814011167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55525 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term55593 = newInstance(Class.forName("java.io.File"));
        setField(term55525, term55525.getClass(), "name", null);
        setLongField(term55525, term55525.getClass(), "userId", 0L);
        setLongField(term55525, term55525.getClass(), "groupId", 0L);
        setLongField(term55525, term55525.getClass(), "size", 0L);
        setField(term55525, term55525.getClass(), "linkName", null);
        setField(term55525, term55525.getClass(), "magic", null);
        setField(term55525, term55525.getClass(), "version", null);
        setField(term55525, term55525.getClass(), "groupName", null);
        setIntField(term55525, term55525.getClass(), "devMajor", 0);
        setIntField(term55525, term55525.getClass(), "devMinor", 0);
        setField(term55525, term55525.getClass(), "userName", "");
        setField(term55525, term55525.getClass(), "file", term55593);
        setBooleanField(term55525, term55525.getClass(), "preserveLeadingSlashes", false);
        term55707 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term55707, term55707.getClass(), "name", "");
        setBooleanField(term55707, term55707.getClass(), "preserveLeadingSlashes", false);
        setIntField(term55707, term55707.getClass(), "mode", 33188);
        setLongField(term55707, term55707.getClass(), "userId", 0L);
        setLongField(term55707, term55707.getClass(), "groupId", 0L);
        setLongField(term55707, term55707.getClass(), "size", 0L);
        setLongField(term55707, term55707.getClass(), "modTime", 1790003315L);
        setBooleanField(term55707, term55707.getClass(), "checkSumOK", false);
        setByteField(term55707, term55707.getClass(), "linkFlag", (byte) 48);
        setField(term55707, term55707.getClass(), "linkName", "");
        setField(term55707, term55707.getClass(), "magic", "ustar ");
        setField(term55707, term55707.getClass(), "version", "00");
        setField(term55707, term55707.getClass(), "userName", "");
        setField(term55707, term55707.getClass(), "groupName", "");
        setIntField(term55707, term55707.getClass(), "devMajor", 0);
        setIntField(term55707, term55707.getClass(), "devMinor", 0);
        setBooleanField(term55707, term55707.getClass(), "isExtended", false);
        setLongField(term55707, term55707.getClass(), "realSize", 0L);
        setBooleanField(term55707, term55707.getClass(), "paxGNUSparse", false);
        setBooleanField(term55707, term55707.getClass(), "starSparse", false);
        setField(term55707, term55707.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55707));
    }

};


