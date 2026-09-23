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

public class CpioArchiveOutputStream_writeOldBinaryEntry_1291387151150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63583;
     Object term63781;

    public CpioArchiveOutputStream_writeOldBinaryEntry_1291387151150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63583 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term63657 = newInstance(Class.forName("java.util.zip.InflaterOutputStream"));
        setLongField(term63583, term63583.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term63583, term63583.getClass(), "out", term63657);
        term63781 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term63781, term63781.getClass(), "inode", 17188257793L);
        setShortField(term63781, term63781.getClass(), "fileFormat", (short) 4);
        setLongField(term63781, term63781.getClass(), "min", 24L);
        setField(term63781, term63781.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term63781;
        args[1] = false;
        try {
            callMethod(klass, "writeOldBinaryEntry", argTypes, term63583, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


