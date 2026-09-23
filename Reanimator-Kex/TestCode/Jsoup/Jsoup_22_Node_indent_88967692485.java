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

public class Node_indent_88967692485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;
     Object term397;
     Object term399;

    public Node_indent_88967692485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term378 = (byte[]) newByteArray(16);
        setField(term377, term377.getClass(), "value", term378);
        setByteField(term377, term377.getClass(), "coder", (byte) 48);
        setIntField(term377, term377.getClass(), "count", -1955890973);
        term397 = new Integer(-2038273078);
        Class<? extends Object> term18549 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term18548 = ((Class) term18549).getDeclaredField((String) "xhtml");
        ((Field) term18548).setAccessible(true);
        Object enum1 = ((Field) term18548).get((Object) null);
        term399 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term814 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term822 = (Object[]) newArray("java.lang.String", 2);
        Object term848 = newInstance(Class.forName("sun.nio.cs.UTF_8$Encoder"));
        byte[] term851 = (byte[]) newByteArray(1);
        Object term853 = newInstance(Class.forName("java.nio.charset.CodingErrorAction"));
        setField(term399, term399.getClass(), "escapeMode", enum1);
        setField(term814, term814.getClass(), "name", "UTF-8");
        setElement(term822, 0, "UTF8");
        setElement(term822, 1, "unicode-1-1-utf-8");
        setField(term814, term814.getClass(), "aliases", term822);
        setField(term814, term814.getClass(), "aliasSet", null);
        setField(term399, term399.getClass(), "charset", term814);
        setField(term848, term848.getClass(), "sgp", null);
        setField(term848, term848.getClass(), "charset", term814);
        setFloatField(term848, term848.getClass(), "averageBytesPerChar", 1.1F);
        setFloatField(term848, term848.getClass(), "maxBytesPerChar", 3.0F);
        setByteElement(term851, 0, (byte) 63);
        setField(term848, term848.getClass(), "replacement", term851);
        setField(term853, term853.getClass(), "name", "REPORT");
        setField(term848, term848.getClass(), "malformedInputAction", term853);
        setField(term848, term848.getClass(), "unmappableCharacterAction", term853);
        setIntField(term848, term848.getClass(), "state", 0);
        setField(term848, term848.getClass(), "cachedDecoder", null);
        setField(term399, term399.getClass(), "charsetEncoder", term848);
        setBooleanField(term399, term399.getClass(), "prettyPrint", true);
        setIntField(term399, term399.getClass(), "indentAmount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term377;
        args[1] = term397;
        args[2] = term399;
        try {
            callMethod(klass, "indent", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


