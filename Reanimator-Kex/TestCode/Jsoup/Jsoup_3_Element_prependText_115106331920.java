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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_prependText_115106331920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1995;

    public Element_prependText_115106331920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2015 = new ArrayList();
        HashMap term2020 = new HashMap();
        Set<Object> term2081 =  ((Map) term2020).keySet();
        HashSet term2019 = new HashSet((Collection<? extends Object>) term2081);
        ArrayList term2036 = new ArrayList();
        ((ArrayList) term2036).add((Object)null);
        ((ArrayList) term2036).add((Object)null);
        ((ArrayList) term2036).add((Object)null);
        ((ArrayList) term2036).add((Object)null);
        ((ArrayList) term2036).add((Object)null);
        ((ArrayList) term2036).add((Object)null);
        ((ArrayList) term2036).add((Object)null);
        ((ArrayList) term2036).add((Object)null);
        ((ArrayList) term2036).add((Object)null);
        LinkedHashMap term2041 = new LinkedHashMap();
        term1995 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1996 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2040 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1996, term1996.getClass(), "tagName", "NBrvVzvQHe");
        setBooleanField(term1996, term1996.getClass(), "isBlock", true);
        setBooleanField(term1996, term1996.getClass(), "canContainBlock", true);
        setBooleanField(term1996, term1996.getClass(), "canContainInline", true);
        setBooleanField(term1996, term1996.getClass(), "optionalClosing", false);
        setBooleanField(term1996, term1996.getClass(), "empty", true);
        setBooleanField(term1996, term1996.getClass(), "preserveWhitespace", false);
        setField(term1996, term1996.getClass(), "ancestors", term2015);
        setField(term1995, term1995.getClass(), "tag", term1996);
        setField(term1995, term1995.getClass(), "classNames", term2019);
        setField(term1995, term1995.getClass(), "parentNode", null);
        setField(term1995, term1995.getClass(), "childNodes", term2036);
        setField(term2040, term2040.getClass(), "attributes", term2041);
        setField(term1995, term1995.getClass(), "attributes", term2040);
        setField(term1995, term1995.getClass(), "baseUri", "zNdorvdUgu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oPxuZbkYio";
        callMethod(klass, "prependText", argTypes, term1995, args);
    }

};


