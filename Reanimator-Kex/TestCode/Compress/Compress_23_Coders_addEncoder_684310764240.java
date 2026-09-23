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

public class Coders_addEncoder_684310764240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1009096;
     Object enum644;

    public Coders_addEncoder_684310764240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1009096 = newInstance(Class.forName("org.tukaani.xz.DeltaOutputStream"));
        setField(term1009096, term1009096.getClass(), "exception", null);
        setBooleanField(term1009096, term1009096.getClass(), "finished", false);
        Class<? extends Object> term1010677 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1010676 = ((Class) term1010677).getDeclaredField((String) "LZMA2");
        ((Field) term1010676).setAccessible(true);
        enum644 = ((Field) term1010676).get((Object) null);
        Class<? extends Object> term1010984 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1010983 = ((Class) term1010984).getDeclaredField((String) "LZMA2");
        ((Field) term1010983).setAccessible(true);
        Object enum645 = ((Field) term1010983).get((Object) null);
        Object[] term1009021 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 64);
        Object term1009378 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1009670 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term1009378, term1009378.getClass(), "method", enum645);
        setField(term1009378, term1009378.getClass(), "coder", term1009670);
        setElement(term1009021, 0, term1009378);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1009021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1009096;
        args[1] = enum644;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


