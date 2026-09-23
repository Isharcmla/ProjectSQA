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
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class Comment_outerHtmlHead_174637796313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term76;
     Object term78;

    public Comment_outerHtmlHead_174637796313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term74 = newInstance(Class.forName("java.lang.Object"));
        setField(term73, term73.getClass(), "value", term74);
        setField(term73, term73.getClass(), "parentNode", null);
        setIntField(term73, term73.getClass(), "siblingIndex", 1484323161);
        term76 = new Integer(391863371);
        Class<? extends Object> term50502 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term50501 = ((Class) term50502).getDeclaredField((String) "base");
        ((Field) term50501).setAccessible(true);
        Object enum6 = ((Field) term50501).get((Object) null);
        Class<? extends Object> term50722 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term50721 = ((Class) term50722).getDeclaredField((String) "utf");
        ((Field) term50721).setAccessible(true);
        Object enum7 = ((Field) term50721).get((Object) null);
        Class<? extends Object> term50918 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term50917 = ((Class) term50918).getDeclaredField((String) "html");
        ((Field) term50917).setAccessible(true);
        Object enum8 = ((Field) term50917).get((Object) null);
        term78 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term1751 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term1759 = (Object[]) newArray("java.lang.String", 2);
        Object term1785 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term78, term78.getClass(), "escapeMode", enum6);
        setField(term1751, term1751.getClass(), "name", "UTF-8");
        setElement(term1759, 0, "UTF8");
        setElement(term1759, 1, "unicode-1-1-utf-8");
        setField(term1751, term1751.getClass(), "aliases", term1759);
        setField(term1751, term1751.getClass(), "aliasSet", null);
        setField(term78, term78.getClass(), "charset", term1751);
        setIntField(term1785, term1785.getClass(), "threadLocalHashCode", 365694796);
        setField(term78, term78.getClass(), "encoderThreadLocal", term1785);
        setField(term78, term78.getClass(), "coreCharset", enum7);
        setBooleanField(term78, term78.getClass(), "prettyPrint", true);
        setBooleanField(term78, term78.getClass(), "outline", false);
        setIntField(term78, term78.getClass(), "indentAmount", 1);
        setField(term78, term78.getClass(), "syntax", enum8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term76;
        args[2] = term78;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term73, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


