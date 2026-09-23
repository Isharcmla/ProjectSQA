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

public class Coders_addEncoder_684310764127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum332;

    public Coders_addEncoder_684310764127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term286037 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term286036 = ((Class) term286037).getDeclaredField((String) "DEFLATE");
        ((Field) term286036).setAccessible(true);
        enum332 = ((Field) term286036).get((Object) null);
        Class<? extends Object> term286350 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term286349 = ((Class) term286350).getDeclaredField((String) "AES256SHA256");
        ((Field) term286349).setAccessible(true);
        Object enum333 = ((Field) term286349).get((Object) null);
        Class<? extends Object> term286678 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term286677 = ((Class) term286678).getDeclaredField((String) "DEFLATE");
        ((Field) term286677).setAccessible(true);
        Object enum334 = ((Field) term286677).get((Object) null);
        Object[] term283930 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term284221 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term284503 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term284793 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$LZMADecoder"));
        setField(term284221, term284221.getClass(), "method", enum333);
        setElement(term283930, 0, term284221);
        setField(term284503, term284503.getClass(), "method", enum334);
        setField(term284503, term284503.getClass(), "coder", term284793);
        setElement(term283930, 1, term284503);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term283930);
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
        args[1] = enum332;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


