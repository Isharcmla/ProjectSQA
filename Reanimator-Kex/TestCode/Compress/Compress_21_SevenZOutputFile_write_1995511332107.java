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

public class SevenZOutputFile_write_1995511332107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140461;

    public SevenZOutputFile_write_1995511332107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term143258 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term143257 = ((Class) term143258).getDeclaredField((String) "BZIP2");
        ((Field) term143257).setAccessible(true);
        Object enum78 = ((Field) term143257).get((Object) null);
        term140461 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term140461, term140461.getClass(), "currentOutputStream", null);
        setField(term140461, term140461.getClass(), "contentCompression", enum78);
        Class<? extends Object> term143565 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term143564 = ((Class) term143565).getDeclaredField((String) "LZMA2");
        ((Field) term143564).setAccessible(true);
        Object enum79 = ((Field) term143564).get((Object) null);
        Class<? extends Object> term143872 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term143871 = ((Class) term143872).getDeclaredField((String) "AES256SHA256");
        ((Field) term143871).setAccessible(true);
        Object enum80 = ((Field) term143871).get((Object) null);
        Class<? extends Object> term144200 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term144199 = ((Class) term144200).getDeclaredField((String) "DEFLATE");
        ((Field) term144199).setAccessible(true);
        Object enum81 = ((Field) term144199).get((Object) null);
        Object[] term140319 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 512);
        Object term140743 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term141025 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term141307 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term141431 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term141555 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term140743, term140743.getClass(), "method", enum79);
        setElement(term140319, 0, term140743);
        setField(term141025, term141025.getClass(), "method", enum80);
        setElement(term140319, 1, term141025);
        setField(term141307, term141307.getClass(), "method", enum79);
        setElement(term140319, 2, term141307);
        setField(term141431, term141431.getClass(), "method", enum80);
        setElement(term140319, 3, term141431);
        setField(term141555, term141555.getClass(), "method", enum81);
        setElement(term140319, 4, term141555);
        setElement(term140319, 5, term141307);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term140319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 1;
        try {
            callMethod(klass, "write", argTypes, term140461, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


