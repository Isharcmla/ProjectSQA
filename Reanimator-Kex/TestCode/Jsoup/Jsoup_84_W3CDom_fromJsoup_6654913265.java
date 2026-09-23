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
import java.lang.IndexOutOfBoundsException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class W3CDom_fromJsoup_6654913265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term11;

    public W3CDom_fromJsoup_6654913265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term2 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term2, term2.getClass(), "attributes", null);
        setField(term2, term2.getClass(), "features", null);
        setField(term2, term2.getClass(), "grammar", null);
        setBooleanField(term2, term2.getClass(), "isXIncludeAware", false);
        setBooleanField(term2, term2.getClass(), "fSecureProcess", true);
        setBooleanField(term2, term2.getClass(), "validating", false);
        setBooleanField(term2, term2.getClass(), "namespaceAware", false);
        setBooleanField(term2, term2.getClass(), "whitespace", false);
        setBooleanField(term2, term2.getClass(), "expandEntityRef", true);
        setBooleanField(term2, term2.getClass(), "ignoreComments", false);
        setBooleanField(term2, term2.getClass(), "coalescing", false);
        setField(term1, term1.getClass(), "factory", term2);
        Class<? extends Object> term46074 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term46073 = ((Class) term46074).getDeclaredField((String) "base");
        ((Field) term46073).setAccessible(true);
        Object enum8 = ((Field) term46073).get((Object) null);
        Class<? extends Object> term46273 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term46272 = ((Class) term46273).getDeclaredField((String) "utf");
        ((Field) term46272).setAccessible(true);
        Object enum9 = ((Field) term46272).get((Object) null);
        Class<? extends Object> term46469 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term46468 = ((Class) term46469).getDeclaredField((String) "html");
        ((Field) term46468).setAccessible(true);
        Object enum10 = ((Field) term46468).get((Object) null);
        Class<? extends Object> term46718 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term46717 = ((Class) term46718).getDeclaredField((String) "quirks");
        ((Field) term46717).setAccessible(true);
        Object enum11 = ((Field) term46717).get((Object) null);
        ArrayList term536 = new ArrayList();
        ((ArrayList) term536).add((Object)null);
        ((ArrayList) term536).add((Object)null);
        ((ArrayList) term536).add((Object)null);
        ((ArrayList) term536).add((Object)null);
        term11 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term12 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term449 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term457 = (Object[]) newArray("java.lang.String", 2);
        Object term460 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term480 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term481 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term485 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term511 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term532 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term533 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term534 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term540 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term542 = (Object[]) newArray("java.lang.String", 0);
        Object[] term543 = (Object[]) newArray("java.lang.String", 0);
        setField(term12, term12.getClass(), "escapeMode", enum8);
        setField(term449, term449.getClass(), "name", "UTF-8");
        setElement(term457, 0, "");
        setElement(term457, 1, "");
        setField(term449, term449.getClass(), "aliases", term457);
        setField(term449, term449.getClass(), "aliasSet", null);
        setField(term12, term12.getClass(), "charset", term449);
        setIntField(term460, term460.getClass(), "threadLocalHashCode", 182847398);
        setField(term12, term12.getClass(), "encoderThreadLocal", term460);
        setField(term12, term12.getClass(), "coreCharset", enum9);
        setBooleanField(term12, term12.getClass(), "prettyPrint", true);
        setBooleanField(term12, term12.getClass(), "outline", false);
        setIntField(term12, term12.getClass(), "indentAmount", 1);
        setField(term12, term12.getClass(), "syntax", enum10);
        setField(term11, term11.getClass(), "outputSettings", term12);
        setField(term480, term480.getClass(), "treeBuilder", null);
        setIntField(term481, term481.getClass(), "maxSize", 0);
        setField(term481, term481.getClass(), "elementData", null);
        setIntField(term481, term481.getClass(), "size", 0);
        setIntField(term481, term481.getClass(), "modCount", 0);
        setField(term480, term480.getClass(), "errors", term481);
        setBooleanField(term485, term485.getClass(), "preserveTagCase", false);
        setBooleanField(term485, term485.getClass(), "preserveAttributeCase", false);
        setField(term480, term480.getClass(), "settings", term485);
        setField(term11, term11.getClass(), "parser", term480);
        setField(term11, term11.getClass(), "quirksMode", enum11);
        setField(term11, term11.getClass(), "location", "PAEBtnZtTD");
        setBooleanField(term11, term11.getClass(), "updateMetaCharset", false);
        setField(term511, term511.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term511, term511.getClass(), "isBlock", true);
        setBooleanField(term511, term511.getClass(), "formatAsBlock", true);
        setBooleanField(term511, term511.getClass(), "canContainInline", true);
        setBooleanField(term511, term511.getClass(), "empty", true);
        setBooleanField(term511, term511.getClass(), "selfClosing", false);
        setBooleanField(term511, term511.getClass(), "preserveWhitespace", true);
        setBooleanField(term511, term511.getClass(), "formList", false);
        setBooleanField(term511, term511.getClass(), "formSubmit", true);
        setField(term11, term11.getClass(), "tag", term511);
        setField(term532, term532.getClass(), "referent", null);
        setField(term533, term533.getClass(), "lock", term534);
        setField(term533, term533.getClass(), "head", null);
        setLongField(term533, term533.getClass(), "queueLength", 2442117782898005296L);
        setField(term532, term532.getClass(), "queue", term533);
        setField(term532, term532.getClass(), "next", null);
        setField(term532, term532.getClass(), "discovered", null);
        setField(term11, term11.getClass(), "shadowChildrenRef", term532);
        setField(term11, term11.getClass(), "childNodes", term536);
        setIntField(term540, term540.getClass(), "size", 568599855);
        setField(term540, term540.getClass(), "keys", term542);
        setField(term540, term540.getClass(), "vals", term543);
        setField(term11, term11.getClass(), "attributes", term540);
        setField(term11, term11.getClass(), "baseUri", "MuLcgQHgqz");
        setField(term11, term11.getClass(), "parentNode", null);
        setIntField(term11, term11.getClass(), "siblingIndex", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term11;
        try {
            callMethod(klass, "fromJsoup", argTypes, term1, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


