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

public class TarArchiveOutputStream_flush_287142803102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99559;
     Object term100225;

    public TarArchiveOutputStream_flush_287142803102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99559 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term99693 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term99749 = newInstance(Class.forName("java.io.PipedOutputStream"));
        setField(term99693, term99693.getClass(), "out", term99749);
        setField(term99559, term99559.getClass(), "out", term99693);
        term100225 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term100226 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term100227 = newInstance(Class.forName("java.io.PipedOutputStream"));
        setLongField(term100225, term100225.getClass(), "currSize", 0L);
        setField(term100225, term100225.getClass(), "currName", null);
        setLongField(term100225, term100225.getClass(), "currBytes", 0L);
        setField(term100225, term100225.getClass(), "recordBuf", null);
        setIntField(term100225, term100225.getClass(), "assemLen", 0);
        setField(term100225, term100225.getClass(), "assemBuf", null);
        setField(term100225, term100225.getClass(), "buffer", null);
        setIntField(term100225, term100225.getClass(), "longFileMode", 0);
        setBooleanField(term100225, term100225.getClass(), "closed", false);
        setLongField(term100226, term100226.getClass(), "currSize", 0L);
        setField(term100226, term100226.getClass(), "currName", null);
        setLongField(term100226, term100226.getClass(), "currBytes", 0L);
        setField(term100226, term100226.getClass(), "recordBuf", null);
        setIntField(term100226, term100226.getClass(), "assemLen", 0);
        setField(term100226, term100226.getClass(), "assemBuf", null);
        setField(term100226, term100226.getClass(), "buffer", null);
        setIntField(term100226, term100226.getClass(), "longFileMode", 0);
        setBooleanField(term100226, term100226.getClass(), "closed", false);
        setField(term100227, term100227.getClass(), "sink", null);
        setField(term100226, term100226.getClass(), "out", term100227);
        setField(term100226, term100226.getClass(), "oneByte", null);
        setField(term100225, term100225.getClass(), "out", term100226);
        setField(term100225, term100225.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term99559, args);
        assertTrue(recursiveEquals(term99559, term100225));
    }

};


