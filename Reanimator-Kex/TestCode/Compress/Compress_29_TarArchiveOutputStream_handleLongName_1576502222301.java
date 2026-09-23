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

public class TarArchiveOutputStream_handleLongName_1576502222301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172614;

    public TarArchiveOutputStream_handleLongName_1576502222301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172614 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term172746 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
        setField(term172614, term172614.getClass(), "zipEncoding", term172746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = byte.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = "BIG_ENDIAN                                                                                              ";
        args[2] = null;
        args[3] = null;
        args[4] = (byte) 0;
        args[5] = null;
        callMethod(klass, "handleLongName", argTypes, term172614, args);
    }

};


