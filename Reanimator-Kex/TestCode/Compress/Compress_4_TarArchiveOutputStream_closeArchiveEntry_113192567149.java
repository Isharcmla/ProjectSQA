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

public class TarArchiveOutputStream_closeArchiveEntry_113192567149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117085;

    public TarArchiveOutputStream_closeArchiveEntry_113192567149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117085 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term116927 = (byte[]) newByteArray(0);
        Object term117193 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term117327 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setIntField(term117085, term117085.getClass(), "assemLen", 1022);
        setField(term117085, term117085.getClass(), "assemBuf", term116927);
        setField(term117193, term117193.getClass(), "outStream", term117327);
        setField(term117085, term117085.getClass(), "buffer", term117193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term117085, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


