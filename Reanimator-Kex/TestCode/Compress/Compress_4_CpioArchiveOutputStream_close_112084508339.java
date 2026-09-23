package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;

public class CpioArchiveOutputStream_close_112084508339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6472;
     Object term6964;

    public CpioArchiveOutputStream_close_112084508339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6472 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setBooleanField(term6472, term6472.getClass(), "closed", true);
        term6964 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term6964, term6964.getClass(), "entry", null);
        setBooleanField(term6964, term6964.getClass(), "closed", true);
        setBooleanField(term6964, term6964.getClass(), "finished", false);
        setShortField(term6964, term6964.getClass(), "entryFormat", (short) 0);
        setField(term6964, term6964.getClass(), "names", null);
        setLongField(term6964, term6964.getClass(), "crc", 0L);
        setLongField(term6964, term6964.getClass(), "written", 0L);
        setField(term6964, term6964.getClass(), "out", null);
        setField(term6964, term6964.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term6472, args);
        assertTrue(recursiveEquals(term6472, term6964));
    }

};


