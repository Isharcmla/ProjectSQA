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

public class TarArchiveOutputStream_close_191405504730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81374;
     Object term81723;

    public TarArchiveOutputStream_close_191405504730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81374 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term81374, term81374.getClass(), "closed", true);
        term81723 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term81723, term81723.getClass(), "currSize", 0L);
        setField(term81723, term81723.getClass(), "currName", null);
        setLongField(term81723, term81723.getClass(), "currBytes", 0L);
        setField(term81723, term81723.getClass(), "recordBuf", null);
        setIntField(term81723, term81723.getClass(), "assemLen", 0);
        setField(term81723, term81723.getClass(), "assemBuf", null);
        setField(term81723, term81723.getClass(), "buffer", null);
        setIntField(term81723, term81723.getClass(), "longFileMode", 0);
        setBooleanField(term81723, term81723.getClass(), "closed", true);
        setField(term81723, term81723.getClass(), "out", null);
        setField(term81723, term81723.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term81374, args);
        assertTrue(recursiveEquals(term81374, term81723));
    }

};


