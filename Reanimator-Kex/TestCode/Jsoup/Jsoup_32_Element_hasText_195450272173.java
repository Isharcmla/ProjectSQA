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

public class Element_hasText_195450272173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7180;

    public Element_hasText_195450272173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7202 = new HashMap();
        Set<Object> term7259 =  ((Map) term7202).keySet();
        HashSet term7201 = new HashSet((Collection<? extends Object>) term7259);
        ArrayList term7220 = new ArrayList();
        ((ArrayList) term7220).add((Object)null);
        ((ArrayList) term7220).add((Object)null);
        ((ArrayList) term7220).add((Object)null);
        ((ArrayList) term7220).add((Object)null);
        ((ArrayList) term7220).add((Object)null);
        ((ArrayList) term7220).add((Object)null);
        ((ArrayList) term7220).add((Object)null);
        ((ArrayList) term7220).add((Object)null);
        LinkedHashMap term7225 = new LinkedHashMap();
        term7180 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7181 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7224 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7181, term7181.getClass(), "tagName", "aJQuCOCvZs");
        setBooleanField(term7181, term7181.getClass(), "isBlock", false);
        setBooleanField(term7181, term7181.getClass(), "formatAsBlock", true);
        setBooleanField(term7181, term7181.getClass(), "canContainBlock", false);
        setBooleanField(term7181, term7181.getClass(), "canContainInline", true);
        setBooleanField(term7181, term7181.getClass(), "empty", false);
        setBooleanField(term7181, term7181.getClass(), "selfClosing", false);
        setBooleanField(term7181, term7181.getClass(), "preserveWhitespace", true);
        setField(term7180, term7180.getClass(), "tag", term7181);
        setField(term7180, term7180.getClass(), "classNames", term7201);
        setField(term7180, term7180.getClass(), "parentNode", null);
        setField(term7180, term7180.getClass(), "childNodes", term7220);
        setField(term7224, term7224.getClass(), "attributes", term7225);
        setField(term7180, term7180.getClass(), "attributes", term7224);
        setField(term7180, term7180.getClass(), "baseUri", "FrTZLybkKk");
        setIntField(term7180, term7180.getClass(), "siblingIndex", -243422082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasText", argTypes, term7180, args);
    }

};


