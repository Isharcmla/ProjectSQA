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
import org.tukaani.xz.XZIOException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term788403;
     Object enum560;

    public Coders_addEncoder_684310764208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term788403 = newInstance(Class.forName("org.tukaani.xz.DeltaOutputStream"));
        setField(term788403, term788403.getClass(), "exception", null);
        setBooleanField(term788403, term788403.getClass(), "finished", true);
        Class<? extends Object> term790141 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term790140 = ((Class) term790141).getDeclaredField((String) "LZMA2");
        ((Field) term790140).setAccessible(true);
        enum560 = ((Field) term790140).get((Object) null);
        Class<? extends Object> term790448 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term790447 = ((Class) term790448).getDeclaredField((String) "LZMA2");
        ((Field) term790447).setAccessible(true);
        Object enum561 = ((Field) term790447).get((Object) null);
        Object[] term788328 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term788685 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term788977 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term788685, term788685.getClass(), "method", enum561);
        setField(term788685, term788685.getClass(), "coder", term788977);
        setElement(term788328, 0, term788685);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term788328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term788403;
        args[1] = enum560;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (XZIOException e) {
        }

    }

};


