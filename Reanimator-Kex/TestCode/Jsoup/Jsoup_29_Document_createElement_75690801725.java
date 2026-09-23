package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_createElement_75690801725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1348;
     Object term10880;
     Object term10820;

    public Document_createElement_75690801725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10899 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term10898 = ((Class) term10899).getDeclaredField((String) "noQuirks");
        ((Field) term10898).setAccessible(true);
        Object enum26 = ((Field) term10898).get((Object) null);
        HashMap term1385 = new HashMap();
        Set<Object> term11114 =  ((Map) term1385).keySet();
        HashSet term1384 = new HashSet((Collection<? extends Object>) term11114);
        ArrayList term1399 = new ArrayList();
        ((ArrayList) term1399).add((Object)null);
        LinkedHashMap term1404 = new LinkedHashMap();
        term1348 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term1349 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term1364 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1403 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1349, term1349.getClass(), "escapeMode", null);
        setField(term1349, term1349.getClass(), "charset", null);
        setField(term1349, term1349.getClass(), "charsetEncoder", null);
        setBooleanField(term1349, term1349.getClass(), "prettyPrint", true);
        setIntField(term1349, term1349.getClass(), "indentAmount", 1227103734);
        setField(term1348, term1348.getClass(), "outputSettings", term1349);
        setField(term1348, term1348.getClass(), "quirksMode", enum26);
        setField(term1364, term1364.getClass(), "tagName", "kuTXqwMtDB");
        setBooleanField(term1364, term1364.getClass(), "isBlock", true);
        setBooleanField(term1364, term1364.getClass(), "formatAsBlock", false);
        setBooleanField(term1364, term1364.getClass(), "canContainBlock", true);
        setBooleanField(term1364, term1364.getClass(), "canContainInline", true);
        setBooleanField(term1364, term1364.getClass(), "empty", true);
        setBooleanField(term1364, term1364.getClass(), "selfClosing", true);
        setBooleanField(term1364, term1364.getClass(), "preserveWhitespace", false);
        setField(term1348, term1348.getClass(), "tag", term1364);
        setField(term1348, term1348.getClass(), "classNames", term1384);
        setField(term1348, term1348.getClass(), "parentNode", null);
        setField(term1348, term1348.getClass(), "childNodes", term1399);
        setField(term1403, term1403.getClass(), "attributes", term1404);
        setField(term1348, term1348.getClass(), "attributes", term1403);
        setField(term1348, term1348.getClass(), "baseUri", "GzFkzHGYFt");
        setIntField(term1348, term1348.getClass(), "siblingIndex", -1339778481);
        Class<? extends Object> term11136 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term11135 = ((Class) term11136).getDeclaredField((String) "noQuirks");
        ((Field) term11135).setAccessible(true);
        Object enum27 = ((Field) term11135).get((Object) null);
        HashMap term10889 = new HashMap();
        Set<Object> term11351 =  ((Map) term10889).keySet();
        HashSet term10888 = new HashSet((Collection<? extends Object>) term11351);
        ArrayList term10890 = new ArrayList();
        ((ArrayList) term10890).add((Object)null);
        LinkedHashMap term10893 = new LinkedHashMap();
        term10880 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term10881 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term10885 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10892 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10881, term10881.getClass(), "escapeMode", null);
        setField(term10881, term10881.getClass(), "charset", null);
        setField(term10881, term10881.getClass(), "charsetEncoder", null);
        setBooleanField(term10881, term10881.getClass(), "prettyPrint", true);
        setIntField(term10881, term10881.getClass(), "indentAmount", 1227103734);
        setField(term10880, term10880.getClass(), "outputSettings", term10881);
        setField(term10880, term10880.getClass(), "quirksMode", enum27);
        setField(term10885, term10885.getClass(), "tagName", "kuTXqwMtDB");
        setBooleanField(term10885, term10885.getClass(), "isBlock", true);
        setBooleanField(term10885, term10885.getClass(), "formatAsBlock", false);
        setBooleanField(term10885, term10885.getClass(), "canContainBlock", true);
        setBooleanField(term10885, term10885.getClass(), "canContainInline", true);
        setBooleanField(term10885, term10885.getClass(), "empty", true);
        setBooleanField(term10885, term10885.getClass(), "selfClosing", true);
        setBooleanField(term10885, term10885.getClass(), "preserveWhitespace", false);
        setField(term10880, term10880.getClass(), "tag", term10885);
        setField(term10880, term10880.getClass(), "classNames", term10888);
        setField(term10880, term10880.getClass(), "parentNode", null);
        setField(term10880, term10880.getClass(), "childNodes", term10890);
        setField(term10892, term10892.getClass(), "attributes", term10893);
        setField(term10880, term10880.getClass(), "attributes", term10892);
        setField(term10880, term10880.getClass(), "baseUri", "GzFkzHGYFt");
        setIntField(term10880, term10880.getClass(), "siblingIndex", -1339778481);
        ArrayList term10841 = new ArrayList();
        term10820 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10821 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10845 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10821, term10821.getClass(), "tagName", "tshwqlrgne");
        setBooleanField(term10821, term10821.getClass(), "isBlock", false);
        setBooleanField(term10821, term10821.getClass(), "formatAsBlock", true);
        setBooleanField(term10821, term10821.getClass(), "canContainBlock", true);
        setBooleanField(term10821, term10821.getClass(), "canContainInline", true);
        setBooleanField(term10821, term10821.getClass(), "empty", false);
        setBooleanField(term10821, term10821.getClass(), "selfClosing", false);
        setBooleanField(term10821, term10821.getClass(), "preserveWhitespace", false);
        setField(term10820, term10820.getClass(), "tag", term10821);
        setField(term10820, term10820.getClass(), "classNames", null);
        setField(term10820, term10820.getClass(), "parentNode", null);
        setField(term10820, term10820.getClass(), "childNodes", term10841);
        setField(term10845, term10845.getClass(), "attributes", null);
        setField(term10820, term10820.getClass(), "attributes", term10845);
        setField(term10820, term10820.getClass(), "baseUri", "GzFkzHGYFt");
        setIntField(term10820, term10820.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        Object retValue = callMethod(klass, "createElement", argTypes, term1348, args);
        assertTrue(recursiveEquals(term1348, term10880));
        assertTrue(recursiveEquals(retValue, term10820));
    }

};


