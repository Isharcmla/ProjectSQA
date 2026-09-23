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

public class TarArchiveEntry_init_988693776313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341007;

    public TarArchiveEntry_init_988693776313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term341693 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term341799 = newInstance(Class.forName("java.io.File"));
        setField(term341693, term341693.getClass(), "name", "");
        setLongField(term341693, term341693.getClass(), "userId", 0L);
        setLongField(term341693, term341693.getClass(), "groupId", 0L);
        setLongField(term341693, term341693.getClass(), "size", 0L);
        setField(term341693, term341693.getClass(), "linkName", null);
        setField(term341693, term341693.getClass(), "magic", null);
        setField(term341693, term341693.getClass(), "version", null);
        setField(term341693, term341693.getClass(), "groupName", null);
        setIntField(term341693, term341693.getClass(), "devMajor", 0);
        setIntField(term341693, term341693.getClass(), "devMinor", 0);
        setField(term341693, term341693.getClass(), "userName", "");
        setField(term341693, term341693.getClass(), "file", term341799);
        term341007 = (byte[]) newByteArray(489);
        setByteElement(term341007, 0, (byte) 117);
        setByteElement(term341007, 1, (byte) 115);
        setByteElement(term341007, 2, (byte) 101);
        setByteElement(term341007, 3, (byte) 114);
        setByteElement(term341007, 4, (byte) 46);
        setByteElement(term341007, 5, (byte) 110);
        setByteElement(term341007, 6, (byte) 97);
        setByteElement(term341007, 7, (byte) 109);
        setByteElement(term341007, 8, (byte) 101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term341007;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


