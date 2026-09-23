package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class DataUtil_load_25060272914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4090;

    public DataUtil_load_25060272914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47158 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term47157 = ((Class) term47158).getDeclaredField((String) "xhtml");
        ((Field) term47157).setAccessible(true);
        Object enum2 = ((Field) term47157).get((Object) null);
        Class<? extends Object> term47375 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term47374 = ((Class) term47375).getDeclaredField((String) "html");
        ((Field) term47374).setAccessible(true);
        Object enum3 = ((Field) term47374).get((Object) null);
        Class<? extends Object> term47663 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term47662 = ((Class) term47663).getDeclaredField((String) "noQuirks");
        ((Field) term47662).setAccessible(true);
        Object enum4 = ((Field) term47662).get((Object) null);
        term4090 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term4091 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term4528 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term4536 = (Object[]) newArray("java.lang.String", 2);
        Object term4539 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term4577 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4593 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term4091, term4091.getClass(), "escapeMode", enum2);
        setField(term4528, term4528.getClass(), "name", "UTF-8");
        setElement(term4536, 0, "");
        setElement(term4536, 1, "");
        setField(term4528, term4528.getClass(), "aliases", term4536);
        setField(term4528, term4528.getClass(), "aliasSet", null);
        setField(term4091, term4091.getClass(), "charset", term4528);
        setIntField(term4539, term4539.getClass(), "threadLocalHashCode", -922480543);
        setField(term4091, term4091.getClass(), "encoderThreadLocal", term4539);
        setField(term4091, term4091.getClass(), "coreCharset", null);
        setBooleanField(term4091, term4091.getClass(), "prettyPrint", true);
        setBooleanField(term4091, term4091.getClass(), "outline", false);
        setIntField(term4091, term4091.getClass(), "indentAmount", 1);
        setField(term4091, term4091.getClass(), "syntax", enum3);
        setField(term4090, term4090.getClass(), "outputSettings", term4091);
        setField(term4090, term4090.getClass(), "parser", null);
        setField(term4090, term4090.getClass(), "quirksMode", enum4);
        setField(term4090, term4090.getClass(), "location", "jJCZpVmanW");
        setBooleanField(term4090, term4090.getClass(), "updateMetaCharset", false);
        setField(term4577, term4577.getClass(), "tagName", "#root");
        setBooleanField(term4577, term4577.getClass(), "isBlock", false);
        setBooleanField(term4577, term4577.getClass(), "formatAsBlock", true);
        setBooleanField(term4577, term4577.getClass(), "canContainInline", true);
        setBooleanField(term4577, term4577.getClass(), "empty", false);
        setBooleanField(term4577, term4577.getClass(), "selfClosing", false);
        setBooleanField(term4577, term4577.getClass(), "preserveWhitespace", false);
        setBooleanField(term4577, term4577.getClass(), "formList", false);
        setBooleanField(term4577, term4577.getClass(), "formSubmit", false);
        setField(term4090, term4090.getClass(), "tag", term4577);
        setField(term4090, term4090.getClass(), "shadowChildrenRef", null);
        setIntField(term4593, term4593.getClass(), "modCount", 0);
        setField(term4090, term4090.getClass(), "childNodes", term4593);
        setField(term4090, term4090.getClass(), "attributes", null);
        setField(term4090, term4090.getClass(), "baseUri", "jJCZpVmanW");
        setField(term4090, term4090.getClass(), "parentNode", null);
        setIntField(term4090, term4090.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "xxtlPwDYFs";
        args[2] = "jJCZpVmanW";
        Object retValue = callMethod(klass, "load", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term4090));
    }

};


