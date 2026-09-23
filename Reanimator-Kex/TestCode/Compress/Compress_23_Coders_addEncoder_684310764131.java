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

public class Coders_addEncoder_684310764131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291342;
     Object enum344;

    public Coders_addEncoder_684310764131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291342 = newInstance(Class.forName("java.util.zip.InflaterOutputStream"));
        Class<? extends Object> term293448 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term293447 = ((Class) term293448).getDeclaredField((String) "AES256SHA256");
        ((Field) term293447).setAccessible(true);
        enum344 = ((Field) term293447).get((Object) null);
        Class<? extends Object> term293776 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term293775 = ((Class) term293776).getDeclaredField((String) "LZMA2");
        ((Field) term293775).setAccessible(true);
        Object enum345 = ((Field) term293775).get((Object) null);
        Class<? extends Object> term294083 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term294082 = ((Class) term294083).getDeclaredField((String) "AES256SHA256");
        ((Field) term294082).setAccessible(true);
        Object enum346 = ((Field) term294082).get((Object) null);
        Object[] term291259 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term291624 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term291906 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term292198 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term291624, term291624.getClass(), "method", enum345);
        setElement(term291259, 0, term291624);
        setField(term291906, term291906.getClass(), "method", enum346);
        setField(term291906, term291906.getClass(), "coder", term292198);
        setElement(term291259, 1, term291906);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term291259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term291342;
        args[1] = enum344;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


