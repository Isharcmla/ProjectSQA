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

public class Coders_addEncoder_684310764181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521027;
     Object enum487;

    public Coders_addEncoder_684310764181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521027 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term521179 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term521341 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data"));
        setField(term521027, term521027.getClass(), "out", term521179);
        setIntField(term521027, term521027.getClass(), "currentChar", 66);
        setIntField(term521027, term521027.getClass(), "runLength", 254);
        setIntField(term521027, term521027.getClass(), "last", -2147483648);
        setIntField(term521027, term521027.getClass(), "allowableBlockSize", -2147483647);
        setField(term521027, term521027.getClass(), "data", term521341);
        Class<? extends Object> term524940 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term524939 = ((Class) term524940).getDeclaredField((String) "COPY");
        ((Field) term524939).setAccessible(true);
        enum487 = ((Field) term524939).get((Object) null);
        Class<? extends Object> term525244 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term525243 = ((Class) term525244).getDeclaredField((String) "LZMA2");
        ((Field) term525243).setAccessible(true);
        Object enum488 = ((Field) term525243).get((Object) null);
        Class<? extends Object> term525551 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term525550 = ((Class) term525551).getDeclaredField((String) "COPY");
        ((Field) term525550).setAccessible(true);
        Object enum489 = ((Field) term525550).get((Object) null);
        Object[] term520866 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 8);
        Object term521623 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term521905 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term522197 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term521623, term521623.getClass(), "method", enum488);
        setElement(term520866, 0, term521623);
        setField(term521905, term521905.getClass(), "method", enum489);
        setField(term521905, term521905.getClass(), "coder", term522197);
        setElement(term520866, 1, term521905);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term520866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term521027;
        args[1] = enum487;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


