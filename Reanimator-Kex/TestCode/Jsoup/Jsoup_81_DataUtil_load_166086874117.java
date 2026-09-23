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

public class DataUtil_load_166086874117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313;
     Object term51511;
     Object term50989;

    public DataUtil_load_166086874117() {
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
        term51511 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term51512 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term51513 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term51511, term51511.getClass(), "treeBuilder", null);
        setIntField(term51512, term51512.getClass(), "maxSize", 0);
        setField(term51512, term51512.getClass(), "elementData", null);
        setIntField(term51512, term51512.getClass(), "size", 0);
        setIntField(term51512, term51512.getClass(), "modCount", 0);
        setField(term51511, term51511.getClass(), "errors", term51512);
        setBooleanField(term51513, term51513.getClass(), "preserveTagCase", false);
        setBooleanField(term51513, term51513.getClass(), "preserveAttributeCase", false);
        setField(term51511, term51511.getClass(), "settings", term51513);
        Class<? extends Object> term51555 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term51554 = ((Class) term51555).getDeclaredField((String) "base");
        ((Field) term51554).setAccessible(true);
        Object enum6 = ((Field) term51554).get((Object) null);
        Class<? extends Object> term51754 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term51753 = ((Class) term51754).getDeclaredField((String) "html");
        ((Field) term51753).setAccessible(true);
        Object enum7 = ((Field) term51753).get((Object) null);
        Class<? extends Object> term52003 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term52002 = ((Class) term52003).getDeclaredField((String) "noQuirks");
        ((Field) term52002).setAccessible(true);
        Object enum8 = ((Field) term52002).get((Object) null);
        term50989 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term50990 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term51427 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term51435 = (Object[]) newArray("java.lang.String", 2);
        Object term51438 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term51476 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term51492 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term50990, term50990.getClass(), "escapeMode", enum6);
        setField(term51427, term51427.getClass(), "name", "UTF-8");
        setElement(term51435, 0, "");
        setElement(term51435, 1, "");
        setField(term51427, term51427.getClass(), "aliases", term51435);
        setField(term51427, term51427.getClass(), "aliasSet", null);
        setField(term50990, term50990.getClass(), "charset", term51427);
        setIntField(term51438, term51438.getClass(), "threadLocalHashCode", 718050984);
        setField(term50990, term50990.getClass(), "encoderThreadLocal", term51438);
        setField(term50990, term50990.getClass(), "coreCharset", null);
        setBooleanField(term50990, term50990.getClass(), "prettyPrint", true);
        setBooleanField(term50990, term50990.getClass(), "outline", false);
        setIntField(term50990, term50990.getClass(), "indentAmount", 1);
        setField(term50990, term50990.getClass(), "syntax", enum7);
        setField(term50989, term50989.getClass(), "outputSettings", term50990);
        setField(term50989, term50989.getClass(), "parser", null);
        setField(term50989, term50989.getClass(), "quirksMode", enum8);
        setField(term50989, term50989.getClass(), "location", "SzjVpOQTyS");
        setBooleanField(term50989, term50989.getClass(), "updateMetaCharset", false);
        setField(term51476, term51476.getClass(), "tagName", "#root");
        setBooleanField(term51476, term51476.getClass(), "isBlock", false);
        setBooleanField(term51476, term51476.getClass(), "formatAsBlock", true);
        setBooleanField(term51476, term51476.getClass(), "canContainInline", true);
        setBooleanField(term51476, term51476.getClass(), "empty", false);
        setBooleanField(term51476, term51476.getClass(), "selfClosing", false);
        setBooleanField(term51476, term51476.getClass(), "preserveWhitespace", false);
        setBooleanField(term51476, term51476.getClass(), "formList", false);
        setBooleanField(term51476, term51476.getClass(), "formSubmit", false);
        setField(term50989, term50989.getClass(), "tag", term51476);
        setField(term50989, term50989.getClass(), "shadowChildrenRef", null);
        setIntField(term51492, term51492.getClass(), "modCount", 0);
        setField(term50989, term50989.getClass(), "childNodes", term51492);
        setField(term50989, term50989.getClass(), "attributes", null);
        setField(term50989, term50989.getClass(), "baseUri", "SzjVpOQTyS");
        setField(term50989, term50989.getClass(), "parentNode", null);
        setIntField(term50989, term50989.getClass(), "siblingIndex", 0);
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
        assertTrue(recursiveEquals(term313, term51511));
        assertTrue(recursiveEquals(retValue, term50989));
    }

};


