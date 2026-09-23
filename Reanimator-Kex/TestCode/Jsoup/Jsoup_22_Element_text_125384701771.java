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

public class Element_text_125384701771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7130;

    public Element_text_125384701771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7152 = new HashMap();
        Set<Object> term7211 =  ((Map) term7152).keySet();
        HashSet term7151 = new HashSet((Collection<? extends Object>) term7211);
        ArrayList term7160 = new ArrayList();
        ((ArrayList) term7160).add((Object)null);
        LinkedHashMap term7165 = new LinkedHashMap();
        term7130 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7131 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7164 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7131, term7131.getClass(), "tagName", "ZEXFoMSKeG");
        setBooleanField(term7131, term7131.getClass(), "isBlock", true);
        setBooleanField(term7131, term7131.getClass(), "formatAsBlock", false);
        setBooleanField(term7131, term7131.getClass(), "canContainBlock", true);
        setBooleanField(term7131, term7131.getClass(), "canContainInline", false);
        setBooleanField(term7131, term7131.getClass(), "empty", false);
        setBooleanField(term7131, term7131.getClass(), "selfClosing", true);
        setBooleanField(term7131, term7131.getClass(), "preserveWhitespace", false);
        setField(term7130, term7130.getClass(), "tag", term7131);
        setField(term7130, term7130.getClass(), "classNames", term7151);
        setField(term7130, term7130.getClass(), "parentNode", null);
        setField(term7130, term7130.getClass(), "childNodes", term7160);
        setField(term7164, term7164.getClass(), "attributes", term7165);
        setField(term7130, term7130.getClass(), "attributes", term7164);
        setField(term7130, term7130.getClass(), "baseUri", "pqFUMTCKJd");
        setIntField(term7130, term7130.getClass(), "siblingIndex", 229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PTEndmPMzk";
        callMethod(klass, "text", argTypes, term7130, args);
    }

};


