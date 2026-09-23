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

public class Element_text_146798698366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6359;
     Object term6426;

    public Element_text_146798698366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6381 = new HashMap();
        Set<Object> term6456 =  ((Map) term6381).keySet();
        HashSet term6380 = new HashSet((Collection<? extends Object>) term6456);
        ArrayList term6397 = new ArrayList();
        ((ArrayList) term6397).add((Object)null);
        ((ArrayList) term6397).add((Object)null);
        ((ArrayList) term6397).add((Object)null);
        LinkedHashMap term6402 = new LinkedHashMap();
        term6359 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6360 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6401 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6360, term6360.getClass(), "tagName", "PtIjKpiSix");
        setBooleanField(term6360, term6360.getClass(), "isBlock", false);
        setBooleanField(term6360, term6360.getClass(), "formatAsBlock", false);
        setBooleanField(term6360, term6360.getClass(), "canContainBlock", true);
        setBooleanField(term6360, term6360.getClass(), "canContainInline", false);
        setBooleanField(term6360, term6360.getClass(), "empty", false);
        setBooleanField(term6360, term6360.getClass(), "selfClosing", true);
        setBooleanField(term6360, term6360.getClass(), "preserveWhitespace", true);
        setField(term6359, term6359.getClass(), "tag", term6360);
        setField(term6359, term6359.getClass(), "classNames", term6380);
        setField(term6359, term6359.getClass(), "parentNode", null);
        setField(term6359, term6359.getClass(), "childNodes", term6397);
        setField(term6401, term6401.getClass(), "attributes", term6402);
        setField(term6359, term6359.getClass(), "attributes", term6401);
        setField(term6359, term6359.getClass(), "baseUri", "zyZTzHNjQr");
        setIntField(term6359, term6359.getClass(), "siblingIndex", -1498296052);
        term6426 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6427 = (byte[]) newByteArray(16);
        setField(term6426, term6426.getClass(), "value", term6427);
        setByteField(term6426, term6426.getClass(), "coder", (byte) 47);
        setIntField(term6426, term6426.getClass(), "count", 2098647989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term6426;
        callMethod(klass, "text", argTypes, term6359, args);
    }

};


