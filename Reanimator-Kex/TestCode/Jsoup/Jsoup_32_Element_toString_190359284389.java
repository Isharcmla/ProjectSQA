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

public class Element_toString_190359284389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8795;

    public Element_toString_190359284389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8817 = new HashMap();
        Set<Object> term8876 =  ((Map) term8817).keySet();
        HashSet term8816 = new HashSet((Collection<? extends Object>) term8876);
        ArrayList term8837 = new ArrayList();
        ((ArrayList) term8837).add((Object)null);
        ((ArrayList) term8837).add((Object)null);
        ((ArrayList) term8837).add((Object)null);
        ((ArrayList) term8837).add((Object)null);
        ((ArrayList) term8837).add((Object)null);
        LinkedHashMap term8842 = new LinkedHashMap();
        term8795 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8796 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8841 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8796, term8796.getClass(), "tagName", "CURQCMkqbZ");
        setBooleanField(term8796, term8796.getClass(), "isBlock", true);
        setBooleanField(term8796, term8796.getClass(), "formatAsBlock", true);
        setBooleanField(term8796, term8796.getClass(), "canContainBlock", true);
        setBooleanField(term8796, term8796.getClass(), "canContainInline", true);
        setBooleanField(term8796, term8796.getClass(), "empty", false);
        setBooleanField(term8796, term8796.getClass(), "selfClosing", true);
        setBooleanField(term8796, term8796.getClass(), "preserveWhitespace", false);
        setField(term8795, term8795.getClass(), "tag", term8796);
        setField(term8795, term8795.getClass(), "classNames", term8816);
        setField(term8795, term8795.getClass(), "parentNode", null);
        setField(term8795, term8795.getClass(), "childNodes", term8837);
        setField(term8841, term8841.getClass(), "attributes", term8842);
        setField(term8795, term8795.getClass(), "attributes", term8841);
        setField(term8795, term8795.getClass(), "baseUri", "kTbFMpVWqx");
        setIntField(term8795, term8795.getClass(), "siblingIndex", 729658803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8795, args);
    }

};


