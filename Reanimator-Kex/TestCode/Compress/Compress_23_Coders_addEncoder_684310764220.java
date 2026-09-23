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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Coders_addEncoder_684310764220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term975729;
     Object enum588;

    public Coders_addEncoder_684310764220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term975729 = newInstance(Class.forName("org.tukaani.xz.DeltaOutputStream"));
        Object term975801 = newInstance(Class.forName("org.tukaani.xz.delta.DeltaEncoder"));
        byte[] term975544 = (byte[]) newByteArray(0);
        setField(term975729, term975729.getClass(), "exception", null);
        setBooleanField(term975729, term975729.getClass(), "finished", false);
        setField(term975801, term975801.getClass(), "history", term975544);
        setIntField(term975801, term975801.getClass(), "distance", 0);
        setIntField(term975801, term975801.getClass(), "pos", 0);
        setField(term975729, term975729.getClass(), "delta", term975801);
        setField(term975729, term975729.getClass(), "tmpbuf", null);
        Class<? extends Object> term977440 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term977439 = ((Class) term977440).getDeclaredField((String) "LZMA2");
        ((Field) term977439).setAccessible(true);
        enum588 = ((Field) term977439).get((Object) null);
        Class<? extends Object> term977747 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term977746 = ((Class) term977747).getDeclaredField((String) "LZMA2");
        ((Field) term977746).setAccessible(true);
        Object enum589 = ((Field) term977746).get((Object) null);
        Object[] term975654 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term976083 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term976375 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term976083, term976083.getClass(), "method", enum589);
        setField(term976083, term976083.getClass(), "coder", term976375);
        setElement(term975654, 0, term976083);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term975654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term975729;
        args[1] = enum588;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


