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

public class Document_quirksMode_53150430336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5011;
     Object term17869;
     Object enum46;

    public Document_quirksMode_53150430336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17886 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term17885 = ((Class) term17886).getDeclaredField((String) "quirks");
        ((Field) term17885).setAccessible(true);
        Object enum44 = ((Field) term17885).get((Object) null);
        HashMap term5046 = new HashMap();
        Set<Object> term18101 =  ((Map) term5046).keySet();
        HashSet term5045 = new HashSet((Collection<? extends Object>) term18101);
        ArrayList term5058 = new ArrayList();
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        LinkedHashMap term5063 = new LinkedHashMap();
        term5011 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term5012 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term5025 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5062 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5012, term5012.getClass(), "escapeMode", null);
        setField(term5012, term5012.getClass(), "charset", null);
        setField(term5012, term5012.getClass(), "charsetEncoder", null);
        setBooleanField(term5012, term5012.getClass(), "prettyPrint", true);
        setIntField(term5012, term5012.getClass(), "indentAmount", -226514366);
        setField(term5011, term5011.getClass(), "outputSettings", term5012);
        setField(term5011, term5011.getClass(), "quirksMode", enum44);
        setField(term5025, term5025.getClass(), "tagName", "OYbzXylRWW");
        setBooleanField(term5025, term5025.getClass(), "isBlock", false);
        setBooleanField(term5025, term5025.getClass(), "formatAsBlock", false);
        setBooleanField(term5025, term5025.getClass(), "canContainBlock", true);
        setBooleanField(term5025, term5025.getClass(), "canContainInline", true);
        setBooleanField(term5025, term5025.getClass(), "empty", true);
        setBooleanField(term5025, term5025.getClass(), "selfClosing", false);
        setBooleanField(term5025, term5025.getClass(), "preserveWhitespace", true);
        setField(term5011, term5011.getClass(), "tag", term5025);
        setField(term5011, term5011.getClass(), "classNames", term5045);
        setField(term5011, term5011.getClass(), "parentNode", null);
        setField(term5011, term5011.getClass(), "childNodes", term5058);
        setField(term5062, term5062.getClass(), "attributes", term5063);
        setField(term5011, term5011.getClass(), "attributes", term5062);
        setField(term5011, term5011.getClass(), "baseUri", "cudZvLMQon");
        setIntField(term5011, term5011.getClass(), "siblingIndex", 1193880199);
        Class<? extends Object> term18173 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term18172 = ((Class) term18173).getDeclaredField((String) "quirks");
        ((Field) term18172).setAccessible(true);
        Object enum45 = ((Field) term18172).get((Object) null);
        HashMap term17878 = new HashMap();
        Set<Object> term18382 =  ((Map) term17878).keySet();
        HashSet term17877 = new HashSet((Collection<? extends Object>) term18382);
        ArrayList term17879 = new ArrayList();
        ((ArrayList) term17879).add((Object)null);
        ((ArrayList) term17879).add((Object)null);
        ((ArrayList) term17879).add((Object)null);
        ((ArrayList) term17879).add((Object)null);
        ((ArrayList) term17879).add((Object)null);
        LinkedHashMap term17882 = new LinkedHashMap();
        term17869 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term17870 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term17874 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17881 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17870, term17870.getClass(), "escapeMode", null);
        setField(term17870, term17870.getClass(), "charset", null);
        setField(term17870, term17870.getClass(), "charsetEncoder", null);
        setBooleanField(term17870, term17870.getClass(), "prettyPrint", true);
        setIntField(term17870, term17870.getClass(), "indentAmount", -226514366);
        setField(term17869, term17869.getClass(), "outputSettings", term17870);
        setField(term17869, term17869.getClass(), "quirksMode", enum45);
        setField(term17874, term17874.getClass(), "tagName", "OYbzXylRWW");
        setBooleanField(term17874, term17874.getClass(), "isBlock", false);
        setBooleanField(term17874, term17874.getClass(), "formatAsBlock", false);
        setBooleanField(term17874, term17874.getClass(), "canContainBlock", true);
        setBooleanField(term17874, term17874.getClass(), "canContainInline", true);
        setBooleanField(term17874, term17874.getClass(), "empty", true);
        setBooleanField(term17874, term17874.getClass(), "selfClosing", false);
        setBooleanField(term17874, term17874.getClass(), "preserveWhitespace", true);
        setField(term17869, term17869.getClass(), "tag", term17874);
        setField(term17869, term17869.getClass(), "classNames", term17877);
        setField(term17869, term17869.getClass(), "parentNode", null);
        setField(term17869, term17869.getClass(), "childNodes", term17879);
        setField(term17881, term17881.getClass(), "attributes", term17882);
        setField(term17869, term17869.getClass(), "attributes", term17881);
        setField(term17869, term17869.getClass(), "baseUri", "cudZvLMQon");
        setIntField(term17869, term17869.getClass(), "siblingIndex", 1193880199);
        Class<? extends Object> term18394 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term18393 = ((Class) term18394).getDeclaredField((String) "quirks");
        ((Field) term18393).setAccessible(true);
        enum46 = ((Field) term18393).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "quirksMode", argTypes, term5011, args);
        assertTrue(recursiveEquals(term5011, term17869));
        assertTrue(recursiveEquals(retValue, enum46));
    }

};


