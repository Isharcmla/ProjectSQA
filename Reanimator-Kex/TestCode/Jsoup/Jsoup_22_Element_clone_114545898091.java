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

public class Element_clone_114545898091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17671;

    public Element_clone_114545898091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17693 = new HashMap();
        Set<Object> term17754 =  ((Map) term17693).keySet();
        HashSet term17692 = new HashSet((Collection<? extends Object>) term17754);
        ArrayList term17715 = new ArrayList();
        ((ArrayList) term17715).add((Object)null);
        ((ArrayList) term17715).add((Object)null);
        ((ArrayList) term17715).add((Object)null);
        ((ArrayList) term17715).add((Object)null);
        ((ArrayList) term17715).add((Object)null);
        ((ArrayList) term17715).add((Object)null);
        ((ArrayList) term17715).add((Object)null);
        ((ArrayList) term17715).add((Object)null);
        ((ArrayList) term17715).add((Object)null);
        LinkedHashMap term17720 = new LinkedHashMap();
        term17671 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term17672 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17719 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17672, term17672.getClass(), "tagName", "Yrvtdcltri");
        setBooleanField(term17672, term17672.getClass(), "isBlock", true);
        setBooleanField(term17672, term17672.getClass(), "formatAsBlock", false);
        setBooleanField(term17672, term17672.getClass(), "canContainBlock", false);
        setBooleanField(term17672, term17672.getClass(), "canContainInline", false);
        setBooleanField(term17672, term17672.getClass(), "empty", true);
        setBooleanField(term17672, term17672.getClass(), "selfClosing", false);
        setBooleanField(term17672, term17672.getClass(), "preserveWhitespace", false);
        setField(term17671, term17671.getClass(), "tag", term17672);
        setField(term17671, term17671.getClass(), "classNames", term17692);
        setField(term17671, term17671.getClass(), "parentNode", null);
        setField(term17671, term17671.getClass(), "childNodes", term17715);
        setField(term17719, term17719.getClass(), "attributes", term17720);
        setField(term17671, term17671.getClass(), "attributes", term17719);
        setField(term17671, term17671.getClass(), "baseUri", "eKcEJRxNSu");
        setIntField(term17671, term17671.getClass(), "siblingIndex", 729658803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term17671, args);
    }

};


