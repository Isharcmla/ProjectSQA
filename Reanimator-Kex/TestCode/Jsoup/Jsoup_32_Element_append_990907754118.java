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
import java.lang.ExceptionInInitializerError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_append_990907754118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2116;

    public Element_append_990907754118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2138 = new HashMap();
        Set<Object> term16948 =  ((Map) term2138).keySet();
        HashSet term2137 = new HashSet((Collection<? extends Object>) term16948);
        ArrayList term2152 = new ArrayList();
        ((ArrayList) term2152).add((Object)null);
        ((ArrayList) term2152).add((Object)null);
        ((ArrayList) term2152).add((Object)null);
        ((ArrayList) term2152).add((Object)null);
        ((ArrayList) term2152).add((Object)null);
        ((ArrayList) term2152).add((Object)null);
        ((ArrayList) term2152).add((Object)null);
        ((ArrayList) term2152).add((Object)null);
        LinkedHashMap term2157 = new LinkedHashMap();
        term2116 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2117 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2156 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2117, term2117.getClass(), "tagName", "HBGNxdNURv");
        setBooleanField(term2117, term2117.getClass(), "isBlock", true);
        setBooleanField(term2117, term2117.getClass(), "formatAsBlock", true);
        setBooleanField(term2117, term2117.getClass(), "canContainBlock", true);
        setBooleanField(term2117, term2117.getClass(), "canContainInline", false);
        setBooleanField(term2117, term2117.getClass(), "empty", true);
        setBooleanField(term2117, term2117.getClass(), "selfClosing", false);
        setBooleanField(term2117, term2117.getClass(), "preserveWhitespace", true);
        setField(term2116, term2116.getClass(), "tag", term2117);
        setField(term2116, term2116.getClass(), "classNames", term2137);
        setField(term2116, term2116.getClass(), "parentNode", null);
        setField(term2116, term2116.getClass(), "childNodes", term2152);
        setField(term2156, term2156.getClass(), "attributes", term2157);
        setField(term2116, term2116.getClass(), "attributes", term2156);
        setField(term2116, term2116.getClass(), "baseUri", "WBAOTqErtm");
        setIntField(term2116, term2116.getClass(), "siblingIndex", 1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PqtVXXZMqK";
        try {
            callMethod(klass, "append", argTypes, term2116, args);
            assertTrue(false);
        }
        catch (ExceptionInInitializerError e) {
        }

    }

};


