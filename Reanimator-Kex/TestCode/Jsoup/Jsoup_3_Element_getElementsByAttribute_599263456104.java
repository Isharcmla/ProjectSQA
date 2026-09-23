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

public class Element_getElementsByAttribute_599263456104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3759;
     Object term47095;
     Object term47090;

    public Element_getElementsByAttribute_599263456104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3779 = new ArrayList();
        HashMap term3784 = new HashMap();
        Set<Object> term47121 =  ((Map) term3784).keySet();
        HashSet term3783 = new HashSet((Collection<? extends Object>) term47121);
        ArrayList term3804 = new ArrayList();
        ((ArrayList) term3804).add((Object)null);
        ((ArrayList) term3804).add((Object)null);
        ((ArrayList) term3804).add((Object)null);
        ((ArrayList) term3804).add((Object)null);
        ((ArrayList) term3804).add((Object)null);
        ((ArrayList) term3804).add((Object)null);
        LinkedHashMap term3809 = new LinkedHashMap();
        term3759 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3760 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3808 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3760, term3760.getClass(), "tagName", "FiYYLuailz");
        setBooleanField(term3760, term3760.getClass(), "isBlock", true);
        setBooleanField(term3760, term3760.getClass(), "canContainBlock", false);
        setBooleanField(term3760, term3760.getClass(), "canContainInline", false);
        setBooleanField(term3760, term3760.getClass(), "optionalClosing", true);
        setBooleanField(term3760, term3760.getClass(), "empty", false);
        setBooleanField(term3760, term3760.getClass(), "preserveWhitespace", true);
        setField(term3760, term3760.getClass(), "ancestors", term3779);
        setField(term3759, term3759.getClass(), "tag", term3760);
        setField(term3759, term3759.getClass(), "classNames", term3783);
        setField(term3759, term3759.getClass(), "parentNode", null);
        setField(term3759, term3759.getClass(), "childNodes", term3804);
        setField(term3808, term3808.getClass(), "attributes", term3809);
        setField(term3759, term3759.getClass(), "attributes", term3808);
        setField(term3759, term3759.getClass(), "baseUri", "DAujxZPHJC");
        ArrayList term47099 = new ArrayList();
        HashMap term47102 = new HashMap();
        Set<Object> term47152 =  ((Map) term47102).keySet();
        HashSet term47101 = new HashSet((Collection<? extends Object>) term47152);
        ArrayList term47103 = new ArrayList();
        ((ArrayList) term47103).add((Object)null);
        ((ArrayList) term47103).add((Object)null);
        ((ArrayList) term47103).add((Object)null);
        ((ArrayList) term47103).add((Object)null);
        ((ArrayList) term47103).add((Object)null);
        ((ArrayList) term47103).add((Object)null);
        LinkedHashMap term47106 = new LinkedHashMap();
        term47095 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term47096 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term47105 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term47096, term47096.getClass(), "tagName", "FiYYLuailz");
        setBooleanField(term47096, term47096.getClass(), "isBlock", true);
        setBooleanField(term47096, term47096.getClass(), "canContainBlock", false);
        setBooleanField(term47096, term47096.getClass(), "canContainInline", false);
        setBooleanField(term47096, term47096.getClass(), "optionalClosing", true);
        setBooleanField(term47096, term47096.getClass(), "empty", false);
        setBooleanField(term47096, term47096.getClass(), "preserveWhitespace", true);
        setField(term47096, term47096.getClass(), "ancestors", term47099);
        setField(term47095, term47095.getClass(), "tag", term47096);
        setField(term47095, term47095.getClass(), "classNames", term47101);
        setField(term47095, term47095.getClass(), "parentNode", null);
        setField(term47095, term47095.getClass(), "childNodes", term47103);
        setField(term47105, term47105.getClass(), "attributes", term47106);
        setField(term47095, term47095.getClass(), "attributes", term47105);
        setField(term47095, term47095.getClass(), "baseUri", "DAujxZPHJC");
        ArrayList term47091 = new ArrayList();
        term47090 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term47090, term47090.getClass(), "contents", term47091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IlBhdrCvHq";
        Object retValue = callMethod(klass, "getElementsByAttribute", argTypes, term3759, args);
        assertTrue(recursiveEquals(term3759, term47095));
        assertTrue(recursiveEquals(retValue, term47090));
    }

};


