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

public class Coders_addEncoder_684310764141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum372;

    public Coders_addEncoder_684310764141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term309382 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term309381 = ((Class) term309382).getDeclaredField((String) "DEFLATE");
        ((Field) term309381).setAccessible(true);
        enum372 = ((Field) term309381).get((Object) null);
        Class<? extends Object> term309695 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term309694 = ((Class) term309695).getDeclaredField((String) "AES256SHA256");
        ((Field) term309694).setAccessible(true);
        Object enum373 = ((Field) term309694).get((Object) null);
        Class<? extends Object> term310023 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term310022 = ((Class) term310023).getDeclaredField((String) "DEFLATE");
        ((Field) term310022).setAccessible(true);
        Object enum374 = ((Field) term310022).get((Object) null);
        Object[] term307299 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term307590 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term307872 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term308168 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DeflateDecoder"));
        setField(term307590, term307590.getClass(), "method", enum373);
        setElement(term307299, 0, term307590);
        setField(term307872, term307872.getClass(), "method", enum374);
        setField(term307872, term307872.getClass(), "coder", term308168);
        setElement(term307299, 1, term307872);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term307299);
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
        args[1] = enum372;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


