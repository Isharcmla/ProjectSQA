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
     Object term4256;

    public DataUtil_load_25060272916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47324 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term47323 = ((Class) term47324).getDeclaredField((String) "xhtml");
        ((Field) term47323).setAccessible(true);
        Object enum3 = ((Field) term47323).get((Object) null);
        Class<? extends Object> term47541 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term47540 = ((Class) term47541).getDeclaredField((String) "html");
        ((Field) term47540).setAccessible(true);
        Object enum4 = ((Field) term47540).get((Object) null);
        Class<? extends Object> term47829 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term47828 = ((Class) term47829).getDeclaredField((String) "noQuirks");
        ((Field) term47828).setAccessible(true);
        Object enum5 = ((Field) term47828).get((Object) null);
        term4256 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term4257 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term4694 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term4702 = (Object[]) newArray("java.lang.String", 2);
        Object term4705 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term4743 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4759 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term4257, term4257.getClass(), "escapeMode", enum3);
        setField(term4694, term4694.getClass(), "name", "UTF-8");
        setElement(term4702, 0, "");
        setElement(term4702, 1, "");
        setField(term4694, term4694.getClass(), "aliases", term4702);
        setField(term4694, term4694.getClass(), "aliasSet", null);
        setField(term4257, term4257.getClass(), "charset", term4694);
        setIntField(term4705, term4705.getClass(), "threadLocalHashCode", -922480543);
        setField(term4257, term4257.getClass(), "encoderThreadLocal", term4705);
        setField(term4257, term4257.getClass(), "coreCharset", null);
        setBooleanField(term4257, term4257.getClass(), "prettyPrint", true);
        setBooleanField(term4257, term4257.getClass(), "outline", false);
        setIntField(term4257, term4257.getClass(), "indentAmount", 1);
        setField(term4257, term4257.getClass(), "syntax", enum4);
        setField(term4256, term4256.getClass(), "outputSettings", term4257);
        setField(term4256, term4256.getClass(), "quirksMode", enum5);
        setField(term4256, term4256.getClass(), "location", "jJCZpVmanW");
        setBooleanField(term4256, term4256.getClass(), "updateMetaCharset", false);
        setField(term4743, term4743.getClass(), "tagName", "#root");
        setBooleanField(term4743, term4743.getClass(), "isBlock", false);
        setBooleanField(term4743, term4743.getClass(), "formatAsBlock", true);
        setBooleanField(term4743, term4743.getClass(), "canContainInline", true);
        setBooleanField(term4743, term4743.getClass(), "empty", false);
        setBooleanField(term4743, term4743.getClass(), "selfClosing", false);
        setBooleanField(term4743, term4743.getClass(), "preserveWhitespace", false);
        setBooleanField(term4743, term4743.getClass(), "formList", false);
        setBooleanField(term4743, term4743.getClass(), "formSubmit", false);
        setField(term4256, term4256.getClass(), "tag", term4743);
        setField(term4256, term4256.getClass(), "shadowChildrenRef", null);
        setIntField(term4759, term4759.getClass(), "modCount", 0);
        setField(term4256, term4256.getClass(), "childNodes", term4759);
        setField(term4256, term4256.getClass(), "attributes", null);
        setField(term4256, term4256.getClass(), "baseUri", "jJCZpVmanW");
        setField(term4256, term4256.getClass(), "parentNode", null);
        setIntField(term4256, term4256.getClass(), "siblingIndex", 0);
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
        assertTrue(recursiveEquals(retValue, term4256));
    }

};


