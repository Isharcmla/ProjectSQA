package org.jsoup.nodes;

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
import java.lang.NoClassDefFoundError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class Entities_canEncode_76052187519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum5;
     Object term743;

    public Entities_canEncode_76052187519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4410 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term4409 = ((Class) term4410).getDeclaredField((String) "utf");
        ((Field) term4409).setAccessible(true);
        enum5 = ((Field) term4409).get((Object) null);
        term743 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Entities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.nodes.Entities$CoreCharset");
        argTypes[1] = char.class;
        argTypes[2] = Class.forName("java.nio.charset.CharsetEncoder");
        Object[] args = new Object[3];
        args[0] = enum5;
        args[1] = term743;
        args[2] = null;
        try {
            callMethod(klass, "canEncode", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


