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
import java.lang.Object;
import java.lang.String;

public class Coders_addEncoder_684310764147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326624;
     Object enum387;

    public Coders_addEncoder_684310764147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326624 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term326696 = newInstance(Class.forName("org.tukaani.xz.SimpleOutputStream"));
        setField(term326624, term326624.getClass(), "out", term326696);
        setIntField(term326624, term326624.getClass(), "currentChar", 0);
        setIntField(term326624, term326624.getClass(), "last", -2147483648);
        setIntField(term326624, term326624.getClass(), "allowableBlockSize", -2147483647);
        Class<? extends Object> term328876 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term328875 = ((Class) term328876).getDeclaredField((String) "BZIP2");
        ((Field) term328875).setAccessible(true);
        enum387 = ((Field) term328875).get((Object) null);
        Class<? extends Object> term329183 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term329182 = ((Class) term329183).getDeclaredField((String) "LZMA");
        ((Field) term329182).setAccessible(true);
        Object enum388 = ((Field) term329182).get((Object) null);
        Class<? extends Object> term329487 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term329486 = ((Class) term329487).getDeclaredField((String) "BZIP2");
        ((Field) term329486).setAccessible(true);
        Object enum389 = ((Field) term329486).get((Object) null);
        Object[] term326463 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term326978 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term327260 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term327552 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term326978, term326978.getClass(), "method", enum388);
        setElement(term326463, 0, term326978);
        setField(term327260, term327260.getClass(), "method", enum389);
        setField(term327260, term327260.getClass(), "coder", term327552);
        setElement(term326463, 1, term327260);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term326463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term326624;
        args[1] = enum387;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


