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

public class TarArchiveOutputStream_close_1914055047249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143457;

    public TarArchiveOutputStream_close_1914055047249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143457 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term142315 = (byte[]) newByteArray(489);
        Object term143519 = newInstance(Class.forName("java.nio.channels.Channels$1"));
        setBooleanField(term143457, term143457.getClass(), "finished", false);
        setBooleanField(term143457, term143457.getClass(), "haveUnclosedEntry", false);
        setField(term143457, term143457.getClass(), "recordBuf", term142315);
        setIntField(term143457, term143457.getClass(), "recordSize", 489);
        setField(term143457, term143457.getClass(), "out", term143519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term143457, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


