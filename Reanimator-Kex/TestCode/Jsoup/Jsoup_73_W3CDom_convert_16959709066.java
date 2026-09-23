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
     Object term44010;
     Object term44020;

    public W3CDom_convert_16959709066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44010 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term44011 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term44011, term44011.getClass(), "attributes", null);
        setField(term44011, term44011.getClass(), "features", null);
        setField(term44011, term44011.getClass(), "grammar", null);
        setBooleanField(term44011, term44011.getClass(), "isXIncludeAware", false);
        setBooleanField(term44011, term44011.getClass(), "fSecureProcess", true);
        setBooleanField(term44011, term44011.getClass(), "validating", false);
        setBooleanField(term44011, term44011.getClass(), "namespaceAware", false);
        setBooleanField(term44011, term44011.getClass(), "whitespace", false);
        setBooleanField(term44011, term44011.getClass(), "expandEntityRef", true);
        setBooleanField(term44011, term44011.getClass(), "ignoreComments", false);
        setBooleanField(term44011, term44011.getClass(), "coalescing", false);
        setField(term44010, term44010.getClass(), "factory", term44011);
        Class<? extends Object> term49516 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term49515 = ((Class) term49516).getDeclaredField((String) "base");
        ((Field) term49515).setAccessible(true);
        Object enum16 = ((Field) term49515).get((Object) null);
        Class<? extends Object> term49715 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term49714 = ((Class) term49715).getDeclaredField((String) "fallback");
        ((Field) term49714).setAccessible(true);
        Object enum17 = ((Field) term49714).get((Object) null);
        Class<? extends Object> term49926 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term49925 = ((Class) term49926).getDeclaredField((String) "html");
        ((Field) term49925).setAccessible(true);
        Object enum18 = ((Field) term49925).get((Object) null);
        Class<? extends Object> term50175 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term50174 = ((Class) term50175).getDeclaredField((String) "limitedQuirks");
        ((Field) term50174).setAccessible(true);
        Object enum19 = ((Field) term50174).get((Object) null);
        ArrayList term44549 = new ArrayList();
        term44020 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term44021 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term44458 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term44466 = (Object[]) newArray("java.lang.String", 2);
        Object term44469 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term44524 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term44545 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term44546 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term44547 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term44553 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term44555 = (Object[]) newArray("java.lang.String", 0);
        Object[] term44556 = (Object[]) newArray("java.lang.String", 0);
        setField(term44021, term44021.getClass(), "escapeMode", enum16);
        setField(term44458, term44458.getClass(), "name", "UTF-8");
        setElement(term44466, 0, "");
        setElement(term44466, 1, "");
        setField(term44458, term44458.getClass(), "aliases", term44466);
        setField(term44458, term44458.getClass(), "aliasSet", null);
        setField(term44021, term44021.getClass(), "charset", term44458);
        setIntField(term44469, term44469.getClass(), "threadLocalHashCode", -978983473);
        setField(term44021, term44021.getClass(), "encoderThreadLocal", term44469);
        setField(term44021, term44021.getClass(), "coreCharset", enum17);
        setBooleanField(term44021, term44021.getClass(), "prettyPrint", true);
        setBooleanField(term44021, term44021.getClass(), "outline", true);
        setIntField(term44021, term44021.getClass(), "indentAmount", 1);
        setField(term44021, term44021.getClass(), "syntax", enum18);
        setField(term44020, term44020.getClass(), "outputSettings", term44021);
        setField(term44020, term44020.getClass(), "quirksMode", enum19);
        setField(term44020, term44020.getClass(), "location", "xxtlPwDYFs");
        setBooleanField(term44020, term44020.getClass(), "updateMetaCharset", false);
        setField(term44524, term44524.getClass(), "tagName", "jJCZpVmanW");
        setBooleanField(term44524, term44524.getClass(), "isBlock", true);
        setBooleanField(term44524, term44524.getClass(), "formatAsBlock", false);
        setBooleanField(term44524, term44524.getClass(), "canContainInline", false);
        setBooleanField(term44524, term44524.getClass(), "empty", true);
        setBooleanField(term44524, term44524.getClass(), "selfClosing", true);
        setBooleanField(term44524, term44524.getClass(), "preserveWhitespace", false);
        setBooleanField(term44524, term44524.getClass(), "formList", false);
        setBooleanField(term44524, term44524.getClass(), "formSubmit", true);
        setField(term44020, term44020.getClass(), "tag", term44524);
        setField(term44545, term44545.getClass(), "referent", null);
        setField(term44546, term44546.getClass(), "lock", term44547);
        setField(term44546, term44546.getClass(), "head", null);
        setLongField(term44546, term44546.getClass(), "queueLength", 6375119433582206027L);
        setField(term44545, term44545.getClass(), "queue", term44546);
        setField(term44545, term44545.getClass(), "next", null);
        setField(term44545, term44545.getClass(), "discovered", null);
        setField(term44020, term44020.getClass(), "shadowChildrenRef", term44545);
        setField(term44020, term44020.getClass(), "childNodes", term44549);
        setIntField(term44553, term44553.getClass(), "size", 1484323161);
        setField(term44553, term44553.getClass(), "keys", term44555);
        setField(term44553, term44553.getClass(), "vals", term44556);
        setField(term44020, term44020.getClass(), "attributes", term44553);
        setField(term44020, term44020.getClass(), "baseUri", "EGtDIRbSSb");
        setField(term44020, term44020.getClass(), "parentNode", null);
        setIntField(term44020, term44020.getClass(), "siblingIndex", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        argTypes[1] = Class.forName("org.w3c.dom.Document");
        Object[] args = new Object[2];
        args[0] = term44020;
        args[1] = null;
        try {
            callMethod(klass, "convert", argTypes, term44010, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


