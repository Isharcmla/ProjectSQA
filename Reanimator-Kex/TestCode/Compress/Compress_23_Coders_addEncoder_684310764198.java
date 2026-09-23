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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Coders_addEncoder_684310764198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770683;
     Object enum530;

    public Coders_addEncoder_684310764198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term770683 = newInstance(Class.forName("org.tukaani.xz.DeltaOutputStream"));
        Object term770755 = newInstance(Class.forName("org.tukaani.xz.delta.DeltaEncoder"));
        byte[] term770510 = (byte[]) newByteArray(0);
        setField(term770683, term770683.getClass(), "exception", null);
        setBooleanField(term770683, term770683.getClass(), "finished", false);
        setField(term770683, term770683.getClass(), "delta", term770755);
        setField(term770683, term770683.getClass(), "tmpbuf", term770510);
        Class<? extends Object> term772339 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term772338 = ((Class) term772339).getDeclaredField((String) "LZMA");
        ((Field) term772338).setAccessible(true);
        enum530 = ((Field) term772338).get((Object) null);
        Class<? extends Object> term772643 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term772642 = ((Class) term772643).getDeclaredField((String) "LZMA");
        ((Field) term772642).setAccessible(true);
        Object enum531 = ((Field) term772642).get((Object) null);
        Object[] term770608 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 32);
        Object term771037 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term771329 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term771037, term771037.getClass(), "method", enum531);
        setField(term771037, term771037.getClass(), "coder", term771329);
        setElement(term770608, 0, term771037);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term770608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term770683;
        args[1] = enum530;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


