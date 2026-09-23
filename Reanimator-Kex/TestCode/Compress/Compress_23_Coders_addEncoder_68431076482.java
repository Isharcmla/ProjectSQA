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

public class Coders_addEncoder_68431076482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151282;
     Object enum247;

    public Coders_addEncoder_68431076482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151282 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Class<? extends Object> term152140 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term152139 = ((Class) term152140).getDeclaredField((String) "AES256SHA256");
        ((Field) term152139).setAccessible(true);
        enum247 = ((Field) term152139).get((Object) null);
        Class<? extends Object> term152468 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term152467 = ((Class) term152468).getDeclaredField((String) "LZMA");
        ((Field) term152467).setAccessible(true);
        Object enum248 = ((Field) term152467).get((Object) null);
        Class<? extends Object> term152772 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term152771 = ((Class) term152772).getDeclaredField((String) "AES256SHA256");
        ((Field) term152771).setAccessible(true);
        Object enum249 = ((Field) term152771).get((Object) null);
        Object[] term151121 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term151564 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term151846 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term152138 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term151564, term151564.getClass(), "method", enum248);
        setElement(term151121, 0, term151564);
        setField(term151846, term151846.getClass(), "method", enum249);
        setField(term151846, term151846.getClass(), "coder", term152138);
        setElement(term151121, 1, term151846);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term151121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term151282;
        args[1] = enum247;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


