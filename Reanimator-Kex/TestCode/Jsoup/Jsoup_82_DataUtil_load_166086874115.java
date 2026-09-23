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

public class DataUtil_load_166086874115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313;
     Object term51333;
     Object term50811;

    public DataUtil_load_166086874115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term314 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term318 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term313, term313.getClass(), "treeBuilder", null);
        setIntField(term314, term314.getClass(), "maxSize", 0);
        setField(term314, term314.getClass(), "elementData", null);
        setIntField(term314, term314.getClass(), "size", 0);
        setIntField(term314, term314.getClass(), "modCount", 0);
        setField(term313, term313.getClass(), "errors", term314);
        setBooleanField(term318, term318.getClass(), "preserveTagCase", false);
        setBooleanField(term318, term318.getClass(), "preserveAttributeCase", false);
        setField(term313, term313.getClass(), "settings", term318);
        term51333 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term51334 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term51335 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term51333, term51333.getClass(), "treeBuilder", null);
        setIntField(term51334, term51334.getClass(), "maxSize", 0);
        setField(term51334, term51334.getClass(), "elementData", null);
        setIntField(term51334, term51334.getClass(), "size", 0);
        setIntField(term51334, term51334.getClass(), "modCount", 0);
        setField(term51333, term51333.getClass(), "errors", term51334);
        setBooleanField(term51335, term51335.getClass(), "preserveTagCase", false);
        setBooleanField(term51335, term51335.getClass(), "preserveAttributeCase", false);
        setField(term51333, term51333.getClass(), "settings", term51335);
        Class<? extends Object> term51377 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term51376 = ((Class) term51377).getDeclaredField((String) "base");
        ((Field) term51376).setAccessible(true);
        Object enum5 = ((Field) term51376).get((Object) null);
        Class<? extends Object> term51576 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term51575 = ((Class) term51576).getDeclaredField((String) "html");
        ((Field) term51575).setAccessible(true);
        Object enum6 = ((Field) term51575).get((Object) null);
        Class<? extends Object> term51825 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term51824 = ((Class) term51825).getDeclaredField((String) "noQuirks");
        ((Field) term51824).setAccessible(true);
        Object enum7 = ((Field) term51824).get((Object) null);
        term50811 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term50812 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term51249 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term51257 = (Object[]) newArray("java.lang.String", 2);
        Object term51260 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term51298 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term51314 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term50812, term50812.getClass(), "escapeMode", enum5);
        setField(term51249, term51249.getClass(), "name", "UTF-8");
        setElement(term51257, 0, "");
        setElement(term51257, 1, "");
        setField(term51249, term51249.getClass(), "aliases", term51257);
        setField(term51249, term51249.getClass(), "aliasSet", null);
        setField(term50812, term50812.getClass(), "charset", term51249);
        setIntField(term51260, term51260.getClass(), "threadLocalHashCode", 718050984);
        setField(term50812, term50812.getClass(), "encoderThreadLocal", term51260);
        setField(term50812, term50812.getClass(), "coreCharset", null);
        setBooleanField(term50812, term50812.getClass(), "prettyPrint", true);
        setBooleanField(term50812, term50812.getClass(), "outline", false);
        setIntField(term50812, term50812.getClass(), "indentAmount", 1);
        setField(term50812, term50812.getClass(), "syntax", enum6);
        setField(term50811, term50811.getClass(), "outputSettings", term50812);
        setField(term50811, term50811.getClass(), "parser", null);
        setField(term50811, term50811.getClass(), "quirksMode", enum7);
        setField(term50811, term50811.getClass(), "location", "SzjVpOQTyS");
        setBooleanField(term50811, term50811.getClass(), "updateMetaCharset", false);
        setField(term51298, term51298.getClass(), "tagName", "#root");
        setBooleanField(term51298, term51298.getClass(), "isBlock", false);
        setBooleanField(term51298, term51298.getClass(), "formatAsBlock", true);
        setBooleanField(term51298, term51298.getClass(), "canContainInline", true);
        setBooleanField(term51298, term51298.getClass(), "empty", false);
        setBooleanField(term51298, term51298.getClass(), "selfClosing", false);
        setBooleanField(term51298, term51298.getClass(), "preserveWhitespace", false);
        setBooleanField(term51298, term51298.getClass(), "formList", false);
        setBooleanField(term51298, term51298.getClass(), "formSubmit", false);
        setField(term50811, term50811.getClass(), "tag", term51298);
        setField(term50811, term50811.getClass(), "shadowChildrenRef", null);
        setIntField(term51314, term51314.getClass(), "modCount", 0);
        setField(term50811, term50811.getClass(), "childNodes", term51314);
        setField(term50811, term50811.getClass(), "attributes", null);
        setField(term50811, term50811.getClass(), "baseUri", "SzjVpOQTyS");
        setField(term50811, term50811.getClass(), "parentNode", null);
        setIntField(term50811, term50811.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.jsoup.parser.Parser");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "EGtDIRbSSb";
        args[2] = "SzjVpOQTyS";
        args[3] = term313;
        Object retValue = callMethod(klass, "load", argTypes, null, args);
        assertTrue(recursiveEquals(term313, term51333));
        assertTrue(recursiveEquals(retValue, term50811));
    }

};


