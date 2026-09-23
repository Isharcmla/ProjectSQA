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

public class Coders_addEncoder_684310764236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1002250;
     Object enum634;

    public Coders_addEncoder_684310764236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1002250 = newInstance(Class.forName("org.tukaani.xz.DeltaOutputStream"));
        Object term1002322 = newInstance(Class.forName("org.tukaani.xz.delta.DeltaEncoder"));
        byte[] term1002033 = (byte[]) newByteArray(32);
        setField(term1002250, term1002250.getClass(), "exception", null);
        setBooleanField(term1002250, term1002250.getClass(), "finished", false);
        setField(term1002322, term1002322.getClass(), "history", term1002033);
        setIntField(term1002322, term1002322.getClass(), "distance", 0);
        setIntField(term1002322, term1002322.getClass(), "pos", 0);
        setField(term1002250, term1002250.getClass(), "delta", term1002322);
        setField(term1002250, term1002250.getClass(), "tmpbuf", null);
        Class<? extends Object> term1004051 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1004050 = ((Class) term1004051).getDeclaredField((String) "AES256SHA256");
        ((Field) term1004050).setAccessible(true);
        enum634 = ((Field) term1004050).get((Object) null);
        Class<? extends Object> term1004379 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1004378 = ((Class) term1004379).getDeclaredField((String) "AES256SHA256");
        ((Field) term1004378).setAccessible(true);
        Object enum635 = ((Field) term1004378).get((Object) null);
        Object[] term1002175 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term1002604 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1002896 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term1002604, term1002604.getClass(), "method", enum635);
        setField(term1002604, term1002604.getClass(), "coder", term1002896);
        setElement(term1002175, 0, term1002604);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1002175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1002250;
        args[1] = enum634;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


