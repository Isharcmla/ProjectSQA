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

public class Coders_addEncoder_684310764121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum315;

    public Coders_addEncoder_684310764121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term276891 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term276890 = ((Class) term276891).getDeclaredField((String) "BZIP2");
        ((Field) term276890).setAccessible(true);
        enum315 = ((Field) term276890).get((Object) null);
        Class<? extends Object> term277198 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term277197 = ((Class) term277198).getDeclaredField((String) "BZIP2");
        ((Field) term277197).setAccessible(true);
        Object enum316 = ((Field) term277197).get((Object) null);
        Object[] term275438 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term275725 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term276021 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DeflateDecoder"));
        setField(term275725, term275725.getClass(), "method", enum316);
        setField(term275725, term275725.getClass(), "coder", term276021);
        setElement(term275438, 0, term275725);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term275438);
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
        args[1] = enum315;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


