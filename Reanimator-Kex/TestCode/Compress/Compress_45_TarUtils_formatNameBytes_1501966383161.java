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
import org.mockito.Mockito;
import java.lang.Object;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.Charset;

public class TarUtils_formatNameBytes_1501966383161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45483;

    public TarUtils_formatNameBytes_1501966383161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45483 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term45287 = Mockito.mock(Class.forName("java.nio.charset.Charset"));
        Object term45288 = Mockito.mock(Class.forName("java.nio.charset.CharsetEncoder"));
        Mockito.when(((Charset)term45287).newEncoder()).thenReturn((CharsetEncoder)term45288);
        setField(term45483, term45483.getClass(), "charset", term45287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Object[] args = new Object[5];
        args[0] = "REPORT                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ";
        args[1] = null;
        args[2] = 0;
        args[3] = 0;
        args[4] = term45483;
        callMethod(klass, "formatNameBytes", argTypes, null, args);
    }

};


