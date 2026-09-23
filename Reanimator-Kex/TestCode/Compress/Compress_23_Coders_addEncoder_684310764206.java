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
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum555;

    public Coders_addEncoder_684310764206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term787168 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term787167 = ((Class) term787168).getDeclaredField((String) "DEFLATE");
        ((Field) term787167).setAccessible(true);
        enum555 = ((Field) term787167).get((Object) null);
        Class<? extends Object> term787481 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term787480 = ((Class) term787481).getDeclaredField((String) "AES256SHA256");
        ((Field) term787480).setAccessible(true);
        Object enum556 = ((Field) term787480).get((Object) null);
        Class<? extends Object> term787809 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term787808 = ((Class) term787809).getDeclaredField((String) "DEFLATE");
        ((Field) term787808).setAccessible(true);
        Object enum557 = ((Field) term787808).get((Object) null);
        Object[] term784958 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term785250 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term785532 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term785656 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term785952 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DeflateDecoder"));
        setField(term785250, term785250.getClass(), "method", enum556);
        setElement(term784958, 0, term785250);
        setField(term785532, term785532.getClass(), "method", enum556);
        setElement(term784958, 1, term785532);
        setField(term785656, term785656.getClass(), "method", enum557);
        setField(term785656, term785656.getClass(), "coder", term785952);
        setElement(term784958, 2, term785656);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term784958);
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
        args[1] = enum555;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


