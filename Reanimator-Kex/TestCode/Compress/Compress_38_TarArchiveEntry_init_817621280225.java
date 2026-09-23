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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveEntry_init_817621280225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69453;

    public TarArchiveEntry_init_817621280225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69241 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term69423 = newInstance(Class.forName("java.io.File"));
        setField(term69241, term69241.getClass(), "name", "");
        setLongField(term69241, term69241.getClass(), "userId", 0L);
        setLongField(term69241, term69241.getClass(), "groupId", 0L);
        setLongField(term69241, term69241.getClass(), "size", 0L);
        setField(term69241, term69241.getClass(), "linkName", "");
        setField(term69241, term69241.getClass(), "magic", null);
        setField(term69241, term69241.getClass(), "version", "");
        setField(term69241, term69241.getClass(), "groupName", "");
        setIntField(term69241, term69241.getClass(), "devMajor", 0);
        setIntField(term69241, term69241.getClass(), "devMinor", 0);
        setField(term69241, term69241.getClass(), "file", term69423);
        term69453 = newInstance(Class.forName("java.io.File"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term69453;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


