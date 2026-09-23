package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;

public class ZipArchiveEntry_init_51252365038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25084;

    public ZipArchiveEntry_init_51252365038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25084 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term25084, term25084.getClass(), "method", -1);
        setIntField(term25084, term25084.getClass(), "internalAttributes", 0);
        setIntField(term25084, term25084.getClass(), "platform", 0);
        setLongField(term25084, term25084.getClass(), "externalAttributes", 0L);
        setField(term25084, term25084.getClass(), "extraFields", null);
        setField(term25084, term25084.getClass(), "name", "");
        setLongField(term25084, term25084.getClass(), "xdostime", -1L);
        setField(term25084, term25084.getClass(), "mtime", null);
        setField(term25084, term25084.getClass(), "atime", null);
        setField(term25084, term25084.getClass(), "ctime", null);
        setLongField(term25084, term25084.getClass(), "crc", -1L);
        setLongField(term25084, term25084.getClass(), "size", -1L);
        setLongField(term25084, term25084.getClass(), "csize", -1L);
        setIntField(term25084, term25084.getClass(), "flag", 0);
        setField(term25084, term25084.getClass(), "extra", null);
        setField(term25084, term25084.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25084));
    }

};


