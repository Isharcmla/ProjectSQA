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

public class Element_text_1467986983115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5214;
     Object term5291;
     Object term50292;
     Object term50307;

    public Element_text_1467986983115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5236 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5236, term5236.getClass(), "tagName", null);
        setBooleanField(term5236, term5236.getClass(), "isBlock", true);
        setBooleanField(term5236, term5236.getClass(), "canContainBlock", true);
        setBooleanField(term5236, term5236.getClass(), "canContainInline", true);
        setBooleanField(term5236, term5236.getClass(), "optionalClosing", true);
        setBooleanField(term5236, term5236.getClass(), "empty", true);
        setBooleanField(term5236, term5236.getClass(), "preserveWhitespace", true);
        setField(term5236, term5236.getClass(), "ancestors", null);
        ArrayList term5234 = new ArrayList();
        ((ArrayList) term5234).add(term5236);
        HashMap term5246 = new HashMap();
        Set<Object> term50319 =  ((Map) term5246).keySet();
        HashSet term5245 = new HashSet((Collection<? extends Object>) term50319);
        ArrayList term5268 = new ArrayList();
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        LinkedHashMap term5273 = new LinkedHashMap();
        term5214 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5215 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5272 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5215, term5215.getClass(), "tagName", "xAWekqanqc");
        setBooleanField(term5215, term5215.getClass(), "isBlock", true);
        setBooleanField(term5215, term5215.getClass(), "canContainBlock", true);
        setBooleanField(term5215, term5215.getClass(), "canContainInline", false);
        setBooleanField(term5215, term5215.getClass(), "optionalClosing", false);
        setBooleanField(term5215, term5215.getClass(), "empty", true);
        setBooleanField(term5215, term5215.getClass(), "preserveWhitespace", false);
        setField(term5215, term5215.getClass(), "ancestors", term5234);
        setField(term5214, term5214.getClass(), "tag", term5215);
        setField(term5214, term5214.getClass(), "classNames", term5245);
        setField(term5214, term5214.getClass(), "parentNode", null);
        setField(term5214, term5214.getClass(), "childNodes", term5268);
        setField(term5272, term5272.getClass(), "attributes", term5273);
        setField(term5214, term5214.getClass(), "attributes", term5272);
        setField(term5214, term5214.getClass(), "baseUri", "QgHhxMyKvr");
        term5291 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5292 = (byte[]) newByteArray(16);
        setField(term5291, term5291.getClass(), "value", term5292);
        setByteField(term5291, term5291.getClass(), "coder", (byte) 47);
        setIntField(term5291, term5291.getClass(), "count", -1922583790);
        Object term50298 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50298, term50298.getClass(), "tagName", null);
        setBooleanField(term50298, term50298.getClass(), "isBlock", true);
        setBooleanField(term50298, term50298.getClass(), "canContainBlock", true);
        setBooleanField(term50298, term50298.getClass(), "canContainInline", true);
        setBooleanField(term50298, term50298.getClass(), "optionalClosing", true);
        setBooleanField(term50298, term50298.getClass(), "empty", true);
        setBooleanField(term50298, term50298.getClass(), "preserveWhitespace", true);
        setField(term50298, term50298.getClass(), "ancestors", null);
        ArrayList term50296 = new ArrayList();
        ((ArrayList) term50296).add(term50298);
        HashMap term50300 = new HashMap();
        Set<Object> term50356 =  ((Map) term50300).keySet();
        HashSet term50299 = new HashSet((Collection<? extends Object>) term50356);
        ArrayList term50301 = new ArrayList();
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        ((ArrayList) term50301).add((Object)null);
        LinkedHashMap term50304 = new LinkedHashMap();
        term50292 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term50293 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term50303 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term50293, term50293.getClass(), "tagName", "xAWekqanqc");
        setBooleanField(term50293, term50293.getClass(), "isBlock", true);
        setBooleanField(term50293, term50293.getClass(), "canContainBlock", true);
        setBooleanField(term50293, term50293.getClass(), "canContainInline", false);
        setBooleanField(term50293, term50293.getClass(), "optionalClosing", false);
        setBooleanField(term50293, term50293.getClass(), "empty", true);
        setBooleanField(term50293, term50293.getClass(), "preserveWhitespace", false);
        setField(term50293, term50293.getClass(), "ancestors", term50296);
        setField(term50292, term50292.getClass(), "tag", term50293);
        setField(term50292, term50292.getClass(), "classNames", term50299);
        setField(term50292, term50292.getClass(), "parentNode", null);
        setField(term50292, term50292.getClass(), "childNodes", term50301);
        setField(term50303, term50303.getClass(), "attributes", term50304);
        setField(term50292, term50292.getClass(), "attributes", term50303);
        setField(term50292, term50292.getClass(), "baseUri", "QgHhxMyKvr");
        term50307 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term50308 = (byte[]) newByteArray(16);
        setField(term50307, term50307.getClass(), "value", term50308);
        setByteField(term50307, term50307.getClass(), "coder", (byte) 47);
        setIntField(term50307, term50307.getClass(), "count", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term5291;
        callMethod(klass, "text", argTypes, term5214, args);
        assertTrue(recursiveEquals(term5214, term50292));
        assertTrue(recursiveEquals(term5291, term50307));
    }

};


