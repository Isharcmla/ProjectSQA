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

public class Coders_addEncoder_684310764142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum375;

    public Coders_addEncoder_684310764142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term311025 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term311024 = ((Class) term311025).getDeclaredField((String) "BZIP2");
        ((Field) term311024).setAccessible(true);
        enum375 = ((Field) term311024).get((Object) null);
        Class<? extends Object> term311332 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term311331 = ((Class) term311332).getDeclaredField((String) "BZIP2");
        ((Field) term311331).setAccessible(true);
        Object enum376 = ((Field) term311331).get((Object) null);
        Object[] term310458 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term310745 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term311023 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.LZMA2Decoder"));
        setField(term310745, term310745.getClass(), "method", enum376);
        setField(term310745, term310745.getClass(), "coder", term311023);
        setElement(term310458, 0, term310745);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term310458);
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
        args[1] = enum375;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


