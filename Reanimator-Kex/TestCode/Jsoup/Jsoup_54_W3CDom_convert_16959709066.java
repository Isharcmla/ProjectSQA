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
import java.util.LinkedHashMap;

public class W3CDom_convert_16959709066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term631;
     Object term641;

    public W3CDom_convert_16959709066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term631 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term632 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term632, term632.getClass(), "attributes", null);
        setField(term632, term632.getClass(), "features", null);
        setField(term632, term632.getClass(), "grammar", null);
        setBooleanField(term632, term632.getClass(), "isXIncludeAware", false);
        setBooleanField(term632, term632.getClass(), "fSecureProcess", true);
        setBooleanField(term632, term632.getClass(), "validating", false);
        setBooleanField(term632, term632.getClass(), "namespaceAware", false);
        setBooleanField(term632, term632.getClass(), "whitespace", false);
        setBooleanField(term632, term632.getClass(), "expandEntityRef", true);
        setBooleanField(term632, term632.getClass(), "ignoreComments", false);
        setBooleanField(term632, term632.getClass(), "coalescing", false);
        setField(term631, term631.getClass(), "factory", term632);
        Class<? extends Object> term3083 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term3082 = ((Class) term3083).getDeclaredField((String) "html");
        ((Field) term3082).setAccessible(true);
        Object enum8 = ((Field) term3082).get((Object) null);
        Class<? extends Object> term3332 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term3331 = ((Class) term3332).getDeclaredField((String) "limitedQuirks");
        ((Field) term3331).setAccessible(true);
        Object enum9 = ((Field) term3331).get((Object) null);
        ArrayList term706 = new ArrayList();
        ((ArrayList) term706).add((Object)null);
        ((ArrayList) term706).add((Object)null);
        ((ArrayList) term706).add((Object)null);
        ((ArrayList) term706).add((Object)null);
        LinkedHashMap term711 = new LinkedHashMap();
        term641 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term642 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term684 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term710 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term642, term642.getClass(), "escapeMode", null);
        setField(term642, term642.getClass(), "charset", null);
        setField(term642, term642.getClass(), "charsetEncoder", null);
        setBooleanField(term642, term642.getClass(), "prettyPrint", false);
        setBooleanField(term642, term642.getClass(), "outline", true);
        setIntField(term642, term642.getClass(), "indentAmount", 1484323161);
        setField(term642, term642.getClass(), "syntax", enum8);
        setField(term641, term641.getClass(), "outputSettings", term642);
        setField(term641, term641.getClass(), "quirksMode", enum9);
        setField(term641, term641.getClass(), "location", "SzjVpOQTyS");
        setBooleanField(term641, term641.getClass(), "updateMetaCharset", false);
        setField(term684, term684.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term684, term684.getClass(), "isBlock", false);
        setBooleanField(term684, term684.getClass(), "formatAsBlock", true);
        setBooleanField(term684, term684.getClass(), "canContainBlock", true);
        setBooleanField(term684, term684.getClass(), "canContainInline", false);
        setBooleanField(term684, term684.getClass(), "empty", false);
        setBooleanField(term684, term684.getClass(), "selfClosing", true);
        setBooleanField(term684, term684.getClass(), "preserveWhitespace", true);
        setBooleanField(term684, term684.getClass(), "formList", true);
        setBooleanField(term684, term684.getClass(), "formSubmit", true);
        setField(term641, term641.getClass(), "tag", term684);
        setField(term641, term641.getClass(), "parentNode", null);
        setField(term641, term641.getClass(), "childNodes", term706);
        setField(term710, term710.getClass(), "attributes", term711);
        setField(term641, term641.getClass(), "attributes", term710);
        setField(term641, term641.getClass(), "baseUri", "uuaPigETmJ");
        setIntField(term641, term641.getClass(), "siblingIndex", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        argTypes[1] = Class.forName("org.w3c.dom.Document");
        Object[] args = new Object[2];
        args[0] = term641;
        args[1] = null;
        try {
            callMethod(klass, "convert", argTypes, term631, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


