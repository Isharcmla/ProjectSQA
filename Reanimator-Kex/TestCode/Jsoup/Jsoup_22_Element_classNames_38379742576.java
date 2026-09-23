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

public class Element_classNames_38379742576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7565;
     Object term7638;

    public Element_classNames_38379742576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7587 = new HashMap();
        Set<Object> term7654 =  ((Map) term7587).keySet();
        HashSet term7586 = new HashSet((Collection<? extends Object>) term7654);
        ArrayList term7609 = new ArrayList();
        ((ArrayList) term7609).add((Object)null);
        ((ArrayList) term7609).add((Object)null);
        ((ArrayList) term7609).add((Object)null);
        ((ArrayList) term7609).add((Object)null);
        ((ArrayList) term7609).add((Object)null);
        ((ArrayList) term7609).add((Object)null);
        LinkedHashMap term7614 = new LinkedHashMap();
        term7565 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7566 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7613 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7566, term7566.getClass(), "tagName", "mrMGwoRgVY");
        setBooleanField(term7566, term7566.getClass(), "isBlock", true);
        setBooleanField(term7566, term7566.getClass(), "formatAsBlock", false);
        setBooleanField(term7566, term7566.getClass(), "canContainBlock", false);
        setBooleanField(term7566, term7566.getClass(), "canContainInline", false);
        setBooleanField(term7566, term7566.getClass(), "empty", false);
        setBooleanField(term7566, term7566.getClass(), "selfClosing", true);
        setBooleanField(term7566, term7566.getClass(), "preserveWhitespace", false);
        setField(term7565, term7565.getClass(), "tag", term7566);
        setField(term7565, term7565.getClass(), "classNames", term7586);
        setField(term7565, term7565.getClass(), "parentNode", null);
        setField(term7565, term7565.getClass(), "childNodes", term7609);
        setField(term7613, term7613.getClass(), "attributes", term7614);
        setField(term7565, term7565.getClass(), "attributes", term7613);
        setField(term7565, term7565.getClass(), "baseUri", "ubaBUfLolu");
        setIntField(term7565, term7565.getClass(), "siblingIndex", -2014576105);
        HashMap term7639 = new HashMap();
        Set<Object> term7665 =  ((Map) term7639).keySet();
        term7638 = new HashSet((Collection<? extends Object>) term7665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term7638;
        callMethod(klass, "classNames", argTypes, term7565, args);
    }

};


