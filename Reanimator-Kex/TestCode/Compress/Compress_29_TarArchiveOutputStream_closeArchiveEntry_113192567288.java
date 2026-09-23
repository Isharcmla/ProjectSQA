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

public class TarArchiveOutputStream_closeArchiveEntry_113192567288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162607;

    public TarArchiveOutputStream_closeArchiveEntry_113192567288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162607 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term158816 = (byte[]) newByteArray(905);
        Object term162741 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term162607, term162607.getClass(), "finished", false);
        setBooleanField(term162607, term162607.getClass(), "haveUnclosedEntry", true);
        setIntField(term162607, term162607.getClass(), "assemLen", 904);
        setField(term162607, term162607.getClass(), "assemBuf", term158816);
        setIntField(term162607, term162607.getClass(), "recordSize", 905);
        setField(term162607, term162607.getClass(), "out", term162741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term162607, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


