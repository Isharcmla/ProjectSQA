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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_nodeName_117995585294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;
     Object term9391;

    public Element_nodeName_117995585294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term158 = new HashMap();
        Set<Object> term9413 =  ((Map) term158).keySet();
        HashSet term157 = new HashSet((Collection<? extends Object>) term9413);
        ArrayList term172 = new ArrayList();
        ((ArrayList) term172).add((Object)null);
        ((ArrayList) term172).add((Object)null);
        ((ArrayList) term172).add((Object)null);
        ((ArrayList) term172).add((Object)null);
        LinkedHashMap term177 = new LinkedHashMap();
        term134 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term135 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term176 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term135, term135.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term135, term135.getClass(), "isBlock", false);
        setBooleanField(term135, term135.getClass(), "formatAsBlock", false);
        setBooleanField(term135, term135.getClass(), "canContainBlock", true);
        setBooleanField(term135, term135.getClass(), "canContainInline", true);
        setBooleanField(term135, term135.getClass(), "empty", true);
        setBooleanField(term135, term135.getClass(), "selfClosing", true);
        setBooleanField(term135, term135.getClass(), "preserveWhitespace", true);
        setBooleanField(term135, term135.getClass(), "formList", false);
        setBooleanField(term135, term135.getClass(), "formSubmit", false);
        setField(term134, term134.getClass(), "tag", term135);
        setField(term134, term134.getClass(), "classNames", term157);
        setField(term134, term134.getClass(), "parentNode", null);
        setField(term134, term134.getClass(), "childNodes", term172);
        setField(term176, term176.getClass(), "attributes", term177);
        setField(term134, term134.getClass(), "attributes", term176);
        setField(term134, term134.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term134, term134.getClass(), "siblingIndex", 568599855);
        HashMap term9396 = new HashMap();
        Set<Object> term9434 =  ((Map) term9396).keySet();
        HashSet term9395 = new HashSet((Collection<? extends Object>) term9434);
        ArrayList term9397 = new ArrayList();
        ((ArrayList) term9397).add((Object)null);
        ((ArrayList) term9397).add((Object)null);
        ((ArrayList) term9397).add((Object)null);
        ((ArrayList) term9397).add((Object)null);
        LinkedHashMap term9400 = new LinkedHashMap();
        term9391 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9392 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9399 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9392, term9392.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term9392, term9392.getClass(), "isBlock", false);
        setBooleanField(term9392, term9392.getClass(), "formatAsBlock", false);
        setBooleanField(term9392, term9392.getClass(), "canContainBlock", true);
        setBooleanField(term9392, term9392.getClass(), "canContainInline", true);
        setBooleanField(term9392, term9392.getClass(), "empty", true);
        setBooleanField(term9392, term9392.getClass(), "selfClosing", true);
        setBooleanField(term9392, term9392.getClass(), "preserveWhitespace", true);
        setBooleanField(term9392, term9392.getClass(), "formList", false);
        setBooleanField(term9392, term9392.getClass(), "formSubmit", false);
        setField(term9391, term9391.getClass(), "tag", term9392);
        setField(term9391, term9391.getClass(), "classNames", term9395);
        setField(term9391, term9391.getClass(), "parentNode", null);
        setField(term9391, term9391.getClass(), "childNodes", term9397);
        setField(term9399, term9399.getClass(), "attributes", term9400);
        setField(term9391, term9391.getClass(), "attributes", term9399);
        setField(term9391, term9391.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term9391, term9391.getClass(), "siblingIndex", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term134, args);
        assertTrue(recursiveEquals(term134, term9391));
        assertTrue(recursiveEquals(retValue, "MjGYSRKTNF"));
    }

};


