package org.apache.commons.compress.archivers.sevenz;

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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Coders_addEncoder_684310764108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175828;
     Object enum282;

    public Coders_addEncoder_684310764108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175828 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term175966 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term175828, term175828.getClass(), "out", term175966);
        Class<? extends Object> term176824 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term176823 = ((Class) term176824).getDeclaredField((String) "COPY");
        ((Field) term176823).setAccessible(true);
        enum282 = ((Field) term176823).get((Object) null);
        Class<? extends Object> term177128 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term177127 = ((Class) term177128).getDeclaredField((String) "LZMA");
        ((Field) term177127).setAccessible(true);
        Object enum283 = ((Field) term177127).get((Object) null);
        Class<? extends Object> term177432 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term177431 = ((Class) term177432).getDeclaredField((String) "COPY");
        ((Field) term177431).setAccessible(true);
        Object enum284 = ((Field) term177431).get((Object) null);
        Object[] term175667 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term176248 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term176530 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term176822 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term176248, term176248.getClass(), "method", enum283);
        setElement(term175667, 0, term176248);
        setField(term176530, term176530.getClass(), "method", enum284);
        setField(term176530, term176530.getClass(), "coder", term176822);
        setElement(term175667, 1, term176530);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term175667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term175828;
        args[1] = enum282;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


