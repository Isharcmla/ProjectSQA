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
     Object term51500;
     Object term50978;

    public DataUtil_load_166086874117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term315 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term319 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term313, term313.getClass(), "treeBuilder", null);
        setIntField(term313, term313.getClass(), "maxErrors", 1484323161);
        setIntField(term315, term315.getClass(), "maxSize", 0);
        setField(term315, term315.getClass(), "elementData", null);
        setIntField(term315, term315.getClass(), "size", 0);
        setIntField(term315, term315.getClass(), "modCount", 0);
        setField(term313, term313.getClass(), "errors", term315);
        setBooleanField(term319, term319.getClass(), "preserveTagCase", false);
        setBooleanField(term319, term319.getClass(), "preserveAttributeCase", false);
        setField(term313, term313.getClass(), "settings", term319);
        term51500 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term51501 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term51502 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term51500, term51500.getClass(), "treeBuilder", null);
        setIntField(term51500, term51500.getClass(), "maxErrors", 1484323161);
        setIntField(term51501, term51501.getClass(), "maxSize", 0);
        setField(term51501, term51501.getClass(), "elementData", null);
        setIntField(term51501, term51501.getClass(), "size", 0);
        setIntField(term51501, term51501.getClass(), "modCount", 0);
        setField(term51500, term51500.getClass(), "errors", term51501);
        setBooleanField(term51502, term51502.getClass(), "preserveTagCase", false);
        setBooleanField(term51502, term51502.getClass(), "preserveAttributeCase", false);
        setField(term51500, term51500.getClass(), "settings", term51502);
        Class<? extends Object> term51544 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term51543 = ((Class) term51544).getDeclaredField((String) "base");
        ((Field) term51543).setAccessible(true);
        Object enum6 = ((Field) term51543).get((Object) null);
        Class<? extends Object> term51743 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term51742 = ((Class) term51743).getDeclaredField((String) "html");
        ((Field) term51742).setAccessible(true);
        Object enum7 = ((Field) term51742).get((Object) null);
        Class<? extends Object> term51992 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term51991 = ((Class) term51992).getDeclaredField((String) "noQuirks");
        ((Field) term51991).setAccessible(true);
        Object enum8 = ((Field) term51991).get((Object) null);
        term50978 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term50979 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term51416 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term51424 = (Object[]) newArray("java.lang.String", 2);
        Object term51427 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term51465 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term51481 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term50979, term50979.getClass(), "escapeMode", enum6);
        setField(term51416, term51416.getClass(), "name", "UTF-8");
        setElement(term51424, 0, "");
        setElement(term51424, 1, "");
        setField(term51416, term51416.getClass(), "aliases", term51424);
        setField(term51416, term51416.getClass(), "aliasSet", null);
        setField(term50979, term50979.getClass(), "charset", term51416);
        setIntField(term51427, term51427.getClass(), "threadLocalHashCode", 718050984);
        setField(term50979, term50979.getClass(), "encoderThreadLocal", term51427);
        setField(term50979, term50979.getClass(), "coreCharset", null);
        setBooleanField(term50979, term50979.getClass(), "prettyPrint", true);
        setBooleanField(term50979, term50979.getClass(), "outline", false);
        setIntField(term50979, term50979.getClass(), "indentAmount", 1);
        setField(term50979, term50979.getClass(), "syntax", enum7);
        setField(term50978, term50978.getClass(), "outputSettings", term50979);
        setField(term50978, term50978.getClass(), "quirksMode", enum8);
        setField(term50978, term50978.getClass(), "location", "SzjVpOQTyS");
        setBooleanField(term50978, term50978.getClass(), "updateMetaCharset", false);
        setField(term51465, term51465.getClass(), "tagName", "#root");
        setBooleanField(term51465, term51465.getClass(), "isBlock", false);
        setBooleanField(term51465, term51465.getClass(), "formatAsBlock", true);
        setBooleanField(term51465, term51465.getClass(), "canContainInline", true);
        setBooleanField(term51465, term51465.getClass(), "empty", false);
        setBooleanField(term51465, term51465.getClass(), "selfClosing", false);
        setBooleanField(term51465, term51465.getClass(), "preserveWhitespace", false);
        setBooleanField(term51465, term51465.getClass(), "formList", false);
        setBooleanField(term51465, term51465.getClass(), "formSubmit", false);
        setField(term50978, term50978.getClass(), "tag", term51465);
        setField(term50978, term50978.getClass(), "shadowChildrenRef", null);
        setIntField(term51481, term51481.getClass(), "modCount", 0);
        setField(term50978, term50978.getClass(), "childNodes", term51481);
        setField(term50978, term50978.getClass(), "attributes", null);
        setField(term50978, term50978.getClass(), "baseUri", "SzjVpOQTyS");
        setField(term50978, term50978.getClass(), "parentNode", null);
        setIntField(term50978, term50978.getClass(), "siblingIndex", 0);
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
        assertTrue(recursiveEquals(term313, term51500));
        assertTrue(recursiveEquals(retValue, term50978));
    }

};


