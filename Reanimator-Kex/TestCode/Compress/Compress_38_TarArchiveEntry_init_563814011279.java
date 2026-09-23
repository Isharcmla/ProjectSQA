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

public class TarArchiveEntry_init_563814011279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85713;

    public TarArchiveEntry_init_563814011279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85475 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term85475, term85475.getClass(), "name", "");
        setLongField(term85475, term85475.getClass(), "userId", 0L);
        setLongField(term85475, term85475.getClass(), "groupId", 0L);
        setLongField(term85475, term85475.getClass(), "size", 0L);
        setField(term85475, term85475.getClass(), "linkName", "");
        setField(term85475, term85475.getClass(), "magic", "");
        setField(term85475, term85475.getClass(), "version", null);
        setField(term85475, term85475.getClass(), "groupName", null);
        setIntField(term85475, term85475.getClass(), "devMajor", 0);
        setIntField(term85475, term85475.getClass(), "devMinor", 0);
        setField(term85475, term85475.getClass(), "userName", "");
        setField(term85475, term85475.getClass(), "file", null);
        setBooleanField(term85475, term85475.getClass(), "preserveLeadingSlashes", false);
        term85713 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term85713, term85713.getClass(), "name", "");
        setBooleanField(term85713, term85713.getClass(), "preserveLeadingSlashes", true);
        setIntField(term85713, term85713.getClass(), "mode", 33188);
        setLongField(term85713, term85713.getClass(), "userId", 0L);
        setLongField(term85713, term85713.getClass(), "groupId", 0L);
        setLongField(term85713, term85713.getClass(), "size", 0L);
        setLongField(term85713, term85713.getClass(), "modTime", 1790003332L);
        setBooleanField(term85713, term85713.getClass(), "checkSumOK", false);
        setByteField(term85713, term85713.getClass(), "linkFlag", (byte) 48);
        setField(term85713, term85713.getClass(), "linkName", "");
        setField(term85713, term85713.getClass(), "magic", "ustar ");
        setField(term85713, term85713.getClass(), "version", "00");
        setField(term85713, term85713.getClass(), "userName", "");
        setField(term85713, term85713.getClass(), "groupName", "");
        setIntField(term85713, term85713.getClass(), "devMajor", 0);
        setIntField(term85713, term85713.getClass(), "devMinor", 0);
        setBooleanField(term85713, term85713.getClass(), "isExtended", false);
        setLongField(term85713, term85713.getClass(), "realSize", 0L);
        setBooleanField(term85713, term85713.getClass(), "paxGNUSparse", false);
        setBooleanField(term85713, term85713.getClass(), "starSparse", false);
        setField(term85713, term85713.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term85713));
    }

};


