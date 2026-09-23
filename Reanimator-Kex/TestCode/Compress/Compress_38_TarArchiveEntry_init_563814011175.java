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

public class TarArchiveEntry_init_563814011175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58239;

    public TarArchiveEntry_init_563814011175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57919 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term57919, term57919.getClass(), "name", "");
        setLongField(term57919, term57919.getClass(), "userId", 0L);
        setLongField(term57919, term57919.getClass(), "groupId", 0L);
        setLongField(term57919, term57919.getClass(), "size", 0L);
        setField(term57919, term57919.getClass(), "linkName", "");
        setField(term57919, term57919.getClass(), "magic", "ustar ");
        setField(term57919, term57919.getClass(), "version", "");
        setField(term57919, term57919.getClass(), "groupName", "");
        setIntField(term57919, term57919.getClass(), "devMajor", 0);
        setIntField(term57919, term57919.getClass(), "devMinor", 0);
        setField(term57919, term57919.getClass(), "userName", "");
        setField(term57919, term57919.getClass(), "file", null);
        setBooleanField(term57919, term57919.getClass(), "preserveLeadingSlashes", false);
        term58239 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term58239, term58239.getClass(), "name", "");
        setBooleanField(term58239, term58239.getClass(), "preserveLeadingSlashes", true);
        setIntField(term58239, term58239.getClass(), "mode", 33188);
        setLongField(term58239, term58239.getClass(), "userId", 0L);
        setLongField(term58239, term58239.getClass(), "groupId", 0L);
        setLongField(term58239, term58239.getClass(), "size", 0L);
        setLongField(term58239, term58239.getClass(), "modTime", 1790003317L);
        setBooleanField(term58239, term58239.getClass(), "checkSumOK", false);
        setByteField(term58239, term58239.getClass(), "linkFlag", (byte) 48);
        setField(term58239, term58239.getClass(), "linkName", "");
        setField(term58239, term58239.getClass(), "magic", "ustar ");
        setField(term58239, term58239.getClass(), "version", "00");
        setField(term58239, term58239.getClass(), "userName", "");
        setField(term58239, term58239.getClass(), "groupName", "");
        setIntField(term58239, term58239.getClass(), "devMajor", 0);
        setIntField(term58239, term58239.getClass(), "devMinor", 0);
        setBooleanField(term58239, term58239.getClass(), "isExtended", false);
        setLongField(term58239, term58239.getClass(), "realSize", 0L);
        setBooleanField(term58239, term58239.getClass(), "paxGNUSparse", false);
        setBooleanField(term58239, term58239.getClass(), "starSparse", false);
        setField(term58239, term58239.getClass(), "file", null);
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
        assertTrue(recursiveEquals(instance, term58239));
    }

};


