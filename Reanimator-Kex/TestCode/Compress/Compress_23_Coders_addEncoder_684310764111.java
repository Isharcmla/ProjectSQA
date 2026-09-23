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

public class Coders_addEncoder_684310764111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178091;
     Object enum288;

    public Coders_addEncoder_684310764111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178091 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term178145 = newInstance(Class.forName("java.io.DataOutputStream"));
        setField(term178091, term178091.getClass(), "out", term178145);
        setIntField(term178091, term178091.getClass(), "currentChar", 66);
        Class<? extends Object> term261868 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term261867 = ((Class) term261868).getDeclaredField((String) "COPY");
        ((Field) term261867).setAccessible(true);
        enum288 = ((Field) term261867).get((Object) null);
        Class<? extends Object> term262172 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term262171 = ((Class) term262172).getDeclaredField((String) "DEFLATE");
        ((Field) term262171).setAccessible(true);
        Object enum289 = ((Field) term262171).get((Object) null);
        Class<? extends Object> term262485 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term262484 = ((Class) term262485).getDeclaredField((String) "COPY");
        ((Field) term262484).setAccessible(true);
        Object enum290 = ((Field) term262484).get((Object) null);
        Object[] term177930 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term178427 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term178709 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term179001 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term178427, term178427.getClass(), "method", enum289);
        setElement(term177930, 0, term178427);
        setField(term178709, term178709.getClass(), "method", enum290);
        setField(term178709, term178709.getClass(), "coder", term179001);
        setElement(term177930, 1, term178709);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term177930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term178091;
        args[1] = enum288;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


