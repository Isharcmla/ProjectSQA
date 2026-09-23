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
import java.lang.NullPointerException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class W3CDom_convert_16959709066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44021;
     Object term44031;

    public W3CDom_convert_16959709066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44021 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term44022 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term44022, term44022.getClass(), "attributes", null);
        setField(term44022, term44022.getClass(), "features", null);
        setField(term44022, term44022.getClass(), "grammar", null);
        setBooleanField(term44022, term44022.getClass(), "isXIncludeAware", false);
        setBooleanField(term44022, term44022.getClass(), "fSecureProcess", true);
        setBooleanField(term44022, term44022.getClass(), "validating", false);
        setBooleanField(term44022, term44022.getClass(), "namespaceAware", false);
        setBooleanField(term44022, term44022.getClass(), "whitespace", false);
        setBooleanField(term44022, term44022.getClass(), "expandEntityRef", true);
        setBooleanField(term44022, term44022.getClass(), "ignoreComments", false);
        setBooleanField(term44022, term44022.getClass(), "coalescing", false);
        setField(term44021, term44021.getClass(), "factory", term44022);
        Class<? extends Object> term48324 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term48323 = ((Class) term48324).getDeclaredField((String) "base");
        ((Field) term48323).setAccessible(true);
        Object enum16 = ((Field) term48323).get((Object) null);
        Class<? extends Object> term48523 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term48522 = ((Class) term48523).getDeclaredField((String) "fallback");
        ((Field) term48522).setAccessible(true);
        Object enum17 = ((Field) term48522).get((Object) null);
        Class<? extends Object> term48734 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term48733 = ((Class) term48734).getDeclaredField((String) "html");
        ((Field) term48733).setAccessible(true);
        Object enum18 = ((Field) term48733).get((Object) null);
        Class<? extends Object> term48983 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term48982 = ((Class) term48983).getDeclaredField((String) "limitedQuirks");
        ((Field) term48982).setAccessible(true);
        Object enum19 = ((Field) term48982).get((Object) null);
        ArrayList term44568 = new ArrayList();
        ((ArrayList) term44568).add((Object)null);
        ((ArrayList) term44568).add((Object)null);
        ((ArrayList) term44568).add((Object)null);
        ((ArrayList) term44568).add((Object)null);
        ((ArrayList) term44568).add((Object)null);
        term44031 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term44032 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term44469 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term44477 = (Object[]) newArray("java.lang.String", 2);
        Object term44480 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term44505 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term44506 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term44510 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term44543 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term44564 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term44565 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term44566 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term44572 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term44574 = (Object[]) newArray("java.lang.String", 0);
        Object[] term44575 = (Object[]) newArray("java.lang.String", 0);
        setField(term44032, term44032.getClass(), "escapeMode", enum16);
        setField(term44469, term44469.getClass(), "name", "UTF-8");
        setElement(term44477, 0, "");
        setElement(term44477, 1, "");
        setField(term44469, term44469.getClass(), "aliases", term44477);
        setField(term44469, term44469.getClass(), "aliasSet", null);
        setField(term44032, term44032.getClass(), "charset", term44469);
        setIntField(term44480, term44480.getClass(), "threadLocalHashCode", -978983473);
        setField(term44032, term44032.getClass(), "encoderThreadLocal", term44480);
        setField(term44032, term44032.getClass(), "coreCharset", enum17);
        setBooleanField(term44032, term44032.getClass(), "prettyPrint", true);
        setBooleanField(term44032, term44032.getClass(), "outline", true);
        setIntField(term44032, term44032.getClass(), "indentAmount", 1);
        setField(term44032, term44032.getClass(), "syntax", enum18);
        setField(term44031, term44031.getClass(), "outputSettings", term44032);
        setField(term44505, term44505.getClass(), "treeBuilder", null);
        setIntField(term44506, term44506.getClass(), "maxSize", 0);
        setField(term44506, term44506.getClass(), "elementData", null);
        setIntField(term44506, term44506.getClass(), "size", 0);
        setIntField(term44506, term44506.getClass(), "modCount", 0);
        setField(term44505, term44505.getClass(), "errors", term44506);
        setBooleanField(term44510, term44510.getClass(), "preserveTagCase", false);
        setBooleanField(term44510, term44510.getClass(), "preserveAttributeCase", false);
        setField(term44505, term44505.getClass(), "settings", term44510);
        setField(term44031, term44031.getClass(), "parser", term44505);
        setField(term44031, term44031.getClass(), "quirksMode", enum19);
        setField(term44031, term44031.getClass(), "location", "xxtlPwDYFs");
        setBooleanField(term44031, term44031.getClass(), "updateMetaCharset", true);
        setField(term44543, term44543.getClass(), "tagName", "jJCZpVmanW");
        setBooleanField(term44543, term44543.getClass(), "isBlock", true);
        setBooleanField(term44543, term44543.getClass(), "formatAsBlock", false);
        setBooleanField(term44543, term44543.getClass(), "canContainInline", false);
        setBooleanField(term44543, term44543.getClass(), "empty", true);
        setBooleanField(term44543, term44543.getClass(), "selfClosing", true);
        setBooleanField(term44543, term44543.getClass(), "preserveWhitespace", true);
        setBooleanField(term44543, term44543.getClass(), "formList", true);
        setBooleanField(term44543, term44543.getClass(), "formSubmit", true);
        setField(term44031, term44031.getClass(), "tag", term44543);
        setField(term44564, term44564.getClass(), "referent", null);
        setField(term44565, term44565.getClass(), "lock", term44566);
        setField(term44565, term44565.getClass(), "head", null);
        setLongField(term44565, term44565.getClass(), "queueLength", 6375119433582206027L);
        setField(term44564, term44564.getClass(), "queue", term44565);
        setField(term44564, term44564.getClass(), "next", null);
        setField(term44564, term44564.getClass(), "discovered", null);
        setField(term44031, term44031.getClass(), "shadowChildrenRef", term44564);
        setField(term44031, term44031.getClass(), "childNodes", term44568);
        setIntField(term44572, term44572.getClass(), "size", 1484323161);
        setField(term44572, term44572.getClass(), "keys", term44574);
        setField(term44572, term44572.getClass(), "vals", term44575);
        setField(term44031, term44031.getClass(), "attributes", term44572);
        setField(term44031, term44031.getClass(), "baseUri", "EGtDIRbSSb");
        setField(term44031, term44031.getClass(), "parentNode", null);
        setIntField(term44031, term44031.getClass(), "siblingIndex", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        argTypes[1] = Class.forName("org.w3c.dom.Document");
        Object[] args = new Object[2];
        args[0] = term44031;
        args[1] = null;
        try {
            callMethod(klass, "convert", argTypes, term44021, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


