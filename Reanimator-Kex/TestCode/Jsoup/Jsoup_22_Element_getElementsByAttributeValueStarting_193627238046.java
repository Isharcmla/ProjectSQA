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

public class Element_getElementsByAttributeValueStarting_193627238046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4357;

    public Element_getElementsByAttributeValueStarting_193627238046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4379 = new HashMap();
        Set<Object> term4460 =  ((Map) term4379).keySet();
        HashSet term4378 = new HashSet((Collection<? extends Object>) term4460);
        ArrayList term4397 = new ArrayList();
        ((ArrayList) term4397).add((Object)null);
        ((ArrayList) term4397).add((Object)null);
        ((ArrayList) term4397).add((Object)null);
        ((ArrayList) term4397).add((Object)null);
        ((ArrayList) term4397).add((Object)null);
        ((ArrayList) term4397).add((Object)null);
        ((ArrayList) term4397).add((Object)null);
        LinkedHashMap term4402 = new LinkedHashMap();
        term4357 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4358 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4401 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4358, term4358.getClass(), "tagName", "QITgiBrmfj");
        setBooleanField(term4358, term4358.getClass(), "isBlock", true);
        setBooleanField(term4358, term4358.getClass(), "formatAsBlock", false);
        setBooleanField(term4358, term4358.getClass(), "canContainBlock", true);
        setBooleanField(term4358, term4358.getClass(), "canContainInline", true);
        setBooleanField(term4358, term4358.getClass(), "empty", false);
        setBooleanField(term4358, term4358.getClass(), "selfClosing", true);
        setBooleanField(term4358, term4358.getClass(), "preserveWhitespace", false);
        setField(term4357, term4357.getClass(), "tag", term4358);
        setField(term4357, term4357.getClass(), "classNames", term4378);
        setField(term4357, term4357.getClass(), "parentNode", null);
        setField(term4357, term4357.getClass(), "childNodes", term4397);
        setField(term4401, term4401.getClass(), "attributes", term4402);
        setField(term4357, term4357.getClass(), "attributes", term4401);
        setField(term4357, term4357.getClass(), "baseUri", "RjNoEywJbC");
        setIntField(term4357, term4357.getClass(), "siblingIndex", -1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "RTTvrwwhou";
        args[1] = "lRORwXipuk";
        callMethod(klass, "getElementsByAttributeValueStarting", argTypes, term4357, args);
    }

};


