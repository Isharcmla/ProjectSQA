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

public class TarArchiveEntry_init_836439475241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TarArchiveEntry_init_836439475241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74447 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term74447, term74447.getClass(), "name", null);
        setLongField(term74447, term74447.getClass(), "userId", 0L);
        setLongField(term74447, term74447.getClass(), "groupId", 0L);
        setLongField(term74447, term74447.getClass(), "size", 0L);
        setField(term74447, term74447.getClass(), "linkName", null);
        setField(term74447, term74447.getClass(), "magic", "");
        setField(term74447, term74447.getClass(), "version", null);
        setField(term74447, term74447.getClass(), "groupName", "");
        setIntField(term74447, term74447.getClass(), "devMajor", 0);
        setIntField(term74447, term74447.getClass(), "devMinor", 0);
        setField(term74447, term74447.getClass(), "userName", null);
        setField(term74447, term74447.getClass(), "file", null);
        setBooleanField(term74447, term74447.getClass(), "preserveLeadingSlashes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


