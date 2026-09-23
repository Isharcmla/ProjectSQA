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

public class Element_nextElementSibling_152739213633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3001;

    public Element_nextElementSibling_152739213633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3023 = new HashMap();
        Set<Object> term3082 =  ((Map) term3023).keySet();
        HashSet term3022 = new HashSet((Collection<? extends Object>) term3082);
        ArrayList term3043 = new ArrayList();
        ((ArrayList) term3043).add((Object)null);
        ((ArrayList) term3043).add((Object)null);
        ((ArrayList) term3043).add((Object)null);
        ((ArrayList) term3043).add((Object)null);
        ((ArrayList) term3043).add((Object)null);
        ((ArrayList) term3043).add((Object)null);
        ((ArrayList) term3043).add((Object)null);
        LinkedHashMap term3048 = new LinkedHashMap();
        term3001 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3002 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3047 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3002, term3002.getClass(), "tagName", "UDaboHZHhz");
        setBooleanField(term3002, term3002.getClass(), "isBlock", true);
        setBooleanField(term3002, term3002.getClass(), "formatAsBlock", true);
        setBooleanField(term3002, term3002.getClass(), "canContainBlock", false);
        setBooleanField(term3002, term3002.getClass(), "canContainInline", true);
        setBooleanField(term3002, term3002.getClass(), "empty", true);
        setBooleanField(term3002, term3002.getClass(), "selfClosing", true);
        setBooleanField(term3002, term3002.getClass(), "preserveWhitespace", true);
        setField(term3001, term3001.getClass(), "tag", term3002);
        setField(term3001, term3001.getClass(), "classNames", term3022);
        setField(term3001, term3001.getClass(), "parentNode", null);
        setField(term3001, term3001.getClass(), "childNodes", term3043);
        setField(term3047, term3047.getClass(), "attributes", term3048);
        setField(term3001, term3001.getClass(), "attributes", term3047);
        setField(term3001, term3001.getClass(), "baseUri", "TXyHhqeCjR");
        setIntField(term3001, term3001.getClass(), "siblingIndex", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextElementSibling", argTypes, term3001, args);
    }

};


