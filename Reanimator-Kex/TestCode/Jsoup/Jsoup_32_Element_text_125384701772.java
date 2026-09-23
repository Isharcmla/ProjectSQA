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

public class Element_text_125384701772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7078;

    public Element_text_125384701772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7100 = new HashMap();
        Set<Object> term7159 =  ((Map) term7100).keySet();
        HashSet term7099 = new HashSet((Collection<? extends Object>) term7159);
        ArrayList term7108 = new ArrayList();
        ((ArrayList) term7108).add((Object)null);
        LinkedHashMap term7113 = new LinkedHashMap();
        term7078 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7079 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7112 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7079, term7079.getClass(), "tagName", "ZEXFoMSKeG");
        setBooleanField(term7079, term7079.getClass(), "isBlock", true);
        setBooleanField(term7079, term7079.getClass(), "formatAsBlock", false);
        setBooleanField(term7079, term7079.getClass(), "canContainBlock", true);
        setBooleanField(term7079, term7079.getClass(), "canContainInline", false);
        setBooleanField(term7079, term7079.getClass(), "empty", false);
        setBooleanField(term7079, term7079.getClass(), "selfClosing", true);
        setBooleanField(term7079, term7079.getClass(), "preserveWhitespace", false);
        setField(term7078, term7078.getClass(), "tag", term7079);
        setField(term7078, term7078.getClass(), "classNames", term7099);
        setField(term7078, term7078.getClass(), "parentNode", null);
        setField(term7078, term7078.getClass(), "childNodes", term7108);
        setField(term7112, term7112.getClass(), "attributes", term7113);
        setField(term7078, term7078.getClass(), "attributes", term7112);
        setField(term7078, term7078.getClass(), "baseUri", "pqFUMTCKJd");
        setIntField(term7078, term7078.getClass(), "siblingIndex", -461771056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PTEndmPMzk";
        callMethod(klass, "text", argTypes, term7078, args);
    }

};


