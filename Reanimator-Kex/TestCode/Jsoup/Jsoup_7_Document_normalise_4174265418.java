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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Document_normalise_4174265418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9271;

    public Document_normalise_4174265418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9417 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term9416 = ((Class) term9417).getDeclaredField((String) "base");
        ((Field) term9416).setAccessible(true);
        Object enum5 = ((Field) term9416).get((Object) null);
        Object term9312 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9312, term9312.getClass(), "tagName", null);
        setBooleanField(term9312, term9312.getClass(), "knownTag", false);
        setBooleanField(term9312, term9312.getClass(), "isBlock", true);
        setBooleanField(term9312, term9312.getClass(), "canContainBlock", true);
        setBooleanField(term9312, term9312.getClass(), "canContainInline", false);
        setBooleanField(term9312, term9312.getClass(), "optionalClosing", true);
        setBooleanField(term9312, term9312.getClass(), "empty", false);
        setBooleanField(term9312, term9312.getClass(), "selfClosing", true);
        setBooleanField(term9312, term9312.getClass(), "preserveWhitespace", false);
        setField(term9312, term9312.getClass(), "ancestors", null);
        setField(term9312, term9312.getClass(), "excludes", null);
        setField(term9312, term9312.getClass(), "ignoreEndTags", null);
        setBooleanField(term9312, term9312.getClass(), "directDescendant", false);
        setBooleanField(term9312, term9312.getClass(), "limitChildren", false);
        Object term9323 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9323, term9323.getClass(), "tagName", null);
        setBooleanField(term9323, term9323.getClass(), "knownTag", false);
        setBooleanField(term9323, term9323.getClass(), "isBlock", false);
        setBooleanField(term9323, term9323.getClass(), "canContainBlock", false);
        setBooleanField(term9323, term9323.getClass(), "canContainInline", false);
        setBooleanField(term9323, term9323.getClass(), "optionalClosing", false);
        setBooleanField(term9323, term9323.getClass(), "empty", false);
        setBooleanField(term9323, term9323.getClass(), "selfClosing", false);
        setBooleanField(term9323, term9323.getClass(), "preserveWhitespace", false);
        setField(term9323, term9323.getClass(), "ancestors", null);
        setField(term9323, term9323.getClass(), "excludes", null);
        setField(term9323, term9323.getClass(), "ignoreEndTags", null);
        setBooleanField(term9323, term9323.getClass(), "directDescendant", false);
        setBooleanField(term9323, term9323.getClass(), "limitChildren", false);
        Object term9334 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9334, term9334.getClass(), "tagName", null);
        setBooleanField(term9334, term9334.getClass(), "knownTag", false);
        setBooleanField(term9334, term9334.getClass(), "isBlock", false);
        setBooleanField(term9334, term9334.getClass(), "canContainBlock", true);
        setBooleanField(term9334, term9334.getClass(), "canContainInline", true);
        setBooleanField(term9334, term9334.getClass(), "optionalClosing", false);
        setBooleanField(term9334, term9334.getClass(), "empty", false);
        setBooleanField(term9334, term9334.getClass(), "selfClosing", false);
        setBooleanField(term9334, term9334.getClass(), "preserveWhitespace", false);
        setField(term9334, term9334.getClass(), "ancestors", null);
        setField(term9334, term9334.getClass(), "excludes", null);
        setField(term9334, term9334.getClass(), "ignoreEndTags", null);
        setBooleanField(term9334, term9334.getClass(), "directDescendant", false);
        setBooleanField(term9334, term9334.getClass(), "limitChildren", true);
        Object term9345 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9345, term9345.getClass(), "tagName", null);
        setBooleanField(term9345, term9345.getClass(), "knownTag", false);
        setBooleanField(term9345, term9345.getClass(), "isBlock", false);
        setBooleanField(term9345, term9345.getClass(), "canContainBlock", false);
        setBooleanField(term9345, term9345.getClass(), "canContainInline", false);
        setBooleanField(term9345, term9345.getClass(), "optionalClosing", false);
        setBooleanField(term9345, term9345.getClass(), "empty", false);
        setBooleanField(term9345, term9345.getClass(), "selfClosing", false);
        setBooleanField(term9345, term9345.getClass(), "preserveWhitespace", false);
        setField(term9345, term9345.getClass(), "ancestors", null);
        setField(term9345, term9345.getClass(), "excludes", null);
        setField(term9345, term9345.getClass(), "ignoreEndTags", null);
        setBooleanField(term9345, term9345.getClass(), "directDescendant", false);
        setBooleanField(term9345, term9345.getClass(), "limitChildren", false);
        ArrayList term9310 = new ArrayList();
        ((ArrayList) term9310).add(term9312);
        ((ArrayList) term9310).add(term9323);
        ((ArrayList) term9310).add(term9334);
        ((ArrayList) term9310).add(term9323);
        ((ArrayList) term9310).add(term9345);
        ArrayList term9358 = new ArrayList();
        Object term9364 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9364, term9364.getClass(), "tagName", null);
        setBooleanField(term9364, term9364.getClass(), "knownTag", false);
        setBooleanField(term9364, term9364.getClass(), "isBlock", true);
        setBooleanField(term9364, term9364.getClass(), "canContainBlock", false);
        setBooleanField(term9364, term9364.getClass(), "canContainInline", false);
        setBooleanField(term9364, term9364.getClass(), "optionalClosing", true);
        setBooleanField(term9364, term9364.getClass(), "empty", true);
        setBooleanField(term9364, term9364.getClass(), "selfClosing", true);
        setBooleanField(term9364, term9364.getClass(), "preserveWhitespace", false);
        setField(term9364, term9364.getClass(), "ancestors", null);
        setField(term9364, term9364.getClass(), "excludes", null);
        setField(term9364, term9364.getClass(), "ignoreEndTags", null);
        setBooleanField(term9364, term9364.getClass(), "directDescendant", false);
        setBooleanField(term9364, term9364.getClass(), "limitChildren", true);
        ArrayList term9362 = new ArrayList();
        ((ArrayList) term9362).add(term9364);
        HashMap term9380 = new HashMap();
        Set<Object> term9620 =  ((Map) term9380).keySet();
        HashSet term9379 = new HashSet((Collection<? extends Object>) term9620);
        ArrayList term9392 = new ArrayList();
        ((ArrayList) term9392).add((Object)null);
        ((ArrayList) term9392).add((Object)null);
        ((ArrayList) term9392).add((Object)null);
        ((ArrayList) term9392).add((Object)null);
        LinkedHashMap term9397 = new LinkedHashMap();
        term9271 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term9272 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term9289 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9396 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9272, term9272.getClass(), "escapeMode", enum5);
        setField(term9272, term9272.getClass(), "charset", null);
        setField(term9272, term9272.getClass(), "charsetEncoder", null);
        setBooleanField(term9272, term9272.getClass(), "prettyPrint", false);
        setIntField(term9272, term9272.getClass(), "indentAmount", 1725571209);
        setField(term9272, term9272.getClass(), "this$0", null);
        setField(term9271, term9271.getClass(), "outputSettings", term9272);
        setField(term9289, term9289.getClass(), "tagName", "kBdSllIBVz");
        setBooleanField(term9289, term9289.getClass(), "knownTag", false);
        setBooleanField(term9289, term9289.getClass(), "isBlock", false);
        setBooleanField(term9289, term9289.getClass(), "canContainBlock", true);
        setBooleanField(term9289, term9289.getClass(), "canContainInline", true);
        setBooleanField(term9289, term9289.getClass(), "optionalClosing", false);
        setBooleanField(term9289, term9289.getClass(), "empty", true);
        setBooleanField(term9289, term9289.getClass(), "selfClosing", true);
        setBooleanField(term9289, term9289.getClass(), "preserveWhitespace", true);
        setField(term9289, term9289.getClass(), "ancestors", term9310);
        setField(term9289, term9289.getClass(), "excludes", term9358);
        setField(term9289, term9289.getClass(), "ignoreEndTags", term9362);
        setBooleanField(term9289, term9289.getClass(), "directDescendant", true);
        setBooleanField(term9289, term9289.getClass(), "limitChildren", false);
        setField(term9271, term9271.getClass(), "tag", term9289);
        setField(term9271, term9271.getClass(), "classNames", term9379);
        setField(term9271, term9271.getClass(), "parentNode", null);
        setField(term9271, term9271.getClass(), "childNodes", term9392);
        setField(term9396, term9396.getClass(), "attributes", term9397);
        setField(term9271, term9271.getClass(), "attributes", term9396);
        setField(term9271, term9271.getClass(), "baseUri", "oVgzLbrsFr");
        setIntField(term9271, term9271.getClass(), "siblingIndex", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "normalise", argTypes, term9271, args);
    }

};


