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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Entities_escape_6281253805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public Entities_escape_6281253805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term764 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term763 = ((Class) term764).getDeclaredField((String) "base");
        ((Field) term763).setAccessible(true);
        Object enum2 = ((Field) term763).get((Object) null);
        term13 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term13, term13.getClass(), "escapeMode", enum2);
        setField(term13, term13.getClass(), "charset", null);
        setField(term13, term13.getClass(), "charsetEncoder", null);
        setField(term13, term13.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Entities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        try {
            callMethod(klass, "escape", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


