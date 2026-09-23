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
import java.util.LinkedHashMap;

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
        Class<? extends Object> term1720 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term1719 = ((Class) term1720).getDeclaredField((String) "html");
        ((Field) term1719).setAccessible(true);
        Object enum4 = ((Field) term1719).get((Object) null);
        Class<? extends Object> term1969 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term1968 = ((Class) term1969).getDeclaredField((String) "quirks");
        ((Field) term1968).setAccessible(true);
        Object enum5 = ((Field) term1968).get((Object) null);
        ArrayList term69 = new ArrayList();
        ((ArrayList) term69).add((Object)null);
        ((ArrayList) term69).add((Object)null);
        ((ArrayList) term69).add((Object)null);
        ((ArrayList) term69).add((Object)null);
        ((ArrayList) term69).add((Object)null);
        LinkedHashMap term74 = new LinkedHashMap();
        term11 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term12 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term47 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term73 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12, term12.getClass(), "escapeMode", null);
        setField(term12, term12.getClass(), "charset", null);
        setField(term12, term12.getClass(), "charsetEncoder", null);
        setBooleanField(term12, term12.getClass(), "prettyPrint", false);
        setBooleanField(term12, term12.getClass(), "outline", false);
        setIntField(term12, term12.getClass(), "indentAmount", 568599855);
        setField(term12, term12.getClass(), "syntax", enum4);
        setField(term11, term11.getClass(), "outputSettings", term12);
        setField(term11, term11.getClass(), "quirksMode", enum5);
        setField(term11, term11.getClass(), "location", "PAEBtnZtTD");
        setBooleanField(term11, term11.getClass(), "updateMetaCharset", false);
        setField(term47, term47.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term47, term47.getClass(), "isBlock", false);
        setBooleanField(term47, term47.getClass(), "formatAsBlock", true);
        setBooleanField(term47, term47.getClass(), "canContainBlock", true);
        setBooleanField(term47, term47.getClass(), "canContainInline", true);
        setBooleanField(term47, term47.getClass(), "empty", true);
        setBooleanField(term47, term47.getClass(), "selfClosing", false);
        setBooleanField(term47, term47.getClass(), "preserveWhitespace", true);
        setBooleanField(term47, term47.getClass(), "formList", false);
        setBooleanField(term47, term47.getClass(), "formSubmit", true);
        setField(term11, term11.getClass(), "tag", term47);
        setField(term11, term11.getClass(), "parentNode", null);
        setField(term11, term11.getClass(), "childNodes", term69);
        setField(term73, term73.getClass(), "attributes", term74);
        setField(term11, term11.getClass(), "attributes", term73);
        setField(term11, term11.getClass(), "baseUri", "EGtDIRbSSb");
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


