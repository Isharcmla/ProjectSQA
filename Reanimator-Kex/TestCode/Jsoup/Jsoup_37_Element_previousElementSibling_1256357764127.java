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

public class Element_previousElementSibling_1256357764127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3163;
     Object term20133;

    public Element_previousElementSibling_1256357764127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3187 = new HashMap();
        Set<Object> term20155 =  ((Map) term3187).keySet();
        HashSet term3186 = new HashSet((Collection<? extends Object>) term20155);
        ArrayList term3192 = new ArrayList();
        ((ArrayList) term3192).add((Object)null);
        ((ArrayList) term3192).add((Object)null);
        ((ArrayList) term3192).add((Object)null);
        ((ArrayList) term3192).add((Object)null);
        ((ArrayList) term3192).add((Object)null);
        ((ArrayList) term3192).add((Object)null);
        LinkedHashMap term3197 = new LinkedHashMap();
        term3163 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3164 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3196 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3164, term3164.getClass(), "tagName", "xClUIcPECX");
        setBooleanField(term3164, term3164.getClass(), "isBlock", false);
        setBooleanField(term3164, term3164.getClass(), "formatAsBlock", true);
        setBooleanField(term3164, term3164.getClass(), "canContainBlock", false);
        setBooleanField(term3164, term3164.getClass(), "canContainInline", false);
        setBooleanField(term3164, term3164.getClass(), "empty", true);
        setBooleanField(term3164, term3164.getClass(), "selfClosing", false);
        setBooleanField(term3164, term3164.getClass(), "preserveWhitespace", true);
        setBooleanField(term3164, term3164.getClass(), "formList", true);
        setBooleanField(term3164, term3164.getClass(), "formSubmit", false);
        setField(term3163, term3163.getClass(), "tag", term3164);
        setField(term3163, term3163.getClass(), "classNames", term3186);
        setField(term3163, term3163.getClass(), "parentNode", null);
        setField(term3163, term3163.getClass(), "childNodes", term3192);
        setField(term3196, term3196.getClass(), "attributes", term3197);
        setField(term3163, term3163.getClass(), "attributes", term3196);
        setField(term3163, term3163.getClass(), "baseUri", "IHqvyhMtuM");
        setIntField(term3163, term3163.getClass(), "siblingIndex", -1087774327);
        HashMap term20138 = new HashMap();
        Set<Object> term20176 =  ((Map) term20138).keySet();
        HashSet term20137 = new HashSet((Collection<? extends Object>) term20176);
        ArrayList term20139 = new ArrayList();
        ((ArrayList) term20139).add((Object)null);
        ((ArrayList) term20139).add((Object)null);
        ((ArrayList) term20139).add((Object)null);
        ((ArrayList) term20139).add((Object)null);
        ((ArrayList) term20139).add((Object)null);
        ((ArrayList) term20139).add((Object)null);
        LinkedHashMap term20142 = new LinkedHashMap();
        term20133 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20134 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20141 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20134, term20134.getClass(), "tagName", "xClUIcPECX");
        setBooleanField(term20134, term20134.getClass(), "isBlock", false);
        setBooleanField(term20134, term20134.getClass(), "formatAsBlock", true);
        setBooleanField(term20134, term20134.getClass(), "canContainBlock", false);
        setBooleanField(term20134, term20134.getClass(), "canContainInline", false);
        setBooleanField(term20134, term20134.getClass(), "empty", true);
        setBooleanField(term20134, term20134.getClass(), "selfClosing", false);
        setBooleanField(term20134, term20134.getClass(), "preserveWhitespace", true);
        setBooleanField(term20134, term20134.getClass(), "formList", true);
        setBooleanField(term20134, term20134.getClass(), "formSubmit", false);
        setField(term20133, term20133.getClass(), "tag", term20134);
        setField(term20133, term20133.getClass(), "classNames", term20137);
        setField(term20133, term20133.getClass(), "parentNode", null);
        setField(term20133, term20133.getClass(), "childNodes", term20139);
        setField(term20141, term20141.getClass(), "attributes", term20142);
        setField(term20133, term20133.getClass(), "attributes", term20141);
        setField(term20133, term20133.getClass(), "baseUri", "IHqvyhMtuM");
        setIntField(term20133, term20133.getClass(), "siblingIndex", -1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "previousElementSibling", argTypes, term3163, args);
        assertTrue(recursiveEquals(term3163, term20133));
        assertTrue(recursiveEquals(retValue, null));
    }

};


