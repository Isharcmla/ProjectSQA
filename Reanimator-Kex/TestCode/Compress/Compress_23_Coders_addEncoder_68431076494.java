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
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_68431076494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum261;

    public Coders_addEncoder_68431076494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term163387 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term163386 = ((Class) term163387).getDeclaredField((String) "BZIP2");
        ((Field) term163386).setAccessible(true);
        enum261 = ((Field) term163386).get((Object) null);
        Class<? extends Object> term163694 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term163693 = ((Class) term163694).getDeclaredField((String) "COPY");
        ((Field) term163693).setAccessible(true);
        Object enum262 = ((Field) term163693).get((Object) null);
        Class<? extends Object> term163998 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term163997 = ((Class) term163998).getDeclaredField((String) "DEFLATE");
        ((Field) term163997).setAccessible(true);
        Object enum263 = ((Field) term163997).get((Object) null);
        Object[] term162655 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term162945 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term163227 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term162945, term162945.getClass(), "method", enum262);
        setElement(term162655, 0, term162945);
        setField(term163227, term163227.getClass(), "method", enum263);
        setElement(term162655, 1, term163227);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term162655);
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
        args[1] = enum261;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


