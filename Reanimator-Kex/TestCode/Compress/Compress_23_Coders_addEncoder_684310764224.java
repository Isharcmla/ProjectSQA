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

public class Coders_addEncoder_684310764224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term982563;
     Object enum598;

    public Coders_addEncoder_684310764224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term982563 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        Class<? extends Object> term984156 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term984155 = ((Class) term984156).getDeclaredField((String) "DEFLATE");
        ((Field) term984155).setAccessible(true);
        enum598 = ((Field) term984155).get((Object) null);
        Class<? extends Object> term984469 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term984468 = ((Class) term984469).getDeclaredField((String) "DEFLATE");
        ((Field) term984468).setAccessible(true);
        Object enum599 = ((Field) term984468).get((Object) null);
        Object[] term982492 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term982845 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term983137 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term982845, term982845.getClass(), "method", enum599);
        setField(term982845, term982845.getClass(), "coder", term983137);
        setElement(term982492, 0, term982845);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term982492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term982563;
        args[1] = enum598;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


