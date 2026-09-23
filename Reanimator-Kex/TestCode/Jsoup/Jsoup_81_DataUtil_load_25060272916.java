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

public class DataUtil_load_25060272916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4268;

    public DataUtil_load_25060272916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47336 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term47335 = ((Class) term47336).getDeclaredField((String) "xhtml");
        ((Field) term47335).setAccessible(true);
        Object enum3 = ((Field) term47335).get((Object) null);
        Class<? extends Object> term47553 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term47552 = ((Class) term47553).getDeclaredField((String) "html");
        ((Field) term47552).setAccessible(true);
        Object enum4 = ((Field) term47552).get((Object) null);
        Class<? extends Object> term47841 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term47840 = ((Class) term47841).getDeclaredField((String) "noQuirks");
        ((Field) term47840).setAccessible(true);
        Object enum5 = ((Field) term47840).get((Object) null);
        term4268 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term4269 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term4706 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term4714 = (Object[]) newArray("java.lang.String", 2);
        Object term4717 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term4755 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4771 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term4269, term4269.getClass(), "escapeMode", enum3);
        setField(term4706, term4706.getClass(), "name", "UTF-8");
        setElement(term4714, 0, "");
        setElement(term4714, 1, "");
        setField(term4706, term4706.getClass(), "aliases", term4714);
        setField(term4706, term4706.getClass(), "aliasSet", null);
        setField(term4269, term4269.getClass(), "charset", term4706);
        setIntField(term4717, term4717.getClass(), "threadLocalHashCode", -922480543);
        setField(term4269, term4269.getClass(), "encoderThreadLocal", term4717);
        setField(term4269, term4269.getClass(), "coreCharset", null);
        setBooleanField(term4269, term4269.getClass(), "prettyPrint", true);
        setBooleanField(term4269, term4269.getClass(), "outline", false);
        setIntField(term4269, term4269.getClass(), "indentAmount", 1);
        setField(term4269, term4269.getClass(), "syntax", enum4);
        setField(term4268, term4268.getClass(), "outputSettings", term4269);
        setField(term4268, term4268.getClass(), "parser", null);
        setField(term4268, term4268.getClass(), "quirksMode", enum5);
        setField(term4268, term4268.getClass(), "location", "jJCZpVmanW");
        setBooleanField(term4268, term4268.getClass(), "updateMetaCharset", false);
        setField(term4755, term4755.getClass(), "tagName", "#root");
        setBooleanField(term4755, term4755.getClass(), "isBlock", false);
        setBooleanField(term4755, term4755.getClass(), "formatAsBlock", true);
        setBooleanField(term4755, term4755.getClass(), "canContainInline", true);
        setBooleanField(term4755, term4755.getClass(), "empty", false);
        setBooleanField(term4755, term4755.getClass(), "selfClosing", false);
        setBooleanField(term4755, term4755.getClass(), "preserveWhitespace", false);
        setBooleanField(term4755, term4755.getClass(), "formList", false);
        setBooleanField(term4755, term4755.getClass(), "formSubmit", false);
        setField(term4268, term4268.getClass(), "tag", term4755);
        setField(term4268, term4268.getClass(), "shadowChildrenRef", null);
        setIntField(term4771, term4771.getClass(), "modCount", 0);
        setField(term4268, term4268.getClass(), "childNodes", term4771);
        setField(term4268, term4268.getClass(), "attributes", null);
        setField(term4268, term4268.getClass(), "baseUri", "jJCZpVmanW");
        setField(term4268, term4268.getClass(), "parentNode", null);
        setIntField(term4268, term4268.getClass(), "siblingIndex", 0);
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
        assertTrue(recursiveEquals(retValue, term4268));
    }

};


