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

public class Node_indent_88967692493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363;
     Object term383;
     Object term385;

    public Node_indent_88967692493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term364 = (byte[]) newByteArray(16);
        setField(term363, term363.getClass(), "value", term364);
        setByteField(term363, term363.getClass(), "coder", (byte) 48);
        setIntField(term363, term363.getClass(), "count", -2038273078);
        term383 = new Integer(1227103734);
        Class<? extends Object> term12157 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term12156 = ((Class) term12157).getDeclaredField((String) "html");
        ((Field) term12156).setAccessible(true);
        Object enum1 = ((Field) term12156).get((Object) null);
        term385 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term385, term385.getClass(), "escapeMode", null);
        setField(term385, term385.getClass(), "charset", null);
        setField(term385, term385.getClass(), "charsetEncoder", null);
        setBooleanField(term385, term385.getClass(), "prettyPrint", true);
        setBooleanField(term385, term385.getClass(), "outline", false);
        setIntField(term385, term385.getClass(), "indentAmount", -1339778481);
        setField(term385, term385.getClass(), "syntax", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term363;
        args[1] = term383;
        args[2] = term385;
        try {
            callMethod(klass, "indent", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


