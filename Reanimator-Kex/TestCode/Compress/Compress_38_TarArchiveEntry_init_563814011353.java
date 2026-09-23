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

public class TarArchiveEntry_init_563814011353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TarArchiveEntry_init_563814011353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term363186 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term363368 = newInstance(Class.forName("java.io.File"));
        setField(term363186, term363186.getClass(), "name", null);
        setLongField(term363186, term363186.getClass(), "userId", 0L);
        setLongField(term363186, term363186.getClass(), "groupId", 0L);
        setLongField(term363186, term363186.getClass(), "size", 0L);
        setField(term363186, term363186.getClass(), "linkName", "");
        setField(term363186, term363186.getClass(), "magic", null);
        setField(term363186, term363186.getClass(), "version", "");
        setField(term363186, term363186.getClass(), "groupName", "");
        setIntField(term363186, term363186.getClass(), "devMajor", 0);
        setIntField(term363186, term363186.getClass(), "devMinor", 0);
        setField(term363186, term363186.getClass(), "userName", "en");
        setField(term363186, term363186.getClass(), "file", term363368);
        setBooleanField(term363186, term363186.getClass(), "preserveLeadingSlashes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


