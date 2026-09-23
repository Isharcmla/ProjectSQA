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
import java.lang.Object;

public class TarArchiveEntry_init_123655668297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97285;

    public TarArchiveEntry_init_123655668297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term97717 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term97717, term97717.getClass(), "name", "");
        setLongField(term97717, term97717.getClass(), "userId", 0L);
        setLongField(term97717, term97717.getClass(), "groupId", 0L);
        setLongField(term97717, term97717.getClass(), "size", 0L);
        setField(term97717, term97717.getClass(), "linkName", "");
        setField(term97717, term97717.getClass(), "magic", "");
        setField(term97717, term97717.getClass(), "version", null);
        setField(term97717, term97717.getClass(), "groupName", null);
        setIntField(term97717, term97717.getClass(), "devMajor", 0);
        setIntField(term97717, term97717.getClass(), "devMinor", 0);
        setField(term97717, term97717.getClass(), "userName", null);
        setField(term97717, term97717.getClass(), "file", null);
        term97285 = (byte[]) newByteArray(233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Object[] args = new Object[2];
        args[0] = term97285;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


