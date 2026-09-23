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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CpioArchiveOutputStream_write_1858506652248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121364;
     Object term120269;

    public CpioArchiveOutputStream_write_1858506652248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121364 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term121488 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        Object term121622 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveOutputStream"));
        Object term121782 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry"));
        setBooleanField(term121364, term121364.getClass(), "closed", false);
        setLongField(term121488, term121488.getClass(), "filesize", 2312598425834717184L);
        setField(term121364, term121364.getClass(), "entry", term121488);
        setLongField(term121364, term121364.getClass(), "written", -2313442852159456276L);
        setField(term121622, term121622.getClass(), "entry", term121782);
        setField(term121364, term121364.getClass(), "out", term121622);
        term120269 = (byte[]) newByteArray(903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term120269;
        args[1] = 384;
        args[2] = 19;
        try {
            callMethod(klass, "write", argTypes, term121364, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


