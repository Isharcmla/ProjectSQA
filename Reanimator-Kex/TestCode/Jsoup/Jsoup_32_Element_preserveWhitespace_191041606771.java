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

public class Element_preserveWhitespace_191041606771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6984;

    public Element_preserveWhitespace_191041606771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7006 = new HashMap();
        Set<Object> term7067 =  ((Map) term7006).keySet();
        HashSet term7005 = new HashSet((Collection<? extends Object>) term7067);
        ArrayList term7028 = new ArrayList();
        ((ArrayList) term7028).add((Object)null);
        ((ArrayList) term7028).add((Object)null);
        ((ArrayList) term7028).add((Object)null);
        ((ArrayList) term7028).add((Object)null);
        ((ArrayList) term7028).add((Object)null);
        LinkedHashMap term7033 = new LinkedHashMap();
        term6984 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6985 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7032 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6985, term6985.getClass(), "tagName", "DNOtiLPAIY");
        setBooleanField(term6985, term6985.getClass(), "isBlock", true);
        setBooleanField(term6985, term6985.getClass(), "formatAsBlock", false);
        setBooleanField(term6985, term6985.getClass(), "canContainBlock", false);
        setBooleanField(term6985, term6985.getClass(), "canContainInline", false);
        setBooleanField(term6985, term6985.getClass(), "empty", true);
        setBooleanField(term6985, term6985.getClass(), "selfClosing", false);
        setBooleanField(term6985, term6985.getClass(), "preserveWhitespace", true);
        setField(term6984, term6984.getClass(), "tag", term6985);
        setField(term6984, term6984.getClass(), "classNames", term7005);
        setField(term6984, term6984.getClass(), "parentNode", null);
        setField(term6984, term6984.getClass(), "childNodes", term7028);
        setField(term7032, term7032.getClass(), "attributes", term7033);
        setField(term6984, term6984.getClass(), "attributes", term7032);
        setField(term6984, term6984.getClass(), "baseUri", "tvxYdqiyGc");
        setIntField(term6984, term6984.getClass(), "siblingIndex", 229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "preserveWhitespace", argTypes, term6984, args);
    }

};


