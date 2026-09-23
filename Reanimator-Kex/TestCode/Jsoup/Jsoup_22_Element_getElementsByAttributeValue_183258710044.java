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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeValue_183258710044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4085;

    public Element_getElementsByAttributeValue_183258710044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4107 = new HashMap();
        Set<Object> term4192 =  ((Map) term4107).keySet();
        HashSet term4106 = new HashSet((Collection<? extends Object>) term4192);
        ArrayList term4129 = new ArrayList();
        ((ArrayList) term4129).add((Object)null);
        ((ArrayList) term4129).add((Object)null);
        ((ArrayList) term4129).add((Object)null);
        ((ArrayList) term4129).add((Object)null);
        ((ArrayList) term4129).add((Object)null);
        ((ArrayList) term4129).add((Object)null);
        ((ArrayList) term4129).add((Object)null);
        LinkedHashMap term4134 = new LinkedHashMap();
        term4085 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4086 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4133 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4086, term4086.getClass(), "tagName", "tIpkeYIezR");
        setBooleanField(term4086, term4086.getClass(), "isBlock", false);
        setBooleanField(term4086, term4086.getClass(), "formatAsBlock", true);
        setBooleanField(term4086, term4086.getClass(), "canContainBlock", false);
        setBooleanField(term4086, term4086.getClass(), "canContainInline", false);
        setBooleanField(term4086, term4086.getClass(), "empty", true);
        setBooleanField(term4086, term4086.getClass(), "selfClosing", false);
        setBooleanField(term4086, term4086.getClass(), "preserveWhitespace", true);
        setField(term4085, term4085.getClass(), "tag", term4086);
        setField(term4085, term4085.getClass(), "classNames", term4106);
        setField(term4085, term4085.getClass(), "parentNode", null);
        setField(term4085, term4085.getClass(), "childNodes", term4129);
        setField(term4133, term4133.getClass(), "attributes", term4134);
        setField(term4085, term4085.getClass(), "attributes", term4133);
        setField(term4085, term4085.getClass(), "baseUri", "aSATgQUpoe");
        setIntField(term4085, term4085.getClass(), "siblingIndex", 1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "VkPSXewZfB";
        args[1] = "ubodzJoMGW";
        callMethod(klass, "getElementsByAttributeValue", argTypes, term4085, args);
    }

};


