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

public class Element_attr_298745360100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;
     Object term19091;
     Object term19035;

    public Element_attr_298745360100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term682 = new HashMap();
        Set<Object> term19121 =  ((Map) term682).keySet();
        HashSet term681 = new HashSet((Collection<? extends Object>) term19121);
        ArrayList term698 = new ArrayList();
        ((ArrayList) term698).add((Object)null);
        ((ArrayList) term698).add((Object)null);
        LinkedHashMap term703 = new LinkedHashMap();
        term660 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term661 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term702 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term661, term661.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term661, term661.getClass(), "isBlock", false);
        setBooleanField(term661, term661.getClass(), "formatAsBlock", true);
        setBooleanField(term661, term661.getClass(), "canContainBlock", false);
        setBooleanField(term661, term661.getClass(), "canContainInline", false);
        setBooleanField(term661, term661.getClass(), "empty", false);
        setBooleanField(term661, term661.getClass(), "selfClosing", false);
        setBooleanField(term661, term661.getClass(), "preserveWhitespace", true);
        setField(term660, term660.getClass(), "tag", term661);
        setField(term660, term660.getClass(), "classNames", term681);
        setField(term660, term660.getClass(), "parentNode", null);
        setField(term660, term660.getClass(), "childNodes", term698);
        setField(term702, term702.getClass(), "attributes", term703);
        setField(term660, term660.getClass(), "attributes", term702);
        setField(term660, term660.getClass(), "baseUri", "IgRJUzaCwW");
        setIntField(term660, term660.getClass(), "siblingIndex", -1955890973);
        HashMap term19096 = new HashMap();
        Set<Object> term19162 =  ((Map) term19096).keySet();
        HashSet term19095 = new HashSet((Collection<? extends Object>) term19162);
        ArrayList term19097 = new ArrayList();
        ((ArrayList) term19097).add((Object)null);
        ((ArrayList) term19097).add((Object)null);
        LinkedHashMap term19100 = new LinkedHashMap();
        term19091 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19092 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19099 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19092, term19092.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term19092, term19092.getClass(), "isBlock", false);
        setBooleanField(term19092, term19092.getClass(), "formatAsBlock", true);
        setBooleanField(term19092, term19092.getClass(), "canContainBlock", false);
        setBooleanField(term19092, term19092.getClass(), "canContainInline", false);
        setBooleanField(term19092, term19092.getClass(), "empty", false);
        setBooleanField(term19092, term19092.getClass(), "selfClosing", false);
        setBooleanField(term19092, term19092.getClass(), "preserveWhitespace", true);
        setField(term19091, term19091.getClass(), "tag", term19092);
        setField(term19091, term19091.getClass(), "classNames", term19095);
        setField(term19091, term19091.getClass(), "parentNode", null);
        setField(term19091, term19091.getClass(), "childNodes", term19097);
        setField(term19099, term19099.getClass(), "attributes", term19100);
        setField(term19091, term19091.getClass(), "attributes", term19099);
        setField(term19091, term19091.getClass(), "baseUri", "IgRJUzaCwW");
        setIntField(term19091, term19091.getClass(), "siblingIndex", -1955890973);
        HashMap term19057 = new HashMap();
        Set<Object> term19203 =  ((Map) term19057).keySet();
        HashSet term19056 = new HashSet((Collection<? extends Object>) term19203);
        ArrayList term19062 = new ArrayList();
        ((ArrayList) term19062).add((Object)null);
        ((ArrayList) term19062).add((Object)null);
        LinkedHashMap term19067 = new LinkedHashMap();
        term19035 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19036 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19066 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19036, term19036.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term19036, term19036.getClass(), "isBlock", false);
        setBooleanField(term19036, term19036.getClass(), "formatAsBlock", true);
        setBooleanField(term19036, term19036.getClass(), "canContainBlock", false);
        setBooleanField(term19036, term19036.getClass(), "canContainInline", false);
        setBooleanField(term19036, term19036.getClass(), "empty", false);
        setBooleanField(term19036, term19036.getClass(), "selfClosing", false);
        setBooleanField(term19036, term19036.getClass(), "preserveWhitespace", true);
        setField(term19035, term19035.getClass(), "tag", term19036);
        setField(term19035, term19035.getClass(), "classNames", term19056);
        setField(term19035, term19035.getClass(), "parentNode", null);
        setField(term19035, term19035.getClass(), "childNodes", term19062);
        setField(term19066, term19066.getClass(), "attributes", term19067);
        setField(term19035, term19035.getClass(), "attributes", term19066);
        setField(term19035, term19035.getClass(), "baseUri", "IgRJUzaCwW");
        setIntField(term19035, term19035.getClass(), "siblingIndex", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "JUmudUmaaV";
        args[1] = "KoyGrUJeJW";
        Object retValue = callMethod(klass, "attr", argTypes, term660, args);
        assertTrue(recursiveEquals(term660, term19091));
        assertTrue(recursiveEquals(retValue, term19035));
    }

};


