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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum305;

    public Coders_addEncoder_684310764117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term270987 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term270986 = ((Class) term270987).getDeclaredField((String) "BZIP2");
        ((Field) term270986).setAccessible(true);
        enum305 = ((Field) term270986).get((Object) null);
        Class<? extends Object> term271294 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term271293 = ((Class) term271294).getDeclaredField((String) "BZIP2");
        ((Field) term271293).setAccessible(true);
        Object enum306 = ((Field) term271293).get((Object) null);
        Object[] term269510 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term269797 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term270087 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$LZMADecoder"));
        setField(term269797, term269797.getClass(), "method", enum306);
        setField(term269797, term269797.getClass(), "coder", term270087);
        setElement(term269510, 0, term269797);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term269510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum305;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


