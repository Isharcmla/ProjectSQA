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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Document_title_195224324217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255;
     Object term3215;

    public Document_title_195224324217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term277 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term277, term277.getClass(), "tagName", null);
        setBooleanField(term277, term277.getClass(), "isBlock", false);
        setBooleanField(term277, term277.getClass(), "canContainBlock", false);
        setBooleanField(term277, term277.getClass(), "canContainInline", false);
        setBooleanField(term277, term277.getClass(), "optionalClosing", false);
        setBooleanField(term277, term277.getClass(), "empty", false);
        setBooleanField(term277, term277.getClass(), "preserveWhitespace", false);
        setField(term277, term277.getClass(), "ancestors", null);
        Object term284 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term284, term284.getClass(), "tagName", null);
        setBooleanField(term284, term284.getClass(), "isBlock", false);
        setBooleanField(term284, term284.getClass(), "canContainBlock", true);
        setBooleanField(term284, term284.getClass(), "canContainInline", false);
        setBooleanField(term284, term284.getClass(), "optionalClosing", false);
        setBooleanField(term284, term284.getClass(), "empty", false);
        setBooleanField(term284, term284.getClass(), "preserveWhitespace", true);
        setField(term284, term284.getClass(), "ancestors", null);
        ArrayList term275 = new ArrayList();
        ((ArrayList) term275).add(term277);
        ((ArrayList) term275).add(term284);
        ((ArrayList) term275).add(term284);
        HashMap term294 = new HashMap();
        Set<Object> term3241 =  ((Map) term294).keySet();
        HashSet term293 = new HashSet((Collection<? extends Object>) term3241);
        ArrayList term304 = new ArrayList();
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        LinkedHashMap term309 = new LinkedHashMap();
        term255 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term256 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term308 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term256, term256.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term256, term256.getClass(), "isBlock", false);
        setBooleanField(term256, term256.getClass(), "canContainBlock", false);
        setBooleanField(term256, term256.getClass(), "canContainInline", true);
        setBooleanField(term256, term256.getClass(), "optionalClosing", true);
        setBooleanField(term256, term256.getClass(), "empty", false);
        setBooleanField(term256, term256.getClass(), "preserveWhitespace", false);
        setField(term256, term256.getClass(), "ancestors", term275);
        setField(term255, term255.getClass(), "tag", term256);
        setField(term255, term255.getClass(), "classNames", term293);
        setField(term255, term255.getClass(), "parentNode", null);
        setField(term255, term255.getClass(), "childNodes", term304);
        setField(term308, term308.getClass(), "attributes", term309);
        setField(term255, term255.getClass(), "attributes", term308);
        setField(term255, term255.getClass(), "baseUri", "xrwlQZdwCp");
        Object term3221 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3221, term3221.getClass(), "tagName", null);
        setBooleanField(term3221, term3221.getClass(), "isBlock", false);
        setBooleanField(term3221, term3221.getClass(), "canContainBlock", false);
        setBooleanField(term3221, term3221.getClass(), "canContainInline", false);
        setBooleanField(term3221, term3221.getClass(), "optionalClosing", false);
        setBooleanField(term3221, term3221.getClass(), "empty", false);
        setBooleanField(term3221, term3221.getClass(), "preserveWhitespace", false);
        setField(term3221, term3221.getClass(), "ancestors", null);
        Object term3222 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3222, term3222.getClass(), "tagName", null);
        setBooleanField(term3222, term3222.getClass(), "isBlock", false);
        setBooleanField(term3222, term3222.getClass(), "canContainBlock", true);
        setBooleanField(term3222, term3222.getClass(), "canContainInline", false);
        setBooleanField(term3222, term3222.getClass(), "optionalClosing", false);
        setBooleanField(term3222, term3222.getClass(), "empty", false);
        setBooleanField(term3222, term3222.getClass(), "preserveWhitespace", true);
        setField(term3222, term3222.getClass(), "ancestors", null);
        ArrayList term3219 = new ArrayList();
        ((ArrayList) term3219).add(term3221);
        ((ArrayList) term3219).add(term3222);
        ((ArrayList) term3219).add(term3222);
        HashMap term3224 = new HashMap();
        Set<Object> term3262 =  ((Map) term3224).keySet();
        HashSet term3223 = new HashSet((Collection<? extends Object>) term3262);
        ArrayList term3225 = new ArrayList();
        ((ArrayList) term3225).add((Object)null);
        ((ArrayList) term3225).add((Object)null);
        ((ArrayList) term3225).add((Object)null);
        ((ArrayList) term3225).add((Object)null);
        ((ArrayList) term3225).add((Object)null);
        LinkedHashMap term3228 = new LinkedHashMap();
        term3215 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term3216 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3227 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3216, term3216.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term3216, term3216.getClass(), "isBlock", false);
        setBooleanField(term3216, term3216.getClass(), "canContainBlock", false);
        setBooleanField(term3216, term3216.getClass(), "canContainInline", true);
        setBooleanField(term3216, term3216.getClass(), "optionalClosing", true);
        setBooleanField(term3216, term3216.getClass(), "empty", false);
        setBooleanField(term3216, term3216.getClass(), "preserveWhitespace", false);
        setField(term3216, term3216.getClass(), "ancestors", term3219);
        setField(term3215, term3215.getClass(), "tag", term3216);
        setField(term3215, term3215.getClass(), "classNames", term3223);
        setField(term3215, term3215.getClass(), "parentNode", null);
        setField(term3215, term3215.getClass(), "childNodes", term3225);
        setField(term3227, term3227.getClass(), "attributes", term3228);
        setField(term3215, term3215.getClass(), "attributes", term3227);
        setField(term3215, term3215.getClass(), "baseUri", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "title", argTypes, term255, args);
        assertTrue(recursiveEquals(term255, term3215));
        assertTrue(recursiveEquals(retValue, ""));
    }

};
