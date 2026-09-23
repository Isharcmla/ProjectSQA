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
import static org.apache.commons.compress.archivers.sevenz.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum417;
     Object enum419;

    public Coders_addEncoder_684310764158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term484830 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term484829 = ((Class) term484830).getDeclaredField((String) "BZIP2");
        ((Field) term484829).setAccessible(true);
        enum417 = ((Field) term484829).get((Object) null);
        Class<? extends Object> term485137 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term485136 = ((Class) term485137).getDeclaredField((String) "BZIP2");
        ((Field) term485136).setAccessible(true);
        Object enum418 = ((Field) term485136).get((Object) null);
        Object[] term483617 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term483904 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term484194 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CopyDecoder"));
        setField(term483904, term483904.getClass(), "method", enum418);
        setField(term483904, term483904.getClass(), "coder", term484194);
        setElement(term483617, 0, term483904);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term483617);
        Class<? extends Object> term485444 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term485443 = ((Class) term485444).getDeclaredField((String) "BZIP2");
        ((Field) term485443).setAccessible(true);
        enum419 = ((Field) term485443).get((Object) null);
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
        args[1] = enum417;
        args[2] = null;
        Object retValue = callMethod(klass, "addEncoder", argTypes, null, args);
        assertTrue(recursiveEquals(enum417, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


