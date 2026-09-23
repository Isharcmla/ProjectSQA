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

public class TarArchiveEntry_init_988692598235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73209;

    public TarArchiveEntry_init_988692598235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73040 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term73040, term73040.getClass(), "name", "ustar ");
        setLongField(term73040, term73040.getClass(), "userId", 0L);
        setLongField(term73040, term73040.getClass(), "groupId", 0L);
        setLongField(term73040, term73040.getClass(), "size", 0L);
        setField(term73040, term73040.getClass(), "linkName", null);
        setField(term73040, term73040.getClass(), "magic", null);
        setField(term73040, term73040.getClass(), "version", "");
        setField(term73040, term73040.getClass(), "groupName", null);
        setIntField(term73040, term73040.getClass(), "devMajor", 0);
        setIntField(term73040, term73040.getClass(), "devMinor", 0);
        term73209 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term73209, term73209.getClass(), "name", "");
        setBooleanField(term73209, term73209.getClass(), "preserveLeadingSlashes", false);
        setIntField(term73209, term73209.getClass(), "mode", 0);
        setLongField(term73209, term73209.getClass(), "userId", 0L);
        setLongField(term73209, term73209.getClass(), "groupId", 0L);
        setLongField(term73209, term73209.getClass(), "size", 0L);
        setLongField(term73209, term73209.getClass(), "modTime", 0L);
        setBooleanField(term73209, term73209.getClass(), "checkSumOK", false);
        setByteField(term73209, term73209.getClass(), "linkFlag", (byte) 0);
        setField(term73209, term73209.getClass(), "linkName", "");
        setField(term73209, term73209.getClass(), "magic", "ustar ");
        setField(term73209, term73209.getClass(), "version", "00");
        setField(term73209, term73209.getClass(), "userName", "root");
        setField(term73209, term73209.getClass(), "groupName", "");
        setIntField(term73209, term73209.getClass(), "devMajor", 0);
        setIntField(term73209, term73209.getClass(), "devMinor", 0);
        setBooleanField(term73209, term73209.getClass(), "isExtended", false);
        setLongField(term73209, term73209.getClass(), "realSize", 0L);
        setBooleanField(term73209, term73209.getClass(), "paxGNUSparse", false);
        setBooleanField(term73209, term73209.getClass(), "starSparse", false);
        setField(term73209, term73209.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term73209));
    }

};


