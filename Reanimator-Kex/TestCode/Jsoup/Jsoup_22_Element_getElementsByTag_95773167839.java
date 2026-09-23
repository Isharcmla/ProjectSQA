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

public class Element_getElementsByTag_95773167839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3562;

    public Element_getElementsByTag_95773167839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3584 = new HashMap();
        Set<Object> term3653 =  ((Map) term3584).keySet();
        HashSet term3583 = new HashSet((Collection<? extends Object>) term3653);
        ArrayList term3602 = new ArrayList();
        ((ArrayList) term3602).add((Object)null);
        ((ArrayList) term3602).add((Object)null);
        ((ArrayList) term3602).add((Object)null);
        ((ArrayList) term3602).add((Object)null);
        ((ArrayList) term3602).add((Object)null);
        ((ArrayList) term3602).add((Object)null);
        ((ArrayList) term3602).add((Object)null);
        ((ArrayList) term3602).add((Object)null);
        LinkedHashMap term3607 = new LinkedHashMap();
        term3562 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3563 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3606 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3563, term3563.getClass(), "tagName", "KarbTXFmUU");
        setBooleanField(term3563, term3563.getClass(), "isBlock", true);
        setBooleanField(term3563, term3563.getClass(), "formatAsBlock", true);
        setBooleanField(term3563, term3563.getClass(), "canContainBlock", false);
        setBooleanField(term3563, term3563.getClass(), "canContainInline", true);
        setBooleanField(term3563, term3563.getClass(), "empty", true);
        setBooleanField(term3563, term3563.getClass(), "selfClosing", true);
        setBooleanField(term3563, term3563.getClass(), "preserveWhitespace", true);
        setField(term3562, term3562.getClass(), "tag", term3563);
        setField(term3562, term3562.getClass(), "classNames", term3583);
        setField(term3562, term3562.getClass(), "parentNode", null);
        setField(term3562, term3562.getClass(), "childNodes", term3602);
        setField(term3606, term3606.getClass(), "attributes", term3607);
        setField(term3562, term3562.getClass(), "attributes", term3606);
        setField(term3562, term3562.getClass(), "baseUri", "OUeBWNTQDh");
        setIntField(term3562, term3562.getClass(), "siblingIndex", 679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gltJarNuUk";
        callMethod(klass, "getElementsByTag", argTypes, term3562, args);
    }

};


