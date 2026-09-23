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
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class Node_indent_88967692467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199;
     Object term219;
     Object term221;

    public Node_indent_88967692467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term200 = (byte[]) newByteArray(16);
        setField(term199, term199.getClass(), "value", term200);
        setByteField(term199, term199.getClass(), "coder", (byte) 48);
        setIntField(term199, term199.getClass(), "count", -1922583790);
        term219 = new Integer(-616727354);
        Class<? extends Object> term16014 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term16013 = ((Class) term16014).getDeclaredField((String) "base");
        ((Field) term16013).setAccessible(true);
        Object enum1 = ((Field) term16013).get((Object) null);
        term221 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term221, term221.getClass(), "escapeMode", enum1);
        setField(term221, term221.getClass(), "charset", null);
        setField(term221, term221.getClass(), "charsetEncoder", null);
        setBooleanField(term221, term221.getClass(), "prettyPrint", false);
        setIntField(term221, term221.getClass(), "indentAmount", -1955890973);
        setField(term221, term221.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term199;
        args[1] = term219;
        args[2] = term221;
        try {
            callMethod(klass, "indent", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


