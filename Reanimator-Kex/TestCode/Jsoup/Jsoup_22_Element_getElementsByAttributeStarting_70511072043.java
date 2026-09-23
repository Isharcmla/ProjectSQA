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

public class Element_getElementsByAttributeStarting_70511072043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3986;

    public Element_getElementsByAttributeStarting_70511072043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4008 = new HashMap();
        Set<Object> term4064 =  ((Map) term4008).keySet();
        HashSet term4007 = new HashSet((Collection<? extends Object>) term4064);
        ArrayList term4013 = new ArrayList();
        ((ArrayList) term4013).add((Object)null);
        ((ArrayList) term4013).add((Object)null);
        ((ArrayList) term4013).add((Object)null);
        ((ArrayList) term4013).add((Object)null);
        ((ArrayList) term4013).add((Object)null);
        ((ArrayList) term4013).add((Object)null);
        ((ArrayList) term4013).add((Object)null);
        ((ArrayList) term4013).add((Object)null);
        LinkedHashMap term4018 = new LinkedHashMap();
        term3986 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3987 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4017 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3987, term3987.getClass(), "tagName", "MnovcqFhCl");
        setBooleanField(term3987, term3987.getClass(), "isBlock", true);
        setBooleanField(term3987, term3987.getClass(), "formatAsBlock", true);
        setBooleanField(term3987, term3987.getClass(), "canContainBlock", true);
        setBooleanField(term3987, term3987.getClass(), "canContainInline", true);
        setBooleanField(term3987, term3987.getClass(), "empty", true);
        setBooleanField(term3987, term3987.getClass(), "selfClosing", false);
        setBooleanField(term3987, term3987.getClass(), "preserveWhitespace", true);
        setField(term3986, term3986.getClass(), "tag", term3987);
        setField(term3986, term3986.getClass(), "classNames", term4007);
        setField(term3986, term3986.getClass(), "parentNode", null);
        setField(term3986, term3986.getClass(), "childNodes", term4013);
        setField(term4017, term4017.getClass(), "attributes", term4018);
        setField(term3986, term3986.getClass(), "attributes", term4017);
        setField(term3986, term3986.getClass(), "baseUri", "GGzwMoHZXC");
        setIntField(term3986, term3986.getClass(), "siblingIndex", -157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IpmgwHTgnG";
        callMethod(klass, "getElementsByAttributeStarting", argTypes, term3986, args);
    }

};


