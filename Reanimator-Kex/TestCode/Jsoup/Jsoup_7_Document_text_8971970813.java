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

public class Document_text_8971970813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11054;

    public Document_text_8971970813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11202 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term11201 = ((Class) term11202).getDeclaredField((String) "xhtml");
        ((Field) term11201).setAccessible(true);
        Object enum9 = ((Field) term11201).get((Object) null);
        Object term11096 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11096, term11096.getClass(), "tagName", null);
        setBooleanField(term11096, term11096.getClass(), "knownTag", false);
        setBooleanField(term11096, term11096.getClass(), "isBlock", false);
        setBooleanField(term11096, term11096.getClass(), "canContainBlock", false);
        setBooleanField(term11096, term11096.getClass(), "canContainInline", false);
        setBooleanField(term11096, term11096.getClass(), "optionalClosing", true);
        setBooleanField(term11096, term11096.getClass(), "empty", true);
        setBooleanField(term11096, term11096.getClass(), "selfClosing", true);
        setBooleanField(term11096, term11096.getClass(), "preserveWhitespace", true);
        setField(term11096, term11096.getClass(), "ancestors", null);
        setField(term11096, term11096.getClass(), "excludes", null);
        setField(term11096, term11096.getClass(), "ignoreEndTags", null);
        setBooleanField(term11096, term11096.getClass(), "directDescendant", false);
        setBooleanField(term11096, term11096.getClass(), "limitChildren", false);
        ArrayList term11094 = new ArrayList();
        ((ArrayList) term11094).add(term11096);
        Object term11111 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11111, term11111.getClass(), "tagName", null);
        setBooleanField(term11111, term11111.getClass(), "knownTag", true);
        setBooleanField(term11111, term11111.getClass(), "isBlock", false);
        setBooleanField(term11111, term11111.getClass(), "canContainBlock", false);
        setBooleanField(term11111, term11111.getClass(), "canContainInline", true);
        setBooleanField(term11111, term11111.getClass(), "optionalClosing", true);
        setBooleanField(term11111, term11111.getClass(), "empty", false);
        setBooleanField(term11111, term11111.getClass(), "selfClosing", false);
        setBooleanField(term11111, term11111.getClass(), "preserveWhitespace", false);
        setField(term11111, term11111.getClass(), "ancestors", null);
        setField(term11111, term11111.getClass(), "excludes", null);
        setField(term11111, term11111.getClass(), "ignoreEndTags", null);
        setBooleanField(term11111, term11111.getClass(), "directDescendant", false);
        setBooleanField(term11111, term11111.getClass(), "limitChildren", true);
        Object term11122 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11122, term11122.getClass(), "tagName", null);
        setBooleanField(term11122, term11122.getClass(), "knownTag", false);
        setBooleanField(term11122, term11122.getClass(), "isBlock", true);
        setBooleanField(term11122, term11122.getClass(), "canContainBlock", false);
        setBooleanField(term11122, term11122.getClass(), "canContainInline", false);
        setBooleanField(term11122, term11122.getClass(), "optionalClosing", false);
        setBooleanField(term11122, term11122.getClass(), "empty", false);
        setBooleanField(term11122, term11122.getClass(), "selfClosing", true);
        setBooleanField(term11122, term11122.getClass(), "preserveWhitespace", true);
        setField(term11122, term11122.getClass(), "ancestors", null);
        setField(term11122, term11122.getClass(), "excludes", null);
        setField(term11122, term11122.getClass(), "ignoreEndTags", null);
        setBooleanField(term11122, term11122.getClass(), "directDescendant", true);
        setBooleanField(term11122, term11122.getClass(), "limitChildren", false);
        ArrayList term11109 = new ArrayList();
        ((ArrayList) term11109).add(term11096);
        ((ArrayList) term11109).add(term11111);
        ((ArrayList) term11109).add(term11096);
        ((ArrayList) term11109).add(term11122);
        Object term11137 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11137, term11137.getClass(), "tagName", null);
        setBooleanField(term11137, term11137.getClass(), "knownTag", false);
        setBooleanField(term11137, term11137.getClass(), "isBlock", false);
        setBooleanField(term11137, term11137.getClass(), "canContainBlock", false);
        setBooleanField(term11137, term11137.getClass(), "canContainInline", false);
        setBooleanField(term11137, term11137.getClass(), "optionalClosing", false);
        setBooleanField(term11137, term11137.getClass(), "empty", false);
        setBooleanField(term11137, term11137.getClass(), "selfClosing", false);
        setBooleanField(term11137, term11137.getClass(), "preserveWhitespace", false);
        setField(term11137, term11137.getClass(), "ancestors", null);
        setField(term11137, term11137.getClass(), "excludes", null);
        setField(term11137, term11137.getClass(), "ignoreEndTags", null);
        setBooleanField(term11137, term11137.getClass(), "directDescendant", false);
        setBooleanField(term11137, term11137.getClass(), "limitChildren", false);
        ArrayList term11135 = new ArrayList();
        ((ArrayList) term11135).add(term11137);
        ((ArrayList) term11135).add(term11122);
        HashMap term11153 = new HashMap();
        Set<Object> term11408 =  ((Map) term11153).keySet();
        HashSet term11152 = new HashSet((Collection<? extends Object>) term11408);
        ArrayList term11165 = new ArrayList();
        ((ArrayList) term11165).add((Object)null);
        ((ArrayList) term11165).add((Object)null);
        ((ArrayList) term11165).add((Object)null);
        ((ArrayList) term11165).add((Object)null);
        ((ArrayList) term11165).add((Object)null);
        ((ArrayList) term11165).add((Object)null);
        ((ArrayList) term11165).add((Object)null);
        ((ArrayList) term11165).add((Object)null);
        ((ArrayList) term11165).add((Object)null);
        LinkedHashMap term11170 = new LinkedHashMap();
        term11054 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term11055 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term11073 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11169 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11055, term11055.getClass(), "escapeMode", enum9);
        setField(term11055, term11055.getClass(), "charset", null);
        setField(term11055, term11055.getClass(), "charsetEncoder", null);
        setBooleanField(term11055, term11055.getClass(), "prettyPrint", false);
        setIntField(term11055, term11055.getClass(), "indentAmount", 1048535127);
        setField(term11055, term11055.getClass(), "this$0", null);
        setField(term11054, term11054.getClass(), "outputSettings", term11055);
        setField(term11073, term11073.getClass(), "tagName", "SdCKLMIYnX");
        setBooleanField(term11073, term11073.getClass(), "knownTag", true);
        setBooleanField(term11073, term11073.getClass(), "isBlock", true);
        setBooleanField(term11073, term11073.getClass(), "canContainBlock", true);
        setBooleanField(term11073, term11073.getClass(), "canContainInline", true);
        setBooleanField(term11073, term11073.getClass(), "optionalClosing", true);
        setBooleanField(term11073, term11073.getClass(), "empty", false);
        setBooleanField(term11073, term11073.getClass(), "selfClosing", true);
        setBooleanField(term11073, term11073.getClass(), "preserveWhitespace", false);
        setField(term11073, term11073.getClass(), "ancestors", term11094);
        setField(term11073, term11073.getClass(), "excludes", term11109);
        setField(term11073, term11073.getClass(), "ignoreEndTags", term11135);
        setBooleanField(term11073, term11073.getClass(), "directDescendant", false);
        setBooleanField(term11073, term11073.getClass(), "limitChildren", false);
        setField(term11054, term11054.getClass(), "tag", term11073);
        setField(term11054, term11054.getClass(), "classNames", term11152);
        setField(term11054, term11054.getClass(), "parentNode", null);
        setField(term11054, term11054.getClass(), "childNodes", term11165);
        setField(term11169, term11169.getClass(), "attributes", term11170);
        setField(term11054, term11054.getClass(), "attributes", term11169);
        setField(term11054, term11054.getClass(), "baseUri", "ZzIujlwVsw");
        setIntField(term11054, term11054.getClass(), "siblingIndex", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LWyEaeIyAo";
        callMethod(klass, "text", argTypes, term11054, args);
    }

};


